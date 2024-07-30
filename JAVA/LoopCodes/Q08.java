/*		A
		A B A
		A B C B A
		A B C D C B A
		A B C D E D C B A			*/

public class Q08{
  public static void main(String x[]){

	int i,j;
	

	for(i=1;i<=5;i++){
	  char ch='A';
	  for(j=1;j<=(i*2-1);j++){
		System.out.print(ch+" ");
		if(j<i){
		    ch++;   
		} else{
		  ch--;
		}

  	  }
	   System.out.println();
	}
   }
}
		