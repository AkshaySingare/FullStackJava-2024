#include<stdio.h>

//  program that uses a switch statement to print the name of the month corresponding to a 
int main(){
	int ch;
	printf("enter number to find month ");
	scanf("%d",&ch);
	switch(ch){
		case 1:
			printf("January");
			break;
		case 2:
			printf("February"); 
			break;
			case 3:
			printf("March");
			break;
				case 4:
			printf("April");
			break;
				case 5:
			printf("May");
			break;
				case 6:
			printf("June");
			break;
				case 7:
			printf("July");
			break;
				case 8:
			printf("August");
			break;
				case 9:
			printf("September");
			break;
				case 10:
			printf("October");
			break;
				case 11:
			printf("November");
			break;
				case 12:
			printf("December");
			break;
	} 
}
