public class Rectangle implements Shape {
    private double length; // Chiều dài của hình chữ nhật
    private double width;  // Chiều rộng của hình chữ nhật

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Triển khai phương thức tính diện tích
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Triển khai phương thức tính chu vi
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
