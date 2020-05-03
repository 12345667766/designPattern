public class OperationFactory {
    public static Operation createOperate (String operate) {    
        Operation oper = null;          // 初始化引用
        switch (operate) {
            case "+" :
                oper = new OperationAdd();      // 引用指向新分配的空间
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();                
                break;
        }
        return oper;
    }
}