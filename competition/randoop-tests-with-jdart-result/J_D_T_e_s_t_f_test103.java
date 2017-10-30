import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.FixMethodOrder;

public class J_D_T_e_s_t_f_test103 {

	public static boolean debug = false;

	public static void f_test103(int x1, int x2) {
	    if (debug)
	        System.out.format("%n%s%n", "RegressionTest0.test104");
	    Year year1 = new Year(x1);
	    boolean b2 = year1.isValid();
	    boolean b3 = year1.isValid();
	    boolean b4 = year1.isLeap();
	    int i5 = year1.getYear();
	    boolean b6 = year1.increment();
	    try {
	        year1.setYear(x2);
	    } catch (java.lang.IllegalArgumentException e) {
	    }
	}

	@Test
	public void test_f_test103_0() {
		try{
			f_test103(1,0);
		}
			catch(Throwable e){}
		}

}
