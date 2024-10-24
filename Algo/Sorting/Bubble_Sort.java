import java.util.*;
import java.io.*;
public class Bubble_Sort
{
	public static void main(String[] args) {
        	Scanner sc=new Scanner(System.in);
		System.out.print("enter the limit:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("enter the number of "+(i+1)+" position :");
			arr[i]=sc.nextInt();
		}
		System.out.print("old array:");

		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		sort(arr);
		

		System.out.println("");
		System.out.print("new array:");

                for(int i=0;i<n;i++)
		{
			System.out.print(ans[i]+" ");
		}
	
    	}
	// max element move to last by adjacent swap 
	public static int[] sort(int [] a)
	{
		int n=a.length,temp;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
					{
					
						temp=a[j+1];
						a[j+1]=a[j];
						a[j]=temp;
					}
			}
		}
		return a;
	}
}