// program to check whether a character is uppercase or lowercase alphabet.

#include<stdio.h>
 int main(){
    char ch;
    printf("Enter any charecter ");
    scanf("%c",&ch);
    int i = ch;
    (i>=65 && i<=90 ) ? printf("This is Upper Case Alphabet ") :
	    (i>=97 && i<=122) ? printf("This is Lower Case Alphabet ") : printf ("Its Not Charecter ");
 }
