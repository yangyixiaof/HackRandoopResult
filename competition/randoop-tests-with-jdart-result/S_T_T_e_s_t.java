import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.FixMethodOrder;

public class S_T_T_e_s_t {

	public static boolean debug = false;

	@Test
	public void test0() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test001");
		Month month1 = null;
		try {
			Day day2 = new Day(0, month1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test002");
		Month month1 = null;
		try {
			Day day2 = new Day((int) 'a', month1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test2() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test003");
		Date date0 = null;
		try {
			Date date1 = Nextday.nextDay(date0);
		} catch (java.lang.NullPointerException e) {
		}
	}

	@Test
	public void test3() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test004");
		Year year1 = null;
		try {
			Month month2 = new Month(0, year1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test4() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test006");
		try {
			Date date3 = new Date((int) '4', (int) (short) -1, (int) (short) 10);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test5() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test008");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		boolean b4 = year2.isLeap();
		java.lang.Object obj5 = new java.lang.Object();
		boolean b6 = year2.equals(obj5);
		try {
			Month month7 = new Month(0, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test6() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test013");
		try {
			Date date3 = new Date(0, (int) (byte) 10, (int) (byte) -1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test7() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test014");
		try {
			Date date3 = new Date((int) '4', (int) '4', 100);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test8() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test017");
		Year year1 = null;
		try {
			Month month2 = new Month((int) (byte) 1, year1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test9() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test018");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		int i4 = year2.getYear();
		try {
			Month month5 = new Month((int) '4', year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test10() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test022");
		Month month1 = null;
		try {
			Day day2 = new Day((int) (short) 1, month1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test11() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test027");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b5 = month4.increment();
		boolean b6 = month4.isValid();
		Year year9 = new Year(1);
		boolean b10 = year9.isLeap();
		boolean b11 = year9.isLeap();
		java.lang.Object obj12 = new java.lang.Object();
		boolean b13 = year9.equals(obj12);
		try {
			month4.setMonth((int) '4', year9);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test12() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test028");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		Year year7 = new Year(1);
		boolean b8 = year7.isLeap();
		boolean b9 = year7.isLeap();
		boolean b10 = year7.increment();
		java.lang.Object obj11 = null;
		boolean b12 = year7.equals(obj11);
		try {
			month4.setMonth((int) '4', year7);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test13() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test030");
		Year year1 = new Year((int) (short) 1);
		boolean b2 = year1.isLeap();
		try {
			year1.setYear(0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test14() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test031");
		try {
			Year year1 = new Year(0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test15() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test033");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		boolean b4 = year2.isLeap();
		boolean b5 = year2.increment();
		boolean b6 = year2.isLeap();
		try {
			Month month7 = new Month((int) (short) -1, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test16() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test037");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		boolean b4 = year2.isLeap();
		try {
			Month month5 = new Month((-1), year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test17() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test038");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isValid();
		boolean b5 = year2.isValid();
		boolean b6 = year2.isValid();
		int i7 = year2.getYear();
		Month month8 = new Month((int) (short) 10, year2);
		Year year11 = new Year(1);
		boolean b12 = year11.isLeap();
		boolean b13 = year11.isLeap();
		java.lang.Object obj14 = new java.lang.Object();
		boolean b15 = year11.equals(obj14);
		boolean b16 = year11.increment();
		try {
			month8.setMonth((int) ' ', year11);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test18() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test041");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		int i5 = month4.getMonth();
		Year year8 = new Year(1);
		boolean b9 = year8.isValid();
		int i10 = year8.getYear();
		year8.setYear(100);
		try {
			month4.setMonth((int) (short) -1, year8);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test19() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test043");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isLeap();
		int i6 = year3.getYear();
		boolean b7 = year3.isLeap();
		Month month8 = new Month((int) (byte) 1, year3);
		Year year10 = new Year(1);
		boolean b11 = year10.isLeap();
		boolean b12 = year10.isLeap();
		boolean b13 = year3.equals((java.lang.Object) year10);
		try {
			Month month14 = new Month((-1), year10);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test20() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test045");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		boolean b4 = year2.increment();
		try {
			Month month5 = new Month((int) (byte) 0, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test21() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test046");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		int i5 = month4.getMonth();
		Year year8 = new Year((int) (short) 1);
		boolean b9 = year8.isLeap();
		month4.setMonth((int) (short) 10, year8);
		int i11 = month4.getMonthSize();
		Year year14 = new Year(1);
		int i15 = year14.getYear();
		boolean b16 = year14.isValid();
		try {
			month4.setMonth(100, year14);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test22() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test047");
		Year year2 = new Year((int) (short) 1);
		try {
			Month month3 = new Month((int) 'a', year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test23() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test049");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		Day day8 = date3.getDay();
		Year year12 = new Year(1);
		boolean b13 = year12.isValid();
		boolean b14 = year12.isLeap();
		int i15 = year12.getYear();
		boolean b16 = year12.isLeap();
		Month month17 = new Month((int) (byte) 1, year12);
		int i18 = month17.getMonthSize();
		boolean b19 = month17.increment();
		try {
			day8.setDay((int) (short) -1, month17);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test24() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test050");
		try {
			Date date3 = new Date(0, 10, 1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test25() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test051");
		try {
			Date date3 = new Date(0, (int) ' ', 1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test26() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test052");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		Year year8 = new Year((int) (byte) 100);
		boolean b9 = year8.isValid();
		Month month10 = new Month((int) (short) 10, year8);
		boolean b11 = month10.increment();
		boolean b12 = date4.equals((java.lang.Object) month10);
		Year year14 = new Year(1);
		boolean b15 = year14.isValid();
		boolean b16 = year14.increment();
		boolean b17 = month10.equals((java.lang.Object) year14);
		try {
			Month month18 = new Month((int) (byte) 100, year14);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test27() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test054");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Year year11 = new Year((int) (byte) 100);
		boolean b12 = year11.isValid();
		Month month13 = new Month((int) (short) 10, year11);
		day7.setDay((int) (short) 10, month13);
		java.lang.Object obj15 = null;
		boolean b16 = day7.equals(obj15);
		boolean b17 = day7.increment();
		boolean b18 = day7.isValid();
		Date date23 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year24 = date23.getYear();
		boolean b26 = date23.equals((java.lang.Object) "hi!");
		Month month27 = date23.getMonth();
		try {
			day7.setDay((int) (byte) 0, month27);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test28() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test056");
		try {
			Date date3 = new Date((int) (byte) 1, 10, (int) (short) 0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test29() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test057");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		boolean b4 = year1.equals((java.lang.Object) 100.0f);
		boolean b5 = year1.isLeap();
		try {
			year1.setYear(0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test30() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test058");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		Month month8 = date4.getMonth();
		try {
			Day day9 = new Day((int) (short) -1, month8);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test31() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test064");
		try {
			Date date3 = new Date(1, 31, (int) (byte) 0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test32() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test068");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date4.printDate();
		Year year6 = date4.getYear();
		try {
			Month month7 = new Month((int) (short) -1, year6);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test33() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test070");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		Year year8 = new Year((int) (byte) 100);
		boolean b9 = year8.isValid();
		Month month10 = new Month((int) (short) 10, year8);
		boolean b11 = month10.increment();
		boolean b12 = date4.equals((java.lang.Object) month10);
		Year year13 = date4.getYear();
		try {
			Month month14 = new Month(32, year13);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test34() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test071");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b6 = month4.equals((java.lang.Object) 10L);
		Year year8 = new Year(1);
		int i9 = year8.getYear();
		boolean b10 = month4.equals((java.lang.Object) i9);
		Year year13 = new Year(1);
		boolean b14 = year13.isValid();
		boolean b15 = year13.isValid();
		boolean b16 = year13.isValid();
		boolean b17 = year13.isValid();
		try {
			month4.setMonth((int) (short) -1, year13);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test35() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test074");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b6 = date4.equals((java.lang.Object) (-1));
		Year year8 = new Year(1);
		boolean b9 = year8.isValid();
		boolean b10 = year8.isLeap();
		int i11 = year8.getYear();
		boolean b12 = year8.isLeap();
		boolean b13 = year8.isLeap();
		boolean b14 = date4.equals((java.lang.Object) b13);
		Date date15 = Nextday.nextDay(date4);
		Year year16 = date4.getYear();
		try {
			Month month17 = new Month(30, year16);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test36() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test075");
		try {
			Date date3 = new Date((int) (byte) 10, (int) (short) 100, (-1));
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test37() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test076");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		Year year8 = new Year((int) (byte) 100);
		boolean b9 = year8.isValid();
		Month month10 = new Month((int) (short) 10, year8);
		boolean b11 = month10.increment();
		boolean b12 = date4.equals((java.lang.Object) month10);
		Year year14 = new Year(1);
		boolean b15 = year14.isValid();
		boolean b16 = year14.increment();
		boolean b17 = month10.equals((java.lang.Object) year14);
		int i18 = month10.getMonthSize();
		try {
			Day day19 = new Day((-1), month10);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test38() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test078");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Year year11 = new Year((int) (byte) 100);
		boolean b12 = year11.isValid();
		Month month13 = new Month((int) (short) 10, year11);
		day7.setDay((int) (short) 10, month13);
		java.lang.Object obj15 = null;
		boolean b16 = day7.equals(obj15);
		boolean b18 = day7.equals((java.lang.Object) "hi!");
		boolean b19 = day7.increment();
		int i20 = day7.getDay();
		Date date25 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year26 = date25.getYear();
		boolean b28 = date25.equals((java.lang.Object) "hi!");
		java.lang.String str29 = date25.toString();
		boolean b31 = date25.equals((java.lang.Object) (short) 100);
		Year year32 = date25.getYear();
		Month month33 = date25.getMonth();
		try {
			day7.setDay(32, month33);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test39() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test082");
		Year year1 = new Year(2);
	}

	@Test
	public void test40() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test084");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isLeap();
		int i6 = year3.getYear();
		boolean b7 = year3.isLeap();
		Month month8 = new Month((int) (byte) 1, year3);
		Day day9 = new Day(31, month8);
		boolean b10 = day9.isValid();
		Year year14 = new Year((int) (byte) 100);
		boolean b15 = year14.isValid();
		Month month16 = new Month((int) (short) 10, year14);
		boolean b18 = month16.equals((java.lang.Object) 10L);
		int i19 = month16.getMonth();
		boolean b20 = month16.isValid();
		day9.setDay(31, month16);
		Year year23 = null;
		try {
			month16.setMonth((int) (byte) 10, year23);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test41() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test086");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		try {
			Day day6 = new Day((int) '4', month5);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test42() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test088");
		try {
			Date date3 = new Date((int) (short) 100, (int) (short) -1, 10);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test43() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test090");
		try {
			Date date3 = new Date(1, (int) (byte) 0, (int) '#');
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test44() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test091");
		Year year1 = new Year((int) (byte) 1);
		int i2 = year1.getYear();
	}

	@Test
	public void test45() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test095");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		Month month5 = date3.getMonth();
		date3.increment();
	}

	@Test
	public void test46() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test098");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isLeap();
		int i6 = year3.getYear();
		boolean b7 = year3.isLeap();
		Month month8 = new Month((int) (byte) 1, year3);
		int i9 = month8.getMonthSize();
		int i10 = month8.getMonthSize();
		int i11 = month8.getMonthSize();
		try {
			Day day12 = new Day((int) (byte) 0, month8);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test47() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test101");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isLeap();
		int i6 = year3.getYear();
		boolean b7 = year3.isLeap();
		Month month8 = new Month((int) (byte) 1, year3);
		Day day9 = new Day(31, month8);
		Date date14 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b16 = date14.equals((java.lang.Object) (-1));
		Year year18 = new Year(1);
		boolean b19 = year18.isValid();
		boolean b20 = year18.isLeap();
		int i21 = year18.getYear();
		boolean b22 = year18.isLeap();
		boolean b23 = year18.isLeap();
		boolean b24 = date14.equals((java.lang.Object) b23);
		Date date25 = Nextday.nextDay(date14);
		Year year26 = date14.getYear();
		try {
			month8.setMonth((int) (byte) -1, year26);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test48() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test102");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		Month month5 = date3.getMonth();
		Date date10 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year11 = date10.getYear();
		boolean b13 = date10.equals((java.lang.Object) "hi!");
		java.lang.String str14 = date10.toString();
		boolean b16 = date10.equals((java.lang.Object) (short) 100);
		Year year17 = date10.getYear();
		try {
			month5.setMonth((int) (short) -1, year17);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test49() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test103");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Year year11 = new Year((int) (byte) 100);
		boolean b12 = year11.isValid();
		Month month13 = new Month((int) (short) 10, year11);
		day7.setDay((int) (short) 10, month13);
		java.lang.Object obj15 = null;
		boolean b16 = day7.equals(obj15);
		boolean b17 = day7.increment();
		boolean b18 = day7.isValid();
		Date date23 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year24 = date23.getYear();
		boolean b26 = date23.equals((java.lang.Object) "hi!");
		Day day27 = date23.getDay();
		Month month28 = date23.getMonth();
		try {
			day7.setDay(0, month28);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test50() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test104");
		try {
			Date date3 = new Date(32, 30, (int) (short) 0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test51() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test106");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		boolean b4 = year2.isLeap();
		boolean b5 = year2.increment();
		java.lang.Object obj6 = null;
		boolean b7 = year2.equals(obj6);
		int i8 = year2.getYear();
		try {
			Month month9 = new Month(100, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test52() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test107");
		Year year1 = new Year(31);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isValid();
	}

	@Test
	public void test53() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test113");
		try {
			Date date3 = new Date(1, 30, (int) (short) 0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test54() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test115");
		Year year1 = new Year((int) 'a');
	}

	@Test
	public void test55() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test116");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Year year10 = date3.getYear();
		Date date11 = Nextday.nextDay(date3);
		Day day12 = date3.getDay();
		boolean b13 = day12.isValid();
	}

	@Test
	public void test56() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test117");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Date date10 = Nextday.nextDay(date3);
		date10.increment();
		date10.printDate();
		Date date13 = Nextday.nextDay(date10);
	}

	@Test
	public void test57() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test118");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b5 = date3.equals((java.lang.Object) (-1));
		Year year6 = date3.getYear();
		java.lang.String str7 = date3.toString();
	}

	@Test
	public void test58() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test119");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isLeap();
		int i4 = year1.getYear();
		boolean b5 = year1.isLeap();
		boolean b6 = year1.isValid();
		int i7 = year1.getYear();
	}

	@Test
	public void test59() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test120");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Date date10 = Nextday.nextDay(date3);
		Date date11 = Nextday.nextDay(date10);
		java.lang.String str12 = date11.toString();
	}

	@Test
	public void test60() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test121");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isLeap();
		int i6 = year3.getYear();
		boolean b7 = year3.isLeap();
		Month month8 = new Month((int) (byte) 1, year3);
		Day day9 = new Day(31, month8);
		boolean b10 = day9.isValid();
		Year year14 = new Year((int) (byte) 100);
		boolean b15 = year14.isValid();
		Month month16 = new Month((int) (short) 10, year14);
		boolean b18 = month16.equals((java.lang.Object) 10L);
		int i19 = month16.getMonth();
		boolean b20 = month16.isValid();
		day9.setDay((int) (short) 1, month16);
		Month month23 = null;
		try {
			day9.setDay((int) (short) 0, month23);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test61() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test123");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		boolean b3 = year1.isLeap();
		java.lang.Object obj4 = new java.lang.Object();
		boolean b5 = year1.equals(obj4);
		boolean b6 = year1.increment();
		Date date10 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year11 = date10.getYear();
		boolean b13 = date10.equals((java.lang.Object) "hi!");
		java.lang.String str14 = date10.toString();
		boolean b16 = date10.equals((java.lang.Object) (short) 100);
		Year year17 = date10.getYear();
		Date date18 = Nextday.nextDay(date10);
		date18.increment();
		boolean b20 = year1.equals((java.lang.Object) date18);
		boolean b21 = year1.isValid();
	}

	@Test
	public void test62() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test125");
		try {
			Date date3 = new Date(31, 0, 100);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test63() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test129");
		Year year1 = new Year((int) (byte) -1);
	}

	@Test
	public void test64() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test132");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		Month month10 = date9.getMonth();
		boolean b11 = month10.isValid();
		int i12 = month10.getMonth();
		int i13 = month10.getMonthSize();
	}

	@Test
	public void test65() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test134");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date5 = Nextday.nextDay(date4);
		Year year9 = new Year(1);
		boolean b10 = year9.isValid();
		boolean b11 = year9.isLeap();
		int i12 = year9.getYear();
		boolean b13 = year9.isLeap();
		Month month14 = new Month((int) (byte) 1, year9);
		Day day15 = new Day(31, month14);
		boolean b16 = day15.isValid();
		Year year20 = new Year((int) (byte) 100);
		boolean b21 = year20.isValid();
		Month month22 = new Month((int) (short) 10, year20);
		boolean b24 = month22.equals((java.lang.Object) 10L);
		int i25 = month22.getMonth();
		boolean b26 = month22.isValid();
		day15.setDay((int) (short) 1, month22);
		boolean b28 = date5.equals((java.lang.Object) month22);
		int i29 = month22.getMonthSize();
		try {
			Day day30 = new Day((int) '#', month22);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test66() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test135");
		try {
			Date date3 = new Date((int) ' ', (-1), 2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test67() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test136");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		boolean b7 = month5.equals((java.lang.Object) 10L);
		Year year9 = new Year(1);
		int i10 = year9.getYear();
		boolean b11 = month5.equals((java.lang.Object) i10);
		try {
			Day day12 = new Day(0, month5);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test68() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test137");
		Month month1 = null;
		try {
			Day day2 = new Day((int) (byte) -1, month1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test69() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test138");
		Year year2 = new Year((int) (short) 1);
		boolean b3 = year2.isLeap();
		year2.setYear((int) (short) -1);
		try {
			Month month6 = new Month(100, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test70() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test140");
		try {
			Date date3 = new Date((int) (byte) 0, 10, (int) (byte) -1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test71() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test142");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		int i3 = year1.getYear();
		boolean b4 = year1.isValid();
		int i5 = year1.getYear();
		int i6 = year1.getYear();
	}

	@Test
	public void test72() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test144");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isLeap();
		int i5 = year2.getYear();
		boolean b6 = year2.isLeap();
		Month month7 = new Month((int) (byte) 1, year2);
		int i8 = month7.getMonthSize();
		int i9 = month7.getMonthSize();
		int i10 = month7.getMonthSize();
		boolean b11 = month7.isValid();
		int i12 = month7.getMonth();
		Year year16 = new Year(1);
		boolean b17 = year16.isValid();
		boolean b18 = year16.isValid();
		Month month19 = new Month((int) (short) 10, year16);
		try {
			month7.setMonth(32, year16);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test73() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test145");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		boolean b7 = month5.equals((java.lang.Object) 10L);
		int i8 = month5.getMonth();
		boolean b9 = month5.isValid();
		boolean b10 = month5.isValid();
		boolean b11 = month5.isValid();
		int i12 = month5.getMonth();
		try {
			Day day13 = new Day((-1), month5);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test74() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test146");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b5 = month4.increment();
		boolean b6 = month4.increment();
		int i7 = month4.getMonth();
		boolean b8 = month4.isValid();
	}

	@Test
	public void test75() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test147");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		Date date6 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year7 = date6.getYear();
		boolean b9 = date6.equals((java.lang.Object) "hi!");
		boolean b10 = year1.equals((java.lang.Object) date6);
		boolean b11 = year1.increment();
	}

	@Test
	public void test76() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test148");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Year year11 = new Year((int) (byte) 100);
		boolean b12 = year11.isValid();
		Month month13 = new Month((int) (short) 10, year11);
		day7.setDay((int) (short) 10, month13);
		java.lang.Object obj15 = null;
		boolean b16 = day7.equals(obj15);
		boolean b18 = day7.equals((java.lang.Object) "hi!");
		int i19 = day7.getDay();
		boolean b20 = day7.increment();
		boolean b21 = day7.increment();
	}

	@Test
	public void test77() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test154");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date5 = Nextday.nextDay(date4);
		Day day6 = date5.getDay();
		Year year7 = date5.getYear();
		try {
			Month month8 = new Month((int) (byte) 100, year7);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test78() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test155");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		Month month8 = date4.getMonth();
		int i9 = month8.getMonthSize();
		try {
			Day day10 = new Day((int) '4', month8);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test79() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test157");
		try {
			Date date3 = new Date((int) '#', 100, (int) ' ');
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test80() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test158");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		int i3 = year1.getYear();
		year1.setYear(100);
		boolean b6 = year1.isLeap();
		year1.setYear(3);
	}

	@Test
	public void test81() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test160");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		int i6 = month5.getMonth();
		Day day7 = new Day(30, month5);
		int i8 = day7.getDay();
		boolean b9 = day7.increment();
	}

	@Test
	public void test82() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test162");
		Year year1 = new Year((-1));
	}

	@Test
	public void test83() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test163");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		Day day8 = date3.getDay();
		Date date9 = Nextday.nextDay(date3);
	}

	@Test
	public void test84() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test164");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b5 = month4.increment();
		boolean b6 = month4.increment();
		boolean b7 = month4.increment();
		boolean b8 = month4.increment();
	}

	@Test
	public void test85() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test166");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isValid();
		int i4 = year1.getYear();
		boolean b5 = year1.isValid();
	}

	@Test
	public void test86() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test168");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date7 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year8 = date7.getYear();
		boolean b10 = date7.equals((java.lang.Object) "hi!");
		Day day11 = date7.getDay();
		Year year15 = new Year((int) (byte) 100);
		boolean b16 = year15.isValid();
		Month month17 = new Month((int) (short) 10, year15);
		day11.setDay((int) (short) 10, month17);
		java.lang.Object obj19 = null;
		boolean b20 = day11.equals(obj19);
		boolean b21 = day11.increment();
		int i22 = day11.getDay();
		boolean b23 = day11.isValid();
		boolean b24 = date3.equals((java.lang.Object) day11);
		Month month25 = date3.getMonth();
		Year year26 = date3.getYear();
	}

	@Test
	public void test87() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test175");
		try {
			Date date3 = new Date((int) ' ', 32, 1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test88() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test176");
		Year year2 = new Year((int) (byte) 100);
		Month month3 = new Month((int) (short) 1, year2);
		boolean b4 = month3.isValid();
		boolean b5 = month3.increment();
	}

	@Test
	public void test89() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test178");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isValid();
		boolean b6 = year3.isLeap();
		int i7 = year3.getYear();
		Month month8 = new Month((int) (byte) 10, year3);
		try {
			Month month9 = new Month(31, year3);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test90() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test180");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		Year year8 = new Year(1);
		boolean b9 = year8.isValid();
		boolean b10 = year8.isLeap();
		int i11 = year8.getYear();
		boolean b12 = year8.isLeap();
		Month month13 = new Month((int) (byte) 1, year8);
		Day day14 = new Day(31, month13);
		boolean b15 = day14.isValid();
		Year year19 = new Year((int) (byte) 100);
		boolean b20 = year19.isValid();
		Month month21 = new Month((int) (short) 10, year19);
		boolean b23 = month21.equals((java.lang.Object) 10L);
		int i24 = month21.getMonth();
		boolean b25 = month21.isValid();
		day14.setDay((int) (short) 1, month21);
		boolean b27 = date4.equals((java.lang.Object) month21);
		boolean b28 = month21.isValid();
		boolean b29 = month21.isValid();
		Year year32 = new Year((int) (byte) 100);
		Date date36 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b37 = year32.equals((java.lang.Object) 10);
		int i38 = year32.getYear();
		try {
			month21.setMonth((-1), year32);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test91() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test183");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		Date date6 = Nextday.nextDay(date3);
		Date date7 = Nextday.nextDay(date3);
		date7.printDate();
		Month month9 = date7.getMonth();
		Year year11 = null;
		try {
			month9.setMonth((int) (byte) 100, year11);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test92() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test184");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b6 = month4.equals((java.lang.Object) 10L);
		int i7 = month4.getMonth();
		boolean b8 = month4.isValid();
		boolean b9 = month4.isValid();
		boolean b10 = month4.isValid();
		boolean b11 = month4.isValid();
	}

	@Test
	public void test93() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test187");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isLeap();
		int i6 = year3.getYear();
		boolean b7 = year3.isLeap();
		Month month8 = new Month((int) (byte) 1, year3);
		int i9 = month8.getMonthSize();
		int i10 = month8.getMonthSize();
		int i11 = month8.getMonthSize();
		boolean b12 = month8.isValid();
		int i13 = month8.getMonth();
		boolean b14 = month8.increment();
		try {
			Day day15 = new Day(30, month8);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test94() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test188");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		Date date6 = Nextday.nextDay(date3);
		java.lang.Object obj7 = null;
		boolean b8 = date3.equals(obj7);
	}

	@Test
	public void test95() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test189");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isValid();
		boolean b5 = year2.isValid();
		boolean b6 = year2.isValid();
		int i7 = year2.getYear();
		Month month8 = new Month((int) (short) 10, year2);
		int i9 = month8.getMonth();
		boolean b10 = month8.isValid();
		Year year13 = new Year((int) (byte) 100);
		boolean b14 = year13.isValid();
		Month month15 = new Month((int) (short) 10, year13);
		boolean b16 = month15.increment();
		boolean b17 = month15.increment();
		boolean b18 = month8.equals((java.lang.Object) month15);
		int i19 = month15.getMonth();
	}

	@Test
	public void test96() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test190");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		Day day6 = date3.getDay();
		Month month7 = date3.getMonth();
	}

	@Test
	public void test97() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test192");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Year year11 = new Year((int) (byte) 100);
		boolean b12 = year11.isValid();
		Month month13 = new Month((int) (short) 10, year11);
		day7.setDay((int) (short) 10, month13);
		java.lang.Object obj15 = null;
		boolean b16 = day7.equals(obj15);
		boolean b17 = day7.increment();
		int i18 = day7.getDay();
		boolean b19 = day7.isValid();
		Date date24 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year25 = date24.getYear();
		boolean b27 = date24.equals((java.lang.Object) "hi!");
		java.lang.String str28 = date24.toString();
		Year year29 = date24.getYear();
		Date date30 = Nextday.nextDay(date24);
		Month month31 = date30.getMonth();
		boolean b32 = month31.isValid();
		int i33 = month31.getMonth();
		try {
			day7.setDay((int) ' ', month31);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test98() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test193");
		try {
			Year year1 = new Year((int) (short) 0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test99() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test197");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isLeap();
		int i6 = year3.getYear();
		boolean b7 = year3.isLeap();
		Month month8 = new Month((int) (byte) 1, year3);
		Day day9 = new Day(31, month8);
		boolean b10 = day9.increment();
		Date date15 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year16 = date15.getYear();
		Year year19 = new Year((int) (byte) 100);
		boolean b20 = year19.isValid();
		Month month21 = new Month((int) (short) 10, year19);
		boolean b22 = month21.increment();
		boolean b23 = date15.equals((java.lang.Object) month21);
		Year year24 = date15.getYear();
		Date date25 = Nextday.nextDay(date15);
		date25.increment();
		Month month27 = date25.getMonth();
		try {
			day9.setDay(0, month27);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test100() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test205");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b5 = month4.increment();
		boolean b6 = month4.isValid();
		boolean b8 = month4.equals((java.lang.Object) 1);
		int i9 = month4.getMonthSize();
		int i10 = month4.getMonthSize();
		Year year13 = new Year(1);
		boolean b14 = year13.isValid();
		boolean b15 = year13.isLeap();
		int i16 = year13.getYear();
		Year year18 = new Year(1);
		boolean b19 = year18.isValid();
		boolean b20 = year18.isLeap();
		int i21 = year18.getYear();
		boolean b22 = year18.isLeap();
		boolean b23 = year13.equals((java.lang.Object) b22);
		try {
			month4.setMonth(30, year13);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test101() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test206");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		date3.printDate();
		Year year11 = new Year((int) (byte) 100);
		boolean b12 = year11.isValid();
		Month month13 = new Month((int) (short) 10, year11);
		boolean b14 = month13.increment();
		boolean b15 = month13.isValid();
		boolean b16 = date3.equals((java.lang.Object) month13);
		date3.increment();
	}

	@Test
	public void test102() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test209");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isLeap();
		int i6 = year3.getYear();
		boolean b7 = year3.isLeap();
		Month month8 = new Month((int) (byte) 1, year3);
		Day day9 = new Day(10, month8);
		boolean b10 = month8.increment();
	}

	@Test
	public void test103() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test210");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isLeap();
		int i4 = year1.getYear();
		Year year6 = new Year(1);
		boolean b7 = year6.isValid();
		boolean b8 = year6.isLeap();
		int i9 = year6.getYear();
		boolean b10 = year6.isLeap();
		boolean b11 = year1.equals((java.lang.Object) b10);
		boolean b12 = year1.isValid();
	}

	@Test
	public void test104() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test211");
		Year year1 = new Year((int) (byte) 100);
		java.lang.Object obj2 = new java.lang.Object();
		boolean b3 = year1.equals(obj2);
		int i4 = year1.getYear();
		int i5 = year1.getYear();
	}

	@Test
	public void test105() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test215");
		Year year1 = new Year((int) (short) 100);
		boolean b2 = year1.isValid();
		int i3 = year1.getYear();
		boolean b4 = year1.isLeap();
	}

	@Test
	public void test106() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test216");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Year year11 = new Year((int) (byte) 100);
		boolean b12 = year11.isValid();
		Month month13 = new Month((int) (short) 10, year11);
		day7.setDay((int) (short) 10, month13);
		java.lang.Object obj15 = null;
		boolean b16 = day7.equals(obj15);
		boolean b17 = day7.isValid();
		boolean b18 = day7.increment();
		boolean b19 = day7.isValid();
		boolean b20 = day7.increment();
		Year year24 = new Year(1);
		boolean b25 = year24.isValid();
		boolean b26 = year24.isValid();
		boolean b27 = year24.isValid();
		boolean b28 = year24.isValid();
		int i29 = year24.getYear();
		Month month30 = new Month((int) (short) 10, year24);
		int i31 = month30.getMonth();
		boolean b32 = month30.isValid();
		boolean b33 = month30.isValid();
		boolean b34 = month30.isValid();
		try {
			day7.setDay((int) 'a', month30);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test107() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test218");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Year year11 = new Year((int) (byte) 100);
		boolean b12 = year11.isValid();
		Month month13 = new Month((int) (short) 10, year11);
		day7.setDay((int) (short) 10, month13);
		boolean b15 = day7.increment();
		int i16 = day7.getDay();
		Year year19 = new Year(1);
		boolean b20 = year19.isValid();
		boolean b21 = year19.isValid();
		int i22 = year19.getYear();
		year19.setYear((int) (byte) -1);
		Year year27 = new Year(1);
		boolean b28 = year27.isLeap();
		int i29 = year27.getYear();
		Month month30 = new Month(10, year27);
		int i31 = month30.getMonthSize();
		boolean b32 = year19.equals((java.lang.Object) month30);
		boolean b33 = month30.increment();
		try {
			day7.setDay(32, month30);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test108() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test219");
		try {
			Date date3 = new Date(10, 52, 52);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test109() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test222");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Year year10 = date3.getYear();
		Date date11 = Nextday.nextDay(date3);
		Day day12 = date3.getDay();
		Date date17 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b19 = date17.equals((java.lang.Object) (-1));
		Year year21 = new Year(1);
		boolean b22 = year21.isValid();
		boolean b23 = year21.isLeap();
		int i24 = year21.getYear();
		boolean b25 = year21.isLeap();
		boolean b26 = year21.isLeap();
		boolean b27 = date17.equals((java.lang.Object) b26);
		java.lang.String str28 = date17.toString();
		Month month29 = date17.getMonth();
		try {
			day12.setDay((int) '#', month29);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test110() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test223");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b5 = date3.equals((java.lang.Object) (-1));
		Year year7 = new Year(1);
		boolean b8 = year7.isValid();
		boolean b9 = year7.isLeap();
		int i10 = year7.getYear();
		boolean b11 = year7.isLeap();
		boolean b12 = year7.isLeap();
		boolean b13 = date3.equals((java.lang.Object) b12);
		java.lang.String str14 = date3.toString();
		Month month15 = date3.getMonth();
		boolean b16 = month15.isValid();
	}

	@Test
	public void test111() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test224");
		try {
			Date date3 = new Date(100, 0, 30);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test112() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test225");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b5 = month4.increment();
		boolean b6 = month4.increment();
		Date date10 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year11 = date10.getYear();
		date10.printDate();
		boolean b13 = month4.equals((java.lang.Object) date10);
		Year year14 = date10.getYear();
		boolean b15 = year14.isValid();
	}

	@Test
	public void test113() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test227");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		boolean b4 = year2.isLeap();
		boolean b5 = year2.increment();
		Month month6 = new Month((int) (short) 1, year2);
		Date date10 = new Date(10, (int) (byte) 10, (int) (short) 1);
		java.lang.String str11 = date10.toString();
		boolean b12 = month6.equals((java.lang.Object) date10);
		int i13 = month6.getMonth();
	}

	@Test
	public void test114() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test229");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		Date date6 = Nextday.nextDay(date3);
		date6.increment();
		java.lang.String str8 = date6.toString();
	}

	@Test
	public void test115() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test231");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Date date10 = Nextday.nextDay(date3);
		date10.increment();
		date10.printDate();
		Day day13 = date10.getDay();
	}

	@Test
	public void test116() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test232");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.printDate();
		date3.printDate();
		date3.printDate();
	}

	@Test
	public void test117() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test237");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		date3.printDate();
		java.lang.String str10 = date3.toString();
		Date date11 = Nextday.nextDay(date3);
		java.lang.String str12 = date3.toString();
		Date date13 = Nextday.nextDay(date3);
	}

	@Test
	public void test118() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test240");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isValid();
		boolean b5 = year2.isValid();
		boolean b6 = year2.isValid();
		int i7 = year2.getYear();
		Month month8 = new Month((int) (short) 10, year2);
		int i9 = month8.getMonth();
		boolean b10 = month8.isValid();
		Year year13 = new Year((int) (byte) 100);
		boolean b14 = year13.isValid();
		Month month15 = new Month((int) (short) 10, year13);
		boolean b16 = month15.increment();
		boolean b17 = month15.increment();
		boolean b18 = month8.equals((java.lang.Object) month15);
		Year year20 = null;
		try {
			month8.setMonth(31, year20);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test119() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test241");
		Month month1 = null;
		try {
			Day day2 = new Day((-1), month1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test120() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test242");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isValid();
		boolean b5 = year2.isValid();
		boolean b6 = year2.isValid();
		int i7 = year2.getYear();
		Month month8 = new Month((int) (short) 10, year2);
		boolean b9 = month8.isValid();
	}

	@Test
	public void test121() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test243");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		int i8 = month7.getMonthSize();
		int i9 = month7.getMonthSize();
		int i10 = month7.getMonthSize();
		int i11 = month7.getMonth();
	}

	@Test
	public void test122() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test244");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b6 = month4.equals((java.lang.Object) 10L);
		boolean b7 = month4.isValid();
		boolean b8 = month4.isValid();
		int i9 = month4.getMonth();
	}

	@Test
	public void test123() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test245");
		Year year1 = new Year((int) (byte) 100);
		boolean b2 = year1.isValid();
		boolean b3 = year1.increment();
		year1.setYear((int) '4');
		boolean b6 = year1.isValid();
		year1.setYear(30);
	}

	@Test
	public void test124() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test246");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		date3.printDate();
		java.lang.String str10 = date3.toString();
		date3.printDate();
	}

	@Test
	public void test125() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test247");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isLeap();
		int i6 = year3.getYear();
		boolean b7 = year3.isLeap();
		Month month8 = new Month((int) (byte) 1, year3);
		Day day9 = new Day(31, month8);
		boolean b10 = month8.increment();
		Year year13 = new Year(1);
		boolean b14 = year13.isLeap();
		boolean b15 = year13.isLeap();
		boolean b16 = year13.increment();
		java.lang.Object obj17 = null;
		boolean b18 = year13.equals(obj17);
		int i19 = year13.getYear();
		boolean b20 = year13.isLeap();
		int i21 = year13.getYear();
		try {
			month8.setMonth(101, year13);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test126() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test248");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		date3.printDate();
		java.lang.String str7 = date3.toString();
		Day day8 = date3.getDay();
		date3.printDate();
	}

	@Test
	public void test127() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test250");
		try {
			Date date3 = new Date(0, 100, 11);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test128() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test251");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		Year year10 = date9.getYear();
		Year year12 = new Year(1);
		boolean b13 = year12.increment();
		int i14 = year12.getYear();
		boolean b15 = year12.increment();
		boolean b16 = year10.equals((java.lang.Object) year12);
		boolean b17 = year10.isValid();
	}

	@Test
	public void test129() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test253");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isValid();
		boolean b4 = year1.isLeap();
		boolean b5 = year1.isLeap();
		int i6 = year1.getYear();
		boolean b7 = year1.increment();
		boolean b8 = year1.increment();
		boolean b9 = year1.increment();
	}

	@Test
	public void test130() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test257");
		try {
			Date date3 = new Date(3, 100, (int) 'a');
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test131() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test259");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Date date8 = Nextday.nextDay(date3);
		date8.increment();
	}

	@Test
	public void test132() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test260");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		Month month10 = date9.getMonth();
		Year year11 = date9.getYear();
		int i12 = year11.getYear();
	}

	@Test
	public void test133() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test264");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		boolean b4 = year2.isLeap();
		boolean b5 = year2.increment();
		Month month6 = new Month((int) (short) 1, year2);
		Date date10 = new Date(10, (int) (byte) 10, (int) (short) 1);
		java.lang.String str11 = date10.toString();
		boolean b12 = month6.equals((java.lang.Object) date10);
		Date date13 = Nextday.nextDay(date10);
	}

	@Test
	public void test134() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test266");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		int i8 = month7.getMonthSize();
		int i9 = month7.getMonth();
	}

	@Test
	public void test135() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test268");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		int i6 = month5.getMonth();
		Day day7 = new Day(30, month5);
		boolean b8 = month5.increment();
		boolean b9 = month5.increment();
		boolean b10 = month5.increment();
	}

	@Test
	public void test136() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test269");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		date3.printDate();
		java.lang.String str9 = date3.toString();
		Day day10 = date3.getDay();
		boolean b11 = day10.isValid();
		Year year15 = new Year(1);
		boolean b16 = year15.isLeap();
		boolean b17 = year15.isLeap();
		boolean b18 = year15.increment();
		Month month19 = new Month((int) (short) 1, year15);
		Date date23 = new Date(10, (int) (byte) 10, (int) (short) 1);
		java.lang.String str24 = date23.toString();
		boolean b25 = month19.equals((java.lang.Object) date23);
		try {
			day10.setDay((int) (byte) 0, month19);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test137() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test271");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isValid();
		boolean b5 = year2.isValid();
		boolean b6 = year2.isValid();
		Month month7 = new Month(12, year2);
		int i8 = month7.getMonth();
	}

	@Test
	public void test138() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test272");
		Year year1 = null;
		try {
			Month month2 = new Month(52, year1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test139() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test273");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		Month month5 = date3.getMonth();
		boolean b6 = month5.increment();
		java.lang.Object obj7 = null;
		boolean b8 = month5.equals(obj7);
	}

	@Test
	public void test140() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test279");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b6 = year2.equals((java.lang.Object) (short) -1);
		year2.setYear(101);
	}

	@Test
	public void test141() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test282");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b6 = month4.equals((java.lang.Object) 10L);
		boolean b7 = month4.isValid();
		boolean b8 = month4.isValid();
		boolean b9 = month4.increment();
	}

	@Test
	public void test142() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test283");
		try {
			Date date3 = new Date(102, (int) (byte) 100, 102);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test143() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test288");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		int i3 = year1.getYear();
		boolean b4 = year1.increment();
		boolean b5 = year1.increment();
	}

	@Test
	public void test144() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test289");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b5 = date3.equals((java.lang.Object) (-1));
		Year year7 = new Year(1);
		boolean b8 = year7.isValid();
		boolean b9 = year7.isLeap();
		int i10 = year7.getYear();
		boolean b11 = year7.isLeap();
		boolean b12 = year7.isLeap();
		boolean b13 = date3.equals((java.lang.Object) b12);
		java.lang.String str14 = date3.toString();
		Month month15 = date3.getMonth();
		Month month16 = date3.getMonth();
		boolean b17 = month16.isValid();
		Year year22 = new Year(1);
		boolean b23 = year22.isValid();
		boolean b24 = year22.isLeap();
		int i25 = year22.getYear();
		boolean b26 = year22.isLeap();
		Month month27 = new Month((int) (byte) 1, year22);
		Year year29 = new Year(1);
		boolean b30 = year29.isLeap();
		boolean b31 = year29.isLeap();
		boolean b32 = year22.equals((java.lang.Object) year29);
		Month month33 = new Month((int) (short) 1, year22);
		try {
			month16.setMonth(102, year22);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test145() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test292");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.printDate();
		Year year8 = date3.getYear();
		date3.increment();
		Date date10 = Nextday.nextDay(date3);
		date10.printDate();
		java.lang.String str12 = date10.toString();
	}

	@Test
	public void test146() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test295");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		Date date8 = Nextday.nextDay(date3);
		Year year9 = date3.getYear();
		try {
			year9.setYear((int) (byte) 0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test147() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test296");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b5 = date3.equals((java.lang.Object) (-1));
		Year year7 = new Year(1);
		boolean b8 = year7.isValid();
		boolean b9 = year7.isLeap();
		int i10 = year7.getYear();
		boolean b11 = year7.isLeap();
		boolean b12 = year7.isLeap();
		boolean b13 = date3.equals((java.lang.Object) b12);
		Date date14 = Nextday.nextDay(date3);
		Day day15 = date14.getDay();
		date14.printDate();
		java.lang.String str17 = date14.toString();
	}

	@Test
	public void test148() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test297");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isValid();
		boolean b5 = year2.isValid();
		boolean b6 = year2.isValid();
		int i7 = year2.getYear();
		Month month8 = new Month((int) (short) 10, year2);
		year2.setYear((-1));
	}

	@Test
	public void test149() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test298");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Year year11 = new Year((int) (byte) 100);
		boolean b12 = year11.isValid();
		Month month13 = new Month((int) (short) 10, year11);
		day7.setDay((int) (short) 10, month13);
		java.lang.Object obj15 = null;
		boolean b16 = day7.equals(obj15);
		boolean b17 = day7.isValid();
		boolean b18 = day7.increment();
		boolean b19 = day7.isValid();
		int i20 = day7.getDay();
	}

	@Test
	public void test150() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test299");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		boolean b3 = year1.isLeap();
		java.lang.Object obj4 = new java.lang.Object();
		boolean b5 = year1.equals(obj4);
		boolean b6 = year1.increment();
		boolean b7 = year1.isLeap();
	}

	@Test
	public void test151() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test301");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b5 = date3.equals((java.lang.Object) (-1));
		Year year7 = new Year(1);
		boolean b8 = year7.isValid();
		boolean b9 = year7.isLeap();
		int i10 = year7.getYear();
		boolean b11 = year7.isLeap();
		boolean b12 = year7.isLeap();
		boolean b13 = date3.equals((java.lang.Object) b12);
		Date date14 = Nextday.nextDay(date3);
		Year year15 = date14.getYear();
		year15.setYear((int) (short) 100);
	}

	@Test
	public void test152() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test308");
		Year year4 = new Year((int) (byte) 100);
		boolean b5 = year4.isValid();
		Month month6 = new Month((int) (short) 10, year4);
		int i7 = month6.getMonth();
		Year year10 = new Year((int) (short) 1);
		boolean b11 = year10.isLeap();
		month6.setMonth((int) (short) 10, year10);
		int i13 = month6.getMonth();
		Day day14 = new Day(12, month6);
		try {
			Day day15 = new Day((int) (byte) -1, month6);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test153() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test309");
		try {
			Date date3 = new Date(32, (int) '#', 0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test154() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test311");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Year year10 = date3.getYear();
		Date date11 = Nextday.nextDay(date3);
		java.lang.String str12 = date3.toString();
		Year year13 = date3.getYear();
	}

	@Test
	public void test155() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test313");
		Year year1 = new Year((int) (byte) 100);
		int i2 = year1.getYear();
		Year year5 = new Year(1);
		boolean b6 = year5.isValid();
		boolean b7 = year5.isLeap();
		int i8 = year5.getYear();
		boolean b9 = year5.isLeap();
		Month month10 = new Month((int) (byte) 1, year5);
		int i11 = month10.getMonthSize();
		boolean b12 = year1.equals((java.lang.Object) month10);
		int i13 = month10.getMonth();
		Date date18 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year19 = date18.getYear();
		date18.printDate();
		Year year21 = date18.getYear();
		Day day22 = date18.getDay();
		Month month23 = date18.getMonth();
		Year year24 = date18.getYear();
		int i25 = year24.getYear();
		try {
			month10.setMonth((int) (short) 100, year24);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test156() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test314");
		Year year1 = new Year(11);
		int i2 = year1.getYear();
		year1.setYear(52);
	}

	@Test
	public void test157() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test315");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		Date date8 = Nextday.nextDay(date3);
		Date date9 = Nextday.nextDay(date8);
		Month month10 = date8.getMonth();
	}

	@Test
	public void test158() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test317");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		Month month8 = date4.getMonth();
		int i9 = month8.getMonthSize();
		boolean b10 = month8.increment();
		Day day11 = new Day(2, month8);
		boolean b12 = month8.increment();
	}

	@Test
	public void test159() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test318");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		boolean b4 = year2.isLeap();
		java.lang.Object obj5 = new java.lang.Object();
		boolean b6 = year2.equals(obj5);
		boolean b7 = year2.isValid();
		Month month8 = new Month((int) (byte) 10, year2);
		Year year11 = new Year(1);
		boolean b12 = year11.isValid();
		boolean b13 = year11.isValid();
		boolean b14 = year11.isLeap();
		boolean b15 = year11.increment();
		int i16 = year11.getYear();
		try {
			month8.setMonth(0, year11);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test160() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test319");
		try {
			Date date3 = new Date(0, (int) (byte) -1, 2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test161() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test320");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isLeap();
		int i5 = year2.getYear();
		boolean b6 = year2.increment();
		try {
			Month month7 = new Month((int) (byte) 100, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test162() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test321");
		try {
			Date date3 = new Date((int) (byte) 1, 0, 52);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test163() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test327");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		Year year7 = new Year((int) (byte) 100);
		boolean b8 = year7.isValid();
		Month month9 = new Month((int) (short) 10, year7);
		boolean b10 = month9.increment();
		boolean b11 = date3.equals((java.lang.Object) month9);
		Year year12 = date3.getYear();
		java.lang.String str13 = date3.toString();
		Month month14 = date3.getMonth();
		date3.increment();
	}

	@Test
	public void test164() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test328");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b6 = month4.equals((java.lang.Object) 10L);
		boolean b7 = month4.isValid();
		boolean b8 = month4.isValid();
		boolean b9 = month4.isValid();
		boolean b10 = month4.isValid();
	}

	@Test
	public void test165() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test329");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		Year year7 = new Year((int) (byte) 100);
		boolean b8 = year7.isValid();
		Month month9 = new Month((int) (short) 10, year7);
		boolean b10 = month9.increment();
		boolean b11 = date3.equals((java.lang.Object) month9);
		boolean b12 = month9.isValid();
	}

	@Test
	public void test166() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test334");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isValid();
		int i5 = year2.getYear();
		year2.setYear((int) (byte) -1);
		Year year10 = new Year(1);
		boolean b11 = year10.isLeap();
		int i12 = year10.getYear();
		Month month13 = new Month(10, year10);
		int i14 = month13.getMonthSize();
		boolean b15 = year2.equals((java.lang.Object) month13);
		try {
			Month month16 = new Month(0, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test167() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test336");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		Date date6 = Nextday.nextDay(date3);
		Year year7 = date3.getYear();
		boolean b8 = year7.isLeap();
		Year year12 = new Year((int) (byte) 100);
		boolean b13 = year12.isValid();
		Month month14 = new Month((int) (short) 10, year12);
		int i15 = month14.getMonth();
		Day day16 = new Day(30, month14);
		boolean b17 = day16.isValid();
		boolean b18 = year7.equals((java.lang.Object) day16);
		boolean b19 = day16.increment();
	}

	@Test
	public void test168() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test337");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isLeap();
		int i6 = year3.getYear();
		boolean b7 = year3.isLeap();
		Month month8 = new Month((int) (byte) 1, year3);
		Day day9 = new Day(31, month8);
		boolean b10 = day9.isValid();
		Year year14 = new Year((int) (byte) 100);
		boolean b15 = year14.isValid();
		Month month16 = new Month((int) (short) 10, year14);
		boolean b18 = month16.equals((java.lang.Object) 10L);
		int i19 = month16.getMonth();
		boolean b20 = month16.isValid();
		day9.setDay((int) (short) 1, month16);
		boolean b22 = month16.isValid();
		int i23 = month16.getMonthSize();
	}

	@Test
	public void test169() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test338");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		Month month10 = date9.getMonth();
		int i11 = month10.getMonthSize();
		int i12 = month10.getMonthSize();
	}

	@Test
	public void test170() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test342");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b5 = date3.equals((java.lang.Object) (-1));
		Year year7 = new Year(1);
		boolean b8 = year7.isValid();
		boolean b9 = year7.isLeap();
		int i10 = year7.getYear();
		boolean b11 = year7.isLeap();
		boolean b12 = year7.isLeap();
		boolean b13 = date3.equals((java.lang.Object) b12);
		Date date14 = Nextday.nextDay(date3);
		date14.printDate();
		date14.increment();
		date14.increment();
		Month month18 = date14.getMonth();
	}

	@Test
	public void test171() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test344");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		date3.printDate();
		java.lang.String str9 = date3.toString();
		Month month10 = date3.getMonth();
		int i11 = month10.getMonthSize();
	}

	@Test
	public void test172() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test345");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		date3.printDate();
		java.lang.String str9 = date3.toString();
		Day day10 = date3.getDay();
		boolean b11 = day10.isValid();
		boolean b12 = day10.increment();
		Date date17 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date21 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year22 = date21.getYear();
		boolean b24 = date21.equals((java.lang.Object) "hi!");
		Day day25 = date21.getDay();
		Year year29 = new Year((int) (byte) 100);
		boolean b30 = year29.isValid();
		Month month31 = new Month((int) (short) 10, year29);
		day25.setDay((int) (short) 10, month31);
		java.lang.Object obj33 = null;
		boolean b34 = day25.equals(obj33);
		boolean b35 = day25.increment();
		int i36 = day25.getDay();
		boolean b37 = day25.isValid();
		boolean b38 = date17.equals((java.lang.Object) day25);
		Month month39 = date17.getMonth();
		try {
			day10.setDay((int) 'a', month39);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test173() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test347");
		Year year1 = new Year(1);
		boolean b2 = year1.increment();
		Year year4 = new Year(1);
		boolean b5 = year4.isValid();
		boolean b6 = year4.isValid();
		boolean b7 = year4.isLeap();
		boolean b8 = year4.increment();
		int i9 = year4.getYear();
		boolean b10 = year4.increment();
		boolean b11 = year4.isLeap();
		boolean b12 = year4.isValid();
		boolean b13 = year1.equals((java.lang.Object) year4);
		boolean b14 = year1.isValid();
	}

	@Test
	public void test174() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test349");
		Year year2 = new Year((int) (short) 100);
		boolean b3 = year2.increment();
		Year year5 = new Year(1);
		boolean b6 = year5.isValid();
		int i7 = year5.getYear();
		year5.setYear(100);
		boolean b10 = year2.equals((java.lang.Object) year5);
		int i11 = year2.getYear();
		try {
			Month month12 = new Month((int) '#', year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test175() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test351");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		Year year8 = new Year((int) (byte) 100);
		boolean b9 = year8.isValid();
		Month month10 = new Month((int) (short) 10, year8);
		boolean b11 = month10.increment();
		boolean b12 = date4.equals((java.lang.Object) month10);
		Year year13 = date4.getYear();
		try {
			Month month14 = new Month(0, year13);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test176() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test356");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		boolean b4 = year2.isLeap();
		java.lang.Object obj5 = new java.lang.Object();
		boolean b6 = year2.equals(obj5);
		boolean b7 = year2.isValid();
		Month month8 = new Month((int) (byte) 10, year2);
		int i9 = year2.getYear();
	}

	@Test
	public void test177() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test359");
		Year year4 = new Year((int) (byte) 100);
		boolean b5 = year4.isValid();
		Month month6 = new Month((int) (short) 10, year4);
		int i7 = month6.getMonth();
		Day day8 = new Day(30, month6);
		boolean b9 = month6.increment();
		boolean b10 = month6.increment();
		boolean b11 = month6.isValid();
		try {
			Day day12 = new Day(0, month6);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test178() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test360");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		java.lang.String str8 = date4.toString();
		Year year9 = date4.getYear();
		Date date10 = Nextday.nextDay(date4);
		Year year11 = date10.getYear();
		Year year13 = new Year(1);
		boolean b14 = year13.increment();
		int i15 = year13.getYear();
		boolean b16 = year13.increment();
		boolean b17 = year11.equals((java.lang.Object) year13);
		Year year19 = new Year(1);
		boolean b20 = year19.isValid();
		boolean b21 = year19.isLeap();
		int i22 = year19.getYear();
		boolean b23 = year19.isLeap();
		boolean b24 = year19.isLeap();
		boolean b25 = year19.increment();
		boolean b26 = year11.equals((java.lang.Object) year19);
		try {
			Month month27 = new Month(32, year19);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test179() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test364");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isLeap();
		int i5 = year2.getYear();
		boolean b6 = year2.isLeap();
		Month month7 = new Month((int) (byte) 1, year2);
		int i8 = month7.getMonthSize();
		boolean b9 = month7.increment();
		int i10 = month7.getMonth();
		boolean b11 = month7.increment();
		boolean b12 = month7.isValid();
	}

	@Test
	public void test180() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test366");
		try {
			Date date3 = new Date((int) (short) -1, 102, 101);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test181() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test368");
		Date date3 = new Date((int) (short) 10, 11, (int) (short) 100);
		Month month4 = date3.getMonth();
	}

	@Test
	public void test182() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test370");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		boolean b3 = year1.isLeap();
		boolean b4 = year1.increment();
		boolean b5 = year1.isLeap();
		boolean b6 = year1.isValid();
		boolean b7 = year1.increment();
	}

	@Test
	public void test183() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test373");
		Year year1 = new Year((int) (byte) 100);
		java.lang.Object obj2 = new java.lang.Object();
		boolean b3 = year1.equals(obj2);
		Date date7 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year8 = date7.getYear();
		boolean b10 = date7.equals((java.lang.Object) "hi!");
		Month month11 = date7.getMonth();
		boolean b12 = year1.equals((java.lang.Object) date7);
		Day day13 = date7.getDay();
		Date date14 = Nextday.nextDay(date7);
		date14.printDate();
		Month month16 = date14.getMonth();
		Year year19 = new Year(1);
		boolean b20 = year19.isLeap();
		boolean b21 = year19.isLeap();
		boolean b22 = year19.increment();
		java.lang.Object obj23 = null;
		boolean b24 = year19.equals(obj23);
		try {
			month16.setMonth((int) '#', year19);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test184() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test374");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isValid();
		boolean b5 = year2.isValid();
		boolean b6 = year2.isValid();
		int i7 = year2.getYear();
		Month month8 = new Month((int) (short) 10, year2);
		boolean b9 = year2.isValid();
		Year year11 = new Year(11);
		boolean b12 = year2.equals((java.lang.Object) year11);
		boolean b13 = year11.isLeap();
		boolean b14 = year11.isValid();
		int i15 = year11.getYear();
		boolean b16 = year11.isValid();
	}

	@Test
	public void test185() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test375");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.printDate();
		Year year8 = date3.getYear();
		date3.increment();
		Date date10 = Nextday.nextDay(date3);
		Year year11 = date3.getYear();
		year11.setYear((int) (byte) 100);
		boolean b14 = year11.isLeap();
	}

	@Test
	public void test186() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test376");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Year year10 = date3.getYear();
		Date date11 = Nextday.nextDay(date3);
		date3.increment();
		Year year13 = date3.getYear();
		date3.increment();
	}

	@Test
	public void test187() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test378");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b5 = year2.increment();
		boolean b7 = year2.equals((java.lang.Object) (-1.0f));
	}

	@Test
	public void test188() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test379");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b6 = date4.equals((java.lang.Object) (-1));
		Year year8 = new Year(1);
		boolean b9 = year8.isValid();
		boolean b10 = year8.isLeap();
		int i11 = year8.getYear();
		boolean b12 = year8.isLeap();
		boolean b13 = year8.isLeap();
		boolean b14 = date4.equals((java.lang.Object) b13);
		Date date15 = Nextday.nextDay(date4);
		Day day16 = date15.getDay();
		boolean b17 = day16.isValid();
		Year year19 = new Year(1);
		boolean b20 = year19.isValid();
		boolean b21 = year19.isValid();
		boolean b22 = year19.isValid();
		boolean b23 = year19.isValid();
		boolean b24 = year19.isValid();
		year19.setYear((int) ' ');
		boolean b27 = day16.equals((java.lang.Object) year19);
		try {
			Month month28 = new Month(100, year19);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test189() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test380");
		Year year1 = new Year((int) (byte) 100);
		java.lang.Object obj2 = new java.lang.Object();
		boolean b3 = year1.equals(obj2);
		Date date7 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year8 = date7.getYear();
		boolean b10 = date7.equals((java.lang.Object) "hi!");
		Month month11 = date7.getMonth();
		boolean b12 = year1.equals((java.lang.Object) date7);
		Day day13 = date7.getDay();
		Date date14 = Nextday.nextDay(date7);
		date14.increment();
		date14.increment();
	}

	@Test
	public void test190() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test381");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		Year year8 = new Year((int) (byte) 100);
		boolean b9 = year8.isValid();
		Month month10 = new Month((int) (short) 10, year8);
		boolean b11 = month10.increment();
		boolean b12 = date4.equals((java.lang.Object) month10);
		Year year13 = date4.getYear();
		Date date14 = Nextday.nextDay(date4);
		date14.increment();
		Month month16 = date14.getMonth();
		try {
			Day day17 = new Day((-1), month16);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test191() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test382");
		try {
			Date date3 = new Date((int) '4', 1, 101);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test192() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test383");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isValid();
		boolean b4 = year1.isValid();
		boolean b5 = year1.isValid();
		int i6 = year1.getYear();
		boolean b7 = year1.increment();
		boolean b8 = year1.increment();
		boolean b9 = year1.increment();
		boolean b10 = year1.isValid();
	}

	@Test
	public void test193() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test387");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		Month month8 = date4.getMonth();
		date4.printDate();
		Year year12 = new Year((int) (byte) 100);
		boolean b13 = year12.isValid();
		Month month14 = new Month((int) (short) 10, year12);
		boolean b15 = month14.increment();
		boolean b16 = month14.isValid();
		boolean b17 = date4.equals((java.lang.Object) month14);
		try {
			Day day18 = new Day((int) (byte) 100, month14);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test194() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test388");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isLeap();
		int i6 = year3.getYear();
		boolean b7 = year3.isLeap();
		Month month8 = new Month((int) (byte) 1, year3);
		Day day9 = new Day(31, month8);
		boolean b10 = month8.increment();
		Year year13 = new Year(1);
		boolean b14 = year13.isValid();
		boolean b15 = year13.increment();
		boolean b16 = year13.increment();
		boolean b17 = year13.isLeap();
		int i18 = year13.getYear();
		try {
			month8.setMonth(30, year13);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test195() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test390");
		Year year1 = new Year((int) (byte) 1);
		year1.setYear((int) (short) 10);
		Year year5 = new Year((int) (byte) 100);
		int i6 = year5.getYear();
		boolean b7 = year5.increment();
		boolean b8 = year1.equals((java.lang.Object) b7);
		boolean b9 = year1.increment();
	}

	@Test
	public void test196() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test391");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Year year11 = new Year((int) (byte) 100);
		boolean b12 = year11.isValid();
		Month month13 = new Month((int) (short) 10, year11);
		day7.setDay((int) (short) 10, month13);
		java.lang.Object obj15 = null;
		boolean b16 = day7.equals(obj15);
		boolean b17 = day7.increment();
		boolean b18 = day7.isValid();
		boolean b19 = day7.isValid();
		boolean b20 = day7.isValid();
		boolean b21 = day7.isValid();
	}

	@Test
	public void test197() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test392");
		Year year3 = new Year(1);
		boolean b4 = year3.isLeap();
		boolean b5 = year3.isLeap();
		java.lang.Object obj6 = new java.lang.Object();
		boolean b7 = year3.equals(obj6);
		boolean b8 = year3.isValid();
		Month month9 = new Month((int) (byte) 10, year3);
		try {
			Day day10 = new Day(100, month9);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test198() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test393");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		java.lang.String str4 = date3.toString();
		Date date5 = Nextday.nextDay(date3);
	}

	@Test
	public void test199() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test395");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b6 = month4.equals((java.lang.Object) 10L);
		int i7 = month4.getMonth();
		boolean b8 = month4.isValid();
		boolean b9 = month4.isValid();
		boolean b10 = month4.isValid();
		boolean b11 = month4.increment();
		boolean b12 = month4.isValid();
	}

	@Test
	public void test200() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test396");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		Month month8 = date4.getMonth();
		int i9 = month8.getMonthSize();
		int i10 = month8.getMonthSize();
		Year year12 = new Year(1);
		boolean b13 = year12.isValid();
		boolean b14 = year12.isValid();
		boolean b15 = year12.isValid();
		boolean b16 = month8.equals((java.lang.Object) year12);
		try {
			Month month17 = new Month((int) 'a', year12);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test201() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test397");
		Year year1 = new Year((int) (byte) 100);
		int i2 = year1.getYear();
		int i3 = year1.getYear();
		boolean b4 = year1.isValid();
		int i5 = year1.getYear();
		boolean b6 = year1.isLeap();
	}

	@Test
	public void test202() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test400");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		int i6 = month5.getMonth();
		Day day7 = new Day(30, month5);
		int i8 = month5.getMonth();
		boolean b9 = month5.isValid();
	}

	@Test
	public void test203() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test401");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Year year10 = date3.getYear();
		Date date11 = Nextday.nextDay(date3);
		date11.increment();
		java.lang.String str13 = date11.toString();
		Day day14 = date11.getDay();
		int i15 = day14.getDay();
	}

	@Test
	public void test204() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test402");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		Year year7 = new Year((int) (byte) 100);
		boolean b8 = year7.isValid();
		Month month9 = new Month((int) (short) 10, year7);
		boolean b10 = month9.increment();
		boolean b11 = date3.equals((java.lang.Object) month9);
		Year year12 = date3.getYear();
		java.lang.String str13 = date3.toString();
		date3.increment();
		Day day15 = date3.getDay();
		Day day16 = date3.getDay();
		Day day17 = date3.getDay();
		Month month18 = date3.getMonth();
		Month month19 = date3.getMonth();
		int i20 = month19.getMonthSize();
		Year year23 = new Year((int) (byte) 100);
		java.lang.Object obj24 = new java.lang.Object();
		boolean b25 = year23.equals(obj24);
		Date date29 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year30 = date29.getYear();
		boolean b32 = date29.equals((java.lang.Object) "hi!");
		Month month33 = date29.getMonth();
		boolean b34 = year23.equals((java.lang.Object) date29);
		Day day35 = date29.getDay();
		Year year37 = new Year((int) (short) 100);
		boolean b38 = year37.increment();
		Year year40 = new Year(1);
		boolean b41 = year40.isValid();
		int i42 = year40.getYear();
		year40.setYear(100);
		boolean b45 = year37.equals((java.lang.Object) year40);
		boolean b46 = day35.equals((java.lang.Object) year40);
		try {
			month19.setMonth((int) '#', year40);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test205() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test403");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Year year11 = new Year((int) (byte) 100);
		boolean b12 = year11.isValid();
		Month month13 = new Month((int) (short) 10, year11);
		day7.setDay((int) (short) 10, month13);
		boolean b15 = day7.isValid();
		boolean b16 = day7.increment();
		int i17 = day7.getDay();
	}

	@Test
	public void test206() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test404");
		Year year4 = new Year(1);
		boolean b5 = year4.isValid();
		boolean b6 = year4.isLeap();
		int i7 = year4.getYear();
		boolean b8 = year4.isLeap();
		Month month9 = new Month((int) (byte) 1, year4);
		Day day10 = new Day(10, month9);
		try {
			Day day11 = new Day((int) '#', month9);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test207() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test405");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		Month month8 = date3.getMonth();
		date3.printDate();
	}

	@Test
	public void test208() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test409");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		Year year7 = new Year((int) (byte) 100);
		boolean b8 = year7.isValid();
		Month month9 = new Month((int) (short) 10, year7);
		boolean b10 = month9.increment();
		int i11 = month9.getMonthSize();
		boolean b12 = month9.isValid();
		boolean b13 = date4.equals((java.lang.Object) month9);
		Year year16 = new Year(1);
		boolean b17 = year16.isValid();
		boolean b18 = year16.increment();
		boolean b19 = year16.increment();
		boolean b20 = year16.increment();
		month9.setMonth(1, year16);
		boolean b22 = month9.increment();
	}

	@Test
	public void test209() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test411");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		int i6 = month5.getMonth();
		Year year9 = new Year((int) (short) 1);
		boolean b10 = year9.isLeap();
		month5.setMonth((int) (short) 10, year9);
		int i12 = month5.getMonthSize();
		boolean b13 = month5.isValid();
		boolean b14 = month5.increment();
		try {
			Day day15 = new Day((int) (byte) -1, month5);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test210() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test412");
		try {
			Date date3 = new Date(0, 102, (int) (byte) -1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test211() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test413");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		int i3 = year1.getYear();
		year1.setYear(100);
		Date date9 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year10 = date9.getYear();
		boolean b12 = date9.equals((java.lang.Object) "hi!");
		Day day13 = date9.getDay();
		Year year17 = new Year((int) (byte) 100);
		boolean b18 = year17.isValid();
		Month month19 = new Month((int) (short) 10, year17);
		day13.setDay((int) (short) 10, month19);
		java.lang.Object obj21 = null;
		boolean b22 = day13.equals(obj21);
		boolean b23 = day13.increment();
		int i24 = day13.getDay();
		boolean b25 = day13.isValid();
		boolean b26 = day13.isValid();
		boolean b27 = day13.increment();
		boolean b28 = year1.equals((java.lang.Object) b27);
	}

	@Test
	public void test212() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test414");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		int i6 = month5.getMonth();
		Year year9 = new Year((int) (short) 1);
		boolean b10 = year9.isLeap();
		month5.setMonth((int) (short) 10, year9);
		int i12 = month5.getMonth();
		Day day13 = new Day(12, month5);
		Year year15 = new Year(1);
		boolean b16 = year15.isLeap();
		boolean b17 = year15.isLeap();
		boolean b18 = year15.increment();
		java.lang.Object obj19 = null;
		boolean b20 = year15.equals(obj19);
		int i21 = year15.getYear();
		boolean b22 = year15.isLeap();
		int i23 = year15.getYear();
		boolean b24 = month5.equals((java.lang.Object) i23);
	}

	@Test
	public void test213() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test415");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		boolean b4 = year1.equals((java.lang.Object) 100.0f);
		Date date8 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year9 = date8.getYear();
		boolean b11 = date8.equals((java.lang.Object) "hi!");
		Day day12 = date8.getDay();
		Year year16 = new Year((int) (byte) 100);
		boolean b17 = year16.isValid();
		Month month18 = new Month((int) (short) 10, year16);
		day12.setDay((int) (short) 10, month18);
		java.lang.Object obj20 = null;
		boolean b21 = day12.equals(obj20);
		boolean b22 = day12.increment();
		boolean b23 = day12.isValid();
		boolean b24 = day12.isValid();
		boolean b25 = year1.equals((java.lang.Object) b24);
		int i26 = year1.getYear();
		int i27 = year1.getYear();
		boolean b28 = year1.isLeap();
		year1.setYear(30);
	}

	@Test
	public void test214() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test417");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isLeap();
		int i5 = year2.getYear();
		boolean b6 = year2.isLeap();
		Month month7 = new Month((int) (byte) 1, year2);
		int i8 = month7.getMonthSize();
		int i9 = month7.getMonthSize();
		int i10 = month7.getMonthSize();
		int i11 = month7.getMonthSize();
	}

	@Test
	public void test215() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test418");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Date date10 = Nextday.nextDay(date3);
		date10.increment();
		Month month12 = date10.getMonth();
		Month month13 = date10.getMonth();
		java.lang.String str14 = date10.toString();
		Month month15 = date10.getMonth();
	}

	@Test
	public void test216() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test421");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		int i3 = year1.getYear();
		boolean b5 = year1.equals((java.lang.Object) 1);
		boolean b6 = year1.isValid();
		boolean b7 = year1.isLeap();
		year1.setYear(31);
	}

	@Test
	public void test217() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test424");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		Year year7 = new Year((int) (byte) 100);
		boolean b8 = year7.isValid();
		Month month9 = new Month((int) (short) 10, year7);
		boolean b10 = month9.increment();
		boolean b11 = date3.equals((java.lang.Object) month9);
		Year year12 = date3.getYear();
		java.lang.String str13 = date3.toString();
		date3.increment();
		Day day15 = date3.getDay();
		boolean b16 = day15.increment();
	}

	@Test
	public void test218() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test425");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		Year year7 = new Year((int) (byte) 100);
		boolean b8 = year7.isValid();
		Month month9 = new Month((int) (short) 10, year7);
		boolean b10 = month9.increment();
		boolean b11 = date3.equals((java.lang.Object) month9);
		Year year12 = date3.getYear();
		java.lang.String str13 = date3.toString();
		date3.increment();
		Day day15 = date3.getDay();
		Day day16 = date3.getDay();
		Day day17 = date3.getDay();
		Month month18 = date3.getMonth();
		Date date24 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b26 = date24.equals((java.lang.Object) (-1));
		Year year27 = date24.getYear();
		Month month28 = new Month(3, year27);
		month18.setMonth((int) (short) 10, year27);
		boolean b30 = year27.increment();
	}

	@Test
	public void test219() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test426");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isLeap();
		int i5 = year2.getYear();
		boolean b6 = year2.isLeap();
		Month month7 = new Month((int) (byte) 1, year2);
		int i8 = month7.getMonthSize();
		boolean b9 = month7.increment();
		boolean b10 = month7.isValid();
		boolean b11 = month7.isValid();
	}

	@Test
	public void test220() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test427");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b6 = month4.equals((java.lang.Object) 10L);
		int i7 = month4.getMonth();
		boolean b8 = month4.isValid();
		boolean b9 = month4.isValid();
		int i10 = month4.getMonthSize();
	}

	@Test
	public void test221() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test428");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isLeap();
		int i4 = year1.getYear();
		boolean b5 = year1.isLeap();
		boolean b6 = year1.increment();
		Date date10 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year11 = date10.getYear();
		boolean b13 = date10.equals((java.lang.Object) "hi!");
		Month month14 = date10.getMonth();
		Day day15 = date10.getDay();
		Year year17 = new Year((int) (short) 1);
		boolean b18 = date10.equals((java.lang.Object) year17);
		boolean b19 = year1.equals((java.lang.Object) year17);
		year17.setYear(3);
	}

	@Test
	public void test222() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test429");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Year year11 = new Year((int) (byte) 100);
		boolean b12 = year11.isValid();
		Month month13 = new Month((int) (short) 10, year11);
		day7.setDay((int) (short) 10, month13);
		java.lang.Object obj15 = null;
		boolean b16 = day7.equals(obj15);
		boolean b17 = day7.increment();
		boolean b18 = day7.isValid();
		int i19 = day7.getDay();
		int i20 = day7.getDay();
	}

	@Test
	public void test223() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test430");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		boolean b3 = year1.isLeap();
		boolean b4 = year1.increment();
		java.lang.Object obj5 = null;
		boolean b6 = year1.equals(obj5);
		int i7 = year1.getYear();
		boolean b8 = year1.isLeap();
		int i9 = year1.getYear();
		Date date13 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year14 = date13.getYear();
		boolean b16 = date13.equals((java.lang.Object) "hi!");
		Day day17 = date13.getDay();
		Year year21 = new Year((int) (byte) 100);
		boolean b22 = year21.isValid();
		Month month23 = new Month((int) (short) 10, year21);
		day17.setDay((int) (short) 10, month23);
		java.lang.Object obj25 = null;
		boolean b26 = day17.equals(obj25);
		boolean b27 = day17.increment();
		int i28 = day17.getDay();
		boolean b29 = day17.increment();
		boolean b30 = day17.isValid();
		boolean b31 = year1.equals((java.lang.Object) day17);
		int i32 = day17.getDay();
	}

	@Test
	public void test224() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test432");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		date3.printDate();
		Day day10 = date3.getDay();
		boolean b11 = day10.isValid();
		boolean b12 = day10.increment();
		boolean b13 = day10.increment();
		boolean b14 = day10.increment();
	}

	@Test
	public void test225() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test433");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		Date date10 = Nextday.nextDay(date9);
		Year year11 = date10.getYear();
	}

	@Test
	public void test226() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test435");
		Year year1 = new Year((int) (byte) 100);
		java.lang.Object obj2 = new java.lang.Object();
		boolean b3 = year1.equals(obj2);
		boolean b4 = year1.isLeap();
		boolean b5 = year1.increment();
	}

	@Test
	public void test227() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test436");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		date3.printDate();
		Day day10 = date3.getDay();
		boolean b11 = day10.isValid();
		int i12 = day10.getDay();
		boolean b13 = day10.increment();
	}

	@Test
	public void test228() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test438");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isValid();
		boolean b4 = year1.isLeap();
		boolean b5 = year1.isLeap();
		boolean b6 = year1.isValid();
		Year year10 = new Year((int) (byte) 100);
		boolean b11 = year10.isValid();
		Month month12 = new Month((int) (short) 10, year10);
		boolean b13 = month12.increment();
		int i14 = month12.getMonthSize();
		boolean b15 = month12.isValid();
		Day day16 = new Day(10, month12);
		boolean b17 = year1.equals((java.lang.Object) month12);
	}

	@Test
	public void test229() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test442");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		date3.printDate();
		java.lang.String str9 = date3.toString();
		Day day10 = date3.getDay();
		boolean b11 = day10.isValid();
		boolean b12 = day10.increment();
		boolean b13 = day10.isValid();
		boolean b14 = day10.increment();
		boolean b15 = day10.increment();
	}

	@Test
	public void test230() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test447");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		boolean b3 = year1.isLeap();
		java.lang.Object obj4 = new java.lang.Object();
		boolean b5 = year1.equals(obj4);
		boolean b6 = year1.increment();
		Date date10 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year11 = date10.getYear();
		boolean b13 = date10.equals((java.lang.Object) "hi!");
		java.lang.String str14 = date10.toString();
		boolean b16 = date10.equals((java.lang.Object) (short) 100);
		Year year17 = date10.getYear();
		Date date18 = Nextday.nextDay(date10);
		date18.increment();
		boolean b20 = year1.equals((java.lang.Object) date18);
		date18.increment();
		Month month22 = date18.getMonth();
		Year year23 = date18.getYear();
	}

	@Test
	public void test231() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test448");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		Year year7 = new Year((int) (byte) 100);
		boolean b8 = year7.isValid();
		Month month9 = new Month((int) (short) 10, year7);
		boolean b10 = month9.increment();
		boolean b11 = date3.equals((java.lang.Object) month9);
		Year year12 = date3.getYear();
		Date date13 = Nextday.nextDay(date3);
		date13.increment();
		java.lang.String str15 = date13.toString();
		Year year16 = date13.getYear();
		int i17 = year16.getYear();
		int i18 = year16.getYear();
	}

	@Test
	public void test232() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test449");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		Month month8 = date3.getMonth();
		int i9 = month8.getMonth();
		boolean b10 = month8.isValid();
	}

	@Test
	public void test233() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test450");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		date3.printDate();
		java.lang.String str9 = date3.toString();
		Day day10 = date3.getDay();
		int i11 = day10.getDay();
		Month month13 = null;
		try {
			day10.setDay((int) (short) 0, month13);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test234() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test454");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isValid();
		boolean b4 = year1.isLeap();
		int i5 = year1.getYear();
		boolean b6 = year1.increment();
		year1.setYear(2);
	}

	@Test
	public void test235() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test455");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Year year11 = new Year((int) (byte) 100);
		boolean b12 = year11.isValid();
		Month month13 = new Month((int) (short) 10, year11);
		day7.setDay((int) (short) 10, month13);
		boolean b15 = day7.increment();
		int i16 = day7.getDay();
		int i17 = day7.getDay();
		boolean b18 = day7.increment();
		int i19 = day7.getDay();
		int i20 = day7.getDay();
	}

	@Test
	public void test236() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test458");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		date3.printDate();
		java.lang.String str9 = date3.toString();
		Day day10 = date3.getDay();
		boolean b11 = day10.isValid();
		boolean b12 = day10.increment();
		boolean b13 = day10.isValid();
		boolean b14 = day10.increment();
		java.lang.Object obj15 = null;
		boolean b16 = day10.equals(obj15);
	}

	@Test
	public void test237() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test459");
		Year year1 = new Year((int) (byte) 100);
		boolean b2 = year1.isValid();
		int i3 = year1.getYear();
		boolean b4 = year1.isValid();
	}

	@Test
	public void test238() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test460");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isLeap();
		int i6 = year3.getYear();
		boolean b7 = year3.isLeap();
		Month month8 = new Month((int) (byte) 1, year3);
		Day day9 = new Day(31, month8);
		boolean b10 = day9.isValid();
		Year year14 = new Year((int) (byte) 100);
		boolean b15 = year14.isValid();
		Month month16 = new Month((int) (short) 10, year14);
		boolean b18 = month16.equals((java.lang.Object) 10L);
		int i19 = month16.getMonth();
		boolean b20 = month16.isValid();
		day9.setDay((int) (short) 1, month16);
		Date date26 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year27 = date26.getYear();
		boolean b29 = date26.equals((java.lang.Object) "hi!");
		Month month30 = date26.getMonth();
		int i31 = month30.getMonthSize();
		try {
			day9.setDay((int) '#', month30);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test239() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test461");
		Year year1 = new Year((int) (short) 100);
		boolean b2 = year1.increment();
		Year year4 = new Year(1);
		boolean b5 = year4.isValid();
		int i6 = year4.getYear();
		year4.setYear(100);
		boolean b9 = year1.equals((java.lang.Object) year4);
		boolean b11 = year4.equals((java.lang.Object) (byte) -1);
		boolean b13 = year4.equals((java.lang.Object) 52);
	}

	@Test
	public void test240() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test464");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date7 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year8 = date7.getYear();
		boolean b10 = date7.equals((java.lang.Object) "hi!");
		Day day11 = date7.getDay();
		Year year15 = new Year((int) (byte) 100);
		boolean b16 = year15.isValid();
		Month month17 = new Month((int) (short) 10, year15);
		day11.setDay((int) (short) 10, month17);
		java.lang.Object obj19 = null;
		boolean b20 = day11.equals(obj19);
		boolean b21 = day11.increment();
		int i22 = day11.getDay();
		boolean b23 = day11.isValid();
		boolean b24 = date3.equals((java.lang.Object) day11);
		Year year28 = new Year(1);
		boolean b29 = year28.isValid();
		boolean b30 = year28.isLeap();
		int i31 = year28.getYear();
		boolean b32 = year28.isLeap();
		Month month33 = new Month((int) (byte) 1, year28);
		int i34 = month33.getMonthSize();
		boolean b35 = month33.increment();
		int i36 = month33.getMonth();
		int i37 = month33.getMonthSize();
		try {
			day11.setDay(32, month33);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test241() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test467");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b5 = date3.equals((java.lang.Object) (-1));
		Year year7 = new Year(1);
		boolean b8 = year7.isValid();
		boolean b9 = year7.isLeap();
		int i10 = year7.getYear();
		boolean b11 = year7.isLeap();
		boolean b12 = year7.isLeap();
		boolean b13 = date3.equals((java.lang.Object) b12);
		java.lang.String str14 = date3.toString();
		Month month15 = date3.getMonth();
		java.lang.String str16 = date3.toString();
	}

	@Test
	public void test242() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test468");
		try {
			Date date3 = new Date((int) '#', (int) (byte) 10, (int) 'a');
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test243() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test471");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isLeap();
		int i6 = year3.getYear();
		boolean b7 = year3.isLeap();
		Month month8 = new Month((int) (byte) 1, year3);
		Day day9 = new Day(31, month8);
		boolean b10 = day9.isValid();
		Year year14 = new Year((int) (byte) 100);
		java.lang.Object obj15 = new java.lang.Object();
		boolean b16 = year14.equals(obj15);
		Date date20 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year21 = date20.getYear();
		boolean b23 = date20.equals((java.lang.Object) "hi!");
		Month month24 = date20.getMonth();
		boolean b25 = year14.equals((java.lang.Object) date20);
		Date date26 = Nextday.nextDay(date20);
		Month month27 = date26.getMonth();
		Day day28 = new Day(11, month27);
		Year year30 = new Year(1);
		boolean b31 = year30.isValid();
		int i32 = year30.getYear();
		year30.setYear(100);
		year30.setYear((int) ' ');
		boolean b37 = month27.equals((java.lang.Object) year30);
		try {
			day9.setDay(33, month27);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test244() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test472");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		Year year7 = new Year((int) (byte) 100);
		boolean b8 = year7.isValid();
		Month month9 = new Month((int) (short) 10, year7);
		boolean b10 = month9.increment();
		boolean b11 = date3.equals((java.lang.Object) month9);
		Year year12 = date3.getYear();
		java.lang.String str13 = date3.toString();
		date3.increment();
		Day day15 = date3.getDay();
		Day day16 = date3.getDay();
		Day day17 = date3.getDay();
		Month month18 = date3.getMonth();
		Month month19 = date3.getMonth();
		int i20 = month19.getMonth();
		boolean b21 = month19.increment();
	}

	@Test
	public void test245() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test473");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		Date date8 = Nextday.nextDay(date3);
		date3.printDate();
		Day day10 = date3.getDay();
		Month month11 = date3.getMonth();
	}

	@Test
	public void test246() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test476");
		try {
			Date date3 = new Date(0, (int) (short) 0, 30);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test247() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test479");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b5 = date3.equals((java.lang.Object) (-1));
		Year year7 = new Year(1);
		boolean b8 = year7.isValid();
		boolean b9 = year7.isLeap();
		int i10 = year7.getYear();
		boolean b11 = year7.isLeap();
		boolean b12 = year7.isLeap();
		boolean b13 = date3.equals((java.lang.Object) b12);
		java.lang.String str14 = date3.toString();
		Month month15 = date3.getMonth();
		date3.printDate();
		Year year17 = date3.getYear();
	}

	@Test
	public void test248() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test484");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		date3.printDate();
		Day day11 = date3.getDay();
		int i12 = day11.getDay();
		Year year15 = new Year(1);
		boolean b16 = year15.isLeap();
		boolean b17 = year15.isLeap();
		boolean b18 = year15.increment();
		Month month19 = new Month((int) (short) 1, year15);
		boolean b20 = day11.equals((java.lang.Object) month19);
	}

	@Test
	public void test249() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test485");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		Year year7 = new Year((int) (byte) 100);
		boolean b8 = year7.isValid();
		Month month9 = new Month((int) (short) 10, year7);
		boolean b10 = month9.increment();
		boolean b11 = date3.equals((java.lang.Object) month9);
		Year year12 = date3.getYear();
		java.lang.String str13 = date3.toString();
		date3.increment();
		Day day15 = date3.getDay();
		Day day16 = date3.getDay();
		Day day17 = date3.getDay();
		java.lang.Object obj18 = null;
		boolean b19 = day17.equals(obj18);
		int i20 = day17.getDay();
	}

	@Test
	public void test250() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test486");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		Date date10 = Nextday.nextDay(date9);
		Year year11 = date9.getYear();
		boolean b12 = year11.isValid();
	}

	@Test
	public void test251() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test487");
		Year year1 = new Year((int) (byte) 100);
		java.lang.Object obj2 = new java.lang.Object();
		boolean b3 = year1.equals(obj2);
		Date date7 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year8 = date7.getYear();
		boolean b10 = date7.equals((java.lang.Object) "hi!");
		Month month11 = date7.getMonth();
		boolean b12 = year1.equals((java.lang.Object) date7);
		Date date13 = Nextday.nextDay(date7);
		Date date14 = Nextday.nextDay(date13);
		Day day15 = date13.getDay();
		boolean b16 = day15.isValid();
	}

	@Test
	public void test252() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test488");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isLeap();
		int i6 = year3.getYear();
		boolean b7 = year3.isLeap();
		Month month8 = new Month((int) (byte) 1, year3);
		int i9 = month8.getMonthSize();
		int i10 = month8.getMonthSize();
		int i11 = month8.getMonthSize();
		boolean b12 = month8.isValid();
		int i13 = month8.getMonth();
		boolean b14 = month8.increment();
		Year year17 = new Year(1);
		boolean b18 = year17.isLeap();
		boolean b19 = year17.isLeap();
		java.lang.Object obj20 = new java.lang.Object();
		boolean b21 = year17.equals(obj20);
		boolean b22 = year17.increment();
		month8.setMonth(1, year17);
		Day day24 = new Day(3, month8);
	}

	@Test
	public void test253() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test489");
		Year year1 = new Year(12);
		boolean b2 = year1.isLeap();
	}

	@Test
	public void test254() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test493");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isLeap();
		int i5 = year2.getYear();
		boolean b6 = year2.isLeap();
		Month month7 = new Month((int) (byte) 1, year2);
		boolean b8 = year2.increment();
	}

	@Test
	public void test255() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test494");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isLeap();
		int i5 = year2.getYear();
		boolean b6 = year2.isLeap();
		Month month7 = new Month((int) (byte) 1, year2);
		int i8 = month7.getMonthSize();
		int i9 = month7.getMonthSize();
		int i10 = month7.getMonthSize();
		boolean b11 = month7.isValid();
		int i12 = month7.getMonth();
		boolean b13 = month7.increment();
		Year year16 = new Year(1);
		boolean b17 = year16.isLeap();
		boolean b18 = year16.isLeap();
		java.lang.Object obj19 = new java.lang.Object();
		boolean b20 = year16.equals(obj19);
		boolean b21 = year16.increment();
		month7.setMonth(1, year16);
		Date date27 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year28 = date27.getYear();
		boolean b30 = date27.equals((java.lang.Object) "hi!");
		date27.printDate();
		date27.printDate();
		Month month33 = date27.getMonth();
		Year year36 = new Year(31);
		boolean b37 = year36.isValid();
		month33.setMonth(11, year36);
		try {
			month7.setMonth((int) (short) 0, year36);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test256() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test498");
		Year year1 = new Year((int) (byte) 100);
		boolean b2 = year1.isValid();
		boolean b3 = year1.increment();
		year1.setYear((int) '4');
		boolean b6 = year1.isLeap();
	}

	@Test
	public void test257() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test499");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Year year11 = new Year((int) (byte) 100);
		boolean b12 = year11.isValid();
		Month month13 = new Month((int) (short) 10, year11);
		day7.setDay((int) (short) 10, month13);
		boolean b15 = month13.increment();
		Year year18 = new Year(1);
		boolean b19 = year18.increment();
		int i20 = year18.getYear();
		year18.setYear((int) (short) -1);
		try {
			month13.setMonth((-1), year18);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test258() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test002");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		boolean b3 = year1.isLeap();
		java.lang.Object obj4 = new java.lang.Object();
		boolean b5 = year1.equals(obj4);
		boolean b6 = year1.isValid();
		int i7 = year1.getYear();
		year1.setYear((int) 'a');
		boolean b10 = year1.isValid();
	}

	@Test
	public void test259() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test005");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isLeap();
		int i5 = year2.getYear();
		boolean b6 = year2.isLeap();
		Month month7 = new Month((int) (byte) 1, year2);
		int i8 = month7.getMonthSize();
		int i9 = month7.getMonthSize();
		int i10 = month7.getMonthSize();
		boolean b11 = month7.isValid();
		int i12 = month7.getMonth();
		boolean b13 = month7.increment();
		boolean b14 = month7.increment();
	}

	@Test
	public void test260() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test006");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		boolean b3 = year1.isLeap();
		java.lang.Object obj4 = new java.lang.Object();
		boolean b5 = year1.equals(obj4);
		boolean b6 = year1.increment();
		Date date10 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year11 = date10.getYear();
		boolean b13 = date10.equals((java.lang.Object) "hi!");
		java.lang.String str14 = date10.toString();
		boolean b16 = date10.equals((java.lang.Object) (short) 100);
		Year year17 = date10.getYear();
		Date date18 = Nextday.nextDay(date10);
		date18.increment();
		boolean b20 = year1.equals((java.lang.Object) date18);
		date18.increment();
		Month month22 = date18.getMonth();
		int i23 = month22.getMonthSize();
	}

	@Test
	public void test261() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test009");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isLeap();
		int i4 = year1.getYear();
		boolean b5 = year1.isLeap();
		boolean b6 = year1.isLeap();
		boolean b7 = year1.increment();
		boolean b8 = year1.increment();
	}

	@Test
	public void test262() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test011");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		Date date6 = Nextday.nextDay(date3);
		Day day7 = date6.getDay();
		int i8 = day7.getDay();
		int i9 = day7.getDay();
	}

	@Test
	public void test263() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test012");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isValid();
		boolean b4 = year1.isLeap();
		boolean b5 = year1.isLeap();
		int i6 = year1.getYear();
		int i7 = year1.getYear();
		boolean b8 = year1.isValid();
	}

	@Test
	public void test264() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test013");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year9 = new Year((int) (byte) 100);
		int i10 = year9.getYear();
		boolean b11 = date3.equals((java.lang.Object) year9);
		Month month12 = date3.getMonth();
	}

	@Test
	public void test265() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test014");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		boolean b4 = year2.isLeap();
		boolean b5 = year2.increment();
		java.lang.Object obj6 = null;
		boolean b7 = year2.equals(obj6);
		int i8 = year2.getYear();
		int i9 = year2.getYear();
		boolean b10 = year2.increment();
		Year year12 = new Year((int) (byte) 100);
		Date date16 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b17 = year12.equals((java.lang.Object) 10);
		boolean b18 = year2.equals((java.lang.Object) b17);
		try {
			Month month19 = new Month(33, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test266() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test020");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		Month month10 = date9.getMonth();
		date9.printDate();
		date9.increment();
		Year year13 = date9.getYear();
		int i14 = year13.getYear();
	}

	@Test
	public void test267() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test021");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Year year11 = new Year((int) (byte) 100);
		boolean b12 = year11.isValid();
		Month month13 = new Month((int) (short) 10, year11);
		day7.setDay((int) (short) 10, month13);
		java.lang.Object obj15 = null;
		boolean b16 = day7.equals(obj15);
		boolean b17 = day7.isValid();
		int i18 = day7.getDay();
	}

	@Test
	public void test268() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test023");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		date3.printDate();
		java.lang.String str7 = date3.toString();
		Day day8 = date3.getDay();
		Date date9 = Nextday.nextDay(date3);
		Date date10 = Nextday.nextDay(date9);
	}

	@Test
	public void test269() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test024");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b5 = year4.isValid();
		int i6 = year4.getYear();
	}

	@Test
	public void test270() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test026");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date5 = Nextday.nextDay(date4);
		Year year9 = new Year(1);
		boolean b10 = year9.isValid();
		boolean b11 = year9.isLeap();
		int i12 = year9.getYear();
		boolean b13 = year9.isLeap();
		Month month14 = new Month((int) (byte) 1, year9);
		Day day15 = new Day(31, month14);
		boolean b16 = day15.isValid();
		Year year20 = new Year((int) (byte) 100);
		boolean b21 = year20.isValid();
		Month month22 = new Month((int) (short) 10, year20);
		boolean b24 = month22.equals((java.lang.Object) 10L);
		int i25 = month22.getMonth();
		boolean b26 = month22.isValid();
		day15.setDay((int) (short) 1, month22);
		boolean b28 = date5.equals((java.lang.Object) month22);
		Year year29 = date5.getYear();
		try {
			Month month30 = new Month(101, year29);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test271() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test032");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		int i3 = year1.getYear();
		boolean b5 = year1.equals((java.lang.Object) 1);
		boolean b6 = year1.isValid();
		boolean b7 = year1.isLeap();
		boolean b8 = year1.increment();
		boolean b9 = year1.increment();
	}

	@Test
	public void test272() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test033");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		date3.printDate();
		java.lang.String str7 = date3.toString();
		Day day8 = date3.getDay();
		boolean b9 = day8.increment();
	}

	@Test
	public void test273() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test035");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		int i4 = year2.getYear();
		boolean b6 = year2.equals((java.lang.Object) 1);
		boolean b7 = year2.isValid();
		Month month8 = new Month(1, year2);
	}

	@Test
	public void test274() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test036");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b6 = date4.equals((java.lang.Object) (-1));
		Year year7 = date4.getYear();
		Date date11 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year12 = date11.getYear();
		Year year15 = new Year((int) (byte) 100);
		boolean b16 = year15.isValid();
		Month month17 = new Month((int) (short) 10, year15);
		boolean b18 = month17.increment();
		boolean b19 = date11.equals((java.lang.Object) month17);
		Year year20 = date11.getYear();
		java.lang.String str21 = date11.toString();
		date11.increment();
		Day day23 = date11.getDay();
		Day day24 = date11.getDay();
		Day day25 = date11.getDay();
		Month month26 = date11.getMonth();
		boolean b27 = year7.equals((java.lang.Object) month26);
		try {
			Day day28 = new Day(102, month26);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test275() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test037");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Year year11 = new Year((int) (byte) 100);
		boolean b12 = year11.isValid();
		Month month13 = new Month((int) (short) 10, year11);
		day7.setDay((int) (short) 10, month13);
		boolean b15 = month13.increment();
		int i16 = month13.getMonthSize();
	}

	@Test
	public void test276() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test039");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		int i6 = month5.getMonth();
		Year year9 = new Year((int) (short) 1);
		boolean b10 = year9.isLeap();
		month5.setMonth((int) (short) 10, year9);
		int i12 = month5.getMonthSize();
		boolean b13 = month5.isValid();
		Day day14 = new Day((int) (short) 10, month5);
		boolean b15 = day14.isValid();
	}

	@Test
	public void test277() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test040");
		Month month1 = null;
		try {
			Day day2 = new Day((int) (byte) 10, month1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test278() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test042");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b5 = date3.equals((java.lang.Object) (-1));
		Year year7 = new Year(1);
		boolean b8 = year7.isValid();
		boolean b9 = year7.isLeap();
		int i10 = year7.getYear();
		boolean b11 = year7.isLeap();
		boolean b12 = year7.isLeap();
		boolean b13 = date3.equals((java.lang.Object) b12);
		java.lang.String str14 = date3.toString();
		Month month15 = date3.getMonth();
		Month month16 = date3.getMonth();
		Day day17 = date3.getDay();
		boolean b18 = day17.isValid();
		boolean b19 = day17.isValid();
	}

	@Test
	public void test279() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test043");
		Year year2 = new Year((int) (byte) 100);
		int i3 = year2.getYear();
		int i4 = year2.getYear();
		Month month5 = new Month((int) (short) 1, year2);
		boolean b6 = month5.increment();
	}

	@Test
	public void test280() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test044");
		try {
			Date date3 = new Date(2, (int) (short) -1, 28);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test281() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test045");
		try {
			Date date3 = new Date((int) (short) -1, (int) (byte) 1, 33);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test282() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test046");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Year year10 = date3.getYear();
		Date date11 = Nextday.nextDay(date3);
		date11.increment();
		Month month13 = date11.getMonth();
	}

	@Test
	public void test283() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test047");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		Date date6 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year7 = date6.getYear();
		boolean b9 = date6.equals((java.lang.Object) "hi!");
		boolean b10 = year1.equals((java.lang.Object) date6);
		boolean b11 = year1.isValid();
		boolean b12 = year1.increment();
	}

	@Test
	public void test284() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test048");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		Year year6 = new Year(1);
		boolean b7 = year6.isLeap();
		boolean b8 = year6.isLeap();
		boolean b9 = year6.increment();
		java.lang.Object obj10 = null;
		boolean b11 = year6.equals(obj10);
		int i12 = year6.getYear();
		boolean b13 = year6.isLeap();
		int i14 = year6.getYear();
		boolean b15 = date3.equals((java.lang.Object) year6);
	}

	@Test
	public void test285() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test050");
		try {
			Date date3 = new Date((int) (short) 0, (int) (short) 1, (int) ' ');
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test286() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test051");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isValid();
		boolean b4 = year1.isLeap();
		boolean b5 = year1.isLeap();
		int i6 = year1.getYear();
		boolean b7 = year1.increment();
		boolean b8 = year1.increment();
		boolean b10 = year1.equals((java.lang.Object) "10/10/1");
		boolean b11 = year1.isLeap();
		int i12 = year1.getYear();
	}

	@Test
	public void test287() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test053");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		date3.printDate();
		java.lang.String str9 = date3.toString();
		Day day10 = date3.getDay();
		date3.increment();
		java.lang.String str12 = date3.toString();
		date3.printDate();
	}

	@Test
	public void test288() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test055");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.printDate();
		date3.printDate();
		Month month9 = date3.getMonth();
		java.lang.String str10 = date3.toString();
	}

	@Test
	public void test289() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test057");
		Year year2 = new Year((int) (byte) 100);
		int i3 = year2.getYear();
		int i4 = year2.getYear();
		Month month5 = new Month((int) (short) 1, year2);
		boolean b6 = year2.isLeap();
	}

	@Test
	public void test290() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test058");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		date3.printDate();
		java.lang.String str7 = date3.toString();
		Date date8 = Nextday.nextDay(date3);
		date3.printDate();
	}

	@Test
	public void test291() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test059");
		Year year2 = new Year(11);
		boolean b3 = year2.increment();
		Month month4 = new Month(3, year2);
		Year year7 = new Year(1);
		boolean b8 = year7.increment();
		int i9 = year7.getYear();
		year7.setYear((int) (short) -1);
		try {
			month4.setMonth(32, year7);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test292() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test061");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b6 = month4.equals((java.lang.Object) 10L);
		Year year8 = new Year(1);
		int i9 = year8.getYear();
		boolean b10 = month4.equals((java.lang.Object) i9);
		boolean b11 = month4.increment();
		int i12 = month4.getMonthSize();
	}

	@Test
	public void test293() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test062");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isValid();
		int i4 = year1.getYear();
		year1.setYear((int) (byte) -1);
		Year year9 = new Year(1);
		boolean b10 = year9.isLeap();
		int i11 = year9.getYear();
		Month month12 = new Month(10, year9);
		int i13 = month12.getMonthSize();
		boolean b14 = year1.equals((java.lang.Object) month12);
		boolean b15 = month12.increment();
		int i16 = month12.getMonthSize();
		boolean b17 = month12.increment();
		boolean b18 = month12.isValid();
	}

