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
	
public static Node listPivoting (Node L ,int x) 
{
Node lessHead = new Node(0);
Node equalHead = new Node(0);
Node greaterHead = new Node(0);
Node lesslter = lessHead;
Node equallter = equalHead;
Node greaterlter = greaterHead;

Node iter  = L;
while (iter != null)
 {
if ((int)iter.data<x)
 {
lesslter.next = iter;
lesslter = iter;
 } 
else if ((int)iter.data==x)
 {
equallter.next = iter;
equallter = iter;
} 
else 
{
   
greaterlter.next = iter;
greaterlter = iter;
}
iter = iter. next ;
}

greaterlter . next = null;
equallter . next = greaterHead . next ;
lesslter . next = equalHead . next ;
return lessHead.next ;
}

	public static void main(String[] args) {
		int a[]={2,2,11,7,5,11};
  Node head=new Node(3);
  //head=null;
  for(int i=a.length-1 ;i>=0;i--)
      head=insert(a[i],head);

  display(head);  
  System.out.println();
  int k=7;
 head=listPivoting(head,k);
  
  display(head);  
  

	
		
	}
}