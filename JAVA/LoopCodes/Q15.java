/*	     	#
	       * *
	      # # #
	     * * * *
	    # # # # #		*/

public class Q15 {

	public static void main(String[] args) {
		boolean flag=true;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=9;j++){
				if (j>=6-i && j<=4+i && flag) {
					if (j%2==1) {
						System.out.print("#");
					}
					else{
						System.out.print("*");
					}
					flag=false;
				}
				else{
					System.out.print(" ");
					flag=true; 
				}
			}
			System.out.println();
		}
	}
}