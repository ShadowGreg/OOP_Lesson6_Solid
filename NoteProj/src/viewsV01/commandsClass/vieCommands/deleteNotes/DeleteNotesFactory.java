package viewsV01.commandsClass.vieCommands.deleteNotes;

import viewsV01.commandsClass.CommandsFactory;
import viewsV01.commandsClass.Performed;

public class DeleteNotesFactory  implements CommandsFactory {
    @Override
    public Performed createCommand() {
        return new DeleteNotes();
    }
}
