package practice;
import java.util.*;
public class array {
	public static void main(String[] args) {
 Scanner s = new Scanner(System.in);
	System.out.println("enter row values:");
	int n=s.nextInt();
	System.out.println("enter column values:");
	int n1=s.nextInt();
	int a[][]=new int[n][n1];
	System.out.println("enter array  values:");
	for( int i=0;i<n;i++) {
		for(int  j=0;j<n1;j++) {
			a[i][j]=s.nextInt();
			
		}
		
	}System.out.println("array:");
	for( int i=0;i<n;i++)
	{
		for(int  j=0;j<n1;j++) 
		{
			System.out.print(a[i][j]+" ");
			
		}
		System.out.println();
	};
	for(int i=0;i<n;i++) 
	{
		if(i%2!=0) 
		{
			for(int j=n1-1;j>=0;j--) 
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		else 
		{
			for(int j=0;j<n1;j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	}}


