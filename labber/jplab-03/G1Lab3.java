import java.util.Scanner;

public class G1Lab3 {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Print a number: ");

        int n = scanner.nextInt();

        for (int i = 1; i < n; i++) {

            System.out.println(i);

        }

        scanner.close();

    }

}