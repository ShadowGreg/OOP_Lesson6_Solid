package viewsV01.commandsClass.vieCommands.noteCreater;

import viewsV01.commandsClass.CommandsFactory;
import viewsV01.commandsClass.Performed;

public class NoteCreatorFactory implements CommandsFactory {
    @Override
    public Performed createCommand() {
        return new NoteCreator();
    }
}
