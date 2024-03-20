package exercise.array.list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList students = new ArrayList();
        students.addAll(Arrays.asList("Amy", "Bob", "Cindy", "David"));
        students.add(0,"Nick");
        students.add(1,"Mike");
        students.remove(3);
        System.out.println("Students are: "+ students.toString());
        System.out.println("There are " + students.size() + " students");

    }
}
