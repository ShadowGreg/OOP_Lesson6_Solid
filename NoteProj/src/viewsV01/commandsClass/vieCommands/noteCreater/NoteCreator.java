package viewsV01.commandsClass.vieCommands.noteCreater;

import core.models.BaseNote;
import viewsV01.StandardOperations;
import viewsV01.View;
import viewsV01.commandsClass.Performed;

public class NoteCreator implements Performed {
    @Override
    public void execute() {
        View.noteController.saveNote(inputNote());
    }
    private BaseNote inputNote() {
        String newHead = StandardOperations.prompt("Назавание: ");
        String newText = StandardOperations.prompt("Текст: ");
        BaseNote temp = View.tempNote.clearFields();
        temp.setHead(newHead);
        temp.setText(newText);
        return temp;
    }
}
