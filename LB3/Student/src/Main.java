import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(1, "Viet", 8.5f, 9.0f);
        Student student2 = new Student(2, "Trung", 0.0f, 0.5f);
        Student student3 = new Student();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ID  : ");
        student3.setId(scanner.nextInt());

        scanner.nextLine();
        System.out.print("Enter name of student: ");
        student3.setFullName(scanner.nextLine());

        System.out.print("Enter the theory score: ");
        student3.setTheoryScore(scanner.nextFloat());

        System.out.print("Enter the practice score : ");
        student3.setPracticeScore(scanner.nextFloat());


        System.out.println("Student List:");
        System.out.printf("%-10s %-30s %5s %5s %5s\n", "ID", "Full Name", "Theory", "Practice", "Average");
        System.out.println("-------------------------------------------------------------");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}