//package functionalprograming;
//
//import java.util.function.Consumer;
//
//interface MyConsumerInterface {
//    void test(String s);
//
//}
//
//interface MySupplierInterface{
//
//    String supplier();
//}
//
//public class LamdaAssignment {
//
//    public static void main(String[] args) {
//
//        MyConsumerInterface consume = s -> System.out.println(s);
//
//        MySupplierInterface supplier = () = "Hello World";
//
//    }
//
////    <> consume = public void accept(String s){
////        System.out.println(s);
////    }
//
//
////<> supplier = public String get(){
////            return "Hello World";
////        }
//
//
////<> predicate = public boolean test(String s){
////            return s.equals("Hello World");
////        }
//
//
////<> biConsumer = public void accept(T t, U u){ }
//
//
////<> biFunction = = public R apply(T t, U u) {}
//
//
////<> biPredicate = public boolean test(T t, U u){}
//
//
//}