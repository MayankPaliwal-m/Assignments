package customexception;

public class MailValidatorUtil {
    public void validateMail(String mailId) throws InvalidMailException {
    boolean isContainAt = mailId.contains("@");
    boolean isContainDot = mailId.contains(".");

    if(isContainAt && isContainDot){
        System.out.println("Mail is valid");
    }else {
        System.out.println("Mail is invalid , raising exception");
        String message = "Mail " + mailId + " is not valid";
        InvalidMailException invalidMailException = new InvalidMailException(message); //what if we didn't did this
        throw invalidMailException;    //QQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQ throw kam kese karta hai
       // throw new ArithmeticException();
       // throw new Exception();
    }
    }
}
