 import java.util.*;
 
public class GrossSalary
{
 public static void main(String x[]){

	String GS;
	float BS;

	Scanner Sc = new Scanner(System.in);

	System.out.println("Enter Salary");
	BS = Sc.nextFloat();

	GS = BS<=10000 ? "Gross Salary="+(BS+(BS*0.20)+(BS*0.80)) : BS <=20000 ? "Gross Salary " +(BS+(BS*0.25)+(BS*0.90)) : BS > 20000 ? "Gross Salary " +(BS+(BS*30)+(BS*95)) : "Final Salary ";

	System.out.println(GS);



}

}

