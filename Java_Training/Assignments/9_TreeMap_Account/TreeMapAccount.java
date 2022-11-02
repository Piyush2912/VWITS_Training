package collections1;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapAccount {
	public static void main(String args[]) {
		   SortedMap<Account,Double> mp = new TreeMap<Account,Double>();

		   Account a2 = new Account(102,"Tom Cruise",15000,"PNB");

	       mp.put(a2,a2.getBalance()); 
		   
		   Account a1 = new Account(101,"Abhinav Sharma",25000,"HDFC");

	        mp.put(a1,a1.getBalance());

	        mp.put(new Account(103,"Ankit Shah",35000,"SBI"),35000.0);
	        mp.put(new Account(104,"John Doe",25000,"UNI"),25000.0);
	        
	        System.out.println(mp);


	        //sort account keys of tree map in ascending order of account name

	        System.out.println("sort account keys of tree map in ascending order of account name");
	        Comparator<Account> c = new ComparatorImplAccountName();
	        mp = new TreeMap<Account,Double>(c);

	        Account a11 =  new Account(102,"Tom Cruise",15000,"PNB");

	        mp.put(a11,a11.getBalance());

	        Account b11 = new Account(105,"Tom Hanks",15000,"SBI");

	        mp.put(b11,b11.getBalance());


	        mp.put (new Account(105,"Ron Bob",15000,"PNB"),35000.0);
	        mp.put (new Account(106,"Sam Smith",25000,"SBI"),25000.0);

	        System.out.println(mp);

	}
}
