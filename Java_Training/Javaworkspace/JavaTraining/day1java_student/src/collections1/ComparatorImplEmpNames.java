package collections1;

import java.util.Comparator;

public class ComparatorImplEmpNames implements Comparator<Employee> {
	@Override
	public int compare(Employee e1,Employee e2) {
		System.out.println("comparing e1.getEmpname():" + e1.getEmpname() + " with e2.getEmpname():" + e2.getEmpname());
		return e1.getEmpname().compareTo(e2.getEmpname());
	}
}
