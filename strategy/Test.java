package strategy;

public class Test {
    static double total = 0.0d;
    public static void main(String [] args) {
        CashContext csuper = new CashContext("打8折");
        double totalPrices = csuper.getResult(1000);
        total = total + totalPrices;
        System.out.println(total);
    }
}