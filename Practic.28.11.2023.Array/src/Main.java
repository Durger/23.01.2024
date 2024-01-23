import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        //task1().Ввод двух слов. Поменять слова местами и отобразить на экране

        System.out.println ("Введите слово для поиска");
        String word1 = scanner.nextLine();
        System.out.println ("Введите слово для замены");
        String wordReplacement = scanner.nextLine();
        String[] wordsArr = word1.split(",\\s|\\s");
        String[] wordsArr2 = wordReplacement.split(",\\s|\\s");
        for (String word : wordsArr) {
            System.out.println(wordReplacement + word);}
        /*String[] arr = {1, 2};
        String[word] = 2; // индексируем и меняем значения
        String[wordReplacement] = 1;
         System.out.println(Arrays.toString(arr));*/


           // System.out.println(Str.replace( word, wordReplacement));


    }
    public static void task2 () {
        String str = "hello, world hello hello hello ";
//        StringTokenizer st = new StringTokenizer(str, " ");
//
//        while (st.hasMoreTokens()) {
//            System.out.println(st.nextToken());
//        }
        String[] wordsArr = str.split(",\\s|\\s");
        for (String word : wordsArr) {
            System.out.println(word);
        }

    }

}