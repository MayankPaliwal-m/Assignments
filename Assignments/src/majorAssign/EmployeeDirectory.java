package majorAssign;

import java.util.*;

public class EmployeeDirectory implements EmployeeDirectoryInterface{

    //private List<Employee> allEmployeeList;
    private HashMap<Integer , Employee> allEmployeeList;

    // private List<Employee> allEmployeeList = new ArrayList<>();


    public EmployeeDirectory(){
       //this.allEmployeeList = new ArrayList<>();
        this.allEmployeeList = new HashMap<Integer, Employee>();
    }

    @Override
    public void registerEmployee(Integer id , Employee employee) {

        allEmployeeList.put(id ,employee);

    }

    @Override
    public void getEmployee(Integer id) {
        // listOfObjects.get(1).type;
        Employee employee = allEmployeeList.get(id);
        System.out.println("Employee details : " +employee);
    }

    @Override
    public void removeEmployee(Integer id) {
        allEmployeeList.remove(id);
    }

    @Override
    public void getAllEmployees() {
        System.out.println(allEmployeeList);
    }

    @Override
    public void printAllEmployeeHierarchy() {

    }

//    public Employee userInterface(EmployeeDirectory manager) {
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
