package viewsV01.commandsClass.vieCommands.listNotes;

import viewsV01.commandsClass.CommandsFactory;
import viewsV01.commandsClass.Performed;

public class ListNotesFactory implements CommandsFactory {
    @Override
    public Performed createCommand() {
        return new ListNotes();
    }
}
