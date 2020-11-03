import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	
	public static Scanner input = new Scanner(System.in);
	public static String userChoice;
	
	public static void showOptions() {
		
		do { 
			System.out.println("Enter p for a patient or d for a doctor: ");
			userChoice = input.next();
			
			
		} while (!userChoice.equalsIgnoreCase("p") && !userChoice.equalsIgnoreCase("d"));
			
	}
	
	public static void patientOrDoctorPortal (ArrayList<Doctor> doctors, 
			ArrayList<Patient> patients,
			ArrayList<Appointments> appointments) {
		switch (userChoice) {
		case "p": patientPortal(patients, appointments);
			break;
		case "d": doctorPortal(doctors);
			break;
		}
	}
	
	public static void doctorPortal(ArrayList<Doctor> doctors) {
		int userChoice;
		boolean isFound;
		do {
			System.out.println("Enter your ID: ");
			userChoice = input.nextInt();
			isFound = searchForDoctor(userChoice, doctors);
		} while (!isFound);
		
		for (Doctor d : doctors) {
			if (d.getDoctorId() == userChoice) {
				System.out.println(d);
			}
		}
		
	}
	
	public static boolean searchForDoctor(int doctorId, ArrayList<Doctor> doctors) {
		boolean isFound = false;
		for (Doctor d : doctors) {
			if (d.getDoctorId() == doctorId) {
				isFound = true;
			}
		}
				return isFound;
		
	}
	
	public static boolean searchForPatient(int patientId, ArrayList<Patient> patients) {
		boolean isFound = false;
		for (Patient p : patients) {
			if (p.getPatientID() == patientId) {
				isFound = true;
			}
		}
				return isFound;	
	}
	
	public static void patientPortal(ArrayList<Patient> patients, ArrayList<Appointments> appointments) {
		int userChoice;
		boolean isFound;
		do {
			System.out.println("Enter your ID: ");
			userChoice = input.nextInt();
			isFound = searchForPatient(userChoice, patients);
		} while (!isFound);
		
		for (Patient p : patients) {
			if (p.getPatientID() == userChoice) {
				System.out.println("Patient ID: " + p.getPatientID() +
						"\nPatient name: " + p.getFirstName() + " " + p.getLastName());
				setAppoitment(p, appointments);
			}
		}
		
	}
	
	public static void setAppoitment(Patient patient, ArrayList<Appointments> appointments) {
		System.out.println("Enter the date in format yyyy-mm-dd hh:mm");
		String userDate = input.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"); 
		LocalDateTime dateTime = LocalDateTime.parse(userDate, formatter);
		
		System.out.println(dateTime);
		//appointments.add(new Appointments(patient, dateTime));
		//System.out.println(appointments.get(0).toString());
	}

	public static void main(String[] args) {
		
		Patient p1 = new Patient(84783, "John", "Smith", "847 978 0877", "john@gmail.com", "male", LocalDate.of(1974, 9, 18));
		Patient p2 = new Patient(8476, "Jim", "Smith", "847 978 0877", "john@gmail.com", "male", LocalDate.of(1974, 9, 18));
		Patient p3 = new Patient(32678, "Patrick", "Smith", "847 978 0877", "john@gmail.com", "male", LocalDate.of(1974, 9, 18));
		Patient p4 = new Patient(425, "Len", "Smith", "847 978 0877", "john@gmail.com", "male", LocalDate.of(1974, 9, 18));
		Patient p5 = new Patient(57543, "Monica", "Smith", "847 978 0877", "john@gmail.com", "male", LocalDate.of(1974, 9, 18));
		Patient p6 = new Patient(8655, "Carol", "Smith", "847 978 0877", "john@gmail.com", "male", LocalDate.of(1974, 9, 18));
		Patient p7 = new Patient(8540, "Gil", "Smith", "847 978 0877", "john@gmail.com", "male", LocalDate.of(1974, 9, 18));
		Patient p8 = new Patient(18739008, "Peter", "Smith", "847 978 0877", "john@gmail.com", "male", LocalDate.of(1974, 9, 18));
		Patient p9 = new Patient(7898, "", "Smith", "847 978 0877", "john@gmail.com", "male", LocalDate.of(1974, 9, 18));
		Patient p10 = new Patient(654, "Lucy", "Smith", "847 978 0877", "john@gmail.com", "male", LocalDate.of(1974, 9, 18));
		//System.out.println(p1);
		
		ArrayList<Patient> patients = new ArrayList<>();
		patients.add(p1);
		patients.add(p2);
		patients.add(p3);
		patients.add(p4);
		patients.add(p5);
		patients.add(p6);
		patients.add(p7);
		patients.add(p8);
		patients.add(p9);
		patients.add(p10);
		
		
		Appointments apt1 = new Appointments(p1, LocalDateTime.of(2020, 11, 20, 10, 15));
		Appointments apt2 = new Appointments(p1, LocalDateTime.of(2020, 12, 20, 13, 15));
		System.out.println(apt1);
		
		ArrayList<Appointments> appointments = new ArrayList<>();
		appointments.add(apt1);
		appointments.add(apt2);
		
		
		Doctor d1 = new Doctor(7480, "Jack", "Novy", "797 384 8364", "jackN@gmail.com", "gynecologist");
		Doctor d2 = new Doctor(965, "Jim", "Novy", "797 384 8364", "jackN@gmail.com", "gynecologist");
		Doctor d3 = new Doctor(07544, "Peter", "Novy", "797 384 8364", "jackN@gmail.com", "gynecologist");
		Doctor d4 = new Doctor(076, "Patricia", "Novy", "797 384 8364", "jackN@gmail.com", "gynecologist");
		
		ArrayList<Doctor> doctors = new ArrayList<>();
		doctors.add(d1);
		doctors.add(d2);
		doctors.add(d3);
		doctors.add(d4);
		
		
		d1.addAppointment(apt1);
		d1.addAppointment(apt2);
		System.out.println(d1);
		
		
		
		showOptions();
		patientOrDoctorPortal(doctors, patients, appointments);
		
}
}
