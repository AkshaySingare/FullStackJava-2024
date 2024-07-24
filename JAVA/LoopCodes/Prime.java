//Check Prime Number or Not 

import java.util.*;

public class Prime {
  public static void main(String x[]) {

    Scanner sc = new Scanner(System.in);
    int temp = 0, num;
    System.out.println("Enter Number to find Prime or Not ");
    num = sc.nextInt();

    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        temp = 1;
        break;
      }
    }
    if (temp == 0) {
      System.out.println("This is prime Number ");
    } else {
      System.out.println("Its Not prime Number ");
      temp = 0;
    }
  }
}