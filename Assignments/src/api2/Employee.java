/*
 Write a class employee with field firstName, lastName, age, address, salary, department.
Implement hashcode, equals and toString (dont use intellij inbuild functinality)
create two employee object and compare them with equals and hashcode
*/

package api2;

import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private int salary;
    private String department;

    public Employee(String firstName , String lastName , int age ,
                    String address , int salary , String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Employee employee = (Employee) obj;
        boolean isFirstNameSame = this.firstName.equals(employee.firstName);
        boolean isLastNameSame = this.lastName.equals(employee.lastName);
        boolean isAgeSame = this.age == employee.age;
        boolean isAddressSame = this.address.equals(employee.address);
        boolean isSalarySame = this.salary == employee.salary;
        boolean isDepartmentSame = this.department.equals(employee.department);

        return isFirstNameSame && isLastNameSame && isAgeSame
                && isAddressSame && isSalarySame && isDepartmentSame;
    }

    @Override
    public int hashCode() {
        int hashCodeValue = (11+firstName.hashCode()) + (21*lastName.hashCode()) +
                age + (37*address.hashCode()) + salary + (3-department.hashCode());
        return 1871+hashCodeValue;
    }
}
