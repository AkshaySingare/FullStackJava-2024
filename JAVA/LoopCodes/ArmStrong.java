//   Check Number Is Armstrong Number or Not

import java.util.*;

public class ArmStrong{
  public static void main(String x[]){

	Scanner sc = new Scanner(System.in);
	int num,rem=0;
	System.out.println("Enter Number ");
	num=sc.nextInt();
	int temp=num,sum=0;
	if(num!=0){
	  rem=num%10;
	  num=num/10;
	  rem=rem*rem*rem;
	  sum=sum+rem;
      }
if(temp==sum){
System.out.println("Sum is ")
}
}
}