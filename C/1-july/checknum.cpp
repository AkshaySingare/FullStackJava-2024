// Check Number is positive , negative or zero

#include<stdio.h>
int main(){
	int num,num2,ch;
	printf("enter number ");
	scanf("%d",&num);
    printf("\n1-positive/negative\n2-odd/even\n3-max betweeen 2 numbers ");
	printf("\nenter choice");
	scanf("%d",&ch);
	switch(ch){
		case 1:
			if(num>=0){
				printf("Number is Positive");
				
			}
		   else	if(num<0){
			printf("Number is Negative ");
	     	}
	     	else{
	     		printf("Zero");
			 }
			 break;
			
	    case 2:
	    	if(num%2==0){
	    		printf("Even");
			}
			else{
				printf("Odd");
			}
	     break;
	     
	    case 3:
	    	printf("Enter num2");
	    	scanf("%d",&num2);
	    	if(num>num2){
	    		printf("Num is greter");
			}
		
		   else{
			printf("Num2 is greater ");
		}	
			break;
			default:
				printf("Enter valid out put ");
				break;
}
}
