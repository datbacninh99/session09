package BT4;
public class Main {
    public static void main(String[] args) {
        System.out.println("HÌNH CHỮ NHẬT");
        Shape hinhChuNhat = new Rectangle("đỏ", 3.5, 5.5);
        hinhChuNhat.disPlay();
        hinhChuNhat.getArea();
        System.out.println("diện tích hình chữ nhật là: " + hinhChuNhat.getArea());

        System.out.println("=====================================================");

        System.out.println("HÌNH TRÒN");
        Shape hinhTron = new Circle("xanh", 5.7);
        hinhTron.disPlay();
        hinhChuNhat.getArea();
        System.out.println("Diện tích hình tròn là: " + hinhTron.getArea());
    }
}