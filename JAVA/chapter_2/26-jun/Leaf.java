import java.util.*;

public class Leaf{
	public static void main(String x[]){
	
	int year;
	Scanner sc = new Scanner (System.in);

	System.out.println("Enter Year ");
	year = sc.nextInt();

	if ((year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0))
		{ System.out.println("Its Leaf Year ");  }
	else {
		System.out.println("Its Not Leaf Year ");
		}
}

}