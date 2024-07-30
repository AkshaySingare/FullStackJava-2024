/*		********1********
		*******2*2*******
		******3*3*3******
		*****4*4*4*4*****
		****5*5*5*5*5****
*/


public class Q010{
   public static void main(String x[]){
	boolean flag=true;

	for(int i=1;i<=5;i++){

	  for(int j=1;j<=17;j++){

	   if(j>=10-i && j<=8+i &&flag){
	      System.out.print(i);
	      flag=false;
	   }
	    else{
		System.out.print("*");
	        flag=true;
		}
	}
	  System.out.println();
      }
   }
}