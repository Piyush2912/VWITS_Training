package customeexception1;

public class NegativeBalanceException extends Exception{
	private double currBal;
	private double withAmt;
	private int acctno;
	public NegativeBalanceException(double currBal, double withAmt, int acctno) {
		super();
		this.currBal = currBal;
		this.withAmt = withAmt;
		this.acctno = acctno;
	}
	@Override
	public String toString() {
		return "NegativeBalanceException [currBal=" + currBal + ", withAmt=" + withAmt + ", acctno=" + acctno + "]";
	}

}
