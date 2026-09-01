import java.util.Scanner;

public class G1Lab2{
    public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in); 
       int i = 0;
       while(i <3){
         System.out.print("Write a number: ");
         int n = scanner.nextInt(); 
         if(n %2 == 0){
          System.out.println("Tallet er et partall!");
         }else{
          System.out.println("Tallet er et oddetall!");
         }
         i++;
       }
       scanner.close();
    }
}
