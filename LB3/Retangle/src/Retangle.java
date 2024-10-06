public class Retangle {
    private double width;
    private double height;
    public Retangle() {
        this.width = 0;
        this.height = 0;
    }
    public Retangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return this.width * this.height;
    }
    public double getPerimeter() {
        return 2*(this.width + this.height);
    }
    public String toString() {
        return "Width: " + this.width + ", Height: " + this.height;
    }
}
