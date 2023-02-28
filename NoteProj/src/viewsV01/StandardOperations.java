package viewsV01;

import core.models.BaseNote;

import java.util.List;
import java.util.Scanner;

public class StandardOperations {

   public static String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    public static  void operationWithSeveralNotes(List<BaseNote> notes) throws Exception {
        System.out.println("Найдены заметки: \n");
        System.out.println(notes);
        String inputID = prompt("Введите Id заметки для уточнения поиска: ");
        BaseNote note = View.noteController.findByID(notes, inputID);
        View.noteController.deleteNote(note);
    }
}
