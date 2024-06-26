public class NoReverse{

	public static void main(String args [])
	{
			int rem=0,rev=0;
	
			int no = 1234;
			
			 rem = no%10; // 123 rem  = 4

			 rev = rev * 10 + rem;// rev = 4

			 no = no / 10; // 123 remove 4
				
			 rem = no%10;// 12 rem 3

			 rev = rev*10 +  rem;//43

			 no = no / 10; // 12 remove 3

			 rem = no%10;//1 rem 2

			 rev = rev*10+rem;//432

			 no = no/10;// 1 remove 2
			
			rem = no%10;// rem 1
			rev =  rev*10+rem;// 4321
			
			System.out.println("Reverse :"+no);
		
			

			
	}

}