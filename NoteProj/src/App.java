import controllers.Controller;
import core.models.Note;
import viewsV01.View;

public class App {
    public static void main(String[] args) throws Exception {
        View view = new View<>(new Controller(), new Note());
        view.run();
    }
}