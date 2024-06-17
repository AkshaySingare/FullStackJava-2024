import java.util.*;

public class LeafYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float leaf;

        System.out.println("enter yers days");
        leaf = sc.nextFloat();

        String str = (leaf % 4 == 0 && leaf % 100!=0 || leaf % 400==0 )?"Its Leaf Year " : " Its Not Leaf Year ";
        System.out.println(str);
    }
}
