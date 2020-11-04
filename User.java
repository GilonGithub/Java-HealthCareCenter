import java.util.Objects;

public class User {
	
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String email;
	
	public User(String firstName, String lastName, String phoneNum, String email) {
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNum(phoneNum);
		setEmail(email);
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public String getEmail() {
		return email;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName.isEmpty() || Objects.isNull(firstName) ? "Unknown" : firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName.isEmpty() || Objects.isNull(lastName) ? "Unknown" : lastName;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum.isEmpty() || Objects.isNull(phoneNum) ? "Unknown" : phoneNum;
	}
	public void setEmail(String email) {
		this.email = email.isEmpty() || Objects.isNull(email) ? "Unknown" : email;
	}
	
	@Override
	public String toString() {
		return  "Name: " + getFirstName() + " " + getLastName()
						+ "\nEmail: " + getEmail()
						+ "\nPhone number: " + getPhoneNum();
	}

}

