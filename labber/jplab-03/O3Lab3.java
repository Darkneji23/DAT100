import java.util.Scanner;
import java.math.BigInteger;
public class O3Lab3 {
    public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in); 
       String red = "\u001B[31m";
       String green = "\u001B[32m";
       String reset = "\u001B[0m";
       System.out.print(green + "Skriv inn en nummer av faktorial: " + reset);
            BigInteger faktorial = scanner.nextBigInteger();
            while (faktorial.compareTo(BigInteger.ZERO) <= 0) {
                System.out.println(red + "Ugyldig input. Faktorialen er kun definert for ikke-negative heltall. Prøv igjen." + reset);
                System.out.print(green + "Skriv inn en numer av faktorial: " + reset);
                faktorial = scanner.nextBigInteger();
            }
            System.out.println("Faktorialen av " + faktorial + " er: " + beregnFaktorial(faktorial));
            System.out.println();
       scanner.close();
    }
    private static BigInteger beregnFaktorial(BigInteger faktorial) {
         if (faktorial.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        } else {
            BigInteger resultat = BigInteger.ONE;
            for (BigInteger i = BigInteger.valueOf(2); i.compareTo(faktorial) <= 0; i = i.add(BigInteger.ONE)) {
                resultat = resultat.multiply(i);
            }
            return resultat;
        }
    }
}
