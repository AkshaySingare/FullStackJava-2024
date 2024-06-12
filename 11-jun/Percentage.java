import java.util.Scanner;

public class Percentage{
public static void main(String x[]){

int sub1,sub2,sub3,sub4,sub5;

Scanner sc = new Scanner(System.in);

System.out.println("Enter 1st Subject Marks");
sub1 = sc.nextInt();

System.out.println("Enter 2nd Subject Marks");
sub2 = sc.nextInt();

System.out.println("Enter 3rd Subject Marks");
sub3 = sc.nextInt();

System.out.println("Enter 4th Subject Marks");
sub4 = sc.nextInt();

System.out.println("Enter 5th Marks");
sub5 = sc.nextInt();

float total = sub1+sub2+sub3+sub4+sub5;
System.out.println("Total marks is " +total);

float per = (total/500)*100;
System.out.println("Percentage is " +per);

}
}