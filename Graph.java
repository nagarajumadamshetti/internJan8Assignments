package internJan8Assignments;
import java.util.*;
public class Graph {
	public static Node delete(Node headf,char c)
	{
		if(headf.data==c) {
			return headf.next;
		}
		Node temp=headf;
		Node temp1=temp.next;
		if(temp1.data==c)
		{
			temp.next=null;
			return temp;
		}
		Node temp3=null;
		if(temp1.next!=null)
		{
			temp3=temp1.next;
		}
		int flag=0;
		System.out.println("\n"+"________________");
		while(temp3!=null)
		{
			if(temp1.data==c)
			{
				System.out.println("\n"+"________________");
				temp.next=temp3;
				flag=1;
				break;
				//return temp1;
			}
			else
			{
				System.out.println("\n"+"________________");
				if(temp3.next!=null)
				{
					temp3=temp3.next;
					temp1=temp1.next;
					temp=temp.next;
				}
				else
				{
					break;
				}
				
			}
			//temp=temp.next;
		}
		if(flag==1)
		{
			System.out.println("Node has been deleted");
			return headf;
		}
		else
		{
			if(temp3.data==c)
			{
				temp1.next=null;
				System.out.println("Node has been deleted");
				return headf;
			}
			else
			System.out.println("Nope,not deleted or not found");
		}
		return headf;
	}
	public static class Node
	{
		char data;
		int len;
		Node next=null;
		Node(char data,int len)
		{
			this.data=data;
			this.len=len;
		}
		public static Scanner sc=new Scanner(System.in);
		public static Node head;
		public static Node insert(Node head)
		{
			Node temp=head;
			if(temp==null)
			{
				Node a=new Node(sc.next().charAt(0),sc.nextInt());
				temp=a;
				return temp;
			}
			else
			{
				while(temp.next!=null)
				{
					temp=temp.next;
				}
				Node a=new Node(sc.next().charAt(0),sc.nextInt());
				temp.next=a;
			}

			return head;
		}
		public static void display(char c,Node head)
		{
			System.out.println("________________");
			Node temp=head;
			System.out.println("Node :"+c);
			while(temp!=null)
			{
				System.out.print(temp.data+":"+temp.len+" , ");
				temp=temp.next;
			}
			//System.out.println("\n ________________");
		}
		
		
		//List<Character,Integer> l =new List<Character,Integer>();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashMap<Character, Node> hm=new HashMap<Character, Node>();
		System.out.println("Enter the number of nodes to insert");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the Node Character:");
			char c=sc.next().charAt(0);
			System.out.println("Enter the number of links");
			int m=sc.nextInt();
			Node head=null;
			//Node temp=head;
			for(int j=0;j<m;j++)
			{
				System.out.println("Enter the Node name and link distance");
				head=Node.insert(head);
			}
			hm.put(c,head);
			//head=null;
			//System.out.println("________________");
			Node.display(c,hm.get(c));
			System.out.println("\n"+"________________");
		}
		//System.out.println(Arrays.asList(hm)); // method 1
		 hm.entrySet().forEach(entry->{
			    System.out.println(entry.getKey() + " " + entry.getValue());  
			    Node temp=entry.getValue();
			    while(temp!=null)
			    {
			    	System.out.println("   "+temp.data+":"+temp.len);
			    	temp=temp.next;
			    }
			    System.out.println("________________");
			 });
		 System.out.println("Enter the number of links you want to delete");
		 n=sc.nextInt();
		 for(int i=0;i<n;i++)
		 {
			 System.out.println("Enter the External Node name");
			 char e=sc.next().charAt(0);
			 Node temp=hm.get(e);
			 System.out.println("\n Enter the internal node to delete");
			 char f=sc.next().charAt(0);
			 temp=delete(temp,f);
			 hm.replace(e,temp);
			 System.out.println("\n"+"________________"+"\n after deletion:      ");
			 Node.display(e,hm.get(e));
		 }
	}
}
