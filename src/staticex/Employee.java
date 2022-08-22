package staticex;

public class Employee {
    private String id;
    private String Name;
    private int age;
    private String position;

    public Employee() {
    }

    public Employee(String id, String name, int age, String position) {
        this.id = id;
        Name = name;
        this.age = age;
        this.position = position;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                ", Name='" + Name + '\'' +
                ", age=" + age +
                ", position='" + position
                ;
    }
}
