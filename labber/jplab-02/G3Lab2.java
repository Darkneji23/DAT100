import java.util.Scanner;
import java.lang.Math;
public class G3Lab2 {
    public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in); 
       int i = 0;
       while(i <3){
         System.out.print("Write 1-st number: ");
         int firstNnumber = scanner.nextInt();
         System.out.print("Write 2-nd number: "); 
         int secondNumber = scanner.nextInt(); 
         System.out.print("Write 3-d number: ");
         int thirdNumber = scanner.nextInt(); 
         System.out.print("Write 4-th number: ");
         int fourthNumber = scanner.nextInt(); 
         int minNumber = Math.min(Math.min(firstNnumber, secondNumber), Math.min(thirdNumber, fourthNumber));
         System.out.print("The lowest number is: " + minNumber +"\n");
         i++;
       }
       scanner.close();
    }
}
