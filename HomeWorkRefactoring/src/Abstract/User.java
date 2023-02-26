package Abstract;

public abstract class User {
	private String name;
	
	public User(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}

	@Override
	public String toString() {
		return String.format("Report for user: " + name);
	}
}