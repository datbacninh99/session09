package BT1;

import java.util.Scanner;
public class Circle implements Resizable{
    private double radius;
    public Circle() {
    }
    public Circle(int radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    @Override
    public void resize(double percent) {
        System.out.println("Bán kính hình tròn trước khi thay đổi: " + this.getRadius());
        System.out.println("Bán kính hình tròn sau khi thay đổi: " +  (this.getRadius() + this.getRadius() * (percent / 100)));
    }
}