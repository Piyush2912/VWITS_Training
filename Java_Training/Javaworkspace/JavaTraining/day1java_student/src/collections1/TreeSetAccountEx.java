package collections1;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

import collection.ComparatorImpl;
import collection.ComparatorImplEmpNames;
import collection.Employee;

public class TreeSetAccountEx {
	public static void main(String args[]) {
		SortedSet<Account> tsa = new TreeSet<Account>();
		
		Account a1 = new Account(101,"Abhinav Sharma",25000,"HDFC");
		tsa.add(a1);

        tsa.add(new Account(103,"Sidhika Rawat",35000,"PNB"));
        
        Account a2 = new Account(102,"Rishabh Singh",15000,"SBI");
        tsa.add(a2);

        tsa.add(new Account(101,"Abhinav Sharma",25000,"HDFC"));
		

		// since Account class implements Comparable<Account> so overrided compareTo() with account_no so it is sorted in ascending order of account_no
		System.out.println(tsa);
		System.out.println(tsa.size());
		System.out.println("Abhinav Sharma with Account_no:101 already exist: "+ tsa.contains(new Account(101,"Abhinav Sharma",25000,"HDFC"))); // case sensitive
		
		// Using Comparator interface to sort on basis of balance
		System.out.println("Using Comparator interface to sort based on Account Balance..");

        meth(new ComparatorImplAccountSalary());

        // Using Comparator interface to sort on basis of Names
        System.out.println("Using Comparator interface to sort based on Account Names..");

        meth(new ComparatorImplAccountName());
		
	}
	
	public static void meth(Comparator<Account> a) {

        //TreeSet  using Comparator interface
		
		// Passing Comparator as a constructor to tell compiler to sort on basis of Comparator a
		SortedSet<Account> ssta = new TreeSet<Account>(a);
		
		Account a1 = new Account(101,"Abhinav Sharma",25000,"HDFC");
		ssta.add(a1);

        ssta.add(new Account(103,"Sidhika Rawat",35000,"PNB"));
        
        Account a2 = new Account(102,"Rishabh Singh",15000,"SBI");
        ssta.add(a2);

        ssta.add(new Account(101,"Abhinav Sharma",25000,"HDFC"));
		
        System.out.println(ssta);
		System.out.println(ssta.size());
		System.out.println("Abhinav Sharma with Account_no:101 already exist: "+ ssta.contains(new Account(101,"Abhinav Sharma",25000,"HDFC"))); 
		


	}
}
