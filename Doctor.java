import java.util.ArrayList;
import java.util.Objects;

public class Doctor extends User {
	
	private int doctorId;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String email;
	private String specialization;
	private ArrayList<Appointments> appointments;
	
	public Doctor(int doctorId, String firstName, String lastName, String phoneNum, String email, String specialization) {
		super(firstName, lastName, phoneNum, email);
		setDoctorId(doctorId);
		setSpecialization(specialization);
		this.appointments = new ArrayList<Appointments>();
		
	}
	
	public int getDoctorId() {
		return doctorId;
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
	
	public void setSpecialization(String specialization) {
		this.specialization = specialization.isEmpty() || Objects.isNull(specialization) ? "Unknown" : specialization;
	}
	
	@Override
	public String toString() {
		String output = super.toString();
		output += String.format("\nDoctor ID: %s "
							+ "\nspecialization: %s\n", 
							doctorId, specialization);
		output += "\nLIST OF APPOINTMENTS:\n";
		for(Appointments a : appointments) {
			output += a + "\n";
		}
		
		return output;
				
	}
	
	
}
