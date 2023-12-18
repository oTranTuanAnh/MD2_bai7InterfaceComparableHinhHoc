import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Shape shape = new Shape();
//        System.out.println(shape);
//
//        shape = new Shape("red", false);
//        System.out.println(shape);
//
//        //Test lop Circle
//
//        Circle circle = new Circle();
//        System.out.println(circle);
//
//        circle = new Circle(3.5);
//        System.out.println(circle);
//
//        circle = new Circle(3.5, "indigo", false);
//        System.out.println(circle);
//
//        //Test lop Rectangle
//        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.3, 5.8);
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.5, 3.8, "orange", true);
//        System.out.println(rectangle);
//
//        //Test lop square
//        Square square = new Square();
//        System.out.println(square);
//
//        square = new Square(2.3);
//        System.out.println(square);
//
//        square = new Square(5.8, "yellow", true);
//        System.out.println(square);
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "indigo", false);

        System.out.println("Chua sap xep:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("Sau khi sap xep:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        int i = circles[0].compareTo(circles[2]);
        System.out.println(i);

    }
}
