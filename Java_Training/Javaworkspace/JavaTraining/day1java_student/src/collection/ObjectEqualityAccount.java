package collection;

public class ObjectEqualityAccount {
	 public static void main(String[] args) {


	       Account a1 = new Account(101,"Abhinav Sharma",25000,"HDFC");

	       Account a = a1;

	       System.out.println(a==a1); //true , == checks whether object is actually same (same memory)

	       a.setBalance(2500);
	 
	       System.out.println("a1's salary:"+a1.getBalance());


	       Account a2 = new Account(101,"Abhinav Sharma",25000,"HDFC");

	       System.out.println("==:"+(a1==a2)); //== gives false  //application pov a1 and a2 are meaningfully same

	       System.out.println("equals:"+a1.equals(a2)); //used to check if two reference are meaning fully same (in ur application)

	       //Object class equals method works similar to == operator
	       int no=5,no1=5;

	       System.out.println(no==no1);
	 
	    }
	 
}
