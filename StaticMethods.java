/* 1).
class Methods{
static int a=10;
static int b=20;
int c=30;
int d=40;
{
System.out.println("Instance method");
System.out.println(c);
System.out.println(d);
}
static{
System.out.println("Static method");
System.out.println(a);
System.out.println(b);
}
public static void main(String[] jaya){
System.out.println("Main method");
Methods m=new Methods();
}
}*/
/* 2).
class Methods{
static int a=10;
static int b=20;
static{
System.out.println("Static method");
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
}
public static void main(String[] jaya){
System.out.println("Main method");
int c=30;
int d=40;
}
}*/
/* 3).
class Methods{
static int a=10;
static int b=20;
int c=30;
int d=40;
{
System.out.println("Instance method");
System.out.println(c);
System.out.println(d);
System.out.println(a);
System.out.println(b);
}
static{
System.out.println("Static method");
}
public static void main(String[] jaya){
System.out.println("Main method");
Methods m=new Methods();
}
}*/
/* 4).
class Methods{
static int a=10;
static int b=20;
int c=30;
int d=40;
void call(){
System.out.println("Instance method");
System.out.println(c);
System.out.println(d);
System.out.println(a);
System.out.println(b);
}
static{
System.out.println("Static method");
}
public static void main(String[] jaya){
System.out.println("Main method");
Methods m=new Methods();
m.call();
}
}*/
/* 5).
class Methods{
static int a=10;
static int b=20;
int c=30;
int d=40;
{
System.out.println("Instance method");
System.out.println(c);
System.out.println(d);
System.out.println(a);
System.out.println(b);
staticdisplay();
}
static void staticdisplay(){
System.out.println("Static method");
}
public static void main(String[] jaya){
System.out.println("Main method");
Methods m=new Methods();
}
}*/
/* 6).
class static{
static int a=10;
static int b=20;
int c=30;
int d=40;
public static void main(String[] jaya){
System.out.println("Main method");
Methods m=new Methods();
System.out.println(a);
System.out.println(b);
System.out.println(m.c);
System.out.println(m.d);
}
}*/
/* 7).
class Methods{
static int a=10;
static int b=20;
int c=30;
int d=40;
void Display(){
System.out.println("Instance method");
System.out.println(c);
System.out.println(d);
}
static void display(){
System.out.println("Static method");
System.out.println(a);
System.out.println(b);
}
public static void main(String[] jaya){
System.out.println("Main method");
Methods m=new Methods();
m.display();
m.Display();
}
}*/



