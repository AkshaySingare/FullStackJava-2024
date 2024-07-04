import java.util.*;

public class AdmisionApp{
  public static void main(String x[]){

	int  phy,che,math;
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Chemistry Marks ");
	che = sc.nextInt();

	System.out.println("Enter Physics Marks ");
	phy = sc.nextInt();
	
	System.out.println("Enter Math Marks ");
	math = sc.nextInt();

	if (che >= 50 && phy >= 55 && math >= 65){
		 

	int total = che + phy + math;
	  System.out.println(" total is "+total);
	
	    if(total >= 190 || (total-che) >= 140){
		    System.out.println(" You are Eligiable for Addmision "); 	 }

	    else{
		    System.out.println("You are not Eligiable for Addmision");	}
	} 
	else{
		System.out.println(" You are not Eligiable for Addmision ");
}
}
}