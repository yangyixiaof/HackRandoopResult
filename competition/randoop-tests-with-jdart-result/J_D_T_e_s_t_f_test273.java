import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.FixMethodOrder;

public class J_D_T_e_s_t_f_test273 {

	public static boolean debug = false;

	public static void f_test273(int x1, int x2, int x3, long x4, int x5, int x6, int x7, int x8) {
	    if (debug)
	        System.out.format("%n%s%n", "RegressionTest0.test274");
	    Date date3 = new Date(x1, x2, x3);
	    Year year4 = date3.getYear();
	    boolean b6 = date3.equals((java.lang.Object) "hi!");
	    Month month7 = date3.getMonth();
	    int i8 = month7.getMonthSize();
	    boolean b10 = month7.equals((java.lang.Object) x4);
	    boolean b11 = month7.increment();
	    Date date16 = new Date(x5, x6, x7);
	    Year year17 = date16.getYear();
	    date16.printDate();
	    Year year19 = date16.getYear();
	    Day day20 = date16.getDay();
	    Month month21 = date16.getMonth();
	    Year year22 = date16.getYear();
	    try {
	        month7.setMonth(x8, year22);
	    } catch (java.lang.IllegalArgumentException e) {
	    }
	}

	@Test
	public void test_f_test273_0() {
		try{
			f_test273(10,10,1,0,10,10,1,-1);
		}
			catch(Throwable e){}
		}

}
