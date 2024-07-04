#include<stdio.h>

int main(){
	char ch;
	
	printf("Enter Charecter ");
	scanf("%c",&ch);
	 (ch == 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') ? printf(" Its a vowel ") : printf("Its a  consonant ");
	return 0;
}
