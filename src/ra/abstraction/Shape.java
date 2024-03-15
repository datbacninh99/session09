package ra.abstraction;
public abstract class Shape { // Lớp từu tượng
    // Thuộc tính
    private int side;
    private String color;
    private boolean isFill;
    // Constructors
    public Shape() {
    }
    public Shape(int side, String color, boolean isFill) {
        this.side = side;
        this.color = color;
        this.isFill = isFill;
    }
    // Getter Setter
    public int getSide() {
        return side;
    }
    public void setSide(int side) {
        this.side = side;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFill() {
        return isFill;
    }
    public void setFill(boolean fill) {
        isFill = fill;
    }

    // các phuong thức khác
    public void displayInfo(){
        System.out.println("side = "+side+" | color = "+color +" | isFill = "+isFill);
    }

    // Các phương thức trừu tượng
    public abstract double getArea(); // Tính diện tích
    public abstract double getPerimeter(); // Tính chu vi
}