import java.util.*;

public class MaxNum{
public static void main(String x[]){

	Scanner sc = new Scanner(System.in);
	int a,b;
	
	System.out.println("Enter 1st Number");
	a = sc.nextInt();

	System.out.println("Enetr 2nd Number");
	b = sc.nextInt();

	String str = a>b? "A Number is Greter Than B " : "B Number is greter Than A";
	System.out.println(str);
}
}