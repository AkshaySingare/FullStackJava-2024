import java.util.*;

public class FindAlphabet{
public static void main(String x[]){

	Scanner sc = new Scanner(System.in);
	char ch;

	System.out.println("Enter Charecter");
	ch = sc.next().charAt(0);

	String str = (ch=='a' || ch=='e' || ch=='o' || ch=='i' || ch=='u' || ch=='A' || ch=='E' || ch=='O' || ch=='I' || ch=='U' ) ? "Its Vowel" : "its Consonants";
	System.out.println(str); 
}
}