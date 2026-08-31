import java.util.Scanner;

public class B1 {
    public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in); 
       int i = 0;
       while(i <3){
         System.out.print("Write a day: ");
         int day = scanner.nextInt(); 
         System.out.print("Write a month: ");
         int month = scanner.nextInt(); 
         System.out.print("Write a year: ");
         int year = scanner.nextInt();  
         System.out.println("Today is: " + day +"."+ month +"."+ year);
         i++;
       }
       scanner.close();
    }
}
