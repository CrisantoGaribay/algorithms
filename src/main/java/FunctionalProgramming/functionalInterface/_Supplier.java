package FunctionalProgramming.functionalInterface;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {

        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlSupplier);
    }

    static String getDBConnectionUrl() {
        return "url";
    }

    static Supplier<String> getDBConnectionUrlSupplier =
            () -> "urlSupplier";
}
