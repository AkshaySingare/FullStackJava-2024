//  Check employees are  eligiable for Insurance or Not 

import java.util.*;

public class Qno7 {
    public static void main(String x[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age ");
        int age = sc.nextInt();
        System.out.println("Enter Gender \n 1.male \n 2.female");
        int gender = sc.nextInt();
        System.out.println("Enter Married Status \n 1.Married 2.unmarried");
        int status = sc.nextInt();

        if (status == 1) {
            System.out.println("Eligiable");
        } else if (status == 2 && gender == 1 && age >= 30) {
            System.out.println("Eligiable ");
        } else if (status == 2 && gender == 2 && age >= 25) {
            System.out.println("Eligiable ");
        } else {
            System.out.println("Yor are not eligiable");
        }
    }

}
