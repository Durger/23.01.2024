import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println ("Введите слово");
      String word = scanner.nextLine();
      StringBuffer word = new StringBuffer;
      word.reverse();
      System.out.println(word);



        //Задача2
       /* String str = "hello, world hello hello hello ";
//        StringTokenizer st = new StringTokenizer(str, " ");
//
//        while (st.hasMoreTokens()) {
//            System.out.println(st.nextToken());
//        }
        String[] wordsArr = str.split(",\\s|\\s");
        for (String word : wordsArr) {
            System.out.println(word);*/

        }
    }
}