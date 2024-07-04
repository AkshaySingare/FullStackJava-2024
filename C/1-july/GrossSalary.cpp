/*  program to input basic salary of an employee and calculate 
     its Gross salary according to following.
    	Basic Salary <= 10000 : HRA = 20%,  DA =  80%
		Basic Salary <= 20000 : HRA = 25%, DA =  90%
		Basic Salary > 20000 : HRA = 30%,  DA =  95%  */
    
#include<stdio.h>
int main(){
	
	float  BS,GS;
	printf("Enter Basic Salary ");
	scanf("%f",&BS);
	

	GS = (BS<=10000) ? printf("Gross Salary %.2f",BS+(BS*0.2)+(BS*0.8)) : 
		  (BS<=20000) ? printf("Gross Salary %.2f",BS+(BS*0.25)+(BS*0.9)) :
		  	(BS>20000) ? printf("Gross Salary %.2f",BS+(BS*0.3)+(BS*0.95)) : printf("%.2f",GS);
}
