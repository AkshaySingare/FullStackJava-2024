import java.util.Scanner;

public class Swap2 {
    public static void main(String x[]) {

        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A value");
        a = sc.nextInt();

        System.out.println("Enter B value");
        b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("The value of A is " + a);
        System.out.println("The value of B is " + b);

    }
}