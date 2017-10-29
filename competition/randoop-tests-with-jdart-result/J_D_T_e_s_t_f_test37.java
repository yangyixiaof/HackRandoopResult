import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.FixMethodOrder;

public class J_D_T_e_s_t_f_test37 {

	public static boolean debug = false;

	public static void f_test37(int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8) {
	    if (debug)
	        System.out.format("%n%s%n", "RegressionTest2.test071");
	    Date date3 = new Date(x1, x2, x3);
	    boolean b5 = date3.equals((java.lang.Object) x4);
	    Year year7 = new Year(x5);
	    boolean b8 = year7.isValid();
	    boolean b9 = year7.isLeap();
	    int i10 = year7.getYear();
	    boolean b11 = year7.isLeap();
	    boolean b12 = year7.isLeap();
	    boolean b13 = date3.equals((java.lang.Object) b12);
	    Date date14 = Nextday.nextDay(date3);
	    Day day15 = date14.getDay();
	    boolean b16 = day15.isValid();
	    boolean b18 = day15.equals((java.lang.Object) "10/12/1");
	    boolean b19 = day15.increment();
	    Year year23 = new Year(x6);
	    boolean b24 = year23.isValid();
	    Month month25 = new Month(x7, year23);
	    boolean b26 = month25.increment();
	    int i27 = month25.getMonthSize();
	    boolean b28 = month25.isValid();
	    boolean b29 = month25.increment();
	    day15.setDay(x8, month25);
	    int i31 = month25.getMonthSize();
	    int i32 = month25.getMonthSize();
	    int i33 = month25.getMonthSize();
	}

	@Test
	public void test_f_test37_0() {
		f_test37(0,0,0,0,0,0,0,0);
	}

	@Test
	public void test_f_test37_1() {
		f_test37(0,0,2,0,0,0,0,0);
	}

	@Test
	public void test_f_test37_2() {
		f_test37(67108876,0,2,0,0,0,0,0);
	}

	@Test
	public void test_f_test37_3() {
		f_test37(2,31,1,0,1,134217730,1,536870912);
	}

	@Test
	public void test_f_test37_4() {
		f_test37(1,31,5,0,1073772561,0,0,0);
	}

	@Test
	public void test_f_test37_5() {
		f_test37(1,31,5,0,1073772561,1,0,0);
	}

	@Test
	public void test_f_test37_6() {
		f_test37(1,31,5,0,1073772561,1,268435456,0);
	}

	@Test
	public void test_f_test37_7() {
		f_test37(8,31,1,0,1,-1778442400,1,0);
	}

	@Test
	public void test_f_test37_8() {
		f_test37(8,31,1,0,1,-54483968,1,1073741824);
	}

	@Test
	public void test_f_test37_9() {
		f_test37(8,31,1,0,1,-54483968,1,1);
	}

	@Test
	public void test_f_test37_10() {
		f_test37(8,31,1,0,1,-54483968,11,0);
	}

	@Test
	public void test_f_test37_11() {
		f_test37(1,31,5,0,1073772561,1,8,0);
	}

	@Test
	public void test_f_test37_12() {
		f_test37(8,31,1,0,1,461374474,11,0);
	}

	@Test
	public void test_f_test37_13() {
		f_test37(8,31,1,0,1,369041248,2,0);
	}

	@Test
	public void test_f_test37_14() {
		f_test37(8,31,1,0,1,369041248,2,1073741824);
	}

	@Test
	public void test_f_test37_15() {
		f_test37(8,31,1,0,1,369041248,2,1);
	}

	@Test
	public void test_f_test37_16() {
		f_test37(8,31,1,0,1,369041248,11,0);
	}

	@Test
	public void test_f_test37_17() {
		f_test37(8,31,1,0,1,275588500,1,0);
	}

	@Test
	public void test_f_test37_18() {
		f_test37(8,31,1,0,1,1500495700,1,536870912);
	}

	@Test
	public void test_f_test37_19() {
		f_test37(8,31,1,0,1,1500495700,1,1);
	}

	@Test
	public void test_f_test37_20() {
		f_test37(8,31,1,0,1,1500495700,11,0);
	}

	@Test
	public void test_f_test37_21() {
		f_test37(8,31,1,0,1,1442652000,2,0);
	}

	@Test
	public void test_f_test37_22() {
		f_test37(8,31,1,0,1,1442652000,2,1073741824);
	}

	@Test
	public void test_f_test37_23() {
		f_test37(8,31,1,0,1,1442652000,2,2);
	}

	@Test
	public void test_f_test37_24() {
		f_test37(8,31,1,0,1,1442652000,11,0);
	}

	@Test
	public void test_f_test37_25() {
		f_test37(4,30,5,0,1073772561,8,12,0);
	}

	@Test
	public void test_f_test37_26() {
		f_test37(1,30,2,0,204806,0,0,0);
	}

	@Test
	public void test_f_test37_27() {
		f_test37(1,30,2,0,204806,1,0,0);
	}

	@Test
	public void test_f_test37_28() {
		f_test37(1,30,2,0,204806,1,1073741824,0);
	}

