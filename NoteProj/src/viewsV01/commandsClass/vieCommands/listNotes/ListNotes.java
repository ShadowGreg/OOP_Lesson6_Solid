package viewsV01.commandsClass.vieCommands.listNotes;

import core.models.BaseNote;
import viewsV01.View;
import viewsV01.commandsClass.Logging.Logging;
import viewsV01.commandsClass.Performed;

import java.io.IOException;

public class ListNotes  implements Performed, Logging {

    @Override
    public void execute() throws IOException {
        handOverLog("Распечатать лист");
        for (BaseNote note : View.noteController.getAllNotes()) {
            System.out.println(note);
        }
    }
}
