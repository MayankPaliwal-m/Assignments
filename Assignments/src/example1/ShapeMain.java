package example1;
import example1.*;

import java.util.Scanner;

public class ShapeMain {
    public static void main(String[] args) {
        Shape shape = null;

        Scanner sc = new Scanner(System.in);

        System.out.println("give shape name ");
        String shapeType = sc.next();

        if (shapeType.equals("Triangle")) {
            shape = new Triangle("MyTriangle");
        } else if (shapeType.equals("square")) {
            shape = new Square("MySquare");
        } else {
            System.out.println("Not valid input!!");
        }
        if (shape != null) {

            shape.draw();

        }
    }

}
