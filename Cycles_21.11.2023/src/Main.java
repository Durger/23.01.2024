import java.util.Scanner;

import static java.util.Scanner.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

                // Задание.1. Пользователь вводит два числа
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int firstNum = scanner.nextInt();
        System.out.println("Введите второе число");
        int secondNum = scanner.nextInt();
                for (int i = firstNum; i < secondNum; i++) {
            System.out.println(i);}

        // Задание.2. Пользователь вводит два числа с клавиатуры и нужно указать диапазон всех чисел.
        System.out.println("Введите первое число");
        int firstNum1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int secondNum2 = scanner.nextInt();
            for (int i = firstNum1; i <= secondNum2; i++) {
                if (i % 2 == 0){
                System.out.println(i);}
            }
            }
// Задание.3.Пользователь вводит два числа с клавиатуры и нужно указать диапазон всех чисел.

    }
