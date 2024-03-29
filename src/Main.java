import ra.abstraction.Colorable;
import ra.abstraction.Person;
import ra.abstraction.PersonComparator;
import ra.abstraction.Triangle;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Colorable colorable = new Colorable(); // Không hể tạo 1 instance(đói tượng / trường hợp)
        Colorable.print(); // Chỉ thuộc về interface
        Colorable tamGiac = new Triangle();
        tamGiac.makeColor();
        // Serializable // Không có thanh phần, chú thích cho các tính năng khác
//        Remote
//        Comparable

        Person person[] = new Person[]{
                new Person("Nam",19, true , 45.5),
                new Person("Khánh",18, true , 45.6),
                new Person("Anh",21, true , 45.4),
                new Person("Thuy",20, false , 45.55)
        };

        System.out.println("Mảng trước sắp xếp");
        System.out.println(Arrays.toString(person));
        // Sắp xếp
        Arrays.sort(person);
        System.out.println("Mảng sau sắp xếp");
        System.out.println(Arrays.toString(person));
        // Comparator
        // Sắp xếp theo tuổi
        PersonComparator personComparator = new PersonComparator();
        Arrays.sort(person,personComparator);
        System.out.println("Mảng sau sắp xếp");
        System.out.println(Arrays.toString(person));

        // Lớp nặc danh
        Comparator<Person> comparatorSex = (o1, o2) -> {
            if (Boolean.compare(o2.isSex(),o1.isSex())==0){
                return o2.getName().compareTo(o1.getName());
            }else {
                return Boolean.compare(o2.isSex(),o1.isSex());
            }
        };
        Arrays.sort(person,comparatorSex);
        System.out.println("mảng sau sắp xếp");
        System.out.println(Arrays.toString(person));

        // Phân loại theo nam, nữ (tên giảm dần)
        Arrays.sort(person,(o1,o2)->o1.getName().compareTo(o2.getName()));
    }
}