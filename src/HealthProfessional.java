public class HealthProfessional {
    private int id;
    private String name;
    private String[] specialties; // 使用数组存储专业领域

    // 默认构造函数
    public HealthProfessional() {
    }

    // 参数化构造函数
    public HealthProfessional(int id, String name, String[] specialties) {
        setId(id);
        setName(name);
        this.specialties = specialties;
    }

    // ID的安全检查
    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("Invalid ID. ID must be a positive number.");
        }
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name. Name cannot be null or empty.");
        }
    }

    public String getName() {
        return name;
    }

    public void setSpecialties(String[] specialties) {
        this.specialties = specialties;
    }

    public String[] getSpecialties() {
        return specialties;
    }

    // 打印所有实例变量
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.print("Specialties: ");
        for (String specialty : specialties) {
            System.out.print(specialty + " ");
        }
        System.out.println();
    }
}

