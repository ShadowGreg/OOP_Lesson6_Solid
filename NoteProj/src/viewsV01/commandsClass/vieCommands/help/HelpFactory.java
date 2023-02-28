package viewsV01.commandsClass.vieCommands.help;

import viewsV01.commandsClass.CommandsFactory;
import viewsV01.commandsClass.Performed;

public class HelpFactory implements CommandsFactory {
    @Override
    public Performed createCommand() {
        return new Help();
    }
}
