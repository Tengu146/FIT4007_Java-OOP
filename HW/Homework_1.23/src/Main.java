import java.util.Scanner;

public class Main {
    public static int GreatestCommonDivison(int a, int b) {
//        while (b != 0) {
//            int temp = a % b;
//            a = b;
//            b = temp;
//        }
//        return a;
        while (b != a) {
            if ( b > a) {
                b = b - a ;
            }
            else {
                a = a - b;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int num1 = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int num2 = scanner.nextInt();
        if (num1 >=0 && num2 >= 0) {
            System.out.println("USCLN của " + num1 + " và " + num2 + " là: " + GreatestCommonDivison(num1, num2));
        }
        else {
            System.out.println("Số nhập không hợp lệ.");
        }

    }
}