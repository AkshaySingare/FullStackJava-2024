/* 	#
	**
	###
	****
	#####	 */
public class Q11 {
	public static void main(String x[]) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j <= i) {

					if (i % 2 == 1) {
						System.out.print("#");
					} else {
						System.out.print("*");

					}
				} else {

					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}