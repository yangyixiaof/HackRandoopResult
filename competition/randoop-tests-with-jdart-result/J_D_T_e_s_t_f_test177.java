import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.FixMethodOrder;

public class J_D_T_e_s_t_f_test177 {

	public static boolean debug = false;

	public static void f_test177(int x1, int x2, int x3) {
	    if (debug)
	        System.out.format("%n%s%n", "RegressionTest0.test178");
	    Year year3 = new Year(x1);
	    boolean b4 = year3.isValid();
	    boolean b5 = year3.isLeap();
	    int i6 = year3.getYear();
	    boolean b7 = year3.isLeap();
	    Month month8 = new Month(x2, year3);
	    Day day9 = new Day(x3, month8);
	    java.lang.Object obj10 = null;
	    boolean b11 = month8.equals(obj10);
	}

	@Test
	public void test_f_test177_0() {
		try{
			f_test177(1,1,10);
		}
			catch(Throwable e){}
		}

}
