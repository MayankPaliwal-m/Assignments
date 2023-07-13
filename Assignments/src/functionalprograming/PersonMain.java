//Createa stream of person list, get output of person names with all capital letter and filter those names
//which starts with A and B only

package functionalprograming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person("Naveen", 30);
        Person p2 = new Person("aaaa", 40);
        Person p3 = new Person("ssss", 20);
        Person p4 = new Person("zzzz", 60);
        Person p5 = new Person("Birla",50);

        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);

//        for (Person p : personList){
//            System.out.print(p.name);
//            System.out.print(", ");
//        }
//
//        String output = personList.stream().map(Person::getName).collect(Collectors.joining(","));
//        System.out.println(output);

        List<String> personNames = personList.stream()
                                    .map(person -> person.getName().toUpperCase())
                                    .filter(name -> name.startsWith("A") || name.startsWith("a") || name.startsWith("B") || name.startsWith("b"))
                                    .collect(Collectors.toList());

        System.out.println(personNames);

    }
}
