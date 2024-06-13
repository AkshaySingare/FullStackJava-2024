import java.util.*;

public class FindNum{
public static void main(String x[]){

Scanner sc = new Scanner(System.in);
int no;

System.out.println("enter any number ");
no = sc.nextInt();

String d = no%2==0 ? "Given Number is Even" : "Given Number is Odd";
System.out.println(d);
}
}