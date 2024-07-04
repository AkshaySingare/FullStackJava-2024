#include<stdio.h>
int main() {
int num;
printf("Enter Any Number ");
scanf("%d",&num);
(num%5==0) ? printf("Number is Divisiable by 5 ") : 
	(num%11==0) ? printf("Number is Divisiable by 11 ") : 
		(num%5==0 && num%11==0) ? printf("number Divisiable by Both 5 and 11 ") :
			 printf("number are not Divisiable");
		}
