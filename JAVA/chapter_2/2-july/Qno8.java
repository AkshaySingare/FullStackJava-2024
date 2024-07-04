/*    steel company wants to check steel according to conditions and give greads
            1.Hardeness must be greater than 50
            2.carbon content must be less than 0.7
            3.Tensile Strenth must be greter than 5600            */

import java.util.*;
public class Qno8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hard,Tensile;
        System.out.println("Enter Hardness of steel");
        hard = sc.nextInt();
        System.out.println("Enter Carbon among 0 to 1 ");
        float carbon = sc.nextFloat();
        System.out.println("Enter Tensile ");
        Tensile = sc.nextInt();

        if (hard>50 && carbon<0.7 && Tensile>=5600) {
            System.out.println("Grade 10 ");
        }
       else if (hard>50 && carbon<0.7){
            System.out.println("Grade 9 ");
        }
       else if (carbon<0.7 && Tensile>=5600) {
            System.out.println("Grade 8 ");
    }
    else if (hard>50 && Tensile>=5600) {
        System.out.println("Grade 7");
    }
    else if (hard>50 || carbon<0.7 || Tensile>=5600) {
        System.out.println("Grade 6");
    }
    else{
        System.out.println("grade 5");
    }
}
}
