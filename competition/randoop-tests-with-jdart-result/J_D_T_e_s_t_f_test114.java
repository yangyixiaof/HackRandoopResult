import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.FixMethodOrder;

public class J_D_T_e_s_t_f_test114 {

	public static boolean debug = false;

	public static void f_test114(int x1, int x2, long x3, int x4) {
	    if (debug)
	        System.out.format("%n%s%n", "RegressionTest0.test115");
	    Year year3 = new Year(x1);
	    boolean b4 = year3.isValid();
	    Month month5 = new Month(x2, year3);
	    boolean b7 = month5.equals((java.lang.Object) x3);
	    int i8 = month5.getMonth();
	    boolean b9 = month5.isValid();
	    boolean b10 = month5.isValid();
	    boolean b11 = month5.isValid();
	    int i12 = month5.getMonth();
	    try {
	        Day day13 = new Day(x4, month5);
	    } catch (java.lang.IllegalArgumentException e) {
	    }
	}

	@Test
	public void test_f_test114_0() {
		try{
			f_test114(100,10,10,-1);
		}
			catch(Throwable e){}
		}

}
