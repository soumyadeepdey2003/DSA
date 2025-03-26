import java.util.*;
import java.io.*;
public class FirstNFibonacc
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int []arr=fibonacciNumbers(n);
			for(int i=0;i<n;i++)
			{
				System.out.println(arr[i]);
			} 
		}
		sc.close(); 
	}
	public static int[] fibonacciNumbers(int n) {
    
        	int []arr=new int[n];
        	if(n>=2)
        	{
            		arr[0]=0;
            		arr[1]=1;
        	}
        	if(n==1)
            		arr[0]=0;
        	for(int i=2;i<n;i++)
        	{
            		arr[i]=arr[i-2]+arr[i-1];
        	}
        	return arr;
    	}
}