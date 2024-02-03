package HomeOop7;

public class Division implements Operation {
    @Override
    public double calculate(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Деление на ноль не допускается.");
        }
    }
}
