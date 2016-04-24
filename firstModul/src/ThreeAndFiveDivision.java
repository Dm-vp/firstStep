import java.util.Scanner;

/**
 * Created by сони on 05.03.2016.
 */
public class ThreeAndFiveDivision {
    public static void main(String[] args) {
        int i=1;
        while (i<100){
            if ((i%3 == 0 || i%5 == 0) && (i%(3*5) != 0)){
                System.out.println (i);
            }
            i++;
        }

        for (int j = 0; j<100; j++){
            System.out.println(j);
        }
    }


}
