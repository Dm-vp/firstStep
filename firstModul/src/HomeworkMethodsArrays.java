import java.util.Random;

/**
 * Created by сони on 20.03.2016.
 */
public class HomeworkMethodsArrays {
    /*
        1. Создать метод принимающий на входе число N и возвращающий
        массив целых слуйчайных чисел. Сделать проверку на то что N > 0.
        2. Создать метод печатаюющий массив целых чисел любого размера на экране. см void
        3. В методе main с помощью созданных методов, создать 3 массива разной длины и вывести их на экран.
     */
    public static void main(String[] args) {


        int[] array = arrayN(7);
        int[] array3 = arrayN(8);
        int[] array4 = arrayN(9);
//            int[] array2 = arrayInvert(n);
        printArrayOfAnySize(array);
        printArrayOfAnySize(array3);
        printArrayOfAnySize(array4);


    }

    static int[] arrayN(int n) {
        if (n <= 0) {
            System.out.println("Размер массива должен быть неотрицательным");
            return null;
        }
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            Random random = new Random();
            int randomInt = random.nextInt();
            array[i] = randomInt;
        }
        return array;
    }

    /*    static int[] arrayInvert (int a){
            int[] array2 = new int[a];
            for (int i = 0; i < a; i++) {
                array2[i] = a-i;
            }
            return array2;
        } */
    static void printArrayOfAnySize(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

}
