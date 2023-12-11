package Laboratory1;

import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//        System.out.println("Я");
//        System.out.println("хорошо");
//        System.out.println("знаю");
//        System.out.println("Java.");
//    }
//}


//    public static void main(String[] args) {
//        int a = 46;
//        int b = 10;
//        float c = 3;
//        int d = 29;
//        int e = 4;
//        int f = -15;
//
//        float answer = (a + b) * (b / c);
//        int answer1 = d * e * f;
//        System.out.println(answer);
//        System.out.println(answer1);
//    }
//}


//    public static void main(String[] args) {
//        int number = 10500;
//        int result = (number / 10) / 10;
//        System.out.println(result);
//    }
//}

//    public static void main(String[] args) {
//        double a = 3.6;
//        double b = 4.1;
//        double c = 5.9;
//        double result = a * b * c;
//        System.out.println(result);
//    }
//}

//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите первое число: ");
//        int num = in.nextInt();
//        System.out.print("Введите второе число: ");
//        int num1 = in.nextInt();
//        System.out.print("Введите третье число: ");
//        int num2 = in.nextInt();
//
//        System.out.printf("Ваше первое число: %d ", num);
//        System.out.printf("Ваше второе число: %d ", num1);
//        System.out.printf("Ваше третье число: %d ", num2);
//    }
//}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int b = in.nextInt();
        if ( b % 2 != 0 && b < 100 ) {
            System.out.println("Нечетное");
        } else if ( b % 2 == 0 && b < 100 ) {
            System.out.println("Четное");
        } else if ( b % 2 == 0 && b > 100 ) {
            System.out.println("Выход за пределы диапазона");
        }



    }

}

