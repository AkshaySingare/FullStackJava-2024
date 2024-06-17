import java.util.*;

public class SequenceDigit{
public static void main(String x[]){

	Scanner sc =new Scanner(System.in);
	int seq,rem=0,rev=0,no;
	
	System.out.println("Eneter  number");
	no = sc.nextInt();//123

	rem = no%10;  
	rev = rev*10+rem; 

	no = no / 10; 
	rem = no % 10; 
	rev = rev*10+rem;

	no = no / 10;
	rem = no % 10; 
	rev = rev*10+rem;

	// System.out.println("Revers is " +rev);						

	seq = rev%10; 
	System.out.println(seq);
      rev = rev/10; 
      
      seq = rev%10;
	System.out.println(seq);
 
	rev = rev/10;

	seq = rev%10;
	System.out.println(seq);
}
}