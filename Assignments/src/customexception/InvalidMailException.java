package customexception;

public class InvalidMailException extends Exception {

    public InvalidMailException(String abc) {
        super(abc);
    }

    @Override
    public String getMessage() {
        return super.getMessage();     //bapu ki method ko ki bapu ke bapu ki koOOOOOOOOOOOOOOOO
    }
}
