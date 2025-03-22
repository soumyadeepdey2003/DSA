import java.util.*;
import java.io.*;

public class LinkedListInsertionAtEnd
{
	static class Node {
   		 int data;
   		 Node next;
    		 Node(int data) {
       			this.data = data;
        		this.next = null;
    		}
	}

	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		Node head=null;
		int t=sc.nextInt();
		while(t-->0)
		{
			int val=sc.nextInt();
			head=insertAtEnd(head,val);	
		}
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(" "+temp.data+" ");
			temp=temp.next;
		}
	}

	static Node insertAtEnd(Node head, int x) {
        
        	if (head == null) {
            		return new Node(x);
        	}
        	else
        	{
           		Node temp=head;
            		while(temp.next !=null)
                		temp=temp.next;
                
            		Node a=new Node(x);
            		temp.next=a; 
        	}
        
        		return head;
    	}
}