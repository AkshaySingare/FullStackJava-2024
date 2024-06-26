import  java.util.*;

public class Alphabet{
public static void main(String x[]){

	char ch;	
	Scanner sc = new Scanner (System.in);

	System.out.println("Enter Alphabet ");
	ch = sc.nextLine().charAt(0);
	
	if ( ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		{ System.out.println("Its Vowel");  }
else {
	System.out.println("Its Consonant ");
}

	
	
}
}