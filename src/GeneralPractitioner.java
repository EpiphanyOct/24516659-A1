
public class GeneralPractitioner extends HealthProfessional {
    private boolean hasNarcoticsLicense;

    public GeneralPractitioner() {
        super();
    }

    public GeneralPractitioner(int id, String name, String specialty, boolean hasNarcoticsLicense) {
        super(id, name, specialty);
        this.hasNarcoticsLicense = hasNarcoticsLicense;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Type: General Practitioner, Has Narcotics License: " + hasNarcoticsLicense);
    }

    public boolean isHasNarcoticsLicense() {
        return hasNarcoticsLicense;
    }

    public void setHasNarcoticsLicense(boolean hasNarcoticsLicense) {
        this.hasNarcoticsLicense = hasNarcoticsLicense;
    }
}