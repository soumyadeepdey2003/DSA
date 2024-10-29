import java.util.*;
import java.io.*;

public class DNF_0_1_2Sort{
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
		sort(arr,0,0,n-1);
		System.out.println("");
		System.out.print("new array:");

                for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");

		}
	
    	}


// use 3 pointers one use to point low value one use to point mid value and other to point high value 
//according to logic the left side of low must be the smallest value i.e. 0 and the right side og high must be the highest value i.e 2 
//if mid =1 mid++
//if mid =2 swap(mid, high) mid ++, high --
//if mid =0 swap (low , mid ) mid ++, low ++
// the loop will continue untill high >= mid
	public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

	public static int[] sort(int []a,int s,int mid,int e)
	{
		while (e>=mid)
		{
			if(a[mid]==0 )
			{
				swap(a,mid,s);
				s++;
				mid++;
			}
		     else if(a[mid]==2 )
			{
				swap(a,mid,e);
				e--;	
		      }
			 else{
				mid++;
			}			
		}
		return a;
		
	}
}