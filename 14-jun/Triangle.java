import java.util.*;

public class Triangle {
    public static void main(String x[]){

        int a1,a2,a3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st angle");
        a1 = sc.nextInt();
        System.out.println("Enter 2nd angle");
        a2 = sc.nextInt();
        System.out.println("Enetr 3rd angle");
        a3 = sc.nextInt();

        String str =   ( a1==a2 && a2 == a3 ) ? "This is equilateral triangle" : (a1 == a2 || a2 == a3) ? "This is Isoscale Triangle " : "This is Scalene Triangle";
        System.out.println(str);
    }
}
