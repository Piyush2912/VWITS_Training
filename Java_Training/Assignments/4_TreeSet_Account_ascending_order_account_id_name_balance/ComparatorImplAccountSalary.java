package collections1;

import java.util.Comparator;

public class ComparatorImplAccountSalary implements Comparator<Account>{
	
	@Override
	public int compare(Account a1,Account a2) {
		System.out.println("Comparing a1.getBalance():"+ a1.getBalance() + " with a2.getBalance():" + a2.getBalance());
		return (int)(a1.getBalance() - a2.getBalance());
	}

}
