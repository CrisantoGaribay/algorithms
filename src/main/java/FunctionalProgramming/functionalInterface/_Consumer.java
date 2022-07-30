package FunctionalProgramming.functionalInterface;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer customer = new Customer("Maria", "9999999");
        greetCustomer(customer);

        //Using the functional interface
        System.out.println("// using the consumer");
        greetCustomerConsumer.accept(customer);

    }

    static Consumer<Customer> greetCustomerConsumer = customer
            -> System.out.println("Hello " + customer.customerName +
            ", thanks for registering phone number " + customer.customerPhoneNumber);

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName +
                ", thanks for registering phone number " + customer.customerPhoneNumber);
    }


    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
