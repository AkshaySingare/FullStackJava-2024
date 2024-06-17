import java.util.*;
import java.util.Scanner;

public class NeonNum {
    public static void main(String x[]){
        int num,sqr,sum=0,res;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number ");
        num = sc.nextInt();
        sqr = num*num;
        System.out.println("Squre is "+sqr);

        res = sqr%10;
        sum = res+sum;
        res = sqr/10;
        res = res%10;
        sum = res+sum;
        String str = sum==num ? "Its a Neon Numbr" : "Its not Neon Number";
        System.out.println(str);


    }
}
