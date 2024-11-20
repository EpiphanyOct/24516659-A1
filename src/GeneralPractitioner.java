public class GeneralPractitioner extends HealthProfessional {
    private boolean hasDentalLicense; 
    public GeneralPractitioner() {
        super();
    }

    public GeneralPractitioner(int id, String name, String[] specialties, boolean hasDentalLicense) {
        super(id, name, specialties); 
        this.hasDentalLicense = hasDentalLicense; 
    }

    public boolean isHasDentalLicense() {
        return hasDentalLicense;
    }

    public void setHasDentalLicense(boolean hasDentalLicense) {
        this.hasDentalLicense = hasDentalLicense;
    }

    @Override
    public void printDetails() {
        super.printDetails(); // Call the printDetails method of the base class to print basic information.
        System.out.println("Has Dental License: " + hasDentalLicense);
    }
        public static void main(String[] args) {
            // Part 3 – Using classes and objects
            GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. John Doe", new String[]{"General Medicine"}, true);
            GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Jane Smith", new String[]{"Family Practice"}, false);
            GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Alice Johnson", new String[]{"Internal Medicine"}, true);

            gp1.printDetails();
            gp2.printDetails();
            gp3.printDetails();
    
            System.out.println("------------------------------");
        }
    
    
}