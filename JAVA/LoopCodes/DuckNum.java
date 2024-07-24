//  Check Number Is Duck Number or Not.

import java.util.*;

public class DuckNum {
	public static void main(String x[]) {

		Scanner sc = new Scanner(System.in); 
		boolean flag = false;
		System.out.println("Enter a Number ");
		int num = sc.nextInt();
		int sum = 0,rem = 0;
		while (num != 0) {
			rem = num % 10;
			num = num / 10;
			if (rem == 0) {
				flag = true;
			}
		}
		if (flag == true) {
			System.out.println("Its a Duck Number ");

		} else {
			System.out.println("Its Not  a Duck Number ");
			flag = false;
		}
	}
}
