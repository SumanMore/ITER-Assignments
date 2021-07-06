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

public class Main{
	public static Node insert(int d,Node head)
	{
		Node<Integer> newNode=new Node<>(d);
		newNode.next=head.next;
		head.next=newNode;
		return head;
	}
	public static void display(Node node)
	{
		System.out.println("\n LinkedList");
		while(node!=null)
		{
			System.out.print("-"+node.data);
			node=node.next;
		}
	}
	
	public static Node<Integer> removeDuplicate(Node<Integer> L) {
		
		Node<Integer> iter=L;
		while(iter != null) {
			Node<Integer> nextDist = iter.next;
		while(nextDist != null && nextDist.data == iter.data) {
			nextDist = nextDist.next;
		}
		iter.next = nextDist;
		iter = nextDist;
		}
		return L;
	}
	public static void main(String[] args) {
		
		Node<Integer> head=new Node<>(1);				
		insert(11,head);
		insert(11,head);
		insert(7,head);
		insert(5,head);
		insert(3,head);
		insert(2,head);
		insert(2,head);
		display(head);
		removeDuplicate(head);		
		System.out.println("\n After Duplicate Remove :");
		display(head);
	}
}