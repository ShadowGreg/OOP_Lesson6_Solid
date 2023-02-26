import Abstract.BaseUserWithReport;
import core.Persister;

public class Controller<T extends BaseUserWithReport> {
    private final T user;
    private final Persister persister;


    public Controller(T user, Persister persister) {
        this.user = user;
        this.persister = persister;
    }

    public void clickButton(){
        System.out.println(user.report());
        System.out.println(persister.save());
    }
}
