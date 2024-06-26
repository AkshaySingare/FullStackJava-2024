#include<stdio.h>

int main()
{
	
		int a;
		float b;
		char ch;
		
		printf("enter values");
		scanf("%d%f", &a,&b);
		printf("enter char");
		_flushall();
		scanf("%c",&ch);
		printf("values A=%d B=%f CH=%c",a,b,ch);
		
}
