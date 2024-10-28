import java.util.*;
import java.io.*;

public class Merge_Sort
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
		divide(arr,0,n-1);
		System.out.println("");
		System.out.print("new array:");

                for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");

		}
	
    	}


// we will divide the array to make it small untill each subarray has one element each 
// we compare two subarrays and merge them according  to their value 
// we put two pointers to the starting of two subarrays and compare them.
//Smaller element of them is placed in the merged larger array and smaller value contaning pointer is pointing to the next element present in that sub array 
// if left sub array is empty then we run traverse through right sub array and copy elements to the merged larger array
//if right sub array is empty then we run traverse through left sub array and copy elements to the merged larger array

	public static void sort(int [] a,int s,int mid,int e)
	{
		int nl=(mid-s)+1,nr=(e-mid),lp = 0, rp = 0,ind=s;
		int [] left=new int[nl];
		int [] right=new int[nr];
		
		for(int i=0;i<nl;i++)
		{
			left[i]=a[i+s];	
		}
		for(int i=0;i<nr;i++)
		{
			right[i]=a[i+mid+1];	
		}
		while(lp<nl && rp<nr)
		{
			if(left[lp]<=right[rp])
			{
				a[ind]=left[lp];
				lp++;
				
			}
			else
			{
				a[ind]=right[rp];
				rp++;
				
			}
			ind++;

		}
		while(lp<nl )
		{
			a[ind]=left[lp];
			lp++;
			ind++;
			
		}

		while(rp<nr)
		{
			a[ind]=right[rp];
			rp++;
			ind++;
			
		}

	}

	public static void divide(int []a,int s,int e)
	{
		if(e<=s)
			return ;
		int mid =(s+e)/2;
		divide(a,s,mid);
		divide(a,mid+1,e);
		sort(a,s,mid,e);
	}
}