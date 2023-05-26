package trywithresource;

public class ResourceNotAvailableException extends Exception {
    String someAdditionalMessage;

    public ResourceNotAvailableException(String someAdditionalMessage) {
        this.someAdditionalMessage = someAdditionalMessage;
    }

    public String getMessage() {
        return someAdditionalMessage;
    }
}
