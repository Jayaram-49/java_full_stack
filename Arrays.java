import java.util.Scanner;

/* 1).
class Arrays {
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.print("Enter the array size: ");
int n = s.nextInt();
int a[] = new int[n];
for (int i = 0; i < n; i++){
System.out.print("Enter the value for position "+(i + 1)+ ": ");
a[i] = s.nextInt();
}
System.out.println("The array elements are:");
int sum=0;
double avg;
for(int i = 0; i < n; i++){
System.out.println(a[i]);
sum+=a[i]; 
}
avg=sum/n;
System.out.println("the sum of elements of array is: "+sum);
System.out.println("the avg of array is: "+avg );
*/
/* 2).
class index{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int[] a={1,2,3,4,5};
int index=-1;
System.out.println("enter element:");
int se=s.nextInt();
for(int i=0;i<a.length;i++){
if(a[i]==se){
index=i;
}}
if(index==-1){
System.out.println("Element not found!");
}
else{
System.out.println("Element found! at the index is:"+index);
}*/
/* 3).
class specificval{
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
specificval sv=new specificval();
int [] a={1,2,3,4,5};
System.out.println("enter element:");
int se=s.nextInt();
sv.Search(a,se);
}
public void Search(int[] a,int se){
int index=-1;
for(int i=0;i<a.length;i++){
if(a[i]==se){
index=i;
}
}
if(index==-1){
System.out.println("Element not found!");
}
else{
System.out.println("Element found!");
}
}*/

/* 4).
class RemoveVal{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
RemoveVal re=new RemoveVal();
int[] a={1,2,3,4,5};
System.out.println("Enter element to remove:");
int se=s.nextInt();
int[] result=re.del(a,se);
if(result!=null){
System.out.println("Array after removal:");
for(int num:result){
System.out.print(num+" ");
}
}
}
public int[] del(int[] a,int se){
int index=-1;
for(int i=0;i<a.length;i++){
if(a[i]==se){
index=i;
break;
}
}
if(index==-1){
System.out.println("Element not found!");
return null;
}
int[] newArr=new int[a.length-1];
for(int i=0,k=0;i<a.length;i++){
if(i!=index){
newArr[k++]=a[i];
}
}
return newArr;
}
}*/
/* 5).
class copyarr{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int[] a= {1,2,3,4,5};
int[] b= new int[a.length];
System.out.println("first array is : ");
for(int i=0;i<a.length;i++){
System.out.println(a[i]);
b[i]=a[i];
}
System.out.println("Second array is : ");
for (int val : b) {
System.out.println(+val);
}
}
}*/
/* 6).
class Insertval{
public static int[] insertAt(int[] arr,int element,int pos){
if(pos<0||pos>arr.length){
throw new IllegalArgumentException("Invalid position");
}
int[] newArr=new int[arr.length+1];
for(int i=0;i<pos;i++){
newArr[i]=arr[i];
}
newArr[pos]=element;
for(int i=pos;i<arr.length;i++){
newArr[i+1]=arr[i];
}
return newArr;
}
public static void main(String[] args){
int[] A={1,2,3,5};
int element=4;
int pos=3;
int[] updated=insertAt(A,element,pos);
for(int val:updated){
System.out.print(val);
}
}
}*/
/* 7).
class MinMax{
public static void findMinMax(int[] arr){
if(arr==null||arr.length==0){
System.out.println("Array is empty");
return;
}
int min=arr[0];
int max=arr[0];
for(int i=1;i<arr.length;i++){
if(arr[i]<min)min=arr[i];
if(arr[i]>max)max=arr[i];
}
System.out.println("Min:"+min);
System.out.println("Max:"+max);
}
public static void main(String[] args){
int[] a={7,2,9,4,1,5};
findMinMax(a);
}
}*/
/*
class ReverseArr{
public static void reverse(int[] arr){
int start=0,end=arr.length-1;
while(start<end){
int temp=arr[start];
arr[start]=arr[end];
arr[end]=temp;
start++;
end--;
}
}
public static void main(String[] args){
int[] a={1,2,3,4,5};
reverse(a);
for(int i=0;i<a.length;i++){
System.out.print(a[i]);
}
}
}*/
/* 10).
class CommonEle{
public static void main(String[]args){
int[]a={1,2,3,4,5,6};
int[]b={2,4,5,6,7,8};
System.out.print("Common elements:");
for(int i=0;i<a.length;i++){
for(int j=0;j<b.length;j++){
if(a[i]==b[j]){
System.out.print(a[i]+" ");
}}}
}}*/




