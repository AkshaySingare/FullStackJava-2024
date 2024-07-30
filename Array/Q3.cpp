// Write a c program to find maximum and minimum number in array.

#include<stdio.h>

int main(){
	int min,max,a[5];
	printf("Enter Array Values ");
	for(int i=0;i<5;i++){
		scanf("%d",&a[i]);
	}
	max=a[0];
	min=a[0];
	for(int i=0;i<5;i++){
		if(min>a[i]){
			min=a[i];
		}
		else if(max<a[i]){
			max=a[i];
		}
		
	}
	printf("Max Values is %d\n",max);
	printf("Minimum Values is %d\n",min);
	
}