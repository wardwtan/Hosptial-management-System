package Entity;

public class Patient {
	private String name;
	private String email;
	private String type;
	public String getName() {
		return name;
	}
	public Patient(String name, String email, String type) {
		super();
		this.name = name;
		this.email = email;
		this.type = type;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
