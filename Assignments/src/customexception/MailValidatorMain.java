package customexception;
import java.util.Scanner;
// import java.io.FileNotFoundException;
// import java.io.IOException;

public class MailValidatorMain {
    public static void main(String[] args) {
        MailValidatorUtil mailValidatorUtil = new MailValidatorUtil();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mail id");
        String mail = sc.next();

        try {
            //int result = 1/0;
            mailValidatorUtil.validateMail(mail);
        }catch (InvalidMailException t){          // InstanceOf
            System.out.println("Exception :"+t.getMessage());
        }catch (ArithmeticException t){
            System.out.println("Arithmetic exception");
        }catch (Exception e){
            System.out.println("Generic Exception");
        }
        finally {
            System.out.println("inside finally block");
        }

        String returnValue = testExceptionReturnValue();
        System.out.println(returnValue);
    }

    private static String testExceptionReturnValue() throws RuntimeException {
        try {
           // return  "haha";          //RETURN SE BHAGA KYU NIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII
            System.exit(1871);
        }catch (Exception e){
            return "returning from catch";
        }finally {
            return "returning from finally";
        }
    }
}
