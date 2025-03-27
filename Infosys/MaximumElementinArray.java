import java.io.*;
import java.util.*;

public class MaximumElementinArray
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
			String []a=sc.nextLine().split(" ");
			int [] arr=new int [a.length];
			int i=0;
			for(String s:a)
				arr[i++]=Integer.parseInt(s);
			int ans=largest(arr) ; 
			System.out.println(" "+ans+" ");
		}
	}
	public static int largest(int[] arr) {
        
        	int max=Integer.MIN_VALUE;
        	for(int a: arr)
            		max=Math.max(max,a);
        	return max;
    	}
	
}