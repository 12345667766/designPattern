public abstract class Operation {       // 抽象类
    private double numberA = 0;
    private double numberB = 0;
    public double getNumberA () {
        return numberA;
    }
    public void setNumberA (double value) {
        numberA = value;
    }
    public double getNumberB () {
        return numberB;
    }
    public void setNumberB (double value) {
        numberB = value;
    }
    public abstract double getResult();        // 定义了抽象方法  必须定义抽象类
}

