
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

 // multiinherit package me doubt hai;

package interface3;

public class Circle implements Shape , Drawable {

    String shape;
    float radius;
    double pi = 3.14;

    public Circle(String shape , float radius) {
        this.shape = shape;
        this.radius = radius;
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * pi * radius;
        System.out.println("Perimeter of this circle is "+perimeter+" cm");
    }

    @Override
    public void calculateArea() {
        double area = pi * radius * radius;
        System.out.println("Area of circle is "+area+" cm sq");
    }

    @Override
    public void draw() {
        System.out.println("CIRCLE");
    }

    @Override
    public void getName() {
        System.out.println(shape);
    }
}
