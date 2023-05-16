//Create object of circle and square and print call draw method and calculatePerimeter and Area method

package interface3;

public class ShapeMain {
    public static void main(String[] args) {

        Circle circle1 = new Circle("Circle" , 5.23f);
        Square square1 = new Square("Square" , 9.1f);
        Rectangle rect1 = new Rectangle("Rectangle" , 5.5f , 9.8f);

        circle1.draw();
        circle1.calculatePerimeter();
        circle1.calculateArea();
        circle1.getName();

        square1.draw();
        square1.calculatePerimeter();
        square1.calculateArea();

        rect1.draw();
        rect1.calculatePerimeter();
        rect1.calculateArea();

    }

}
