import java.util.Random;

/**
 * Created by сони on 20.03.2016.
 */
public class ArrayManual {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomInt = random.nextInt();
            int div = randomInt % 20;
//            System.out.println(div);
        }
        int n = 23;
        int[] array = arrayTenNumbers(n);
        array[4] = 6;
        for (int i = 0; i < n; i++) {
            int result = array[i];
            System.out.print(result);
        }
    }
    static int[] arrayTenNumbers (int a){
        int[] array = new int[a];
        return array;
    }
}
