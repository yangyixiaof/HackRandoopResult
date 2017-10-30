import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.FixMethodOrder;

public class J_D_T_e_s_t_f_test37 {

	public static boolean debug = false;

	public static void f_test37(int x1, int x2, int x3, int x4, int x5, long x6, int x7) {
	    if (debug)
	        System.out.format("%n%s%n", "RegressionTest0.test038");
	    Date date3 = new Date(x1, x2, x3);
	    Year year4 = date3.getYear();
	    boolean b6 = date3.equals((java.lang.Object) "hi!");
	    Day day7 = date3.getDay();
	    Year year11 = new Year(x4);
	    boolean b12 = year11.isValid();
	    Month month13 = new Month(x5, year11);
	    boolean b15 = month13.equals((java.lang.Object) x6);
	    boolean b16 = month13.isValid();
	    try {
	        day7.setDay(x7, month13);
	    } catch (java.lang.IllegalArgumentException e) {
	    }
	}

	@Test
	public void test_f_test37_0() {
		try{
			f_test37(10,10,1,100,10,10,100);
		}
			catch(Throwable e){}
		}

}
