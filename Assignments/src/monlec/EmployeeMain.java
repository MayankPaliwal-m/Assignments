package monlec;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EmployeeMain {

    public static void main(String[] args) {
        Map<Integer , Employee> employeeMap = new HashMap<>();

        Employee emp1 = new Employee("123" , "arun");
        Employee emp2 = new Employee("456" , "Mayank");
        Employee emp3 = new Employee("333" , "Shubham");
        Employee emp4 = new Employee("33" , "Shubham");

        employeeMap.put(1 , emp1);
        employeeMap.put(2 , emp2);
        employeeMap.put(3 , emp3);


        for (Map.Entry<Integer , Employee> entry : employeeMap.entrySet()) {
           Integer key = entry.getKey();
           Employee emp = entry.getValue();
            System.out.println(key + "=" + emp);
        }

        Employee emp =  employeeMap.get(2);
        System.out.println(emp);
        System.out.println(employeeMap.getOrDefault(31,emp4));

        employeeMap.remove(2);

        Iterator<Map.Entry<Integer , Employee>> iterator = employeeMap.entrySet().iterator();
        while (iterator.hasNext()){
           Map.Entry<Integer , Employee> entry =  iterator.next();
            Integer key = entry.getKey();
            Employee empl = entry.getValue();
            System.out.println(key + "=" + emp);
        }



    }


}
