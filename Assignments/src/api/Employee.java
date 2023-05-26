package api;

public class Employee {
    private String name;
    private int age;

    public Employee(String name , int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Employee employee = (Employee) obj;
        boolean isAgeSame = this.age == employee.age;
        boolean isNameSame = this.name.equals(employee.name);
        return isNameSame && isAgeSame;
    }

    public Employee returnMeThis() {

        return this;
    }

}
