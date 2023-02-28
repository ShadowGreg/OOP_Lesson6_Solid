package viewsV01.commandsClass.vieCommands.updateNote;

import viewsV01.commandsClass.CommandsFactory;
import viewsV01.commandsClass.Performed;

public class UpdateNoteFactory implements CommandsFactory {
    @Override
    public Performed createCommand() {
        return new UpdateNote();
    }
}
