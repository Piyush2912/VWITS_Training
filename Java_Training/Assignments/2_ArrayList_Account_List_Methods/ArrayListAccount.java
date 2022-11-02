package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAccount {
	public static void main(String args[]) {
		List<Account> lst = new ArrayList<Account>();

        Account a1 = new Account(101,"Abhinav Sharma",25000,"HDFC");
        
        lst.add(a1); // appends element to end of list

        Account a = new Account(102,"Rishabh Singh",15000,"SBI");

        lst.add(a);

        lst.add(new Account(103,"Shreya Dhingra",35000,"PNB"));
        lst.add(new Account(104,"John Smith",25000,"HDFC"));


        System.out.println(lst);

        System.out.println(lst.size());      

        boolean isPresent = lst.contains(new Account(101,"Abhinav Sharma",25000,"HDFC"));
        System.out.println("Account with name Abhinav Sharma is Present or not? = "+isPresent);
	
        // Commonly Used ArrayList methods
        lst.add(2,new Account(105,"Tom Cruise",40000,"SBI")); // inserts element at specific index
    
        System.out.println(lst.get(2)); // .get() returns element present at that index
        System.out.println(lst.indexOf(a)); // returns first occurance of that element in list or -1 if not present in list
        
        lst.clear(); // removes all element in list
        System.out.println("Is list now empty:" + lst.isEmpty()); 
        
	}
}
