import java.util.*;

public class Palindrome{
 public static void main(String x[]){

	Scanner sc = new Scanner (System.in);
	int num, rev=0, rem=0;  //num=121
	

	System.out.println("Enetr Number to check Palindrome Number ");
	num = sc.nextInt();

      int temp = num;  

	rem = num % 10;  //121 % 10 = 1
      rev = rev * 10 + rem;  //0 +1 =1  rev ==1 

	num = num / 10;   //121/10 ==12
	rem = num % 10;    //12%10 ==2
	rev = rev * 10 + rem;    //12

	num = num / 10; //1
	rem = num % 10; //1
	rev = rev * 10 + rem; //

	System.out.println(rev);

	String str = temp == rev ? " Its Palidrome Number " : "Its not Palidrome Number ";
	System.out.println(str);
}
}