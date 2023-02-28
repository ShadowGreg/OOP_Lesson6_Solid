package viewsV01.commandsClass.vieCommands.deleteNotes;

import core.models.BaseNote;
import viewsV01.StandardOperations;
import viewsV01.View;
import viewsV01.commandsClass.Performed;

import java.util.List;

public class DeleteNotes implements Performed {
    @Override
    public void execute() throws Exception {
        String inputHead = StandardOperations.prompt("Введите название заметки для удаления: ");
        List<BaseNote> tempNotes = View.noteController.getNote(inputHead);
        StandardOperations.operationWithSeveralNotes(tempNotes);
        System.out.println(View.noteController.deleteNote(tempNotes.get(0)));
    }
}
