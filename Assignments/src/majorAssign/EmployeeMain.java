package majorAssign;


import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        System.out.println("Enter Details of Manager2");
        Employee manager2 = new Employee(null);
        System.out.println("Enter Details of Manager1");
        Employee manager1 = new Employee(manager2);
        System.out.println("Enter Details of Employee1");
        Employee employee1 = new Employee(manager1);

        EmployeeDirectory eList = new EmployeeDirectory();

        eList.registerEmployee(1 , employee1);
        eList.registerEmployee(2 , manager1);
        eList.registerEmployee(3 , manager2);

        eList.getEmployee(1);
        eList.getAllEmployees();
        eList.removeEmployee(1);
        eList.getAllEmployees();


        //EmployeeDirectory employee2 = new EmployeeDirectory();
        //EmployeeDirectory employee3 = new EmployeeDirectory();
        //EmployeeDirectory employee4 = new EmployeeDirectory();


        //System.out.println("Enter Details of Employee2");
        //employee2.userInterface(manager1);

        //System.out.println("Enter Details of Employee3");
       // employee3.userInterface(manager1);
       // System.out.println("Enter Details of Employee4");
        //employee4.userInterface(manager1);


        //EmployeeDirectory.registerEmployee(employee1);
        //employee2.registerEmployee(employee2);
        //employee3.registerEmployee(employee3);
        //employee4.registerEmployee(employee4);


       // manager1.registerEmployee(manager1);
        //manager2.registerEmployee(manager2);
    }

//    public Employee userInterface(Employee manager) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Creat ID");
//        int id = scanner.nextInt();
//        System.out.println("Enter name");
//        String name = scanner.next();
//        System.out.println("e-mail");
//        String mail = scanner.next();
//        System.out.println("phone no.");
//        int no = scanner.nextInt();
//        System.out.println("Address - building name");
//        String building = scanner.next();
//        System.out.println("streat");
//        String streat = scanner.next();
//        System.out.println("city");
//        String city = scanner.next();
//        System.out.println("pin code");
//        int pin = scanner.nextInt();
//        System.out.println("state");
//        String state = scanner.next();
//        Address address = new Address(building , streat , city , state , pin);
//        Employee employee = new Employee(id , name , mail , no , address , manager);
//        return employee;
//    }

}
