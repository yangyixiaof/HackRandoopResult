import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.FixMethodOrder;

public class J_D_T_e_s_t_f_test78 {

	public static boolean debug = false;

	public static void f_test78(int x1, int x2, long x3, int x4, int x5) {
	    if (debug)
	        System.out.format("%n%s%n", "RegressionTest0.test079");
	    Year year2 = new Year(x1);
	    boolean b3 = year2.isValid();
	    Month month4 = new Month(x2, year2);
	    boolean b6 = month4.equals((java.lang.Object) x3);
	    boolean b7 = month4.isValid();
	    int i8 = month4.getMonthSize();
	    Year year11 = new Year(x4);
	    boolean b12 = year11.isValid();
	    boolean b13 = year11.isValid();
	    boolean b14 = year11.isValid();
	    boolean b15 = year11.isValid();
	    int i16 = year11.getYear();
	    boolean b17 = year11.increment();
	    boolean b18 = year11.increment();
	    boolean b19 = year11.increment();
	    boolean b20 = year11.increment();
	    try {
	        month4.setMonth(x5, year11);
	    } catch (java.lang.IllegalArgumentException e) {
	    }
	}

	@Test
	public void test_f_test78_0() {
		try{
			f_test78(100,10,10,1,100);
		}
			catch(Throwable e){}
		}

}
