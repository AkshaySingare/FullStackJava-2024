import java.util.*;

public class Tax{
  public static void main(String x[]){

	float cp;
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Price");
	cp = sc.nextInt();

	if (cp>100000)  {
		System.out.println("Cost Prise is "+(cp+cp*0.15));   }

	else if(cp>50000 && cp <= 100000){

		System.out.println("Cost prise is "+(cp+cp*0.10));	 }
    else {
		System.out.println("Cost Prise is "+(cp+cp*0.5));     }

}
}