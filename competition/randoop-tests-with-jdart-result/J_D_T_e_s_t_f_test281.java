import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.FixMethodOrder;

public class J_D_T_e_s_t_f_test281 {

	public static boolean debug = false;

	public static void f_test281(int x1) {
	    if (debug)
	        System.out.format("%n%s%n", "RegressionTest0.test282");
	    Year year1 = new Year(x1);
	    boolean b2 = year1.isValid();
	    boolean b3 = year1.isValid();
	    boolean b4 = year1.isLeap();
	    boolean b5 = year1.isLeap();
	    int i6 = year1.getYear();
	    boolean b7 = year1.increment();
	    boolean b8 = year1.increment();
	    boolean b9 = year1.isValid();
	    int i10 = year1.getYear();
	    int i11 = year1.getYear();
	}

	@Test
	public void test_f_test281_0() {
		try{
			f_test281(1);
		}
			catch(Throwable e){}
		}

}
