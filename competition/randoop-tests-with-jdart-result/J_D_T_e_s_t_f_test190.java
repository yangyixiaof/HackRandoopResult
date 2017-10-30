import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.FixMethodOrder;

public class J_D_T_e_s_t_f_test190 {

	public static boolean debug = false;

	public static void f_test190(int x1, int x2, int x3) {
	    if (debug)
	        System.out.format("%n%s%n", "RegressionTest0.test191");
	    try {
	        Date date3 = new Date(x1, x2, x3);
	    } catch (java.lang.IllegalArgumentException e) {
	    }
	}

	@Test
	public void test_f_test190_0() {
		try{
			f_test190(97,32,1);
		}
			catch(Throwable e){}
		}

}
