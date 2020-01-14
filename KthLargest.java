package internJan8Assignments;
import java.util.*;
public class KthLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Integer> l=new ArrayList<Integer>();
		System.out.println("Enter the elements:");
		String s[]=sc.nextLine().split(" ");
		for(int i=0;i<s.length;i++)
		{
			l.add(Integer.parseInt(s[i]));
		}
		Collections.sort(l,Collections.reverseOrder());
		System.out.println("Enter the K value");
		int k=sc.nextInt();
		System.out.println(l.get(k-1));
	}

}
