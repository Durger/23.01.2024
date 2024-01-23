import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Task1.buffetSays();
        Task2.methodOddNumber();
        Task3.displayingALineFromASymbol();
        Task4.maxMumberOfFour ();

    }

    class Task1 {
        //Написать метод, который отображает отформатированный текст/
        public static void buffetSays() {
            System.out.println(" \"" + "Someone,s sitting in the shade today ");
            System.out.println("because someone planted a three a long time ago" + "\"");
            System.out.println("Warren Buffet.");
        }
    }

    class Task2 {
        // Напишите метод, который принимает два числа в качестве параметра и отображает все четные числа между ними
        public static void methodOddNumber() {
            // Запрос двух чисел у пользователя
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число");
            int firstNum = scanner.nextInt();
            System.out.println("Введите второе число");
            int secondNum = scanner.nextInt();
            //Условие проверки принятых данных на четность и вывод расчетов в консоль
            for (int q = firstNum; q <= secondNum; q++) {
                if (q % 2 == 0)
                    System.out.println("Нечетные числа мкжду числами пользователя: " + q);
            }
        }
    }

    class Task3 {
        //Напишите метод, который отображает горизонтальную или вертикальную линию из некоторого символа.
        //Метод принимает в качестве параметра: длину линии,направление, символ.
        public static void displayingALineFromASymbol() {
            Scanner scanner = new Scanner(System.in);
            char simbol = '@';
            // Прием параметров длинны линии
            System.out.println("Введите длинну линиии из символа");
            int length = scanner.nextInt();
            // Прием параметров направления линии (условие горизонталь/вертикаль)
            System.out.println("Выберете направлениие линии: 1 - горизонтальная, 2 - вертикальная");
            int direction = scanner.nextInt();
            // Условие для вывода линии по горизонтали или по вертикали
                if (direction == 1) {
                    for (int i = 0; i < length; i++)
                    System.out.print("@");
                } else if (direction == 2) {
                    for (int i = 0; i < length; i++)
                    System.out.println("@");
                }
                else {
                System.out.println("УНИКУМ!!!! Ты прочитал не внимательно варианты для выбора, попробуй снова!!!");
            }
            class Task4 {
            //Напишите метод, который возвращает максимальное из четырёх чисел. Числа передаются в качестве параметров.
                public static void maxMumberOfFour () {
                Scanner scanner = new Scanner(System.in);
                // Прием четырех чисел
                System.out.println("Введите первое число");
                    int firstNum = scanner.nextInt();
                    System.out.println("Введите второе число");
                    int SecondNum = scanner.nextInt();
                    

                }

            }

        }
    }
}















