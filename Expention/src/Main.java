import java.util.Scanner;

class TuoiKhongHopLeException extends Exception {
    public TuoiKhongHopLeException(String message) {
        super(message);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap tuoi: ");
        int age = sc.nextInt();
        try{
            if (age < 18) {
                throw new TuoiKhongHopLeException("tuoi phai lon hon ho");
            }
        }
        catch (TuoiKhongHopLeException e){
            System.out.println(e.getMessage());
        }
    }
}
