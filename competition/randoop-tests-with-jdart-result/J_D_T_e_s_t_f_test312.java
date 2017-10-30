import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.FixMethodOrder;

public class J_D_T_e_s_t_f_test312 {

	public static boolean debug = false;

	public static void f_test312(int x1) {
	    if (debug)
	        System.out.format("%n%s%n", "RegressionTest0.test313");
	    Year year1 = new Year(x1);
	    java.lang.Object obj2 = new java.lang.Object();
	    boolean b3 = year1.equals(obj2);
	    boolean b4 = year1.isValid();
	}

	@Test
	public void test_f_test312_0() {
		try{
			f_test312(100);
		}
			catch(Throwable e){}
		}

}
