import java.util.*;

public class CheckNum {
    public static void main(String x[]){

        int no;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number ");
        no = sc.nextInt();

        String str = no > 0 ? "number is positive " : no < 0 ? "number is negative " : "Its zero ";
        System.out.println(str);
    }
}
