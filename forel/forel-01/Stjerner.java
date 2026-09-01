import java.util.Scanner;

public class Stjerner {
    public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in); 
       String green = "\u001B[32m";
       String reset = "\u001B[0m";
       System.out.print(green+"Skriv inn et tall: " + reset);
         int tall = scanner.nextInt();

         System.out.print(green+"Skriv inn et tegn: " + reset);
         char tegn = scanner.next().charAt(0);

         System.out.print(green+"Hvor mange tegn skal det være på hver linje?: " + reset);
         int lineLength = scanner.nextInt();

         skrivStjerner(tall, tegn, lineLength);
         System.out.println();

       scanner.close();
    }
    private static void skrivStjerner(int tall, char tegn, int lineLength) {
        for (int i = 0; i < tall; i++) {
            System.out.print("\u001B[31m" + tegn+ "\u001B[0m");
            if(tall > 1 && (i + 1) % lineLength == 0) {
                System.out.println();
            }
        }
    }
}
