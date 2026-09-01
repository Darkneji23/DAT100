public class B2Lab2 {

    public static void main(String[] args) {

        int a = 5;
        String s = "Hei";
        double b = 4.2;

        System.out.println(a); // 5
        System.out.println(s); // Hei
        System.out.println(b); // 4.2
        System.out.println(s + a + 3); // Hei53
        System.out.println(3 + a + s); // 8Hei

        // Cannot subtract strings
        // System.out.println(s - "H");

        System.out.println(7 / a); //1
        System.out.println(13 - 2 * 5); //3

        int c = 1578;

        // int does not have a length() method
        // System.out.println(c.length());
        System.out.println(c);

        System.out.println(s.length()); //3
    }
}