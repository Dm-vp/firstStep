import java.util.Scanner;

/**
 * Created by сони on 06.03.2016.
 */
public class InputFromConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text: ");
        String inputString = scanner.nextLine();

        System.out.println("Enter int: ");
        int inputInt = scanner.nextInt();

        System.out.println("Enter double: ");
        double inputDouble = scanner.nextDouble();

        System.out.println("You have been input");
        System.out.println("    Text: " + inputString);
        System.out.println("    Int: " + inputInt);
        System.out.println("    Double: " + inputDouble);

    }
}
