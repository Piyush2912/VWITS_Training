package collections1;
import java.util.*;
public class LinkedListUsingListEx {
	public static void main(String args[]) {
		List<Integer> lst = new LinkedList<Integer>();
		lst.add(100); // new Integer(100) -- autoboxing - box the primitive into object type
		lst.add(80);
		lst.add(30);
		lst.add(10);
		lst.add(1);
		System.out.println(lst);
		
		int no = (int)lst.get(0); // new Integer(100).intvalue() -- auto - unboxing - unbox Integer object to its primitive
		System.out.println("value at index position 0:" + no);
		
		System.out.println(lst.size());
		lst.remove(0);
		System.out.println(lst.size());
		lst.set(0, 130);
		System.out.println(lst);
		
		
		
		List<String> lst1 = new ArrayList<String>();
		lst1.add("Piyush");
		lst1.add("Deepak");
		lst1.add("Anirudh");
		
		System.out.println(lst1);
		
		
		
	}
}
