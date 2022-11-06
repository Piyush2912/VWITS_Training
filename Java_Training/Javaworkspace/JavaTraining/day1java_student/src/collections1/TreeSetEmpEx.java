package collections1;
import java.util.*;

public class TreeSetEmpEx {
	public static void main(String args[]) {
		SortedSet<Employee> sst = new TreeSet<Employee>();
		
		Employee e1 = new Employee(2,"Rohan Singh",25000,10);

		sst.add(e1);

        Employee e = new Employee(1,"Aryan Sinha",15000,10);

        sst.add(e);

        sst.add(new Employee(3,"Sidhika Sharma",35000,20));
        sst.add(new Employee(2,"Rohan Singh",25000,10));
		
		System.out.println(sst);
		System.out.println(sst.size());
		System.out.println(sst.contains(new Employee(2,"Rohan Singh",25000,10))); // case sensitive
		
		// TreeSet that uses Comparator
		System.out.println("Using Comparator interface ro sort based on employee salary");
		
		Comparator<Employee> c = new ComparatorImpl();
		
		SortedSet<Employee> sst1 = new TreeSet<Employee>(c); // passed c as constructor to tell compiler 
		
		Employee e11 = new Employee(2,"Rohan Singh",25000,10);

		sst1.add(e11);

        Employee e22 = new Employee(1,"Aryan Sinha",15000,10);

        sst1.add(e22);
        
        //c.compare(e11,e22) iske basis p sorting krega
        
        sst1.add(new Employee(3,"Sidhika Sharma",35000,20));
        sst1.add(new Employee(2,"Rohan Singh",25000,10));
		
		System.out.println(sst1);
		System.out.println(sst1.size());
		System.out.println(sst1.contains(new Employee(2,"Rohan Singh",25000,10))); // case sensitive
		
	}
}
