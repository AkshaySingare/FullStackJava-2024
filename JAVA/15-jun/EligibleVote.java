import java.util.*;

public class EligibleVote{
public static void main(String x[]){

	Scanner sc = new Scanner(System.in);
	int age;

	System.out.println(" Enetr Age");
	age = sc.nextInt();
	
	String str = age >= 18 ? "Eligible for Vote " : " Not Eligible For Vote ";
	System.out.println(str);
}
}