import controllers.Controller;
import core.models.Note;
import viewsV00.ViewNoteBook;
import viewsV01.View;

public class App {
    public static void main(String[] args) throws Exception {
//        ViewNoteBook view = new ViewNoteBook<>(new Controller(), new Note());
        View view = new View<>(new Controller(), new Note());
        view.run();
    }
}