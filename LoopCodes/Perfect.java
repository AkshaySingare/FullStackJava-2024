//  Check Number Is Perfect Number or Not.

import java.util.*;

public class Perfect
{
  public static void main(String x[])
  {

	Scanner sc = new Scanner(System.in);

	boolean flag=false;

	System.out.println("Enter Number ");
	int num = sc.nextInt();

	int i=1,sum=0;
	while(i<num)
	{
		if(num%i==0)
		{
			sum = sum+i;
			System.out.println(" "+i );
		}

		i++;
	}
	if(sum==num){
		System.out.println("  Given Number is Perfect  ");
	}else{
		System.out.println("Given Number is Not Perfect");
	}
	

  }

}