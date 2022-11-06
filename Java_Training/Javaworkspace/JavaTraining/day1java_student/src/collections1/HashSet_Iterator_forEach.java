package collections1;
import java.util.*;
public class HashSet_Iterator_forEach {
	public static void main(String args[]) {
		Set<Integer> hs = new HashSet<Integer>();
		hs.add(80);
		hs.add(50);
		hs.add(20);
		hs.add(40);
		hs.add(2);
		hs.add(100);
		hs.add(200);
		
		// for each loop using lambda expression
		// printing every element in set
		System.out.println("Contents of HashSet Using forEach are as folows:");
		
		hs.forEach(x -> System.out.println(x));
		
		// Iterator: used for traversing set

		System.out.println("Contents of HashSet Using Iterator are as folows:");
		HashSet<String> set=new HashSet<String>();    
        set.add("Anirudh");    
        set.add("Rahul");    
        set.add("Rocky");    
        set.add("Yash");    
        
        Iterator<String> itr=set.iterator();    
        while(itr.hasNext()){    
           System.out.println(itr.next());    
        }    
		
	}

}
