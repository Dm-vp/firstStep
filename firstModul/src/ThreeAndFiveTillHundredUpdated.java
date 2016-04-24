/**
 * Created by сони on 02.03.2016.
 */
public class ThreeAndFiveTillHundredUpdated {
    public static void main(String[] args) {
        int i = 1, counterI = 1, j = 1, counterJ = 1, resultThree, resultFive;
        System.out.println("А теперь по порядку");
        while (i * 3 < 100) {
            resultThree = i * 3;            resultFive = j * 5;
            if (resultThree < resultFive) {
                if (counterI * 3 * 5 != resultThree) {
                    System.out.println(resultThree);
                    i++;
                } else {
                    counterI = counterI + 1;
                }

            } else if (resultThree > resultFive) {
                if (counterJ * 3 * 5 != resultFive) {
                    System.out.println(resultFive);
                    j++;
                } else {
                    counterJ = counterJ + 1;
                }

            } else {
                i++;
                j++;
            }
        }

    }
}