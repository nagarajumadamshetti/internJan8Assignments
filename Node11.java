package internJan8Assignments;
import java.util.*;
public class Node11 {
	static class NodeT
	 {
	 	NodeT next=null;
	 	Node11 data;
	 	NodeT(Node11 data)
	 	{
	 		this.data=data;
	 	}
	 	public static NodeT headT;
	 	public static NodeT insert(NodeT head,Node11 data)
	 	{
	 		if(head==null)
	 		{
	 			NodeT n=new NodeT(data);
	 			head=n;
	 			return head;
	 		}
	 		else
	 		{
	 			NodeT temp=head;
	 			while(temp.next!=null)
	 			{
	 				temp=temp.next;
	 			}
	 			NodeT n=new NodeT(data);
	 			temp.next=n;
	 		}
	 		return head;
	 	}
	 	
	 }

	Node11 next=null;
	char data;
	Node11(char data)
	{
		this.data=data;
	}
	public static Node11 head;
	public static NodeT headT;
	public static Node11 insert(Node11 head,char data)
	{
		if(head==null)
		{
			Node11 n=new Node11(data);
			head=n;
			return head;
		}
		else
		{
			Node11 temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			Node11 n=new Node11(data);
			temp.next=n;
		}
		return head;
	}
	public static NodeT sort(NodeT headT)
	{
		NodeT temp=headT;
		int max=-1;
		//Node11 temp2= head;
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		while(temp.next!=null)
		{
			String s="";
			Node11 temp2=temp.data;
			while(temp2!=null)
			{
				s+=temp2.data;
				temp2=temp2.next;
			}
			if(!hm.containsKey(s))
			hm.put(s,s.length());
			else
			{
				int j=hm.get(s);
				hm.put(s,j+1);
			}
			if(max<s.length())
				max=s.length();
			temp=temp.next;
		}
//		 Set<String> keys = hm.keySet();
//	        for(String key: keys){
//	            System.out.println(key);
//		for(int i=0;i<max;i++)
//		{
//			
//		}
		Map<String, Integer> hm1 = sortByValue(hm); 
//		 headT.next=null;
//		 Node11 temp3;
//		 headT.data=temp3;
		headT=null;
		NodeT temp3=headT;
		//Node11 temp2
		head=null;
        // print the sorted hashmap 
        for (Map.Entry<String, Integer> en : hm1.entrySet())
        { 
        	String s=en.getKey();
        	Node11 temp2=head;
        	for(int i=0;i<s.length();i++)
        	{
        		temp2=insert(temp2,s.charAt(i));
        	}
        	temp3=NodeT.insert(temp3,temp2);
//        	temp3.data=temp2;
//        	//temp3=temp3.next;
//            //System.out.println("Key = " + en.getKey() +", Value = " + en.getValue());
        }
        headT=temp3;
		return headT;
	
	}
	 public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) 
	    { 
	        // Create a list from elements of HashMap 
	        List<Map.Entry<String, Integer> > list = 
	               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet()); 
	  
	        // Sort the list 
	        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
	            public int compare(Map.Entry<String, Integer> o1,  
	                               Map.Entry<String, Integer> o2) 
	            { 
	                return (o1.getValue()).compareTo(o2.getValue()); 
	            } 
	        }); 
	          
	        // put data from sorted list to hashmap  
	        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
	        for (Map.Entry<String, Integer> aa : list) { 
	            temp.put(aa.getKey(), aa.getValue()); 
	        } 
	        return temp; 
	    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of internal lists");
		int n=sc.nextInt();
		Node11 temp=head;
		headT=null;
		NodeT temp2=headT;
		System.out.println("enter each list in new line");
		for(int i=0;i<n;i++)
		{
			String s=sc.nextLine();
			char c[]=s.toCharArray();
			for(int j=0;j<c.length;j++)
			{
				if(c[i]!=' ')
				temp=Node11.insert(temp,c[i]);
			}
			temp2=NodeT.insert(temp2,temp);
		}
		temp2=sort(temp2);
		while(temp2!=null)
		{
			System.out.print(temp2.data+" ");
		}
	}
}
