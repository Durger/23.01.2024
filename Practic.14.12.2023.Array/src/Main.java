import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        // Задание.1.Два одномерных массива заполняются случайными числами
        // Два одномерных массива заполняются случайными числами

        //Инициализация первого массива
        int[] arr = new int[5];
        //Создание цикла для первого массива
        for (int i = 0; i < arr.length; i++) {
            // Создание рандомных значений с использованием метода Math.random()
            arr[i] = (int) Math.round(Math.random() * 6);
            // Вывод результата применения метода Math.random()
            System.out.println("Массив 1: " + arr[i]);
        }
        //Инициализация второго массива
        int[] arr2 = new int[4];
        //Создание цикла для второго массива
        for (int i = 0; i < arr2.length; i++) {
            // Создание рандомных значений с использованием метода Math.random()
            arr2[i] = (int) Math.round(Math.random() * 8);
            // Вывод результата применения метода Math.random()
            System.out.println("Массив 2: " + arr2[i]);
        }
        // Сформировать третий массив, содержащий элементы обоих массивов;
        //Инициализация третьего массива
        int[] arr3 = new int[9];
        //Копирование элементов из первого массива в третий
        System.arraycopy(arr, 0, arr3, 0, 5);
        //Копирование элементов из второго массива в третий - с контрольных занчений окончания первого
        System.arraycopy(arr2, 0, arr3, 5, 4);
        //Вывод содержимого обоих массивов в консоль
        System.out.println("Массив 3, содержащий элементы обоих массивов: " + Arrays.toString(arr3));

        // Сформировать третий массив, содержащий элементы обоих массивов без повторений;
        // Инициализирован новый массив
        int[] arr4 = new int[9];
        for (int i = 0; i < arr.length; i++) {
            // Заполненение нового массива значениями из первого
            arr4[i] = arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            // Дополнение нового массива значениями из второго
            arr4[i + 5] = arr2[i];
        }
        //Применение метода сортировки массива Arrays.sort
        Arrays.sort(arr4);
        //Вывод отсортированного массива
        System.out.println("Третий отсортированный массив 3: " + Arrays.toString(arr4));

        //Ининциализация нового масива для проверки элементов
        int[] noDoubleArr = new int[9];
        for (int i = 1; i < arr4.length; i++) {

            //Условие сравнения массива с его значениями
            if (arr4[i] != arr4[i - 1]) {
                noDoubleArr[i] = arr4[i];
            }
        }
        System.out.println("Третий массив без повторений элементов:  " + Arrays.toString(noDoubleArr));
        // Сформировать третий массив, содержащий элементы общие для двух массивов;
        //Ининициализация новых массивов
        int[] generalArray = new int[5];
        int[] generalArray2 = new int[5];
        int[] generalArrayResult = new int[10];
        //Цикл проверки первого нового массива
        for (int i = 1; i < generalArray.length; i++) {
            generalArray[i] = (int) Math.round(Math.random() * 6);
            generalArray2[i] = (int) Math.round(Math.random() * 6);
            //Условие сравнения первого и второго массива
            if (generalArray[i] != generalArray2[i - 1]) {
                //Добавление результатов сравнения в третий массив
                generalArrayResult[i] = generalArray[i];
            }
                          }
                System.out.println("Третий массив c общими элементами:  " + Arrays.toString(generalArrayResult));


        // Задача.2. Пользователь вводит с клавиатуры зарплаты сотрудников. Необходимо сортировать полученные данные
        // по возрастанию или убыванию в зависисмости от выбора пользователя. Выбор алгоритма сортировки необходимо обосновать.

        //Инициализация метода сканер для приема данных
        Scanner scanner = new Scanner(System.in);

        //Запрос на ввод зарплаты первого работника
        System.out.println("Введите зарплату первого работника: " );

                //Создание массива данных первого сотрудника
        int sizeOfMoney1 = scanner.nextInt();
        int[] workerMoney1 = new int [sizeOfMoney1];

        //Запрос на ввод зарплаты второго работника
        System.out.println("Введите зарплату второго работника: " );

        //Создание массива данных второго сотрудника
        int sizeOfMoney2 = scanner.nextInt();
        int[] workerMoney2 = new int [sizeOfMoney2];

        //Запрос на ввод зарплаты первого работника
        System.out.println("Введите зарплату третьего работника: " );

        //Создание массива данных первого сотрудника
        int sizeOfMoney3 = scanner.nextInt();
        int[] workerMoney3 = new int [sizeOfMoney3];

        //Создание общего массива с зарплатами сотрудников
        int[] moneyArray =  {sizeOfMoney1, sizeOfMoney2, sizeOfMoney3};

        // Сформировать третий массив, содержащий элементы трех массивов для последующей их сортировки;
        System.arraycopy(workerMoney1, 0, moneyArray, 0, sizeOfMoney1);
        System.arraycopy(workerMoney2, 0, moneyArray, sizeOfMoney1, sizeOfMoney2);
        System.arraycopy(workerMoney3, 0, moneyArray, sizeOfMoney2, sizeOfMoney3);
        System.out.println("Общий массив с зарплатами сотрудников: " + Arrays.toString(moneyArray));

        //System.arraycopy(src, srcPos, dest, destPos, length)
        //src - откуда копировать
        //dest - куда копировать
        //length - кол-во копируемых элементов
        //srcPos - индекс, с которого начинать копировать
        //destPos - индекс, в который начать копирование

       for (int i = 0; i < workerMoney1.length; i++) {
            moneyArray[i] = workerMoney1[i];
        }
        for (int i = 0; i < workerMoney2.length; i++) {
            moneyArray[i + 5] = workerMoney2[i];
        }
        Arrays.sort(moneyArray);
        System.out.println("Третий отсортированный массив 3: " + Arrays.toString(moneyArray));


        //System.out.println("Зарплата первого работника: " + workerMoney1);



        //Создание массива данных каждого из сотрудников
       /* //int [] workerMoney1 = new int[20];
        int [] workerMoney2 = new int[20];
        int [] workerMoney3 = new int[20];*/




        //Создание механизма приема данных с использованием метода scanner
      /*  int Money1 = scanner.nextInt();
        int Money2 = scanner.nextInt();
        int Money3 = scanner.nextInt();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Массив: " + Arrays.toString(array));*/



        }


}
