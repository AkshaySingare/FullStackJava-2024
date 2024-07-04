import java.util.*;

public class Sitexam{
    public static void main(String x[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total no. of Prasent Days ");
        int day = sc.nextInt();
        System.out.println("Enter Total no. of Abcent Days ");
         day = sc.nextInt();
        System.out.println("Enter percentages ");
        int per = sc.nextInt();

        if (per>=75) {
            System.out.println("you are able to sit exam ");
            }
            else{
                System.out.println("You are not able to Sit in exam ");
            }
    }
}