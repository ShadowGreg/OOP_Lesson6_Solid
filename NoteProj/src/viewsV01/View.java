package viewsV01;

import controllers.Controller;
import core.models.BaseNote;
import viewsV01.commandsClass.Performed;

public class View<T1 extends Controller> {
    public static Controller noteController;
    public static BaseNote tempNote;

    public View(T1 noteController, BaseNote tempNote) {
        viewsV01.View.noteController = noteController;
        viewsV01.View.tempNote = tempNote;
    }


    public void run() throws Exception {
        String command = "";
        while (!command.equals("EXIT")) {
            try {
                command = StandardOperations.prompt("Введите команду (для спраки введите help): ");
                System.out.println();
                Performed commandsFactory = CommandSwitch.createCommandsByName(command.toUpperCase());
                commandsFactory.execute();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }


}
