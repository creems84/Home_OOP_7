package HomeOop7;

public class Calculator {
    private Operation operation;

    public Calculator(Operation operation) {
        this.operation = operation;
    }

    public double calculate(double a, double b) {
        double result = operation.calculate(a, b);
        return result;
    }

    private String getOperationSymbol() {
        if (operation instanceof Addition) {
            return "+";
        } else if (operation instanceof Multiplication) {
            return "*";
        } else if (operation instanceof Division) {
            return "/";
        } else {
            return "";
        }
    }
}

