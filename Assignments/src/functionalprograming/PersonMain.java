//Createa stream of person list, get output of person names with all capital letter and filter those names
//which starts with A and B only

package functionalprograming;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person("Naveen", 30);
        Person p2 = new Person("Aaaa", 4);
        Person p3 = new Person("Ssss", 20);
        Person p4 = new Person("M", 60);
        Person p5 = new Person("Binod",50);
        Person p6 = new Person("Appp", 25);
        Person p7 = new Person("Arjun" , 23);
        Person p8 = new Person("Anil" , 30);

        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);
        personList.add(p6);
        personList.add(p7);
        personList.add(p8);

//        for (Person p : personList){
//            System.out.print(p.name);
//            System.out.print(", ");
//        }
//
//        String output = personList.stream().map(Person::getName).collect(Collectors.joining(","));
//        System.out.println(output);

//        List<String> personNames = personList.stream()
//                                    .map(person -> person.getName().toUpperCase())
//                                    .filter(name -> name.startsWith("A") || name.startsWith("a") || name.startsWith("B") || name.startsWith("b"))
//                                    .collect(Collectors.toList());
//
//        System.out.println(personNames);

//        List<String> sortedDistinctList = personList.stream()
//                .map(person -> person.getName())
//                .sorted((name, names) -> name.compareTo(names))
//                .distinct()
//                .collect(Collectors.toList());
//
//        System.out.println(sortedDistinctList);

//        Optional<Person> firstElement = personList.stream()
//                .filter(person -> person.getAge()==2)
//                .findFirst();
//        System.out.println(firstElement);
//
//        Optional<Person> anyElement = personList.stream()
//                .filter(person -> person.getAge()==2)
//                .findAny();
//        System.out.println(anyElement);
//
//        boolean isAntElementPresent = personList.stream()
//                .filter(person -> person.getName().startsWith("A"))
//                .anyMatch(person -> person.getAge()==2);
//        System.out.println(isAntElementPresent);
//
//        boolean isAntElementMatchingAll = personList.stream()
//                .filter(person -> person.getName().startsWith("A"))
//                .allMatch(person -> person.getAge()==2);
//        System.out.println(isAntElementMatchingAll);


        //personList.stream().map(Person::getName).collect(Collectors.joining(","));

          //Create list of person,
        //filter the list based on name which starts with A
        //filter the list based on age > 18
        //map to name of the person
        //add prefix “Mr. “ to each name
        //print the list of name

          List<String> adultPersonNames = personList.stream()
                  .filter(person -> person.getName().startsWith("A"))
                  .filter(persen -> persen.getAge()>18)
                  .map(person -> person.getName())
                  .map(name -> "Mr. " + name)//.concat("Mr. "))
                  .collect(Collectors.toList());

        System.out.println(adultPersonNames);






    }
}
