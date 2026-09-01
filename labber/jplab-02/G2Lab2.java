import java.util.Scanner;

public class G2Lab2 {
    public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in); 
       int i = 0;
       while(i <3){
         System.out.print("Write a number: ");
         int nd = scanner.nextInt(); 
         switch(nd){
            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;
            case 4:
                System.out.println("It's Thursday");
                break;
            case 5:
                System.out.println("It's Friday");
                break;
            case 6:
                System.out.println("It's Saturday");
                break;
            case 7:
                System.out.println("It's Sunday");
                break;
            default:
                System.out.println("undefined");
                break;
         }
         i++;
       }
       scanner.close();
    }
}
