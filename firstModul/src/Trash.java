/**
 * Created by сони on 12.04.2016.
 */
public class Trash {
    public static void main(String[] args) {


        int j, a = 0;

        for (int i = 1; i < 10; i++) {
            for (j = 1; j < 10; j++) {
                a = i * j;
                System.out.print(a + " | ");
            }
            System.out.println();
        }
    }
}
