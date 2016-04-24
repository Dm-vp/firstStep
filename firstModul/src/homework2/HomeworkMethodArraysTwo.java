package homework2;

import java.util.Random;

/**
 * Написать программу, создающую два массива (с помоью метода), затем сладывающую эти два массива
 * поэлементно (с помощью метода)  и записывающую результат в 3й массив и выводящая на
 * экран 2 исходных массива и новый. Метод, который кладывает массивы, должен проверять, совпадает
 * ли длина входных массивов. Если нет - возвращать массив из 1 элемента. Размеры массивов задать
 * случайно от 5 до 7.
 */
public class HomeworkMethodArraysTwo {
    public static void main(String[] args) {
        Random random = new Random();
        int randomLenghtOfArrays = Math.abs(random.nextInt()) % 3 + 5;
        int randomLenghtOfArrays2 = Math.abs(random.nextInt()) % 3 + 5;
        int[] array1 = creatorOfTwoArrays(randomLenghtOfArrays),
                array2 = creatorOfTwoArrays(randomLenghtOfArrays2);
        int[] array3 = sumOfTwoArrays(array1, array2);
    }

    static int[] creatorOfTwoArrays(int a) {
        int[] array = new int[a];
        Random random = new Random();
        for (int i = 0; i < a; i++) {
            int ururu = random.nextInt() % 10;
            array[i] = ururu;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return array;
    }

    static int[] sumOfTwoArrays(int[] a, int[] b) {
        if (a.length != b.length) {
            int[] array = {3030};
            System.out.println(array[0]);
            return array;
        }
        int[] array = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            array[i] = a[i] + b[i];
            System.out.print(array[i] + " ");
        }
        return array;
    }
}
