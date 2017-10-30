import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.FixMethodOrder;

public class J_D_T_e_s_t_f_test125 {

	public static boolean debug = false;

	public static void f_test125(int x1, int x2, int x3, short x4, int x5, int x6, int x7, int x8, int x9, int x10) {
	    if (debug)
	        System.out.format("%n%s%n", "RegressionTest0.test126");
	    Date date3 = new Date(x1, x2, x3);
	    Year year4 = date3.getYear();
	    boolean b6 = date3.equals((java.lang.Object) "hi!");
	    java.lang.String str7 = date3.toString();
	    boolean b9 = date3.equals((java.lang.Object) x4);
	    Year year10 = date3.getYear();
	    Month month11 = date3.getMonth();
	    int i12 = month11.getMonthSize();
	    Year year16 = new Year(x5);
	    boolean b17 = year16.isLeap();
	    boolean b18 = year16.isLeap();
	    Date date22 = new Date(x6, x7, x8);
	    Year year23 = date22.getYear();
	    boolean b25 = date22.equals((java.lang.Object) "hi!");
	    date22.increment();
	    java.lang.String str27 = date22.toString();
	    boolean b28 = year16.equals((java.lang.Object) date22);
	    Month month29 = new Month(x9, year16);
	    try {
	        month11.setMonth(x10, year16);
	    } catch (java.lang.IllegalArgumentException e) {
	    }
	}

	@Test
	public void test_f_test125_0() {
		try{
			f_test125(10,10,1,100,1,10,10,1,10,0);
		}
			catch(Throwable e){}
		}

}
