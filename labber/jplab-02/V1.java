import java.util.Scanner;

public class V1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Write number 1: ");
        int a = scanner.nextInt();

        System.out.print("Write number 2: ");
        int b = scanner.nextInt();

        System.out.print("Write number 3: ");
        int c = scanner.nextInt();

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println("Numbers in ascending order:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        scanner.close();
        for(int i =3; i>=1;i--){
            System.out.print(i);
        }
    }
}