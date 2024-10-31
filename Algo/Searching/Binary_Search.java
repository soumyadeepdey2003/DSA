import java.util.*;
import java.io.*;

public class Binary_Search

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
		System.out.print("array :");

		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
        System.out.print("Enter the number to be serch : ");
        int num=sc.nextInt();
		int ans=search(arr,n,num);
		System.out.println("");
		if(ans>0 && ans<=n)
			System.out.print(" the number is present in index : "+ ans);
                else
			System.out.print("element not found" );
	
    	}
        
	
	public static int search(int[] arr,int n, int num) 
	{
        	int s=0,e=n-1;
		while(s<=e)
		{
			int mid=s+(e-s)/2;
			if(arr[mid]==num)
				return mid+1;
			else if(arr[mid]>num)
				e=mid-1;
			else
				s=mid+1;
		}
		return -1;
	}


	
}