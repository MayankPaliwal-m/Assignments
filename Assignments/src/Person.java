// Create class Person with name and age
//	Create two constructor, one which will accept only name and other which will accept name and age
//
//	Create method in person which will print summary of the person
//	*Imp, while printing summary, make sure if age is 0 then don’t print the age, print only name
//	if both age and name is present then print both
public class Person {

    String name;
    int age;

    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void summaryOfPerson(){
        if (age == 0) {
            System.out.println("His name is " + name);
        } else {
            System.out.println("His name is " + name + " and his age is " + age);
        }
    }

    public static void main(String[] args) {

        Person personObj1 = new Person("kaliya");

        Person personObj2 = new Person("elu", 25);


        personObj1.summaryOfPerson();
        personObj2.summaryOfPerson();

    }
}