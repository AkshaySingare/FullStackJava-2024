import java.util.*;

public class Triangle{

	public static void main(String x[]){

	int a1, a2, a3;
	Scanner sc = new Scanner (System.in);

	System.out.println("Enter angle 1");
	a1 = sc.nextInt();

	System.out.println("Enter angle 2");
	a2 = sc.nextInt();

	System.out.println("Enter angle 3 ");
	a3 = sc.nextInt();

 if (a1+a2 > a3 | a2 + a3 > a3 | a1+a3 > a2) {
	 System.out.println("Trianle is valid ");
		}
else {
	System.out.println("Trianle is not valid");	}

}
}