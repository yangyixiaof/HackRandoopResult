import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.FixMethodOrder;

public class J_D_T_e_s_t_f_test9 {

	public static boolean debug = false;

	public static void f_test9(int x1, int x2) {
	    if (debug)
	        System.out.format("%n%s%n", "RegressionTest0.test010");
	    Year year2 = new Year(x1);
	    boolean b3 = year2.isValid();
	    boolean b4 = year2.isValid();
	    boolean b5 = year2.isLeap();
	    try {
	        Month month6 = new Month(x2, year2);
	    } catch (java.lang.IllegalArgumentException e) {
	    }
	}

	@Test
	public void test_f_test9_0() {
		try{
			f_test9(1,-1);
		}
			catch(Throwable e){}
		}

}
