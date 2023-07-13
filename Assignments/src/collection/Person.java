//Todays assignment, Create class person, with name and age,
// create 10 objects of person with some random name and age,
// create list of person, add all person objects to list,
// create another list, loop over the original list and add only those person
// objects whose name stars with S and print both original and filtered list

package collection;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name , int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
//    @Override
//    public boolean equals(Object obj) {
//        Person person = (Person) obj;
//        boolean isAgeSame = this.age == person.age;
//        boolean isNameSame = this.name.equals(person.name);
//        return isNameSame && isAgeSame;
//    }
}
