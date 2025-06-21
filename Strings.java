class Strings{
public static void main(String[] ram){
//1
String s1="Jaya";
String s2=" ram";
String s4=new String("Thota");
//2
String s3=s1+s2;
System.out.println(s3+" "+s4);
//3
System.out.println(s3.length());
//4
System.out.println(s3.substring(0,4));
//5
System.out.println(s3.indexOf('y'));
//6
System.out.println(s1.equals(s2));
//7
System.out.println(s3.startsWith("Jaya"));
System.out.println(s3.endsWith("Jaya"));
System.out.println(s1.equalsIgnoreCase(s2));
//8
System.out.println(s2.trim());
//9
System.out.println(s3.replace('r','R'));
//10
String[] s=s3.split(" ");
for(String m:s){
System.out.println(m);
}
//11
int a=12;
System.out.println(String.valueOf(a));
//12
System.out.println(String.valueOf(a));
//13
System.out.println(s3.toUpperCase());
System.out.println(s3.toLowerCase());
//14
String s5="a+b";
System.out.println(s3.matches(s5));
}
}
