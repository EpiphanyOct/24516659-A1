
public class Dietitian extends HealthProfessional {
    private String areaOfExpertise; 

    
    public Dietitian() {
        super();
    }

    public Dietitian(int id, String name, String specialty, String areaOfExpertise) {
        super(id, name, specialty);
        this.areaOfExpertise = areaOfExpertise;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Type: Dietitian, Area of Expertise: " + areaOfExpertise);
    }

    public String getAreaOfExpertise() {
        return areaOfExpertise;
    }

    public void setAreaOfExpertise(String areaOfExpertise) {
        this.areaOfExpertise = areaOfExpertise;
    }
}