import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        //Задание.1. Найти счастливое шестизначное число. Сравнить обе его половины.
        // Разделить шестизначное число на 6 отдельных цифр.
        // Сложить первые три числа и вторые три числа.
        // Написать логику сравнения двух частей с выводом сообщения.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите шестизначное число");
        String i = scanner.nextLine();
        String[] parts = i.split(" ");
        System.out.println(Arrays.toString(parts));
        System.out.println(parts[0]);
        System.out.println(parts[1]);
        if (parts[0] ==  parts[1]) {
            System.out.println("У Вас счастливый билет");}
        if (parts[0] !=  parts[1]) {
            System.out.println("У Вас не счастливый билет");
        }




//        if (i == 100000 && i < 999999){
//                    }
//            int digitOne = (i / 100000) % 10;
//            int digitTwo = (i / 10000) % 10;
//            int digitThree = (i / 1000) % 10;
//            int digitFour = (i / 100) % 10;
//            int digitFive = (i / 10) % 10;
//            int digitSix = i % 10;
//            if ((digitOne + digitTwo + digitThree) == (digitFour + digitFive + digitSix)){
//            System.out.println("Число является счастливым");}

    }
}
