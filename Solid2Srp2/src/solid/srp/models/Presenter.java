package solid.srp.models;

public class Presenter {
    private View view;
    private Save save;

    public Presenter(View view, Save save){
        this.view = view;
        this.save = save;
    }

    public void start(){
        view.createOrder();
        Order order = view.createOrder();
        save.saveToJson(order);
    }
}
