package multiinherit;

public interface Employee {
   default String getName() {
        return "xyz";
    }
    void commonMethod();
}
