package collections1;

public class Account implements Comparable<Account>{
	private int account_no;
	private String name;
	private double balance;
	private String bank_name;
	

	public Account(int account_no, String name, double balance, String bank_name) {
		super();
		this.account_no = account_no;
		this.name = name;
		this.balance = balance;
		this.bank_name = bank_name;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public int getAccount_no() {
		return account_no;
	}
	
	//a1.equals(a2)
    
    @Override
	public String toString() {
		return "Account [account_no=" + account_no + ", name=" + name + ", balance=" + balance + ", bank_name="
				+ bank_name + "]";
	}


	@Override
    public boolean equals(Object obj)  //obj = a2
    {
		if(obj instanceof Account) {
			return this.account_no == ((Account)obj).account_no;
		}else {
			return false;
		}
    }
	
	 @Override
	    public int compareTo(Account a) { // e= e2
	    	System.out.println("compareTo: Account with account_no:"+this.account_no+" compared with:"+a.account_no);
	    	return this.account_no - a.account_no; 
	    }
    
	
}
