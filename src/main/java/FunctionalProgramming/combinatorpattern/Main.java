package FunctionalProgramming.combinatorpattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@mail.com",
                "+03242323",
                LocalDate.of(2000, 1, 1)
        );

        System.out.println(CustomerValidatorService.isValid(customer));
    }
}
