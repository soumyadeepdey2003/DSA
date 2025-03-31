import java.io.*;
import java.util.*;
public class TheMultiplicationGame
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
			String [] input=sc.nextLine().split(" ");
			int k=sc.nextInt();
			int n=input.length;
			int []intinput=new int[n];
			int c=0;
			for(String a:input)
				intinput[c++]=Integer.parseInt(a);
			boolean ans=aliceWins(intinput,k) ;
			System.out.println(ans);	
		}
	}
	
	public static boolean aliceWins(int[] arr, int k) {
        	int pos = 0, neg = 0;
        	for (int num : arr) {
            		if (num == 1)
                		pos++;
            		else
                		neg++;
        	}
        	int minority = Math.min(pos, neg);
        	return (minority % 2 == 0 && k >= minority);
    }

}