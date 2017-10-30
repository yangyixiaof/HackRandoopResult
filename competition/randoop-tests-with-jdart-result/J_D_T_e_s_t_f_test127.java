import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.FixMethodOrder;

public class J_D_T_e_s_t_f_test127 {

	public static boolean debug = false;

	public static void f_test127(int x1, int x2, int x3) {
	    if (debug)
	        System.out.format("%n%s%n", "RegressionTest0.test128");
	    try {
	        Date date3 = new Date(x1, x2, x3);
	    } catch (java.lang.IllegalArgumentException e) {
	    }
	}

	@Test
	public void test_f_test127_0() {
		try{
			f_test127(31,101,100);
		}
			catch(Throwable e){}
		}

}
