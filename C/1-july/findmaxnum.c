#include<stdio.h>


int main(){
	int a,b;

	printf("enter Value A and B ");
	scanf("%d%d",&a,&b);
	(a==b) ? printf("Both are equls") : (a>b)? printf("A is greter ") : printf("B is greter ");
	return 0;
}
