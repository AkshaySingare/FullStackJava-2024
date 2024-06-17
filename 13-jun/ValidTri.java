import java.util.*;

public class ValidTri
{
	public static void main(String x[])
	{

		Scanner sc = new Scanner(System.in);
		float a1,a2,a3;
	
		System.out.println("enter angle one");
		a1 = sc.nextFloat();

		System.out.println("enter Second angle");
		a2 = sc.nextFloat();

		System.out.println("enter third angle");
		a3 = sc.nextFloat();

	 	String msg =  ((a1 > (a2+a3) )) || ((a2 > (a1+a3) )) || ((a3 > (a2+a1) )) ? "  Valid" :" Not Valid" ;  
	

	System.out.println(msg);
		
	}

}
	