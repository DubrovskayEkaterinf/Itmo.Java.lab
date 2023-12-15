package laboratory2;

import java.util.Scanner;

public class CalCul {
    public static void main(String[] args) {
        double num1;
        double num2;
        double answer;
        String operation;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        num1 = Double.parseDouble(scanner.next());
        System.out.print("Введите второе число: ");
        num2 = Double.parseDouble(scanner.next());
        System.out.print("Введите действие (+, -, *, /): ");
        operation = scanner.nextLine();
        switch (operation) {
            case "+":
                System.out.println(addition(num1, num2));
                break;
            case "-":
                System.out.println(subtraction(num1, num2));
                break;
            case "*":
                System.out.println(multiplication(num1, num2));
                break;
            case "/":
                System.out.println(division(num1, num2));
                break;
            default:
                System.out.print("Ошибка");
                     }
    }

    public static double addition(double num1, double num2) {
        double answer = (num1 + num2);
        return answer;
    }

    public static double subtraction(double num1, double num2) {
        double answer = (num1 - num2);
        return answer;
    }

    public static double multiplication(double num1, double num2) {
        double answer = (num1 * num2);
        return answer;
    }

    public static double division(double num1, double num2) {
        double answer = (num1 / num2);
        return answer;
    }
}








