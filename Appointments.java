import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Objects;

public class Appointments {
	
	private Patient patient;
	private LocalDateTime appointmentDate;
	
	public Appointments(Patient patient, LocalDateTime appointmentDate) {
		setAppointmentDate(appointmentDate);
		setPatient(patient);	
	}
	
	
	public Patient getPatient() {
		return patient;
	}
	public LocalDateTime getAppointmentDate() {
		return appointmentDate;
	}
	
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	public void setAppointmentDate(LocalDateTime appointmentDate) {
		this.appointmentDate = Objects.nonNull(appointmentDate) ? appointmentDate : LocalDateTime.now();	
	}
	
	 
	@Override
	public String toString() {
		return String.format("\nAppointment date: %s",
						(appointmentDate.getMonth() + " " + appointmentDate.getDayOfMonth() + ", "
						+ appointmentDate.getYear() + " " + appointmentDate.getHour() 
						+ ":" + appointmentDate.getMinute()));
				
	}

}
