package viewsV01;

import controllers.Controller;
import core.models.BaseNote;
import viewsV01.commandsClass.Performed;
import viewsV01.commandsClass.vieCommands.deleteNotes.DeleteNotes;
import viewsV01.commandsClass.vieCommands.help.Help;
import viewsV01.commandsClass.vieCommands.listNotes.ListNotes;
import viewsV01.commandsClass.vieCommands.noteCreater.NoteCreator;
import viewsV01.commandsClass.vieCommands.readNote.ReadNote;
import viewsV01.commandsClass.vieCommands.updateNote.UpdateNote;

public class View<T1 extends Controller> {
    public static Controller noteController;
    public static BaseNote tempNote;

    public View(T1 noteController, BaseNote tempNote) {
        View.noteController = noteController;
        View.tempNote = tempNote;
    }


    public void run() throws Exception {
        String command = "";
        while (!command.equals("EXIT")) {
            try {
                command = StandardOperations.prompt("Введите команду (для спраки введите help): ");
                System.out.println();
                Performed commandsFactory = createCommandsByName(command.toUpperCase());
                commandsFactory.execute();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

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
