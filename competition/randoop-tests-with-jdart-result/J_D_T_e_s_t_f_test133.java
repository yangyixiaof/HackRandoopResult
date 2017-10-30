import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.FixMethodOrder;

public class J_D_T_e_s_t_f_test133 {

	public static boolean debug = false;

	public static void f_test133(int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8, long x9, int x10, int x11, int x12, int x13, int x14, int x15,
	        int x16) {
	    if (debug)
	        System.out.format("%n%s%n", "RegressionTest0.test134");
	    Date date3 = new Date(x1, x2, x3);
	    Date date4 = Nextday.nextDay(date3);
	    Year year8 = new Year(x4);
	    boolean b9 = year8.isValid();
	    boolean b10 = year8.isLeap();
	    int i11 = year8.getYear();
	    boolean b12 = year8.isLeap();
	    Month month13 = new Month(x5, year8);
	    Day day14 = new Day(x6, month13);
	    boolean b15 = day14.isValid();
	    Year year19 = new Year(x7);
	    boolean b20 = year19.isValid();
	    Month month21 = new Month(x8, year19);
	    boolean b23 = month21.equals((java.lang.Object) x9);
	    int i24 = month21.getMonth();
	    boolean b25 = month21.isValid();
	    day14.setDay(x10, month21);
	    boolean b27 = date4.equals((java.lang.Object) month21);
	    boolean b28 = month21.isValid();
	    boolean b29 = month21.isValid();
	    Year year32 = new Year(x11);
	    Date date36 = new Date(x12, x13, x14);
	    boolean b37 = year32.equals((java.lang.Object) x15);
	    int i38 = year32.getYear();
	    try {
	        month21.setMonth(x16, year32);
	    } catch (java.lang.IllegalArgumentException e) {
	    }
	}

	@Test
	public void test_f_test133_0() {
		try{
			f_test133(10,10,1,1,1,31,100,10,10,1,100,10,10,1,10,-1);
		}
			catch(Throwable e){}
		}

}
