package collections1;
import java.util.*;
public class HashSetStrings {
	public static void main(String args[]) {
		Set<String> st = new HashSet<String>();
		st.add("Piyush");
		st.add("Rohan");
		st.add("Khushi");
		
		System.out.println(st);
		System.out.println(st.size());
		
		st.add("Rohan");

		System.out.println(st);
		System.out.println(st.size());
		
		
	}
}