	@Test
	public void test_f_test37_29() {
		f_test37(1,30,2,0,204806,-1332396048,8,0);
	}

	@Test
	public void test_f_test37_30() {
		f_test37(1,30,2,0,204806,-1332396048,8,1024);
	}

	@Test
	public void test_f_test37_31() {
		f_test37(1,30,2,0,204806,-1332396048,8,1);
	}

	@Test
	public void test_f_test37_32() {
		f_test37(1,30,2,0,204806,-1332396048,11,0);
	}

	@Test
	public void test_f_test37_33() {
		f_test37(1,30,2,0,204806,-66583693,9,0);
	}

	@Test
	public void test_f_test37_34() {
		f_test37(1,30,2,0,204806,-66583693,9,2048);
	}

	@Test
	public void test_f_test37_35() {
		f_test37(1,30,2,0,204806,-66583693,9,1);
	}

	@Test
	public void test_f_test37_36() {
		f_test37(1,30,2,0,204806,-66583693,11,0);
	}

	@Test
	public void test_f_test37_37() {
		f_test37(1,30,2,0,204806,-603454601,8,0);
	}

	@Test
	public void test_f_test37_38() {
		f_test37(1,30,2,0,204806,-603454601,8,1073741824);
	}

	@Test
	public void test_f_test37_39() {
		f_test37(1,30,2,0,204806,-603454601,8,1);
	}

	@Test
	public void test_f_test37_40() {
		f_test37(1,30,2,0,204806,-603454601,11,0);
	}

	@Test
	public void test_f_test37_41() {
		f_test37(1,30,2,0,204806,-603241601,9,0);
	}

	@Test
	public void test_f_test37_42() {
		f_test37(1,30,2,0,204806,-603241601,9,1073741824);
	}

	@Test
	public void test_f_test37_43() {
		f_test37(1,30,2,0,204806,-603241601,9,28);
	}

	@Test
	public void test_f_test37_44() {
		f_test37(1,30,2,0,204806,-603241601,11,0);
	}

	@Test
	public void test_f_test37_45() {
		f_test37(1,30,2,0,204806,1,5,0);
	}

	@Test
	public void test_f_test37_46() {
		f_test37(1,30,2,0,204806,1044514,8,1073741824);
	}

	@Test
	public void test_f_test37_47() {
		f_test37(1,30,2,0,204806,1044514,8,4);
	}

	@Test
	public void test_f_test37_48() {
		f_test37(1,30,2,0,204806,1044514,11,0);
	}

	@Test
	public void test_f_test37_49() {
		f_test37(1,30,2,0,204806,9781120,6,0);
	}

	@Test
	public void test_f_test37_50() {
		f_test37(1,30,2,0,204806,9781120,6,2048);
	}

	@Test
	public void test_f_test37_51() {
		f_test37(1,30,2,0,204806,9781120,6,1);
	}

	@Test
	public void test_f_test37_52() {
		f_test37(1,30,2,0,204806,9781120,11,0);
	}

	@Test
	public void test_f_test37_53() {
		f_test37(1,30,2,0,204806,815087500,6,0);
	}

	@Test
	public void test_f_test37_54() {
		f_test37(1,30,2,0,204806,815087500,6,1073741824);
	}

	@Test
	public void test_f_test37_55() {
		f_test37(1,30,2,0,204806,815087500,6,16);
	}

	@Test
	public void test_f_test37_56() {
		f_test37(1,30,2,0,204806,815087500,11,0);
	}

	@Test
	public void test_f_test37_57() {
		f_test37(1,30,2,0,204806,815087600,2,0);
	}

	@Test
	public void test_f_test37_58() {
		f_test37(1,30,2,0,204806,815087600,2,134217728);
	}

	@Test
	public void test_f_test37_59() {
		f_test37(1,30,2,0,204806,815087600,2,16);
	}

	@Test
	public void test_f_test37_60() {
		f_test37(1,30,2,0,204806,815087600,11,0);
	}

	@Test
	public void test_f_test37_61() {
		f_test37(1,30,2,0,204806,-1207221391,12,0);
	}

	@Test
	public void test_f_test37_62() {
		f_test37(1,30,2,0,204806,-1207221389,12,0);
	}

	@Test
	public void test_f_test37_63() {
		f_test37(1,30,2,0,204806,-1744092301,12,0);
	}

	@Test
	public void test_f_test37_64() {
		f_test37(1,30,2,0,204806,-603241601,12,0);
	}

	@Test
	public void test_f_test37_65() {
		f_test37(1,2,2,0,204806,0,0,0);
	}

	@Test
	public void test_f_test37_66() {
		f_test37(1,2,2,0,204806,-2147483648,0,0);
	}

	@Test
	public void test_f_test37_67() {
		f_test37(1,2,2,0,204806,-2147483648,14,0);
	}

	@Test
	public void test_f_test37_68() {
		f_test37(8,4,268474370,0,1695794113,-2132015104,1,0);
	}

	@Test
	public void test_f_test37_69() {
		f_test37(8,4,268474370,0,1695794113,-817889264,1,536870912);
	}

