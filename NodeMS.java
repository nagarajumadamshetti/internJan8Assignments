package internJan8Assignments;
import java.util.*;
public class NodeMS {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		List<Integer> s1=new ArrayList<Integer>();
		List<Integer> s2=new ArrayList<Integer>();
		System.out.println("enter the no of elements in list 1");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			s1.add(sc.nextInt());
		}
		//Collections.sort(s1);
		System.out.println("enter the no of elements in list 2");
		int n1=sc.nextInt();
		for(int i=0;i<n1;i++)
		{
			s2.add(sc.nextInt());
		}
		//Collections.sort(s2);
		s1.addAll(s2);
		Collections.sort(s1);
		s1.forEach(System.out::println);
	}
}
