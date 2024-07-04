#include<stdio.h>

int main(){
	int year;
	printf(" Enter Year ");
	scanf("%d",&year);
	( year % 4 == 0 && year % 100 != 0) ? printf(" its Leap Year ") :
		 printf(" Its not Leaf Year ");
	
}
