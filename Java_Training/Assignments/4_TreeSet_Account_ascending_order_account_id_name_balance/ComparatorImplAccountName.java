package collections1;
import java.util.Comparator;
public class ComparatorImplAccountName implements Comparator<Account> {
	
	@Override
	public int compare(Account a1, Account a2) {
		System.out.println("comparing a1.getName():" + a1.getName() + " with a2.getName():" + a2.getName());
		return a1.getName().compareTo(a2.getName());
	}

}
