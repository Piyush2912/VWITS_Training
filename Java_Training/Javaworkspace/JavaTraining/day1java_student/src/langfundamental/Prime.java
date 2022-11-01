package langfundamental;

public class Prime {
	public static void main(String args[]) {
		int n = 2;
		
		boolean chkprime = true;
		if (n <= 1) {
			chkprime = false;
		}else {
			for(int i=2; i*i<n; i++) {
				if (n % i == 0) {
					chkprime = false;
					break;
				}
			}
		}
		System.out.println((chkprime ? "Prime" : "Not Prime"));
	}
}
