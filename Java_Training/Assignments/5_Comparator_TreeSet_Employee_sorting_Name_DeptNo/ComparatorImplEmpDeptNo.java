package collections1;
import java.util.Comparator;
public class ComparatorImplEmpDeptNo implements Comparator<Employee>{

		@Override
		public int compare(Employee e1,Employee e2) {
			System.out.println("Comparing e1.getDeptno:" + e1.getDeptno() + " with e2.getDeptno:" + e2.getDeptno());
			return e1.getDeptno() - e2.getDeptno();
		}
}
