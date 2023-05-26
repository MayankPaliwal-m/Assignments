package trywithresource;

public class MyResourceMain {
    public static void main(String[] args) {
         try (MyResource resource = new MyResource()){
             resource.readingDataFromResource();
         }catch (ResourceNotAvailableException e){
             System.out.println("Exception raised : " + e.getMessage());
         }catch (Exception e){
             System.out.println("inside exception block");
         }
    }
}
