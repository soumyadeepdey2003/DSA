import java.util.*;
import java.io.*;
public class Selection_Sort
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
			System.out.print(arr[i]+" ");
		}
	
    	}
// select the min element and move the element to  the fst position of the unsorted part of array 
	public static int[] sort(int [] a)
	{
		int n=a.length,min=0,pos=0;
		for(int i=0;i<n-1;i++)
		{       
                        min=a[i];
			for(int j=i+1;j<n;j++)
			{
				if(min>a[j])
				{
					min=a[j];
					pos=j;
				}
					
			}
			a[pos]=a[i];
			a[i]=min;
							
		}
		return a;
	}
}