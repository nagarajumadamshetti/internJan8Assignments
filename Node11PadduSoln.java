package internJan8Assignments;
import java.util.*;
public class Node11PadduSoln {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> lol=new ArrayList<ArrayList<Integer>>(10);
       System.out.println("enter the no: of lists");
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=1;i<=n;i++)
       {
    	   createlist(lol);
       }
       //System.out.println(lol);
       HashMap<ArrayList,Integer> map=new HashMap<ArrayList,Integer>();
       for(int i=0;i<n;i++)
    	   map.put(lol.get(i),lol.get(i).size());
	sortByValue(map);
}
	public static void createlist(ArrayList<ArrayList<Integer>> lol)
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		System.out.println("enter no: of items in the list:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
			a1.add(sc.nextInt());
		lol.add(a1);
	}
	public static void sortByValue(HashMap<ArrayList, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<ArrayList, Integer> > list =
               new LinkedList<Map.Entry<ArrayList, Integer> >(hm.entrySet());
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<ArrayList, Integer> >() {
            public int compare(Map.Entry<ArrayList, Integer> o1,
                               Map.Entry<ArrayList, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        // put data from sorted list to hashmap
        HashMap<ArrayList, Integer> temp = new LinkedHashMap<ArrayList, Integer>();
        for (Map.Entry<ArrayList, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        for (ArrayList key : temp.keySet()) {
			System.out.print(key);
		}
    }
}