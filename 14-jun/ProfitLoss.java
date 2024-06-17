import java.util.*;

public class ProfitLoss {
    public static void main(String x[]){

        int sp,cp;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Selling Prise ");
        sp = sc.nextInt();

        System.out.println("Enter Cost Prise");
        cp = sc.nextInt();

        String str = sp==cp ? "not Profit and not Loss " : sp>cp ? "Profit " : "Loss ";
        System.out.println(str);
    }
    
}
