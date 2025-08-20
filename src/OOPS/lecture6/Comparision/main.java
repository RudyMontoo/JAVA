package OOPS.lecture6.Comparision;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Student kunal = new Student(12, 98.3f);
        Student rudra = new Student(10, 99.3f);
        Student atul= new Student(11, 90.3f);
        Student anant = new Student(13, 94.3f);
        Student utkrisht = new Student(14, 92.3f);

        Student[] list={kunal,rudra,atul,anant,utkrisht};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));



        // Compare by score
        if (kunal.compareTo(rudra) < 0) {
            System.out.println("Rudra has more marks");
        } else if (kunal.compareTo(rudra) > 0) {
            System.out.println("Kunal has more marks");
        } else {
            System.out.println("Both have equal marks");
        }
    }
}