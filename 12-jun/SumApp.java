import java.util.*;

public class SumApp{
public static void main(String x[]){

Scanner sc = new Scanner(System.in);
int no,res=0,rem=0;

System.out.println("Enter 3 digit Number ");
no = sc.nextInt();

rem = no % 10;
res = res + rem;

rem = no / 10;
rem = rem % 10;
res = rem + res;

rem = no / 10;
rem = no % 10;
res = rem + res;

System.out.println("The sum is " +res);
}
}