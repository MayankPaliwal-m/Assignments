package monlec;

import java.util.Objects;

public class Employee {
    String employeeId;
    String employeeName;

    public Employee(String employeeId , String employeeName){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (!Objects.equals(employeeId, employee.employeeId)) return false;
        return Objects.equals(employeeName, employee.employeeName);
    }

    @Override
    public int hashCode() {
        int result = employeeId != null ? employeeId.hashCode() : 0;
        result = 31 * result + (employeeName != null ? employeeName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                '}';
    }
}


