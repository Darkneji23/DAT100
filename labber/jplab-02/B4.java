import java.util.Scanner;
public class B4 {
    public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in); 
       int i = 0;
       while(i <3){
        System.out.print("Insert how much you need to pay: ");
        int price = scanner.nextInt();
        System.out.print("Insert how much you payed: ");
        int paid = scanner.nextInt();
        if(paid < price){
            System.out.print("You didnt pay enough!");
            break;
        }
        int change =  paid - price;
        int tens = change / 10;
        int ones = change % 10;
        System.out.println(tens + " tens\n" + ones + " ones\n");
        i++;
       }
       scanner.close();
    }
}
