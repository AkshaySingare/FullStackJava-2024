import java.util.*;

public class ProfitLoss{
	public static void main(String x[]){


		Scanner sc = new Scanner (System.in);
		int sell,cost;

		System.out.println("Enter selling price" );
		sell = sc.nextInt();

		System.out.println("Enter cost price " );
		cost = sc.nextInt();

		if(sell > cost)  { 
		System.out.println("Profit is ");  }

		else {
			System.out.println("Loss ");
 			
              }
}

}