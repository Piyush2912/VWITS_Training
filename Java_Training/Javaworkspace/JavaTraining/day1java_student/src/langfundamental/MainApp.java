package langfundamental;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// instance of a class
		Employee e = new Employee();
		// calling the method
		// e.display();
		
		System.out.println(e.empid);
		Employee r = new Employee();
		System.out.println("No of Employees created so far: " + Employee.cnt);
	}
	
}
