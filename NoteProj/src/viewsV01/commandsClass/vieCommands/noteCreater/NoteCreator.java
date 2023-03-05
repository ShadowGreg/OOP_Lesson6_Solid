package viewsV01.commandsClass.vieCommands.noteCreater;

import core.models.BaseNote;
import viewsV01.StandardOperations;
import viewsV01.View;
import viewsV01.commandsClass.Logging.Logging;
import viewsV01.commandsClass.Performed;

import java.io.IOException;

public class NoteCreator implements Performed, Logging {
    @Override
    public void execute() throws IOException {
        View.noteController.saveNote(inputNote());
    }
    private BaseNote inputNote() throws IOException {
        String newHead = StandardOperations.prompt("Назавание: ");
        handOverLog(String.format("Создание записи под названием %s", newHead));
        String newText = StandardOperations.prompt("Текст: ");
        BaseNote temp = View.tempNote.clearFields();
        temp.setHead(newHead);
        temp.setText(newText);
        return temp;
    }
}
