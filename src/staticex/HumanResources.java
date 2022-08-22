package staticex;

public class HumanResources extends Employee{
    private int experience;
    static String department= "Human Resources Management";

    public HumanResources(int experience) {
        this.experience = experience;
    }

    public HumanResources(String id, String name, int age, String position, int experience) {
        super(id, name, age, position);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public static String getDepartment() {
        return department;
    }

    public static void setDepartment(String department) {
        HumanResources.department = department;
    }

    @Override
    public String toString() {
        return "HumanResources{" +
                super.toString()+
                "experience=" + experience +
                " Department "+ getDepartment()+
                '}';
    }
}
