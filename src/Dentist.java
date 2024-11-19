
public class Dentist extends HealthProfessional {
    private boolean specializesInOrthodontics; 

    public Dentist() {
        super();
    }

    public Dentist(int id, String name, String specialty, boolean specializesInOrthodontics) {
        super(id, name, specialty);
        this.specializesInOrthodontics = specializesInOrthodontics;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Type: Dentist, Specializes in Orthodontics: " + specializesInOrthodontics);
    }

    public boolean isSpecializesInOrthodontics() {
        return specializesInOrthodontics;
    }

    public void setSpecializesInOrthodontics(boolean specializesInOrthodontics) {
        this.specializesInOrthodontics = specializesInOrthodontics;
    }
}