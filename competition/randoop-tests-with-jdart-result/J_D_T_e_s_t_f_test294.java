import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.FixMethodOrder;

public class J_D_T_e_s_t_f_test294 {

	public static boolean debug = false;

	public static void f_test294(int x1, int x2) {
	    if (debug)
	        System.out.format("%n%s%n", "RegressionTest0.test295");
	    Year year2 = new Year(x1);
	    boolean b3 = year2.isValid();
	    boolean b4 = year2.isValid();
	    boolean b5 = year2.isValid();
	    boolean b6 = year2.isValid();
	    int i7 = year2.getYear();
	    Month month8 = new Month(x2, year2);
	    int i9 = month8.getMonth();
	    boolean b10 = month8.isValid();
	    int i11 = month8.getMonth();
	    int i12 = month8.getMonthSize();
	}

	@Test
	public void test_f_test294_0() {
		try{
			f_test294(1,10);
		}
			catch(Throwable e){}
		}

}
