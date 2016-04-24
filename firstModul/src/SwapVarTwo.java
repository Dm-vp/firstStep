/**
 * Created by сони on 09.03.2016.
 */
public class SwapVarTwo {
    public static void main(String[] args) {
        int i=-3, j=5;
        System.out.println("БЫЛО    i= "+i+", j= "+j);
        if(i<j){
            i=j-i;
            j=j-i;
            i=j+i;
        } else {
            i=i-j;
            j=j+i;
            i=j-i;
        }

        System.out.println("СТАЛО   i= "+i+", j= "+j);
    }
}
