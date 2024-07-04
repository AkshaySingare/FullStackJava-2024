//  Accept the age, gender no.of days and display the wages according ...

import java.util.*;

public class Qno6 {
    public static void main(String x[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age ");
        int age = sc.nextInt();
        System.out.println("Enter gender for 1.male and 2.female");
        int gender = sc.nextInt();

        switch (gender) {
            case 1:
                if (18 >= age && age < 30) {
                    System.out.println("wlages accordingly is 700");
                } else if (30 >= age && age < 40) {
                    System.out.println("wlages accordingly is 800");
                } else if (40 >= age && age < 50) {
                    System.out.println("wlages accordingly is 900");
                } else if (50 >= age && age < 60) {
                    System.out.println("wlages accordingly is 1000");
                } else {
                    System.out.println("Should be retire from work and Task Rest ");
                }
                break;

            case 2:
                if (18 >= age && age < 30) {
                    System.out.println("wlages accordingly is 750");
                } else if (30 >= age && age < 40) {
                    System.out.println("wlages accordingly is 850");
                } else if (40 >= age && age < 50) {
                    System.out.println("wlages accordingly is 950");
                } else if (50 >= age && age < 60) {
                    System.out.println("wlages accordingly is 1000");
                } else {
                    System.out.println("Should be retire from work and Task Rest ");
                }
                break;

            default:
                System.out.println("Enter gendar male for 1 and fem1ale for 2 ");
                break;
        }

    }

}
