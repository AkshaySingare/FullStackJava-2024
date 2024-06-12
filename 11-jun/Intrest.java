import java.util.Scanner;

public class Intrest{
public static void main(String x[]){

int P,r,n,t;
Scanner sc = new Scanner(System.in);

System.out.println("Enter initial principal balance");
P = sc.nextInt();

System.out.println("Enter interest rate");
r = sc.nextInt();

System.out.println("Enter numer of time interest applied per time period");
n = sc.nextInt();

System.out.println("Enter number of time periods elapsed");
t = sc.nextInt();

float A = P*(1+(r/n))*(n*t);
System.out.println("Final amount is " +A);
}
}