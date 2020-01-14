package internJan8Assignments;
import java.util.*;
public class NodeK {
		String data;
		NodeK next=null;
		NodeK(String data)
		{
			this.data=data;
		}
	public static NodeK head;
	public static NodeK insert(NodeK head,String data)
	{
		if(head==null)
		{
			NodeK n=new NodeK(data);
			head=n;
			return head;
		}
		else
		{
			NodeK temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			NodeK n=new NodeK(data);
			temp.next=n;
		}
		return head;
	}
	public static NodeK rotateK(NodeK head,int k)
	{
		int count=0;
		NodeK temp=head;
		while(count<k-1)
		{
			temp=temp.next;
			count++;
		}
		NodeK hold=temp.next;
		temp.next=null;
		temp=hold;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=head;
		head=hold;
		
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//List<String>  mylist = new ArrayList<String>();
		 System.out.println("enter the number of items you would like to use the list for:");
		 int n=sc.nextInt();
		 for(int i=0;i<n;i++)
		 {
			 head=insert(head,sc.next());
		 }
		 NodeK temp1=head;
			while(temp1!=null)
			{
				System.out.print(temp1.data+" ");
				temp1=temp1.next;
			}
		 System.out.println("enter the number of rotations:");
		 int k=sc.nextInt();
		 k=k%n;
		 /*for(int i=0;i<n;i++)
		 {
			 mylist.add(sc.next());
		 }*/
		 head=rotateK(head,k);
		 System.out.println("the list after performing "+k+" rotations is:");
		 NodeK temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		 //mylist.forEach(System.out::println);
		// while()
	}

}
