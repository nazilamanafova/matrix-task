package task1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Payment payment = new CardPayment(111, "C100", 50.0, "A Bank");
        Payment payment2 = new CardPayment(222, "C200", 60.0, "B Bank");
        Payment payment3 = new CardPayment(333, "C300", 70.0, "C Bank");
        Payment payment4 = new CardPayment(444, "C400", 90.0, "D Bank");

        Payment payment5 = new CashPayment(555, "C500", 100.0, "T500");
        Payment payment6 = new CashPayment(666, "C600", 200.0, "T600");
        Payment payment7 = new CashPayment(777, "C700", 300.0, "T700");

        Payment payment8 = new BonusPayment(888, "C800", 400.0, "A Bonus");
        Payment payment9 = new BonusPayment(999, "C900", 500.0, "B Bonus");
        Payment payment10 = new BonusPayment(1000, "C1000", 1000.0, "C Bonus");

        List<Payment> payments = Arrays.asList(payment, payment2, payment3, payment4, payment5,
                payment6, payment7, payment8, payment9, payment10
        );

        //amount is greater than 100
        List<Payment> paymentsGreaterThan100 = payments
                .stream().
                filter(p -> p.amount() > 100)
                .toList();

        paymentsGreaterThan100.forEach(System.out::println);

        //total amount
        double total = payments.stream()
                .mapToDouble(Payment::amount)
                .sum();

        System.out.println(" Total: " + total);

        System.out.println("\nCard payments");

        payments.stream().filter(CardPayment.class::isInstance)
                .map(CardPayment.class::cast)
                .forEach(System.out::println);



        Map<String, List<Payment>> paymentsByCustomer = payments.stream()
                .collect(Collectors.groupingBy(Payment::customerId));

        System.out.println("\nPayments grouped by customer:");

        paymentsByCustomer.forEach((customerId, customerPayments) ->
                System.out.println(customerId + " - " + customerPayments));

        //max
       Payment highestPayment = payments.
               stream()
               .max(Comparator.comparingDouble(Payment::amount)).orElse(null);
        System.out.println("Highest payment: " + highestPayment);

        payments.forEach(p -> System.out.println(p.id() + " " + getPaymentType(p)));

        double streamResult = payments.stream()
                .mapToDouble(Payment::amount)
                .sum();

        double parallelResult = payments.parallelStream()
                .mapToDouble(Payment::amount)
                .sum();

        System.out.println("Stream result: " + streamResult);
        System.out.println("Parallel result: " + parallelResult);


    }
    public static String  getPaymentType(Payment payment){
        switch (payment){
            case CardPayment cardPayment-> {
                return "cardPayment";
            }
            case CashPayment cashPayment -> {
                return "cashPayment";
            }
            case BonusPayment bonusPayment -> {
                return "bonusPayment";
            }
        }
    }
}
