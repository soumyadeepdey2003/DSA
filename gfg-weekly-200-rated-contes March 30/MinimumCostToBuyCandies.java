import java.io.*;
import java.util.*;
public class MinimumCostToBuyCandies
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
			String [] input=sc.nextLine().split(" ");
			int n=input.length;
			int []intinput=new int[n];
			int c=0;
			for(String a:input)
				intinput[c++]=Integer.parseInt(a);
			int ans=minimumCost(intinput);
			System.out.println(ans);	
		}
	}

	public static int minimumCost(int[] prices) {
        
        	if(prices.length==1)
            		return prices[0];
        	Arrays.sort(prices);
        	if(prices.length==2)
            		return prices[1];
        	if(prices.length==3 || prices.length==3)
            		return (prices[0]+prices[prices.length-1]);
        	int sum=prices[prices.length-1];
        	int c=0;
        	if(prices.length%2==0)
            		c=(prices.length/2)-1;
        	else 
            		c=(prices.length/2);
        	for(int i=0;i<c;i++)
            		sum+=prices[i];
        	return sum;
    }
}