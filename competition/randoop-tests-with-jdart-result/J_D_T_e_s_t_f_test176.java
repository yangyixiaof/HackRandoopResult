import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.FixMethodOrder;

public class J_D_T_e_s_t_f_test176 {

	public static boolean debug = false;

	public static void f_test176(int x1, int x2) {
	    if (debug)
	        System.out.format("%n%s%n", "RegressionTest0.test177");
	    Year year2 = new Year(x1);
	    boolean b3 = year2.isValid();
	    boolean b4 = year2.isLeap();
	    int i5 = year2.getYear();
	    boolean b6 = year2.isLeap();
	    java.lang.Object obj7 = null;
	    boolean b8 = year2.equals(obj7);
	    try {
	        Month month9 = new Month(x2, year2);
	    } catch (java.lang.IllegalArgumentException e) {
	    }
	}

	@Test
	public void test_f_test176_0() {
		try{
			f_test176(1,101);
		}
			catch(Throwable e){}
		}

}
