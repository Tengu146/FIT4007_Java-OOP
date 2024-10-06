import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    List<Student> student = new ArrayList<>();
    //input 2 student info and add to list
        Scanner scanner = new Scanner(System.in);
        for (int i = 0;i <2 ; i++){
            System.out.println("Enter student id: ");
            int id = scanner.nextInt();
            System.out.println("Enter student name: ");
            String name = scanner.next();
            Student std = new Student(name, id);
            student.add(std);
        }





    }
}