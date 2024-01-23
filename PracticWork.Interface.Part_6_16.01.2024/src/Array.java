import java.util.ArrayList;
import java.util.Arrays;

public class Array implements IShow, IMath {

    private int [] array;

    public Array(int[] array){
        this.array = array;
    }

    @Override
    public void Print(){
        for (int element : array) {
            System.out.println(element + " ");
        }
        System.out.println();
    }

    @Override
    public void Print(String info){
       Print();
        System.out.println(info);
    }


    @Override
    public void Max() {
        Arrays.sort(array);
        System.out.println("Минимальный элемент массива: " + array[0]);
    }

            @Override
            public void Min () {
        Arrays.sort(array);
        System.out.println("Максимальный элемент массива: " + array[array.length - 1]);

            }

                @Override
                public void Avg () {
        Arrays.sort(array);
        System.out.println("Средний элемент массива: " + array[array.length % 5]);

                }
            }
