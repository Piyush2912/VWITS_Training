package langfundamental;

public class EvenOdd {
	public static void main(String args[]) {
		int n1 = 1;

		if(n1 % 2 == 0) {
			System.out.println(n1 + " is even");
		}
		else {
			System.out.println(n1 + " is odd");
		}

		// addition of first 5 even and first 5 odd numbers
		int sumeven =0, sumodd = 0;
		for(int i=n1;i<(n1+10);i++) {
			if(i % 2 == 0) {
				sumeven += i;
			}else {
				sumodd += i;
			}
		}
		// 2 + 4 + 6 + 8 + 10 = 30
		System.out.println("Addition of first 5 Even Numbers = " + sumeven);
		// 1 + 3 + 5 + 7 + 9 = 25
		System.out.println("Addition of first 5 Odd Numbers = " + sumodd);
	}

}
