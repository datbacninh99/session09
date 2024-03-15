package BT1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("==========CIRCLE==========");
        Circle circle = new Circle(30);
        System.out.println("Nhập phần trăm thay đổi: ");
        circle.resize(sc.nextDouble());

        System.out.println("==========RECTANGLE==========");
        Rectangle rectangle = new Rectangle(10,15);
        System.out.println("Nhập phần trăm thay đổi: ");
        rectangle.resize(sc.nextDouble());

        System.out.println("==========SQUARE==========");
        Square square = new Square(10);
        System.out.println("Nhập phần trăm thay đổi: ");
        square.resize(sc.nextDouble());
    }
}