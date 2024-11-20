import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppointmentManager {
    private List<Appointment> appointments;

    public AppointmentManager() {
        appointments = new ArrayList<>();
    }

    // Create a new appointment 
    public void createAppointment(String patientName, String patientMobile, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        Appointment appointment = new Appointment(patientName, patientMobile, preferredTimeSlot, selectedDoctor);
        appointments.add(appointment);
        System.out.println("Appointment created for " + patientName + " at " + preferredTimeSlot);
    }

    // Print an existing appointment   
    public void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            System.out.println("Existing Appointments:");
            for (Appointment appointment : appointments) {
                appointment.printDetails();
                System.out.println("------------------------------");
            }
        }
    }

    // Cancel the appointment using the patient's mobile phone. 
    public void cancelBooking(String patientMobile) {
        boolean found = false;
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getPatientMobile().equals(patientMobile)) {
                appointments.remove(i);
                found = true;
                System.out.println("Appointment canceled for mobile number: " + patientMobile);
                break;
            }
        }
        if (!found) {
            System.out.println("No appointment found for mobile number: " + patientMobile);
        }
    }

    public static void main(String[] args) {
        AppointmentManager manager = new AppointmentManager();
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        // Part 3 – Using classes and objects
        System.out.println("Part 3 – Using classes and objects");
        System.out.println("------------------------------");
        // Code demonstrating part 3
        System.out.println("Please enter details for the General Practitioners and Dentist:");
        System.out.println("Enter the name of the General Practitioner:");
        String gpName = scanner.nextLine();
        System.out.println("Enter the ID of the General Practitioner:");
        int gpId = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Enter the specialties of the General Practitioner (comma separated):");
        String gpSpecialties = scanner.nextLine();
        String[] specialtiesArray = gpSpecialties.split(",");
        GeneralPractitioner gp = new GeneralPractitioner(gpId, gpName, specialtiesArray, true);
        gp.printDetails();
        System.out.println("------------------------------");

        System.out.println("Enter the name of the Dentist:");
        String dentistName = scanner.nextLine();
        System.out.println("Enter the ID of the Dentist:");
        int dentistId = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Enter the specialties of the Dentist (comma separated):");
        String dentistSpecialties = scanner.nextLine();
        String[] specialtiesArrayDentist = dentistSpecialties.split(",");
        Dentist dentist = new Dentist(dentistId, dentistName, specialtiesArrayDentist, true, false, false, false, false, false, false);
        dentist.printDetails();
        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        System.out.println("Part 5 – Collection of appointments");
        System.out.println("------------------------------");
        // Code demonstrating part 5
        System.out.println("Scheduling appointments:");
        System.out.println("Enter the name, mobile number, and preferred time slot for the first General Practitioner appointment:");
        String patientName1 = scanner.nextLine();
        String patientMobile1 = scanner.nextLine();
        String preferredTimeSlot1 = scanner.nextLine();
        manager.createAppointment(patientName1, patientMobile1, preferredTimeSlot1, gp);

        System.out.println("Enter the name, mobile number, and preferred time slot for the second General Practitioner appointment:");
        String patientName2 = scanner.nextLine();
        String patientMobile2 = scanner.nextLine();
        String preferredTimeSlot2 = scanner.nextLine();
        manager.createAppointment(patientName2, patientMobile2, preferredTimeSlot2, gp);

        System.out.println("Enter the name, mobile number, and preferred time slot for the first Dentist appointment:");
        String patientName3 = scanner.nextLine();
        String patientMobile3 = scanner.nextLine();
        String preferredTimeSlot3 = scanner.nextLine();
        manager.createAppointment(patientName3, patientMobile3, preferredTimeSlot3, dentist);

        System.out.println("Enter the name, mobile number, and preferred time slot for the second Dentist appointment:");
        String patientName4 = scanner.nextLine();
        String patientMobile4 = scanner.nextLine();
        String preferredTimeSlot4 = scanner.nextLine();
        manager.createAppointment(patientName4, patientMobile4, preferredTimeSlot4, dentist);

        System.out.println("Printing existing appointments:");
        manager.printExistingAppointments();

        System.out.println("Enter the mobile number of the patient to cancel the appointment:");
        String cancelMobile = scanner.nextLine();
        manager.cancelBooking(cancelMobile);

        System.out.println("Printing updated appointments:");
        manager.printExistingAppointments();
    }
}