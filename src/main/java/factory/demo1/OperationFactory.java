package factory.demo1;

public class OperationFactory {
    public static Operation createOperation(String op){
        Operation operation=null;
        switch (op)
        {
            case "+":
                operation=new Add();
                break;
            case "-":
                operation=new Sub();break;
            case "*":
                operation=new Mul();break;
            case "/":
                operation=new Div();break;
        }
        return operation;
    }
}
