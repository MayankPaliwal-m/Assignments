package exception;

public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println("Achhi chij");
        try {
            int result = 1 / 0;
            System.out.println(result);
        }catch (Exception e){
            System.out.println("Tu hi bata 0 se kese divide karte hai");
            System.out.println(e.getMessage());
        }
        System.out.println("Last statement of code");
    }
}