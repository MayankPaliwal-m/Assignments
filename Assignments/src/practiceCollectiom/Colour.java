// Write a Java program to create an array list, add some colors (strings) and
  //      print out the collection

package practiceCollectiom;

import java.util.Objects;

public class Colour {
    String colour;

    public Colour(String colour) {
        this.colour=colour;
    }

    @Override
    public String toString() {
        return "Colour{" +
                "colour='" + colour + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Colour colour1 = (Colour) o;

        return Objects.equals(colour, colour1.colour);
    }

    @Override
    public int hashCode() {
        return colour != null ? colour.hashCode() : 0;
    }
}