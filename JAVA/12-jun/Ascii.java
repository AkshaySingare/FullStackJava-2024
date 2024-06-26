import java.util.Scanner;

public class Ascii{
public static void main(String x[]){

	char ch;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Eneter Charecter");
      ch = sc.next().charAt(0);

	int as = ch;
	System.out.println("The Ascii Value is " +as);
}
}