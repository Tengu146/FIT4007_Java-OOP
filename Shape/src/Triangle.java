public class Triangle implements Shape {
    private double sideA; // Cạnh thứ nhất của tam giác
    private double sideB; // Cạnh thứ hai của tam giác
    private double sideC; // Cạnh thứ ba của tam giác

    // Constructor
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    // Triển khai phương thức tính diện tích (sử dụng công thức Heron)
    @Override
    public double calculateArea() {
        double s = (sideA + sideB + sideC) / 2; // Nửa chu vi
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    // Triển khai phương thức tính chu vi
    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}
