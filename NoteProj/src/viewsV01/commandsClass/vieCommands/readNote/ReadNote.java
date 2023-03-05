package viewsV01.commandsClass.vieCommands.readNote;

import core.models.BaseNote;
import viewsV01.StandardOperations;
import viewsV01.View;
import viewsV01.commandsClass.Logging.Logging;
import viewsV01.commandsClass.Performed;

import java.util.List;

public class ReadNote implements Performed, Logging {
    @Override
    public void execute() throws Exception {
        String inputHead = StandardOperations.prompt("Введите название заметки для поиска: ");
        handOverLog(String.format("Чтение записи под названем %s", inputHead));
        List<BaseNote> tempNotes = View.noteController.getNote(inputHead);
        StandardOperations.operationWithSeveralNotes(tempNotes);
        System.out.println(tempNotes.get(0));
    }
}
