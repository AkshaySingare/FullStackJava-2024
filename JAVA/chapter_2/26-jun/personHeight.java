//program to accept the height of a person in centimeters and categorize the person according to their height.

import java.util.*;

public class personHeight {
    public static void main(String x[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Person Height ");
        int height = sc.nextInt();

        if (height < 150) {
            System.out.println("Dwaft");
        } else if (height >= 150 && height < 165) {
            System.out.println("Average");
        } else if (height >= 165 && height <= 195) {
            System.out.println("Taller");
        }
        else{
            System.out.println("much greter");
        }
    }
}
