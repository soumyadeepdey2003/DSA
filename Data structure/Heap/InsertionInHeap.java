import java.util.*;
import java.io.*;

public class InsertionInHeap

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
		insert(arr,n,num);
		System.out.println("");
		System.out.print("New array :");

                for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");

		}
	
    	}
        
	
	public static int[] insert(int[] arr,int n, int num) 
	{
        	
	}


	public static void swap(int[] arr, int i, int j) 
	{
        	int temp = arr[i];
        	arr[i] = arr[j];
        	arr[j] = temp;
    	}

}