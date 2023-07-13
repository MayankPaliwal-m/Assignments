package practiceCollectiom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ColourMain {
    public static void main(String[] args) {
        ArrayList<Colour> listOfColours = new ArrayList<>();
        Colour yellow = new Colour("Yellow");
        Colour red = new Colour("Red");
        Colour blue = new Colour("Blue");
       // Colour white = new Colour("White");
        Colour orange = new Colour("Orange");

        listOfColours.add(yellow);
        listOfColours.add(red);
        listOfColours.add(blue);
        listOfColours.add(new Colour("White"));
        listOfColours.add(orange);

        System.out.println(listOfColours);

        System.out.println("---------------------------------");

        /*Iterator i = listOfColours.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }*/
        System.out.println("---------------------------------");

        for (Colour c : listOfColours) {
            System.out.println(c.colour);
        }
        System.out.println("---------------------------------");

        Colour gray = new Colour("Gray");

        listOfColours.add(0 , gray);

        for (Colour c : listOfColours) {
            System.out.println(c.colour);
        }
        System.out.println("---------------------------------");

        System.out.println(listOfColours.get(0));
        System.out.println("---------------------------------");

        for (int i=0 ; i<listOfColours.size() ; i++ ) {
          Colour colour = listOfColours.get(i);
          String s = colour.colour;
            System.out.println(s);
        }
        System.out.println("---------------------------------");

        Colour black = new Colour("Black");
        listOfColours.set(2,black);
        for (Colour c : listOfColours) {
            System.out.println(c.colour);
        }

        System.out.println("---------------------------------");

        listOfColours.set(2,new Colour("Magenta"));
        for (Colour c : listOfColours) {
            System.out.println(c.colour);
        }

        System.out.println("---------------------------------");

       // listOfColours.remove(2);
        //for (Colour c : listOfColours) {
         //   System.out.println(c.colour);
      //  }
        System.out.println("---------------------------------");

        boolean elementPresent = listOfColours.contains(new Colour("Magenta"));
        System.out.println(elementPresent);
        elementPresent = listOfColours.contains("White");
        System.out.println(elementPresent);
        elementPresent = listOfColours.contains(new Colour("White"));
        System.out.println(elementPresent);

        for (Colour c : listOfColours) {
            System.out.println(c.colour);
        }

    }
}