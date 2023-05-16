//Create class Circle, Rectangle, and Square which implement both Shape and Drawable interfaces
//Add required instance variables to Circle, Rectangle and Square class to calculate perimeter and area
//
//Create object of circle and square and print call draw method and calculatePerimeter and Area method
//
//hint : perimeter of circle is = 2 * 3.14 * radius
//	area of circle = 3.14 * radius * radius
//	peremeter of rectangle  = 2 * length + 2 * breadth
//	area of rectangle  = length * breadth
//	area of square = side * side
//	peremeter of square  = 4 * sides
//	area of square = side * side

package interface3;

public class Square implements Shape , Drawable {

    String shape;
    float side;

    public Square(String shape , float side) {
        this.shape = shape;
        this.side = side;
    }
    @Override
    public void calculatePerimeter() {
        float perimeter = 4 * side;
        System.out.println("Perimeter of this square is "+perimeter+" cm");
    }

    @Override
    public void calculateArea() {
        float area = side * side;
        System.out.println("Area of square is "+area+" cm sq");
    }

    @Override
    public void draw() {
        System.out.println("SQUARE");
    }

    @Override
    public void getName() {
        System.out.println(shape);
    }
}
