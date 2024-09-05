public class Main {
    public static void main(String[] args) {
        // Khai báo hai chuỗi
        String chuoi1 = "Dai hoc";
        String chuoi2 = "Dai Nam";

        // Nối hai chuỗi lại với nhau
        String chuoiKetQua = chuoi1 + chuoi2;

        // Chuyển đổi chuỗi kết quả thành chữ in hoa
        chuoiKetQua = chuoiKetQua.toUpperCase();

        // Hiển thị kết quả ra màn hình
        System.out.println("Chuỗi kết quả: " + chuoiKetQua);
        System.out.println("Độ dài của chuỗi: " + chuoiKetQua.length());
    }
}