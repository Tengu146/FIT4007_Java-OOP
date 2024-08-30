import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước của ma trận
        System.out.print("Nhập kích thước của ma trận vuông n: ");
        int n = scanner.nextInt();

        // Khởi tạo ma trận
        int[][] matrix = new int[n][n];

        // Nhập giá trị cho các phần tử của ma trận
        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Tính tổng các phần tử trên đường chéo chính
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
        }

        // In ra kết quả
        System.out.println("Tổng các phần tử trên đường chéo chính là: " + sum);
    }
}