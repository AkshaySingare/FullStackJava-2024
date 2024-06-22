public class Demo{
  public static void main(String  x[]){
	
	int a = 5;
	String str = (a % 2 == 1 && a - 4 == 1) ? " the Value of a % 2 is same as a - 4 :- true " : " the Value of a % 2 is same as a - 4 :-  False " ;
	 System.out.println(str);

	a = 3;
	 str = (a * 3 * 3 > (a + 10)*3 ) ? " a * 3 * 3 is greter than (a+10)*3 :- True " : "  a * 3 * 3 is greter than (a+10)*3 :- False "; 
	System.out.println(str);


 	a = 7;
	 str = (a * 7 *3 > a * a+7 * a+3) ? " a*7*3 is greter than (a*a+7*a+3) :- True" : " a*7*3 is greter than (a*a+7*a+3) :- False";
	System.out.println(str);
	
}
}