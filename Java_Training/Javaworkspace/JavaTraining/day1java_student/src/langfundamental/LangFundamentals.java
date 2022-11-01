package langfundamental;

public class LangFundamentals {
	public static void main(String args[]) {
		int a=5;//int literal
		float f=1.2f; //float literal
		float f1 = (float) 12.3;
		double d = 1.2;
		Double db = d; // Compiler will do this Double db = new Double(d); this is autoboxing
		// this was auto boxing casting is not preferred because of data loss
		int num=db.intValue();
		byte b = db.byteValue();
		String v = db.toString();
		
		//primitive datatype
		int x=12;
		
		//reference datatype
//		//Date today = new Date();
//		today --> day=22,month=june,year=2000
		
		Employee e = new Employee(11);
		Employee e1 = new Employee(11);
		Employee e2 = e;
		System.out.println("Check equality e and e1 = " + (e == e1));
		System.out.println("Check equality e and e1 = " + (e == e2));
		
	
	}
}
