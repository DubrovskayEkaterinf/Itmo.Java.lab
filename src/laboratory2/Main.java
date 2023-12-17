package laboratory2;

import java.util.Scanner;

import static laboratory2.CalCul.*;

public class Main {
//    private static String operation;

//    public static void main(String[] args) {
////        // Класс Double
////        double num1;
////        double num2;
////        double answer;
////        Scanner scanner = new Scanner(System.in);
////        System.out.print("Введите первое число: ");
////        double doudleNum1 = Double.parseDouble(scanner.next());
////        System.out.print("Введите второе число: ");
////        double doudleNum2 = Double.parseDouble(scanner.next());
////        System.out.println("Введите действие: + , - , *, / ");
////        Result result = new Result(doudleNum1, doudleNum2);
////        String operation = scanner.next();
////        switch (operation) {
////            case "+":
////                System.out.println(addition(result.doudleNum1, result.doudleNum2));
////                break;
////            case "-":
////                System.out.println(subtraction(result.doudleNum1, result.doudleNum2));
////                break;
////            case "*":
////                System.out.println(multiplication(result.doudleNum1, result.doudleNum2));
////                break;
////            case "/" :
////                System.out.println(division(result.doudleNum1, result.doudleNum2));
////                break;
////            default:
////                System.out.println("Ошибка");
////                return;
////
////        }
////
////    }
////
////    private static class Result {
////        public final double doudleNum1;
////        public final double doudleNum2;
////
////        public Result(double doudleNum1, double doudleNum2) {
////            this.doudleNum1 = doudleNum1;
////            this.doudleNum2 = doudleNum2;
////        }
//
////       // Класс Long
////        long num1;
////        long num2;
////        long answer;
////        Scanner scanner = new Scanner(System.in);
////        System.out.print("Введите первое число: ");
////        long longnum1 = Long.parseLong(scanner.next());
////        System.out.print("Введите второе число: ");
////        long longnum2 = Long.parseLong(scanner.next());
////        System.out.println("Введите действие: + , - , *, / ");
////        Result result = new Result(longnum1, longnum2);
////        String operation = scanner.next();
////        switch (operation) {
////            case "+":
////                System.out.println(addition(result.longNum1, result.longNum2));
////                break;
////            case "-":
////                System.out.println(subtraction(result.longNum1, result.longNum2));
////                break;
////            case "*":
////                System.out.println(multiplication(result.longNum1, result.longNum2));
////                break;
////            case "/" :
////                System.out.println(division(result.longNum1, result.longNum2));
////                break;
////            default:
////                System.out.println("Ошибка");
////                return;
////
////        }
////
////    }
////
////    private static class Result {
////        public final long longNum1;
////        public final long longNum2;
////
////        public Result(long longNum1, long longNum2) {
////            this.longNum1 = longNum1;
////            this.longNum2 = longNum2;
////        }    }
////     //Класс Int
//       int num1;
//        int num2;
//        int answer;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите первое число: ");
//        int intnum1 = Integer.parseInt(scanner.next());
//        System.out.print("Введите второе число: ");
//        int intnum2 = Integer.parseInt(scanner.next());
//        System.out.println("Введите действие: + , - , *, / ");
//        Result result = new Result(intnum1, intnum2);
//        String operation = scanner.next();
//        switch (operation) {
//            case "+":
//                System.out.println(addition(result.intNum1, result.intNum2));
//                break;
//            case "-":
//                System.out.println(subtraction(result.intNum1, result.intNum2));
//                break;
//            case "*":
//                System.out.println(multiplication(result.intNum1, result.intNum2));
//                break;
//            case "/" :
//                System.out.println(division(result.intNum1, result.intNum2));
//                break;
//            default:
//                System.out.println("Ошибка");
//                return;
//
//        }
//
//    }
//
//    private static class Result {
//        public final long intNum1;
//        public final long intNum2;
//
//        public Result(long intNum1, long intNum2) {
//            this.intNum1 = intNum1;
//            this.intNum2 = intNum2;
//        }    }
//    }


public static void main(String[] args) {
    RunShoes runShoes = new RunShoes();

    runShoes.setBrand("Asics");
    runShoes.setTypSport("Бег");
    runShoes.setColor(Color.WHATE);
    runShoes.setSaze(38.5);
    runShoes.setTypSport("Yes");

    System.out.println(runShoes);
}
}
