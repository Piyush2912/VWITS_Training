package miscellaneous1;

import collections1.Employee;

public class StringStringBuilderEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Piyush";
		System.out.println(s + " Katariya");
		
		System.out.println(s);
		// Q1 - how many string objects get created?
		// ans: 3 strings object
		// Piyush
		//  Katariya
		// Piyush Katariya

	//	s = s + " Katariya"; // new string object created which is referencing s address
		
		String s1 = s + " Katariya";
		System.out.println(s);
		System.out.println(s1);
		
		// Q1 - how many string objects get created?
		// ans: 3 strings object
		// Q2 - how many are eligible for garbage collection?
		// ans: 1 - " Katariya"
		
		Employee e1 = new Employee(2,"Raja Maharaja",25000,10);
		System.out.println(e1);
		
		e1.setEmpname(s1);
		e1 = new Employee(2,"Raja Maharaja",25000,10);
		System.out.println(e1);
		
		// Q3 - how many objects are there of Employee class
		// ans: 2 
		// Q4 - how many objects are eligible for garbage collection?
		// ans: 1 - line 30: unreferenced object hogya 
		
		// only time garbage collection will take place = when it does not have live reference
		
		StringBuilder br = new StringBuilder();
		br.append(" is working");
		System.out.println(br);
		String ss = br.toString();
		System.out.println(ss);
		
		
		String s11 = "10";
		String s22 = " 10";
		int num1 = Integer.parseInt(s11);
		int num2 = Integer.parseInt(s22.trim());
		System.out.println(num1);
		System.out.println(num2);

		String s3 = "10.5";
		double d = Double.parseDouble(s3);

		double d1 = 12.5;
		Double dd = d1;
		String s4 = dd.toString();
		System.out.println("Double String val:" + s4);
		System.out.println(d1 + 0.5);
		System.out.println(d1 + "0.5");

		
	}

}
