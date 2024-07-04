#include<stdio.h>

int main(){
	int a1,a2,a3;
	printf("Enter angle_1, angle_2 and angle_3  ");
	scanf("%d%d%d",&a1,&a2,&a3);
	(a1==a2 && a2==a3) ? printf(" its Equilateral Triangle ") :
		(a1==a2 || a2==a3 || a1==a3) ? printf(" its Isoscale Triangle  ") : printf(" its Scalen Triangle ") ;	  
}
