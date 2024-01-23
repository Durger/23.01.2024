package org.example;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] mas;//обьявляется переменная типа массив с именем mas
        int mas1[];
//        //Сразу после создания массива, его элементы инициализируются значениями по умолчанию.
//        //В данном случае - 0
          int[] ints = new int[5];
//
//        //Обращение к элементам массива
          System.out.println(ints[4]);
//
//        //Создание массива с  одновременной инициализацией
          int[] mas2 = new int[]{3, 2, 1};
//        //альтернативный вариант
          int[] mas3 = {4, 5, 6};
//
          System.out.println(mas3.length);
          mas3 = new int[]{1, 2, 3};
//
//        //Создание двумерного массива (квадратный)5на5
          int[][] mas4 = new int[5][5];
//        //Создание трехмерного массива
          int[][][] mas5 = new int[5][5][5];
//
          mas4[2][1] = 3;

         int[][] mas6 = new int[3][];
         mas6[0] = new int[4];
//
//        //Пример вывода значений массива
          int[] numbers = new int[]{4, 3, 2, 1};

//        //Вывод каждого значения в консоль
         for (int number : numbers) {
             System.out.println(number);
        }

//        //Вывод содержимого массива в консоль
          System.out.println(Arrays.toString(numbers));
//
        //System.arraycopy(src, srcPos, dest, destPos, length)
         //src - откуда копировать
         //dest - куда копировать
         //length - кол-во копируемых элементов
         //srcPos - индекс, с которого начинать копировать
         //destPos - индекс, в который начать копирование
         int[] src = new int[]{1, 2, 3, 4, 5};
          int[] dest = new int[]{5, 4, 3, 2, 1};
          int length = 3;
          int srcIndex = 1;
          int desIndex = 2;
          System.arraycopy(src, srcIndex, dest, desIndex, length);
          System.out.println(Arrays.toString(dest));

         //Пример вывода в консоль, содержимого многомерного массива
         String[][] objects = new String[3][3];
         String content = Arrays.deepToString(objects);
         System.out.println(content);

         //заполнение массива одинаковыми значениями
       //fill - заполнить
          boolean[] test1 = new boolean[3];
          Arrays.fill(test1, true);

         int[] mas7 = new int[10];
         int startIndex = 1;
         int endIndex = 4;
         Arrays.fill(mas7, startIndex, endIndex, 2);

        //сортировка массива
          int[] mas8 = new int[]{3, 1, 4, 5, 2};
          Arrays.sort(mas8);
          System.out.println(Arrays.toString(mas8));

          Integer[] mas9 = new Integer[]{3, 1, 4, 6, 2};
          Arrays.sort(mas9, Collections.reverseOrder());
          System.out.println(Arrays.toString(mas9));

         //Поэлементное сравнение массивов
         int[] mas10 = {1, 2, 3};
         int[] mas11 = {1, 2, 3};
         boolean isEqual = Arrays.equals(mas10, mas11);
         System.out.println(isEqual);

//        //Поиск значения по массиву
         int index = Arrays.binarySearch(mas11, 3);
         System.out.println(index);
//
//        //=========================================
//
        //Строки
//
//        //Создание строки
          String name = "Вася";
          System.out.println(name);
          name = "";

          String name1 = new String("Вася");
         name1 = new String();

//        //Преобразование числа в строку
          int num = 10;
          String value = String.valueOf(num);
          value = String.valueOf(0.5);
          value = String.valueOf(true);

        task1 ();
//        task2();
    }

    public static void task1 () {
        int counter = 0;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr1 = {10, 11, 3, 13, 6, 15, 16, 17, 18};

        int[] resultArr = new int[18];

        for (int i = 0; i < arr.length; i++) {
            resultArr[i] = arr[i];
//            System.out.println(Arrays.toString(resultArr));
        }
        for (int i = 0; i < arr1.length; i++) {
            resultArr[i + 9] = arr1[i];
//            System.out.println(Arrays.toString(resultArr));
        }
//        System.out.println(Arrays.toString(resultArr));
        Arrays.sort(resultArr);
        System.out.println(Arrays.toString(resultArr));
        for (int i = 1; i < resultArr.length; i++) {
//            System.out.println(resultArr[i] + "   "+ resultArr[i - 1]);
            if (resultArr[i] == resultArr[i - 1]) {
                System.out.println(resultArr[i] + "   " + resultArr[i - 1]);
            }
        }
    }

    public static void task2 () {
        int counter = 0;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr1 = {10, 11, 3, 13, 6, 15, 16, 17, 18};

        int[] resultArr = new int[18];

        for (int i = 0; i < arr.length; i++) {
            resultArr[i] = arr[i];
            System.out.println(Arrays.toString(resultArr));
        }
        for (int i = 0; i < arr1.length; i++) {
            resultArr[i+9] = arr1[i];
            System.out.println(Arrays.toString(resultArr));
        }
    }

    }
}