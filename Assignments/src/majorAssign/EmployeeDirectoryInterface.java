package majorAssign;

import java.util.HashMap;
import java.util.List;

public interface EmployeeDirectoryInterface {
    public void registerEmployee(Integer id , Employee employee);
    public void getEmployee(Integer id );
    public void removeEmployee(Integer id);
    public void getAllEmployees();
    public void printAllEmployeeHierarchy();

}
