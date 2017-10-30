import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.FixMethodOrder;

public class J_D_T_e_s_t_f_test102 {

	public static boolean debug = false;

	public static void f_test102(int x1, int x2, int x3, int x4, int x5) {
	    if (debug)
	        System.out.format("%n%s%n", "RegressionTest0.test103");
	    Year year2 = new Year(x1);
	    boolean b3 = year2.isValid();
	    boolean b4 = year2.isLeap();
	    int i5 = year2.getYear();
	    boolean b6 = year2.isLeap();
	    Month month7 = new Month(x2, year2);
	    Year year10 = new Year(x3);
	    boolean b11 = year10.isLeap();
	    int i12 = year10.getYear();
	    boolean b14 = year10.equals((java.lang.Object) x4);
	    boolean b15 = year10.isValid();
	    try {
	        month7.setMonth(x5, year10);
	    } catch (java.lang.IllegalArgumentException e) {
	    }
	}

	@Test
	public void test_f_test102_0() {
		try{
			f_test102(1,1,1,1,0);
		}
			catch(Throwable e){}
		}

}
