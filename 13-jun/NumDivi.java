import java.util.Scanner;
public class NumDivi {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int no;

        System.out.println("Enter Any number ");
        no = sc.nextInt();

        String str = no%5==0 && no%11==0 ? "Number is Divided by both 5 and 11" : (no%5==0 ? "Num is divided by 5 but not 11" : 
                                (no%11==0 ? "num is Divided by 11 but not 5" : "Num cant divided by 11") );
                                System.out.println(str);

    }
}