// Create class employee with belwo fields
//	-id
//	-name
//	-email
//	-phoneNumber
//	-address
//	-manager (manager is also an employee)
//
//
//Address class
//	-buildingName
//	-streetName
//	-city
//	-state
//	-pincode
//
//Create class EmployeeDirectory (create interface of it and then implement)
//	fields :
//		-allEmployeeList
//
//	methods :
//		-registerEmployee
//		-getEmployee based on id
//		-removeEmployee based on id
//		-getAllEmployees to get list of all employees
//		-printAllEmployeeHierarchy to pring all employee hierarchy
//
//
//Runner class
//	- This should create employee directory and take input from user and create employee
//	- try adding employee and removing employee
//	- print hierarchy or employee


package majorAssign;

import java.util.Scanner;

public class Employee {

        protected int id;
        protected String name;
        protected String email;
        protected int phoneNumber;
        protected Address address;
        protected Employee manager;

        public Employee(int id, String name, String email, int phoneNumber, Address address, Employee manager) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.address = address;
            this.manager = manager;
        }

        public Employee(Employee manager) {
            userInterface(manager);
        }

    public Employee userInterface(Employee manager) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Creat ID");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("e-mail");
        String mail = scanner.nextLine();
        System.out.println("phone no.");
        int no = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Address - building name");
        String building = scanner.nextLine();
        System.out.println("streat");
        String streat = scanner.nextLine();
        System.out.println("city");
        String city = scanner.next();
        System.out.println("pin code");
        int pin = scanner.nextInt();
        System.out.println("state");
        String state = scanner.nextLine();
        Address address = new Address(building , streat , city , state , pin);
        Employee employee = new Employee(id , name , mail , no , address , manager);
        return employee;
    }



}
