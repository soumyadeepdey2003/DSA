import java.util.*;
import java.io.*;

public class Quick_Sort
{
	public static void main(String[] args) {
        	Scanner sc=new Scanner(System.in);
		System.out.print("enter the limit:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the number of "+(i+1)+" position : ");
			arr[i]=sc.nextInt();
		}
		System.out.print("Old array :");

		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		sort(arr,0,n-1);
		System.out.println("");
		System.out.print("New array :");

                for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");

		}
	
    	}


// Pick up a pivot element from the array 
//place the pivot in its correct place in sorted array 
//all the small values from pivot is placed in left side of pivot and all the large elements  are placed in right to pivot :
//by using 2 pointers one pointing to low and another pointing to high . Then pointer 1 will move until the value present in it is greater than the pivot and pointer 2 will move until the //value //present in it is less than the pivot , then swap pointer 1 and 2, this process wil continue until pointer 2 is less than or equal to pointer 1. then update the position of pivot //with pointer 2
//then apply above point as recursion for both left and right side

	public static int position(int [] a,int s,int e)
	{
		int i=s,j=e,pivot=s;
		while(i<j)
		{
			while(a[i]<=a[pivot] && i<=e)
			{
				i++;
			}
			while(a[j]>a[pivot] && j>=s)
			{
				j--;
			}
			if(i<j)
				swap(a,i,j);
			
		}
		swap(a,pivot,j);				
		pivot=j;
		return pivot;
	}

	public static void swap(int[] arr, int i, int j) 
	{
        	int temp = arr[i];
        	arr[i] = arr[j];
        	arr[j] = temp;
    	}

	public static void sort(int []a,int s,int e)
	{
		if(e<=s)
			return ;

		int mid =position(a,s,e);
		sort(a,s,mid-1);
		sort(a,mid+1,e);
	}
}