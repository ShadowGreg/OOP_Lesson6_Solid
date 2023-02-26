package core;

import Abstract.BaseUserWithReport;

public class ThisUser extends BaseUserWithReport {
	public ThisUser(String name) {
		super(name);
	}

	public String report(){
		return super.toString();
	}

}