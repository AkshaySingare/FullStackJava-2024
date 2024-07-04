#include<stdio.h>

int main(){
	int a,b,c,ch;
	printf("Enter A value\n");
	scanf("%d",&a);
	printf("Enter B value\n");
	scanf("%d",&b);
	
	printf("enter choice 1.Addition \n	2.Subtraction \n 3.Multiplication \n 4.Division\n");
	scanf("%d",&ch);
	
	switch(ch){
		case 1:		
		   c= a+b;
			printf("Addition is %d",c);
			break;
			case 2:
			c= a-b;			
			printf("substrction is %d",c);
			break;
			case 3:	
			c= a*b;		
			printf("multiplaction is %d",c);
			break;
			case 4:	
			c= a/b;		
			printf("division is %d",c);
			break;
			default:
				printf("enter valid choice ");
				break ;
	}
}
