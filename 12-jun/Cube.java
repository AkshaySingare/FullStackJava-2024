import java.util.Scanner;

public class Cube{
public static void main(String x[]){

	float a,b,c;
	Scanner sc = new Scanner(System.in);

	System.out.println("Eneter Number ");
	a = sc.nextFloat();

	b = a*a*a;
	System.out.println("The Cube is " +b);

	c = (a*a)*(a*a);
	System.out.println("The Fouth Value is " +c);

}
}