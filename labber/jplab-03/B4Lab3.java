import java.util.Scanner;
import java.lang.Math;

public class B4Lab3 {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Write a number: ");
        double number = scanner.nextDouble();

        System.out.print("Write a factor: ");
        int factor = scanner.nextInt();

        double mathResult = Math.pow(number, factor);

        double result = 1.0;
        int i = 0;

        while (i < factor) {
            result = result * number;
            i++;
        }

        System.out.println("Result using Math.pow: " + mathResult);
        System.out.println("Result using while loop: " + result);

        scanner.close();
    }
}
