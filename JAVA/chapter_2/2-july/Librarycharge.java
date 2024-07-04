import java.util.*;
public class Librarycharge {
    public static void main(String x[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total no. of days library");
        int day = sc.nextInt();

        if (day<=5  && day>0) {
            System.out.println("Total Charges "+(day*2));
        }
        else if (day<11 && day>=6) {
            System.out.println("Total Charges "+((day-5)*3));
        }
        else if (day<15 && day>=11) {
            System.out.println("Total Charges "+((day-10)*4));
        }
        else{
            System.out.println("Total Charges "+((day-15)*5));
        }
    }   
}
