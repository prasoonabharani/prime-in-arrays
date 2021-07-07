import java.util.*;
class Primeinarr
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int count=0;
System.out.println("Enter array size=");
int n=sc.nextInt(); 
int arr[]=new int[n];
System.out.println("Enter array elemnts =");
for (int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{ int temp=0;
for(int j=2;j<arr[i];j++)
{ 
if(arr[i]%j==0)
{
temp++;
}}
if(temp==0)
count++;
}
System.out.println(+count);
}}