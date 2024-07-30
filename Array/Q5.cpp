//  Write a c  program to find positive and negative number in array.

#include<stdio.h>
int main(){
	int a[5];
	printf("Enter Positive and Negative Number ");
	for(int i=0;i<5;i++){
		scanf("%d",&a[i]);	
		}
		
		printf("Negative Number\t");
		for(int i=0;i<5;i++){
			if(a[i]<0){
			printf("%d\t",a[i]);
			}
		}
		printf("\nPositive Number\t");
		for(int i=0;i<5;i++){
			if(a[i]>0){
				printf("%d\t",a[i]);
			}
		}
}