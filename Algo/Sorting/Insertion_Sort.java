import java.util.*;
import java.io.*;
public class Insertion_Sort
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
// tack a window from small to big and apply sorting by placing any element to its right position by just swaping it with its previous big element
//this is mainly base on insert any in its currect position 


	public static int[] sort(int [] a)
	{
		int n=a.length,temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j>0;j--)
			{
				if(a[j]<a[j-1])
				{
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}
}