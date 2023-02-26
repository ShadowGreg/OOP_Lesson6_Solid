import Abstract.BaseUserWithReport;
import core.Persister;
import core.ThisUser;

public class Main {
	public static void main(String[] args){
		BaseUserWithReport user = new ThisUser("Bob");
		Controller controller = new Controller(user, new Persister(user));
		controller.clickButton();
	}
}