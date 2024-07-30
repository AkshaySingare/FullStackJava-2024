/*
 *  1 
 *  1 2 1
 *  1 2 3 2 1
 *  1 2 3 4 3 2 1
 *  1 2 3 4 5 4 3 2 1
 */

public class Q07 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
	int no=1;
           for(int j=1; j<=(i*2-1);j++){
		
		System.out.print(no);

		if(j<i){
		no++;
		}else{
		no--;
		}
	}
            System.out.println();
        }
    }
}
