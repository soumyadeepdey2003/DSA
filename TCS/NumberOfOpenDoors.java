import java.io.*;
import java.util.*;

public class NumberOfOpenDoors
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
			long N=sc.nextLong();
			int ans=noOfOpenDoors(N); 
			System.out.println(ans);
		}
	}
	static int noOfOpenDoors(Long N) {
       
        	return (int)Math.sqrt(N);
            
    	}
}