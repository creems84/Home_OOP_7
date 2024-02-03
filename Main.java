package HomeOop7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Выберите операцию (+, -, *, /): ");
        String operation = scanner.nextLine();

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        Operation calculatorOperation;

        switch (operation) {
            case "+":
                calculatorOperation = new Addition();
                break;
            case "-":
                calculatorOperation = new Subtraction();
                break;
            case "*":
                calculatorOperation = new Multiplication();
                break;
            case "/":
                calculatorOperation = new Division();
                break;
            default:
                System.out.println("Invalid operation");
                scanner.close();
                return;
        }

        Calculator calculator = new Calculator(calculatorOperation);
        double result = calculator.calculate(num1, num2);
        System.out.println("Result: " + result);

        scanner.close();
    }
}

