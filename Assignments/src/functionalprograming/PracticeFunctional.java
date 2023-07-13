package functionalprograming;

import java.util.function.BiPredicate;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;

@FunctionalInterface
interface MyConsumerInterface {
    void accept(String s);
}

@FunctionalInterface
interface MySupplierInterface {
     String get();
}

@FunctionalInterface
interface MyPredicateInterface {
    public boolean test(String s);
}

@FunctionalInterface
interface BiConsumer<T, U> {
    void accept(T t, U u);
}

@FunctionalInterface
interface BiFunction<T, U, R>{
    R apply(T t, U u);
}


public class PracticeFunctional {
    public static void main(String[] args) {
        MyConsumerInterface consume = s -> System.out.println(s);
        MySupplierInterface supplier = () -> "Hello World";
        MyPredicateInterface predicate = s -> s.equals("Hello World");
        BiConsumer<Integer , Integer> biConsumer = (firstNum, secNum) -> System.out.println(firstNum+secNum);
        BiFunction<Integer , Integer , Integer> biFunction = (firstNum, secNum) -> firstNum + secNum;
        BiPredicate<String, String> isEqual = (nameOne , nameTwo) -> nameOne.equals(nameTwo);
        BooleanSupplier booleanSupplier = () -> true;
        DoubleBinaryOperator doubleBinaryOperator = (left, right) -> left+right;
        DoubleConsumer doubleConsumer = value -> System.out.println(value);
        performOperation((i, j) -> i*j, 1, 3);
        performOperation(PracticeFunctional::add, 5, 2);
        performOperation(Integer::sum, 5, 2);



    }

    public static void performOperation(BiFunction<Integer, Integer , Integer> f , int a, int b){
        int output = f.apply(a, b);
        System.out.println(output);
    }

    public static int add(int m, int n){
        return m+n;
    }
}

