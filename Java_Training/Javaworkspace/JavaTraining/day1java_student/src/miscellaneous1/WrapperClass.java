package miscellaneous1;

public class WrapperClass {
	public static void main(String args[]) {
		String s = " 10";	
		
		// String to Integer
		int no = Integer.parseInt(s.trim());
		System.out.println(++no);
		
		// Integer to String
		String s1 = "1010";
		int no1 = Integer.parseInt(s1,2);
		System.out.println(no1);
		
		Integer ob = no;
		String s2 = ob.toString();
		System.out.println("int "+no + " to string:"+s2);
		
		s2 = Integer.toBinaryString(no);
		System.out.println("primitive int:"+no+" to Binary String:"+s2);
		
		// Integer to Double
		int n = 100;
		double d = n;
		
		// double primitive to int
		double cost = 45.40;
		// int n1= (int)cost;
		
		Double dd = cost;
		int n1 = dd.intValue();
		System.out.println(n1);
//		dd.doubleValue();
//		dd.longValue();
//		dd.byteValue();
//		dd.shortValue();
		
		
		// double primitive to long
		long l = dd.longValue();
		System.out.println(l);
		
		// Integer to byte/short
		
		// int to short
		short sn = new Integer(123).shortValue();
		System.out.println("Integer to Byte:"+sn);
		
		// int to byte
		Integer val = 123;
		byte b =  val.byteValue();
		System.out.println("Integer to byte:"+b);
		
		
		char c = 'a';
		System.out.println(Character.toString(c));
		
	}
}
