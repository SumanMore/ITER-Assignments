public class Node<T> 
{
public T data;
public Node<T> next;

public Node(T i) 
{
	// TODO Auto-generated constructor stub
    data=i;
    next=null;
}
}


public class Main {
	public static Node insert(int d,Node head)
	{
		Node<Integer> newNode=new Node(d);
		newNode.next=head.next;
		head.next=newNode;
		return head;
	}
	public static void display(Node node)
	{
		System.out.println("LinkedList");
		while(node!=null)
		{
			System.out.print(node.data);
			node=node.next;
		}
	}
	
	public static Node<Integer> removeKthNode(Node<Integer> L, int k) {
		
		Node<Integer> dummy=new Node(0);
		dummy.next=L;
		Node<Integer> first=dummy.next;
		while(k-- > 0) {
			first=first.next;
		}
		Node<Integer> second=dummy;
		while(first != null) {
			second=second.next;
			first=first.next;
		}
		second.next=second.next.next;
		return dummy.next;
	}
	public static void main(String[] args) {
		
		Node<Integer> head=new Node(1);				
		//insert 5 nodes
		for(int i=5;i>0;i--)
			head=insert(i+1,head);
		display(head);
		int pos=3;
		removeKthNode(head,pos);
		System.out.println("\n After deletion");
		display(head);
	}
}