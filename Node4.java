package internJan8Assignments;
import java.util.*;
public class Node4 {
		int data;
		Node4 next=null;
		Node4(int data)
		{
			this.data=data;
		}
	public static Node4 head1;
	public static Node4 head2;
	public static Node4 insert(Node4 head,int data)
	{
		if(head==null)
		{
			Node4 n=new Node4(data);
			head=n;
			return head;
		}
		else
		{
			Node4 temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			Node4 n=new Node4(data);
			temp.next=n;
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Integer>  mylist = new ArrayList<Integer>();
		head1=null;
		head2=null;
		 System.out.println("enter the number of items you would like to use the list 1 for:");
		 int n=sc.nextInt();
		 for(int i=0;i<n;i++)
		 {
			 head1=insert(head1,sc.nextInt());
		 }
		 System.out.println("enter the number of items you would like to use the list 2 for:");
		 n=sc.nextInt();
		 for(int i=0;i<n;i++)
		 {
			 head2=insert(head2,sc.nextInt());
		 }
		 Node4 temp1=head1;
		 Node4 temp2=head2;
		 while(temp1!=null&&temp2!=null)
		 {
			 if(temp1.data<temp2.data)
			 {
				 mylist.add(temp1.data);
				 temp1=temp1.next;
			 }
			 else
			 {
				 mylist.add(temp2.data);
				 temp2=temp2.next;
			 }
			 
		 }
		 mylist.forEach(System.out::println);
		 System.out.println("-------------");
		 while(temp1!=null)
		 {
			 mylist.add(temp1.data);
			 temp1=temp1.next;
		 }
		 
		 mylist.forEach(System.out::println);
		 System.out.println("-------------");
		 while(temp2!=null)
		 {
			 mylist.add(temp2.data);
			 temp2=temp2.next;
		 }
		 mylist.forEach(System.out::println);
//		 Node4 temp1=head;
//			while(temp1!=null)
//			{
//				System.out.print(temp1.data+" ");
//				temp1=temp1.next;
//			}
//		 System.out.println("enter the number of rotations:");
//		 int k=sc.nextInt();
//		 k=k%n;
//		 /*for(int i=0;i<n;i++)
//		 {
//			 mylist.add(sc.next());
//		 }*/
//		 head=rotateK(head,k);
//		 System.out.println("the list after performing "+k+" rotations is:");
//		 Node4 temp=head;
//			while(temp!=null)
//			{
//				System.out.print(temp.data+" ");
//				temp=temp.next;
//			}
//		 //mylist.forEach(System.out::println);
//		// while()
	}

}
