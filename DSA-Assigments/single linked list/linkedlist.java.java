class Node {
protected int reg_no;
protected float mark;
protected Node next;
	
}
import java.util.*;
public class linkedlist {
	static Scanner in = new Scanner (System.in);
	public static Node create(Node start) {
	
	
	Node p= new Node();
	int op;
	do {
		Node q= new Node();
	System.out.println("Enter registration number and marks");
	q.reg_no=in.nextInt();
	q.mark=in.nextFloat();
	q.next=null;
	if(start==null) {
		start=q;
		p=q;
		
	}
	else
	{
		p.next=q;
		p=q;
	}
	
	System.out.println("Do you want to add new node (1 for yes and 0 for no)");
	op=in.nextInt();
	
	}while(op!=0);
	return start;
	}
	public static void display(Node start)
	{
	Node t=start;
	while(t!=null)
	{
		System.out.println(t.reg_no+"\t"+t.mark);
		t=t.next;
	}
	
	}
	public static Node InsBeg(Node start)
	{
		Node p= new Node();
		System.out.println("Enter registration number and marks");
		p.reg_no=in.nextInt();
		p.mark=in.nextFloat();
	    p.next=null;
	    if(start==null)
	    {
	    	start=p;
	    	
	    }
	    else {
	    	p.next=start;
	    	start=p;
	    }
	    return start;
		
	}
	public static Node InSend(Node start)
	{
		Node p= new Node();
		System.out.println("Enter registration number and marks");
		p.reg_no=in.nextInt();
		p.mark=in.nextFloat();
		p.next=null;
		if(start==null)
		{
			start=p;
		}
		else {
			Node t=start;
			while(t.next!=null)
				t=t.next;
			t.next=p;
		}
		return start;
	}
	public static Node InsAny(Node start)
	{
		
		System.out.println("Enter location");
		int loc=in.nextInt();
		int c=count(start);
		if(loc==1)
		{
			start=InsBeg(start);
		}
		else if(loc==c+1)
			start=InSend(start);
		else if(loc>1&&loc<c+1)
		{
			Node p= new Node();
			System.out.println("Enter registration number and marks");
			p.reg_no=in.nextInt();
			p.mark=in.nextFloat();
			p.next=null;
			Node t=start;int f=1;
			while(f<loc-1)
				{t=t.next;
				f++;
				}
			p.next=t.next;
			t.next=p;
		}
		else
			System.out.println("Invalid input");
		return start;
		}
	public static int count(Node start)
	{int c=0;
		Node t=start;
		while(t!=null)
		{
			t=t.next;
			c++;
			
		}
		return c;
			
	}
	public static Node DelBeg(Node start)
	{
		if(start==null)
			System.out.println("List Underflow");
		else
		{
			start=start.next;
		}
		return start;
	}
	public static Node DelEnd(Node start)
	{
		if(start==null)
			System.out.println("list underflow");
		else
		{
			Node p=start;
			Node q=start;
			while(p.next!=null)
			{
            q= p;
            p=p.next;
		}
			q.next=null;
		}
		return start;
	}
		public static Node DelAny(Node start)
		{
		System.out.println("Enter the location to delete the node");
		int loc=in.nextInt();
		int c=count(start);
		if(loc==1)
		{
			start=DelBeg(start);
		}
		if(loc==c+1)
		{
			start=DelEnd(start);
		}
		else if(loc>1&&loc<c+1)
		{
			Node p=start;
			Node q=null;int i=0;
			while(i<loc) {
				q=p;
			p=p.next;
				i++;
			}
			q.next=p.next;
		}
		else
			System.out.println("Invalid Input");
		return start;
		}
		public static Node reverse(Node start)
		{
			Node n=null;Node finallist=null;
			Node temp=start;
			while(temp!=null)
			{
				n=temp.next;
				temp.next=finallist;
				finallist=temp;
				temp=n;
			}start=finallist;
			return start;
					
			
		}
	public static void sort(Node start)
	{
		Node i,j;
		for(i=start;i.next!=null;i=i.next)
		{
			for(j=start;j.next!=null;j=j.next)
			{
			if(j.mark>j.next.mark)
			{
			float t=j.mark;
				j.mark=j.next.mark;
				j.next.mark=t;
			}
			}
		}
	}
	public static void search(Node start)
	{
		System.out.println("enter element to search");
		double ele=in.nextDouble();
		int f=0;
		Node p=start;
		while(p.next!=null)
		{
			if(p.reg_no==ele)
			{
				f++;
				break;
			}
			p=p.next;
		}
		if(f==0)
			System.out.println("Not Found!!");
		else
		{
			System.out.println("Found");
			System.out.println("enter the marks to be updated");
			p.mark=in.nextFloat();
		}
	}
	
		}
		
		

	import java.util.Scanner;

public class prog {

	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		int c;
		Node start=null;
		
		while(true) { 
			System.out.println("****MENU*****"); 
			System.out.println("0:Exit"); 
			System.out.println("1:Creation");
			System.out.println("2:Display"); 
			System.out.println("3:Insert at beg");
			System.out.println("4:Insert at end");
			System.out.println("5:Insert at specific location"); 
			System.out.println("6:Search");
			System.out.println("7:Delete at beg"); 
			System.out.println("8:Delete at end"); 
			System.out.println("9:Delete at specific location");
			System.out.println("10:Reverse the list");  
			System.out.println("11:Sorting the list");  
			System.out.println("12 Number of nodes present");
			System.out.println("Enter the choice");   
			c=in.nextInt();   
			switch(c)   { 
			case 0:
			System.exit(0); 
			break;
			case 1:
			start=linkedlist.create(start);
			break;  
			case 2: 
			linkedlist.display(start);
			
			break;
			case 3:
				start=linkedlist.InsBeg(start);
				break;
			case 4:
				start=linkedlist.InSend(start);
				break;
			case 5:
				start=linkedlist.InsAny(start);
				break;
			case 6:
				linkedlist.search(start);
				break;
			case 7:
				start=linkedlist.DelBeg(start);
				break;
			case 8:
				start=linkedlist.DelEnd(start);
				break;
			case 9:
				start=linkedlist.DelAny(start);
				break;
			case 10:
				start=linkedlist.reverse(start);
				break;
			case 11:
				linkedlist.sort(start);
				break;
			case 12:
				int n=linkedlist.count(start);
				System.out.println("Number of nodes is: "+n);
				break;
			default:
			System.out.println("Wrong choice");
			}
		
		}

	}


		
	}

			
	
