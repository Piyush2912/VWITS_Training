package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAccount {
	public static void main(String args[]) {
		List<Account> lst = new ArrayList<Account>();

        Account a1 = new Account(101,"Abhinav Sharma",25000,"HDFC");

        lst.add(a1);

        Account a = new Account(102,"Rishabh Singh",15000,"SBI");

        lst.add(a);

        lst.add(new Account(103,"Shreya Dhingra",35000,"PNB"));
        lst.add(new Account(104,"John Smith",25000,"HDFC"));


        System.out.println(lst);

        System.out.println(lst.size());      

        boolean isPresent = lst.contains(new Account(101,"Abhinav Sharma",25000,"HDFC"));
        System.out.println("Account with name Abhinav Sharma is Present or not? = "+isPresent);
	}
}
