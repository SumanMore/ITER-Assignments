public class Node<T>{
		public T data;
		public Node<T> next;
		
		//Constructor
		Node(T d)
		{
			data=d;
			next=null;
		}
	}



public class Main {
	
	public static Node insert(int d,Node head)
	{
		Node<Integer> newNode=new Node<>(d);
		newNode.next=head.next;
		head.next=newNode;
		return head;
	}
	
	public static void display(Node node)
	{
		System.out.println(" ");
		while(node!=null)
		{
			System.out.print("-"+node.data);
			node=node.next;
		}
	}
	
	public static Node rev(Node sHead)
  {
Node iter=sHead.next,temp =iter.next;
while(temp!=null)
{
iter.next=temp.next;

temp.next=sHead.next;
sHead.next=temp;
temp=iter.next;
}
return sHead.next;
  }

  public static boolean palin(Node head)
  {
    Node fast=head,slow=head;
    while(fast!=null&&fast.next!=null&&fast.next.next!=null)
    {
      slow=slow.next;
      fast=fast.next.next;
    }
    Node first=head,second=rev(slow);
    while(first!=null&&second!=null)
    {
      if(first.data!=second.data)
         return false;
      first=first.next;
      second=second.next;   
    }
    return true;
  }
	
		

	public static void main(String[] args) {
		
	int a[]={9,8,7,6,5,5,6,7,8,9,10};
  Node head=new Node(10);
  for(int i=a.length-1 ;i>=0;i--)
      head=insert(a[i],head);

  display(head);  
  System.out.println();  
  System.out.println(palin(head));
  System.out.println();
  display(head);

	}
}