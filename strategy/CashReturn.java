package strategy;

public class CashReturn extends CashSuper{
    private double moneyCondition = 0.0d;
    private double moneyReturn = 0.0d;
    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = Double.valueOf(moneyCondition);
        this.moneyReturn = Double.valueOf(moneyReturn);
    }
    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money >= moneyCondition) {
            result = money - (money / moneyCondition) * moneyReturn;
        }
        return result;
    }
}