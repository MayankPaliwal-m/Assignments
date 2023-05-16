package multiinherit;
 // An abstract class in Java is a class that cannot be instantiated, meaning you cannot create objects of an
 //abstract class directly.
public class PersonMain {
    public static void main(String[] args){
        //Abstract5 obj = new Abstract5();
        Person p1 = new Person("Tillu" , 5000000.50f);
        Employee p2 = new Person("Gogo" , 5.25f);
       //Employee pa = new Employee();
        Salaried p3 = new Person("Raju" , 200000.25f);
        Person p4 = (Person) p2;
        p4.getSalary();
        p4.getName();



        System.out.println("Your name is : "+p1.getName()+" and salary is : "+p1.getSalary());
        System.out.println("Your name is : "+p2.getName() +" and salary is : "+p3.getSalary() );
        System.out.println("Your name is : "+p2.getName()+" and salary is : "+p3.getSalary());
        System.out.println(p2);

    }
}
