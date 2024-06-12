import java.util.Scanner;

public class Hour{
public static void main(String x[]){

   int S;
   Scanner sc = new Scanner(System.in);

   System.out.println("enter Seconds");
   S = sc.nextInt();
	
   float M= S/60;  
   System.out.println("Minuts is " +M);
   
   float H=M/60;
   System.out.println("The hours is " +H);

}
}