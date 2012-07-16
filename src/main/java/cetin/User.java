package cetin;

public class User {
	
	public User()
	{}
	
	private String name;
	private String lastname;
	
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "name " +getName()+"lastname"+getLastname();
	}

}
