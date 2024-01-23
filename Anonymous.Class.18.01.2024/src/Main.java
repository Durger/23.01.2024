import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayUtils uArray = new ArrayUtils( 50);
        uArray.fill(3);
        uArray.print();
        uArray.sum(new ArrayUtils.OnCalculatorLinistener() {
            @Override
            public void getResult(int sum) {
                System.out.println("Array sum = " + sum);
            }
        });

        }
    }

    class ArrayUtils {
    private int [] array;

    public ArrayUtils(int count){
        array = new int [count];
        fill (1);
            }
            public void fill(int value){
            Arrays.fill(array,value);
            }
            public void print(){
            for(int i = 0; i< array.length; i++){
            System.out.println(array [i] + " ");
        }
                System.out.println();
            }

            public void sum(OnCalculatorLinistener calculatorLinistener){
        int sum = 0;
                for(int i = 0; i< array.length; i++){
                   sum+=array[i];
            }
                if(calculatorLinistener != null){
                    calculatorLinistener.getResult(sum);
                }
            }
            public interface OnCalculatorLinistener{
        void getResult (int sum);
            }

    }