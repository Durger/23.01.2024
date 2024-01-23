import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Задача.1.Проверка значений на четность и не четность
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число на проверку четности");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else if (num % 2 != 0) {
            System.out.println("Odd number");
        }

        // Задача.2.Вывод суммы или произвдения трех чисел
        System.out.println("Введите первое число");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int num2 = scanner.nextInt();
        System.out.println("Введите третье число");
        int num3 = scanner.nextInt();
        System.out.println("Вариант операции с данными: Сложение - 1, Вычитание - 2");
        int num4 = scanner.nextInt();
        if (num4 == 1) {
            int result = num1 + num2 + num3;
            System.out.println("Сумма трех чисел:" + result);
        }
        if (num4 == 2) {
            System.out.println("Умножение трех чисел:" + num1 * num2 * num3);
        }

        //Задача.3. Вывод результат ввода трех чисел(максимума, минимума,среднего)
        System.out.println("Введите первое число");
        int num5 = scanner.nextInt();
        System.out.println("Введите второе число");
        int num6 = scanner.nextInt();
        System.out.println("Введите третье число");
        int num7 = scanner.nextInt();
        System.out.println("Вариант операции с данными: Максимум из 3-х - 1, Минимум из 3-х - 2, Среднее из 3-х");
        int num8 = scanner.nextInt();
        if (num8 == 1) {
            if  (num5 > num6 && num5 > num7);
            System.out.println("Максимум из 3-х равен:" + num5);
            if (num6 > num5 && num6 > num7);
            System.out.println("Максимум из 3-х равен:" + num5);
            if (num7 > num5 && num7 > num6);
            System.out.println("Максимум из 3-х равен:" + num5);}
        if (num8 == 2) {
            if (num5 < num6 && num5 > num7);
            System.out.println("Минимум из 3-х равен:" + num5);
            if (num6 < num5 && num6 > num7);
            System.out.println("Минимум из 3-х равен:" + num5);
            if (num7 < num5 && num7 > num6);
            System.out.println("Минимум из 3-х равен:" + num5);}
        if (num8 == 3) {
            int result = (num5 + num6 + num7 / 3);
            System.out.println("Среднее из 3-х равно:" + result);



            // Задание.5. Работа с диапазоном чисел
            System.out.println("Введите количество часов");
            int time = scanner.nextInt();
            int hour = 1;
            if (hour < 6 && hour > 6) {
                System.out.println("Good night");
            }

            if (hour < 6 && hour > 13) {
                System.out.println("Good morning");
            }

            if (hour < 13 && hour > 17) {
                System.out.println("Good day");
            }

            if (hour < 17 && hour > 0) {
                System.out.println("Good evening");
            }

        }
    }
}
