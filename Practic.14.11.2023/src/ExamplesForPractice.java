import java.util.Scanner;
public class ExamplesForPractice {
    int number = 199999;
    String string = "Hello!";
    double dobleNum = 1.2D;

    boolean trueOrFalse = true;

    public void someMethod() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else if (num % 2 != 0) {
            System.out.println("Odd number");
        }
//
//        if (number < 15) {
//            System.out.println("Условие выполняется");
//
//            for (int i = 0; i < number; i++) {
//                number--;
//                //number = number - 1;
//                System.out.println("Число number уменьшилось. Его значние " + number);
//            }
//        }else  {
//            System.out.println("Условие не выполняется");
//        }
    }
}
