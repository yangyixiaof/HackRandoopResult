import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.FixMethodOrder;

public class J_D_T_e_s_t_f_test93 {

	public static boolean debug = false;

	public static void f_test93(int x1, int x2) {
	    if (debug)
	        System.out.format("%n%s%n", "RegressionTest0.test094");
	    Year year2 = new Year(x1);
	    boolean b3 = year2.isLeap();
	    boolean b4 = year2.isLeap();
	    boolean b5 = year2.increment();
	    java.lang.Object obj6 = null;
	    boolean b7 = year2.equals(obj6);
	    int i8 = year2.getYear();
	    try {
	        Month month9 = new Month(x2, year2);
	    } catch (java.lang.IllegalArgumentException e) {
	    }
	}

	@Test
	public void test_f_test93_0() {
		try{
			f_test93(1,100);
		}
			catch(Throwable e){}
		}

}
