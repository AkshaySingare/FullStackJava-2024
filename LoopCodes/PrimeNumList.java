//  Print Prime Number 1 to 100

import java.util.*;

public class PrimeNumList {
    public static void main(String x[]) {
        int i, j, temp = 0;
        for (i = 1; i <= 100; i++) {
            for (j = 2; j < i; j++) {
                if(i%j==0){
                    temp=1;
                    break;
                }

            }
            if (temp==0) {
                System.out.println(i);
            }
            else{
                temp=0;
            }
        }
    }
}
