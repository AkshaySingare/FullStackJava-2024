import java.util.Scanner;

import java.util.*;

public class UpperLower {
    public static void main(String[] args) {
        char ch;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Alphabet");
        ch = sc.next().charAt(0);

        String str = (ch >='A' && ch <='Z') ? "Its a Upper Case Alphabets " : (ch>='a' && ch<='z') ? "Its a Lower Case " : "its not alphabet";
        System.out.println(str);
    }
}
