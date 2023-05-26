package trywithresource;

public class MyResource implements AutoCloseable{
    public MyResource(){
        System.out.println("Initializing resource");
    }
    public void readingDataFromResource() throws ResourceNotAvailableException {
        System.out.println("Reading data from resource");
        ResourceNotAvailableException e = new ResourceNotAvailableException("Resource not available");

    }
    public void closingResource(){
        System.out.println("Closing Resource");
    }


    @Override
    public void close() throws Exception  {//why throwing exception nnnnnnnnnnnnnnnnnnnnnnnn
        closingResource();
        throw new Exception();
    }
}
