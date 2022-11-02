package collections1;
import java.util.*;
public class HashMapAccount {
	public static void main(String arg[]) {
		Map<Account,Double> map = new HashMap<Account,Double>();
		Account a1 = new Account(101,"Abhinav Sharma",25000,"HDFC");
		
		map.put(a1, 25000.0);
		map.put(new Account(102,"Rishabh Singh",15000,"SBI"), 15000.0);
		map.put(new Account(103,"Shubham Singh",30000,"SBI"), 30000.0);
		System.out.println(map);
		System.out.println("Abhinav exist in map:"+map.containsKey(a1));
		System.out.println("Account with balance amount 30000 exist:" + map.containsValue(30000.0));
	}
}
