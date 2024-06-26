import java.util.*;

public class Height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hei;
        System.out.println("Enter Height");
        hei = sc.nextInt();

        String str = hei<150 ? "The Person is Dwarf" : hei>=150 && hei<165 ? "Person is average heighted" : hei>=165 && hei<=195 ? "The person is Taller" : "Height is taller than 195";
        System.out.println(str);
    }
}
