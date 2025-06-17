import java.util.Scanner;
class loops{
public static void main(String[] args){
int i;
Scanner s=new Scanner(System.in);
/* 1). 
for(i=0;i<10;i++){
System.out.println("Bright IT Career");
}
*/
/* 2).
i=1;
while(i<=20){
System.out.println(i);
i++;
}*/
/* 3).
System.out.println("enter a:");
int a=s.nextInt();
System.out.println("enter b:");
int b=s.nextInt();
if(a==b){
System.out.println("Both are equal");
}
else if(a!=b){
System.out.println("Both are not equal");
}*/

/* 4).
System.out.println("enter n:");
int n=s.nextInt();
if(n%2==0){
System.out.println(n+"  is Even");
}
else{
System.out.println(n+" is Odd");
}*/
/* 5).
System.out.println("Enter a:");
int a=s.nextInt();
System.out.println("Enter b:");
int b=s.nextInt();
System.out.println("Enter c:");
int c=s.nextInt();
if((a>b)&&(a>c)){
System.out.println("a is large");
}
else if(b>c){
System.out.println("b is large");
}
else{
System.out.println("c is large");
}*/
/* 6). 
i=10;
while(i<=100){
System.out.println(i);
i++;
}*/
/* 7).
i=1;
do{
System.out.println(i);
i++;
}while(i<=10);*/
/* 8).
int sum=0,rem;
System.out.println("enter n:");
int n=s.nextInt();
int A = n;
while(n>0){
rem = n % 10;
sum+=Math.pow(rem,3);
n/=10;
}
if(A==sum){
System.out.println("Given number is Armstrong number");
}
else{
System.out.println("Given number is not  Armstrong number");
}*/
/* 10).
int rem=0,rev=0;
System.out.println("enter n:");
int n=s.nextInt();
int p=n;
while(n>0){
rem = n % 10;
rev = rev*10+rem;
n=n/10;
}
if(p==rev){
System.out.println("Given number palindrome number ");
 }
else{
System.out.println("Given number not palindrome number ");
 }
System.out.println(rev);*/

/* 11).
System.out.println("enter n:");
int n=s.nextInt();
int temp= n%2;
switch(temp){
case 0: System.out.println(n+" is even");
break;
case 1: System.out.println(n+" is odd");
break;
}*/
/* 12).
System.out.println("enter g:");
String g=s.next();
switch(g){
case "M":
System.out.println("Male");
break;
case "m":
System.out.println("Male");
break;
case "F":
System.out.println("Female");
break;
case "f":
System.out.println("FeMale");
break;
default:
System.out.println("Invalid");
}*/
/* 13).
int a=10,b=20,c=30;
if(a>b){
if(a>c){
System.out.println(a+" is large");
}}
else if(b>c){
System.out.println(b+" is large");
}
else{
System.out.println(c+" is large");
}*/



}
}