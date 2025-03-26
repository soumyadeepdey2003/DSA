import java.io.*;
import java.util.*;

public class StockBuyandSell
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
			
			String [] arr=sc.nextLine().split(" ");
			int []prices=new int[arr.length];
			for(int i=0;i<arr.length;i++)
			{
				prices[i]=Integer.parseInt(arr[i]);
			}
			int re=maximumProfit(prices);
			System.out.println(re);
		}
	}
	
	public static  int maximumProfit(int prices[]) {
        
         	int min =Integer.MAX_VALUE;
        	int max = 0;

        	for (int p : prices) {
            		min = Math.min(min, p); // Track the lowest price
            		max = Math.max(max, p - min); // Maximize profit
        	}

        	return max;
    	}
	

}