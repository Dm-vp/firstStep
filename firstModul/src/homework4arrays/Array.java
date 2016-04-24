package homework4arrays;

import java.util.Random;

/**
 * Создать массив случайной длины и заполнить его случайными числами от 1 до 50
 * 1. Найти минимальное и максимальное число в массиве
 * 2. Посчитать количество двоек в массиве
 * 3. Найти сумму всех чисел массива которые делятся на три
 * 4. Найти на каком месте в массиве стоит число 1. Если таких нет вывести нет.
 * Если несколько вывести наиболее маленький индекс.
 * 5. Отсортировать массив.
 * <p/>
 * добавить к предыдущей задче следущее
 * a) Метод переворачивающий массив без использования дополнтельного массива ( 12345 -> 54321)
 * б) Длинное сложение. Дано 2 длинных числа( представленных в виде массива), найти их сумму. Длинное число это число не влезающее в стандартные int и long и поэтому его представляют в виде массива. Например число 4567 можно представить как [4,5,6,7].
 * в) Длинное умножение. Дано 2 длинных числа найти их произведение. Ограничение по длинне пусть будет до 1000 знаков.
 * Все числа натуральные для простоты.
 * <p/>
 * При реализации использовать все полученные ранее знания. Создание методов ИТП. Классы тут врядли понадобятся, хотя если ты сможешь сделать в тему будет интересно посмотреть.
 */
public class Array {
    public static void main(String[] args) {
        /*int array[] = creatorOfRandomArray();
        minAndMax(array);
        amountOfTwos(array);
        divOnThree(array);
        onesPosition(array);
        int[] sortedArray = sortArray(array);
        int[] invertedArray = invertArray(sortedArray);*/

        int[] arrayForSum1 = creatorOfRandomArrayForSum();
        int[] arrayForSum2 = creatorOfRandomArrayForSum();
        int[] longSumOfArrays = longSum(arrayForSum1, arrayForSum2);
        printArray(longSumOfArrays);
//        int[] longMultOfArrays = longMult(arrayForSum1, arrayForSum2);
//        printArray(longMultOfArrays);


    }

    static int[] creatorOfRandomArray() {
        Random random = new Random();
        int[] array = new int[1 + Math.abs(random.nextInt() % 49)];
        for (int i = 0; i < array.length; i++) {
            int j = Math.abs(random.nextInt() % 51);
            array[i] = j;
            System.out.print(j + " ");
        }
        System.out.println();
        return array;
    }

