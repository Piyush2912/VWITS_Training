//package interfaceex;
// 
//import java.util.Scanner;
// 
//public class InterfaceMain {
// 
//    public static void main(String[] args) {
// 
//        
//        Bounceable bref;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter color of ball:-");
//
//        String c = sc.next();
//
//        bref = new Ball(c);  //2
//
//        System.out.println("Enter bounce factor multiple for ball:-");
//
//        int multiple = sc.nextInt();
//
//        meth(bref,multiple);
//
//
// 
//    }
//
//
//    public static void meth(Bounceable b,int multiple)
//    {
//        b.setBounceMultiple(multiple);
//        b.bounce();
//
//    }
// 
//}

package interfacex;
import java.util.Scanner;
public class InterfaceMain {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		// reference bna lia
//		Bounceable bref;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter bounce multiple for ball:-");
//		
//		// check hasNext() proper input lena
//		// scanner se proper input validate krna h
//		// kese krna h = hasnext methods use krkre
//		int bf = sc.nextInt();
//		bref = new Ball(bf);
//		meth(bref,5);
//		
//		
//		sc.close();
//	}
	
	
	public static void main(String[] args) {
		 
		        
		        Bounceable bref;
		
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter color of ball:-");
		
		        String c = sc.next();
		
		        bref = new Ball(c);  //2
		
		        System.out.println("Enter bounce factor multiple for ball:-");
		
		        int multiple = sc.nextInt();
		
		        meth(bref,multiple);
		
		        
		        System.out.println("Enter color of Tire color:-");
		        String tc = sc.next();
		        bref = new Tire(tc);
		        System.out.println("Enter bounce factor multiple for tire:-");
		        int tireBounceMultiple = sc.nextInt();
		        meth(bref,tireBounceMultiple);
		        
		 
		    }
	
	public static void meth(Bounceable b,int multiple) {
		b.setBounceMultiple(multiple);
		b.bounce();
	}

}