	@Test
	public void test294() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test066");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		Year year7 = new Year((int) (byte) 100);
		boolean b8 = year7.isValid();
		Month month9 = new Month((int) (short) 10, year7);
		boolean b10 = month9.increment();
		boolean b11 = date3.equals((java.lang.Object) month9);
		Year year12 = date3.getYear();
		java.lang.String str13 = date3.toString();
		date3.increment();
		Day day15 = date3.getDay();
		date3.printDate();
	}

	@Test
	public void test295() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test067");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		Month month10 = date9.getMonth();
		Day day11 = date9.getDay();
	}

	@Test
	public void test296() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test069");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		int i8 = month7.getMonthSize();
		boolean b10 = month7.equals((java.lang.Object) 0L);
		boolean b11 = month7.increment();
		Date date16 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year17 = date16.getYear();
		date16.printDate();
		Year year19 = date16.getYear();
		Day day20 = date16.getDay();
		Month month21 = date16.getMonth();
		Year year22 = date16.getYear();
		try {
			month7.setMonth((int) (short) -1, year22);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test297() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test070");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		Date date6 = Nextday.nextDay(date3);
		Day day7 = date6.getDay();
		boolean b8 = day7.increment();
	}

	@Test
	public void test298() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test073");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		Date date6 = Nextday.nextDay(date3);
		Date date7 = Nextday.nextDay(date3);
		date7.printDate();
		Month month9 = date7.getMonth();
		boolean b10 = month9.increment();
	}

	@Test
	public void test299() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test075");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		Year year8 = new Year(1);
		boolean b9 = year8.isValid();
		boolean b10 = year8.isLeap();
		int i11 = year8.getYear();
		boolean b12 = year8.isLeap();
		Month month13 = new Month((int) (byte) 1, year8);
		Day day14 = new Day(31, month13);
		boolean b15 = day14.isValid();
		Year year19 = new Year((int) (byte) 100);
		boolean b20 = year19.isValid();
		Month month21 = new Month((int) (short) 10, year19);
		boolean b23 = month21.equals((java.lang.Object) 10L);
		int i24 = month21.getMonth();
		boolean b25 = month21.isValid();
		day14.setDay((int) (short) 1, month21);
		boolean b27 = date4.equals((java.lang.Object) month21);
		boolean b28 = month21.isValid();
		boolean b29 = month21.isValid();
		Year year32 = new Year(1);
		boolean b33 = year32.isValid();
		boolean b34 = year32.increment();
		boolean b35 = year32.increment();
		boolean b36 = year32.increment();
		boolean b37 = year32.isValid();
		boolean b38 = year32.isLeap();
		month21.setMonth((int) (short) 10, year32);
	}

	@Test
	public void test300() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test078");
		Date date3 = new Date((int) (short) 10, 11, (int) (short) 100);
		Year year4 = date3.getYear();
	}

	@Test
	public void test301() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test079");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Year year11 = new Year((int) (byte) 100);
		boolean b12 = year11.isValid();
		Month month13 = new Month((int) (short) 10, year11);
		day7.setDay((int) (short) 10, month13);
		boolean b15 = month13.increment();
		int i16 = month13.getMonth();
		int i17 = month13.getMonth();
		Year year19 = new Year(1);
		boolean b20 = year19.isLeap();
		boolean b21 = year19.isLeap();
		boolean b22 = year19.increment();
		java.lang.Object obj23 = null;
		boolean b24 = year19.equals(obj23);
		int i25 = year19.getYear();
		boolean b26 = year19.isLeap();
		boolean b27 = month13.equals((java.lang.Object) year19);
	}

	@Test
	public void test302() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test081");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		Year year7 = new Year((int) (byte) 100);
		boolean b8 = year7.isValid();
		Month month9 = new Month((int) (short) 10, year7);
		boolean b10 = month9.increment();
		boolean b11 = date3.equals((java.lang.Object) month9);
		Year year12 = date3.getYear();
		Date date13 = Nextday.nextDay(date3);
		Month month14 = date3.getMonth();
		Month month15 = date3.getMonth();
		boolean b16 = month15.increment();
		boolean b17 = month15.isValid();
	}

	@Test
	public void test303() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test084");
		Year year1 = new Year((int) '4');
	}

	@Test
	public void test304() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test087");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		boolean b3 = year1.isLeap();
		java.lang.Object obj4 = new java.lang.Object();
		boolean b5 = year1.equals(obj4);
		boolean b6 = year1.increment();
		boolean b7 = year1.isValid();
	}

	@Test
	public void test305() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test091");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Year year11 = new Year((int) (byte) 100);
		boolean b12 = year11.isValid();
		Month month13 = new Month((int) (short) 10, year11);
		day7.setDay((int) (short) 10, month13);
		java.lang.Object obj15 = null;
		boolean b16 = day7.equals(obj15);
		boolean b18 = day7.equals((java.lang.Object) "hi!");
		int i19 = day7.getDay();
		int i20 = day7.getDay();
		boolean b21 = day7.increment();
	}

	@Test
	public void test306() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test098");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		int i5 = month4.getMonth();
		Year year8 = new Year((int) (short) 1);
		boolean b9 = year8.isLeap();
		month4.setMonth((int) (short) 10, year8);
		boolean b11 = month4.isValid();
		boolean b12 = month4.increment();
	}

	@Test
	public void test307() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test099");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Year year10 = date3.getYear();
		Date date11 = Nextday.nextDay(date3);
		date11.increment();
		java.lang.String str13 = date11.toString();
		Day day14 = date11.getDay();
		boolean b15 = day14.isValid();
		boolean b16 = day14.isValid();
		boolean b17 = day14.isValid();
	}

	@Test
	public void test308() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test103");
		try {
			Date date3 = new Date(33, 32, 33);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test309() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test105");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		date3.printDate();
		Month month6 = date3.getMonth();
		int i7 = month6.getMonth();
		int i8 = month6.getMonth();
	}

	@Test
	public void test310() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test112");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isValid();
		int i4 = year1.getYear();
		year1.setYear((int) (byte) -1);
		Year year9 = new Year(1);
		boolean b10 = year9.isLeap();
		int i11 = year9.getYear();
		Month month12 = new Month(10, year9);
		int i13 = month12.getMonthSize();
		boolean b14 = year1.equals((java.lang.Object) month12);
		boolean b15 = month12.increment();
		int i16 = month12.getMonth();
		Date date21 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year22 = date21.getYear();
		boolean b24 = date21.equals((java.lang.Object) "hi!");
		java.lang.String str25 = date21.toString();
		boolean b27 = date21.equals((java.lang.Object) (short) 100);
		Date date28 = Nextday.nextDay(date21);
		date28.increment();
		date28.printDate();
		Year year31 = date28.getYear();
		boolean b32 = year31.increment();
		int i33 = year31.getYear();
		try {
			month12.setMonth(102, year31);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test311() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test114");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		int i3 = year1.getYear();
		year1.setYear(100);
		boolean b6 = year1.isValid();
	}

	@Test
	public void test312() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test115");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		java.lang.String str8 = date4.toString();
		boolean b10 = date4.equals((java.lang.Object) (short) 100);
		Date date11 = Nextday.nextDay(date4);
		date11.increment();
		date11.printDate();
		Year year14 = date11.getYear();
		boolean b15 = year14.increment();
		int i16 = year14.getYear();
		Month month17 = new Month(10, year14);
	}

	@Test
	public void test313() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test118");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Day day8 = date3.getDay();
		Day day9 = date3.getDay();
		Day day10 = date3.getDay();
	}

	@Test
	public void test314() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test121");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		date3.printDate();
		java.lang.String str10 = date3.toString();
		Date date11 = Nextday.nextDay(date3);
		Month month12 = date3.getMonth();
		date3.printDate();
	}

	@Test
	public void test315() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test122");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		Date date8 = Nextday.nextDay(date3);
		java.lang.String str9 = date8.toString();
	}

	@Test
	public void test316() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test125");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b6 = date4.equals((java.lang.Object) (-1));
		Year year7 = date4.getYear();
		Month month8 = new Month(3, year7);
		Year year11 = new Year(3);
		month8.setMonth(11, year11);
		boolean b13 = month8.increment();
	}

	@Test
	public void test317() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test126");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Year year11 = new Year((int) (byte) 100);
		boolean b12 = year11.isValid();
		Month month13 = new Month((int) (short) 10, year11);
		day7.setDay((int) (short) 10, month13);
		int i15 = day7.getDay();
		boolean b16 = day7.increment();
		Year year20 = new Year((int) (byte) 100);
		boolean b21 = year20.isValid();
		Month month22 = new Month((int) (short) 10, year20);
		boolean b23 = month22.increment();
		boolean b24 = month22.isValid();
		try {
			day7.setDay(0, month22);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test318() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test131");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		int i6 = month5.getMonth();
		Day day7 = new Day(30, month5);
		Date date11 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year12 = date11.getYear();
		boolean b14 = date11.equals((java.lang.Object) "hi!");
		java.lang.String str15 = date11.toString();
		Year year16 = date11.getYear();
		Date date17 = Nextday.nextDay(date11);
		Month month18 = date17.getMonth();
		boolean b19 = day7.equals((java.lang.Object) date17);
		date17.printDate();
	}

	@Test
	public void test319() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test132");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		Day day8 = date3.getDay();
		Year year9 = date3.getYear();
	}

	@Test
	public void test320() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test135");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		date3.printDate();
		Day day10 = date3.getDay();
		int i11 = day10.getDay();
		boolean b12 = day10.isValid();
		Year year15 = new Year(1);
		boolean b16 = year15.isValid();
		boolean b17 = year15.isValid();
		int i18 = year15.getYear();
		year15.setYear((int) (byte) -1);
		Year year23 = new Year(1);
		boolean b24 = year23.isLeap();
		int i25 = year23.getYear();
		Month month26 = new Month(10, year23);
		int i27 = month26.getMonthSize();
		boolean b28 = year15.equals((java.lang.Object) month26);
		boolean b29 = month26.increment();
		try {
			day10.setDay(102, month26);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test321() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test136");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		int i4 = year2.getYear();
		boolean b6 = year2.equals((java.lang.Object) 1);
		year2.setYear(32);
		boolean b9 = year2.isLeap();
		boolean b10 = year2.increment();
		Month month11 = new Month((int) (short) 1, year2);
		int i12 = month11.getMonthSize();
	}

	@Test
	public void test322() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test137");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date7 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year8 = date7.getYear();
		boolean b10 = date7.equals((java.lang.Object) "hi!");
		Day day11 = date7.getDay();
		Year year15 = new Year((int) (byte) 100);
		boolean b16 = year15.isValid();
		Month month17 = new Month((int) (short) 10, year15);
		day11.setDay((int) (short) 10, month17);
		java.lang.Object obj19 = null;
		boolean b20 = day11.equals(obj19);
		boolean b21 = day11.increment();
		int i22 = day11.getDay();
		boolean b23 = day11.isValid();
		boolean b24 = date3.equals((java.lang.Object) day11);
		Month month25 = date3.getMonth();
		Month month26 = date3.getMonth();
		Date date27 = Nextday.nextDay(date3);
		date27.increment();
	}

	@Test
	public void test323() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test138");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isValid();
		boolean b5 = year2.isValid();
		boolean b6 = year2.isValid();
		int i7 = year2.getYear();
		Month month8 = new Month((int) (short) 10, year2);
		int i9 = month8.getMonth();
		boolean b10 = month8.isValid();
		int i11 = month8.getMonth();
		int i12 = month8.getMonthSize();
	}

	@Test
	public void test324() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test140");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		boolean b4 = year2.isLeap();
		boolean b5 = year2.increment();
		int i6 = year2.getYear();
		year2.setYear(1);
		try {
			Month month9 = new Month(31, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test325() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test141");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		int i6 = month5.getMonth();
		Year year9 = new Year((int) (short) 1);
		boolean b10 = year9.isLeap();
		month5.setMonth((int) (short) 10, year9);
		int i12 = month5.getMonthSize();
		int i13 = month5.getMonth();
		int i14 = month5.getMonth();
		Day day15 = new Day((int) (short) 1, month5);
		boolean b16 = month5.isValid();
	}

	@Test
	public void test326() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test142");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b6 = month4.equals((java.lang.Object) 10L);
		Year year8 = new Year(1);
		boolean b9 = year8.increment();
		boolean b10 = month4.equals((java.lang.Object) year8);
		boolean b11 = month4.isValid();
		int i12 = month4.getMonthSize();
		boolean b13 = month4.isValid();
	}

	@Test
	public void test327() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test144");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		int i8 = day7.getDay();
	}

	@Test
	public void test328() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test145");
		try {
			Date date3 = new Date(3, 1, 0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test329() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test146");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		date3.increment();
		Month month9 = date3.getMonth();
		boolean b10 = month9.isValid();
		Year year12 = new Year((int) (byte) 100);
		int i13 = year12.getYear();
		int i14 = year12.getYear();
		boolean b15 = month9.equals((java.lang.Object) i14);
	}

	@Test
	public void test330() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test147");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		date3.printDate();
		java.lang.String str9 = date3.toString();
		Year year10 = date3.getYear();
	}

	@Test
	public void test331() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test148");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		date4.printDate();
	}

	@Test
	public void test332() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test149");
		Year year2 = new Year((int) (short) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month(12, year2);
		boolean b5 = month4.increment();
		Date date10 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date10.printDate();
		Year year12 = date10.getYear();
		try {
			month4.setMonth(28, year12);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test333() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test150");
		Year year2 = new Year((int) (byte) 100);
		java.lang.Object obj3 = new java.lang.Object();
		boolean b4 = year2.equals(obj3);
		Date date8 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year9 = date8.getYear();
		boolean b11 = date8.equals((java.lang.Object) "hi!");
		Month month12 = date8.getMonth();
		boolean b13 = year2.equals((java.lang.Object) date8);
		Date date14 = Nextday.nextDay(date8);
		Month month15 = date14.getMonth();
		Day day16 = new Day(11, month15);
		Year year18 = new Year(1);
		boolean b19 = year18.isValid();
		int i20 = year18.getYear();
		year18.setYear(100);
		year18.setYear((int) ' ');
		boolean b25 = month15.equals((java.lang.Object) year18);
		boolean b26 = month15.increment();
	}

	@Test
	public void test334() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test151");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		date3.printDate();
		Year year6 = date3.getYear();
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		boolean b9 = month8.isValid();
	}

	@Test
	public void test335() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test152");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		date3.increment();
		Month month9 = date3.getMonth();
		int i10 = month9.getMonthSize();
	}

	@Test
	public void test336() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test154");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b6 = month4.equals((java.lang.Object) 10L);
		boolean b7 = month4.isValid();
		int i8 = month4.getMonthSize();
		boolean b9 = month4.isValid();
		Year year12 = new Year(1);
		int i13 = year12.getYear();
		month4.setMonth(12, year12);
	}

	@Test
	public void test337() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test155");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		Day day5 = date4.getDay();
		Year year6 = date4.getYear();
		date4.increment();
	}

	@Test
	public void test338() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test168");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		date4.printDate();
		Year year9 = date4.getYear();
		int i10 = year9.getYear();
		int i11 = year9.getYear();
		try {
			Month month12 = new Month((int) (short) -1, year9);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test339() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test170");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isLeap();
		int i4 = year1.getYear();
		boolean b5 = year1.isLeap();
		boolean b6 = year1.isValid();
		boolean b7 = year1.isLeap();
		boolean b8 = year1.increment();
	}

	@Test
	public void test340() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test172");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Year year11 = new Year((int) (byte) 100);
		boolean b12 = year11.isValid();
		Month month13 = new Month((int) (short) 10, year11);
		day7.setDay((int) (short) 10, month13);
		int i15 = day7.getDay();
		boolean b16 = day7.increment();
		boolean b17 = day7.isValid();
		boolean b18 = day7.isValid();
	}

	@Test
	public void test341() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test173");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isLeap();
		int i6 = year3.getYear();
		boolean b7 = year3.isLeap();
		Month month8 = new Month((int) (byte) 1, year3);
		Day day9 = new Day(31, month8);
		boolean b10 = month8.increment();
		int i11 = month8.getMonthSize();
	}

	@Test
	public void test342() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test174");
		Year year1 = new Year((int) (short) 1);
		boolean b2 = year1.isLeap();
		year1.setYear(31);
		boolean b5 = year1.increment();
		year1.setYear((int) '4');
	}

	@Test
	public void test343() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test178");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		int i4 = year2.getYear();
		boolean b6 = year2.equals((java.lang.Object) 1);
		year2.setYear(32);
		try {
			Month month9 = new Month((int) (byte) -1, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test344() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test179");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b5 = month4.increment();
		int i6 = month4.getMonthSize();
		boolean b7 = month4.isValid();
		int i8 = month4.getMonth();
		int i9 = month4.getMonth();
	}

	@Test
	public void test345() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test180");
		Date date3 = new Date(11, 3, 28);
	}

	@Test
	public void test346() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test181");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		int i5 = month4.getMonth();
		Year year8 = new Year((int) (short) 1);
		boolean b9 = year8.isLeap();
		month4.setMonth((int) (short) 10, year8);
		int i11 = month4.getMonthSize();
		boolean b12 = month4.isValid();
		boolean b13 = month4.increment();
		int i14 = month4.getMonthSize();
		boolean b15 = month4.increment();
	}

	@Test
	public void test347() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test182");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Year year11 = new Year((int) (byte) 100);
		boolean b12 = year11.isValid();
		Month month13 = new Month((int) (short) 10, year11);
		day7.setDay((int) (short) 10, month13);
		java.lang.Object obj15 = null;
		boolean b16 = day7.equals(obj15);
		boolean b18 = day7.equals((java.lang.Object) "hi!");
		int i19 = day7.getDay();
		boolean b20 = day7.isValid();
		Year year22 = new Year(52);
		boolean b23 = day7.equals((java.lang.Object) year22);
	}

	@Test
	public void test348() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test192");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Date date8 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year9 = date8.getYear();
		boolean b11 = date8.equals((java.lang.Object) "hi!");
		Day day12 = date8.getDay();
		Year year16 = new Year((int) (byte) 100);
		boolean b17 = year16.isValid();
		Month month18 = new Month((int) (short) 10, year16);
		day12.setDay((int) (short) 10, month18);
		boolean b20 = date3.equals((java.lang.Object) (short) 10);
		Year year21 = date3.getYear();
		boolean b22 = year21.isValid();
	}

	@Test
	public void test349() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test193");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		int i4 = year2.getYear();
		boolean b6 = year2.equals((java.lang.Object) 1);
		year2.setYear(32);
		boolean b9 = year2.isLeap();
		boolean b10 = year2.increment();
		try {
			Month month11 = new Month((int) (byte) -1, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test350() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test196");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b6 = month4.equals((java.lang.Object) 10L);
		boolean b7 = month4.isValid();
		int i8 = month4.getMonthSize();
		int i9 = month4.getMonth();
		Year year12 = new Year(1);
		boolean b13 = year12.isValid();
		boolean b14 = year12.isLeap();
		int i15 = year12.getYear();
		boolean b16 = year12.isLeap();
		Month month17 = new Month((int) (byte) 1, year12);
		int i18 = month17.getMonthSize();
		int i19 = month17.getMonthSize();
		int i20 = month17.getMonthSize();
		boolean b21 = month17.isValid();
		int i22 = month17.getMonth();
		boolean b23 = month4.equals((java.lang.Object) i22);
		java.lang.Object obj24 = null;
		boolean b25 = month4.equals(obj24);
	}

	@Test
	public void test351() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test199");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		boolean b4 = year2.isLeap();
		Date date8 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year9 = date8.getYear();
		boolean b11 = date8.equals((java.lang.Object) "hi!");
		date8.increment();
		java.lang.String str13 = date8.toString();
		boolean b14 = year2.equals((java.lang.Object) date8);
		Month month15 = new Month((int) (short) 10, year2);
		boolean b16 = year2.isLeap();
	}

	@Test
	public void test352() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test201");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		int i3 = year1.getYear();
		year1.setYear(100);
		boolean b6 = year1.isLeap();
		boolean b7 = year1.isLeap();
	}

	@Test
	public void test353() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test205");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isLeap();
		int i5 = year2.getYear();
		boolean b6 = year2.isLeap();
		Month month7 = new Month((int) (byte) 1, year2);
		Year year9 = new Year(1);
		boolean b10 = year9.isLeap();
		boolean b11 = year9.isLeap();
		boolean b12 = year2.equals((java.lang.Object) year9);
		boolean b13 = year2.isValid();
		int i14 = year2.getYear();
		boolean b15 = year2.increment();
		try {
			year2.setYear((int) (short) 0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test354() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test207");
		Year year3 = new Year(1);
		boolean b4 = year3.isLeap();
		boolean b5 = year3.isLeap();
		boolean b6 = year3.increment();
		Month month7 = new Month((int) (short) 1, year3);
		Date date11 = new Date(10, (int) (byte) 10, (int) (short) 1);
		java.lang.String str12 = date11.toString();
		boolean b13 = month7.equals((java.lang.Object) date11);
		Day day14 = new Day((int) (byte) 10, month7);
		int i15 = month7.getMonthSize();
		boolean b17 = month7.equals((java.lang.Object) 1.0f);
	}

	@Test
	public void test355() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test209");
		Year year1 = new Year((int) (short) 1);
		Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year6 = date5.getYear();
		boolean b8 = date5.equals((java.lang.Object) "hi!");
		java.lang.String str9 = date5.toString();
		Year year10 = date5.getYear();
		Date date11 = Nextday.nextDay(date5);
		Month month12 = date11.getMonth();
		date11.printDate();
		date11.increment();
		boolean b15 = year1.equals((java.lang.Object) date11);
		Year year18 = new Year(1);
		boolean b19 = year18.isLeap();
		boolean b20 = year18.isLeap();
		java.lang.Object obj21 = new java.lang.Object();
		boolean b22 = year18.equals(obj21);
		boolean b23 = year18.isValid();
		int i24 = year18.getYear();
		year18.setYear((int) 'a');
		Month month27 = new Month(2, year18);
		boolean b28 = year1.equals((java.lang.Object) 2);
	}

	@Test
	public void test356() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test210");
		Year year4 = new Year(1);
		boolean b5 = year4.isValid();
		boolean b6 = year4.isLeap();
		int i7 = year4.getYear();
		boolean b8 = year4.isLeap();
		Month month9 = new Month((int) (byte) 1, year4);
		Day day10 = new Day(31, month9);
		boolean b11 = day10.isValid();
		Year year15 = new Year((int) (byte) 100);
		boolean b16 = year15.isValid();
		Month month17 = new Month((int) (short) 10, year15);
		boolean b19 = month17.equals((java.lang.Object) 10L);
		int i20 = month17.getMonth();
		boolean b21 = month17.isValid();
		day10.setDay(31, month17);
		try {
			Day day23 = new Day((int) (short) 0, month17);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test357() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test212");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b5 = date3.equals((java.lang.Object) (-1));
		Year year7 = new Year(1);
		boolean b8 = year7.isValid();
		boolean b9 = year7.isLeap();
		int i10 = year7.getYear();
		boolean b11 = year7.isLeap();
		boolean b12 = year7.isLeap();
		boolean b13 = date3.equals((java.lang.Object) b12);
		java.lang.String str14 = date3.toString();
		Month month15 = date3.getMonth();
		Date date16 = Nextday.nextDay(date3);
		Month month17 = date16.getMonth();
		boolean b18 = month17.isValid();
	}

	@Test
	public void test358() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test213");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		Month month10 = date9.getMonth();
		date9.printDate();
		date9.printDate();
		Date date13 = Nextday.nextDay(date9);
		Year year14 = date13.getYear();
		int i15 = year14.getYear();
		boolean b16 = year14.isValid();
		year14.setYear((int) (short) 100);
		year14.setYear((-1));
	}

	@Test
	public void test359() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test217");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		java.lang.String str8 = date3.toString();
		java.lang.String str9 = date3.toString();
	}

	@Test
	public void test360() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test219");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		int i6 = month5.getMonth();
		Day day7 = new Day(30, month5);
		java.lang.Object obj8 = null;
		boolean b9 = day7.equals(obj8);
	}
}
