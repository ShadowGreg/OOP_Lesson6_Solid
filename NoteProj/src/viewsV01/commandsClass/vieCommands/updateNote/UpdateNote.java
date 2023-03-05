package viewsV01.commandsClass.vieCommands.updateNote;

import core.models.BaseNote;
import viewsV01.StandardOperations;
import viewsV01.View;
import viewsV01.commandsClass.Logging.Logging;
import viewsV01.commandsClass.Performed;

import java.io.IOException;
import java.util.List;

public class UpdateNote implements Performed, Logging {
    @Override
    public void execute() throws Exception {
        String inputHead = StandardOperations.prompt("Введите название заметки для изменения: ");
        handOverLog(String.format("Обновление заметки с названеим %s",inputHead));
        List<BaseNote> notes = View.noteController.getNote(inputHead);

        if (notes.size() > 1) {
            StandardOperations.operationWithSeveralNotes(notes);
        }
        updateText(notes);

        System.out.println("Запись отредактирована!");
    }
    private void updateText(List<BaseNote> notes) throws IOException {
        String inputText = StandardOperations.prompt("Введите новый текст заметки: ");

        View.noteController.deleteNote(notes.get(0));

        View.tempNote.setHead(notes.get(0).getHead());
        View.tempNote.setText(inputText);
        View.noteController.addNewNote(View.tempNote);

        View.tempNote.clearFields();
        handOverLog("Заметка получила новый текст");
    }
}
