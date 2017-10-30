import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.FixMethodOrder;

public class J_D_T_e_s_t_f_test289 {

	public static boolean debug = false;

	public static void f_test289(int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8, int x9) {
	    if (debug)
	        System.out.format("%n%s%n", "RegressionTest0.test290");
	    Date date3 = new Date(x1, x2, x3);
	    Year year4 = date3.getYear();
	    boolean b6 = date3.equals((java.lang.Object) "hi!");
	    Day day7 = date3.getDay();
	    Year year11 = new Year(x4);
	    boolean b12 = year11.isValid();
	    Month month13 = new Month(x5, year11);
	    day7.setDay(x6, month13);
	    int i15 = day7.getDay();
	    boolean b16 = day7.increment();
	    Year year20 = new Year(x7);
	    boolean b21 = year20.isValid();
	    Month month22 = new Month(x8, year20);
	    boolean b23 = month22.increment();
	    boolean b24 = month22.isValid();
	    try {
	        day7.setDay(x9, month22);
	    } catch (java.lang.IllegalArgumentException e) {
	    }
	}

	@Test
	public void test_f_test289_0() {
		try{
			f_test289(10,10,1,100,10,10,100,10,0);
		}
			catch(Throwable e){}
		}

}
