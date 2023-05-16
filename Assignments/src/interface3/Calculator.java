// Assignment question :
//Create interface called Shape which has method getName
//Create interface Drawable which has method draw
//	Drawable should extend interface called Calculator
//Calculator has method calculatePerimeter and calculateArea method
//
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

public interface Calculator {
    void calculatePerimeter();
    void calculateArea();
}
