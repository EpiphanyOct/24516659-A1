public class GeneralPractitioner extends HealthProfessional {
    private boolean isNarcoticsLicensed;

    public GeneralPractitioner() {
        super();
    }

    public GeneralPractitioner(int id, String name, String specialty, boolean isNarcoticsLicensed) {
        super(id, name, specialty);
        this.isNarcoticsLicensed = isNarcoticsLicensed;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Type: General Practitioner, Has Narcotics License: " + isNarcoticsLicensed);
    }

    public boolean isNarcoticsLicensed() {
        return isNarcoticsLicensed;
    }

    public void setNarcoticsLicensed(boolean isNarcoticsLicensed) {
        this.isNarcoticsLicensed = isNarcoticsLicensed;
    }
}