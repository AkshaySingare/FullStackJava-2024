#include<stdio.h>

int main(){
	int num;
	printf("Enter Number ");
	scanf("%d",&num);
	(num>0) ? printf(" Positive ") : (num==0) ? printf(" Zero ") : printf(" Negative ");
}
