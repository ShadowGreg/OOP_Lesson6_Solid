package viewsV01.commandsClass.vieCommands.listNotes;

import core.models.BaseNote;
import viewsV01.View;
import viewsV01.commandsClass.Performed;

public class ListNotes  implements Performed {

    @Override
    public void execute() {
        for (BaseNote note : View.noteController.getAllNotes()) {
            System.out.println(note);
        }
    }
}
