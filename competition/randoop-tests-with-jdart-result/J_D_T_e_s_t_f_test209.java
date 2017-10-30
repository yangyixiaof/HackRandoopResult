import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.FixMethodOrder;

public class J_D_T_e_s_t_f_test209 {

	public static boolean debug = false;

	public static void f_test209(int x1, int x2, int x3, int x4) {
	    if (debug)
	        System.out.format("%n%s%n", "RegressionTest0.test210");
	    Year year4 = new Year(x1);
	    boolean b5 = year4.isValid();
	    Month month6 = new Month(x2, year4);
	    int i7 = month6.getMonth();
	    Day day8 = new Day(x3, month6);
	    boolean b9 = month6.increment();
	    boolean b10 = month6.increment();
	    boolean b11 = month6.isValid();
	    try {
	        Day day12 = new Day(x4, month6);
	    } catch (java.lang.IllegalArgumentException e) {
	    }
	}

	@Test
	public void test_f_test209_0() {
		try{
			f_test209(100,10,30,0);
		}
			catch(Throwable e){}
		}

}
