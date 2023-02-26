package solid;

import solid.srp.models.Order;
import solid.srp.models.Presenter;
import solid.srp.models.Save;
import solid.srp.models.View;

public class Main {
    Presenter presenter;
    public static void main(String[] args) {
        Presenter presenter = new Presenter(new View(),new Save());
        presenter.start();
    }
}
