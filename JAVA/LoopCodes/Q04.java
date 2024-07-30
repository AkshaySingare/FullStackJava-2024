/*              1
 *             232
 *            34543
 *           4567654
 *          567898765
 */
public class Q04 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++) {
            int count=i;
            for (int j = 1; j <= 9; j++) {
               
                if (j >= 6 - i && j <= 4 + i) {
                   
                    System.out.print(count);
                  if(j<5){
                   
                    count++;
                    
                   }
                   else{
                    count--;
                    
                   }
                 
                } else {
                    System.out.print(" ");
                    
                }
              
            }
            System.out.println();
        }
    }

}
