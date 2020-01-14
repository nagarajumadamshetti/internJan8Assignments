package internJan8Assignments;
import java.util.*;
public class ReturnL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Character> s1=new ArrayList<Character>();
		String num=sc.nextLine();
		for(int i=0;i<num.length();i++)
		{
			s1.add(num.charAt(i));
		}
		s1.forEach(System.out::println);
	}

}
