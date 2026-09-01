import java.util.Scanner;
public class B2Lab3 {
    public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in); 
       int number = 0;
       for(int i = 0; i < 5; i++){
        System.out.print("Write a number: ");
        number = scanner.nextInt();
        System.out.println("The number is: " + number);
       }
       scanner.close();
    }
}
