import java.util.Arrays;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        // Задание.1.Два одномерных массива заполняются случайными числами
        // Два одномерных массива заполняются случайными числами
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            // arr[i] = random.nextInt(10);
            arr[i] = (int) Math.round(Math.random() * 6);
            System.out.println("Массив 1: " + arr[i]);
        }
        int[] arr2 = new int[4];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) Math.round(Math.random() * 8);
            System.out.println("Массив 2: " + arr2[i]);
        }
        // Сформировать третий массив, содержащий элементы обоих массивов;
        int[] arr3 = new int[9];
        System.arraycopy(arr, 0, arr3, 0, 5);
        System.arraycopy(arr2, 0, arr3, 5, 4);
        System.out.println("Массив 3, содержащий элементы обоих массивов: " + Arrays.toString(arr3));

        // Сформировать третий массив, содержащий элементы обоих массивов без повторений;
        int[] arr4 = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr4[i] = arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr4[i + 5] = arr2[i];
        }
        Arrays.sort(arr4);
        System.out.println("Третий отсортированный массив 3: " + Arrays.toString(arr4));
        int[] resultArr = new int[9];

        for (int i = 1; i < arr4.length; i++) {
            if (arr4[i] != arr4[i - 1]) {
                resultArr[i] = arr4[i];
            }
        }
        System.out.println("Третий массив без повторений элементов:  " + Arrays.toString(resultArr));

        // Сформировать третий массив, содержащий элементы общие для двух массивов;
        for (int i = 1; i < arr4.length; i++) {
            if (arr4[i] == arr4[i - 1]) {
                resultArr[i] = arr4[i];
                }
            System.out.println("Третий массив c общими элементами:  " + Arrays.toString(resultArr));


        }
    }
}






        /*int counter = 0;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr1 = {10, 11, 3, 13, 6, 15, 16, 17, 18};

        int[] resultArr = new int[18];

        for (int i = 0; i < arr.length; i++) {
            resultArr[i] = arr[i];
//            System.out.println(Arrays.toString(resultArr));
        }
        for (int i = 0; i < arr1.length; i++) {
            resultArr[i+9] = arr1[i];
//            System.out.println(Arrays.toString(resultArr));
        }
//        System.out.println(Arrays.toString(resultArr));
        Arrays.sort(resultArr);
        System.out.println(Arrays.toString(resultArr));
        for (int i = 1; i < resultArr.length; i++) {
//            System.out.println(resultArr[i] + "   "+ resultArr[i - 1]);
            if (resultArr[i] == resultArr[i-1]) {
                System.out.println(resultArr[i] + "   "+ resultArr[i - 1]);*/

       /* Arrays.sort(arr3);
        System.out.println("Отсортированный массив 3: " + Arrays.toString(arr3));*/
        /*for (int i = 1; i < arr3.length; i++){
            if (arr.length [i] == arr2.length [i] - 1);
            System.out.println(arr.length [i] +  arr2.length [i] - 1);*/


//for(int i2 = 0; i > arr2.length; i++){*/








        /*boolean isEqual = Arrays.equals(arr, arr2);
        System.out.println(isEqual);*/


// Сформировать третий массив, содержащий элементы общие для двух массивов;
//Поиск совпадений в строке
        /*String testString = "testing";
        boolean test = testString.contains("test");
        System.out.println(test);*/

// Сформировать третий массив, содержащий только уникальные элементы каждого из массивов;

// Сформировать третий массив, содержащий только минимальное и максимальное значение каждого из
//массивов.










