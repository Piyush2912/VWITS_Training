package collection;
import java.util.*;

public class TreeSetEx {
	public static void main(String args[]) {
		SortedSet<String> sortset = new TreeSet<String>();
		
		sortset.add("Zaif");
		sortset.add("Piyush");
		sortset.add("Anirudh");
		sortset.add("Lokesh");
		sortset.add("Ram");
		sortset.add("John");
		
		System.out.println(sortset);
		
		sortset.add("Don");
		
		System.out.println(sortset);
		System.out.println(sortset.size());
		System.out.println(sortset.contains("Piyush")); // case sensitive
		
		
	}
}
