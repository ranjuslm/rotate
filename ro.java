import java.io.*;
import java.util.*;
class ro
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the size:");
int n=sc.nextInt();
int[] a=new int[n];
int[] b=new int[n];
System.out.println("enter the rotate:");
int r=sc.nextInt();
int l=1;
int k=0;
int p=0;
System.out.println("enter the numbers:");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<r;i++)
{
b[r-l]=a[n-l];
//System.out.println("b:"+b[i]);
l++;
k=i;
}
for(int j=k+1;j<n;j++)
{
b[j]=a[p];
p++;
}
System.out.println("out:"+Arrays.toString(b));
}
}