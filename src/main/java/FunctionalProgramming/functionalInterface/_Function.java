package FunctionalProgramming.functionalInterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = increment(0);
        System.out.println("Method");
        System.out.println(increment);

        Integer increment2 = incrementByOneFunction.apply(0);
        System.out.println("Function");
        System.out.println(increment2);

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10Function);

        System.out.println("Function chained");
        System.out.println(addBy1AndThenMultiplyBy10.apply(4));
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    static int increment(int number) {
        return number + 1;
    }
}
