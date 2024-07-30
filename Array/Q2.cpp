//    Write a c program to calculate sum of array is size 5.

#include<stdio.h>

int main(){
int a[5],sum=0;
printf("Enter Array Values ");
for(int i=0;i<5;i++){
	scanf("%d",&a[i]);
}
for(int i=0;i<5;i++){
	 sum=sum+a[i];
}
printf("sum of arry  values is %d",sum);
return 0;
}