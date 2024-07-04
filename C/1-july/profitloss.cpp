// program to input cost price and selling price of a product and check profit or loss.
#include<stdio.h>

int main(){
	int sp,cp;
	printf("Enter Selling Price ");
	scanf("%d",&sp);
	printf("Enter Cost Price ");
	scanf("%d",&cp);
	(sp>cp) ? printf("Profit ") : printf(" Loss ");	
}
