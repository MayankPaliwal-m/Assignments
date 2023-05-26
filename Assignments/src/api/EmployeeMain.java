package api;

public class EmployeeMain {
    public static void main(String[] args) {

        Employee emp = new Employee("Kallu" , 23);
        Employee emp1 = new Employee("Tillu" , 23);

        System.out.println("emp = emp2 : "+emp1.equals(emp));

        System.out.println(emp1);
        System.out.println(emp);
        System.out.println(emp1.returnMeThis());
    }
}
