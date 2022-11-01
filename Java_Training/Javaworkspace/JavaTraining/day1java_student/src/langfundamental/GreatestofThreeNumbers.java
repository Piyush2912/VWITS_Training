package langfundamental;

public class GreatestofThreeNumbers {
	public static void main(String args[]) {
		int n1 = 1;
		int n2 = 3;
		int n3 = 5;
		
		// simple if-else approach
		if(n1 > n2 && n1 > n3) {
			System.out.println(n1 + " is the greatest");
		}else if(n2 > n3 && n2 > n1) {
			System.out.println(n2 + " is the greatest");
		}else if(n3 > n1 && n3 > n2){
			System.out.println(n3 + " is the greatest");
		}else if(n1 == n2 && n2==n3){
			System.out.println("All are equal");
		}else {
			System.out.println("Invalid Input");
		}
		
		// Nested if-else approach
		if(n1 > n2) { 
			if (n1 > n3) { // n2, n3 are smaller than n1
				System.out.println(n1 + " is the greatest");
			}else { // n2 is smaller than n1, and n3 is greater than n1 => n3 is greater than n2 => n3 is greatest
				System.out.println(n3 + " is the greatest");
			}
		}else { // n1 is smaller than n2
			if (n2 > n3) { // n3 is smaller than n2 => n2 is greatest
				System.out.println(n2 + " is the greatest");
			}else { // n2 is smaller than n3 => n3 is greatest
				System.out.println(n3 + " is the greatest");
			}
		}
	}
}
