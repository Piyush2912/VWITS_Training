package customeexception1;

import java.util.Scanner;

import customeexception.Account;
import customeexception.InsufficientBalanceException;

public class CustomExceptionEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Account1 ob = new Account1("Prateek Joshi",1001,2000);
		
		Scanner sc = new Scanner(System.in);
		String r;
		
		do
		{
			System.out.println("Enter the amt to withdraw in multiples of 1000:");
			double amt = sc.nextDouble();
			
			try
			{
			amt = ob.withdraw(amt);
			}
			catch(ZeroBalanceException e) {
				System.out.println(e);
				break;
			}
			catch(NegativeBalanceException e) {
				System.out.println(e);
				break;
			}
			catch(InsufficientBalanceException e)
			{
				System.out.println(e);
				break;
			}
			System.out.println("Do you wish to continue:(y/n):");
			 r =  sc.next();
			
			
		}while(r.charAt(0)=='y'||r.charAt(0)=='Y');

		
		sc.close();
		System.out.println("program ends here..");
	}

}