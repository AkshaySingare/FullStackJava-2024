import java.util.*;

public class Findmax3num{
public static void main(String x[]){

	Scanner sc = new Scanner(System.in);
	int a,b,c;
	
	System.out.println("Enter A Number");
	a = sc.nextInt();

	System.out.println("Enter B Number");
	b = sc.nextInt();

	System.out.println("Enter C Number ");
	c = sc.nextInt();

	String str =( a>b ) ? "A is greter " :( b > c ) ? "B is greter " : "C is greter ";
	System.out.println(str);
}
}