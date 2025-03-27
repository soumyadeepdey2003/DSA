import java.io.*;
import java.util.*;

public class Checkifthedoorisopenorclosed
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
			int N=sc.nextInt();
			int []ans=checkDoorStatus(N); 
			for(int a:ans)
				System.out.print(" "+a+" ");
		}
	}
	static int[] checkDoorStatus(int N) {
        
        	int[] doors=new int[N];
        	if(N==1)
        	{
            		doors[0]=1;
       		}
        	else
        	{
            		for(int a :doors)
                		a=0;
            		doors[0]=1;
            		for(int i=1;i<=N;i++)
            		{
                		if(i*i<=N)
                    			doors[i*i-1]=1;
                		else
                    			break;
            		} 
        	}
        	return doors;
    	}
}