package api2;

public class EmployeeMain {
    public static void main(String[] args) {

        Employee e1 = new Employee("App-Q" , "U" , 25 ,
                "yan-A" , 100000 , "Finance");
        Employee e2 = new Employee("Tillu" , "Asd" , 25 ,
                "133 , Chanakyapuri , Indore" , 5 , "Operation" );

        System.out.println("e1 = e2 is " + e1.equals(e2));
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        System.out.println(e1);
        System.out.println(e2);
        System.exit(137);
    }
}
