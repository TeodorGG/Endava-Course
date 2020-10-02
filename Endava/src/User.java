
//firstname
//lastname
//age
//email
//status (ACTIVE, INACTIVE, BLOCKED, NEW)
//timestamp (when user was registered in the system)
public class User {
	
	String firstName;
	String lastName;
	int age;
	String email;
	String status;
	String timestamp;
	
	public User() {}
	
	public User(String firstName, String lastName, int age, String email, String status, String timestamp) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
		this.status = status;
		this.timestamp = timestamp;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", email=" + email
				+ ", status=" + status + ", timestamp=" + timestamp + "]";
	}
	
	
	
	
	
	

	
}
