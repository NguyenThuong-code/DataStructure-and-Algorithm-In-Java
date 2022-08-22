package simplelist;

import java.util.LinkedList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger=new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);
        System.out.println("Element4: " + listInteger.get(4));
        System.out.println("Element1: " + listInteger.get(1));
        System.out.println("Element2: " + listInteger.get(2));


    }
}
