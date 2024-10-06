
public class Main {
    public static void main(String[] args) {
        // Tạo 1 đối tượng Baby với tên là "Minh" và là bé trai
        Baby baby1 = new Baby("Minh", true);
        // Tạo 1 đối tượng Baby với tên là "Hoa" và là bé gái
        Baby baby2 = new Baby("Hoa", false);
        // In ra thông tin các bé
        System.out.println("Tên bé 1: "+ baby1.name + " , giới tính: "+ (baby1.idMale ? "Nam" : "Nữ"));
        System.out.println("Tên bé 2: "+ baby2.name + " , giới tính: "+ (baby1.idMale ? "Nam" : "Nữ"));
        }

}