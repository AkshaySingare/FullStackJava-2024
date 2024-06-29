import java.util.*;

public class numbernotes {

    public static void main(String[] args) {
        int num,res=0,rem=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int amt = sc.nextInt();//1962

		int note500=0,note100=0,note50=0,note20=0,note10=0,note5=0,coin2=0,coin1=0;
        
       	 if (amt >= 500)  {
         	 	 note500 = amt/500;
			 amt = amt -  note500*500; 
        }
		if(amt>=100)
		{
			note100 = amt/100; 
			amt = amt - note100*100; 
		
		}
		if(amt>=50){
			
			note50 = amt/50; 
			amt = amt - note50*50;
		
		}
		if(amt>=20){
			
			note20 = amt/20;
			amt = amt - note20*20;
		
		}if(amt>=10){
		
			note10 = amt/10;
			amt = amt - note10*10;  
		}
		if(amt>=5){
			
			note5 = amt/5;
			amt = amt - note5*5;
		
		}
		if(amt>=2){
		
			coin2 = amt/2;
			amt = amt - coin2*2;
		
		}
		if(amt>=1){
			coin1 = amt/1;
			amt = amt - coin1*1;
		}
         
		System.out.println("500 ----->"+note500);
		System.out.println("100 ----->"+note100);
		System.out.println("50 ------>"+note50);
		System.out.println("20 ------>"+note20);
		System.out.println("10 ---=-->"+note10);
		System.out.println("5 ------->"+note5);
		System.out.println("2 coins ----->"+coin2);
		System.out.println("1 coins ----->" +coin1);

    }
}
