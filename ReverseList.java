package internJan8Assignments;
import java.util.*;
public class ReverseList {
	static List<String> reverse(List<String> a)
	{
	        // Here we are using reverse() method 
	        // to reverse the element order of mylist 
	        Collections.reverse(a); 
	        return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 List<String>  mylist = new ArrayList<String>();
		 System.out.println("enter the number of items you would like to use the list for:");
		 int n=sc.nextInt();
		 for(int i=0;i<n;i++)
		 {
			 mylist.add(sc.next());
		 }
		 System.out.println("the list in reversed order is:");
		 /*for(int i=0;i<n;i++)
		 {
			 mylist.add(sc.next());
		 }*/
		 mylist=reverse(mylist);
		 mylist.forEach(System.out::println);
	}

}
