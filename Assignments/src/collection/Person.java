//Todays assignment, Create class person, with name and age,
// create 10 objects of person with some random name and age,
// create list of person, add all person objects to list,
// create another list, loop over the original list and add only those person
// objects whose name stars with S and print both original and filtered list

package collection;

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
}
