import java.util.*;

public class Divided{

	public static void main(String x[]){

		int num;
		Scanner sc = new Scanner(System.in);

	System.out.println("Eneter any Number");
	num = sc.nextInt();

	if(num%5==0 ){
		System.out.println("Num is Divide  by 5 ");	}

	if(num%11==0){
		System.out.println("Num is Divide  by 11");	}
	
	if(num%5==0 && num%11==0){
		System.out.println("Num is Divide  by 5 and 11");	}
}
}