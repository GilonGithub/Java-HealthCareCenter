import java.time.LocalDate;
import java.util.Objects;

public class Patient {
	
	private int patientId;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String email;
	private String gender;
	private LocalDate birthDate;
	
	public Patient(int patientId, String firstName, String lastName, 
			String phoneNum, String email, String gender, LocalDate birthDate) {
		setPatientId(patientId);
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNum(phoneNum);
		setEmail(email);
		setGender(gender);
		setBirthDate(birthDate);	
	}
	
	
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public int getPatientID() {
		return patientId;
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
	public String getGender() {
		return gender;
	}
	
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = Objects.nonNull(birthDate) ? birthDate : LocalDate.of(2020, 1, 1);
	}
	public void setGender(String gender) {
		this.gender = gender.isEmpty() || Objects.isNull(gender) ? "Unknown" : gender;
	}
	
	public void setPatientId(int patientId) {
		this.patientId = patientId < 100000 && patientId > 1000 ? patientId : 1000 + (int)Math.random(); 
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
		return  "Patient name: " + getFirstName() + " " + getLastName()
						+ "\nPatient ID: " + getPatientID()
						+ "\nEmail: " + getEmail()
						+ "\nPhone number: " + getPhoneNum()
						+ "\nGender: " + getGender() 
						+ "\nBirth Date: " + getBirthDate();
	}
	

}
