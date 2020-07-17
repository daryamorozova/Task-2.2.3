public class CreditPaymentService {
    public double calculate(double amount, double periodmonth) {
        double ratemonth = 9.99 / 1200;
        double annuityfactor = (ratemonth * Math.pow(1 + ratemonth, periodmonth)) / (Math.pow(1 + ratemonth, periodmonth) - 1);
        double monthlypay = amount * annuityfactor;
        return monthlypay;
    }
}
