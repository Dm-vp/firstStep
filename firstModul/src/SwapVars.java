/**
 * Created by сони on 09.03.2016.
 */
public class SwapVars {
    public static void main(String[] args) {
        int i=3, j=5, n;
        System.out.println("БЫЛО    i= "+i+", j= "+j);
        n=i;
        i=j;
        j=n;
        System.out.println("СТАЛО   i= "+i+", j= "+j);
    }
}
