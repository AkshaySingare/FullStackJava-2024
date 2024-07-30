//  Write a c program to find even and odd number in array.

#include<stdio.h>
int main(){
	int a[5];
	printf("Enter Values ");
	for(int i=0;i<5;i++){
		scanf("%d",&a[i]);
	}
	
	for(int i=0;i<5;i++){
	if(a[i]%2==0){
			printf("Even Number a[%d]=%d \n",i,a[i]);
		}
			else{
			printf("\t\t\t Odd Number a[%d]=%d\n",i,a[i]);
		}
	}
}