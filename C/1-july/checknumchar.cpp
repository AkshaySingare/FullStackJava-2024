//C program to input any character and check whether it is alphabet, digit or special character.

#include<stdio.h>

int main(){
	char ch;
	printf("Enter any Input ");
	scanf("%c",&ch);
	int i = ch;
//	printf("%d",i);
	(i>=65 && i<=90 || i>=97 && i<=122) ? printf("This is Charecter ") : 
	   (i>=48 && i<=57) ? printf(" Its a Integer ") : printf(" Its a Special Charecter "); 
}
