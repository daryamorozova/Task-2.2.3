public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double monthlypayOneYear = service.calculate(1_000_000, 12);
        System.out.println("One year = " + monthlypayOneYear);

        double monthlypayTwoYear = service.calculate(1_000_000, 24);
        System.out.println("Two years = " + monthlypayTwoYear);

        double monthlypayThreeYear = service.calculate(1_000_000, 36);
        System.out.println("Three years = " + monthlypayThreeYear);

    }
}
