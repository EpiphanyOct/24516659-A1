//Qingyang Jiao  24516659
public class AssignmentOne {
    public static void main(String[] args) {
        GeneralPractitioner gp = new GeneralPractitioner(1, "Dr. John", "General Medicine", true);

        Appointment appointment = new Appointment("John Doe", "1234567890", "10:00", gp);

        appointment.printAppointmentDetails();
    }
}