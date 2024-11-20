public class GeneralPractitioner extends HealthProfessional {
    private boolean hasDentalLicense; // 表示是否拥有牙医执照

    // 默认构造函数
    public GeneralPractitioner() {
        super();
    }

    // 参数化构造函数
    public GeneralPractitioner(int id, String name, String[] specialties, boolean hasDentalLicense) {
        super(id, name, specialties); // 调用基类的构造函数
        this.hasDentalLicense = hasDentalLicense; // 初始化是否拥有牙医执照
    }

    // 获取是否拥有牙医执照
    public boolean isHasDentalLicense() {
        return hasDentalLicense;
    }

    // 设置是否拥有牙医执照
    public void setHasDentalLicense(boolean hasDentalLicense) {
        this.hasDentalLicense = hasDentalLicense;
    }

    // 覆盖基类的printDetails方法以展示多态
    @Override
    public void printDetails() {
        super.printDetails(); // 调用基类的printDetails方法打印基本信息
        System.out.println("Has Dental License: " + hasDentalLicense); // 打印是否有牙医执照的信息
    }
        // 添加 main 方法
        public static void main(String[] args) {
            // Part 3 – Using classes and objects
            // 创建三个 General Practitioner 对象
            GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. John Doe", new String[]{"General Medicine"}, true);
            GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Jane Smith", new String[]{"Family Practice"}, false);
            GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Alice Johnson", new String[]{"Internal Medicine"}, true);
    
            // 打印所有 General Practitioner 的详细信息
            gp1.printDetails();
            gp2.printDetails();
            gp3.printDetails();
    
            // 添加分隔线
            System.out.println("------------------------------");
        }
    
    
}