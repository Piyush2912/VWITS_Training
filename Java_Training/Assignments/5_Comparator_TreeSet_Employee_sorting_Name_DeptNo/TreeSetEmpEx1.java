package collections1;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;


public class TreeSetEmpEx1 {
	 public static void main(String[] args) {
	        SortedSet<Employee> sst = new TreeSet<Employee>();

	        Employee e1 = new Employee(2,"Rohan Singh",25000,10);
	        sst.add(e1);

	        Employee e = new Employee(1,"Aryan Jain",15000,40);
	        sst.add(e);

	        sst.add(new Employee(6,"Sarah Kumar",35000,20));
	        sst.add(new Employee(2,"Rohan Singh",25000,10)); //duplicate

	        System.out.println(sst);

	        sst.add(new Employee(4,"Anirudh Singh",45000,60));

	        System.out.println(sst);

	        System.out.println(sst.size());

	        System.out.println(sst.contains(new Employee(6,"Tom Cruise",60000,50)));

	        
	        System.out.println("Using Comparator interface to sort based on employee's salary..");
	        Comparator<Employee> c = new ComparatorImpl();
	        meth(c);

	        System.out.println("Using Comparator interface to sort based on employee's names..");
	        meth(new ComparatorImplEmpNames());
	        
	        System.out.println("Using Comparator interface to sort based on employee's deptno..");
	        meth(new ComparatorImplEmpDeptNo());
	        
	    }
	 
	    
	    public static void meth(Comparator<Employee> c)
	    {

	        //TreeSet that uses Comparator interface
	    	SortedSet<Employee> sst = new TreeSet<Employee>(c);

	        Employee e1 = new Employee(2,"Rohan Singh",25000,10);
	        sst.add(e1);

	        Employee e = new Employee(1,"Aryan Jain",15000,40);
	        sst.add(e);

	        sst.add(new Employee(6,"Sarah Kumar",35000,20));
	        sst.add(new Employee(2,"Rohan Singh",25000,10)); //duplicate

	        System.out.println(sst);

	        sst.add(new Employee(4,"Anirudh Singh",45000,60));

	        System.out.println(sst);

	        System.out.println(sst.size());

	        System.out.println(sst.contains(new Employee(6,"Tom Cruise",60000,50)));


	    }
	}