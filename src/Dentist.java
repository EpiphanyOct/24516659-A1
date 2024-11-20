public class Dentist extends HealthProfessional {
    private boolean specializesInOrthodontics; // 是否专门从事正畸学
    private boolean specializesInPeriodontology; // 是否专门从事牙周病学
    private boolean specializesInOralSurgery; // 是否专门从事口腔颌面外科
    private boolean specializesInProsthodontics; // 是否专门从事口腔修复学
    private boolean specializesInPediatricDentistry; // 是否专门从事儿童牙科
    private boolean specializesInOralPathology; // 是否专门从事口腔病理学
    private boolean specializesInPreventiveDentistry; // 是否专门从事预防牙科

    // 默认构造函数
    public Dentist() {
        super();
    }

    // 参数化构造函数
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

    // Getter 和 Setter 方法
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

    // 覆盖基类的printDetails方法以展示多态
    @Override
    public void printDetails() {
        super.printDetails(); // 调用基类的printDetails方法打印基本信息
        System.out.println("Specializes in Orthodontics: " + specializesInOrthodontics);
        System.out.println("Specializes in Periodontology: " + specializesInPeriodontology);
        System.out.println("Specializes in Oral Surgery: " + specializesInOralSurgery);
        System.out.println("Specializes in Prosthodontics: " + specializesInProsthodontics);
        System.out.println("Specializes in Pediatric Dentistry: " + specializesInPediatricDentistry);
        System.out.println("Specializes in Oral Pathology: " + specializesInOralPathology);
        System.out.println("Specializes in Preventive Dentistry: " + specializesInPreventiveDentistry);
    }
        // 添加 main 方法
        public static void main(String[] args) {
            // Part 3 – Using classes and objects
            Dentist dentist1 = new Dentist(4, "Dr. Michael Brown", new String[]{"Dentistry"}, true, false, false, false, false, false, false);
            Dentist dentist2 = new Dentist(5, "Dr. Emily Davis", new String[]{"Dentistry"}, false, true, false, true, false, false, true);
    
            dentist1.printDetails();
            dentist2.printDetails();
    
            // 添加分隔线
            System.out.println("------------------------------");
        }
    
}