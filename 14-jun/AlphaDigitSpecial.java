import java.util.*;

public class AlphaDigitSpecial{
public static void main(String x[]){

	Scanner sc = new Scanner(System.in);
	char ch;
	
	System.out.println("Enetr any charter number specialchareter"); 
	ch = sc.next().charAt(0);	

	String str = (ch>='a' && ch<='z' || ch>='A' && ch<='Z') ? "its Charecter" :(ch>= '0' && ch<= '9' ) ? "Its Digit " : "Its Special Chareter";
	System.out.println(str);

}

}