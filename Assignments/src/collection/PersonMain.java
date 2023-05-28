package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonMain {
    public static void main(String[] args) {

        ArrayList<Person> arrayList = new ArrayList<>();
        ArrayList<Person> filteredArrayList = new ArrayList<>();

        for(int i =0; i<10;i++){

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter person's name");
            String name = sc.next();
            System.out.println("Enter person's age ");
            int age = sc.nextInt();

            Person person = new Person(name,age);

            arrayList.add(person);

        }

        for( Person person : arrayList){

            if(person.getName().startsWith("S")){
                filteredArrayList.add(person);
            }
        }

        System.out.println(arrayList);
        System.out.println(filteredArrayList);


    }

}
