import java.time.LocalDate;
import java.util.Objects;

public class Patient extends User {
	
	
	private int patientId;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String email;
	private String gender;
	private LocalDate birthDate;
	
	public Patient(int patientId, String firstName, String lastName, 
			String phoneNum, String email, String gender, LocalDate birthDate) {
		super(firstName, lastName, phoneNum, email);
		setPatientId(patientId);
		setGender(gender);
		setBirthDate(birthDate);	
	}
	
	
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public int getPatientID() {
		return patientId;
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
	
	@Override
	public String toString() {
		return  super.toString() + "\nPatient ID: " + getPatientID()
						+ "\nGender: " + getGender() 
						+ "\nBirth Date: " + getBirthDate();
	}
	

}
