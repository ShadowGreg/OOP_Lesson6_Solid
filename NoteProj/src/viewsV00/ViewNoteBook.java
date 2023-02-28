package viewsV00;

import controllers.Controller;
import core.models.BaseNote;

import java.util.List;
import java.util.Scanner;

public class ViewNoteBook<T1 extends Controller, T2 extends BaseNote> {
    private final T1 noteController;
    private BaseNote tempNote;

    public ViewNoteBook(T1 noteController, T2 noteClass) {
        this.noteController = noteController;
        this.tempNote = noteClass;
    }

    public void run() {
        Commands com;
        while (true) {
            String command = prompt("Введите команду (для спраки введите help): ");
            System.out.println();
            try {
                com = Commands.valueOf(command.toUpperCase());

                if (com == Commands.EXIT) return;
                switch (com) {
                    case CREATE:
                        createNote();
                        break;
                    case READ:
                        readNote();
                        break;
                    case LIST:
                        printNotes();
                        break;
                    case UPDATE:
                        updateNote();
                        break;
                    case DELETE:
                        deleteNote();
                        break;
                    case HELP:
                        help();
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void help() {
        System.out.println(
                String.format(
                        "READ - прочитать заметку \n" +
                                "CREATE - создать заметку \n" +
                                "UPDATE - обновить текст заметки \n" +
                                "LIST - вывести все заметки в карткой версии \n" +
                                "DELETE - удалить заметку \n" +
                                "HELP - посмотреть помощ \n" +
                                "EXIT - выход \n"
                )
        );
    }

    private void updateNote() throws Exception {
        String inputHead = prompt("Введите название заметки для изменения: ");
        List<BaseNote> notes = noteController.getNote(inputHead);

        if (notes.size() > 1) {
            operationWithSeveralNotes(notes);
        }
        updateText(notes);

        System.out.println("Запись отредактирована!");
    }

    private void updateText(List<BaseNote> notes) {
        String inputText = prompt("Введите новый текст заметки: ");

        noteController.deleteNote(notes.get(0));

        tempNote.setHead(notes.get(0).getHead());
        tempNote.setText(inputText);
        noteController.addNewNote(tempNote);

        tempNote.clearFields();
    }

    private void operationWithSeveralNotes(List<BaseNote> notes) throws Exception {
        System.out.println("Найдены заметки: \n");
        System.out.println(notes);
        String inputID = prompt("Введите Id заметки для уточнения поиска: ");
        BaseNote note = noteController.findByID(notes, inputID);
        noteController.deleteNote(note);
    }

    private void deleteNote() throws Exception {
        String inputHead = prompt("Введите название заметки для удаления: ");
        List<BaseNote> tempNotes = noteController.getNote(inputHead);
        operationWithSeveralNotes(tempNotes);
        System.out.println(noteController.deleteNote(tempNotes.get(0)));
    }

    private void readNote() throws Exception {
        String inputHead = prompt("Введите название заметки для поиска: ");
        List<BaseNote> tempNotes = noteController.getNote(inputHead);
        operationWithSeveralNotes(tempNotes);
        System.out.println(tempNotes.get(0));
    }

    private void createNote() {
        noteController.saveNote(inputNote());
    }

    private BaseNote inputNote() {
        String newHead = prompt("Назавание: ");
        String newText = prompt("Текст: ");
        BaseNote temp = tempNote.clearFields();
        temp.setHead(newHead);
        temp.setText(newText);
        return temp;
    }

    private void printNotes() {
        for (BaseNote note : noteController.getAllNotes()) {
            System.out.println(note);
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
