package langfundamental;

public class Addition {
	public static void main(String args[]) {
		int n1 = 1;
		int n2 = 2;
		int n3 = 3;
		int n4 = 4;
		int n5 = 5;
		System.out.println("Addition of first 5 digit: " + (n1+n2+n3+n4+n5));
		
		int res = 0;
		for(int i=1;i<6;i++) {
			res = res + i;
		}
		System.out.println("Addition of first 5 digit: " + res);
		
	}
}
