package viewsV01.commandsClass.vieCommands.help;


import viewsV01.commandsClass.Performed;

public class Help implements Performed {

    @Override
    public void execute() {
        System.out.println(
                "READ - прочитать заметку \n" +
                        "CREATE - создать заметку \n" +
                        "UPDATE - обновить текст заметки \n" +
                        "LIST - вывести все заметки в карткой версии \n" +
                        "DELETE - удалить заметку \n" +
                        "HELP - посмотреть помощ \n" +
                        "EXIT - выход \n"
        );
    }
}
