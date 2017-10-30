import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.FixMethodOrder;

public class J_D_T_e_s_t_f_test206 {

	public static boolean debug = false;

	public static void f_test206(int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8, int x9, int x10) {
	    if (debug)
	        System.out.format("%n%s%n", "RegressionTest0.test207");
	    Date date3 = new Date(x1, x2, x3);
	    Year year4 = date3.getYear();
	    boolean b6 = date3.equals((java.lang.Object) "hi!");
	    Day day7 = date3.getDay();
	    Year year11 = new Year(x4);
	    boolean b12 = year11.isValid();
	    Month month13 = new Month(x5, year11);
	    day7.setDay(x6, month13);
	    java.lang.Object obj15 = null;
	    boolean b16 = day7.equals(obj15);
	    boolean b17 = day7.increment();
	    int i18 = day7.getDay();
	    int i19 = day7.getDay();
	    int i20 = day7.getDay();
	    Year year23 = new Year(x7);
	    int i24 = year23.getYear();
	    Year year27 = new Year(x8);
	    boolean b28 = year27.isValid();
	    boolean b29 = year27.isLeap();
	    int i30 = year27.getYear();
	    boolean b31 = year27.isLeap();
	    Month month32 = new Month(x9, year27);
	    int i33 = month32.getMonthSize();
	    boolean b34 = year23.equals((java.lang.Object) month32);
	    try {
	        day7.setDay(x10, month32);
	    } catch (java.lang.IllegalArgumentException e) {
	    }
	}

	@Test
	public void test_f_test206_0() {
		try{
			f_test206(10,10,1,100,10,10,100,1,1,52);
		}
			catch(Throwable e){}
		}

}
