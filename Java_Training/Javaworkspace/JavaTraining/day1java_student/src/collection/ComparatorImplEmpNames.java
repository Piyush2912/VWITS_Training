package collection;
import java.util.*;
public class ComparatorImplEmpNames implements Comparator<Employee> {
	@Override
	public int compare(Employee e1,Employee e2) {
		return e1.getEmpname().compareTo(e2.getEmpname());
	}
}
