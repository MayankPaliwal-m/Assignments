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

public class Rectangle implements Shape , Drawable {

    String shape;
    float length;
    float breadth;

    public Rectangle(String shape , float length , float breadth) {
        this.shape = shape;
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public void calculatePerimeter() {
        float perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of this rectangle is "+perimeter+ " cm");
    }

    @Override
    public void calculateArea() {
        float area = length * breadth;
        System.out.println("Area of rectangle is "+area+ " cm sq");
    }

    @Override
    public void draw() {
        System.out.println("RECTANGLE");
    }

    @Override
    public void getName() {
        System.out.println(shape);
    }
}

