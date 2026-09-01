import java.util.Scanner;

public class B3Lab2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "1234";

        System.out.print("Brukernavn: ");
        String brukernavn = in.nextLine();

        System.out.print("Passord: ");
        String passord = in.nextLine();

        if (brukernavn.equals(correctUsername) && passord.equals(correctPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Wrong username or password!");
        }

        in.close();
    }
}