import java.util.*;

public class numbernote2{
	public static void main(String x[]) {

	int res=0,rem=0,num;
	Scanner sc = new Scanner (System.in);

	System.out.println("Eneter number");
	num = sc.nextInt();

	  if (num >=500)  {
		  res = num/500;
		  System.out.println("500------>"+res);
		  rem = num % 500;
		}

	  if (rem >= 100) {
            res = rem/100;
            System.out.println("100------> "+res);
            rem = rem%100;
        }

        if (rem >= 50) {
            res = rem/50;
            System.out.println("50------> "+res);
            rem = rem%50;
        }

        if (rem >= 20) {
            res = rem/20;   
            System.out.println("20------>"+res);
            rem = rem%20;   
        }
       if (rem >= 10)  {
            res = rem/10;
            System.out.println("10 ------->"+res);
            rem = res%10;
        }
        if (rem >= 5)  {
            res = rem/5; 
            System.out.println("5 -------> " +res);
            rem = rem%5; 
        }
        if (rem >= 2) {
            res = rem/2; 
            System.out.println("2 --------> "+res);
            rem = rem%2;        
        }
        if (rem >= 1){
            res = rem/1; 
            System.out.println("1 --------> "+res);
            rem = rem%1;
        }
}
}