import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.FixMethodOrder;

public class J_D_T_e_s_t_f_test157 {

	public static boolean debug = false;

	public static void f_test157(int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8) {
	    if (debug)
	        System.out.format("%n%s%n", "RegressionTest0.test158");
	    Date date3 = new Date(x1, x2, x3);
	    Year year4 = date3.getYear();
	    boolean b6 = date3.equals((java.lang.Object) "hi!");
	    Day day7 = date3.getDay();
	    Month month8 = date3.getMonth();
	    Day day9 = date3.getDay();
	    boolean b10 = day9.isValid();
	    int i11 = day9.getDay();
	    int i12 = day9.getDay();
	    boolean b13 = day9.increment();
	    Year year17 = new Year(x4);
	    boolean b18 = year17.isValid();
	    boolean b19 = year17.isValid();
	    boolean b20 = year17.isValid();
	    boolean b21 = year17.isValid();
	    int i22 = year17.getYear();
	    Month month23 = new Month(x5, year17);
	    int i24 = month23.getMonth();
	    boolean b25 = month23.isValid();
	    Year year28 = new Year(x6);
	    boolean b29 = year28.isValid();
	    Month month30 = new Month(x7, year28);
	    boolean b31 = month30.increment();
	    boolean b32 = month30.increment();
	    boolean b33 = month23.equals((java.lang.Object) month30);
	    try {
	        day9.setDay(x8, month30);
	    } catch (java.lang.IllegalArgumentException e) {
	    }
	}

	@Test
	public void test_f_test157_0() {
		try{
			f_test157(10,10,1,1,10,100,10,-1);
		}
			catch(Throwable e){}
		}

}
