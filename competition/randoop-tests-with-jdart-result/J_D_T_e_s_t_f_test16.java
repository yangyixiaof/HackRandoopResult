import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.FixMethodOrder;

public class J_D_T_e_s_t_f_test16 {

	public static boolean debug = false;

	public static void f_test16(int x1) {
	    if (debug)
	        System.out.format("%n%s%n", "RegressionTest0.test017");
	    Year year1 = null;
	    try {
	        Month month2 = new Month(x1, year1);
	    } catch (java.lang.IllegalArgumentException e) {
	    }
	}

	@Test
	public void test_f_test16_0() {
		try{
			f_test16(1);
		}
			catch(Throwable e){}
		}

}
