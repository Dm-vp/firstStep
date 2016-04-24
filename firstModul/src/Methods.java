/**
 * Created by сони on 20.03.2016.
 */
public class Methods {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        int testResult = sumOfTwoNumbers(y, x);
        int testResult2 = sumOfTwoNumbers(1, 4);
        int testResult3 = sumOfTwoNumbers(y, 4);
        int testResult4 = sumOfTwoNumbers(y, testResult2);
        System.out.println(testResult4);
    }

    static int sumOfTwoNumbers(int a, int b){
        System.out.println(a);
        return a + b;
    }
}