    static void minAndMax(int[] array) {
        int min = array[0], max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        //some change
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);

    }

    static void amountOfTwos(int[] array) {
        int amount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 2) {
                amount = amount + 1;
            }
        }
        if (amount == 0) {
            System.out.println("В массиве двойки отсуствуют");
        } else if ((amount - 1) % 10 == 0 && (amount - 11) % 100 != 0) {
            System.out.println("В данном массиве " + amount + " двойка");
        } else if ((amount - 2) % 10 == 0 && (amount - 12) % 100 != 0 ||
                (amount - 3) % 10 == 0 && (amount - 13) % 100 != 0 ||
                (amount - 4) % 10 == 0 && (amount - 14) % 100 != 0) {
            System.out.println("В данном массиве " + amount + " двойки");

        } else System.out.println("В данном массиве " + amount + " двоек");
    }

    static void divOnThree(int[] array) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                j = j + array[i];
            }
        }
        if (j != 0) {
            System.out.println("Сумма чисел, которые делятся на три, равна " + j);
        } else System.out.println("В массиве нет чисел, кратных трем");

    }

    static void onesPosition(int[] array) {
        int j = 0;
        for (int i = 0; i < array.length && j == 0; i++) {
            if (array[i] == 1) {
                j = i;
            }
        }
        if (j == 0) {
            System.out.println("В массиве нет единиц");
        } else System.out.println("Ближайшая единица в массиве имеет позицию " + (j + 1));
    }

    static int[] sortArray(int[] array) {
        if (array.length > 1) {
            for (int k = 0; k < array.length; k++) {


                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        int j = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = j;
                    }
                }
            }


        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();


        return array;
    }

    static int[] invertArray(int[] array) {
        System.out.println("Inverted:");
        if (array.length < 2) {
            printArray(array);
            return array;
        } else {

            int x = array.length;
            if (x % 2 != 0) x--;

            for (int i = 0; i < x / 2; i++) {
                int j = array[i];
                array[i] = array[(array.length - 1) - i];
                array[(array.length - 1) - i] = j;
            }

            printArray(array);
            return array;
        }


    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
    }

    static int[] longSum2(int[] array1, int[] array2) {
        invertArray(array1);
        invertArray(array2);
        int maxLength = Math.max(array1.length, array2.length);
        int[] result = new int[maxLength + 1];
        int overflow = 0;
        for (int i = 0; i < maxLength; i++) {
            int first = array1.length > i ? array1[i] : 0;
            int second = array2.length > i ? array2[i] : 0;
            result[i] = (overflow + first + second) % 10;
            overflow = (overflow + first + second) / 10;
        }
        return invertArray(result);
    }

    static int[] longSum(int[] array1, int[] array2) {
        int[] arrayLonger, arrayShorter;
        if (array1.length < array2.length) {
            arrayLonger = array2;
            arrayShorter = array1;
        } else {
            arrayLonger = array1;
            arrayShorter = array2;
        }

        int[] arraySum = new int[arrayLonger.length + 1];
        arraySum[0] = 0;
        for (int i = arrayLonger.length - 1; i >= 0; i--) {
            if (i + 1 > arrayLonger.length - arrayShorter.length) {
                int n = arrayLonger[i] + arrayShorter[i - (arrayLonger.length - arrayShorter.length)];
                if (n < 10) arraySum[i + 1] = n;
                else if (i != 0) {
                    arraySum[i + 1] = n - 10;
                    arrayLonger[i - 1]++;
                } else if (n > 10) {
                    arraySum[0] = 1;
                    arraySum[i + 1] = n - 10;
                }
            } else {
                if (arrayLonger[i] < 10) arraySum[i + 1] = arrayLonger[i];
                else if (i != 0) {
                    arraySum[i + 1] = arrayLonger[i] - 10;
                    arrayLonger[i - 1]++;
                } else if (arrayLonger[i] > 10) {
                    arraySum[0] = 1;
                    arraySum[i + 1] = arrayLonger[i] - 10;
                }

            }
        }

        if (arraySum[0] == 0) {
            int[] arrayTemp = new int[arraySum.length - 1];
            for (int i = 0; i < arrayTemp.length; i++) {
                arrayTemp[i] = arraySum[i + 1];
            }
            arraySum = arrayTemp;
        }


        return arraySum;
    }

    static int[] creatorOfRandomArrayForSum() {
        Random random = new Random();
        int[] array = new int[1 + Math.abs(random.nextInt() % 7)];
        for (int i = 0; i < array.length; i++) {
            int j = Math.abs(random.nextInt() % 10);
            array[i] = j;
            System.out.print(j + " ");
        }
        System.out.println();
        return array;
    }

    static int[] longMult(int[] array1, int[] array2) {
        int[] arrayLonger, arrayShorter;
        if (array1.length < array2.length) {
            arrayLonger = array2;
            arrayShorter = array1;
        } else {
            arrayLonger = array1;
            arrayShorter = array2;
        }
        int k = arrayLonger.length + arrayShorter.length - 1;

        int[] arrayMult = new int[k + 1];
        int[] arrayTemp = new int[k + 1];

        for (int i = arrayShorter.length - 1, countI = 0; i >= 0; i--, countI++) {
//            countI = i - (arrayShorter.length - 1);
            int n = 0;
            for (int t = 0; t < arrayTemp.length; t++) {
                arrayTemp[t] = 0;
            }
            for (int j = arrayLonger.length - 1, countJ = 0; j >= 0; j--, countJ++) {
                int mult = arrayLonger[j] * arrayShorter[i];
                if (i == arrayShorter.length - 1) {

                    if (j != 0) {
                        arrayMult[k - countJ] = (mult + n) % 10;
                        n = (mult + n) / 10;

                    } else {
                        arrayMult[k - countJ] = (mult + n) % 10;
                        n = (mult + n) / 10;
                        arrayMult[k - countJ - 1] = n;

                    }


                } else {

                    if (j != 0) {
                        arrayTemp[k - countJ - countI] = (mult + n) % 10;
                        n = (mult + n) / 10;

                    } else {
                        arrayTemp[k - countJ - countI] = (mult + n) % 10;
                        n = (mult + n) / 10;
                        arrayTemp[k - countJ - countI - 1] = n;
                        arrayMult = longSum(arrayMult, arrayTemp);
                    }


                }
            }

        }
        if (arrayMult[0] == 0) {
            for (int j = 0; j < arrayMult.length; j++) {
                int[] arrayTemp2 = new int[arrayMult.length - 1];
                if (arrayMult[0] != 0 || arrayMult.length == 1) break;

                for (int i = 0; i < arrayTemp2.length; i++) {
                    arrayTemp2[i] = arrayMult[i + 1];

                }

                arrayMult = arrayTemp2;
            }
        }

        return arrayMult;
    }


}