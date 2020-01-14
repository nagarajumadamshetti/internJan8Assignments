package internJan8Assignments;
import java.util.*;
public class Eng2Mor {
	static
	{
		
	}
	static void E2M(String inp)
	{
		HashMap<Character,String> hm=new HashMap<Character,String>();
		hm.put('a',"01");hm.put('b',"1000");hm.put('c',"1010");hm.put('d',"100");
		hm.put('e',"0");hm.put('f',"0010");hm.put('g',"110");hm.put('h',"0000");
		hm.put('i',"00");hm.put('j',"0111");hm.put('k',"101");hm.put('l',"0100");
		hm.put('m',"11");hm.put('n',"10");hm.put('o',"111");hm.put('p',"0110");
		hm.put('q',"1101");hm.put('r',"010");hm.put('s',"000");hm.put('t',"1");
		hm.put('u',"001");hm.put('v',"0001");hm.put('w',"011");hm.put('x',"1001");
		hm.put('y',"1011");hm.put('z',"1100");
		
		for(int i=0;i<inp.length();i++)
		{
			char c=inp.charAt(i);
			if(c!=' ')
			{
				System.out.print(hm.get(c));
				System.out.print(" ");
			}
			else if(c==' ')
			{
				System.out.println();
			}
			else
			{
				System.out.println("Invalid");
				break;
			}
		}
	}
	static void M2E(String inp)
	{
		HashMap<String,Character> hm=new HashMap<String,Character>();
		hm.put("01",'a');hm.put("1000",'b');hm.put("1010",'c');hm.put("100",'d');
		hm.put("0",'e');hm.put("0010",'f');hm.put("110",'g');hm.put("0000",'h');
		hm.put("00",'i');hm.put("0111",'j');hm.put("101",'k');hm.put("0100",'l');
		hm.put("11",'m');hm.put("10",'n');hm.put("111",'o');hm.put("0110",'p');
		hm.put("1101",'q');hm.put("010",'r');hm.put("000",'s');hm.put("1",'t');
		hm.put("001",'u');hm.put("0001",'v');hm.put("011",'w');hm.put("1001",'x');
		hm.put("1011",'y');hm.put("1100",'z');
		String s[]=inp.split(" ");
		for(int i=0;i<s.length;i++)
		{
			if(hm.containsKey(s[i]))
			System.out.print(hm.get(s[i]));
			else
			{
				System.out.println("Invalid");
				break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//hm.put('a',"01");
		System.out.println("Enter the English String to be displayed in Morse:");
		String inp=sc.nextLine();
		E2M(inp);
		System.out.println("Enter the Morse in String format to be displayed in English:");
		M2E(sc.nextLine());
		}
}
