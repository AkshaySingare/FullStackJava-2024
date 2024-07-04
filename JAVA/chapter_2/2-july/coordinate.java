import java.util.*;

public class coordinate{

  public static void main(String args[]){

	int x,y;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter X co-cordinate ");
	x=sc.nextInt();

	System.out.println("enter Y co-cordinate ");
	y=sc.nextInt();

	if (x >= 0 && y >= 0 ){
		System.out.println("1st Qundrete ");	}
	
	else if (x < 0 && y >= 0) {
		System.out.println(" 2rd Qundrete ");	}
	

	else if (x >= 0 && y < 0) {
		System.out.println(" 4th Qundrete ");	}
 	else{
		System.out.println(" 3rd Qundrete ");	}
	
}
}