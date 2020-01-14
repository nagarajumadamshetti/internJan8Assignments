package internJan8Assignments;
import java.util.*;

import internJan8Assignments.Graph.Node;
public class Node12 {
	public static HashMap<String,Integer> hm=new HashMap<String,Integer>();
	public static Scanner sc=new Scanner(System.in);
	public static ArrayList<Character> insert()
	{
		System.out.println("Enter the number of elements to add:");
		int h=sc.nextInt();
		ArrayList<Character> al=new ArrayList<Character>();
		//String s[]=sc.nextLine().split(" ");
		//char c[]=s.toCharArray();
		String a="";
		for(int i=0;i<h;i++)
		{
			char c=sc.next().charAt(0);
			al.add(c);
			a+=c;
		}
		if(!hm.containsKey(a))
		{
			hm.put(a,a.length());
		}
		else
		{
			int n=hm.get(a);
			hm.replace(a, n+1);
		}
		return al;
	}
	public static List<ArrayList<Character>> sort(List<ArrayList<Character>> l)
	{
		l.clear();
		//hm.sortByValue
		hm.entrySet().forEach(entry->{
		    //System.out.println(entry.getKey() + " " + entry.getValue());
			
		    while(entry.getValue()>0)
		    {
		    	System.out.println("_________________EntrySETVALUE"+entry.getValue());
		    	String s=entry.getKey();
		    	ArrayList<Character> al=new ArrayList<Character>();
		    	for(int i=0;i<s.length();i++)
		    	{
		    		al.add(s.charAt(i));
		    	}
		    	int n=entry.getValue();
		    	entry.setValue(n-1);
		    	l.add(al);
		    }
		 });
		System.out.println("\n________________________"+l+"\n________________________");
		return l;
	}
	public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) 
    { 
        // Create a list from elements of HashMap 
        List<Map.Entry<String, Integer> > list = 
               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet()); 
        System.out.println("#####################################3");
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
            public int compare(Map.Entry<String, Integer> o1,  
                               Map.Entry<String, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");  
        // put data from sorted list to hashmap  
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
        for (Map.Entry<String, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        System.out.println("SORT BY VALUE \n-----------------------------------\n"+temp+"SORT BY VALUE \n-----------------------------------\n");
        return temp; 
    }
	public static void display(List<ArrayList<Character>> l)
	{
		//System.out.println();
		int n=l.size();
		for(int i=0;i<n;i++)
		{
			ArrayList<Character> k;
			k=l.get(i);
			//int j=k.size();
			//k.toArray();
			System.out.print(k);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		List<ArrayList<Character>> ol=new ArrayList<ArrayList<Character>>();
		System.out.println("Enter the number of inernal lists:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("List "+(i+1));
			ol.add(insert());
		}
		System.out.println(ol);
		ol=sort(ol);
		System.out.println(ol);
		display(ol);
	}

}
