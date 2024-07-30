 //  program that takes a day of the week from the user (1-7) and prints a corresponding message
 
 #include<stdio.h>
 
 int main(){
 	int ch;
 	printf("Enter Number 1 - 7 ");
 	scanf("%d",&ch);
 	switch(ch){
 		case 1:
 			printf("Sunday");
 			break;
 		
 		case 2:
 			printf("Monday");
 			break;
		case 3:
 			printf("Thiusday");
 			break;
 		case 4:
 			printf("Wensday");
 			break;
 		case 5:
 			printf("Thusday");
 			break;
 		case 6:
 	     	printf("Friday");
 			break;
 		case 7:
 			printf("Saturday");
 			break;
	 }
 }
