package internJan8Assignments;
import java.util.*;
public class Node {
	Node left=null,right=null;
	int data;
	Node(int data)
	{
		this.data=data;
	}
	public static Node head;
	public static Node insert(Node head,int data)
	{
		if(head==null)
		{
			Node n=new Node(data);
			head=n;
			return head;
		}
		Node temp=head;
		Node hold=temp;
		while(temp!=null)
		{
			hold=temp;
			if(temp.data>data)
			{
				temp=temp.left;
			}
			else
			{
				temp=temp.right;
			}
		}
		Node n=new Node(data);
		hold=n;
		return head;
	}
	public static void inOrder(Node temp)
	{
		if(temp==null)
		{
			return;
		}
			inOrder(temp.left);
			System.out.print(temp.data+" ");
			inOrder(temp.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		head=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the node values in a line");
		String s[]=sc.nextLine().split(" ");
		for(int i=0;i<s.length;i++)
		{
			head=insert(head,Integer.parseInt(s[i]));
		}
		inOrder(head);
	}

}
