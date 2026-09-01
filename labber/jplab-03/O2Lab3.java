import java.util.Scanner;

public class O2Lab3 {
    public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in); 
       String red = "\u001B[31m";
       String green = "\u001B[32m";
       String reset = "\u001B[0m";
       for (int i = 0; i < 10; i++) {
       System.out.print(green + "Skriv inn en poengsum av "+ (i + 1) + " student: " + reset);
         int karakter = scanner.nextInt();
         while (karakter < 0 || karakter > 100) {

        System.out.println(red + "Ugyldig poengsum. Prøv igjen.\n Skriv inn poengsum på nytt!\n" + reset);
        System.out.print(green + "Skriv inn en poengsum av "+ (i + 1) + " student: " + reset);
        karakter = scanner.nextInt();
    }
         System.out.println("Karakteren er: " + poengsum(karakter));
       }
         System.out.println();

       scanner.close();
    }
    private static String poengsum(int karakter) {
        if (karakter >= 0 && karakter <= 39) {
            return "F";
        } else if (karakter > 39 && karakter <= 49) {
            return "E";
        } else if (karakter > 49 && karakter <= 59) {
            return "D";
        }else if (karakter > 59 && karakter <= 70) {
            return "C";
        } else if (karakter > 70 && karakter <= 89) {
            return "B";
        } else if (karakter > 89 && karakter <= 100) {
            return "A";
        }else {
            return "Ugyldig poengsum";
        }
    }
}
