import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //khai bao bien va thu vien
        double width, height;
        Rectangle rectangle;
        Scanner sc = new Scanner(System.in);
        //1. Input
        System.out.println("Enter the width of the rectangle: ");
        width = sc.nextDouble();
        System.out.println("Enter the height of the rectangle: ");
        height = sc.nextDouble();
        //2. Process
        rectangle = new Rectangle(width,height);
        //3.output
        System.out.println(rectangle);
    }
}