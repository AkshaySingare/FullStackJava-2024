import java.util.*;

public class checkAlphabet{
  public static void main(String x[]){

	char ch;
	Scanner sc = new Scanner (System.in);

	System.out.println("Enter Charecter ");
	ch = sc.nextLine().charAt(0);

     int no=ch;
	if(no>=65 && no<=90) {
	System.out.println("Its a Capital Alphabet" +ch + "It's Ascci Value is " +no);		}

	if(no>=97 && no<=122) {
	System.out.println("Its a Small Alphabet "  +ch + "It's Ascci Value is " +no);	}
 
	else {
		System.out.println("Its not a charecter "); }

}

}