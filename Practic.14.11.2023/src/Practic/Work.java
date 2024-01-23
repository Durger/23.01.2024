package Practic;
import java.util.Scanner;
public class Work {

    // Задача.1.Проверка значений на четность и не четность
    public void someMethod() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else if (num % 2 != 0) {
            System.out.println("Odd number");
        }

        // Задача.2.Вывод суммы или произвдения трех чисел
        System.out.println("Введите первое число");
        int num1 = scanner.nextInt();
        System.out.println("Введите первое число");
        int num2 = scanner.nextInt();
        System.out.println("Введите первое число");
        int num3 = scanner.nextInt();
        System.out.println("Вариант операции с данными: Сложение - 1, Вычитание - 2");
        int num4 = scanner.nextInt();
        if (num4 == 1) {
            System.out.println("Сумма трех чисел:" + num1 + num2 + num3);
        }
        if (num4 == 2) {
            System.out.println("Умножение трех чисел:" + num1 * num2 * num3);
        }

        //Задача.3.
    }
}
