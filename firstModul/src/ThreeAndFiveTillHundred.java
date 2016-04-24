/**
 * Created by сони on 02.03.2016.
 */
public class ThreeAndFiveTillHundred {
    public static void main(String[] args) {
        int i = 0, j = 1, result;
        System.out.println("Мы делимся на 5, но не делимся на 5 и 3 одновременно");
        while ((i + 1) * 5 < 100) {
            i++;
            result = i * 5;
            if (j * 3 * 5 != result) {
                System.out.println(result);
            } else {
                j++;
            }
        }
        System.out.println("Мы делимся на 3, но не делимся на 5 и 3 одновременно");
        i = 0;
        j = 1;
        while ((i + 1) * 3 < 100) {
            i++;
            result = i * 3;
            if (j * 3 * 5 != result) {
                System.out.println(result);
            } else {
                j++;
            }


        }
    }
}