package FunctionalProgramming.combinatorpattern;

import java.time.LocalDate;

import static FunctionalProgramming.combinatorpattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@mail.com",
                "+103242323",
                LocalDate.of(2000, 1, 1)
        );

        System.out.println(CustomerValidatorService.isValid(customer));

        // USING THE COMBINATOR PATTERN FOR FUNCTIONAL PROGRAMMING
        ValidationResult result = isEmailValid()
                .and(isPhoneValid())
                .and(isAdult())
                .apply(customer);
        System.out.println("COMBINATOR");
        System.out.println(result);

        if (result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }
    }
}
