import java.util.Scanner;
public class Swap{
public static void main(String x[]){

int a,b,swap;
Scanner sc = new Scanner(System.in);

System.out.println("Enter A Value");
a = sc.nextInt();

System.out.println("Enter B value");
b = sc.nextInt();

swap = a;
a = b;
b = swap;

System.out.println("The Value of A is " +a);
System.out.println("The Value of B is " +b);
System.out.println("The Swapping Value is " +swap);
}
}