import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên dương: ");
        int n = scanner.nextInt();
        System.out.print("Các ước của " + n + " là: ");
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print(n);
    }
}
