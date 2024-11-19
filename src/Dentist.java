public class Dentist extends HealthProfessional {
    private boolean isOrthodontist;

    public Dentist() {
        super();
    }

    public Dentist(int id, String name, String specialty, boolean isOrthodontist) {
        super(id, name, specialty);
        this.isOrthodontist = isOrthodontist;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Type: Dentist, Specializes in Orthodontics: " + isOrthodontist);
    }

    public boolean isOrthodontist() {
        return isOrthodontist;
    }

    public void setOrthodontist(boolean isOrthodontist) {
        this.isOrthodontist = isOrthodontist;
    }
}