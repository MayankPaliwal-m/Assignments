package multiinherit;

// Person is a Employee
// Person is a Salaried
public class Person implements Employee , Salaried {
    String name;
    float salary;

    public Person(String name , float salary) {
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String getName() {

        return this.name;
    }

    @Override
    public float getSalary() {
        return this.salary;
    }

    @Override
    public void commonMethod() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
