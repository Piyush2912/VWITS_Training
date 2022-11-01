package langfundamental;

public class Employee {
	// instance properties, object properties 
	// for each object a different memory location is there
	int empid;
	
	// to find no of objects created for employee class
	// static variable is a class property,
	// static variable will have same memory location where if it is called multiple times 
	static int cnt = 0;
	
	
//	static {
//		System.out.println("static block called...");
//		cnt = 0;
//	}
	Employee(){
		empid = 1;
		cnt += 1;
	}
	Employee(int id){
		empid = id;
	}
	
	void display() {
		//
		System.out.println("id=" + empid + " kkk ");
		
	}
}
