import java.util.Scanner;
import java.lang.Math;

public class O1Lab3 {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Write how much you make per year: ");
        int salary = scanner.nextInt();
        double trinnskatt = 0.0;
        if (salary > 226100){
            trinnskatt += (Math.min(salary, 318300) - 226100) * 0.017;
        } 
        if (salary > 318300){
            trinnskatt += (Math.min(salary, 725050) - 318300) * 0.04;
        } 
        if (salary > 725050){
           trinnskatt += (Math.min(salary, 980100) - 725050) * 0.137;
        } 
        if (salary > 980100){
            trinnskatt += (Math.min(salary, 1467200) - 980100) * 0.168;
        } 
        if (salary > 1467200){
            trinnskatt += (salary - 1467200) * 0.178;
        }
        System.out.print("Person will need to pay " + trinnskatt + " kroner back");
        scanner.close();
    }
}
