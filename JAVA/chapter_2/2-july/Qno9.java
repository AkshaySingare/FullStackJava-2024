// Write a program to determine Working efficiency of employee
import java.util.*;
public class Qno9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time to complete Work");
        int value = sc.nextInt();
        if (value>=2 && value<3) {
            System.out.println(" Highly efficiency Level ");   
        }
        else if(value>=3 && value<4){
            System.out.println("Orderd to Improve Speed ");
        }
        else if(value>=4 && value<=5){
            System.out.println("Give Training to Improve Speed ");
        }
        else{
            System.out.println("Employee should leave the company ");
        }
    }
}