package viewsV01.commandsClass.vieCommands.readNote;

import viewsV01.commandsClass.CommandsFactory;
import viewsV01.commandsClass.Performed;

public class ReadNoteFactory implements CommandsFactory {
    @Override
    public Performed createCommand() {
        return new ReadNote();
    }
}
