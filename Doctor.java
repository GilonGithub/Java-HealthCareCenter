import java.util.ArrayList;
import java.util.Objects;

public class Doctor {
	
	private int doctorId;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String email;
	private String specialization;
	private ArrayList<Appointments> appointments;
	
	public Doctor(int doctorId, String firstName, String lastName, String phoneNum, String email, String specialization) {
		setDoctorId(doctorId);
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNum(phoneNum);
		setSpecialization(specialization);
		setEmail(email);
		this.appointments = new ArrayList<Appointments>();
		
	}
	
	public int getDoctorId() {
		return doctorId;
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
	public String getSpecialization() {
		return specialization;
	}
	public ArrayList<Appointments> getListOfAppointments () {
		return appointments;
	}
	
	
	public void addAppointment(Appointments appointment) {
		appointments.add(appointment);
	}
	
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId < 100000 && doctorId > 1000 ? doctorId : 1000 + (int)Math.random(); 
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
	public void setSpecialization(String specialization) {
		this.specialization = specialization.isEmpty() || Objects.isNull(specialization) ? "Unknown" : specialization;
	}
	
	@Override
	public String toString() {
		String output = String.format("Doctor ID: %s" + 
							"\nDoctor's name: %s" 
							+ "\nphone number %s"
							+ "\nemail: %s"
							+ "\nspecialization: %s\n", 
							doctorId, (firstName + " " + lastName), phoneNum, email, specialization);
		output += "\nLIST OF APPOINTMENTS:\n";
		for(Appointments a : appointments) {
			output += a + "\n";
		}
		
		return output;
				
	}
	
	
}
