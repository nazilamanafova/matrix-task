package lesson28;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Nazile", 19, 90.9, "third") );
        students.add(new Student("Leyla", 22, 80.5, "second") );
        students.add(new Student("Ali", 24, 100, "fourth") );

        Collections.sort(students);
        System.out.println(students);

        Collections.sort(students, new AgeComparator());
        System.out.println("For age: ");
        System.out.println(students);

        Collections.sort(students, new ScoreComparator());
        System.out.println("For score: ");
        System.out.println(students);

        Collections.sort(students, new CourseComparator());
        System.out.println("For course: ");
        System.out.println(students);
    }
}
