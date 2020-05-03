public class OperationAdd extends Operation {       // 子类继承抽象类，重写getResult方法
    @Override
    public double getResult() {
        double result = 0;
        result = getNumberA() + getNumberB();
        return result;
    }
}

