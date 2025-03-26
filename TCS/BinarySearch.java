//problem link: https://www.geeksforgeeks.org/problems/binary-search-1587115620/1?page=1&company=TCS&sortBy=submissions

import java.io.*;
import java.util.*;

public class BinarySearch
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int []arr=new int[n];
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
			int k=sc.nextInt();
			int ans=binarysearch(arr,k);
			if(ans==-1)
				System.out.println("The number is not present");
			else
				System.out.println("Position :"+(ans+1)); 
		}
	}

	public static  int binarysearch(int[] arr, int k) {
        
        	int s1=0;
        	int s2=arr.length-1;
        	int ans=-1;
        	while(s1<=s2){
           		int mid =s1+((s2-s1)/2);     
           		if(arr[mid]==k)
           		{
               			ans=mid;
               			s2=mid-1;
           		}
             
            		else if(arr[mid]>k)
            			s2=mid-1;
            		else 
            			s1=mid+1;
            
        
        	}
        	return ans;
   	 }
}