	@Test
	public void test_f_test37_70() {
		f_test37(8,4,268474370,0,1695794113,-817889264,1,8);
	}

	@Test
	public void test_f_test37_71() {
		f_test37(8,4,268474370,0,1695794113,-817889264,11,0);
	}

	@Test
	public void test_f_test37_72() {
		f_test37(8,4,268474370,0,1695793257,-2146959357,1,0);
	}

	@Test
	public void test_f_test37_73() {
		f_test37(8,4,268474370,0,1695793257,-1006108669,1,1073741824);
	}

	@Test
	public void test_f_test37_74() {
		f_test37(8,4,268474370,0,1695793257,-1006108669,1,2);
	}

	@Test
	public void test_f_test37_75() {
		f_test37(8,4,268474370,0,1695793257,-1006108669,11,0);
	}

	@Test
	public void test_f_test37_76() {
		f_test37(8,4,268474370,0,1695793257,-601358301,1,0);
	}

	@Test
	public void test_f_test37_77() {
		f_test37(8,4,268474370,0,1695793257,-601358301,1,536870912);
	}

	@Test
	public void test_f_test37_78() {
		f_test37(8,4,268474370,0,1695793257,-601358301,1,1);
	}

	@Test
	public void test_f_test37_79() {
		f_test37(8,4,268474370,0,1695793257,-601358301,11,0);
	}

	@Test
	public void test_f_test37_80() {
		f_test37(8,4,268474370,0,1695793257,-597137201,1,0);
	}

	@Test
	public void test_f_test37_81() {
		f_test37(8,4,268474370,0,1695793257,-597137201,1,536870912);
	}

	@Test
	public void test_f_test37_82() {
		f_test37(8,4,268474370,0,1695793257,-597137201,1,1);
	}

	@Test
	public void test_f_test37_83() {
		f_test37(8,4,268474370,0,1695793257,-597137201,11,0);
	}

	@Test
	public void test_f_test37_84() {
		f_test37(8,4,268474370,0,1695794113,1610612738,1,0);
	}

	@Test
	public void test_f_test37_85() {
		f_test37(8,4,268474370,0,1695794113,1610612738,1,1073741824);
	}

	@Test
	public void test_f_test37_86() {
		f_test37(8,4,268474370,0,1695794113,1610612738,1,2);
	}

	@Test
	public void test_f_test37_87() {
		f_test37(8,4,268474370,0,1695794113,1610612738,11,0);
	}

	@Test
	public void test_f_test37_88() {
		f_test37(8,4,268474370,0,1695794113,979526848,1,0);
	}

	@Test
	public void test_f_test37_89() {
		f_test37(8,4,268474370,0,1695794113,979526848,1,134217728);
	}

	@Test
	public void test_f_test37_90() {
		f_test37(8,4,268474370,0,1695794113,979526848,1,16);
	}

	@Test
	public void test_f_test37_91() {
		f_test37(8,4,268474370,0,1695794113,979526848,11,0);
	}

	@Test
	public void test_f_test37_92() {
		f_test37(8,4,268474370,0,1695794113,52667400,8,0);
	}

	@Test
	public void test_f_test37_93() {
		f_test37(8,4,268474370,0,1695794113,52667400,8,1073741824);
	}

	@Test
	public void test_f_test37_94() {
		f_test37(10,10,1,-1,1,100,10,10);
	}

	@Test
	public void test_f_test37_95() {
		f_test37(8,4,268474370,0,1695794113,52667400,11,0);
	}

	@Test
	public void test_f_test37_96() {
		f_test37(8,4,268474370,0,1695794113,44459200,2,0);
	}

	@Test
	public void test_f_test37_97() {
		f_test37(8,4,268474370,0,1695794113,44459200,2,536870912);
	}

	@Test
	public void test_f_test37_98() {
		f_test37(8,4,268474370,0,1695794113,44459200,2,24);
	}

	@Test
	public void test_f_test37_99() {
		f_test37(8,4,268474370,0,1695794113,44459200,11,0);
	}

	@Test
	public void test_f_test37_100() {
		f_test37(8,4,268474370,0,1695793257,-1179644,12,0);
	}

	@Test
	public void test_f_test37_101() {
		f_test37(8,4,268474370,0,1695793257,-177706789,12,0);
	}

	@Test
	public void test_f_test37_102() {
		f_test37(8,4,268474370,0,1695793257,-714577701,12,0);
	}

	@Test
	public void test_f_test37_103() {
		f_test37(8,4,268474370,0,1695793257,-597137201,12,0);
	}

	@Test
	public void test_f_test37_104() {
		f_test37(1,2,2,0,204806,2359302,12,0);
	}

	@Test
	public void test_f_test37_105() {
		f_test37(2,8,513,0,5,1073741824,12,0);
	}

	@Test
	public void test_f_test37_106() {
		f_test37(1,2,2,0,204806,2359300,12,0);
	}

	@Test
	public void test_f_test37_107() {
		f_test37(1,2,2,0,204806,1677721600,12,0);
	}

}
