import java.util.*;

public class MIninum{

  public static void main(String x[]){

	Scanner sc = new Scanner(System.in);
	int a,b,c;

	System.out.println("Enter A value");
	a = sc.nextInt();

	System.out.println("enter B value ");
	b = sc.nextInt();

	System.out.println("enter B value ");
	c = sc.nextInt();
	
	String str = a>b ? "A is greter " : b>c ? "B is greter " : "C is Smaller " ;
	System.out.println(str);			
}
}