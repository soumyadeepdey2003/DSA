//problem link: https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&company=TCS&sortBy=submissions

import java.util.*;
import java.io.*;
public class MissingInArray
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int []arr=new int[n];
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
			int miss=missingNumber(arr);
			System.out.println(miss);
		}
	}
	static int missingNumber(int arr[]) {
                int n=arr.length+1;
        	int res=0, sum=0;
        	for(int i=1;i<=n;i++)
         		res=res^i;
        	for(int a : arr)
            		sum=sum^a;
        	return res^sum;
        
    }
}
