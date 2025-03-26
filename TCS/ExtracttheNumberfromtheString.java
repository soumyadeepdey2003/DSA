import java.io.*;
import java.util.*;

public class ExtracttheNumberfromtheString
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
			String sentence=sc.nextLine();
			long ans=ExtractNumber(sentence);
			System.out.println(ans);
		}
	}
	static long ExtractNumber(String sentence) {
        	String [] s=sentence.split(" ");
        	long max=-1;
        	for(String a: s)
        	{
            		if(!a.contains("9"))
                		try{
                   		 max=Math.max(max,Long.parseLong(a));
                		}catch(Exception e){}
        	}
        	return max;
    	}
}