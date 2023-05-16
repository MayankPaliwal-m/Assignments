package abstract1;

import java.util.Scanner;

public class PetMain {

    public static void main(String[] args) {

        int x = yourPet();

        while (x==1) {
            x = yourPet() ;
        }

    }

    public static int yourPet() {

        Pet pet = null ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which animal you have as a pet ?");
        String petName = scanner.next() ;

        if(petName.equals("Cat")) {
            pet = new Cat("Tom") ;
        } else if (petName.equals("Dog")) {
            pet = new Dog("Courage") ;
        } else {
            System.out.println("kuch bhi !!!");
        }

        if (pet != null) {
            pet.action();
        }

        int i ;
        System.out.println("Enter 1 to continue and 0 to finish");
        i = scanner.nextInt() ;

        return i ;
    }


}
