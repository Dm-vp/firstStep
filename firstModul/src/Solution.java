/**
 * Created by сони on 29.02.2016.
 */
public class Solution  {
    public static void main(String[] args) {
        int a=1, b=5, c=4;
        double discriminant = (Math.pow(b, 2) - 4*a*c);
        double xOne, xTwo;
        if (discriminant > 0){
            xOne = (-b+Math.sqrt(discriminant))/(2*a);
            xTwo = (-b-Math.sqrt(discriminant))/(2*a);
            System.out.println("Уравнение имеет два корня: ");
            System.out.println(xOne);
            System.out.println(xTwo);
        }
        if (discriminant == 0){
            xOne = (-b )/(2*a);
            System.out.println("Уравнение имеет один корень");
            System.out.println(xOne);
        }
        if (discriminant < 0){
            System.out.println("Уравнение не имеет действительных корней");
        }
        System.out.println("mission accomplished");
    }
}
