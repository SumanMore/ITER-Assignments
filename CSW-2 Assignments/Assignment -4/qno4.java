public class Node<T>{
		public T data;
		public Node<T> next;
		Node(T d)
		{
			data=d;
			next=null;
		}
	}
  


public class LinkedList {
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
	public static void CreateCycle(Node<Integer> head) {
		int k=1;
		Node<Integer> pNode=head;
		Node<Integer> tmp=head;
		while(k++ < 2)
			pNode=pNode.next;
		int c=0;
		while(tmp.next != null) {
			tmp=tmp.next;
			c++;
		}
		tmp.next=pNode;
		//display
		tmp=head;
		System.out.println("\n Display Cycle:");
		for(int i=0;i<=c+1;i++)
		{
			System.out.print("-"+tmp.data);
			tmp=tmp.next;
		}
	}
	public static Node<Integer> hasCycle(Node<Integer> head){
		
		Node<Integer> fast=head, slow=head;
		while(fast != null && fast.next != null && fast.next.next != null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				slow=head;
				while(slow != fast) {
					slow=slow.next;
					fast=fast.next;
				}
				return slow;
			}
		}
		return null;
	}
	public static void main(String[] args) {
		
		Node<Integer> head=new Node<>(1);				
		//insert 5 nodes
		for(int i=5;i>0;i--)
			head=insert(i+1,head);
		display(head);
		CreateCycle(head);
		Node<Integer> node=hasCycle(head);
		System.out.print("\n"+node.data);
	}
}