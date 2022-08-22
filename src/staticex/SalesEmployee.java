package staticex;

public class SalesEmployee extends Employee{
    private int quantity;
    static String department= "Sales Product Management";

    public SalesEmployee() {
    }

    public SalesEmployee(int quantity) {
        this.quantity = quantity;
    }

    public SalesEmployee(String id, String name, int age, String position, int quantity) {
        super(id, name, age, position);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static String getDepartment() {
        return department;
    }

    public static void setDepartment(String department) {
        SalesEmployee.department = department;
    }

    @Override
    public String toString() {
        return "SalesEmployee{" +
                super.toString()+
                "quantity=" + quantity +
                " Department "+ getDepartment()+
                '}';
    }
}
