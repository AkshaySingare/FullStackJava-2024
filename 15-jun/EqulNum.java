import java.util.*;

public class EqulNum{
public static void main(String x[]){

	Scanner sc = new Scanner(System.in);
	int a,b; 	
	
	System.out.println("Enter 1st num");
	a=sc.nextInt();

	System.out.println("Enter 2nd num ");
	b = sc.nextInt();

	String str = a==b ? "both variable are Equal " : " they are not equal ";
	System.out.println(str);
}
}
