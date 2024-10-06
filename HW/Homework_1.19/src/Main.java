import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhập 1 chuỗi tùy ý: ");
        String text = sc.nextLine();
        int cout = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a') {
                cout += 1;
            }
        }
        System.out.println("số lần chữ 'a' xuất hiện là: "+ cout);
    }
}