/*      1 2 3 4 5
 *      2     5
 *      3   5
 *      4 5
 *      5
 *         
 */

public class Q06 {
    public static void main(String[] args) {
        int count;
	
        for (int i = 1; i <= 5; i++) {
	count=i;
            for (int j = 1; j <= 5; j++) {

                if (i==1 || j==1 ||j==6-i ) {
                    System.out.print(("\t"+count++));

                } else {
                    System.out.print("\t ");
		count++;
                }

            }
            System.out.println();
        }

    }
}
