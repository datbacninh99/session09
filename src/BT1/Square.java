package BT1;
public class Square implements Resizable{
    private double side;
    public Square() {
    }
    public Square(double side) {
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public void resize(double percent) {
        System.out.println("Cạnh hình vuông trước khi thay đổi: "+ this.getSide());
        System.out.println("Cạnh hình vuông sau khi thay đổi: "+  (this.getSide()+this.getSide()*(percent/100)));

    }
}