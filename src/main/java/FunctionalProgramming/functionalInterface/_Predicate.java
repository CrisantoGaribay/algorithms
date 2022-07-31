package FunctionalProgramming.functionalInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("0700000000"));
        System.out.println(isPhoneNumberValid("09000567000"));

        System.out.println("using predicate");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("0700000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09000567000"));

        //cahining predicates
        System.out.println(
                "Is phone number valid and contains number 3: " +
                        isPhoneNumberValidPredicate.and(containsNumber3).test("09000537000")
        );
        System.out.println(
                "Is phone number valid and contains number 3: " +
                        isPhoneNumberValidPredicate.and(containsNumber3).test("07000003000")
        );
        System.out.println(
                "Is phone number valid OR contains number 3: " +
                        isPhoneNumberValidPredicate.or(containsNumber3).test("070fff00003000")
        );
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate =
            phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}
