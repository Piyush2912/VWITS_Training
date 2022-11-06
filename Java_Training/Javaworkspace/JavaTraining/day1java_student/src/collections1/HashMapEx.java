package collections1;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
	public static void main(String args[]) {
		Map<Employee,Double> map = new HashMap<Employee,Double>();
		Employee e1 = new Employee(1,"Piyush katariya",35000,10);
		map.put(e1, e1.getSalary());
		Employee e2 = new Employee(2,"John Smith",10000,10);
		map.put(e2, e2.getSalary());
		
		map.put(new Employee(3,"Tom Cruise",15000,10),35000.0);
		map.put(new Employee(3,"Tom Cruise",15000,10),25000.0);
		// based on hashcode it will have problem of duplicates
		// qki duplicate key h isliye add ni hoga
		// qki hmne override kr rhka h hashCode() method isliye deptid agr same hogi to add ni hoga
		
		
		System.out.println(map);
		
		meth(map);
		
		System.out.println("contains key  : " + map.containsKey(new Employee(1,"Piyush katariya",35000,10)));
		System.out.println("contains value: " + map.containsValue(35000.0));
		
	}
	
	static void meth(Map<Employee, Double> map) {
		System.out.println("inside meth method: "+map.get(new Employee(1,"Piyush katariya",35000,10)));
		map.put(new Employee(5,"Spider Man",20000,30), 20000.0);
		
	}
}
