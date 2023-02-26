package core;

import Abstract.User;

public class Persister{
	private final User user;
	
	public Persister(User user){
		this.user = user;
	}
	
	public String save(){
		return String.format("Save user: " + user.getName());
	}
}