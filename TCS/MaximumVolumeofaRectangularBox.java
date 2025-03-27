import java.io.*;
import java.util.*;

public class MaximumVolumeofaRectangularBox
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
			int A=sc.nextInt();
			int B=sc.nextInt();
			long ans=getVol(A,B); 
			System.out.println(" "+ans+" ");
		}
	}
	static long getVol(int A, int B) {
        	//4(l+b+h)=A
        	//l+b+h=A/4
        
        
        
        	//2(lh+lb+bh)=B
        	//lh+lb+bh=B/2
        
        
        	//l=(A-sqrt((A*A)-24B))/12
        	//v=l×(B/2 -l(A/4-l))


        
        	double l = (A - Math.sqrt(A * A - 24 * B)) / 12.0;
        	double V = l * (B / 2.0 - l * (A / 4.0 - l));
        	return (long)(V);
        
    	}
	
}