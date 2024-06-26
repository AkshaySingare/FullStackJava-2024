#include<stdio.h>

int main(){
	
		float cen,meter,km;
		
		printf("enter Values centemeter");
		scanf("%f",&cen);
		
		meter = cen/100;
		km = meter/1000;		
		printf("Meter is %f ",meter);
		printf("KiloMeter is %f ",km);
		
}
