/* 	3
	4 4
	5 5 5
	6 6 6 6
	5 5 5
	4 4
	3		*/

public class Q014{
  public static void main(String x[]){
	for(int i=3; i<=6; i++){
	for(int j=3; j<=i; j++){
	System.out.print(i);
	}
	  System.out.println();
	}
	for(int i=5 ;i>=3;i--){
	for(int j=3 ;j<=i;j++){
	System.out.print(i);
        }
	System.out.println();
    }
  }
}