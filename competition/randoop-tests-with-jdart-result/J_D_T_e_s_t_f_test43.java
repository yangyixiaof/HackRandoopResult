import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.FixMethodOrder;

public class J_D_T_e_s_t_f_test43 {

	public static boolean debug = false;

	public static void f_test43(int x1, int x2, int x3, int x4, int x5, int x6) {
	    if (debug)
	        System.out.format("%n%s%n", "RegressionTest0.test044");
	    Year year2 = new Year(x1);
	    boolean b3 = year2.isValid();
	    Month month4 = new Month(x2, year2);
	    int i5 = month4.getMonth();
	    Year year8 = new Year(x3);
	    boolean b9 = year8.isLeap();
	    month4.setMonth(x4, year8);
	    int i11 = month4.getMonthSize();
	    Year year14 = new Year(x5);
	    int i15 = year14.getYear();
	    boolean b16 = year14.isValid();
	    try {
	        month4.setMonth(x6, year14);
	    } catch (java.lang.IllegalArgumentException e) {
	    }
	}

	@Test
	public void test_f_test43_0() {
		try{
			f_test43(100,10,1,10,1,100);
		}
			catch(Throwable e){}
		}

}
