import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.FixMethodOrder;

public class J_D_T_e_s_t_f_test149 {

	public static boolean debug = false;

	public static void f_test149(int x1, int x2, int x3, int x4, int x5, int x6, int x7) {
	    if (debug)
	        System.out.format("%n%s%n", "RegressionTest0.test150");
	    Year year3 = new Year(x1);
	    boolean b4 = year3.isValid();
	    boolean b5 = year3.isLeap();
	    int i6 = year3.getYear();
	    boolean b7 = year3.isLeap();
	    Month month8 = new Month(x2, year3);
	    Day day9 = new Day(x3, month8);
	    boolean b10 = day9.increment();
	    boolean b11 = day9.increment();
	    Date date16 = new Date(x4, x5, x6);
	    Year year17 = date16.getYear();
	    boolean b19 = date16.equals((java.lang.Object) "hi!");
	    Day day20 = date16.getDay();
	    Year year21 = date16.getYear();
	    Month month22 = date16.getMonth();
	    int i23 = month22.getMonth();
	    try {
	        day9.setDay(x7, month22);
	    } catch (java.lang.IllegalArgumentException e) {
	    }
	}

	@Test
	public void test_f_test149_0() {
		try{
			f_test149(1,1,31,10,10,1,100);
		}
			catch(Throwable e){}
		}

}
