package staticex;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {
    public static void main(String[] args) {
        List<Employee> list= new ArrayList<>();
        list.add(new HumanResources("1", "hieu", 30, "Manager", 10));
        list.add(new HumanResources("4", "Huy", 25, "emp", 5));

        list.add(new SalesEmployee("5", "Trung", 30, "Director",6));
        list.add(new SalesEmployee("9","Duc", 34, "Sales", 8));

        for (Employee str: list
             ) {
            System.out.println(str);
        }
    }
}
