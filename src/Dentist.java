public class Dentist extends HealthProfessional {
    private boolean specializesInOrthodontics; 
    private boolean specializesInPeriodontology; 
    private boolean specializesInOralSurgery; 
    private boolean specializesInProsthodontics; 
    private boolean specializesInPediatricDentistry; 
    private boolean specializesInOralPathology; 
    private boolean specializesInPreventiveDentistry; 

    public Dentist() {
        super();
    }

    public Dentist(int id, String name, String[] specialties, 
                   boolean specializesInOrthodontics, boolean specializesInPeriodontology,
                   boolean specializesInOralSurgery, boolean specializesInProsthodontics,
                   boolean specializesInPediatricDentistry, boolean specializesInOralPathology,
                   boolean specializesInPreventiveDentistry) {
        super(id, name, specialties);
        this.specializesInOrthodontics = specializesInOrthodontics;
        this.specializesInPeriodontology = specializesInPeriodontology;
        this.specializesInOralSurgery = specializesInOralSurgery;
        this.specializesInProsthodontics = specializesInProsthodontics;
        this.specializesInPediatricDentistry = specializesInPediatricDentistry;
        this.specializesInOralPathology = specializesInOralPathology;
        this.specializesInPreventiveDentistry = specializesInPreventiveDentistry;
    }

    public boolean isSpecializesInOrthodontics() {
        return specializesInOrthodontics;
    }

    public void setSpecializesInOrthodontics(boolean specializesInOrthodontics) {
        this.specializesInOrthodontics = specializesInOrthodontics;
    }

    public boolean isSpecializesInPeriodontology() {
        return specializesInPeriodontology;
    }

    public void setSpecializesInPeriodontology(boolean specializesInPeriodontology) {
        this.specializesInPeriodontology = specializesInPeriodontology;
    }

    public boolean isSpecializesInOralSurgery() {
        return specializesInOralSurgery;
    }

    public void setSpecializesInOralSurgery(boolean specializesInOralSurgery) {
        this.specializesInOralSurgery = specializesInOralSurgery;
    }

    public boolean isSpecializesInProsthodontics() {
        return specializesInProsthodontics;
    }

    public void setSpecializesInProsthodontics(boolean specializesInProsthodontics) {
        this.specializesInProsthodontics = specializesInProsthodontics;
    }

    public boolean isSpecializesInPediatricDentistry() {
        return specializesInPediatricDentistry;
    }

    public void setSpecializesInPediatricDentistry(boolean specializesInPediatricDentistry) {
        this.specializesInPediatricDentistry = specializesInPediatricDentistry;
    }

    public boolean isSpecializesInOralPathology() {
        return specializesInOralPathology;
    }

    public void setSpecializesInOralPathology(boolean specializesInOralPathology) {
        this.specializesInOralPathology = specializesInOralPathology;
    }

    public boolean isSpecializesInPreventiveDentistry() {
        return specializesInPreventiveDentistry;
    }

    public void setSpecializesInPreventiveDentistry(boolean specializesInPreventiveDentistry) {
        this.specializesInPreventiveDentistry = specializesInPreventiveDentistry;
    }

    @Override
    public void printDetails() {
        super.printDetails(); // Call the printDetails method of the base class to print basic information.
        System.out.println("Specializes in Orthodontics: " + specializesInOrthodontics);
        System.out.println("Specializes in Periodontology: " + specializesInPeriodontology);
        System.out.println("Specializes in Oral Surgery: " + specializesInOralSurgery);
        System.out.println("Specializes in Prosthodontics: " + specializesInProsthodontics);
        System.out.println("Specializes in Pediatric Dentistry: " + specializesInPediatricDentistry);
        System.out.println("Specializes in Oral Pathology: " + specializesInOralPathology);
        System.out.println("Specializes in Preventive Dentistry: " + specializesInPreventiveDentistry);
    }
        public static void main(String[] args) {
            // Part 3 – Using classes and objects
            Dentist dentist1 = new Dentist(4, "Dr. Michael Brown", new String[]{"Dentistry"}, true, false, false, false, false, false, false);
            Dentist dentist2 = new Dentist(5, "Dr. Emily Davis", new String[]{"Dentistry"}, false, true, false, true, false, false, true);
    
            dentist1.printDetails();
            dentist2.printDetails();
    
            System.out.println("------------------------------");
        }
    
}