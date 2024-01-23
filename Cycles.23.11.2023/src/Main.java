import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
task1();
    }
    public static void task1 () {
        // task.1.Ввести с клавиатуры размер квадрата. Отобразить заполненный квадрат.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер стороны квадрата: ");
        int length = scanner.nextInt();
        for (int i = 0; i < length; i++){
            for (int x = 0;x > length; x++){
            System.out.print("*");
        System.out.println("\n");}


        //String repeated = str.repeat(3)
       // ;
        /*for (int i = 0; i < length; i++){
            System.out.print("*"); }
        System.out.println("\n");
        for (int i = 0; i < length; i++){
            System.out.print("*"); }
        System.out.println("\n");*/



        }

    }


//for (int i = 0; i > length; i++)}{
//if (i > length){