public class Main {
    public static void main(String[] args) {
        Student std01 = new Student();
        Student std02 = new Student("Nguyen Quoc Viet", 18);

        System.out.println("ten cua std01 la: "+ std01.getFullname());
        System.out.println("ten cua std02 la: "+ std02.setFullname(true));

        std01.printStudenInfo();
        std02.printStudenInfo();

    }
}