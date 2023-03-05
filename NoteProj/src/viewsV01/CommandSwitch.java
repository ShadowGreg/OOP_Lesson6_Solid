package viewsV01;

import viewsV01.commandsClass.Performed;
import viewsV01.commandsClass.vieCommands.deleteNotes.DeleteNotes;
import viewsV01.commandsClass.vieCommands.help.Help;
import viewsV01.commandsClass.vieCommands.listNotes.ListNotes;
import viewsV01.commandsClass.vieCommands.noteCreater.NoteCreator;
import viewsV01.commandsClass.vieCommands.readNote.ReadNote;
import viewsV01.commandsClass.vieCommands.updateNote.UpdateNote;

public class CommandSwitch {

    static Performed createCommandsByName(String com) throws Exception {
        switch (com) {
            case "HELP":
                return new Help();
            case "LIST":
                return new ListNotes();
            case "CREATE":
                return new NoteCreator();
            case "READ":
                return new ReadNote();
            case "UPDATE":
                return new UpdateNote();
            case "DELETE":
                return new DeleteNotes();
        }
        throw new Exception("Нет такой команды (наберите HELP).");
    }
}
