//Write a c program to take input from array of size 5 and display it.

#include<stdio.h>

int main(){
	int a[5];
	printf("Enter Array Values ");
	for(int i=1;i<=5;i++){
		scanf("%d",&a[i]);
	}
	for( int i=1;i<=5;i++){
		printf("a[%d]=%d\n",i,a[i]);
	}
}