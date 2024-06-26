import java.util.*;

public class Percent{
   public static void main(String x[]){


	Scanner sc = new Scanner(System.in);
	int sub1,sub2,sub3,sub4,sub5;
	float total,per;

	System.out.println("Enter 1st Subject Marks ");
	sub1 = sc.nextInt();

	System.out.println("Enter 2nd Subject Marks ");
	sub2 = sc.nextInt();

	System.out.println("Enter 3rd Subject Marks ");
	sub3 = sc.nextInt();
	
	System.out.println("Enter 4th Subject Marks ");
	sub4 = sc.nextInt();

	System.out.println("Enter 5th Subject Marks ");
	sub5 = sc.nextInt();

	total = sub1+sub2+sub3+sub4+sub5;
	per = (total/500)*100;

	String str = per>=90 ? "First" : per >= 80 ? "Second " : per >=70 ? "Third " : "Less than 70% ";
	System.out.println(str);
	
}

}