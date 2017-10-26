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
			System.out.format("%n%s%n", "RegressionTest2.test001");
		Date date3 = new Date(3, (int) (byte) 10, (int) (byte) 100);
		java.lang.String str4 = date3.toString();
	}

	@Test
	public void test1() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test002");
		Year year1 = new Year((int) (short) 1);
		boolean b2 = year1.isLeap();
		year1.setYear(31);
		Date date8 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date12 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year13 = date12.getYear();
		boolean b15 = date12.equals((java.lang.Object) "hi!");
		Day day16 = date12.getDay();
		Year year20 = new Year((int) (byte) 100);
		boolean b21 = year20.isValid();
		Month month22 = new Month((int) (short) 10, year20);
		day16.setDay((int) (short) 10, month22);
		java.lang.Object obj24 = null;
		boolean b25 = day16.equals(obj24);
		boolean b26 = day16.increment();
		int i27 = day16.getDay();
		boolean b28 = day16.isValid();
		boolean b29 = date8.equals((java.lang.Object) day16);
		Month month30 = date8.getMonth();
		Month month31 = date8.getMonth();
		Date date32 = Nextday.nextDay(date8);
		boolean b33 = year1.equals((java.lang.Object) date32);
		java.lang.String str34 = date32.toString();
	}

	@Test
	public void test2() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test004");
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
		date14.increment();
		date14.increment();
		Day day17 = date14.getDay();
		date14.increment();
	}

	@Test
	public void test3() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test005");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b6 = date4.equals((java.lang.Object) (-1));
		Year year7 = date4.getYear();
		Month month8 = new Month(3, year7);
		Year year10 = null;
		try {
			month8.setMonth((int) (byte) -1, year10);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test4() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test006");
		Year year1 = new Year((int) (byte) 100);
		java.lang.Object obj2 = new java.lang.Object();
		boolean b3 = year1.equals(obj2);
		Date date7 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year8 = date7.getYear();
		boolean b10 = date7.equals((java.lang.Object) "hi!");
		Month month11 = date7.getMonth();
		boolean b12 = year1.equals((java.lang.Object) date7);
		Date date13 = Nextday.nextDay(date7);
		Year year14 = date13.getYear();
	}

	@Test
	public void test5() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test007");
		Year year1 = new Year((int) (byte) 100);
		boolean b2 = year1.increment();
		Year year7 = new Year((int) (byte) 100);
		boolean b8 = year7.isValid();
		Month month9 = new Month((int) (short) 10, year7);
		int i10 = month9.getMonth();
		Day day11 = new Day(30, month9);
		boolean b12 = day11.isValid();
		int i13 = day11.getDay();
		Year year15 = new Year(101);
		boolean b16 = year15.isLeap();
		boolean b17 = day11.equals((java.lang.Object) year15);
		Month month18 = new Month(2, year15);
		boolean b19 = year1.equals((java.lang.Object) 2);
	}

	@Test
	public void test6() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test009");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		boolean b8 = month7.increment();
		int i9 = month7.getMonth();
	}

	@Test
	public void test7() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test010");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		date3.printDate();
		Year year6 = date3.getYear();
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		Year year9 = date3.getYear();
		int i10 = year9.getYear();
		boolean b11 = year9.increment();
	}

	@Test
	public void test8() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test012");
		Year year1 = new Year(12);
		boolean b2 = year1.isLeap();
		int i3 = year1.getYear();
		boolean b4 = year1.increment();
		boolean b5 = year1.isValid();
	}

	@Test
	public void test9() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test014");
		Year year1 = new Year((int) '#');
		Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b7 = date5.equals((java.lang.Object) (-1));
		Year year9 = new Year(1);
		boolean b10 = year9.isValid();
		boolean b11 = year9.isLeap();
		int i12 = year9.getYear();
		boolean b13 = year9.isLeap();
		boolean b14 = year9.isLeap();
		boolean b15 = date5.equals((java.lang.Object) b14);
		Date date16 = Nextday.nextDay(date5);
		Year year18 = new Year(1);
		boolean b19 = year18.isLeap();
		boolean b20 = year18.isLeap();
		boolean b21 = date5.equals((java.lang.Object) year18);
		int i22 = year18.getYear();
		boolean b23 = year1.equals((java.lang.Object) year18);
		boolean b24 = year18.isLeap();
		boolean b25 = year18.increment();
		year18.setYear((int) (byte) -1);
		boolean b28 = year18.isValid();
	}

	@Test
	public void test10() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test015");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		int i8 = month7.getMonthSize();
		int i9 = month7.getMonthSize();
		boolean b10 = month7.increment();
		boolean b11 = month7.isValid();
	}

	@Test
	public void test11() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test018");
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
		boolean b20 = day17.isValid();
		int i21 = day17.getDay();
	}

	@Test
	public void test12() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test019");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isValid();
		boolean b5 = year2.isLeap();
		int i6 = year2.getYear();
		boolean b7 = year2.increment();
		year2.setYear(2);
		boolean b10 = year2.increment();
		try {
			Month month11 = new Month(53, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test13() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test022");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		Day day8 = date4.getDay();
		Year year9 = date4.getYear();
		boolean b10 = year9.increment();
		try {
			Month month11 = new Month(52, year9);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test14() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test026");
		Year year2 = new Year((int) (short) 1);
		boolean b3 = year2.isLeap();
		year2.setYear(31);
		Date date9 = new Date(10, (int) (byte) 10, (int) (short) 1);
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
		boolean b29 = day17.isValid();
		boolean b30 = date9.equals((java.lang.Object) day17);
		Month month31 = date9.getMonth();
		Month month32 = date9.getMonth();
		Date date33 = Nextday.nextDay(date9);
		boolean b34 = year2.equals((java.lang.Object) date33);
		year2.setYear(1);
		boolean b37 = year2.increment();
		try {
			Month month38 = new Month(0, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test15() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test027");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		date3.printDate();
		Year year6 = date3.getYear();
		Day day7 = date3.getDay();
		Year year9 = new Year(1);
		boolean b10 = year9.isLeap();
		boolean b11 = year9.isLeap();
		boolean b12 = year9.increment();
		java.lang.Object obj13 = null;
		boolean b14 = year9.equals(obj13);
		int i15 = year9.getYear();
		boolean b16 = year9.isLeap();
		int i17 = year9.getYear();
		boolean b18 = day7.equals((java.lang.Object) i17);
		int i19 = day7.getDay();
		int i20 = day7.getDay();
	}

	@Test
	public void test16() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test031");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		date3.printDate();
		java.lang.String str9 = date3.toString();
		Day day10 = date3.getDay();
		int i11 = day10.getDay();
		boolean b12 = day10.increment();
	}

	@Test
	public void test17() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test034");
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
		int i14 = month8.getMonthSize();
		try {
			Day day15 = new Day((int) ' ', month8);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test18() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test036");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		int i6 = month5.getMonth();
		Day day7 = new Day(30, month5);
		boolean b8 = day7.isValid();
		boolean b9 = day7.increment();
	}

	@Test
	public void test19() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test037");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		java.lang.String str8 = date3.toString();
		date3.printDate();
		Month month10 = date3.getMonth();
		date3.increment();
	}

	@Test
	public void test20() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test038");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Year year10 = date3.getYear();
		Date date11 = Nextday.nextDay(date3);
		date3.increment();
		date3.increment();
		date3.printDate();
		date3.printDate();
		java.lang.String str16 = date3.toString();
		Month month17 = date3.getMonth();
		int i18 = month17.getMonthSize();
	}

	@Test
	public void test21() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test039");
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
		boolean b16 = year2.increment();
		year2.setYear((int) (byte) 1);
		year2.setYear((int) (byte) -1);
		year2.setYear(97);
		year2.setYear((int) (short) 10);
	}

	@Test
	public void test22() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test040");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		boolean b6 = month5.increment();
		boolean b7 = month5.isValid();
		boolean b9 = month5.equals((java.lang.Object) 1);
		int i10 = month5.getMonthSize();
		Day day11 = new Day(4, month5);
		boolean b12 = day11.isValid();
	}

	@Test
	public void test23() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test043");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.increment();
		boolean b4 = year1.increment();
		boolean b5 = year1.isLeap();
		year1.setYear((int) (byte) -1);
	}

	@Test
	public void test24() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test044");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		boolean b7 = month5.equals((java.lang.Object) 10L);
		boolean b8 = month5.increment();
		Year year10 = new Year(1);
		year10.setYear(32);
		boolean b13 = month5.equals((java.lang.Object) year10);
		try {
			Month month14 = new Month(97, year10);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test25() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test045");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b6 = month4.equals((java.lang.Object) 10L);
		boolean b7 = month4.isValid();
		boolean b8 = month4.isValid();
		Date date13 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year14 = date13.getYear();
		boolean b16 = date13.equals((java.lang.Object) "hi!");
		java.lang.String str17 = date13.toString();
		Year year18 = date13.getYear();
		Date date19 = Nextday.nextDay(date13);
		Month month20 = date19.getMonth();
		Year year21 = date19.getYear();
		year21.setYear(3);
		month4.setMonth(10, year21);
	}

	@Test
	public void test26() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test048");
		Year year1 = new Year((int) (byte) 100);
		boolean b2 = year1.isValid();
		boolean b3 = year1.increment();
		year1.setYear((int) '4');
		boolean b6 = year1.isValid();
		boolean b7 = year1.isLeap();
		int i8 = year1.getYear();
	}

	@Test
	public void test27() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test049");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		date3.printDate();
		java.lang.String str7 = date3.toString();
		Day day8 = date3.getDay();
		Date date9 = Nextday.nextDay(date3);
		Year year10 = date3.getYear();
	}

	@Test
	public void test28() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test052");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isValid();
		int i5 = year2.getYear();
		boolean b6 = year2.isLeap();
		int i7 = year2.getYear();
		Date date11 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b13 = date11.equals((java.lang.Object) (-1));
		Year year15 = new Year(1);
		boolean b16 = year15.isValid();
		boolean b17 = year15.isLeap();
		int i18 = year15.getYear();
		boolean b19 = year15.isLeap();
		boolean b20 = year15.isLeap();
		boolean b21 = date11.equals((java.lang.Object) b20);
		java.lang.String str22 = date11.toString();
		Month month23 = date11.getMonth();
		Date date24 = Nextday.nextDay(date11);
		boolean b25 = year2.equals((java.lang.Object) date24);
		int i26 = year2.getYear();
		try {
			Month month27 = new Month((int) (short) 0, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test29() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test053");
		Date date3 = new Date(2, 10, 10);
		Date date4 = Nextday.nextDay(date3);
		date3.increment();
		date3.increment();
	}

	@Test
	public void test30() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test056");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		boolean b7 = month5.equals((java.lang.Object) 10L);
		boolean b8 = month5.isValid();
		int i9 = month5.getMonthSize();
		boolean b10 = month5.isValid();
		Day day11 = new Day(31, month5);
		int i12 = month5.getMonth();
	}

	@Test
	public void test31() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test058");
		Month month1 = null;
		try {
			Day day2 = new Day(28, month1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test32() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test059");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		Year year7 = new Year((int) (byte) 100);
		boolean b8 = year7.isValid();
		Month month9 = new Month((int) (short) 10, year7);
		boolean b10 = month9.increment();
		boolean b11 = date3.equals((java.lang.Object) month9);
		Year year13 = new Year(1);
		boolean b14 = year13.isValid();
		boolean b15 = year13.increment();
		boolean b16 = month9.equals((java.lang.Object) year13);
		int i17 = month9.getMonthSize();
		boolean b18 = month9.increment();
		Year year22 = new Year((int) (byte) 100);
		boolean b23 = year22.isValid();
		Month month24 = new Month((int) (short) 10, year22);
		boolean b26 = year22.equals((java.lang.Object) (short) -1);
		year22.setYear(101);
		Date date32 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year33 = date32.getYear();
		boolean b35 = date32.equals((java.lang.Object) "hi!");
		Day day36 = date32.getDay();
		Year year40 = new Year((int) (byte) 100);
		boolean b41 = year40.isValid();
		Month month42 = new Month((int) (short) 10, year40);
		day36.setDay((int) (short) 10, month42);
		java.lang.Object obj44 = null;
		boolean b45 = day36.equals(obj44);
		boolean b46 = day36.increment();
		int i47 = day36.getDay();
		boolean b48 = day36.isValid();
		boolean b49 = day36.isValid();
		Year year52 = new Year(1);
		boolean b53 = year52.isValid();
		boolean b54 = year52.isValid();
		boolean b55 = year52.isValid();
		boolean b56 = year52.isValid();
		int i57 = year52.getYear();
		Month month58 = new Month((int) (short) 10, year52);
		boolean b59 = year52.increment();
		boolean b60 = day36.equals((java.lang.Object) b59);
		boolean b61 = day36.increment();
		boolean b62 = year22.equals((java.lang.Object) b61);
		try {
			month9.setMonth((int) ' ', year22);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test33() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test062");
		Year year4 = new Year((int) (byte) 100);
		boolean b5 = year4.isValid();
		Month month6 = new Month((int) (short) 10, year4);
		boolean b7 = month6.increment();
		int i8 = month6.getMonthSize();
		boolean b9 = month6.isValid();
		Day day10 = new Day(10, month6);
		Day day11 = new Day(12, month6);
		boolean b12 = month6.increment();
		int i13 = month6.getMonth();
		boolean b14 = month6.increment();
	}

	@Test
	public void test34() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test064");
		try {
			Date date3 = new Date((int) ' ', 12, (int) (byte) 0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test35() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test066");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date5 = Nextday.nextDay(date4);
		Day day6 = date5.getDay();
		Year year7 = date5.getYear();
		Year year8 = date5.getYear();
		try {
			Month month9 = new Month((int) (short) 0, year8);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test36() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test067");
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
		boolean b22 = day7.increment();
	}

	@Test
	public void test37() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test070");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.printDate();
		Year year8 = date3.getYear();
		date3.increment();
		Date date10 = Nextday.nextDay(date3);
		Month month11 = date10.getMonth();
		java.lang.String str12 = date10.toString();
		Day day13 = date10.getDay();
		date10.printDate();
	}

	@Test
	public void test38() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test074");
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
		Year year18 = new Year((int) (byte) 100);
		int i19 = year18.getYear();
		Year year22 = new Year(1);
		boolean b23 = year22.isValid();
		boolean b24 = year22.isLeap();
		int i25 = year22.getYear();
		boolean b26 = year22.isLeap();
		Month month27 = new Month((int) (byte) 1, year22);
		int i28 = month27.getMonthSize();
		boolean b29 = year18.equals((java.lang.Object) month27);
		year18.setYear(100);
		boolean b32 = year18.increment();
		Year year34 = new Year((int) (byte) 100);
		Date date38 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b39 = year34.equals((java.lang.Object) 10);
		int i40 = year34.getYear();
		boolean b41 = year18.equals((java.lang.Object) i40);
		try {
			month7.setMonth((int) (byte) 100, year18);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test39() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test075");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		int i8 = month7.getMonthSize();
		boolean b10 = month7.equals((java.lang.Object) 0L);
		boolean b11 = month7.increment();
		Year year14 = new Year(1);
		boolean b15 = year14.isValid();
		boolean b16 = year14.isValid();
		boolean b17 = year14.isLeap();
		boolean b18 = year14.isLeap();
		int i19 = year14.getYear();
		int i20 = year14.getYear();
		boolean b21 = year14.increment();
		try {
			month7.setMonth(53, year14);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test40() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test077");
		Year year1 = new Year((int) (byte) 100);
		boolean b2 = year1.isValid();
		boolean b3 = year1.increment();
		year1.setYear(5);
	}

	@Test
	public void test41() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test080");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isLeap();
		int i5 = year2.getYear();
		boolean b6 = year2.isLeap();
		Month month7 = new Month((int) (byte) 1, year2);
		boolean b8 = month7.isValid();
		Year year12 = new Year(1);
		boolean b13 = year12.isValid();
		boolean b14 = year12.increment();
		boolean b15 = year12.increment();
		boolean b16 = year12.isLeap();
		int i17 = year12.getYear();
		Month month18 = new Month(1, year12);
		boolean b19 = year12.isValid();
		try {
			month7.setMonth(31, year12);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test42() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test082");
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
		int i19 = day7.getDay();
		int i20 = day7.getDay();
		boolean b21 = day7.increment();
		boolean b22 = day7.increment();
	}

	@Test
	public void test43() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test083");
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
		Day day17 = date14.getDay();
		boolean b18 = day17.isValid();
		boolean b19 = day17.isValid();
		int i20 = day17.getDay();
	}

	@Test
	public void test44() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test084");
		Year year2 = new Year(1);
		boolean b3 = year2.increment();
		int i4 = year2.getYear();
		boolean b5 = year2.increment();
		year2.setYear(12);
		year2.setYear(10);
		Date date13 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year14 = date13.getYear();
		boolean b15 = year14.isValid();
		int i16 = year14.getYear();
		boolean b17 = year2.equals((java.lang.Object) year14);
		try {
			Month month18 = new Month(28, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test45() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test085");
		try {
			Date date3 = new Date((int) (short) 100, 2, (int) 'a');
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test46() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test089");
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
		Month month28 = date27.getMonth();
		int i29 = month28.getMonthSize();
		boolean b30 = month28.increment();
	}

	@Test
	public void test47() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test091");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		Month month8 = date4.getMonth();
		int i9 = month8.getMonthSize();
		boolean b10 = month8.increment();
		Day day11 = new Day(2, month8);
		boolean b12 = month8.increment();
		boolean b13 = month8.increment();
		Year year16 = new Year(1);
		boolean b17 = year16.isValid();
		boolean b18 = year16.isLeap();
		int i19 = year16.getYear();
		boolean b20 = year16.isLeap();
		boolean b21 = year16.isValid();
		try {
			month8.setMonth(100, year16);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test48() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test093");
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
		int i27 = month26.getMonth();
	}

	@Test
	public void test49() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test098");
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
		Day day16 = date3.getDay();
		Day day17 = date3.getDay();
		Year year19 = new Year((int) (short) 100);
		boolean b20 = year19.increment();
		Year year22 = new Year(1);
		boolean b23 = year22.isValid();
		int i24 = year22.getYear();
		year22.setYear(100);
		boolean b27 = year19.equals((java.lang.Object) year22);
		boolean b28 = day17.equals((java.lang.Object) b27);
		Date date33 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year34 = date33.getYear();
		boolean b36 = date33.equals((java.lang.Object) "hi!");
		Month month37 = date33.getMonth();
		int i38 = month37.getMonthSize();
		int i39 = month37.getMonthSize();
		Year year41 = new Year(1);
		boolean b42 = year41.isValid();
		boolean b43 = year41.isValid();
		boolean b44 = year41.isValid();
		boolean b45 = month37.equals((java.lang.Object) year41);
		try {
			day17.setDay((int) ' ', month37);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test50() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test099");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		Day day6 = date3.getDay();
		int i7 = day6.getDay();
		boolean b8 = day6.increment();
		int i9 = day6.getDay();
	}

	@Test
	public void test51() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test102");
		Year year1 = new Year((int) (short) 100);
		boolean b2 = year1.isValid();
		int i3 = year1.getYear();
		boolean b4 = year1.isLeap();
		boolean b5 = year1.isLeap();
		boolean b6 = year1.increment();
		Date date10 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year11 = date10.getYear();
		boolean b13 = date10.equals((java.lang.Object) "hi!");
		java.lang.String str14 = date10.toString();
		boolean b16 = date10.equals((java.lang.Object) (short) 100);
		Date date17 = Nextday.nextDay(date10);
		date17.increment();
		date17.printDate();
		Date date20 = Nextday.nextDay(date17);
		Month month21 = date20.getMonth();
		boolean b22 = year1.equals((java.lang.Object) date20);
		Date date23 = Nextday.nextDay(date20);
	}

	@Test
	public void test52() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test103");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		boolean b4 = year2.isLeap();
		java.lang.Object obj5 = new java.lang.Object();
		boolean b6 = year2.equals(obj5);
		boolean b7 = year2.isValid();
		Month month8 = new Month((int) (byte) 10, year2);
		int i9 = year2.getYear();
		boolean b10 = year2.isValid();
	}

	@Test
	public void test53() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test106");
		Year year1 = new Year(1);
		boolean b2 = year1.increment();
		int i3 = year1.getYear();
		boolean b4 = year1.isValid();
		boolean b5 = year1.isValid();
	}

	@Test
	public void test54() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test107");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isValid();
		int i5 = year2.getYear();
		year2.setYear((int) (byte) -1);
		boolean b8 = year2.isValid();
		try {
			Month month9 = new Month((-1), year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test55() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test108");
		Date date3 = new Date(10, 3, 33);
		Year year4 = date3.getYear();
		Day day5 = date3.getDay();
	}

	@Test
	public void test56() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test109");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Date date10 = Nextday.nextDay(date3);
		date10.increment();
		date10.printDate();
		Day day13 = date10.getDay();
		Year year17 = new Year(11);
		int i18 = year17.getYear();
		year17.setYear(52);
		Month month21 = new Month(10, year17);
		try {
			day13.setDay(100, month21);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test57() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test111");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		date3.printDate();
		java.lang.String str10 = date3.toString();
		Day day11 = date3.getDay();
		java.lang.String str12 = date3.toString();
	}

	@Test
	public void test58() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test112");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		Year year7 = new Year((int) (byte) 100);
		boolean b8 = year7.isValid();
		Month month9 = new Month((int) (short) 10, year7);
		boolean b10 = month9.increment();
		boolean b11 = date3.equals((java.lang.Object) month9);
		Year year12 = date3.getYear();
		Date date13 = Nextday.nextDay(date3);
		Month month14 = date13.getMonth();
		Month month15 = date13.getMonth();
		Date date16 = Nextday.nextDay(date13);
		date16.increment();
	}

	@Test
	public void test59() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test114");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date5 = Nextday.nextDay(date4);
		Year year8 = new Year((int) (byte) 100);
		boolean b9 = year8.isValid();
		Month month10 = new Month((int) (short) 10, year8);
		boolean b11 = month10.increment();
		int i12 = month10.getMonthSize();
		boolean b13 = month10.isValid();
		boolean b14 = date5.equals((java.lang.Object) month10);
		int i15 = month10.getMonthSize();
		int i16 = month10.getMonth();
		Date date21 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year22 = date21.getYear();
		boolean b24 = date21.equals((java.lang.Object) "hi!");
		date21.printDate();
		Year year26 = date21.getYear();
		date21.increment();
		Date date28 = Nextday.nextDay(date21);
		Year year29 = date21.getYear();
		Year year31 = new Year(1);
		boolean b32 = year31.increment();
		int i33 = year31.getYear();
		year31.setYear((int) (short) -1);
		boolean b36 = year29.equals((java.lang.Object) (short) -1);
		year29.setYear(3);
		month10.setMonth((int) (short) 1, year29);
		Day day40 = new Day(11, month10);
		boolean b41 = day40.increment();
	}

	@Test
	public void test60() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test115");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.printDate();
		Year year8 = date3.getYear();
		date3.printDate();
		date3.printDate();
	}

	@Test
	public void test61() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test116");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		Month month10 = date9.getMonth();
		date9.printDate();
		Day day12 = date9.getDay();
		Month month13 = date9.getMonth();
		boolean b14 = month13.increment();
	}

	@Test
	public void test62() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test117");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.printDate();
		Year year8 = date3.getYear();
		date3.increment();
		Date date10 = Nextday.nextDay(date3);
		Day day11 = date10.getDay();
		Year year16 = new Year((int) (byte) 100);
		boolean b17 = year16.isValid();
		Month month18 = new Month((int) (short) 10, year16);
		boolean b19 = month18.increment();
		int i20 = month18.getMonthSize();
		boolean b21 = month18.isValid();
		Day day22 = new Day(10, month18);
		Day day23 = new Day(12, month18);
		boolean b24 = month18.increment();
		boolean b25 = day11.equals((java.lang.Object) month18);
	}

	@Test
	public void test63() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test120");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		int i6 = month5.getMonth();
		Day day7 = new Day(30, month5);
		boolean b8 = month5.increment();
		boolean b9 = month5.isValid();
		Date date14 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date15 = Nextday.nextDay(date14);
		date14.printDate();
		Month month17 = date14.getMonth();
		Month month18 = date14.getMonth();
		Year year19 = date14.getYear();
		try {
			month5.setMonth(13, year19);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test64() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test123");
		try {
			Date date3 = new Date((int) ' ', (int) '4', (int) 'a');
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test65() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test127");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		date3.increment();
		date3.increment();
		date3.increment();
		Year year8 = date3.getYear();
		date3.printDate();
	}

	@Test
	public void test66() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test129");
		Year year2 = new Year(12);
		boolean b3 = year2.isLeap();
		int i4 = year2.getYear();
		try {
			Month month5 = new Month((int) '4', year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test67() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test130");
		Year year2 = new Year(97);
		try {
			Month month3 = new Month(28, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test68() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test131");
		Year year3 = new Year(1);
		boolean b4 = year3.isLeap();
		boolean b5 = year3.isLeap();
		java.lang.Object obj6 = new java.lang.Object();
		boolean b7 = year3.equals(obj6);
		boolean b8 = year3.isValid();
		Month month9 = new Month((int) (byte) 10, year3);
		int i10 = month9.getMonth();
		try {
			Day day11 = new Day(100, month9);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test69() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test132");
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
		Year year16 = new Year(1);
		boolean b17 = year16.isLeap();
		boolean b18 = year16.isLeap();
		boolean b19 = date3.equals((java.lang.Object) year16);
		int i20 = year16.getYear();
		boolean b21 = year16.isLeap();
		java.lang.Object obj22 = null;
		boolean b23 = year16.equals(obj22);
	}

	@Test
	public void test70() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test133");
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
		boolean b20 = day7.increment();
		int i21 = day7.getDay();
		int i22 = day7.getDay();
		boolean b23 = day7.isValid();
	}

	@Test
	public void test71() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test134");
		Date date3 = new Date((int) (byte) 10, 5, (int) (byte) 100);
	}

	@Test
	public void test72() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test135");
		Year year4 = new Year(1);
		boolean b5 = year4.isValid();
		boolean b6 = year4.isLeap();
		int i7 = year4.getYear();
		boolean b8 = year4.isLeap();
		Month month9 = new Month((int) (byte) 1, year4);
		Day day10 = new Day(31, month9);
		boolean b11 = month9.increment();
		try {
			Day day12 = new Day((int) '#', month9);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test73() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test136");
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
		Date date24 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year25 = date24.getYear();
		boolean b27 = date24.equals((java.lang.Object) "hi!");
		java.lang.String str28 = date24.toString();
		Year year29 = date24.getYear();
		Date date30 = Nextday.nextDay(date24);
		Month month31 = date30.getMonth();
		boolean b32 = month31.increment();
		try {
			day16.setDay(0, month31);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test74() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test140");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		Day day8 = date3.getDay();
		Year year9 = date3.getYear();
		java.lang.String str10 = date3.toString();
	}

	@Test
	public void test75() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test144");
		Year year1 = new Year((int) (short) 10);
		boolean b2 = year1.isValid();
	}

	@Test
	public void test76() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test146");
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
		boolean b25 = month8.increment();
		java.lang.Object obj26 = null;
		boolean b27 = month8.equals(obj26);
	}

	@Test
	public void test77() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test148");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		int i6 = month5.getMonth();
		Day day7 = new Day(30, month5);
		boolean b8 = day7.isValid();
		int i9 = day7.getDay();
		int i10 = day7.getDay();
	}

	@Test
	public void test78() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test149");
		Year year1 = new Year(31);
		int i2 = year1.getYear();
		boolean b3 = year1.isLeap();
		int i4 = year1.getYear();
		Year year7 = new Year(1);
		boolean b8 = year7.isValid();
		boolean b9 = year7.isLeap();
		int i10 = year7.getYear();
		boolean b11 = year7.isLeap();
		Month month12 = new Month((int) (byte) 1, year7);
		int i13 = month12.getMonthSize();
		int i14 = month12.getMonthSize();
		int i15 = month12.getMonthSize();
		boolean b16 = month12.isValid();
		int i17 = month12.getMonth();
		boolean b18 = month12.increment();
		Year year21 = new Year(1);
		boolean b22 = year21.isLeap();
		boolean b23 = year21.isLeap();
		java.lang.Object obj24 = new java.lang.Object();
		boolean b25 = year21.equals(obj24);
		boolean b26 = year21.increment();
		month12.setMonth(1, year21);
		int i28 = month12.getMonth();
		int i29 = month12.getMonthSize();
		boolean b30 = year1.equals((java.lang.Object) month12);
		boolean b31 = year1.increment();
	}

	@Test
	public void test79() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test151");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		Day day9 = date3.getDay();
		boolean b10 = day9.isValid();
		int i11 = day9.getDay();
		int i12 = day9.getDay();
		Year year14 = new Year((int) (byte) 100);
		int i15 = year14.getYear();
		int i16 = year14.getYear();
		boolean b17 = year14.isValid();
		int i18 = year14.getYear();
		boolean b19 = day9.equals((java.lang.Object) year14);
		Date date24 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year25 = date24.getYear();
		boolean b27 = date24.equals((java.lang.Object) "hi!");
		java.lang.String str28 = date24.toString();
		Year year29 = date24.getYear();
		Date date30 = Nextday.nextDay(date24);
		Month month31 = date30.getMonth();
		int i32 = month31.getMonthSize();
		int i33 = month31.getMonthSize();
		int i34 = month31.getMonthSize();
		try {
			day9.setDay(33, month31);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test80() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test153");
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
		Year year15 = date3.getYear();
		boolean b16 = year15.isValid();
		boolean b17 = year15.isLeap();
	}

	@Test
	public void test81() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test154");
		Year year4 = new Year((int) (byte) 100);
		boolean b5 = year4.isValid();
		Month month6 = new Month((int) (short) 10, year4);
		boolean b7 = month6.increment();
		int i8 = month6.getMonth();
		int i9 = month6.getMonth();
		Day day10 = new Day((int) (byte) 1, month6);
		Year year12 = new Year(1);
		boolean b13 = year12.isValid();
		boolean b14 = year12.isValid();
		boolean b15 = year12.isLeap();
		int i16 = year12.getYear();
		boolean b17 = year12.increment();
		int i18 = year12.getYear();
		boolean b19 = year12.isLeap();
		year12.setYear((int) (short) 100);
		boolean b22 = day10.equals((java.lang.Object) year12);
		year12.setYear(3);
		Month month25 = new Month(4, year12);
	}

	@Test
	public void test82() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test155");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		int i4 = year2.getYear();
		try {
			Month month5 = new Month(0, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test83() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test156");
		Year year2 = new Year(100);
		try {
			Month month3 = new Month((int) (byte) 100, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test84() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test157");
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
		boolean b23 = month16.isValid();
		boolean b24 = month16.increment();
		int i25 = month16.getMonthSize();
	}

	@Test
	public void test85() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test158");
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
		int i19 = day7.getDay();
		int i20 = day7.getDay();
		int i21 = day7.getDay();
		int i22 = day7.getDay();
		boolean b23 = day7.increment();
		int i24 = day7.getDay();
		Year year28 = new Year((int) (byte) 100);
		boolean b29 = year28.isValid();
		Month month30 = new Month((int) (short) 10, year28);
		int i31 = month30.getMonth();
		Year year34 = new Year((int) (short) 1);
		boolean b35 = year34.isLeap();
		month30.setMonth((int) (short) 10, year34);
		int i37 = month30.getMonthSize();
		boolean b38 = month30.isValid();
		boolean b39 = month30.increment();
		try {
			day7.setDay(31, month30);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test86() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test159");
		Year year4 = new Year(1);
		boolean b5 = year4.isValid();
		boolean b6 = year4.isLeap();
		int i7 = year4.getYear();
		boolean b8 = year4.isLeap();
		Month month9 = new Month((int) (byte) 1, year4);
		Day day10 = new Day(31, month9);
		boolean b11 = day10.isValid();
		boolean b12 = day10.increment();
		boolean b13 = day10.increment();
		Year year16 = new Year(1);
		boolean b17 = year16.isValid();
		boolean b18 = year16.isValid();
		boolean b19 = year16.isValid();
		boolean b20 = year16.isValid();
		Month month21 = new Month(12, year16);
		boolean b22 = day10.equals((java.lang.Object) year16);
		year16.setYear(31);
		boolean b25 = year16.isValid();
		try {
			Month month26 = new Month(97, year16);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test87() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test161");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isValid();
		boolean b6 = year3.isValid();
		boolean b7 = year3.isValid();
		int i8 = year3.getYear();
		Month month9 = new Month((int) (short) 1, year3);
		try {
			Month month10 = new Month(0, year3);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test88() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test162");
		Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b7 = date5.equals((java.lang.Object) (-1));
		Year year8 = date5.getYear();
		Month month9 = new Month(3, year8);
		year8.setYear((int) 'a');
		try {
			Month month12 = new Month(53, year8);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test89() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test167");
		Year year1 = new Year(5);
		year1.setYear(10);
	}

	@Test
	public void test90() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test168");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isValid();
		boolean b6 = year3.isValid();
		boolean b7 = year3.isValid();
		int i8 = year3.getYear();
		Month month9 = new Month((int) (short) 10, year3);
		boolean b10 = year3.isValid();
		try {
			Month month11 = new Month(31, year3);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test91() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test169");
		try {
			Date date3 = new Date(30, 0, 12);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test92() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test170");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		date3.printDate();
		java.lang.String str7 = date3.toString();
		Day day8 = date3.getDay();
		Date date9 = Nextday.nextDay(date3);
		Date date10 = Nextday.nextDay(date9);
		Date date11 = Nextday.nextDay(date9);
		java.lang.String str12 = date11.toString();
	}

	@Test
	public void test93() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test171");
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
		Year year20 = new Year(1);
		boolean b21 = year20.isValid();
		boolean b22 = year20.isValid();
		boolean b23 = year20.isValid();
		boolean b24 = year20.isValid();
		boolean b25 = year20.isValid();
		boolean b26 = day16.equals((java.lang.Object) year20);
		int i27 = year20.getYear();
	}

	@Test
	public void test94() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test174");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		boolean b4 = year2.isLeap();
		boolean b5 = year2.increment();
		java.lang.Object obj6 = null;
		boolean b7 = year2.equals(obj6);
		int i8 = year2.getYear();
		boolean b9 = year2.isLeap();
		int i10 = year2.getYear();
		Date date14 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year15 = date14.getYear();
		boolean b17 = date14.equals((java.lang.Object) "hi!");
		Day day18 = date14.getDay();
		Year year22 = new Year((int) (byte) 100);
		boolean b23 = year22.isValid();
		Month month24 = new Month((int) (short) 10, year22);
		day18.setDay((int) (short) 10, month24);
		java.lang.Object obj26 = null;
		boolean b27 = day18.equals(obj26);
		boolean b28 = day18.increment();
		int i29 = day18.getDay();
		boolean b30 = day18.increment();
		boolean b31 = day18.isValid();
		boolean b32 = year2.equals((java.lang.Object) day18);
		try {
			Month month33 = new Month((int) ' ', year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test95() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test177");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		int i8 = month7.getMonthSize();
		int i9 = month7.getMonthSize();
		int i10 = month7.getMonth();
		Year year13 = new Year((int) (short) 1);
		boolean b14 = year13.isLeap();
		try {
			month7.setMonth(97, year13);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test96() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test179");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isValid();
		Month month5 = new Month((int) (short) 10, year2);
		int i6 = month5.getMonthSize();
		int i7 = month5.getMonth();
		int i8 = month5.getMonth();
		boolean b9 = month5.isValid();
		boolean b10 = month5.isValid();
	}

	@Test
	public void test97() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test180");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		boolean b3 = year1.increment();
		boolean b4 = year1.isValid();
		year1.setYear(3);
		boolean b7 = year1.increment();
	}

	@Test
	public void test98() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test182");
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
		boolean b16 = day14.increment();
		boolean b17 = day14.isValid();
	}

	@Test
	public void test99() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test183");
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
		java.lang.Object obj16 = null;
		boolean b17 = date3.equals(obj16);
		date3.printDate();
	}

	@Test
	public void test100() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test185");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		Day day8 = date3.getDay();
		Date date9 = Nextday.nextDay(date3);
		date9.printDate();
	}

	@Test
	public void test101() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test191");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		Date date8 = Nextday.nextDay(date3);
		Date date9 = Nextday.nextDay(date8);
		Month month10 = date8.getMonth();
		Month month11 = date8.getMonth();
		java.lang.String str12 = date8.toString();
		Year year14 = new Year(10);
		boolean b15 = date8.equals((java.lang.Object) 10);
		date8.printDate();
	}

	@Test
	public void test102() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test194");
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
		date3.increment();
		java.lang.String str22 = date3.toString();
		Year year23 = date3.getYear();
	}

	@Test
	public void test103() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test195");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		Month month8 = date4.getMonth();
		int i9 = month8.getMonthSize();
		boolean b10 = month8.increment();
		Day day11 = new Day(2, month8);
		boolean b12 = day11.increment();
		boolean b13 = day11.increment();
	}

	@Test
	public void test104() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test198");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		boolean b7 = month5.equals((java.lang.Object) 10L);
		boolean b8 = month5.isValid();
		int i9 = month5.getMonthSize();
		boolean b10 = month5.isValid();
		try {
			Day day11 = new Day(100, month5);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test105() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test199");
		Year year1 = new Year(101);
		boolean b2 = year1.increment();
		year1.setYear(32);
		Year year6 = new Year((int) (short) 100);
		boolean b7 = year6.increment();
		Year year9 = new Year(1);
		boolean b10 = year9.isValid();
		int i11 = year9.getYear();
		year9.setYear(100);
		boolean b14 = year6.equals((java.lang.Object) year9);
		boolean b16 = year9.equals((java.lang.Object) (byte) -1);
		boolean b17 = year9.isValid();
		boolean b18 = year1.equals((java.lang.Object) year9);
		java.lang.Object obj19 = null;
		boolean b20 = year9.equals(obj19);
	}

	@Test
	public void test106() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test200");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		boolean b3 = year1.increment();
		boolean b4 = year1.isLeap();
		boolean b5 = year1.isValid();
	}

	@Test
	public void test107() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test201");
		Date date3 = new Date((int) (short) 10, 11, (int) (short) 100);
		Month month4 = date3.getMonth();
		Month month5 = date3.getMonth();
		Month month6 = date3.getMonth();
	}

	@Test
	public void test108() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test202");
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
		boolean b14 = day10.isValid();
		boolean b15 = day10.isValid();
		boolean b16 = day10.isValid();
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
			day10.setDay((int) (short) 0, month30);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test109() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test206");
		Year year1 = new Year(32);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isLeap();
	}

	@Test
	public void test110() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test208");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		int i3 = year1.getYear();
		boolean b5 = year1.equals((java.lang.Object) 1);
		boolean b6 = year1.isValid();
		boolean b7 = year1.isLeap();
		boolean b8 = year1.isValid();
		year1.setYear(13);
		boolean b11 = year1.isValid();
	}

	@Test
	public void test111() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test209");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		java.lang.String str8 = date4.toString();
		boolean b10 = date4.equals((java.lang.Object) (short) 100);
		Date date11 = Nextday.nextDay(date4);
		date11.increment();
		Month month13 = date11.getMonth();
		java.lang.String str14 = date11.toString();
		Month month15 = date11.getMonth();
		Day day16 = new Day(2, month15);
		boolean b17 = day16.increment();
		Date date22 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date22.printDate();
		Year year24 = date22.getYear();
		Date date25 = Nextday.nextDay(date22);
		Date date26 = Nextday.nextDay(date22);
		date26.printDate();
		Month month28 = date26.getMonth();
		boolean b29 = month28.increment();
		try {
			day16.setDay(102, month28);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test112() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test211");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.printDate();
		Year year8 = date3.getYear();
		date3.increment();
		Date date10 = Nextday.nextDay(date3);
		Month month11 = date10.getMonth();
		Day day12 = date10.getDay();
		Year year16 = new Year((int) (byte) 100);
		boolean b17 = year16.isValid();
		Month month18 = new Month((int) (short) 10, year16);
		boolean b20 = month18.equals((java.lang.Object) 10L);
		Year year22 = new Year(1);
		int i23 = year22.getYear();
		boolean b24 = month18.equals((java.lang.Object) i23);
		try {
			day12.setDay((int) (short) 100, month18);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test113() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test213");
		try {
			Date date3 = new Date((int) '4', (int) (byte) 0, 0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test114() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test214");
		Year year1 = new Year(100);
		Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year6 = date5.getYear();
		boolean b8 = date5.equals((java.lang.Object) "hi!");
		java.lang.String str9 = date5.toString();
		Year year10 = date5.getYear();
		Date date11 = Nextday.nextDay(date5);
		Month month12 = date5.getMonth();
		Year year13 = date5.getYear();
		boolean b14 = year1.equals((java.lang.Object) date5);
		Year year15 = date5.getYear();
	}

	@Test
	public void test115() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test216");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		boolean b7 = month5.equals((java.lang.Object) 10L);
		boolean b8 = month5.isValid();
		boolean b9 = month5.increment();
		Day day10 = new Day((int) (short) 1, month5);
		boolean b11 = month5.isValid();
	}

	@Test
	public void test116() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test217");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		Day day5 = date4.getDay();
		Year year6 = date4.getYear();
		date4.printDate();
		Date date8 = Nextday.nextDay(date4);
		Date date9 = Nextday.nextDay(date8);
	}

	@Test
	public void test117() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test218");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		date3.printDate();
		Year year9 = date3.getYear();
		Year year10 = date3.getYear();
		Year year11 = date3.getYear();
		Year year12 = date3.getYear();
		boolean b13 = year12.isLeap();
	}

	@Test
	public void test118() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test219");
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
		boolean b31 = year1.isLeap();
		boolean b32 = year1.increment();
		int i33 = year1.getYear();
	}

	@Test
	public void test119() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test220");
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
		year16.setYear(28);
		year16.setYear((int) (short) -1);
	}

	@Test
	public void test120() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test226");
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
		Month month16 = date10.getMonth();
	}

	@Test
	public void test121() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test230");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		Date date6 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year7 = date6.getYear();
		boolean b9 = date6.equals((java.lang.Object) "hi!");
		boolean b10 = year1.equals((java.lang.Object) date6);
		year1.setYear((int) 'a');
		int i13 = year1.getYear();
	}

	@Test
	public void test122() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test235");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		Day day9 = date3.getDay();
		boolean b10 = day9.isValid();
		int i11 = day9.getDay();
		int i12 = day9.getDay();
		boolean b13 = day9.isValid();
		Year year17 = new Year((int) (byte) 100);
		boolean b18 = year17.isValid();
		Month month19 = new Month((int) (short) 10, year17);
		boolean b20 = month19.increment();
		boolean b21 = month19.isValid();
		int i22 = month19.getMonth();
		try {
			day9.setDay(32, month19);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test123() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test236");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		Date date8 = Nextday.nextDay(date3);
		Year year9 = date3.getYear();
		Month month10 = date3.getMonth();
		boolean b11 = month10.increment();
	}

	@Test
	public void test124() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test237");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		boolean b8 = month7.increment();
		Year year11 = new Year((int) (byte) 100);
		java.lang.Object obj12 = new java.lang.Object();
		boolean b13 = year11.equals(obj12);
		Date date17 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year18 = date17.getYear();
		boolean b20 = date17.equals((java.lang.Object) "hi!");
		Month month21 = date17.getMonth();
		boolean b22 = year11.equals((java.lang.Object) date17);
		Day day23 = date17.getDay();
		Year year25 = new Year((int) (short) 100);
		boolean b26 = year25.increment();
		Year year28 = new Year(1);
		boolean b29 = year28.isValid();
		int i30 = year28.getYear();
		year28.setYear(100);
		boolean b33 = year25.equals((java.lang.Object) year28);
		boolean b34 = day23.equals((java.lang.Object) year28);
		boolean b35 = year28.increment();
		boolean b36 = year28.increment();
		int i37 = year28.getYear();
		boolean b38 = year28.isValid();
		try {
			month7.setMonth((int) (short) 100, year28);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test125() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test239");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isValid();
		boolean b5 = year2.isValid();
		boolean b6 = year2.isValid();
		Month month7 = new Month(12, year2);
		int i8 = year2.getYear();
		boolean b9 = year2.isLeap();
	}

	@Test
	public void test126() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test240");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		Year year7 = new Year((int) (byte) 100);
		boolean b8 = year7.isValid();
		Month month9 = new Month((int) (short) 10, year7);
		boolean b10 = month9.increment();
		boolean b11 = date3.equals((java.lang.Object) month9);
		Year year12 = date3.getYear();
		Date date13 = Nextday.nextDay(date3);
		Date date14 = Nextday.nextDay(date3);
		Month month15 = date14.getMonth();
		Year year16 = date14.getYear();
	}

	@Test
	public void test127() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test243");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		java.lang.String str8 = date3.toString();
		date3.increment();
	}

	@Test
	public void test128() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test245");
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
		Date date16 = Nextday.nextDay(date13);
		date13.printDate();
		Date date18 = Nextday.nextDay(date13);
	}

	@Test
	public void test129() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test251");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		Year year7 = new Year((int) (byte) 100);
		boolean b8 = year7.isValid();
		Month month9 = new Month((int) (short) 10, year7);
		boolean b10 = month9.increment();
		boolean b11 = date3.equals((java.lang.Object) month9);
		Year year13 = new Year(1);
		boolean b14 = year13.isValid();
		boolean b15 = year13.increment();
		boolean b16 = month9.equals((java.lang.Object) year13);
		int i17 = month9.getMonthSize();
		boolean b18 = month9.increment();
		int i19 = month9.getMonth();
	}

	@Test
	public void test130() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test255");
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
		boolean b20 = day16.isValid();
		boolean b21 = day16.isValid();
		boolean b22 = day16.increment();
	}

	@Test
	public void test131() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test256");
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
		boolean b23 = year16.isValid();
	}

	@Test
	public void test132() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test259");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		java.lang.String str8 = date4.toString();
		Year year10 = new Year((int) (byte) 100);
		int i11 = year10.getYear();
		boolean b12 = date4.equals((java.lang.Object) year10);
		Year year13 = date4.getYear();
		Month month14 = date4.getMonth();
		java.lang.Object obj15 = null;
		boolean b16 = month14.equals(obj15);
		try {
			Day day17 = new Day(97, month14);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test133() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test263");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Year year11 = new Year((int) (byte) 100);
		boolean b12 = year11.isValid();
		Month month13 = new Month((int) (short) 10, year11);
		day7.setDay((int) (short) 10, month13);
		Year year17 = new Year(52);
		Month month18 = new Month((int) (short) 10, year17);
		year17.setYear(102);
		boolean b21 = day7.equals((java.lang.Object) year17);
		int i22 = day7.getDay();
		Year year26 = new Year((int) (byte) 100);
		boolean b27 = year26.isValid();
		Month month28 = new Month((int) (short) 10, year26);
		boolean b29 = month28.increment();
		int i30 = month28.getMonthSize();
		boolean b31 = month28.isValid();
		boolean b32 = month28.increment();
		try {
			day7.setDay((int) 'a', month28);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test134() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test265");
		Year year3 = new Year(1);
		boolean b4 = year3.isLeap();
		boolean b5 = year3.isLeap();
		boolean b6 = year3.increment();
		Month month7 = new Month((int) (short) 1, year3);
		Date date11 = new Date(10, (int) (byte) 10, (int) (short) 1);
		java.lang.String str12 = date11.toString();
		boolean b13 = month7.equals((java.lang.Object) date11);
		Day day14 = new Day((int) (byte) 10, month7);
		int i15 = month7.getMonth();
	}

	@Test
	public void test135() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test266");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		boolean b4 = year2.isLeap();
		boolean b5 = year2.increment();
		java.lang.Object obj6 = null;
		boolean b7 = year2.equals(obj6);
		int i8 = year2.getYear();
		boolean b9 = year2.isLeap();
		int i10 = year2.getYear();
		boolean b11 = year2.increment();
		Month month12 = new Month(3, year2);
		int i13 = year2.getYear();
	}

	@Test
	public void test136() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test269");
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
		date13.increment();
		Day day16 = date13.getDay();
		Year year17 = date13.getYear();
	}

	@Test
	public void test137() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test271");
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
		boolean b21 = month19.isValid();
		boolean b22 = month19.increment();
	}

	@Test
	public void test138() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test272");
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
		date3.increment();
		Month month18 = date3.getMonth();
		java.lang.Object obj19 = null;
		boolean b20 = date3.equals(obj19);
	}

	@Test
	public void test139() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test273");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		date3.printDate();
		Month month6 = date3.getMonth();
		int i7 = month6.getMonth();
		Date date11 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year12 = date11.getYear();
		boolean b14 = date11.equals((java.lang.Object) "hi!");
		Day day15 = date11.getDay();
		Year year19 = new Year((int) (byte) 100);
		boolean b20 = year19.isValid();
		Month month21 = new Month((int) (short) 10, year19);
		day15.setDay((int) (short) 10, month21);
		java.lang.Object obj23 = null;
		boolean b24 = day15.equals(obj23);
		boolean b26 = day15.equals((java.lang.Object) "hi!");
		int i27 = day15.getDay();
		boolean b28 = month6.equals((java.lang.Object) i27);
	}

	@Test
	public void test140() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test275");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		Month month8 = date3.getMonth();
		Year year9 = date3.getYear();
	}

	@Test
	public void test141() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test280");
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
		boolean b17 = day14.increment();
		int i18 = day14.getDay();
		Year year22 = new Year((int) (byte) 100);
		Month month23 = new Month((int) (short) 1, year22);
		int i24 = month23.getMonth();
		day14.setDay(4, month23);
	}

	@Test
	public void test142() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test282");
		try {
			Date date3 = new Date((int) (byte) -1, 100, (int) (short) 1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test143() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test283");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		Year year7 = new Year((int) (byte) 100);
		boolean b8 = year7.isValid();
		Month month9 = new Month((int) (short) 10, year7);
		boolean b10 = month9.increment();
		boolean b11 = date3.equals((java.lang.Object) month9);
		Date date12 = Nextday.nextDay(date3);
	}

	@Test
	public void test144() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test284");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.increment();
		boolean b5 = year2.increment();
		boolean b6 = year2.isLeap();
		int i7 = year2.getYear();
		Month month8 = new Month(1, year2);
		int i9 = month8.getMonth();
		Year year12 = new Year(1);
		boolean b13 = year12.isLeap();
		boolean b14 = year12.isLeap();
		java.lang.Object obj15 = new java.lang.Object();
		boolean b16 = year12.equals(obj15);
		boolean b17 = year12.increment();
		Date date21 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year22 = date21.getYear();
		boolean b24 = date21.equals((java.lang.Object) "hi!");
		java.lang.String str25 = date21.toString();
		boolean b27 = date21.equals((java.lang.Object) (short) 100);
		Year year28 = date21.getYear();
		Date date29 = Nextday.nextDay(date21);
		date29.increment();
		boolean b31 = year12.equals((java.lang.Object) date29);
		boolean b32 = year12.isValid();
		try {
			month8.setMonth(33, year12);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test145() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test285");
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
		Date date26 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date30 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year31 = date30.getYear();
		boolean b33 = date30.equals((java.lang.Object) "hi!");
		Day day34 = date30.getDay();
		Year year38 = new Year((int) (byte) 100);
		boolean b39 = year38.isValid();
		Month month40 = new Month((int) (short) 10, year38);
		day34.setDay((int) (short) 10, month40);
		java.lang.Object obj42 = null;
		boolean b43 = day34.equals(obj42);
		boolean b44 = day34.increment();
		int i45 = day34.getDay();
		boolean b46 = day34.isValid();
		boolean b47 = date26.equals((java.lang.Object) day34);
		Month month48 = date26.getMonth();
		Month month49 = date26.getMonth();
		Month month50 = date26.getMonth();
		Day day51 = date26.getDay();
		Month month52 = date26.getMonth();
		boolean b53 = month52.increment();
		try {
			day7.setDay(97, month52);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test146() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test286");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Year year10 = date3.getYear();
		Date date11 = Nextday.nextDay(date3);
		java.lang.String str12 = date3.toString();
		Year year13 = date3.getYear();
		date3.increment();
		Year year17 = new Year((int) (byte) 100);
		boolean b18 = year17.isValid();
		Month month19 = new Month((int) (short) 10, year17);
		boolean b20 = month19.increment();
		int i21 = month19.getMonth();
		int i22 = month19.getMonth();
		int i23 = month19.getMonthSize();
		int i24 = month19.getMonthSize();
		boolean b25 = date3.equals((java.lang.Object) i24);
	}

	@Test
	public void test147() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test287");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		Month month5 = date3.getMonth();
		date3.increment();
		java.lang.String str7 = date3.toString();
	}

	@Test
	public void test148() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test288");
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
		boolean b17 = day15.isValid();
		boolean b18 = day15.isValid();
		Year year22 = new Year(1);
		boolean b23 = year22.isValid();
		boolean b24 = year22.isValid();
		boolean b25 = year22.isValid();
		boolean b26 = year22.isValid();
		int i27 = year22.getYear();
		Month month28 = new Month((int) (short) 10, year22);
		boolean b29 = month28.isValid();
		try {
			day15.setDay((int) ' ', month28);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test149() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test290");
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
		Year year28 = new Year(1);
		boolean b29 = year28.isValid();
		boolean b30 = year28.isValid();
		boolean b31 = year28.isValid();
		boolean b32 = year28.isValid();
		Month month33 = new Month(12, year28);
		Month month34 = new Month(11, year28);
		try {
			day7.setDay((int) 'a', month34);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test150() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test292");
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
		java.lang.String str16 = date14.toString();
		Date date17 = Nextday.nextDay(date14);
		Year year18 = date14.getYear();
		int i19 = year18.getYear();
		try {
			Month month20 = new Month(30, year18);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test151() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test294");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		Day day5 = date4.getDay();
		Year year6 = date4.getYear();
		Year year7 = date4.getYear();
		Year year8 = date4.getYear();
		Year year9 = date4.getYear();
		Date date10 = Nextday.nextDay(date4);
	}

	@Test
	public void test152() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test297");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		date3.printDate();
		java.lang.String str9 = date3.toString();
		Year year10 = date3.getYear();
		Date date11 = Nextday.nextDay(date3);
		date11.printDate();
	}

	@Test
	public void test153() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test298");
		try {
			Date date3 = new Date(5, (int) (short) 0, (int) ' ');
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test154() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test301");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		Day day6 = date3.getDay();
		Day day7 = date3.getDay();
		date3.printDate();
		Month month9 = date3.getMonth();
		int i10 = month9.getMonth();
	}

	@Test
	public void test155() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test304");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		Year year7 = new Year((int) (byte) 100);
		boolean b8 = year7.isValid();
		Month month9 = new Month((int) (short) 10, year7);
		boolean b10 = month9.increment();
		boolean b11 = date3.equals((java.lang.Object) month9);
		Year year12 = date3.getYear();
		Date date13 = Nextday.nextDay(date3);
		Day day14 = date3.getDay();
		date3.printDate();
	}

	@Test
	public void test156() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test305");
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
		Day day16 = date13.getDay();
		boolean b17 = day16.isValid();
	}

	@Test
	public void test157() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test306");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b6 = month4.equals((java.lang.Object) 10L);
		Year year8 = new Year(1);
		boolean b9 = year8.increment();
		boolean b10 = month4.equals((java.lang.Object) year8);
		boolean b11 = year8.increment();
	}

	@Test
	public void test158() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test307");
		Date date3 = new Date(5, (int) (byte) 1, 12);
	}

	@Test
	public void test159() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test308");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		Year year7 = new Year((int) (byte) 100);
		boolean b8 = year7.isValid();
		Month month9 = new Month((int) (short) 10, year7);
		boolean b10 = month9.increment();
		int i11 = month9.getMonthSize();
		boolean b12 = month9.isValid();
		boolean b13 = date4.equals((java.lang.Object) month9);
		Year year14 = date4.getYear();
		date4.increment();
		Date date16 = Nextday.nextDay(date4);
		Day day17 = date4.getDay();
		Year year21 = new Year(1);
		boolean b22 = year21.isValid();
		boolean b23 = year21.isValid();
		boolean b24 = year21.isValid();
		boolean b25 = year21.isValid();
		int i26 = year21.getYear();
		Month month27 = new Month((int) (short) 10, year21);
		int i28 = month27.getMonth();
		boolean b29 = month27.isValid();
		Year year32 = new Year((int) (byte) 100);
		boolean b33 = year32.isValid();
		Month month34 = new Month((int) (short) 10, year32);
		boolean b35 = month34.increment();
		boolean b36 = month34.increment();
		boolean b37 = month27.equals((java.lang.Object) month34);
		boolean b38 = month27.isValid();
		Year year40 = new Year((int) (byte) 100);
		int i41 = year40.getYear();
		int i42 = year40.getYear();
		boolean b43 = month27.equals((java.lang.Object) year40);
		try {
			day17.setDay((int) ' ', month27);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test160() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test312");
		Year year1 = new Year((int) ' ');
		boolean b2 = year1.isValid();
		boolean b3 = year1.isValid();
	}

	@Test
	public void test161() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test313");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		int i3 = year1.getYear();
		boolean b4 = year1.isValid();
		boolean b5 = year1.isLeap();
		boolean b6 = year1.isValid();
		boolean b7 = year1.isValid();
		boolean b8 = year1.increment();
	}

	@Test
	public void test162() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test320");
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
		boolean b17 = year2.increment();
	}

	@Test
	public void test163() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test322");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		boolean b6 = year3.increment();
		boolean b8 = year3.equals((java.lang.Object) (-1.0f));
		Year year10 = new Year(10);
		boolean b11 = year3.equals((java.lang.Object) year10);
		Month month12 = new Month((int) (byte) 1, year3);
		boolean b13 = month12.increment();
	}

	@Test
	public void test164() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test324");
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
		boolean b16 = day10.increment();
		boolean b17 = day10.increment();
		boolean b18 = day10.isValid();
	}

	@Test
	public void test165() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test328");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		boolean b8 = month7.increment();
		int i9 = month7.getMonthSize();
	}

	@Test
	public void test166() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test330");
		Year year1 = null;
		try {
			Month month2 = new Month(32, year1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test167() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test331");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		Date date8 = Nextday.nextDay(date3);
		Day day9 = date3.getDay();
		Year year13 = new Year((int) (byte) 100);
		java.lang.Object obj14 = new java.lang.Object();
		boolean b15 = year13.equals(obj14);
		Date date19 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year20 = date19.getYear();
		boolean b22 = date19.equals((java.lang.Object) "hi!");
		Month month23 = date19.getMonth();
		boolean b24 = year13.equals((java.lang.Object) date19);
		Date date25 = Nextday.nextDay(date19);
		java.lang.String str26 = date25.toString();
		Year year28 = new Year(1);
		boolean b29 = year28.isLeap();
		boolean b30 = year28.isLeap();
		boolean b31 = year28.increment();
		java.lang.Object obj32 = null;
		boolean b33 = year28.equals(obj32);
		int i34 = year28.getYear();
		int i35 = year28.getYear();
		boolean b36 = year28.increment();
		boolean b37 = date25.equals((java.lang.Object) year28);
		Month month38 = new Month((int) (byte) 10, year28);
		int i39 = month38.getMonth();
		try {
			day9.setDay((-1), month38);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test168() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test332");
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
		boolean b20 = day7.increment();
		int i21 = day7.getDay();
		Date date27 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year28 = date27.getYear();
		boolean b30 = date27.equals((java.lang.Object) "hi!");
		Month month31 = date27.getMonth();
		int i32 = month31.getMonthSize();
		boolean b33 = month31.increment();
		Day day34 = new Day(2, month31);
		boolean b35 = month31.increment();
		boolean b36 = month31.increment();
		try {
			day7.setDay(13, month31);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test169() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test335");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		date3.printDate();
		Year year6 = date3.getYear();
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		date3.increment();
		date3.increment();
		date3.printDate();
	}

	@Test
	public void test170() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test339");
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
		boolean b20 = day7.increment();
		int i21 = day7.getDay();
	}

	@Test
	public void test171() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test341");
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
		boolean b15 = month14.isValid();
		boolean b16 = month14.isValid();
		boolean b17 = month14.increment();
	}

	@Test
	public void test172() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test343");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		boolean b3 = year1.isLeap();
		boolean b4 = year1.increment();
		java.lang.Object obj5 = null;
		boolean b6 = year1.equals(obj5);
		boolean b7 = year1.isLeap();
		boolean b8 = year1.isValid();
		boolean b9 = year1.isLeap();
	}

	@Test
	public void test173() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test346");
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
		int i13 = month7.getMonthSize();
		boolean b14 = month7.isValid();
	}

	@Test
	public void test174() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test349");
		Year year1 = new Year(101);
		boolean b2 = year1.isValid();
		int i3 = year1.getYear();
	}

	@Test
	public void test175() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test351");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isValid();
		boolean b6 = year3.isValid();
		boolean b7 = year3.isValid();
		int i8 = year3.getYear();
		Month month9 = new Month((int) (short) 10, year3);
		int i10 = month9.getMonth();
		boolean b11 = month9.isValid();
		Year year14 = new Year((int) (byte) 100);
		boolean b15 = year14.isValid();
		Month month16 = new Month((int) (short) 10, year14);
		boolean b17 = month16.increment();
		boolean b18 = month16.increment();
		boolean b19 = month9.equals((java.lang.Object) month16);
		boolean b20 = month9.isValid();
		Year year22 = new Year((int) (byte) 100);
		int i23 = year22.getYear();
		int i24 = year22.getYear();
		boolean b25 = month9.equals((java.lang.Object) year22);
		try {
			Month month26 = new Month(30, year22);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test176() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test352");
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
		boolean b25 = day24.increment();
	}

	@Test
	public void test177() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test355");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		int i5 = month4.getMonth();
		Year year8 = new Year((int) (short) 1);
		boolean b9 = year8.isLeap();
		month4.setMonth((int) (short) 10, year8);
		Year year14 = new Year(1);
		boolean b15 = year14.isLeap();
		boolean b16 = year14.isLeap();
		boolean b17 = year14.increment();
		Month month18 = new Month((int) (short) 1, year14);
		Date date22 = new Date(10, (int) (byte) 10, (int) (short) 1);
		java.lang.String str23 = date22.toString();
		boolean b24 = month18.equals((java.lang.Object) date22);
		Day day25 = new Day((int) (byte) 10, month18);
		int i26 = month18.getMonthSize();
		boolean b27 = year8.equals((java.lang.Object) month18);
		boolean b28 = year8.increment();
		boolean b29 = year8.isValid();
	}

	@Test
	public void test178() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test356");
		try {
			Date date3 = new Date(13, (int) (short) 0, 2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test179() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test359");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		date3.printDate();
		java.lang.String str9 = date3.toString();
		Day day10 = date3.getDay();
		date3.increment();
		Year year12 = date3.getYear();
		Month month13 = date3.getMonth();
		Year year16 = new Year(1);
		boolean b17 = year16.isLeap();
		boolean b19 = year16.equals((java.lang.Object) 100.0f);
		Date date23 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year24 = date23.getYear();
		boolean b26 = date23.equals((java.lang.Object) "hi!");
		Day day27 = date23.getDay();
		Year year31 = new Year((int) (byte) 100);
		boolean b32 = year31.isValid();
		Month month33 = new Month((int) (short) 10, year31);
		day27.setDay((int) (short) 10, month33);
		java.lang.Object obj35 = null;
		boolean b36 = day27.equals(obj35);
		boolean b37 = day27.increment();
		boolean b38 = day27.isValid();
		boolean b39 = day27.isValid();
		boolean b40 = year16.equals((java.lang.Object) b39);
		boolean b41 = year16.increment();
		Year year43 = new Year((int) (byte) 100);
		boolean b44 = year43.isValid();
		boolean b45 = year43.increment();
		year43.setYear((int) '4');
		boolean b48 = year43.isValid();
		year43.setYear(30);
		boolean b51 = year16.equals((java.lang.Object) year43);
		int i52 = year16.getYear();
		try {
			month13.setMonth(35, year16);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test180() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test360");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		date3.printDate();
		date3.increment();
		date3.increment();
		Date date11 = Nextday.nextDay(date3);
	}

	@Test
	public void test181() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test361");
		try {
			Date date3 = new Date(97, 52, 52);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test182() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test363");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		java.lang.String str4 = date3.toString();
		Date date5 = Nextday.nextDay(date3);
		java.lang.String str6 = date3.toString();
		Month month7 = date3.getMonth();
		date3.printDate();
	}

	@Test
	public void test183() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test365");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		Year year7 = new Year((int) (byte) 100);
		boolean b8 = year7.isValid();
		Month month9 = new Month((int) (short) 10, year7);
		boolean b10 = month9.increment();
		int i11 = month9.getMonthSize();
		boolean b12 = month9.isValid();
		boolean b13 = date4.equals((java.lang.Object) month9);
		int i14 = month9.getMonthSize();
		int i15 = month9.getMonth();
		Date date20 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year21 = date20.getYear();
		boolean b23 = date20.equals((java.lang.Object) "hi!");
		date20.printDate();
		Year year25 = date20.getYear();
		date20.increment();
		Date date27 = Nextday.nextDay(date20);
		Year year28 = date20.getYear();
		Year year30 = new Year(1);
		boolean b31 = year30.increment();
		int i32 = year30.getYear();
		year30.setYear((int) (short) -1);
		boolean b35 = year28.equals((java.lang.Object) (short) -1);
		year28.setYear(3);
		month9.setMonth((int) (short) 1, year28);
		Date date43 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year44 = date43.getYear();
		boolean b46 = date43.equals((java.lang.Object) "hi!");
		date43.increment();
		date43.printDate();
		Year year49 = date43.getYear();
		Year year50 = date43.getYear();
		Year year51 = date43.getYear();
		Year year53 = new Year(1);
		boolean b54 = year53.isValid();
		boolean b55 = year53.isValid();
		boolean b56 = year53.isLeap();
		boolean b57 = year53.isLeap();
		int i58 = year53.getYear();
		int i59 = year53.getYear();
		boolean b60 = year53.isValid();
		boolean b61 = year51.equals((java.lang.Object) year53);
		try {
			month9.setMonth(32, year53);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test184() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test366");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		java.lang.String str8 = date4.toString();
		boolean b10 = date4.equals((java.lang.Object) (short) 100);
		Date date11 = Nextday.nextDay(date4);
		Date date12 = Nextday.nextDay(date11);
		Month month13 = date12.getMonth();
		try {
			Day day14 = new Day((int) (byte) 0, month13);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test185() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test367");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Year year10 = date3.getYear();
		Date date11 = Nextday.nextDay(date3);
		date3.increment();
		Year year13 = date3.getYear();
		Day day14 = date3.getDay();
		Year year19 = new Year(1);
		boolean b20 = year19.isLeap();
		boolean b21 = year19.isLeap();
		boolean b22 = year19.increment();
		Month month23 = new Month((int) (short) 1, year19);
		Year year25 = new Year(1);
		boolean b26 = year25.isValid();
		boolean b27 = year25.isValid();
		boolean b28 = year25.isValid();
		boolean b29 = year25.isValid();
		boolean b30 = year25.isValid();
		year25.setYear((int) ' ');
		int i33 = year25.getYear();
		boolean b34 = month23.equals((java.lang.Object) i33);
		Day day35 = new Day((int) (byte) 10, month23);
		try {
			day14.setDay(101, month23);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test186() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test369");
		try {
			Date date3 = new Date(52, (int) (short) 10, 13);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test187() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test370");
		Year year3 = new Year(11);
		boolean b4 = year3.increment();
		Month month5 = new Month(3, year3);
		try {
			Day day6 = new Day((int) (byte) 0, month5);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test188() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test371");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		Day day5 = date4.getDay();
		Year year6 = date4.getYear();
		Day day7 = date4.getDay();
		Year year9 = new Year(3);
		boolean b10 = year9.isLeap();
		boolean b11 = date4.equals((java.lang.Object) b10);
	}

	@Test
	public void test189() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test372");
		Year year1 = new Year((int) (short) 100);
		boolean b2 = year1.isValid();
		int i3 = year1.getYear();
		boolean b4 = year1.isLeap();
		boolean b5 = year1.isLeap();
		boolean b6 = year1.increment();
		Date date10 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year11 = date10.getYear();
		boolean b13 = date10.equals((java.lang.Object) "hi!");
		java.lang.String str14 = date10.toString();
		boolean b16 = date10.equals((java.lang.Object) (short) 100);
		Date date17 = Nextday.nextDay(date10);
		date17.increment();
		date17.printDate();
		Date date20 = Nextday.nextDay(date17);
		Month month21 = date20.getMonth();
		boolean b22 = year1.equals((java.lang.Object) date20);
		java.lang.String str23 = date20.toString();
		Day day24 = date20.getDay();
		date20.printDate();
	}

	@Test
	public void test190() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test374");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b5 = date3.equals((java.lang.Object) (-1));
		Year year7 = new Year(1);
		boolean b8 = year7.isValid();
		boolean b9 = year7.isLeap();
		int i10 = year7.getYear();
		boolean b11 = year7.isLeap();
		boolean b12 = year7.isLeap();
		boolean b13 = date3.equals((java.lang.Object) b12);
		Month month14 = date3.getMonth();
		Date date19 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date19.printDate();
		Year year21 = date19.getYear();
		Date date22 = Nextday.nextDay(date19);
		Year year23 = date19.getYear();
		try {
			month14.setMonth((int) (byte) 0, year23);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test191() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test375");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isValid();
		boolean b4 = year1.isLeap();
		boolean b5 = year1.isLeap();
		year1.setYear(3);
		year1.setYear(11);
	}

	@Test
	public void test192() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test377");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		boolean b3 = year1.isLeap();
		boolean b4 = year1.increment();
		java.lang.Object obj5 = null;
		boolean b6 = year1.equals(obj5);
		boolean b7 = year1.isLeap();
		boolean b8 = year1.isValid();
		boolean b9 = year1.isValid();
	}

	@Test
	public void test193() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test381");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Year year11 = new Year((int) (byte) 100);
		boolean b12 = year11.isValid();
		Month month13 = new Month((int) (short) 10, year11);
		day7.setDay((int) (short) 10, month13);
		Year year17 = new Year(52);
		Month month18 = new Month((int) (short) 10, year17);
		year17.setYear(102);
		boolean b21 = day7.equals((java.lang.Object) year17);
		year17.setYear(1);
	}

	@Test
	public void test194() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test387");
		Year year1 = new Year(31);
		int i2 = year1.getYear();
		boolean b3 = year1.isLeap();
		int i4 = year1.getYear();
		Year year7 = new Year(1);
		boolean b8 = year7.isValid();
		boolean b9 = year7.isLeap();
		int i10 = year7.getYear();
		boolean b11 = year7.isLeap();
		Month month12 = new Month((int) (byte) 1, year7);
		int i13 = month12.getMonthSize();
		int i14 = month12.getMonthSize();
		int i15 = month12.getMonthSize();
		boolean b16 = month12.isValid();
		int i17 = month12.getMonth();
		boolean b18 = month12.increment();
		Year year21 = new Year(1);
		boolean b22 = year21.isLeap();
		boolean b23 = year21.isLeap();
		java.lang.Object obj24 = new java.lang.Object();
		boolean b25 = year21.equals(obj24);
		boolean b26 = year21.increment();
		month12.setMonth(1, year21);
		int i28 = month12.getMonth();
		int i29 = month12.getMonthSize();
		boolean b30 = year1.equals((java.lang.Object) month12);
		int i31 = month12.getMonthSize();
		boolean b32 = month12.increment();
	}

	@Test
	public void test195() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test391");
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
		int i14 = month4.getMonth();
		int i15 = month4.getMonthSize();
	}

	@Test
	public void test196() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test394");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Year year10 = date3.getYear();
		Date date11 = Nextday.nextDay(date3);
		java.lang.String str12 = date3.toString();
		Month month13 = date3.getMonth();
		boolean b14 = month13.isValid();
		Year year17 = new Year((int) (short) 1);
		boolean b18 = year17.isLeap();
		boolean b19 = year17.isLeap();
		year17.setYear(1);
		try {
			month13.setMonth(31, year17);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test197() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test395");
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
		boolean b22 = day9.increment();
		boolean b23 = day9.increment();
		int i24 = day9.getDay();
	}

	@Test
	public void test198() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test397");
		Year year2 = new Year(1);
		boolean b3 = year2.increment();
		int i4 = year2.getYear();
		try {
			Month month5 = new Month(101, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test199() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test398");
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
		boolean b18 = year1.isLeap();
		Year year20 = new Year(1);
		boolean b21 = year20.isLeap();
		boolean b22 = year20.isLeap();
		boolean b23 = year20.increment();
		boolean b24 = year1.equals((java.lang.Object) year20);
		boolean b25 = year20.isValid();
	}

	@Test
	public void test200() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test399");
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
		Year year17 = new Year(1);
		boolean b18 = year17.isLeap();
		boolean b19 = year17.isLeap();
		boolean b20 = date4.equals((java.lang.Object) year17);
		Month month21 = new Month((int) (byte) 10, year17);
		boolean b22 = year17.isValid();
		int i23 = year17.getYear();
		year17.setYear((int) (short) 1);
	}

	@Test
	public void test201() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test401");
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
		year7.setYear(3);
		int i21 = year7.getYear();
	}

	@Test
	public void test202() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test402");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		date3.printDate();
		Day day10 = date3.getDay();
		boolean b11 = day10.isValid();
		boolean b12 = day10.increment();
		int i13 = day10.getDay();
		boolean b14 = day10.increment();
		Date date19 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date23 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year24 = date23.getYear();
		boolean b26 = date23.equals((java.lang.Object) "hi!");
		Day day27 = date23.getDay();
		Year year31 = new Year((int) (byte) 100);
		boolean b32 = year31.isValid();
		Month month33 = new Month((int) (short) 10, year31);
		day27.setDay((int) (short) 10, month33);
		java.lang.Object obj35 = null;
		boolean b36 = day27.equals(obj35);
		boolean b37 = day27.increment();
		int i38 = day27.getDay();
		boolean b39 = day27.isValid();
		boolean b40 = date19.equals((java.lang.Object) day27);
		Month month41 = date19.getMonth();
		date19.increment();
		Month month43 = date19.getMonth();
		try {
			day10.setDay((int) '4', month43);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test203() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test403");
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
		boolean b30 = year27.isLeap();
	}

	@Test
	public void test204() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test407");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		java.lang.String str8 = date3.toString();
		date3.printDate();
		Year year10 = date3.getYear();
		Date date11 = Nextday.nextDay(date3);
		Year year12 = date11.getYear();
		boolean b13 = year12.isLeap();
		boolean b14 = year12.isLeap();
	}

	@Test
	public void test205() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test410");
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
		boolean b23 = year21.increment();
		year21.setYear((int) ' ');
	}

	@Test
	public void test206() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test411");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Day day8 = date3.getDay();
		Month month9 = date3.getMonth();
		Year year10 = date3.getYear();
		int i11 = year10.getYear();
		boolean b12 = year10.isValid();
	}

	@Test
	public void test207() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test412");
		Date date3 = new Date((int) (short) 10, 11, (int) (short) 100);
		Month month4 = date3.getMonth();
		Month month5 = date3.getMonth();
		Date date10 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year11 = date10.getYear();
		boolean b13 = date10.equals((java.lang.Object) "hi!");
		Day day14 = date10.getDay();
		Year year15 = date10.getYear();
		month5.setMonth((int) (byte) 10, year15);
		boolean b17 = month5.isValid();
	}

	@Test
	public void test208() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test413");
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
		date3.increment();
		date3.printDate();
		date3.printDate();
	}

	@Test
	public void test209() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test414");
		Date date4 = new Date((int) (short) 10, 11, (int) (short) 100);
		Month month5 = date4.getMonth();
		boolean b6 = month5.increment();
		int i7 = month5.getMonth();
		int i8 = month5.getMonth();
		try {
			Day day9 = new Day((int) (short) -1, month5);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test210() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test416");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		Date date8 = Nextday.nextDay(date3);
		Date date9 = Nextday.nextDay(date8);
		date9.printDate();
		date9.increment();
	}

	@Test
	public void test211() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test417");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		Date date7 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year8 = date7.getYear();
		boolean b10 = date7.equals((java.lang.Object) "hi!");
		boolean b11 = year2.equals((java.lang.Object) date7);
		year2.setYear((int) 'a');
		Month month14 = new Month(11, year2);
		Date date19 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date19.printDate();
		Year year21 = date19.getYear();
		date19.printDate();
		java.lang.String str23 = date19.toString();
		Day day24 = date19.getDay();
		Date date25 = Nextday.nextDay(date19);
		Year year26 = date25.getYear();
		boolean b27 = year26.increment();
		try {
			month14.setMonth((int) (short) -1, year26);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test212() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test418");
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
		year1.setYear(1);
	}

	@Test
	public void test213() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test426");
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
		Year year24 = new Year((int) (byte) 100);
		boolean b25 = year24.isValid();
		Month month26 = new Month((int) (short) 10, year24);
		boolean b27 = month26.increment();
		boolean b28 = month26.isValid();
		boolean b30 = month26.equals((java.lang.Object) 1);
		int i31 = month26.getMonthSize();
		Day day32 = new Day(4, month26);
		Year year36 = new Year(1);
		boolean b37 = year36.isValid();
		boolean b38 = year36.isValid();
		boolean b39 = year36.isValid();
		boolean b40 = year36.isValid();
		int i41 = year36.getYear();
		Month month42 = new Month((int) (short) 10, year36);
		int i43 = month42.getMonth();
		day32.setDay(30, month42);
		try {
			day7.setDay((int) (byte) 100, month42);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test214() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test427");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.increment();
		boolean b4 = year1.increment();
		boolean b5 = year1.isLeap();
		year1.setYear(11);
		year1.setYear(100);
		boolean b10 = year1.isValid();
		boolean b11 = year1.isLeap();
	}

	@Test
	public void test215() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test428");
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
		Month month17 = date3.getMonth();
		boolean b18 = month17.isValid();
	}

	@Test
	public void test216() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test431");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		date3.printDate();
		java.lang.String str9 = date3.toString();
		Month month10 = date3.getMonth();
		Year year11 = date3.getYear();
		java.lang.String str12 = date3.toString();
		Month month13 = date3.getMonth();
		Month month14 = date3.getMonth();
		Day day15 = date3.getDay();
	}

	@Test
	public void test217() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test437");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isValid();
		int i5 = year2.getYear();
		Year year7 = new Year(1);
		boolean b8 = year7.isLeap();
		int i9 = year7.getYear();
		boolean b10 = year2.equals((java.lang.Object) i9);
		int i11 = year2.getYear();
		try {
			Month month12 = new Month((-1), year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test218() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test438");
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
		Day day17 = date3.getDay();
		Month month18 = date3.getMonth();
		java.lang.String str19 = date3.toString();
	}

	@Test
	public void test219() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test445");
		Year year2 = new Year(1);
		try {
			Month month3 = new Month(31, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test220() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test447");
		try {
			Date date3 = new Date(0, (int) ' ', (int) ' ');
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test221() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test448");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		Day day6 = date3.getDay();
		Day day7 = date3.getDay();
		date3.increment();
		Year year9 = date3.getYear();
		Month month10 = date3.getMonth();
		Day day11 = date3.getDay();
		Year year15 = new Year((int) (byte) 100);
		boolean b16 = year15.isValid();
		Month month17 = new Month((int) (short) 10, year15);
		boolean b18 = month17.increment();
		boolean b19 = month17.increment();
		boolean b20 = month17.isValid();
		boolean b21 = month17.increment();
		try {
			day11.setDay((int) (byte) 0, month17);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test222() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test449");
		Year year1 = new Year((int) (byte) 100);
		Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b6 = year1.equals((java.lang.Object) 10);
		boolean b7 = year1.isLeap();
		boolean b8 = year1.increment();
		int i9 = year1.getYear();
		int i10 = year1.getYear();
	}

	@Test
	public void test223() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test450");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isValid();
		boolean b4 = year1.isValid();
		boolean b5 = year1.isValid();
		int i6 = year1.getYear();
		boolean b7 = year1.increment();
		boolean b8 = year1.increment();
		boolean b9 = year1.increment();
		boolean b10 = year1.increment();
		Date date14 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year15 = date14.getYear();
		int i16 = year15.getYear();
		year15.setYear((int) 'a');
		boolean b19 = year1.equals((java.lang.Object) 'a');
	}

	@Test
	public void test224() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test451");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.printDate();
		Year year8 = date3.getYear();
		java.lang.Object obj9 = null;
		boolean b10 = date3.equals(obj9);
		date3.increment();
	}

	@Test
	public void test225() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test453");
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
		Date date18 = Nextday.nextDay(date3);
		Month month19 = date18.getMonth();
		int i20 = month19.getMonth();
	}

	@Test
	public void test226() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test454");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		int i5 = month4.getMonth();
		Year year8 = new Year((int) (short) 1);
		boolean b9 = year8.isLeap();
		month4.setMonth((int) (short) 10, year8);
		int i11 = month4.getMonth();
		int i12 = month4.getMonth();
		boolean b13 = month4.increment();
		int i14 = month4.getMonth();
		int i15 = month4.getMonth();
		int i16 = month4.getMonth();
	}

	@Test
	public void test227() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test460");
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
		int i19 = month12.getMonth();
	}

	@Test
	public void test228() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test462");
		Year year5 = new Year((int) (byte) 100);
		boolean b6 = year5.isValid();
		Month month7 = new Month((int) (short) 10, year5);
		boolean b8 = month7.increment();
		int i9 = month7.getMonthSize();
		boolean b10 = month7.isValid();
		Day day11 = new Day(10, month7);
		Day day12 = new Day(12, month7);
		Date date17 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year18 = date17.getYear();
		boolean b20 = date17.equals((java.lang.Object) "hi!");
		java.lang.String str21 = date17.toString();
		boolean b23 = date17.equals((java.lang.Object) (short) 100);
		Year year24 = date17.getYear();
		Date date25 = Nextday.nextDay(date17);
		date25.increment();
		Month month27 = date25.getMonth();
		day12.setDay(5, month27);
		int i29 = month27.getMonth();
		try {
			Day day30 = new Day((int) ' ', month27);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test229() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test466");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isValid();
		boolean b5 = year2.isValid();
		boolean b6 = year2.isValid();
		int i7 = year2.getYear();
		Month month8 = new Month((int) (short) 10, year2);
		boolean b9 = year2.increment();
		boolean b10 = year2.isLeap();
	}

	@Test
	public void test230() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test467");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		Day day5 = date4.getDay();
		Year year6 = date4.getYear();
		Year year7 = date4.getYear();
		Month month8 = date4.getMonth();
	}

	@Test
	public void test231() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test469");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		date3.printDate();
		Month month6 = date3.getMonth();
		int i7 = month6.getMonth();
		int i8 = month6.getMonth();
		Year year13 = new Year(1);
		boolean b14 = year13.isLeap();
		boolean b15 = year13.isLeap();
		boolean b16 = year13.increment();
		Month month17 = new Month((int) (short) 1, year13);
		Date date21 = new Date(10, (int) (byte) 10, (int) (short) 1);
		java.lang.String str22 = date21.toString();
		boolean b23 = month17.equals((java.lang.Object) date21);
		Day day24 = new Day((int) (byte) 10, month17);
		Year year27 = new Year(1);
		boolean b28 = year27.isLeap();
		boolean b29 = year27.isLeap();
		Date date33 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year34 = date33.getYear();
		boolean b36 = date33.equals((java.lang.Object) "hi!");
		date33.increment();
		java.lang.String str38 = date33.toString();
		boolean b39 = year27.equals((java.lang.Object) date33);
		Month month40 = new Month((int) (short) 10, year27);
		boolean b41 = year27.isLeap();
		boolean b42 = day24.equals((java.lang.Object) year27);
		Year year46 = new Year((int) (byte) 100);
		boolean b47 = year46.isValid();
		Month month48 = new Month((int) (short) 10, year46);
		int i49 = month48.getMonth();
		Day day50 = new Day(30, month48);
		int i51 = day50.getDay();
		boolean b52 = year27.equals((java.lang.Object) day50);
		boolean b53 = year27.increment();
		try {
			month6.setMonth((int) 'a', year27);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test232() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test471");
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
		Month month17 = date3.getMonth();
		Year year19 = new Year((int) ' ');
		boolean b20 = month17.equals((java.lang.Object) ' ');
		Year year23 = new Year(101);
		boolean b24 = year23.isValid();
		year23.setYear((int) '#');
		try {
			month17.setMonth(100, year23);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test233() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test473");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		date3.printDate();
		Day day11 = date3.getDay();
		int i12 = day11.getDay();
		boolean b13 = day11.isValid();
		boolean b14 = day11.isValid();
	}

	@Test
	public void test234() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test474");
		Year year1 = new Year(31);
		int i2 = year1.getYear();
		int i3 = year1.getYear();
	}

	@Test
	public void test235() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test476");
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
		boolean b16 = day15.isValid();
		boolean b18 = day15.equals((java.lang.Object) "10/12/1");
		boolean b19 = day15.increment();
		boolean b20 = day15.isValid();
		int i21 = day15.getDay();
		int i22 = day15.getDay();
		boolean b23 = day15.increment();
		Year year27 = new Year((int) (byte) 100);
		boolean b28 = year27.isValid();
		Month month29 = new Month((int) (short) 10, year27);
		boolean b30 = month29.increment();
		boolean b31 = month29.increment();
		boolean b32 = month29.increment();
		try {
			day15.setDay(32, month29);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test236() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test478");
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
		year16.setYear(28);
		year16.setYear((int) (byte) 1);
	}

	@Test
	public void test237() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test480");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		date4.increment();
		date4.printDate();
		Year year10 = date4.getYear();
		Year year11 = date4.getYear();
		Year year12 = date4.getYear();
		Year year14 = new Year(1);
		boolean b15 = year14.isValid();
		boolean b16 = year14.isValid();
		boolean b17 = year14.isLeap();
		boolean b18 = year14.isLeap();
		int i19 = year14.getYear();
		int i20 = year14.getYear();
		boolean b21 = year14.isValid();
		boolean b22 = year12.equals((java.lang.Object) year14);
		try {
			Month month23 = new Month(0, year14);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test238() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test482");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Year year10 = date3.getYear();
		Date date11 = Nextday.nextDay(date3);
		date3.increment();
		date3.increment();
		date3.printDate();
		date3.printDate();
		java.lang.String str16 = date3.toString();
		Month month17 = date3.getMonth();
		date3.printDate();
		Date date19 = Nextday.nextDay(date3);
	}

	@Test
	public void test239() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test484");
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
		int i19 = month8.getMonth();
		int i20 = month8.getMonth();
		boolean b21 = month8.isValid();
		boolean b22 = month8.isValid();
	}

	@Test
	public void test240() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test486");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		Month month10 = date9.getMonth();
		date9.printDate();
		Day day12 = date9.getDay();
		Month month13 = date9.getMonth();
		int i14 = month13.getMonthSize();
		boolean b15 = month13.increment();
	}

	@Test
	public void test241() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test489");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		Year year9 = new Year(1);
		boolean b10 = year9.isValid();
		boolean b11 = year9.increment();
		boolean b12 = year9.increment();
		boolean b13 = month7.equals((java.lang.Object) b12);
		Year year16 = new Year(1);
		boolean b17 = year16.isValid();
		boolean b18 = year16.isLeap();
		int i19 = year16.getYear();
		boolean b20 = year16.isLeap();
		month7.setMonth(10, year16);
		int i22 = year16.getYear();
		boolean b23 = year16.isLeap();
	}

	@Test
	public void test242() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test490");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isValid();
		int i4 = year1.getYear();
		boolean b5 = year1.isLeap();
		boolean b6 = year1.increment();
		Date date10 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b12 = date10.equals((java.lang.Object) (-1));
		Year year14 = new Year(1);
		boolean b15 = year14.isValid();
		boolean b16 = year14.isLeap();
		int i17 = year14.getYear();
		boolean b18 = year14.isLeap();
		boolean b19 = year14.isLeap();
		boolean b20 = date10.equals((java.lang.Object) b19);
		Date date21 = Nextday.nextDay(date10);
		Day day22 = date21.getDay();
		boolean b23 = day22.isValid();
		boolean b25 = day22.equals((java.lang.Object) "10/12/1");
		boolean b26 = day22.increment();
		Year year30 = new Year((int) (byte) 100);
		boolean b31 = year30.isValid();
		Month month32 = new Month((int) (short) 10, year30);
		boolean b33 = month32.increment();
		int i34 = month32.getMonthSize();
		boolean b35 = month32.isValid();
		boolean b36 = month32.increment();
		day22.setDay((int) (byte) 10, month32);
		boolean b38 = year1.equals((java.lang.Object) month32);
	}

	@Test
	public void test243() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test491");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		Date date6 = Nextday.nextDay(date3);
		Date date7 = Nextday.nextDay(date3);
		date7.printDate();
		Month month9 = date7.getMonth();
		boolean b10 = month9.increment();
		boolean b11 = month9.increment();
		boolean b12 = month9.increment();
	}

	@Test
	public void test244() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test492");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		java.lang.String str8 = date4.toString();
		boolean b10 = date4.equals((java.lang.Object) (short) 100);
		Year year11 = date4.getYear();
		Date date12 = Nextday.nextDay(date4);
		Day day13 = date4.getDay();
		Year year15 = new Year(1);
		boolean b16 = year15.isLeap();
		boolean b17 = year15.isLeap();
		boolean b18 = year15.increment();
		boolean b19 = year15.increment();
		boolean b20 = date4.equals((java.lang.Object) year15);
		int i21 = year15.getYear();
		year15.setYear((int) '#');
		try {
			Month month24 = new Month((int) (short) -1, year15);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test245() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test494");
		try {
			Date date3 = new Date(53, 13, 34);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test246() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test495");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b6 = year2.equals((java.lang.Object) (short) -1);
		year2.setYear(101);
		int i9 = year2.getYear();
		try {
			year2.setYear(0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test247() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test497");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		java.lang.String str8 = date4.toString();
		boolean b10 = date4.equals((java.lang.Object) (short) 100);
		Year year11 = date4.getYear();
		Date date12 = Nextday.nextDay(date4);
		java.lang.String str13 = date4.toString();
		Year year14 = date4.getYear();
		year14.setYear(102);
		try {
			Month month17 = new Month((int) (short) 0, year14);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test248() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test498");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isValid();
		boolean b6 = year3.isValid();
		boolean b7 = year3.isValid();
		int i8 = year3.getYear();
		Month month9 = new Month((int) (short) 10, year3);
		boolean b10 = year3.isValid();
		Year year12 = new Year(11);
		boolean b13 = year3.equals((java.lang.Object) year12);
		boolean b14 = year12.isLeap();
		boolean b15 = year12.isValid();
		int i16 = year12.getYear();
		try {
			Month month17 = new Month((int) (short) 100, year12);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test249() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test500");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		java.lang.String str8 = date3.toString();
		java.lang.String str9 = date3.toString();
		java.lang.String str10 = date3.toString();
	}

	@Test
	public void test250() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test001");
		Date date6 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b8 = date6.equals((java.lang.Object) (-1));
		Year year9 = date6.getYear();
		Month month10 = new Month(3, year9);
		Day day11 = new Day((int) (byte) 1, month10);
		Year year14 = new Year((int) (short) 100);
		boolean b15 = year14.isValid();
		int i16 = year14.getYear();
		boolean b17 = year14.isLeap();
		boolean b18 = year14.isLeap();
		int i19 = year14.getYear();
		month10.setMonth(3, year14);
		try {
			Day day21 = new Day(0, month10);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test251() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test003");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Year year10 = date3.getYear();
		Date date11 = Nextday.nextDay(date3);
		date11.increment();
		java.lang.String str13 = date11.toString();
		Date date14 = Nextday.nextDay(date11);
		date14.printDate();
		date14.printDate();
		date14.printDate();
		Day day18 = date14.getDay();
	}

	@Test
	public void test252() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test004");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isValid();
		boolean b6 = year3.isValid();
		boolean b7 = year3.isValid();
		int i8 = year3.getYear();
		Month month9 = new Month((int) (short) 1, year3);
		boolean b10 = month9.increment();
		Day day11 = new Day((int) (byte) 10, month9);
	}

	@Test
	public void test253() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test005");
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
		date3.increment();
		date3.printDate();
		Date date20 = Nextday.nextDay(date3);
		Month month21 = date3.getMonth();
	}

	@Test
	public void test254() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test007");
		try {
			Date date3 = new Date(2, 34, (int) (short) 100);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test255() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test008");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		Day day6 = date3.getDay();
		Day day7 = date3.getDay();
		date3.printDate();
		Month month9 = date3.getMonth();
		boolean b10 = month9.isValid();
		int i11 = month9.getMonth();
		boolean b12 = month9.isValid();
		Year year15 = new Year(1);
		boolean b16 = year15.isLeap();
		boolean b17 = year15.isLeap();
		boolean b18 = year15.increment();
		java.lang.Object obj19 = null;
		boolean b20 = year15.equals(obj19);
		int i21 = year15.getYear();
		int i22 = year15.getYear();
		boolean b23 = year15.increment();
		Year year25 = new Year((int) (byte) 100);
		Date date29 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b30 = year25.equals((java.lang.Object) 10);
		boolean b31 = year15.equals((java.lang.Object) b30);
		boolean b32 = year15.increment();
		month9.setMonth(10, year15);
	}

	@Test
	public void test256() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test010");
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
		Year year17 = new Year(1);
		boolean b18 = year17.isLeap();
		boolean b19 = year17.isLeap();
		boolean b20 = date4.equals((java.lang.Object) year17);
		boolean b21 = year17.isLeap();
		try {
			Month month22 = new Month(100, year17);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test257() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test011");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		date3.printDate();
		java.lang.String str7 = date3.toString();
		Date date8 = Nextday.nextDay(date3);
		Date date9 = Nextday.nextDay(date8);
	}

	@Test
	public void test258() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test014");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		date3.printDate();
		Year year11 = date3.getYear();
		Month month12 = date3.getMonth();
		java.lang.String str13 = date3.toString();
		java.lang.String str14 = date3.toString();
	}

	@Test
	public void test259() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test017");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		int i3 = year1.getYear();
		year1.setYear(100);
		int i6 = year1.getYear();
		boolean b7 = year1.increment();
		boolean b8 = year1.increment();
	}

	@Test
	public void test260() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test018");
		try {
			Date date3 = new Date(12, 53, (int) (short) 10);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test261() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test026");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		date3.printDate();
		Month month6 = date3.getMonth();
		Month month7 = date3.getMonth();
		Year year8 = date3.getYear();
		boolean b9 = year8.isLeap();
	}

	@Test
	public void test262() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test027");
		Date date3 = new Date(11, 4, (int) '#');
	}

	@Test
	public void test263() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test029");
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
		Year year16 = new Year(1);
		boolean b17 = year16.isLeap();
		boolean b18 = year16.isLeap();
		boolean b19 = date3.equals((java.lang.Object) year16);
		int i20 = year16.getYear();
		year16.setYear((int) (byte) 100);
		year16.setYear(29);
	}

	@Test
	public void test264() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test030");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		date3.printDate();
		Year year11 = date3.getYear();
		date3.increment();
	}

	@Test
	public void test265() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test031");
		Year year1 = new Year(1);
		boolean b2 = year1.increment();
		int i3 = year1.getYear();
		boolean b4 = year1.isValid();
		boolean b5 = year1.isLeap();
		Date date9 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date10 = Nextday.nextDay(date9);
		Year year14 = new Year(1);
		boolean b15 = year14.isValid();
		boolean b16 = year14.isLeap();
		int i17 = year14.getYear();
		boolean b18 = year14.isLeap();
		Month month19 = new Month((int) (byte) 1, year14);
		Day day20 = new Day(31, month19);
		boolean b21 = day20.isValid();
		Year year25 = new Year((int) (byte) 100);
		boolean b26 = year25.isValid();
		Month month27 = new Month((int) (short) 10, year25);
		boolean b29 = month27.equals((java.lang.Object) 10L);
		int i30 = month27.getMonth();
		boolean b31 = month27.isValid();
		day20.setDay((int) (short) 1, month27);
		boolean b33 = date10.equals((java.lang.Object) month27);
		java.lang.String str34 = date10.toString();
		boolean b35 = year1.equals((java.lang.Object) date10);
		date10.printDate();
	}

	@Test
	public void test266() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test032");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b6 = date4.equals((java.lang.Object) (-1));
		Year year7 = date4.getYear();
		Month month8 = new Month(3, year7);
		year7.setYear((int) 'a');
		int i11 = year7.getYear();
	}

	@Test
	public void test267() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test034");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		date3.printDate();
		java.lang.String str10 = date3.toString();
		Date date11 = Nextday.nextDay(date3);
		Date date12 = Nextday.nextDay(date11);
	}

	@Test
	public void test268() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test035");
		Year year1 = new Year((int) (short) 100);
		boolean b2 = year1.increment();
		boolean b4 = year1.equals((java.lang.Object) "10/10/1");
		boolean b5 = year1.isLeap();
		boolean b6 = year1.increment();
	}

	@Test
	public void test269() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test037");
		Year year2 = new Year((int) (byte) 100);
		java.lang.Object obj3 = new java.lang.Object();
		boolean b4 = year2.equals(obj3);
		Date date8 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year9 = date8.getYear();
		boolean b11 = date8.equals((java.lang.Object) "hi!");
		Month month12 = date8.getMonth();
		boolean b13 = year2.equals((java.lang.Object) date8);
		Date date14 = Nextday.nextDay(date8);
		java.lang.String str15 = date14.toString();
		Year year17 = new Year(1);
		boolean b18 = year17.isLeap();
		boolean b19 = year17.isLeap();
		boolean b20 = year17.increment();
		java.lang.Object obj21 = null;
		boolean b22 = year17.equals(obj21);
		int i23 = year17.getYear();
		int i24 = year17.getYear();
		boolean b25 = year17.increment();
		boolean b26 = date14.equals((java.lang.Object) year17);
		Month month27 = new Month((int) (byte) 10, year17);
		boolean b28 = year17.isLeap();
		int i29 = year17.getYear();
	}

	@Test
	public void test270() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test038");
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
		boolean b26 = year1.increment();
		Year year28 = new Year((int) (byte) 100);
		boolean b29 = year28.isValid();
		boolean b30 = year28.increment();
		year28.setYear((int) '4');
		boolean b33 = year28.isValid();
		year28.setYear(30);
		boolean b36 = year1.equals((java.lang.Object) year28);
		boolean b37 = year28.isValid();
		boolean b38 = year28.isValid();
		boolean b39 = year28.isValid();
	}

	@Test
	public void test271() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test040");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		Year year5 = date3.getYear();
		Year year6 = date3.getYear();
	}

	@Test
	public void test272() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test047");
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
		boolean b14 = month10.isValid();
		boolean b15 = month10.increment();
	}

	@Test
	public void test273() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test053");
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
		boolean b32 = day17.isValid();
		boolean b33 = day17.isValid();
		boolean b34 = day17.increment();
		boolean b35 = day17.isValid();
		int i36 = day17.getDay();
	}

	@Test
	public void test274() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test054");
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
		boolean b18 = year14.isValid();
		year14.setYear(34);
	}

	@Test
	public void test275() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test058");
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
		boolean b20 = day7.isValid();
		Year year23 = new Year(1);
		boolean b24 = year23.isValid();
		boolean b25 = year23.isValid();
		boolean b26 = year23.isValid();
		boolean b27 = year23.isValid();
		int i28 = year23.getYear();
		Month month29 = new Month((int) (short) 10, year23);
		boolean b30 = year23.increment();
		boolean b31 = day7.equals((java.lang.Object) b30);
		boolean b32 = day7.increment();
		int i33 = day7.getDay();
		boolean b34 = day7.increment();
		int i35 = day7.getDay();
	}

	@Test
	public void test276() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test062");
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
		java.lang.String str16 = date13.toString();
		Year year17 = date13.getYear();
	}

	@Test
	public void test277() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test064");
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
		int i14 = month7.getMonth();
	}

	@Test
	public void test278() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test066");
		Year year2 = new Year((int) '#');
		Date date6 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b8 = date6.equals((java.lang.Object) (-1));
		Year year10 = new Year(1);
		boolean b11 = year10.isValid();
		boolean b12 = year10.isLeap();
		int i13 = year10.getYear();
		boolean b14 = year10.isLeap();
		boolean b15 = year10.isLeap();
		boolean b16 = date6.equals((java.lang.Object) b15);
		Date date17 = Nextday.nextDay(date6);
		Year year19 = new Year(1);
		boolean b20 = year19.isLeap();
		boolean b21 = year19.isLeap();
		boolean b22 = date6.equals((java.lang.Object) year19);
		int i23 = year19.getYear();
		boolean b24 = year2.equals((java.lang.Object) year19);
		boolean b25 = year19.isLeap();
		try {
			Month month26 = new Month((int) (byte) 100, year19);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test279() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test072");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b6 = month4.equals((java.lang.Object) 10L);
		int i7 = month4.getMonth();
		boolean b8 = month4.isValid();
		boolean b9 = month4.isValid();
		boolean b10 = month4.isValid();
		boolean b11 = month4.isValid();
		boolean b12 = month4.increment();
		boolean b13 = month4.increment();
	}

	@Test
	public void test280() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test074");
		Year year1 = new Year((int) (short) 100);
		boolean b2 = year1.isValid();
		int i3 = year1.getYear();
		boolean b4 = year1.increment();
	}

	@Test
	public void test281() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test075");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		Date date8 = Nextday.nextDay(date3);
		date3.printDate();
		Day day10 = date3.getDay();
		Month month11 = date3.getMonth();
		Year year14 = new Year(2);
		month11.setMonth(2, year14);
		boolean b16 = year14.isValid();
	}

	@Test
	public void test282() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test076");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		boolean b4 = year2.isLeap();
		java.lang.Object obj5 = new java.lang.Object();
		boolean b6 = year2.equals(obj5);
		boolean b7 = year2.isValid();
		Month month8 = new Month((int) (byte) 10, year2);
		int i9 = year2.getYear();
		boolean b10 = year2.increment();
	}

	@Test
	public void test283() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test077");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		java.lang.String str8 = date4.toString();
		boolean b10 = date4.equals((java.lang.Object) (short) 100);
		Year year11 = date4.getYear();
		Date date12 = Nextday.nextDay(date4);
		java.lang.String str13 = date4.toString();
		Year year14 = date4.getYear();
		Year year17 = new Year(1);
		boolean b18 = year17.isValid();
		boolean b19 = year17.increment();
		boolean b20 = year17.increment();
		boolean b21 = year17.isLeap();
		year17.setYear(11);
		boolean b24 = year17.isLeap();
		int i25 = year17.getYear();
		Month month26 = new Month(11, year17);
		boolean b27 = date4.equals((java.lang.Object) year17);
		try {
			Month month28 = new Month(29, year17);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test284() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test078");
		Year year1 = new Year(12);
		boolean b2 = year1.isLeap();
		int i3 = year1.getYear();
		boolean b4 = year1.increment();
		int i5 = year1.getYear();
	}

	@Test
	public void test285() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test079");
		Year year1 = new Year((int) (short) 100);
		boolean b2 = year1.increment();
		Year year4 = new Year(1);
		boolean b5 = year4.isValid();
		int i6 = year4.getYear();
		year4.setYear(100);
		boolean b9 = year1.equals((java.lang.Object) year4);
		boolean b11 = year4.equals((java.lang.Object) (byte) -1);
		Date date15 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year16 = date15.getYear();
		boolean b18 = date15.equals((java.lang.Object) "hi!");
		java.lang.String str19 = date15.toString();
		Year year20 = date15.getYear();
		Date date21 = Nextday.nextDay(date15);
		Month month22 = date21.getMonth();
		int i23 = month22.getMonth();
		boolean b24 = year4.equals((java.lang.Object) month22);
		boolean b25 = year4.isValid();
		year4.setYear(4);
	}

	@Test
	public void test286() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test082");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		int i6 = month5.getMonth();
		Day day7 = new Day(30, month5);
		boolean b8 = day7.isValid();
		int i9 = day7.getDay();
		boolean b10 = day7.increment();
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
		Day day26 = date25.getDay();
		boolean b27 = day26.isValid();
		boolean b28 = day7.equals((java.lang.Object) day26);
		boolean b29 = day7.increment();
	}

	@Test
	public void test287() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test089");
		try {
			Date date3 = new Date((int) (byte) 1, 35, (int) 'a');
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test288() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test091");
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
		Month month15 = date13.getMonth();
		java.lang.String str16 = date13.toString();
		Day day17 = date13.getDay();
	}

	@Test
	public void test289() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test092");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		java.lang.String str5 = date3.toString();
	}

	@Test
	public void test290() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test095");
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
		date14.increment();
		java.lang.String str18 = date14.toString();
	}

	@Test
	public void test291() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test096");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isValid();
		int i5 = year2.getYear();
		Year year7 = new Year(1);
		boolean b8 = year7.isLeap();
		int i9 = year7.getYear();
		boolean b10 = year2.equals((java.lang.Object) i9);
		year2.setYear((-1));
		year2.setYear((int) (short) -1);
		year2.setYear((-1));
		try {
			Month month17 = new Month((int) (byte) 0, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test292() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test097");
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
		Day day28 = date27.getDay();
		Month month29 = date27.getMonth();
		int i30 = month29.getMonth();
	}

	@Test
	public void test293() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test099");
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
		date3.printDate();
		Day day19 = date3.getDay();
		Year year20 = date3.getYear();
		Month month21 = date3.getMonth();
		boolean b22 = month21.isValid();
	}

	@Test
	public void test294() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test102");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		date3.printDate();
		Year year9 = date3.getYear();
		Date date10 = Nextday.nextDay(date3);
		Date date11 = Nextday.nextDay(date10);
		java.lang.String str12 = date10.toString();
	}

	@Test
	public void test295() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test103");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		Date date6 = Nextday.nextDay(date3);
		Date date7 = Nextday.nextDay(date3);
		date7.printDate();
		date7.increment();
		Year year10 = date7.getYear();
	}

	@Test
	public void test296() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test105");
		try {
			Date date3 = new Date((int) (short) 100, (int) (byte) 100, (int) (byte) 10);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test297() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test108");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Date date8 = Nextday.nextDay(date3);
		Day day9 = date8.getDay();
		Month month10 = date8.getMonth();
		int i11 = month10.getMonth();
		int i12 = month10.getMonth();
		Year year15 = new Year(1);
		boolean b16 = year15.isValid();
		boolean b17 = year15.isValid();
		boolean b18 = year15.isLeap();
		int i19 = year15.getYear();
		boolean b20 = year15.increment();
		year15.setYear(2);
		boolean b23 = year15.increment();
		try {
			month10.setMonth(31, year15);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test298() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test110");
		Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b7 = date5.equals((java.lang.Object) (-1));
		Year year9 = new Year(1);
		boolean b10 = year9.isValid();
		boolean b11 = year9.isLeap();
		int i12 = year9.getYear();
		boolean b13 = year9.isLeap();
		boolean b14 = year9.isLeap();
		boolean b15 = date5.equals((java.lang.Object) b14);
		Day day16 = date5.getDay();
		Month month17 = date5.getMonth();
		boolean b18 = month17.isValid();
		Day day19 = new Day((int) (short) 1, month17);
		Day day20 = new Day(29, month17);
	}

	@Test
	public void test299() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test111");
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
		boolean b16 = year6.increment();
	}

	@Test
	public void test300() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test113");
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
		boolean b17 = month13.increment();
		int i18 = month13.getMonthSize();
		boolean b19 = month13.increment();
	}

	@Test
	public void test301() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test114");
		Year year4 = new Year(1);
		boolean b5 = year4.isLeap();
		boolean b6 = year4.isLeap();
		boolean b7 = year4.increment();
		Month month8 = new Month((int) (short) 1, year4);
		Date date12 = new Date(10, (int) (byte) 10, (int) (short) 1);
		java.lang.String str13 = date12.toString();
		boolean b14 = month8.equals((java.lang.Object) date12);
		Day day15 = new Day((int) (byte) 10, month8);
		Year year18 = new Year(1);
		boolean b19 = year18.isLeap();
		boolean b20 = year18.isLeap();
		Date date24 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year25 = date24.getYear();
		boolean b27 = date24.equals((java.lang.Object) "hi!");
		date24.increment();
		java.lang.String str29 = date24.toString();
		boolean b30 = year18.equals((java.lang.Object) date24);
		Month month31 = new Month((int) (short) 10, year18);
		boolean b32 = year18.isLeap();
		boolean b33 = day15.equals((java.lang.Object) year18);
		Year year37 = new Year((int) (byte) 100);
		boolean b38 = year37.isValid();
		Month month39 = new Month((int) (short) 10, year37);
		int i40 = month39.getMonth();
		Day day41 = new Day(30, month39);
		int i42 = day41.getDay();
		boolean b43 = year18.equals((java.lang.Object) day41);
		year18.setYear(3);
		Month month46 = new Month(3, year18);
		Date date50 = new Date((int) (short) 10, 11, (int) (short) 100);
		Day day51 = date50.getDay();
		Day day52 = date50.getDay();
		boolean b53 = month46.equals((java.lang.Object) date50);
		Day day54 = date50.getDay();
		boolean b55 = day54.isValid();
	}

	@Test
	public void test302() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test119");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.printDate();
		Year year8 = date3.getYear();
		date3.increment();
		Date date10 = Nextday.nextDay(date3);
		date10.printDate();
		Day day12 = date10.getDay();
		int i13 = day12.getDay();
	}

	@Test
	public void test303() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test122");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.increment();
		boolean b5 = year2.increment();
		boolean b6 = year2.isLeap();
		int i7 = year2.getYear();
		Month month8 = new Month(1, year2);
		int i9 = month8.getMonth();
		int i10 = month8.getMonth();
	}

	@Test
	public void test304() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test123");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		java.lang.String str8 = date4.toString();
		boolean b10 = date4.equals((java.lang.Object) (short) 100);
		Year year11 = date4.getYear();
		Date date12 = Nextday.nextDay(date4);
		date12.increment();
		Month month14 = date12.getMonth();
		Day day15 = new Day((int) (byte) 1, month14);
		int i16 = day15.getDay();
		boolean b17 = day15.isValid();
	}

	@Test
	public void test305() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test124");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Year year11 = new Year((int) (byte) 100);
		boolean b12 = year11.isValid();
		Month month13 = new Month((int) (short) 10, year11);
		day7.setDay((int) (short) 10, month13);
		Year year17 = new Year(52);
		Month month18 = new Month((int) (short) 10, year17);
		year17.setYear(102);
		boolean b21 = day7.equals((java.lang.Object) year17);
		boolean b22 = day7.isValid();
		int i23 = day7.getDay();
	}

	@Test
	public void test306() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test125");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		Date date6 = Nextday.nextDay(date3);
		Date date7 = Nextday.nextDay(date3);
		date7.printDate();
		Month month9 = date7.getMonth();
		boolean b10 = month9.increment();
		boolean b11 = month9.increment();
		Date date15 = new Date((int) (short) 10, 11, (int) (short) 100);
		Year year16 = date15.getYear();
		boolean b17 = month9.equals((java.lang.Object) year16);
		boolean b18 = month9.isValid();
	}

	@Test
	public void test307() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test127");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Date date8 = Nextday.nextDay(date3);
		Day day9 = date8.getDay();
		Month month10 = date8.getMonth();
		Year year11 = date8.getYear();
		boolean b12 = year11.isValid();
		int i13 = year11.getYear();
	}

	@Test
	public void test308() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test128");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b5 = month4.increment();
		boolean b6 = month4.increment();
		boolean b7 = month4.isValid();
		boolean b8 = month4.increment();
		boolean b9 = month4.increment();
		Date date13 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year14 = date13.getYear();
		boolean b16 = date13.equals((java.lang.Object) "hi!");
		Month month17 = date13.getMonth();
		date13.printDate();
		java.lang.String str19 = date13.toString();
		date13.printDate();
		boolean b21 = month4.equals((java.lang.Object) date13);
		Year year22 = date13.getYear();
		date13.printDate();
	}

	@Test
	public void test309() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test129");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		int i5 = month4.getMonth();
		boolean b6 = month4.isValid();
	}

	@Test
	public void test310() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test135");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		date4.printDate();
		Month month6 = date4.getMonth();
	}

	@Test
	public void test311() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test136");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		date3.printDate();
		java.lang.String str10 = date3.toString();
		Date date11 = Nextday.nextDay(date3);
		Month month12 = date3.getMonth();
		int i13 = month12.getMonthSize();
	}

	@Test
	public void test312() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test137");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		date3.printDate();
		java.lang.String str7 = date3.toString();
		Day day8 = date3.getDay();
		date3.printDate();
		date3.printDate();
	}

	@Test
	public void test313() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test138");
		Year year1 = new Year((int) ' ');
		Year year4 = new Year((int) (byte) 100);
		boolean b5 = year4.isValid();
		Month month6 = new Month((int) (short) 10, year4);
		int i7 = month6.getMonth();
		boolean b8 = year1.equals((java.lang.Object) i7);
		year1.setYear(30);
	}

	@Test
	public void test314() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test141");
		Year year1 = new Year(102);
		year1.setYear(28);
		year1.setYear(5);
	}

	@Test
	public void test315() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test149");
		try {
			Date date3 = new Date(31, 31, (int) (short) 1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test316() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test150");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		date3.printDate();
		Day day10 = date3.getDay();
		boolean b11 = day10.increment();
		Year year14 = new Year((int) (byte) 100);
		boolean b15 = year14.isValid();
		Month month16 = new Month((int) (short) 10, year14);
		boolean b18 = month16.equals((java.lang.Object) 10L);
		int i19 = month16.getMonth();
		boolean b20 = month16.isValid();
		boolean b21 = month16.isValid();
		boolean b22 = month16.isValid();
		boolean b23 = month16.increment();
		boolean b24 = day10.equals((java.lang.Object) month16);
		int i25 = day10.getDay();
		boolean b26 = day10.increment();
	}

	@Test
	public void test317() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test152");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.printDate();
		Year year8 = date3.getYear();
		date3.increment();
		Date date10 = Nextday.nextDay(date3);
		date10.increment();
	}

	@Test
	public void test318() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test153");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		year1.setYear((int) (short) 100);
		Date date8 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year9 = date8.getYear();
		boolean b11 = date8.equals((java.lang.Object) "hi!");
		date8.increment();
		date8.printDate();
		Year year14 = date8.getYear();
		Date date15 = Nextday.nextDay(date8);
		date15.increment();
		boolean b17 = year1.equals((java.lang.Object) date15);
		boolean b18 = year1.increment();
	}

	@Test
	public void test319() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test154");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		Day day10 = date3.getDay();
		Month month11 = date3.getMonth();
		boolean b12 = month11.increment();
	}

	@Test
	public void test320() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test156");
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
		boolean b13 = year9.isValid();
	}

	@Test
	public void test321() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test159");
		Year year2 = new Year((int) ' ');
		boolean b3 = year2.isValid();
		try {
			Month month4 = new Month(29, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test322() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test160");
		Year year1 = new Year((int) (short) 1);
		boolean b2 = year1.isLeap();
		year1.setYear((int) (short) -1);
		int i5 = year1.getYear();
		boolean b6 = year1.isValid();
		boolean b7 = year1.increment();
		boolean b8 = year1.increment();
		int i9 = year1.getYear();
		year1.setYear(33);
	}

	@Test
	public void test323() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test162");
		Year year1 = new Year((int) (byte) -1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isValid();
	}

	@Test
	public void test324() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test164");
		Year year1 = new Year(11);
		int i2 = year1.getYear();
		year1.setYear(52);
		int i5 = year1.getYear();
	}

	@Test
	public void test325() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test167");
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
		Date date26 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year27 = date26.getYear();
		boolean b29 = date26.equals((java.lang.Object) "hi!");
		date26.printDate();
		date26.printDate();
		Month month32 = date26.getMonth();
		boolean b33 = month32.increment();
		try {
			day7.setDay((int) 'a', month32);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test326() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test170");
		Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year6 = date5.getYear();
		boolean b8 = date5.equals((java.lang.Object) "hi!");
		java.lang.String str9 = date5.toString();
		boolean b11 = date5.equals((java.lang.Object) (short) 100);
		Date date12 = Nextday.nextDay(date5);
		date12.increment();
		date12.printDate();
		Year year15 = date12.getYear();
		boolean b16 = year15.increment();
		boolean b17 = year15.isValid();
		Month month18 = new Month(3, year15);
		boolean b19 = month18.increment();
		try {
			Day day20 = new Day((int) '4', month18);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test327() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test171");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isValid();
		boolean b4 = year1.isLeap();
		boolean b5 = year1.isLeap();
		year1.setYear(3);
		year1.setYear(35);
	}

	@Test
	public void test328() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test172");
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
		date3.increment();
		java.lang.String str18 = date3.toString();
	}

	@Test
	public void test329() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test173");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Year year10 = date3.getYear();
		Date date11 = Nextday.nextDay(date3);
		java.lang.String str12 = date3.toString();
		Year year13 = date3.getYear();
		Year year16 = new Year(1);
		boolean b17 = year16.isValid();
		boolean b18 = year16.increment();
		boolean b19 = year16.increment();
		boolean b20 = year16.isLeap();
		year16.setYear(11);
		boolean b23 = year16.isLeap();
		int i24 = year16.getYear();
		Month month25 = new Month(11, year16);
		boolean b26 = date3.equals((java.lang.Object) year16);
		java.lang.String str27 = date3.toString();
		java.lang.String str28 = date3.toString();
	}

	@Test
	public void test330() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test174");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		boolean b5 = year2.equals((java.lang.Object) 100.0f);
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
		boolean b24 = day13.isValid();
		boolean b25 = day13.isValid();
		boolean b26 = year2.equals((java.lang.Object) b25);
		boolean b27 = year2.increment();
		Year year29 = new Year((int) (byte) 100);
		boolean b30 = year29.isValid();
		boolean b31 = year29.increment();
		year29.setYear((int) '4');
		boolean b34 = year29.isValid();
		year29.setYear(30);
		boolean b37 = year2.equals((java.lang.Object) year29);
		Month month38 = new Month(1, year29);
		Date date43 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year44 = date43.getYear();
		boolean b46 = date43.equals((java.lang.Object) "hi!");
		date43.increment();
		date43.printDate();
		Year year49 = date43.getYear();
		Year year50 = date43.getYear();
		Year year51 = date43.getYear();
		Year year52 = date43.getYear();
		try {
			month38.setMonth(13, year52);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test331() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test175");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		int i4 = year2.getYear();
		boolean b6 = year2.equals((java.lang.Object) 1);
		year2.setYear(32);
		boolean b9 = year2.isLeap();
		boolean b10 = year2.increment();
		Month month11 = new Month((int) (short) 1, year2);
		boolean b12 = month11.increment();
		int i13 = month11.getMonthSize();
		Year year16 = new Year(1);
		boolean b17 = year16.isValid();
		boolean b18 = year16.isValid();
		boolean b19 = year16.isValid();
		boolean b20 = year16.isValid();
		Month month21 = new Month(12, year16);
		int i22 = month21.getMonth();
		boolean b23 = month11.equals((java.lang.Object) i22);
	}

	@Test
	public void test332() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test176");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isValid();
		boolean b4 = year1.isLeap();
		boolean b5 = year1.isLeap();
		int i6 = year1.getYear();
		boolean b7 = year1.increment();
		int i8 = year1.getYear();
		Date date12 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date13 = Nextday.nextDay(date12);
		Day day14 = date13.getDay();
		boolean b15 = day14.isValid();
		boolean b16 = day14.isValid();
		boolean b17 = day14.isValid();
		boolean b18 = year1.equals((java.lang.Object) b17);
		int i19 = year1.getYear();
	}

	@Test
	public void test333() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test178");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		date3.printDate();
		Date date6 = Nextday.nextDay(date3);
		Month month7 = date3.getMonth();
	}

	@Test
	public void test334() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test181");
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
		Day day28 = date27.getDay();
		date27.printDate();
	}

	@Test
	public void test335() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test182");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		Year year7 = new Year((int) (byte) 100);
		boolean b8 = year7.isValid();
		Month month9 = new Month((int) (short) 10, year7);
		boolean b10 = month9.increment();
		boolean b11 = date3.equals((java.lang.Object) month9);
		Year year12 = date3.getYear();
		Date date13 = Nextday.nextDay(date3);
		Month month14 = date13.getMonth();
		Month month15 = date13.getMonth();
		Date date16 = Nextday.nextDay(date13);
		date13.printDate();
	}

	@Test
	public void test336() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test184");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b5 = date3.equals((java.lang.Object) (-1));
		Year year7 = new Year(1);
		boolean b8 = year7.isValid();
		boolean b9 = year7.isLeap();
		int i10 = year7.getYear();
		boolean b11 = year7.isLeap();
		boolean b12 = year7.isLeap();
		boolean b13 = date3.equals((java.lang.Object) b12);
		Month month14 = date3.getMonth();
		date3.printDate();
		date3.increment();
	}

	@Test
	public void test337() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test185");
		Date date3 = new Date(10, 3, 33);
		Year year4 = date3.getYear();
		Year year5 = date3.getYear();
		Date date6 = Nextday.nextDay(date3);
		Date date10 = new Date(10, (int) (byte) 10, (int) (short) 1);
		java.lang.String str11 = date10.toString();
		java.lang.String str12 = date10.toString();
		date10.printDate();
		boolean b14 = date6.equals((java.lang.Object) date10);
	}

	@Test
	public void test338() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test188");
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
		year1.setYear(100);
		boolean b15 = year1.isValid();
		int i16 = year1.getYear();
	}

	@Test
	public void test339() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test190");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		boolean b7 = month5.equals((java.lang.Object) 10L);
		int i8 = month5.getMonth();
		boolean b9 = month5.isValid();
		boolean b10 = month5.isValid();
		int i11 = month5.getMonth();
		Day day12 = new Day(13, month5);
		boolean b13 = day12.isValid();
	}

	@Test
	public void test340() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test191");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		Date date8 = Nextday.nextDay(date3);
		Year year9 = date3.getYear();
		Day day10 = date3.getDay();
		boolean b11 = day10.isValid();
	}

	@Test
	public void test341() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test192");
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
		date3.increment();
		Month month16 = date3.getMonth();
		java.lang.String str17 = date3.toString();
		Day day18 = date3.getDay();
		Month month19 = date3.getMonth();
	}

	@Test
	public void test342() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test194");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		java.lang.String str8 = date4.toString();
		Year year9 = date4.getYear();
		Date date10 = Nextday.nextDay(date4);
		Month month11 = date10.getMonth();
		boolean b12 = month11.isValid();
		int i13 = month11.getMonth();
		int i14 = month11.getMonth();
		int i15 = month11.getMonthSize();
		Day day16 = new Day((int) (short) 10, month11);
		boolean b17 = month11.increment();
	}

	@Test
	public void test343() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test196");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isLeap();
		int i4 = year1.getYear();
		boolean b5 = year1.isLeap();
		boolean b6 = year1.increment();
		int i7 = year1.getYear();
	}

	@Test
	public void test344() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test198");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b5 = month4.increment();
		boolean b6 = month4.increment();
		int i7 = month4.getMonth();
		boolean b8 = month4.isValid();
		int i9 = month4.getMonth();
		Year year11 = null;
		try {
			month4.setMonth((int) (short) 10, year11);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test345() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test199");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		Date date6 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year7 = date6.getYear();
		boolean b9 = date6.equals((java.lang.Object) "hi!");
		Day day10 = date6.getDay();
		Year year14 = new Year((int) (byte) 100);
		boolean b15 = year14.isValid();
		Month month16 = new Month((int) (short) 10, year14);
		day10.setDay((int) (short) 10, month16);
		java.lang.Object obj18 = null;
		boolean b19 = day10.equals(obj18);
		boolean b20 = day10.increment();
		int i21 = day10.getDay();
		boolean b22 = day10.isValid();
		boolean b23 = day10.isValid();
		Year year26 = new Year(1);
		boolean b27 = year26.isValid();
		boolean b28 = year26.isValid();
		boolean b29 = year26.isValid();
		boolean b30 = year26.isValid();
		int i31 = year26.getYear();
		Month month32 = new Month((int) (short) 10, year26);
		boolean b33 = year26.increment();
		boolean b34 = day10.equals((java.lang.Object) b33);
		boolean b35 = day10.increment();
		int i36 = day10.getDay();
		boolean b37 = year1.equals((java.lang.Object) i36);
		int i38 = year1.getYear();
		int i39 = year1.getYear();
	}

	@Test
	public void test346() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test201");
		try {
			Date date3 = new Date(32, 0, 14);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test347() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test206");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		boolean b4 = year2.isLeap();
		Month month5 = new Month((int) (short) 1, year2);
		boolean b6 = year2.isLeap();
		boolean b7 = year2.isValid();
	}

	@Test
	public void test348() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test207");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		date3.printDate();
		java.lang.String str9 = date3.toString();
		Month month10 = date3.getMonth();
		Day day11 = date3.getDay();
		date3.increment();
		Day day13 = date3.getDay();
		int i14 = day13.getDay();
		int i15 = day13.getDay();
	}

	@Test
	public void test349() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test208");
		Year year1 = new Year((int) (byte) 100);
		boolean b2 = year1.isValid();
		boolean b3 = year1.increment();
		year1.setYear((int) '4');
		boolean b6 = year1.isValid();
		boolean b7 = year1.isLeap();
		boolean b8 = year1.increment();
		boolean b9 = year1.increment();
		year1.setYear((int) (byte) 1);
	}

	@Test
	public void test350() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test210");
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
		int i26 = month25.getMonthSize();
		int i27 = month25.getMonthSize();
		int i28 = month25.getMonth();
		int i29 = month25.getMonth();
	}

	@Test
	public void test351() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test211");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isValid();
		boolean b4 = year1.isLeap();
		boolean b5 = year1.increment();
		boolean b6 = year1.increment();
		boolean b7 = year1.increment();
	}

	@Test
	public void test352() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test217");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		Date date6 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year7 = date6.getYear();
		boolean b9 = date6.equals((java.lang.Object) "hi!");
		boolean b10 = year1.equals((java.lang.Object) date6);
		boolean b11 = year1.increment();
		boolean b12 = year1.isValid();
	}

	@Test
	public void test353() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test218");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		Day day5 = date4.getDay();
		boolean b6 = day5.isValid();
		boolean b7 = day5.isValid();
		boolean b8 = day5.isValid();
		boolean b9 = day5.isValid();
	}

	@Test
	public void test354() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test219");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		date3.printDate();
		Year year11 = date3.getYear();
		Day day12 = date3.getDay();
		java.lang.Object obj13 = null;
		boolean b14 = date3.equals(obj13);
	}

	@Test
	public void test355() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test220");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		int i5 = month4.getMonth();
		Year year8 = new Year((int) (short) 1);
		boolean b9 = year8.isLeap();
		month4.setMonth((int) (short) 10, year8);
		boolean b11 = month4.isValid();
		int i12 = month4.getMonthSize();
		boolean b13 = month4.increment();
		boolean b14 = month4.isValid();
	}

	@Test
	public void test356() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test221");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		Day day9 = date3.getDay();
		boolean b10 = day9.isValid();
		int i11 = day9.getDay();
		int i12 = day9.getDay();
		boolean b13 = day9.increment();
		int i14 = day9.getDay();
		boolean b15 = day9.isValid();
		boolean b16 = day9.increment();
		boolean b17 = day9.increment();
	}

	@Test
	public void test357() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test222");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		date3.printDate();
		java.lang.String str9 = date3.toString();
		Day day10 = date3.getDay();
		boolean b11 = day10.isValid();
		boolean b12 = day10.isValid();
		boolean b13 = day10.isValid();
		boolean b14 = day10.increment();
		int i15 = day10.getDay();
		Date date20 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date21 = Nextday.nextDay(date20);
		Year year24 = new Year((int) (byte) 100);
		boolean b25 = year24.isValid();
		Month month26 = new Month((int) (short) 10, year24);
		boolean b27 = month26.increment();
		int i28 = month26.getMonthSize();
		boolean b29 = month26.isValid();
		boolean b30 = date21.equals((java.lang.Object) month26);
		int i31 = month26.getMonthSize();
		int i32 = month26.getMonth();
		try {
			day10.setDay((int) (short) 0, month26);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test358() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test226");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.printDate();
		Year year8 = date3.getYear();
		date3.increment();
		Date date10 = Nextday.nextDay(date3);
		Month month11 = date10.getMonth();
		Day day12 = date10.getDay();
		boolean b13 = day12.increment();
	}

	@Test
	public void test359() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test227");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		Month month10 = date9.getMonth();
		date9.printDate();
		date9.printDate();
		date9.increment();
		Month month14 = date9.getMonth();
		int i15 = month14.getMonthSize();
	}

	@Test
	public void test360() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test229");
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
		int i16 = month9.getMonthSize();
		int i17 = month9.getMonth();
		int i18 = month9.getMonthSize();
		int i19 = month9.getMonthSize();
		int i20 = month9.getMonthSize();
	}

	@Test
	public void test361() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test231");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		Year year9 = new Year(1);
		boolean b10 = year9.isValid();
		boolean b11 = year9.increment();
		boolean b12 = year9.increment();
		boolean b13 = month7.equals((java.lang.Object) b12);
		Year year16 = new Year(1);
		boolean b17 = year16.isValid();
		boolean b18 = year16.isLeap();
		int i19 = year16.getYear();
		boolean b20 = year16.isLeap();
		month7.setMonth(10, year16);
		int i22 = year16.getYear();
		boolean b23 = year16.increment();
	}

	@Test
	public void test362() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test232");
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
		boolean b19 = day7.increment();
		int i20 = day7.getDay();
		Date date25 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year26 = date25.getYear();
		boolean b28 = date25.equals((java.lang.Object) "hi!");
		java.lang.String str29 = date25.toString();
		boolean b31 = date25.equals((java.lang.Object) (short) 100);
		Year year32 = date25.getYear();
		Date date33 = Nextday.nextDay(date25);
		date33.increment();
		date33.printDate();
		date33.increment();
		Month month37 = date33.getMonth();
		int i38 = month37.getMonth();
		boolean b39 = month37.isValid();
		try {
			day7.setDay(52, month37);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test363() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test233");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		boolean b4 = year1.equals((java.lang.Object) 100.0f);
		year1.setYear(31);
		Year year10 = new Year((int) (byte) 100);
		boolean b11 = year10.isValid();
		Month month12 = new Month((int) (short) 10, year10);
		int i13 = month12.getMonth();
		Day day14 = new Day(1, month12);
		boolean b15 = year1.equals((java.lang.Object) day14);
	}

	@Test
	public void test364() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test235");
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
		int i27 = month15.getMonthSize();
		Year year31 = new Year(5);
		Month month32 = new Month(2, year31);
		try {
			month15.setMonth(52, year31);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test365() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test237");
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
		int i16 = month9.getMonthSize();
		boolean b17 = month9.isValid();
		int i18 = month9.getMonth();
	}

	@Test
	public void test366() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test240");
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
		date14.increment();
		boolean b17 = date14.equals((java.lang.Object) "");
		Date date18 = Nextday.nextDay(date14);
		Date date19 = Nextday.nextDay(date18);
	}

	@Test
	public void test367() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test243");
		Year year4 = new Year(1);
		boolean b5 = year4.isValid();
		boolean b6 = year4.isLeap();
		int i7 = year4.getYear();
		boolean b8 = year4.isLeap();
		Month month9 = new Month((int) (byte) 1, year4);
		Day day10 = new Day(31, month9);
		boolean b11 = day10.isValid();
		boolean b12 = day10.increment();
		boolean b13 = day10.increment();
		Year year16 = new Year(1);
		boolean b17 = year16.isValid();
		boolean b18 = year16.isValid();
		boolean b19 = year16.isValid();
		boolean b20 = year16.isValid();
		Month month21 = new Month(12, year16);
		boolean b22 = day10.equals((java.lang.Object) year16);
		int i23 = year16.getYear();
		try {
			Month month24 = new Month(0, year16);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test368() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test244");
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
		int i13 = year2.getYear();
	}

	@Test
	public void test369() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test247");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Date date10 = Nextday.nextDay(date3);
		date10.increment();
		Month month12 = date10.getMonth();
		java.lang.String str13 = date10.toString();
		Day day14 = date10.getDay();
		Date date15 = Nextday.nextDay(date10);
		Day day16 = date10.getDay();
	}

	@Test
	public void test370() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test248");
		Year year1 = new Year((int) (byte) 10);
		boolean b2 = year1.increment();
		boolean b3 = year1.isLeap();
		Date date7 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date8 = Nextday.nextDay(date7);
		date7.printDate();
		java.lang.String str10 = date7.toString();
		Day day11 = date7.getDay();
		date7.increment();
		boolean b13 = year1.equals((java.lang.Object) date7);
	}

	@Test
	public void test371() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test249");
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
		int i18 = month12.getMonthSize();
		boolean b19 = month12.increment();
		Year year22 = new Year(1);
		boolean b23 = year22.isValid();
		boolean b24 = year22.isValid();
		boolean b25 = year22.isLeap();
		int i26 = year22.getYear();
		try {
			month12.setMonth(30, year22);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test372() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test250");
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
		date14.printDate();
		Date date18 = Nextday.nextDay(date14);
		Year year19 = date14.getYear();
	}

	@Test
	public void test373() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test253");
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
		int i13 = year2.getYear();
	}

	@Test
	public void test374() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test254");
		try {
			Date date3 = new Date(101, 2, 0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test375() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test255");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		Date date6 = Nextday.nextDay(date3);
		date6.increment();
		Year year8 = date6.getYear();
		boolean b9 = year8.increment();
		boolean b10 = year8.isLeap();
	}

	@Test
	public void test376() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test257");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b6 = date4.equals((java.lang.Object) (-1));
		Year year7 = date4.getYear();
		Month month8 = new Month(3, year7);
		Year year11 = new Year(3);
		month8.setMonth(11, year11);
		boolean b13 = month8.isValid();
		boolean b14 = month8.increment();
		Date date19 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date23 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year24 = date23.getYear();
		boolean b26 = date23.equals((java.lang.Object) "hi!");
		Day day27 = date23.getDay();
		Year year31 = new Year((int) (byte) 100);
		boolean b32 = year31.isValid();
		Month month33 = new Month((int) (short) 10, year31);
		day27.setDay((int) (short) 10, month33);
		java.lang.Object obj35 = null;
		boolean b36 = day27.equals(obj35);
		boolean b37 = day27.increment();
		int i38 = day27.getDay();
		boolean b39 = day27.isValid();
		boolean b40 = date19.equals((java.lang.Object) day27);
		Month month41 = date19.getMonth();
		Year year42 = date19.getYear();
		year42.setYear((int) '#');
		try {
			month8.setMonth((int) (byte) 0, year42);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test377() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test260");
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
		boolean b18 = month12.isValid();
	}

	@Test
	public void test378() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test261");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		int i3 = year1.getYear();
		boolean b5 = year1.equals((java.lang.Object) 1);
		Date date9 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year10 = date9.getYear();
		boolean b12 = date9.equals((java.lang.Object) "hi!");
		java.lang.String str13 = date9.toString();
		boolean b15 = date9.equals((java.lang.Object) (short) 100);
		Date date16 = Nextday.nextDay(date9);
		date16.increment();
		Month month18 = date16.getMonth();
		boolean b19 = year1.equals((java.lang.Object) month18);
		boolean b20 = year1.isLeap();
	}

	@Test
	public void test379() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test263");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Year year10 = date3.getYear();
		Date date11 = Nextday.nextDay(date3);
		Day day12 = date3.getDay();
		Year year14 = new Year(1);
		boolean b15 = year14.isLeap();
		boolean b16 = year14.isLeap();
		boolean b17 = year14.increment();
		boolean b18 = year14.increment();
		boolean b19 = date3.equals((java.lang.Object) year14);
		int i20 = year14.getYear();
		year14.setYear((int) '#');
		boolean b23 = year14.isValid();
	}

	@Test
	public void test380() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test264");
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
		date3.printDate();
		Date date19 = Nextday.nextDay(date3);
	}

	@Test
	public void test381() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test265");
		Year year1 = new Year(11);
		boolean b2 = year1.isLeap();
		boolean b3 = year1.increment();
	}

	@Test
	public void test382() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test268");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		java.lang.String str8 = date4.toString();
		Year year9 = date4.getYear();
		Date date10 = Nextday.nextDay(date4);
		Month month11 = date10.getMonth();
		int i12 = month11.getMonthSize();
		Day day13 = new Day(5, month11);
		int i14 = day13.getDay();
	}

	@Test
	public void test383() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test271");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		boolean b5 = year2.equals((java.lang.Object) 100.0f);
		boolean b6 = year2.isLeap();
		boolean b7 = year2.isValid();
		try {
			Month month8 = new Month(32, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test384() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test272");
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
		boolean b16 = year2.increment();
		year2.setYear((int) (byte) 1);
		int i19 = year2.getYear();
		year2.setYear(102);
		boolean b22 = year2.isValid();
	}

	@Test
	public void test385() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test274");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		boolean b4 = year2.isLeap();
		boolean b5 = year2.increment();
		Month month6 = new Month((int) (short) 1, year2);
		Year year8 = new Year(1);
		boolean b9 = year8.isValid();
		boolean b10 = year8.isValid();
		boolean b11 = year8.isValid();
		boolean b12 = year8.isValid();
		boolean b13 = year8.isValid();
		year8.setYear((int) ' ');
		int i16 = year8.getYear();
		boolean b17 = month6.equals((java.lang.Object) i16);
		int i18 = month6.getMonthSize();
	}

	@Test
	public void test386() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test275");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Date date10 = Nextday.nextDay(date3);
		date10.increment();
		java.lang.String str12 = date10.toString();
		Month month13 = date10.getMonth();
	}

	@Test
	public void test387() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test277");
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
		boolean b16 = year14.isValid();
	}

	@Test
	public void test388() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test278");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		date4.printDate();
		java.lang.String str6 = date4.toString();
		java.lang.String str7 = date4.toString();
	}

	@Test
	public void test389() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test280");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Year year10 = date3.getYear();
		Day day11 = date3.getDay();
		date3.printDate();
	}

	@Test
	public void test390() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test282");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		date3.printDate();
		Year year11 = date3.getYear();
		Day day12 = date3.getDay();
		int i13 = day12.getDay();
		Year year15 = new Year(1);
		boolean b16 = year15.isLeap();
		int i17 = year15.getYear();
		year15.setYear(100);
		boolean b20 = year15.isLeap();
		year15.setYear(1);
		boolean b23 = day12.equals((java.lang.Object) year15);
	}

	@Test
	public void test391() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test283");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b6 = month4.equals((java.lang.Object) 10L);
		boolean b7 = month4.isValid();
		boolean b8 = month4.isValid();
		int i9 = month4.getMonthSize();
		int i10 = month4.getMonthSize();
	}

	@Test
	public void test392() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test284");
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
		int i31 = year27.getYear();
	}

	@Test
	public void test393() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test286");
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
		Year year17 = new Year(1);
		boolean b18 = year17.isLeap();
		boolean b19 = year17.isLeap();
		java.lang.Object obj20 = new java.lang.Object();
		boolean b21 = year17.equals(obj20);
		boolean b22 = date10.equals((java.lang.Object) year17);
		year17.setYear(33);
	}

	@Test
	public void test394() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test290");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.increment();
		year1.setYear(97);
		int i6 = year1.getYear();
	}

	@Test
	public void test395() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test293");
		Year year1 = new Year((int) (byte) 100);
		java.lang.Object obj2 = new java.lang.Object();
		boolean b3 = year1.equals(obj2);
		Date date7 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year8 = date7.getYear();
		boolean b10 = date7.equals((java.lang.Object) "hi!");
		Month month11 = date7.getMonth();
		boolean b12 = year1.equals((java.lang.Object) date7);
		Date date13 = Nextday.nextDay(date7);
		Day day14 = date13.getDay();
		int i15 = day14.getDay();
	}

	@Test
	public void test396() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test294");
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
		int i15 = month5.getMonth();
		int i16 = month5.getMonthSize();
	}

	@Test
	public void test397() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test296");
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
		int i33 = day17.getDay();
		boolean b34 = day17.increment();
	}

	@Test
	public void test398() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test297");
		Year year1 = new Year((int) (short) 100);
		boolean b2 = year1.increment();
		Year year4 = new Year(1);
		boolean b5 = year4.isValid();
		int i6 = year4.getYear();
		year4.setYear(100);
		boolean b9 = year1.equals((java.lang.Object) year4);
		boolean b11 = year4.equals((java.lang.Object) (byte) -1);
		boolean b13 = year4.equals((java.lang.Object) 52);
		year4.setYear(52);
	}

	@Test
	public void test399() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test298");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b6 = date4.equals((java.lang.Object) (-1));
		Year year8 = new Year(1);
		boolean b9 = year8.isValid();
		boolean b10 = year8.isLeap();
		int i11 = year8.getYear();
		boolean b12 = year8.isLeap();
		boolean b13 = year8.isLeap();
		boolean b14 = date4.equals((java.lang.Object) b13);
		java.lang.String str15 = date4.toString();
		Month month16 = date4.getMonth();
		date4.printDate();
		Day day18 = date4.getDay();
		Month month19 = date4.getMonth();
		date4.increment();
		Year year21 = date4.getYear();
		Month month22 = new Month(10, year21);
	}

	@Test
	public void test400() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test299");
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
		boolean b20 = year19.isValid();
		int i21 = year19.getYear();
		year19.setYear(100);
		boolean b24 = year19.isLeap();
		boolean b25 = year19.isLeap();
		boolean b26 = year19.isLeap();
		boolean b27 = month13.equals((java.lang.Object) year19);
	}

	@Test
	public void test401() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test300");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		Day day5 = date4.getDay();
		Year year6 = date4.getYear();
		date4.printDate();
		date4.printDate();
		Date date9 = Nextday.nextDay(date4);
		Day day10 = date4.getDay();
		Year year11 = date4.getYear();
	}

	@Test
	public void test402() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test302");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		boolean b4 = year2.isLeap();
		boolean b5 = year2.increment();
		Month month6 = new Month((int) (short) 1, year2);
		Year year8 = new Year(1);
		boolean b9 = year8.isValid();
		boolean b10 = year8.isValid();
		boolean b11 = year8.isValid();
		boolean b12 = year8.isValid();
		boolean b13 = year8.isValid();
		year8.setYear((int) ' ');
		int i16 = year8.getYear();
		boolean b17 = month6.equals((java.lang.Object) i16);
		boolean b18 = month6.isValid();
	}

	@Test
	public void test403() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test305");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		boolean b4 = year2.isLeap();
		boolean b5 = year2.increment();
		boolean b6 = year2.isLeap();
		boolean b7 = year2.isValid();
		boolean b8 = year2.isLeap();
		Month month9 = new Month(5, year2);
		boolean b10 = year2.isValid();
		boolean b11 = year2.increment();
	}

	@Test
	public void test404() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test309");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.printDate();
		Year year8 = date3.getYear();
		date3.increment();
		Date date10 = Nextday.nextDay(date3);
		Year year11 = date3.getYear();
		Year year13 = new Year(1);
		boolean b14 = year13.increment();
		int i15 = year13.getYear();
		year13.setYear((int) (short) -1);
		boolean b18 = year11.equals((java.lang.Object) (short) -1);
		int i19 = year11.getYear();
	}

	@Test
	public void test405() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test311");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		Date date10 = Nextday.nextDay(date9);
		java.lang.String str11 = date10.toString();
	}

	@Test
	public void test406() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test312");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		boolean b3 = year1.increment();
		boolean b4 = year1.isValid();
		year1.setYear(3);
		Year year10 = new Year((int) (byte) 100);
		boolean b11 = year10.isValid();
		Month month12 = new Month((int) (short) 10, year10);
		int i13 = month12.getMonth();
		Day day14 = new Day(30, month12);
		java.lang.Object obj15 = null;
		boolean b16 = day14.equals(obj15);
		boolean b17 = year1.equals((java.lang.Object) day14);
		boolean b18 = year1.isValid();
	}

	@Test
	public void test407() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test316");
		Date date3 = new Date((int) (short) 10, 11, (int) (short) 100);
		Month month4 = date3.getMonth();
		Month month5 = date3.getMonth();
		Date date10 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year11 = date10.getYear();
		boolean b13 = date10.equals((java.lang.Object) "hi!");
		Day day14 = date10.getDay();
		Year year15 = date10.getYear();
		month5.setMonth((int) (byte) 10, year15);
		boolean b17 = month5.increment();
	}

	@Test
	public void test408() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test318");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b5 = month4.increment();
		int i6 = month4.getMonthSize();
		boolean b7 = month4.isValid();
		int i8 = month4.getMonth();
		Date date13 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date13.printDate();
		Year year15 = date13.getYear();
		date13.printDate();
		java.lang.String str17 = date13.toString();
		Day day18 = date13.getDay();
		Date date19 = Nextday.nextDay(date13);
		Year year20 = date19.getYear();
		try {
			month4.setMonth(14, year20);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test409() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test319");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.printDate();
		Year year8 = date3.getYear();
		date3.increment();
		Date date10 = Nextday.nextDay(date3);
		Year year11 = date3.getYear();
		Year year12 = date3.getYear();
		boolean b13 = year12.isValid();
		boolean b14 = year12.isLeap();
	}

	@Test
	public void test410() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test320");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		date3.printDate();
		Year year11 = date3.getYear();
		Day day12 = date3.getDay();
		java.lang.Object obj13 = null;
		boolean b14 = day12.equals(obj13);
	}

	@Test
	public void test411() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test324");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		java.lang.String str8 = date3.toString();
		date3.printDate();
		Month month10 = date3.getMonth();
		int i11 = month10.getMonth();
		int i12 = month10.getMonth();
	}

	@Test
	public void test412() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test329");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isValid();
		boolean b4 = year1.isValid();
		boolean b5 = year1.isValid();
		int i6 = year1.getYear();
		boolean b7 = year1.increment();
		boolean b8 = year1.increment();
		boolean b9 = year1.increment();
		boolean b10 = year1.increment();
		boolean b11 = year1.isValid();
	}

	@Test
	public void test413() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test332");
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
		int i19 = month8.getMonth();
		int i20 = month8.getMonth();
		boolean b21 = month8.increment();
		boolean b22 = month8.increment();
		boolean b23 = month8.increment();
	}

	@Test
	public void test414() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test333");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		int i3 = year1.getYear();
		boolean b5 = year1.equals((java.lang.Object) 1);
		year1.setYear(32);
		boolean b8 = year1.isLeap();
		boolean b9 = year1.increment();
		boolean b10 = year1.isValid();
		Year year13 = new Year((int) (byte) 100);
		boolean b14 = year13.isValid();
		Month month15 = new Month((int) (short) 10, year13);
		boolean b16 = month15.increment();
		boolean b17 = month15.increment();
		boolean b18 = month15.isValid();
		boolean b19 = month15.increment();
		Year year21 = new Year(1);
		year21.setYear(32);
		boolean b24 = month15.equals((java.lang.Object) year21);
		boolean b25 = year1.equals((java.lang.Object) year21);
		year1.setYear((int) (short) 10);
	}

	@Test
	public void test415() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test336");
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
		boolean b24 = day7.increment();
		Year year28 = new Year(101);
		boolean b29 = year28.increment();
		year28.setYear(32);
		Year year33 = new Year((int) (short) 100);
		boolean b34 = year33.increment();
		Year year36 = new Year(1);
		boolean b37 = year36.isValid();
		int i38 = year36.getYear();
		year36.setYear(100);
		boolean b41 = year33.equals((java.lang.Object) year36);
		boolean b43 = year36.equals((java.lang.Object) (byte) -1);
		boolean b44 = year36.isValid();
		boolean b45 = year28.equals((java.lang.Object) year36);
		Month month46 = new Month((int) (short) 10, year36);
		int i47 = month46.getMonth();
		try {
			day7.setDay((int) (byte) 0, month46);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test416() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test337");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		boolean b7 = month5.equals((java.lang.Object) 10L);
		boolean b8 = month5.isValid();
		int i9 = month5.getMonthSize();
		int i10 = month5.getMonth();
		Year year13 = new Year(1);
		boolean b14 = year13.isValid();
		boolean b15 = year13.isLeap();
		int i16 = year13.getYear();
		boolean b17 = year13.isLeap();
		Month month18 = new Month((int) (byte) 1, year13);
		int i19 = month18.getMonthSize();
		int i20 = month18.getMonthSize();
		int i21 = month18.getMonthSize();
		boolean b22 = month18.isValid();
		int i23 = month18.getMonth();
		boolean b24 = month5.equals((java.lang.Object) i23);
		Year year26 = new Year(1);
		boolean b27 = year26.isLeap();
		boolean b28 = year26.isLeap();
		java.lang.Object obj29 = new java.lang.Object();
		boolean b30 = year26.equals(obj29);
		boolean b31 = year26.increment();
		boolean b32 = month5.equals((java.lang.Object) year26);
		Day day33 = new Day((int) (short) 10, month5);
		Date date39 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year40 = date39.getYear();
		date39.printDate();
		Year year42 = date39.getYear();
		Day day43 = date39.getDay();
		Month month44 = date39.getMonth();
		Year year45 = date39.getYear();
		Month month46 = new Month((int) (short) 10, year45);
		int i47 = month46.getMonth();
		try {
			day33.setDay(0, month46);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test417() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test338");
		Year year4 = new Year(1);
		boolean b5 = year4.isLeap();
		boolean b6 = year4.isLeap();
		boolean b7 = year4.increment();
		Month month8 = new Month((int) (short) 1, year4);
		Date date12 = new Date(10, (int) (byte) 10, (int) (short) 1);
		java.lang.String str13 = date12.toString();
		boolean b14 = month8.equals((java.lang.Object) date12);
		Day day15 = new Day((int) (byte) 10, month8);
		int i16 = month8.getMonthSize();
		int i17 = month8.getMonthSize();
		boolean b18 = month8.increment();
		Day day19 = new Day(2, month8);
		boolean b20 = day19.increment();
	}

	@Test
	public void test418() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test340");
		Year year1 = new Year((int) (byte) 100);
		java.lang.Object obj2 = new java.lang.Object();
		boolean b3 = year1.equals(obj2);
		int i4 = year1.getYear();
		int i5 = year1.getYear();
		year1.setYear(102);
	}

	@Test
	public void test419() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test342");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isLeap();
		int i6 = year3.getYear();
		boolean b7 = year3.isLeap();
		Month month8 = new Month((int) (byte) 1, year3);
		Day day9 = new Day(31, month8);
		boolean b10 = day9.isValid();
		boolean b11 = day9.increment();
		boolean b12 = day9.increment();
		boolean b13 = day9.increment();
		boolean b14 = day9.increment();
		boolean b15 = day9.increment();
	}

	@Test
	public void test420() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test343");
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
		boolean b16 = year2.increment();
		year2.setYear((int) (byte) 1);
		year2.setYear((int) (byte) -1);
		boolean b21 = year2.increment();
		int i22 = year2.getYear();
	}

	@Test
	public void test421() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test345");
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
		Day day17 = date3.getDay();
		Year year22 = new Year((int) (byte) 100);
		boolean b23 = year22.isValid();
		Month month24 = new Month((int) (short) 10, year22);
		int i25 = month24.getMonth();
		Day day26 = new Day(30, month24);
		boolean b27 = month24.increment();
		boolean b28 = month24.increment();
		boolean b29 = month24.isValid();
		day17.setDay(10, month24);
	}

	@Test
	public void test422() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test346");
		Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year6 = date5.getYear();
		boolean b8 = date5.equals((java.lang.Object) "hi!");
		Month month9 = date5.getMonth();
		int i10 = month9.getMonthSize();
		boolean b11 = month9.increment();
		Day day12 = new Day(2, month9);
		boolean b13 = month9.increment();
		boolean b14 = month9.increment();
		try {
			Day day15 = new Day((int) (byte) -1, month9);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test423() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test349");
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
		int i17 = day7.getDay();
		int i18 = day7.getDay();
	}

	@Test
	public void test424() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test350");
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
		date3.increment();
		Date date19 = Nextday.nextDay(date3);
		Month month20 = date19.getMonth();
		boolean b21 = month20.increment();
	}

	@Test
	public void test425() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test351");
		Date date3 = new Date(10, 3, 33);
		Year year4 = date3.getYear();
		Date date5 = Nextday.nextDay(date3);
	}

	@Test
	public void test426() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test352");
		Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b7 = date5.equals((java.lang.Object) (-1));
		Year year8 = date5.getYear();
		Month month9 = new Month(3, year8);
		int i10 = month9.getMonthSize();
		Day day11 = new Day(1, month9);
	}

	@Test
	public void test427() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test357");
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
		boolean b13 = month7.increment();
	}

	@Test
	public void test428() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test358");
		Date date3 = new Date((int) (short) 10, 11, (int) (short) 100);
		Day day4 = date3.getDay();
		Date date5 = Nextday.nextDay(date3);
		Month month6 = date3.getMonth();
		Date date10 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date11 = Nextday.nextDay(date10);
		Year year14 = new Year((int) (byte) 100);
		boolean b15 = year14.isValid();
		Month month16 = new Month((int) (short) 10, year14);
		boolean b17 = month16.increment();
		int i18 = month16.getMonthSize();
		boolean b19 = month16.isValid();
		boolean b20 = date11.equals((java.lang.Object) month16);
		Year year23 = new Year(1);
		boolean b24 = year23.isValid();
		boolean b25 = year23.increment();
		boolean b26 = year23.increment();
		boolean b27 = year23.increment();
		month16.setMonth(1, year23);
		boolean b29 = date3.equals((java.lang.Object) 1);
		Day day30 = date3.getDay();
		Year year33 = new Year(1);
		boolean b34 = year33.isValid();
		boolean b35 = year33.isValid();
		boolean b36 = year33.isValid();
		boolean b37 = year33.isValid();
		Month month38 = new Month(12, year33);
		int i39 = month38.getMonth();
		boolean b40 = day30.equals((java.lang.Object) i39);
		boolean b41 = day30.isValid();
	}

	@Test
	public void test429() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test359");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		Month month8 = date3.getMonth();
		date3.increment();
		date3.increment();
		Month month11 = date3.getMonth();
	}

	@Test
	public void test430() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test360");
		try {
			Date date3 = new Date(13, (int) (byte) 100, 52);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test431() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test362");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		date3.printDate();
		Year year9 = date3.getYear();
		Date date10 = Nextday.nextDay(date3);
	}

	@Test
	public void test432() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test363");
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
		Date date18 = Nextday.nextDay(date3);
		Month month19 = date18.getMonth();
		boolean b20 = month19.isValid();
	}

	@Test
	public void test433() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test365");
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
		boolean b19 = month8.isValid();
		Year year21 = new Year((int) (byte) 100);
		int i22 = year21.getYear();
		int i23 = year21.getYear();
		boolean b24 = month8.equals((java.lang.Object) year21);
		Year year26 = new Year(1);
		boolean b27 = year26.isValid();
		int i28 = year26.getYear();
		year26.setYear(100);
		int i31 = year26.getYear();
		boolean b32 = year26.increment();
		boolean b33 = year21.equals((java.lang.Object) b32);
	}

	@Test
	public void test434() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test366");
		Year year1 = new Year(12);
		Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year6 = date5.getYear();
		boolean b8 = date5.equals((java.lang.Object) "hi!");
		java.lang.String str9 = date5.toString();
		Year year10 = date5.getYear();
		Date date11 = Nextday.nextDay(date5);
		Day day12 = date11.getDay();
		date11.printDate();
		boolean b14 = year1.equals((java.lang.Object) date11);
	}

	@Test
	public void test435() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test368");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		boolean b8 = month7.increment();
		boolean b9 = month7.increment();
		Date date13 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date14 = Nextday.nextDay(date13);
		Year year17 = new Year((int) (byte) 100);
		boolean b18 = year17.isValid();
		Month month19 = new Month((int) (short) 10, year17);
		boolean b20 = month19.increment();
		int i21 = month19.getMonthSize();
		boolean b22 = month19.isValid();
		boolean b23 = date14.equals((java.lang.Object) month19);
		int i24 = month19.getMonthSize();
		int i25 = month19.getMonth();
		boolean b26 = month7.equals((java.lang.Object) month19);
		int i27 = month19.getMonth();
		boolean b28 = month19.isValid();
		int i29 = month19.getMonthSize();
	}

	@Test
	public void test436() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test369");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		int i6 = month5.getMonth();
		Day day7 = new Day(30, month5);
		int i8 = day7.getDay();
		boolean b9 = day7.increment();
		java.lang.Object obj10 = null;
		boolean b11 = day7.equals(obj10);
		Year year13 = new Year(11);
		Date date17 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year18 = date17.getYear();
		boolean b20 = date17.equals((java.lang.Object) "hi!");
		Month month21 = date17.getMonth();
		date17.printDate();
		java.lang.String str23 = date17.toString();
		Month month24 = date17.getMonth();
		int i25 = month24.getMonthSize();
		boolean b26 = year13.equals((java.lang.Object) month24);
		boolean b27 = day7.equals((java.lang.Object) b26);
		Year year31 = new Year((int) (byte) 100);
		Month month32 = new Month((int) (short) 1, year31);
		Date date36 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date37 = Nextday.nextDay(date36);
		date36.increment();
		date36.increment();
		java.lang.String str40 = date36.toString();
		boolean b41 = month32.equals((java.lang.Object) date36);
		Year year42 = date36.getYear();
		Month month43 = date36.getMonth();
		try {
			day7.setDay((int) (short) -1, month43);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test437() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test371");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.increment();
		boolean b4 = year1.increment();
		boolean b5 = year1.increment();
		boolean b6 = year1.isValid();
		try {
			year1.setYear(0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test438() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test373");
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
		Date date15 = Nextday.nextDay(date14);
		date15.increment();
	}

	@Test
	public void test439() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test375");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		Date date8 = Nextday.nextDay(date3);
		date3.increment();
	}

	@Test
	public void test440() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test377");
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
		java.lang.String str21 = date3.toString();
		Date date22 = Nextday.nextDay(date3);
		Month month23 = date3.getMonth();
		Day day24 = date3.getDay();
	}

	@Test
	public void test441() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test378");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		date3.printDate();
		date3.increment();
		date3.increment();
	}

	@Test
	public void test442() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test380");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		java.lang.String str8 = date3.toString();
		date3.printDate();
		Year year10 = date3.getYear();
		Date date11 = Nextday.nextDay(date3);
		Month month12 = date11.getMonth();
		boolean b13 = month12.increment();
	}

	@Test
	public void test443() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test381");
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
		Day day17 = date3.getDay();
		boolean b18 = day17.increment();
		boolean b19 = day17.increment();
	}

	@Test
	public void test444() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test382");
		Year year2 = new Year((int) '#');
		Date date6 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year7 = date6.getYear();
		boolean b9 = date6.equals((java.lang.Object) "hi!");
		date6.printDate();
		Year year11 = date6.getYear();
		Year year13 = new Year(1);
		boolean b14 = year13.isValid();
		boolean b15 = year13.isValid();
		boolean b16 = year13.isLeap();
		boolean b17 = year13.increment();
		int i18 = year13.getYear();
		boolean b19 = date6.equals((java.lang.Object) year13);
		boolean b20 = year2.equals((java.lang.Object) year13);
		Month month21 = new Month(4, year13);
	}

	@Test
	public void test445() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test384");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		date4.increment();
		Date date9 = Nextday.nextDay(date4);
		date4.printDate();
		Day day11 = date4.getDay();
		java.lang.String str12 = date4.toString();
		date4.printDate();
		Month month14 = date4.getMonth();
		Day day15 = new Day(30, month14);
	}

	@Test
	public void test446() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test386");
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
		int i14 = year4.getYear();
		int i15 = year4.getYear();
	}

	@Test
	public void test447() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test388");
		Year year1 = new Year((int) (short) 100);
		boolean b2 = year1.increment();
		Year year4 = new Year(1);
		boolean b5 = year4.isValid();
		int i6 = year4.getYear();
		year4.setYear(100);
		boolean b9 = year1.equals((java.lang.Object) year4);
		boolean b11 = year4.equals((java.lang.Object) (byte) -1);
		Date date15 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year16 = date15.getYear();
		boolean b18 = date15.equals((java.lang.Object) "hi!");
		java.lang.String str19 = date15.toString();
		Year year20 = date15.getYear();
		Date date21 = Nextday.nextDay(date15);
		Month month22 = date21.getMonth();
		int i23 = month22.getMonth();
		boolean b24 = year4.equals((java.lang.Object) month22);
		boolean b25 = year4.increment();
		boolean b26 = year4.increment();
		int i27 = year4.getYear();
		boolean b28 = year4.isValid();
		boolean b29 = year4.isValid();
	}

	@Test
	public void test448() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test390");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		date3.printDate();
		Year year9 = date3.getYear();
		Date date10 = Nextday.nextDay(date3);
		Date date11 = Nextday.nextDay(date10);
		Year year12 = date11.getYear();
	}

	@Test
	public void test449() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test391");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		Day day9 = date3.getDay();
		date3.increment();
		Date date11 = Nextday.nextDay(date3);
	}

	@Test
	public void test450() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test394");
		Year year1 = new Year((int) (byte) 100);
		boolean b2 = year1.isValid();
		boolean b3 = year1.increment();
		year1.setYear((int) '4');
		boolean b6 = year1.isValid();
		boolean b7 = year1.isLeap();
		boolean b8 = year1.increment();
		boolean b9 = year1.increment();
		boolean b10 = year1.isLeap();
	}

	@Test
	public void test451() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test396");
		Year year1 = new Year((int) (short) 1);
		boolean b2 = year1.isLeap();
		year1.setYear(3);
		year1.setYear(28);
	}

	@Test
	public void test452() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test398");
		try {
			Date date3 = new Date(31, (int) (short) 0, (int) (byte) 1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test453() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test401");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		Month month8 = date4.getMonth();
		int i9 = month8.getMonthSize();
		boolean b11 = month8.equals((java.lang.Object) 0L);
		Day day12 = new Day(4, month8);
		boolean b13 = day12.increment();
		boolean b14 = day12.isValid();
		boolean b15 = day12.increment();
	}

	@Test
	public void test454() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test402");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isLeap();
		int i5 = year2.getYear();
		boolean b6 = year2.isLeap();
		boolean b7 = year2.isLeap();
		boolean b8 = year2.increment();
		Month month9 = new Month(10, year2);
	}

	@Test
	public void test455() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test403");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		Month month10 = date9.getMonth();
		boolean b11 = month10.isValid();
		int i12 = month10.getMonth();
		int i13 = month10.getMonth();
		boolean b14 = month10.isValid();
	}

	@Test
	public void test456() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test404");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		java.lang.String str8 = date4.toString();
		boolean b10 = date4.equals((java.lang.Object) (short) 100);
		Date date11 = Nextday.nextDay(date4);
		date11.increment();
		Month month13 = date11.getMonth();
		java.lang.String str14 = date11.toString();
		date11.increment();
		Month month16 = date11.getMonth();
		boolean b17 = month16.isValid();
		Day day18 = new Day(2, month16);
	}

	@Test
	public void test457() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test407");
		Year year2 = new Year((int) (short) 100);
		boolean b3 = year2.increment();
		Year year5 = new Year(1);
		boolean b6 = year5.isValid();
		int i7 = year5.getYear();
		year5.setYear(100);
		boolean b10 = year2.equals((java.lang.Object) year5);
		boolean b12 = year5.equals((java.lang.Object) (byte) -1);
		Date date16 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year17 = date16.getYear();
		boolean b19 = date16.equals((java.lang.Object) "hi!");
		java.lang.String str20 = date16.toString();
		Year year21 = date16.getYear();
		Date date22 = Nextday.nextDay(date16);
		Month month23 = date22.getMonth();
		int i24 = month23.getMonth();
		boolean b25 = year5.equals((java.lang.Object) month23);
		Day day26 = new Day(2, month23);
		int i27 = month23.getMonth();
	}

	@Test
	public void test458() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test408");
		Year year2 = new Year((int) (byte) 100);
		java.lang.Object obj3 = new java.lang.Object();
		boolean b4 = year2.equals(obj3);
		Date date8 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year9 = date8.getYear();
		boolean b11 = date8.equals((java.lang.Object) "hi!");
		Month month12 = date8.getMonth();
		boolean b13 = year2.equals((java.lang.Object) date8);
		Date date14 = Nextday.nextDay(date8);
		java.lang.String str15 = date14.toString();
		Year year17 = new Year(1);
		boolean b18 = year17.isLeap();
		boolean b19 = year17.isLeap();
		boolean b20 = year17.increment();
		java.lang.Object obj21 = null;
		boolean b22 = year17.equals(obj21);
		int i23 = year17.getYear();
		int i24 = year17.getYear();
		boolean b25 = year17.increment();
		boolean b26 = date14.equals((java.lang.Object) year17);
		Month month27 = new Month((int) (byte) 10, year17);
		int i28 = month27.getMonth();
		int i29 = month27.getMonthSize();
	}

	@Test
	public void test459() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test409");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		java.lang.String str8 = date4.toString();
		boolean b10 = date4.equals((java.lang.Object) (short) 100);
		Year year11 = date4.getYear();
		Date date12 = Nextday.nextDay(date4);
		date12.increment();
		Month month14 = date12.getMonth();
		Day day15 = new Day((int) (byte) 1, month14);
		int i16 = day15.getDay();
		boolean b17 = day15.increment();
	}

	@Test
	public void test460() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test412");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isLeap();
		int i4 = year1.getYear();
		boolean b5 = year1.isLeap();
		boolean b6 = year1.isLeap();
		year1.setYear(33);
	}

	@Test
	public void test461() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test413");
		Year year1 = new Year((int) (short) 100);
		boolean b2 = year1.increment();
		Year year4 = new Year(1);
		boolean b5 = year4.isValid();
		int i6 = year4.getYear();
		year4.setYear(100);
		boolean b9 = year1.equals((java.lang.Object) year4);
		boolean b11 = year4.equals((java.lang.Object) (byte) -1);
		boolean b13 = year4.equals((java.lang.Object) 52);
		boolean b14 = year4.isValid();
		boolean b15 = year4.isLeap();
	}

	@Test
	public void test462() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test414");
		try {
			Date date3 = new Date(31, (int) (short) 0, 30);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test463() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test415");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		date3.printDate();
		java.lang.String str7 = date3.toString();
		Day day8 = date3.getDay();
		Date date9 = Nextday.nextDay(date3);
		Month month10 = date9.getMonth();
		boolean b11 = month10.increment();
	}

	@Test
	public void test464() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test420");
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
		boolean b19 = year14.isValid();
		boolean b20 = year14.increment();
	}

	@Test
	public void test465() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test421");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b5 = date3.equals((java.lang.Object) (-1));
		Year year7 = new Year(1);
		boolean b8 = year7.isValid();
		boolean b9 = year7.isLeap();
		int i10 = year7.getYear();
		boolean b11 = year7.isLeap();
		boolean b12 = year7.isLeap();
		boolean b13 = date3.equals((java.lang.Object) b12);
		Month month14 = date3.getMonth();
		Month month15 = date3.getMonth();
		int i16 = month15.getMonth();
		boolean b17 = month15.increment();
	}

	@Test
	public void test466() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test422");
		Year year1 = new Year(33);
		boolean b2 = year1.isLeap();
		int i3 = year1.getYear();
	}

	@Test
	public void test467() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test424");
		Month month1 = null;
		try {
			Day day2 = new Day((int) (byte) 0, month1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test468() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test428");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		java.lang.String str8 = date3.toString();
		date3.increment();
		Year year12 = new Year((int) (byte) 100);
		boolean b13 = year12.isValid();
		Month month14 = new Month((int) (short) 10, year12);
		int i15 = month14.getMonth();
		boolean b16 = month14.increment();
		boolean b17 = date3.equals((java.lang.Object) month14);
		Year year18 = date3.getYear();
	}

	@Test
	public void test469() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test429");
		Year year1 = null;
		try {
			Month month2 = new Month((int) '4', year1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test470() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test431");
		Year year1 = new Year((int) (byte) 100);
		java.lang.Object obj2 = new java.lang.Object();
		boolean b3 = year1.equals(obj2);
		Date date7 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year8 = date7.getYear();
		boolean b10 = date7.equals((java.lang.Object) "hi!");
		Month month11 = date7.getMonth();
		boolean b12 = year1.equals((java.lang.Object) date7);
		Date date13 = Nextday.nextDay(date7);
		java.lang.String str14 = date7.toString();
		java.lang.String str15 = date7.toString();
	}

	@Test
	public void test471() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test432");
		Year year1 = new Year(3);
		boolean b2 = year1.increment();
		year1.setYear(11);
		boolean b5 = year1.increment();
		int i6 = year1.getYear();
	}

	@Test
	public void test472() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test433");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		boolean b3 = year1.isLeap();
		java.lang.Object obj4 = new java.lang.Object();
		boolean b5 = year1.equals(obj4);
		boolean b6 = year1.increment();
		boolean b7 = year1.isValid();
		boolean b8 = year1.isValid();
	}

	@Test
	public void test473() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test434");
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
		int i17 = month12.getMonth();
		int i18 = month12.getMonth();
		boolean b19 = month12.isValid();
	}

	@Test
	public void test474() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test436");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		java.lang.String str8 = date4.toString();
		boolean b10 = date4.equals((java.lang.Object) (short) 100);
		Year year11 = date4.getYear();
		Month month12 = date4.getMonth();
		boolean b13 = month12.isValid();
		int i14 = month12.getMonthSize();
		try {
			Day day15 = new Day((int) '#', month12);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test475() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test437");
		Date date3 = new Date((int) (short) 1, 13, 11);
		Date date7 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year8 = date7.getYear();
		boolean b10 = date7.equals((java.lang.Object) "hi!");
		Day day11 = date7.getDay();
		Month month12 = date7.getMonth();
		Day day13 = date7.getDay();
		boolean b14 = day13.isValid();
		int i15 = day13.getDay();
		int i16 = day13.getDay();
		int i17 = day13.getDay();
		int i18 = day13.getDay();
		boolean b19 = date3.equals((java.lang.Object) i18);
		Date date20 = Nextday.nextDay(date3);
	}

	@Test
	public void test476() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test438");
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
		int i18 = month12.getMonthSize();
		Year year21 = new Year(1);
		boolean b22 = year21.isValid();
		boolean b23 = year21.isValid();
		year21.setYear((int) 'a');
		boolean b26 = year21.isLeap();
		month12.setMonth(5, year21);
		int i28 = month12.getMonthSize();
		boolean b29 = month12.increment();
	}

	@Test
	public void test477() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test441");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		int i6 = month5.getMonth();
		Day day7 = new Day(30, month5);
		boolean b8 = month5.increment();
		boolean b9 = month5.increment();
		boolean b10 = month5.isValid();
		boolean b11 = month5.increment();
		boolean b12 = month5.increment();
		boolean b13 = month5.isValid();
		boolean b14 = month5.increment();
	}

	@Test
	public void test478() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test442");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		boolean b6 = month5.increment();
		boolean b7 = month5.increment();
		boolean b8 = month5.increment();
		Year year10 = new Year(1);
		boolean b11 = year10.increment();
		int i12 = year10.getYear();
		boolean b13 = month5.equals((java.lang.Object) year10);
		int i14 = month5.getMonth();
		try {
			Day day15 = new Day(0, month5);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test479() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test446");
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
		Year year18 = new Year(1);
		boolean b19 = year18.isValid();
		boolean b20 = year18.isLeap();
		int i21 = year18.getYear();
		boolean b22 = year18.isLeap();
		boolean b23 = year18.isLeap();
		boolean b24 = year18.increment();
		boolean b25 = year10.equals((java.lang.Object) year18);
		int i26 = year10.getYear();
		year10.setYear(12);
	}

	@Test
	public void test480() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test447");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.printDate();
		Year year8 = date3.getYear();
		date3.increment();
		Date date10 = Nextday.nextDay(date3);
		date10.printDate();
		java.lang.String str12 = date10.toString();
		Date date13 = Nextday.nextDay(date10);
		Date date14 = Nextday.nextDay(date10);
		Day day15 = date14.getDay();
	}

	@Test
	public void test481() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test449");
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
		boolean b30 = year29.increment();
		boolean b31 = year29.increment();
		boolean b32 = year29.isValid();
		boolean b33 = year29.isLeap();
		boolean b34 = year29.isLeap();
		Month month35 = new Month((int) (byte) 1, year29);
	}

	@Test
	public void test482() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test450");
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
		int i17 = month12.getMonth();
		int i18 = month12.getMonthSize();
	}

	@Test
	public void test483() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test454");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		Day day9 = date3.getDay();
		boolean b10 = day9.isValid();
		Date date15 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date16 = Nextday.nextDay(date15);
		Year year20 = new Year(1);
		boolean b21 = year20.isValid();
		boolean b22 = year20.isLeap();
		int i23 = year20.getYear();
		boolean b24 = year20.isLeap();
		Month month25 = new Month((int) (byte) 1, year20);
		Day day26 = new Day(31, month25);
		boolean b27 = day26.isValid();
		Year year31 = new Year((int) (byte) 100);
		boolean b32 = year31.isValid();
		Month month33 = new Month((int) (short) 10, year31);
		boolean b35 = month33.equals((java.lang.Object) 10L);
		int i36 = month33.getMonth();
		boolean b37 = month33.isValid();
		day26.setDay((int) (short) 1, month33);
		boolean b39 = date16.equals((java.lang.Object) month33);
		boolean b40 = month33.isValid();
		boolean b41 = month33.isValid();
		int i42 = month33.getMonthSize();
		boolean b43 = month33.increment();
		try {
			day9.setDay((int) (byte) 100, month33);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test484() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test456");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		date3.printDate();
		Year year9 = date3.getYear();
		Year year10 = date3.getYear();
		Year year11 = date3.getYear();
		Year year12 = date3.getYear();
		java.lang.String str13 = date3.toString();
	}

	@Test
	public void test485() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test457");
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
		Year year22 = new Year((int) (byte) 100);
		boolean b23 = year22.isValid();
		Month month24 = new Month((int) (short) 10, year22);
		boolean b26 = month24.equals((java.lang.Object) 10L);
		int i27 = month24.getMonth();
		boolean b28 = month24.isValid();
		boolean b29 = month24.isValid();
		try {
			day7.setDay((int) '4', month24);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test486() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test462");
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
		boolean b16 = day15.increment();
		boolean b17 = day15.increment();
	}

	@Test
	public void test487() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test463");
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
		Year year17 = new Year(1);
		boolean b18 = year17.isLeap();
		int i19 = year17.getYear();
		year17.setYear(100);
		year17.setYear((-1));
		boolean b24 = date3.equals((java.lang.Object) year17);
		date3.printDate();
	}

	@Test
	public void test488() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test467");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Year year10 = date3.getYear();
		boolean b11 = year10.isValid();
	}

	@Test
	public void test489() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test468");
		Year year1 = new Year(5);
		int i2 = year1.getYear();
	}

	@Test
	public void test490() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test470");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		Date date6 = Nextday.nextDay(date3);
		Year year7 = date3.getYear();
		Month month8 = date3.getMonth();
		Day day9 = date3.getDay();
		int i10 = day9.getDay();
	}

	@Test
	public void test491() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test473");
		Year year2 = new Year((int) (byte) 100);
		Month month3 = new Month((int) (short) 1, year2);
		boolean b4 = month3.isValid();
		int i5 = month3.getMonthSize();
		boolean b6 = month3.increment();
		boolean b7 = month3.increment();
		boolean b8 = month3.increment();
		int i9 = month3.getMonthSize();
		boolean b10 = month3.increment();
	}

	@Test
	public void test492() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test474");
		try {
			Date date3 = new Date(97, 0, 0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test493() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test476");
		Year year2 = new Year(31);
		Date date6 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year7 = date6.getYear();
		boolean b9 = date6.equals((java.lang.Object) "hi!");
		java.lang.String str10 = date6.toString();
		boolean b12 = date6.equals((java.lang.Object) (short) 100);
		Year year13 = date6.getYear();
		Year year15 = new Year(1);
		boolean b16 = year15.isLeap();
		int i17 = year15.getYear();
		boolean b19 = year15.equals((java.lang.Object) 1);
		year15.setYear(32);
		boolean b22 = date6.equals((java.lang.Object) 32);
		boolean b23 = year2.equals((java.lang.Object) b22);
		Month month24 = new Month((int) (short) 1, year2);
	}

	@Test
	public void test494() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test477");
		Date date3 = new Date(10, 5, 29);
	}

	@Test
	public void test495() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test478");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		date3.increment();
		Month month9 = date3.getMonth();
		int i10 = month9.getMonthSize();
		boolean b11 = month9.increment();
	}

	@Test
	public void test496() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test479");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		Month month8 = date4.getMonth();
		date4.printDate();
		date4.printDate();
		Year year11 = date4.getYear();
		try {
			Month month12 = new Month(0, year11);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test497() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test480");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date4.printDate();
		Year year6 = date4.getYear();
		Day day7 = date4.getDay();
		Day day8 = date4.getDay();
		date4.increment();
		Year year10 = date4.getYear();
		Month month11 = date4.getMonth();
		Day day12 = new Day(1, month11);
		boolean b13 = month11.isValid();
	}

	@Test
	public void test498() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test482");
		Month month1 = null;
		try {
			Day day2 = new Day(97, month1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test499() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test488");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		date3.increment();
		Month month6 = date3.getMonth();
	}

	@Test
	public void test500() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test489");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		int i5 = month4.getMonth();
		Year year8 = new Year((int) (short) 1);
		boolean b9 = year8.isLeap();
		month4.setMonth((int) (short) 10, year8);
		int i11 = month4.getMonth();
		int i12 = month4.getMonth();
		boolean b13 = month4.increment();
		int i14 = month4.getMonthSize();
		int i15 = month4.getMonth();
	}

	@Test
	public void test501() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test490");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		boolean b4 = year2.isLeap();
		boolean b5 = year2.increment();
		Month month6 = new Month((int) (short) 1, year2);
		Date date10 = new Date(10, (int) (byte) 10, (int) (short) 1);
		java.lang.String str11 = date10.toString();
		boolean b12 = month6.equals((java.lang.Object) date10);
		Date date13 = Nextday.nextDay(date10);
		Day day14 = date13.getDay();
		Date date20 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year21 = date20.getYear();
		boolean b23 = date20.equals((java.lang.Object) "hi!");
		date20.increment();
		Date date25 = Nextday.nextDay(date20);
		date20.printDate();
		Day day27 = date20.getDay();
		Month month28 = date20.getMonth();
		Year year31 = new Year(2);
		month28.setMonth(2, year31);
		Day day33 = new Day(12, month28);
		try {
			day14.setDay(0, month28);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test502() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test491");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		Day day9 = date3.getDay();
		boolean b10 = day9.isValid();
		int i11 = day9.getDay();
		int i12 = day9.getDay();
		Year year14 = new Year((int) (byte) 100);
		int i15 = year14.getYear();
		int i16 = year14.getYear();
		boolean b17 = year14.isValid();
		int i18 = year14.getYear();
		boolean b19 = day9.equals((java.lang.Object) year14);
		int i20 = day9.getDay();
		int i21 = day9.getDay();
		boolean b22 = day9.increment();
	}

	@Test
	public void test503() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test492");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		date3.printDate();
		Day day11 = date3.getDay();
		Month month12 = date3.getMonth();
		int i13 = month12.getMonthSize();
		boolean b14 = month12.increment();
	}

	@Test
	public void test504() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test494");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		boolean b4 = year2.isLeap();
		boolean b5 = year2.increment();
		Month month6 = new Month((int) (short) 1, year2);
		boolean b7 = year2.increment();
		boolean b8 = year2.increment();
	}

	@Test
	public void test505() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test496");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		Date date6 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year7 = date6.getYear();
		boolean b9 = date6.equals((java.lang.Object) "hi!");
		boolean b10 = year1.equals((java.lang.Object) date6);
		year1.setYear((int) 'a');
		year1.setYear(1);
		boolean b15 = year1.increment();
	}

	@Test
	public void test506() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test497");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Year year10 = date3.getYear();
		Date date11 = Nextday.nextDay(date3);
		date3.increment();
		date3.increment();
		date3.printDate();
		date3.printDate();
		java.lang.String str16 = date3.toString();
		Month month17 = date3.getMonth();
		date3.printDate();
		Month month19 = date3.getMonth();
	}

	@Test
	public void test507() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest4.test500");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		date4.printDate();
		java.lang.String str6 = date4.toString();
		date4.increment();
		Day day8 = date4.getDay();
		boolean b9 = day8.increment();
	}

	@Test
	public void test508() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test001");
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
		Month month15 = date3.getMonth();
	}

	@Test
	public void test509() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test002");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		boolean b3 = year1.isLeap();
		boolean b4 = year1.increment();
		java.lang.Object obj5 = null;
		boolean b6 = year1.equals(obj5);
		int i7 = year1.getYear();
		boolean b8 = year1.isLeap();
		int i9 = year1.getYear();
		boolean b10 = year1.increment();
		int i11 = year1.getYear();
		year1.setYear((int) (byte) 10);
	}

	@Test
	public void test510() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test003");
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
		int i18 = month12.getMonthSize();
		Year year21 = new Year(1);
		boolean b22 = year21.isValid();
		boolean b23 = year21.isValid();
		year21.setYear((int) 'a');
		boolean b26 = year21.isLeap();
		month12.setMonth(5, year21);
		int i28 = month12.getMonthSize();
		int i29 = month12.getMonth();
	}

	@Test
	public void test511() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test004");
		Year year2 = new Year((int) (byte) 100);
		Month month3 = new Month((int) (short) 1, year2);
		Date date7 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date8 = Nextday.nextDay(date7);
		date7.increment();
		date7.increment();
		java.lang.String str11 = date7.toString();
		boolean b12 = month3.equals((java.lang.Object) date7);
		Day day13 = date7.getDay();
		Year year14 = date7.getYear();
	}

	@Test
	public void test512() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test005");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		java.lang.String str8 = date3.toString();
		date3.printDate();
		Month month10 = date3.getMonth();
		Month month11 = date3.getMonth();
		date3.printDate();
	}

	@Test
	public void test513() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test006");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Day day8 = date3.getDay();
		Year year9 = date3.getYear();
		year9.setYear(32);
		boolean b12 = year9.isLeap();
	}

	@Test
	public void test514() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test007");
		try {
			Date date3 = new Date(34, 100, (int) ' ');
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test515() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test008");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		date3.printDate();
		Year year6 = date3.getYear();
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		int i9 = month8.getMonth();
		boolean b10 = month8.increment();
		int i11 = month8.getMonthSize();
		boolean b12 = month8.isValid();
	}

	@Test
	public void test516() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test013");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b5 = month4.increment();
		boolean b6 = month4.increment();
		boolean b7 = month4.isValid();
		boolean b8 = month4.increment();
		boolean b9 = month4.increment();
		Date date13 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year14 = date13.getYear();
		boolean b16 = date13.equals((java.lang.Object) "hi!");
		Month month17 = date13.getMonth();
		date13.printDate();
		java.lang.String str19 = date13.toString();
		date13.printDate();
		boolean b21 = month4.equals((java.lang.Object) date13);
		Month month22 = date13.getMonth();
		Month month23 = date13.getMonth();
	}

	@Test
	public void test517() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test014");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		date3.printDate();
		Month month6 = date3.getMonth();
		int i7 = month6.getMonth();
		int i8 = month6.getMonth();
		int i9 = month6.getMonthSize();
	}

	@Test
	public void test518() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test015");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b6 = date4.equals((java.lang.Object) (-1));
		Year year8 = new Year(1);
		boolean b9 = year8.isValid();
		boolean b10 = year8.isLeap();
		int i11 = year8.getYear();
		boolean b12 = year8.isLeap();
		boolean b13 = year8.isLeap();
		boolean b14 = date4.equals((java.lang.Object) b13);
		java.lang.String str15 = date4.toString();
		Month month16 = date4.getMonth();
		Month month17 = date4.getMonth();
		Year year18 = date4.getYear();
		int i19 = year18.getYear();
		Month month20 = new Month((int) (short) 1, year18);
		boolean b21 = year18.isValid();
	}

	@Test
	public void test519() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test016");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.printDate();
		Year year8 = date3.getYear();
		date3.increment();
		Date date10 = Nextday.nextDay(date3);
		date10.printDate();
		Day day12 = date10.getDay();
		Month month13 = date10.getMonth();
		date10.increment();
	}

	@Test
	public void test520() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test017");
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
		Year year27 = date3.getYear();
		try {
			year27.setYear(0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test521() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test018");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		date3.printDate();
		java.lang.String str9 = date3.toString();
		Month month10 = date3.getMonth();
		Date date11 = Nextday.nextDay(date3);
	}

	@Test
	public void test522() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test019");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Day day8 = date3.getDay();
		int i9 = day8.getDay();
		boolean b10 = day8.isValid();
	}

	@Test
	public void test523() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test022");
		try {
			Date date3 = new Date(34, 2, (int) (short) 1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test524() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test025");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Day day8 = date3.getDay();
		boolean b9 = day8.increment();
		int i10 = day8.getDay();
		java.lang.Object obj11 = null;
		boolean b12 = day8.equals(obj11);
	}

	@Test
	public void test525() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test027");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		Date date6 = Nextday.nextDay(date3);
		Date date7 = Nextday.nextDay(date3);
		date7.printDate();
		Month month9 = date7.getMonth();
		boolean b10 = month9.increment();
		int i11 = month9.getMonth();
		int i12 = month9.getMonthSize();
	}

	@Test
	public void test526() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test028");
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
		date13.increment();
		Day day16 = date13.getDay();
		java.lang.Object obj17 = null;
		boolean b18 = day16.equals(obj17);
		boolean b19 = day16.isValid();
		boolean b20 = day16.isValid();
	}

	@Test
	public void test527() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test030");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isLeap();
		int i4 = year1.getYear();
		boolean b5 = year1.isLeap();
		boolean b6 = year1.isValid();
		year1.setYear((int) '4');
		int i9 = year1.getYear();
	}

	@Test
	public void test528() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test031");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		date3.printDate();
	}

	@Test
	public void test529() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test032");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Year year11 = new Year((int) (byte) 100);
		boolean b12 = year11.isValid();
		Month month13 = new Month((int) (short) 10, year11);
		day7.setDay((int) (short) 10, month13);
		Year year17 = new Year(52);
		Month month18 = new Month((int) (short) 10, year17);
		year17.setYear(102);
		boolean b21 = day7.equals((java.lang.Object) year17);
		boolean b22 = year17.isLeap();
	}

	@Test
	public void test530() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test033");
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
		Date date20 = Nextday.nextDay(date3);
		Date date21 = Nextday.nextDay(date20);
	}

	@Test
	public void test531() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test034");
		Year year1 = new Year(1);
		boolean b2 = year1.increment();
		int i3 = year1.getYear();
		boolean b4 = year1.increment();
		year1.setYear(12);
		year1.setYear(10);
		Date date12 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year13 = date12.getYear();
		boolean b14 = year13.isValid();
		int i15 = year13.getYear();
		boolean b16 = year1.equals((java.lang.Object) year13);
		boolean b17 = year13.increment();
	}

	@Test
	public void test532() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test035");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		Day day9 = date3.getDay();
		boolean b10 = day9.isValid();
		int i11 = day9.getDay();
		int i12 = day9.getDay();
		boolean b13 = day9.increment();
		boolean b14 = day9.isValid();
		boolean b15 = day9.isValid();
	}

	@Test
	public void test533() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test036");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		java.lang.String str8 = date4.toString();
		boolean b10 = date4.equals((java.lang.Object) (short) 100);
		Date date11 = Nextday.nextDay(date4);
		date11.increment();
		Month month13 = date11.getMonth();
		java.lang.String str14 = date11.toString();
		Month month15 = date11.getMonth();
		Day day16 = new Day(2, month15);
		int i17 = day16.getDay();
		int i18 = day16.getDay();
	}

	@Test
	public void test534() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test038");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		Date date6 = Nextday.nextDay(date3);
		Day day7 = date6.getDay();
		int i8 = day7.getDay();
		boolean b9 = day7.isValid();
		boolean b10 = day7.increment();
		boolean b11 = day7.isValid();
		boolean b12 = day7.isValid();
	}

	@Test
	public void test535() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test041");
		Year year1 = new Year((int) (short) 1);
		boolean b2 = year1.isLeap();
		year1.setYear(31);
		boolean b5 = year1.increment();
		year1.setYear((int) '4');
		int i8 = year1.getYear();
		boolean b9 = year1.increment();
	}

	@Test
	public void test536() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test045");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isValid();
		boolean b4 = year1.isLeap();
		boolean b5 = year1.isLeap();
		int i6 = year1.getYear();
		boolean b7 = year1.increment();
		int i8 = year1.getYear();
		year1.setYear(102);
		int i11 = year1.getYear();
	}

	@Test
	public void test537() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test046");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		date3.printDate();
		java.lang.String str10 = date3.toString();
		Date date11 = Nextday.nextDay(date3);
		java.lang.String str12 = date3.toString();
		java.lang.String str13 = date3.toString();
		Day day14 = date3.getDay();
		date3.increment();
		Date date16 = Nextday.nextDay(date3);
	}

	@Test
	public void test538() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test050");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isLeap();
		int i6 = year3.getYear();
		boolean b7 = year3.isLeap();
		Month month8 = new Month((int) (byte) 1, year3);
		Day day9 = new Day(10, month8);
		int i10 = month8.getMonthSize();
		int i11 = month8.getMonthSize();
		int i12 = month8.getMonthSize();
	}

	@Test
	public void test539() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test051");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		int i6 = month5.getMonth();
		Day day7 = new Day(1, month5);
		int i8 = month5.getMonth();
	}

	@Test
	public void test540() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test054");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		Day day5 = date4.getDay();
		Year year6 = date4.getYear();
		date4.printDate();
		Date date8 = Nextday.nextDay(date4);
		date4.printDate();
	}

	@Test
	public void test541() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test055");
		Year year2 = new Year(52);
		Month month3 = new Month((int) (short) 10, year2);
		year2.setYear(101);
		int i6 = year2.getYear();
	}

	@Test
	public void test542() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test056");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Date date10 = Nextday.nextDay(date3);
		Month month11 = date10.getMonth();
	}

	@Test
	public void test543() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test058");
		Year year1 = new Year((int) (byte) 1);
		year1.setYear((int) (short) 10);
		Year year5 = new Year((int) (byte) 100);
		int i6 = year5.getYear();
		boolean b7 = year5.increment();
		boolean b8 = year1.equals((java.lang.Object) b7);
		boolean b9 = year1.increment();
		boolean b10 = year1.isValid();
	}

	@Test
	public void test544() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test059");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Day day8 = date3.getDay();
		Month month9 = date3.getMonth();
		Year year10 = date3.getYear();
		Date date11 = Nextday.nextDay(date3);
	}

	@Test
	public void test545() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test060");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isValid();
		year2.setYear((int) 'a');
		boolean b7 = year2.isLeap();
		try {
			Month month8 = new Month(32, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test546() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test061");
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
		Day day28 = date3.getDay();
		java.lang.String str29 = date3.toString();
	}

	@Test
	public void test547() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test063");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		date3.printDate();
		java.lang.String str7 = date3.toString();
		Date date8 = Nextday.nextDay(date3);
		Month month9 = date3.getMonth();
		Year year12 = new Year(1);
		boolean b13 = year12.isLeap();
		boolean b14 = year12.isLeap();
		boolean b15 = year12.increment();
		java.lang.Object obj16 = null;
		boolean b17 = year12.equals(obj16);
		int i18 = year12.getYear();
		int i19 = year12.getYear();
		boolean b20 = year12.increment();
		month9.setMonth(11, year12);
		Date date27 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b29 = date27.equals((java.lang.Object) (-1));
		Year year31 = new Year(1);
		boolean b32 = year31.isValid();
		boolean b33 = year31.isLeap();
		int i34 = year31.getYear();
		boolean b35 = year31.isLeap();
		boolean b36 = year31.isLeap();
		boolean b37 = date27.equals((java.lang.Object) b36);
		Date date38 = Nextday.nextDay(date27);
		Year year40 = new Year(1);
		boolean b41 = year40.isLeap();
		boolean b42 = year40.isLeap();
		boolean b43 = date27.equals((java.lang.Object) year40);
		Month month44 = new Month((int) (byte) 10, year40);
		boolean b45 = year40.isValid();
		try {
			month9.setMonth((int) (byte) 0, year40);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test548() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test066");
		try {
			Date date3 = new Date(53, (int) (short) 0, 102);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test549() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test067");
		Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date6 = Nextday.nextDay(date5);
		Year year9 = new Year((int) (byte) 100);
		boolean b10 = year9.isValid();
		Month month11 = new Month((int) (short) 10, year9);
		boolean b12 = month11.increment();
		int i13 = month11.getMonthSize();
		boolean b14 = month11.isValid();
		boolean b15 = date6.equals((java.lang.Object) month11);
		int i16 = month11.getMonthSize();
		int i17 = month11.getMonth();
		Date date22 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year23 = date22.getYear();
		boolean b25 = date22.equals((java.lang.Object) "hi!");
		date22.printDate();
		Year year27 = date22.getYear();
		date22.increment();
		Date date29 = Nextday.nextDay(date22);
		Year year30 = date22.getYear();
		Year year32 = new Year(1);
		boolean b33 = year32.increment();
		int i34 = year32.getYear();
		year32.setYear((int) (short) -1);
		boolean b37 = year30.equals((java.lang.Object) (short) -1);
		year30.setYear(3);
		month11.setMonth((int) (short) 1, year30);
		Day day41 = new Day(11, month11);
		Day day42 = new Day(14, month11);
		Year year45 = new Year(1);
		boolean b46 = year45.isLeap();
		boolean b47 = year45.isLeap();
		boolean b48 = year45.increment();
		java.lang.Object obj49 = null;
		boolean b50 = year45.equals(obj49);
		boolean b51 = year45.isLeap();
		boolean b52 = year45.isValid();
		year45.setYear(5);
		boolean b55 = year45.isValid();
		month11.setMonth(5, year45);
	}

	@Test
	public void test550() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test068");
		Year year1 = new Year((int) 'a');
		year1.setYear((int) (byte) 100);
	}

	@Test
	public void test551() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test069");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		Month month8 = date4.getMonth();
		int i9 = month8.getMonthSize();
		int i10 = month8.getMonthSize();
		Day day11 = new Day(11, month8);
		boolean b12 = month8.isValid();
	}

	@Test
	public void test552() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test070");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.printDate();
		Year year8 = date3.getYear();
		java.lang.String str9 = date3.toString();
		java.lang.String str10 = date3.toString();
	}

	@Test
	public void test553() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test071");
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
		year1.setYear(100);
		year1.setYear(13);
		year1.setYear(31);
	}

	@Test
	public void test554() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test073");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		date3.increment();
		date3.increment();
		java.lang.String str7 = date3.toString();
		Day day8 = date3.getDay();
		java.lang.String str9 = date3.toString();
		Date date10 = Nextday.nextDay(date3);
		Year year11 = date3.getYear();
	}

	@Test
	public void test555() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test075");
		Year year2 = new Year(11);
		boolean b3 = year2.increment();
		Month month4 = new Month(3, year2);
		int i5 = month4.getMonth();
		Year year9 = new Year((int) (byte) 100);
		boolean b10 = year9.isValid();
		Month month11 = new Month((int) (short) 10, year9);
		boolean b12 = month11.increment();
		boolean b13 = month11.isValid();
		boolean b15 = month11.equals((java.lang.Object) 1);
		int i16 = month11.getMonthSize();
		Day day17 = new Day(4, month11);
		boolean b18 = month4.equals((java.lang.Object) 4);
	}

	@Test
	public void test556() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test076");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		date3.increment();
		Month month9 = date3.getMonth();
		boolean b10 = month9.isValid();
		int i11 = month9.getMonthSize();
		Year year15 = new Year((int) (byte) 100);
		boolean b16 = year15.isValid();
		Month month17 = new Month((int) (short) 10, year15);
		boolean b18 = year15.increment();
		boolean b20 = year15.equals((java.lang.Object) (-1.0f));
		Year year22 = new Year(10);
		boolean b23 = year15.equals((java.lang.Object) year22);
		try {
			month9.setMonth((int) (short) 100, year15);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test557() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test079");
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
		Day day16 = new Day(5, month13);
		boolean b17 = month13.isValid();
	}

	@Test
	public void test558() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test080");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Date date8 = Nextday.nextDay(date3);
		Day day9 = date3.getDay();
		int i10 = day9.getDay();
	}

	@Test
	public void test559() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test081");
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
		Year year14 = date9.getYear();
		Year year16 = new Year(1);
		boolean b17 = year16.increment();
		int i18 = year16.getYear();
		boolean b19 = year16.increment();
		boolean b20 = year14.equals((java.lang.Object) year16);
	}

	@Test
	public void test560() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test083");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		Month month8 = date4.getMonth();
		date4.printDate();
		java.lang.String str10 = date4.toString();
		Month month11 = date4.getMonth();
		Year year12 = date4.getYear();
		Month month13 = new Month(3, year12);
	}

	@Test
	public void test561() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test084");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		Month month10 = date9.getMonth();
		date9.printDate();
		Day day12 = date9.getDay();
		Day day13 = date9.getDay();
		Year year14 = date9.getYear();
	}

	@Test
	public void test562() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test085");
		try {
			Date date3 = new Date((int) '4', 1, (int) '#');
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test563() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test088");
		Year year2 = new Year((int) (byte) 100);
		Month month3 = new Month((int) (short) 1, year2);
		Date date7 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date8 = Nextday.nextDay(date7);
		date7.increment();
		date7.increment();
		java.lang.String str11 = date7.toString();
		boolean b12 = month3.equals((java.lang.Object) date7);
		int i13 = month3.getMonth();
		int i14 = month3.getMonthSize();
	}

	@Test
	public void test564() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test090");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		boolean b3 = year1.isLeap();
		java.lang.Object obj4 = new java.lang.Object();
		boolean b5 = year1.equals(obj4);
		boolean b6 = year1.increment();
		boolean b7 = year1.isValid();
		year1.setYear(52);
		boolean b10 = year1.isLeap();
	}

	@Test
	public void test565() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test095");
		Year year2 = new Year((int) (byte) 100);
		int i3 = year2.getYear();
		Year year6 = new Year(1);
		boolean b7 = year6.isValid();
		boolean b8 = year6.isLeap();
		int i9 = year6.getYear();
		boolean b10 = year6.isLeap();
		Month month11 = new Month((int) (byte) 1, year6);
		int i12 = month11.getMonthSize();
		boolean b13 = year2.equals((java.lang.Object) month11);
		year2.setYear(100);
		boolean b16 = year2.increment();
		Year year18 = new Year((int) (byte) 100);
		Date date22 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b23 = year18.equals((java.lang.Object) 10);
		int i24 = year18.getYear();
		boolean b25 = year2.equals((java.lang.Object) i24);
		try {
			Month month26 = new Month(14, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test566() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test097");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		boolean b4 = year2.isLeap();
		java.lang.Object obj5 = new java.lang.Object();
		boolean b6 = year2.equals(obj5);
		boolean b7 = year2.isValid();
		Month month8 = new Month((int) (byte) 10, year2);
		boolean b9 = year2.increment();
	}

	@Test
	public void test567() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test098");
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
		boolean b18 = year1.increment();
	}

	@Test
	public void test568() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test099");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		date3.increment();
		date3.increment();
		java.lang.String str7 = date3.toString();
		Day day8 = date3.getDay();
		java.lang.String str9 = date3.toString();
		date3.increment();
	}

	@Test
	public void test569() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test100");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		int i4 = year2.getYear();
		boolean b6 = year2.equals((java.lang.Object) 1);
		boolean b7 = year2.isValid();
		Month month8 = new Month(1, year2);
		boolean b9 = year2.isValid();
		boolean b10 = year2.isLeap();
	}

	@Test
	public void test570() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test103");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		date3.printDate();
		Year year6 = date3.getYear();
		Day day7 = date3.getDay();
		int i8 = day7.getDay();
		boolean b9 = day7.increment();
	}

	@Test
	public void test571() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test104");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b6 = year2.equals((java.lang.Object) (short) -1);
		year2.setYear(101);
		boolean b9 = year2.isValid();
		boolean b10 = year2.isLeap();
	}

	@Test
	public void test572() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test105");
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
		Date date37 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year38 = date37.getYear();
		boolean b40 = date37.equals((java.lang.Object) "hi!");
		date37.increment();
		java.lang.String str42 = date37.toString();
		date37.printDate();
		Year year44 = date37.getYear();
		Date date45 = Nextday.nextDay(date37);
		Month month46 = date45.getMonth();
		try {
			day17.setDay(34, month46);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test573() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test107");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b6 = date4.equals((java.lang.Object) (-1));
		Year year7 = date4.getYear();
		Month month8 = new Month(3, year7);
		Year year11 = new Year(3);
		month8.setMonth(11, year11);
		int i13 = month8.getMonth();
		Year year16 = new Year(1);
		boolean b17 = year16.isValid();
		boolean b18 = year16.increment();
		boolean b19 = year16.increment();
		boolean b20 = year16.increment();
		boolean b21 = year16.isValid();
		boolean b22 = year16.isLeap();
		boolean b23 = year16.increment();
		try {
			month8.setMonth(32, year16);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test574() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test109");
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
		Year year22 = new Year((int) (short) 1);
		boolean b23 = year22.isLeap();
		year22.setYear(31);
		boolean b26 = year22.increment();
		year22.setYear((int) (short) 10);
		boolean b29 = year22.isValid();
		boolean b30 = year1.equals((java.lang.Object) year22);
		int i31 = year22.getYear();
		boolean b32 = year22.isValid();
	}

	@Test
	public void test575() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test110");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		java.lang.String str8 = date4.toString();
		Year year9 = date4.getYear();
		Date date10 = Nextday.nextDay(date4);
		Month month11 = date10.getMonth();
		boolean b12 = month11.isValid();
		int i13 = month11.getMonth();
		int i14 = month11.getMonthSize();
		boolean b15 = month11.increment();
		int i16 = month11.getMonthSize();
		int i17 = month11.getMonthSize();
		try {
			Day day18 = new Day((int) ' ', month11);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test576() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test112");
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
		boolean b19 = day16.isValid();
		int i20 = day16.getDay();
		Date date25 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year26 = date25.getYear();
		boolean b28 = date25.equals((java.lang.Object) "hi!");
		Month month29 = date25.getMonth();
		boolean b30 = month29.increment();
		boolean b31 = month29.increment();
		Date date35 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date36 = Nextday.nextDay(date35);
		Year year39 = new Year((int) (byte) 100);
		boolean b40 = year39.isValid();
		Month month41 = new Month((int) (short) 10, year39);
		boolean b42 = month41.increment();
		int i43 = month41.getMonthSize();
		boolean b44 = month41.isValid();
		boolean b45 = date36.equals((java.lang.Object) month41);
		int i46 = month41.getMonthSize();
		int i47 = month41.getMonth();
		boolean b48 = month29.equals((java.lang.Object) month41);
		boolean b49 = month41.isValid();
		Year year51 = new Year(1);
		boolean b52 = year51.isValid();
		boolean b53 = year51.increment();
		boolean b54 = year51.increment();
		boolean b55 = year51.isLeap();
		int i56 = year51.getYear();
		boolean b57 = year51.isValid();
		boolean b58 = year51.isValid();
		boolean b59 = month41.equals((java.lang.Object) year51);
		try {
			day16.setDay(102, month41);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test577() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test116");
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
		int i19 = month8.getMonth();
		int i20 = month8.getMonth();
		boolean b21 = month8.increment();
		int i22 = month8.getMonthSize();
	}

	@Test
	public void test578() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test117");
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
		Day day28 = date4.getDay();
		Date date29 = Nextday.nextDay(date4);
	}

	@Test
	public void test579() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test119");
		Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year6 = date5.getYear();
		boolean b8 = date5.equals((java.lang.Object) "hi!");
		Month month9 = date5.getMonth();
		Month month10 = date5.getMonth();
		Day day11 = new Day((int) (byte) 10, month10);
		Day day12 = new Day(10, month10);
	}

	@Test
	public void test580() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test120");
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
		Year year18 = new Year(1);
		boolean b19 = year18.isValid();
		boolean b20 = year18.isLeap();
		int i21 = year18.getYear();
		boolean b22 = year18.isLeap();
		boolean b23 = year18.isLeap();
		boolean b24 = year18.increment();
		boolean b25 = year10.equals((java.lang.Object) year18);
		int i26 = year10.getYear();
		boolean b27 = year10.increment();
	}

	@Test
	public void test581() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test121");
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
		boolean b24 = year23.increment();
	}

	@Test
	public void test582() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test123");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		date3.printDate();
		Day day10 = date3.getDay();
		boolean b11 = day10.increment();
		int i12 = day10.getDay();
		boolean b13 = day10.increment();
		Year year15 = new Year(1);
		boolean b16 = year15.isValid();
		int i17 = year15.getYear();
		year15.setYear(100);
		year15.setYear((int) ' ');
		boolean b22 = year15.isLeap();
		boolean b23 = day10.equals((java.lang.Object) b22);
	}

	@Test
	public void test583() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test126");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		boolean b6 = month5.increment();
		boolean b7 = month5.increment();
		int i8 = month5.getMonthSize();
		Day day9 = new Day(28, month5);
	}

	@Test
	public void test584() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test127");
		Year year2 = new Year(101);
		boolean b3 = year2.isValid();
		Date date7 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year8 = date7.getYear();
		boolean b10 = date7.equals((java.lang.Object) "hi!");
		java.lang.String str11 = date7.toString();
		boolean b13 = date7.equals((java.lang.Object) (short) 100);
		Year year14 = date7.getYear();
		Date date15 = Nextday.nextDay(date7);
		date15.increment();
		date15.printDate();
		boolean b18 = year2.equals((java.lang.Object) date15);
		Month month19 = new Month(12, year2);
	}

	@Test
	public void test585() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test129");
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
		date4.increment();
		date4.increment();
		Date date30 = Nextday.nextDay(date4);
	}

	@Test
	public void test586() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test131");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		Month month8 = date4.getMonth();
		Month month9 = date4.getMonth();
		Day day10 = new Day((int) (byte) 10, month9);
		Year year14 = new Year((int) (byte) 100);
		boolean b15 = year14.isValid();
		Month month16 = new Month((int) (short) 10, year14);
		boolean b17 = year14.increment();
		try {
			month9.setMonth((int) (short) 0, year14);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test587() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test133");
		Date date3 = new Date(11, (int) (short) 10, (int) ' ');
		java.lang.String str4 = date3.toString();
	}

	@Test
	public void test588() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test136");
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
		Year year15 = new Year(1);
		boolean b16 = year15.isLeap();
		boolean b17 = year15.isLeap();
		boolean b18 = year15.increment();
		boolean b19 = year15.isLeap();
		boolean b20 = year15.isValid();
		boolean b21 = year15.isLeap();
		Month month22 = new Month(5, year15);
		int i23 = year15.getYear();
		try {
			month7.setMonth(31, year15);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test589() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test137");
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
		Date date21 = Nextday.nextDay(date3);
	}

	@Test
	public void test590() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test138");
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
		boolean b17 = month16.increment();
		boolean b18 = month16.isValid();
		Year year23 = new Year(1);
		boolean b24 = year23.isValid();
		boolean b25 = year23.isValid();
		boolean b26 = year23.isValid();
		boolean b27 = year23.isValid();
		Month month28 = new Month(12, year23);
		Month month29 = new Month(11, year23);
		int i30 = year23.getYear();
		try {
			month16.setMonth(30, year23);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test591() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test142");
		Year year1 = new Year((int) (short) 100);
		boolean b2 = year1.isValid();
		int i3 = year1.getYear();
		boolean b4 = year1.isLeap();
		boolean b5 = year1.isLeap();
		boolean b6 = year1.increment();
		Date date10 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year11 = date10.getYear();
		boolean b13 = date10.equals((java.lang.Object) "hi!");
		java.lang.String str14 = date10.toString();
		boolean b16 = date10.equals((java.lang.Object) (short) 100);
		Date date17 = Nextday.nextDay(date10);
		date17.increment();
		date17.printDate();
		Date date20 = Nextday.nextDay(date17);
		Month month21 = date20.getMonth();
		boolean b22 = year1.equals((java.lang.Object) date20);
		java.lang.Object obj23 = null;
		boolean b24 = date20.equals(obj23);
	}

	@Test
	public void test592() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test145");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		date3.printDate();
		java.lang.String str7 = date3.toString();
		Date date8 = Nextday.nextDay(date3);
		Month month9 = date3.getMonth();
		int i10 = month9.getMonth();
	}

	@Test
	public void test593() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test146");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b5 = month4.increment();
		boolean b6 = month4.increment();
		boolean b7 = month4.isValid();
		boolean b8 = month4.increment();
		boolean b9 = month4.increment();
		Date date13 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year14 = date13.getYear();
		boolean b16 = date13.equals((java.lang.Object) "hi!");
		Month month17 = date13.getMonth();
		date13.printDate();
		java.lang.String str19 = date13.toString();
		date13.printDate();
		boolean b21 = month4.equals((java.lang.Object) date13);
		java.lang.String str22 = date13.toString();
	}

	@Test
	public void test594() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test147");
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
		int i20 = day7.getDay();
		boolean b21 = day7.increment();
		boolean b22 = day7.isValid();
		int i23 = day7.getDay();
		int i24 = day7.getDay();
		int i25 = day7.getDay();
		int i26 = day7.getDay();
	}

	@Test
	public void test595() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test151");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		boolean b8 = day7.increment();
	}

	@Test
	public void test596() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test153");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		boolean b6 = month5.increment();
		int i7 = month5.getMonth();
		int i8 = month5.getMonth();
		Day day9 = new Day((int) (byte) 1, month5);
		boolean b10 = day9.increment();
		Date date14 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year15 = date14.getYear();
		boolean b17 = date14.equals((java.lang.Object) "hi!");
		Day day18 = date14.getDay();
		Month month19 = date14.getMonth();
		date14.printDate();
		Day day21 = date14.getDay();
		int i22 = day21.getDay();
		boolean b23 = day9.equals((java.lang.Object) day21);
	}

	@Test
	public void test597() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test155");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		boolean b6 = month5.increment();
		boolean b7 = month5.isValid();
		boolean b9 = month5.equals((java.lang.Object) 1);
		int i10 = month5.getMonthSize();
		Day day11 = new Day(4, month5);
		Year year15 = new Year(1);
		boolean b16 = year15.isValid();
		boolean b17 = year15.isValid();
		boolean b18 = year15.isValid();
		boolean b19 = year15.isValid();
		int i20 = year15.getYear();
		Month month21 = new Month((int) (short) 10, year15);
		int i22 = month21.getMonth();
		day11.setDay(30, month21);
		boolean b24 = day11.increment();
	}

	@Test
	public void test598() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test157");
		Year year1 = new Year((int) (byte) 100);
		Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b6 = year1.equals((java.lang.Object) 10);
		boolean b7 = year1.isLeap();
		boolean b8 = year1.isLeap();
		boolean b9 = year1.increment();
		boolean b10 = year1.isLeap();
	}

	@Test
	public void test599() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test158");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isValid();
		boolean b4 = year1.isLeap();
		boolean b5 = year1.isLeap();
		int i6 = year1.getYear();
		boolean b7 = year1.increment();
		boolean b8 = year1.increment();
		boolean b9 = year1.isValid();
		boolean b10 = year1.isLeap();
		boolean b11 = year1.increment();
	}

	@Test
	public void test600() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test159");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Date date10 = Nextday.nextDay(date3);
		date10.increment();
		Month month12 = date10.getMonth();
		Date date13 = Nextday.nextDay(date10);
		Day day14 = date10.getDay();
		date10.printDate();
	}

	@Test
	public void test601() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test160");
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
		Year year20 = date3.getYear();
		Month month21 = date3.getMonth();
		date3.printDate();
	}

	@Test
	public void test602() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test161");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b5 = date3.equals((java.lang.Object) (-1));
		Year year6 = date3.getYear();
		Year year7 = date3.getYear();
		Date date8 = Nextday.nextDay(date3);
		Year year9 = date3.getYear();
		year9.setYear(5);
		boolean b12 = year9.increment();
		boolean b13 = year9.isLeap();
	}

	@Test
	public void test603() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test164");
		Year year1 = new Year((int) (short) 100);
		boolean b2 = year1.increment();
		boolean b3 = year1.isLeap();
	}

	@Test
	public void test604() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test165");
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
		date3.increment();
		Date date22 = Nextday.nextDay(date3);
		Date date23 = Nextday.nextDay(date3);
	}

	@Test
	public void test605() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test166");
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
		boolean b18 = month15.isValid();
	}

	@Test
	public void test606() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test167");
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
		boolean b24 = day7.increment();
		java.lang.Object obj25 = null;
		boolean b26 = day7.equals(obj25);
		Date date31 = new Date(1, 10, 100);
		Date date32 = Nextday.nextDay(date31);
		Month month33 = date32.getMonth();
		try {
			day7.setDay(101, month33);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test607() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test168");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		Month month10 = date9.getMonth();
		date9.printDate();
		date9.increment();
		Month month13 = date9.getMonth();
		Date date14 = Nextday.nextDay(date9);
		java.lang.String str15 = date9.toString();
		Day day16 = date9.getDay();
	}

	@Test
	public void test608() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test170");
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
		date3.increment();
		Month month16 = date3.getMonth();
		java.lang.String str17 = date3.toString();
		java.lang.String str18 = date3.toString();
		Month month19 = date3.getMonth();
		boolean b20 = month19.increment();
		boolean b21 = month19.isValid();
	}

	@Test
	public void test609() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test171");
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
		boolean b27 = year1.increment();
	}

	@Test
	public void test610() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test172");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year9 = new Year((int) (byte) 100);
		int i10 = year9.getYear();
		boolean b11 = date3.equals((java.lang.Object) year9);
		Year year12 = date3.getYear();
		Month month13 = date3.getMonth();
		Year year14 = date3.getYear();
		Year year15 = date3.getYear();
	}

	@Test
	public void test611() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test173");
		try {
			Date date3 = new Date((int) (short) 0, 4, 97);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test612() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test178");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b6 = month4.equals((java.lang.Object) 10L);
		boolean b7 = month4.isValid();
		boolean b8 = month4.isValid();
		boolean b9 = month4.isValid();
		Date date13 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b15 = date13.equals((java.lang.Object) (-1));
		Year year17 = new Year(1);
		boolean b18 = year17.isValid();
		boolean b19 = year17.isLeap();
		int i20 = year17.getYear();
		boolean b21 = year17.isLeap();
		boolean b22 = year17.isLeap();
		boolean b23 = date13.equals((java.lang.Object) b22);
		Date date24 = Nextday.nextDay(date13);
		date24.printDate();
		date24.increment();
		Day day27 = date24.getDay();
		Month month28 = date24.getMonth();
		boolean b29 = month4.equals((java.lang.Object) date24);
		date24.increment();
		Date date31 = Nextday.nextDay(date24);
		Year year33 = new Year(1);
		boolean b34 = year33.isLeap();
		int i35 = year33.getYear();
		boolean b36 = year33.isValid();
		boolean b37 = year33.increment();
		boolean b38 = date31.equals((java.lang.Object) year33);
		int i39 = year33.getYear();
	}

	@Test
	public void test613() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test179");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		java.lang.String str8 = date4.toString();
		Year year9 = date4.getYear();
		Date date10 = Nextday.nextDay(date4);
		date4.printDate();
		Day day12 = date4.getDay();
		Month month13 = date4.getMonth();
		Day day14 = new Day(3, month13);
	}

	@Test
	public void test614() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test188");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b5 = date3.equals((java.lang.Object) (-1));
		Year year7 = new Year(1);
		boolean b8 = year7.isValid();
		boolean b9 = year7.isLeap();
		int i10 = year7.getYear();
		boolean b11 = year7.isLeap();
		boolean b12 = year7.isLeap();
		boolean b13 = date3.equals((java.lang.Object) b12);
		Month month14 = date3.getMonth();
		date3.printDate();
		Year year16 = date3.getYear();
	}

	@Test
	public void test615() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test193");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b6 = month4.equals((java.lang.Object) 10L);
		boolean b7 = month4.isValid();
		boolean b8 = month4.isValid();
		boolean b9 = month4.isValid();
		Date date13 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b15 = date13.equals((java.lang.Object) (-1));
		Year year17 = new Year(1);
		boolean b18 = year17.isValid();
		boolean b19 = year17.isLeap();
		int i20 = year17.getYear();
		boolean b21 = year17.isLeap();
		boolean b22 = year17.isLeap();
		boolean b23 = date13.equals((java.lang.Object) b22);
		Date date24 = Nextday.nextDay(date13);
		date24.printDate();
		date24.increment();
		Day day27 = date24.getDay();
		Month month28 = date24.getMonth();
		boolean b29 = month4.equals((java.lang.Object) date24);
		Year year30 = date24.getYear();
		year30.setYear(35);
		boolean b33 = year30.isValid();
	}

	@Test
	public void test616() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test195");
		Date date3 = new Date(10, 3, 33);
		date3.printDate();
	}

	@Test
	public void test617() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test196");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isValid();
		boolean b6 = year3.isValid();
		boolean b7 = year3.isValid();
		int i8 = year3.getYear();
		Month month9 = new Month((int) (short) 10, year3);
		boolean b10 = year3.isValid();
		Year year12 = new Year(11);
		boolean b13 = year3.equals((java.lang.Object) year12);
		boolean b14 = year3.isLeap();
		Year year16 = new Year((int) (short) 1);
		boolean b17 = year16.isLeap();
		year16.setYear((int) (short) -1);
		int i20 = year16.getYear();
		boolean b21 = year16.isValid();
		boolean b22 = year16.increment();
		boolean b23 = year16.increment();
		int i24 = year16.getYear();
		boolean b25 = year3.equals((java.lang.Object) i24);
		Month month26 = new Month(4, year3);
		int i27 = year3.getYear();
	}

	@Test
	public void test618() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test198");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		int i4 = year2.getYear();
		boolean b6 = year2.equals((java.lang.Object) 1);
		year2.setYear(32);
		boolean b9 = year2.isLeap();
		boolean b10 = year2.increment();
		Month month11 = new Month((int) (short) 1, year2);
		boolean b12 = month11.increment();
		boolean b13 = month11.isValid();
	}

	@Test
	public void test619() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test200");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		date3.printDate();
		Month month6 = date3.getMonth();
		Day day7 = date3.getDay();
		Date date8 = Nextday.nextDay(date3);
		Year year9 = date8.getYear();
	}

	@Test
	public void test620() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test201");
		try {
			Date date3 = new Date(32, (int) '#', (int) (byte) -1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test621() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test202");
		Date date3 = new Date(10, 3, 33);
		Month month4 = date3.getMonth();
		Day day5 = date3.getDay();
		Year year6 = date3.getYear();
		java.lang.String str7 = date3.toString();
		date3.increment();
	}

	@Test
	public void test622() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test203");
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
		date3.printDate();
		Day day19 = date3.getDay();
		Day day20 = date3.getDay();
	}

	@Test
	public void test623() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test204");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		Day day9 = date3.getDay();
		boolean b10 = day9.isValid();
		int i11 = day9.getDay();
		int i12 = day9.getDay();
		boolean b13 = day9.increment();
		boolean b14 = day9.isValid();
		int i15 = day9.getDay();
	}

	@Test
	public void test624() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test207");
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
		date3.increment();
		Date date19 = Nextday.nextDay(date3);
		java.lang.String str20 = date3.toString();
		Month month21 = date3.getMonth();
		date3.increment();
	}

	@Test
	public void test625() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test208");
		Year year1 = new Year(3);
		boolean b2 = year1.increment();
		year1.setYear(11);
		boolean b5 = year1.isLeap();
		boolean b6 = year1.increment();
	}

	@Test
	public void test626() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test211");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		boolean b4 = year2.isLeap();
		boolean b5 = year2.increment();
		year2.setYear(2);
		try {
			Month month8 = new Month(102, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test627() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test213");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		Month month5 = date3.getMonth();
		date3.increment();
		Day day7 = date3.getDay();
	}

	@Test
	public void test628() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test214");
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
		boolean b20 = day7.increment();
		int i21 = day7.getDay();
		int i22 = day7.getDay();
		int i23 = day7.getDay();
	}

	@Test
	public void test629() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test216");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		int i6 = month5.getMonth();
		Year year9 = new Year((int) (short) 1);
		boolean b10 = year9.isLeap();
		month5.setMonth((int) (short) 10, year9);
		int i12 = month5.getMonth();
		Day day13 = new Day(12, month5);
		boolean b14 = month5.increment();
	}

	@Test
	public void test630() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test220");
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
		Day day16 = date10.getDay();
		int i17 = day16.getDay();
		boolean b18 = day16.increment();
		boolean b19 = day16.isValid();
	}

	@Test
	public void test631() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test223");
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
		boolean b17 = month16.increment();
		int i18 = month16.getMonthSize();
		boolean b19 = month16.isValid();
		boolean b20 = month16.isValid();
	}

	@Test
	public void test632() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test224");
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
		date3.printDate();
		Year year19 = date3.getYear();
	}

	@Test
	public void test633() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test225");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		Month month10 = date9.getMonth();
		date9.printDate();
		date9.printDate();
		date9.increment();
		Date date14 = Nextday.nextDay(date9);
		date9.printDate();
		Date date16 = Nextday.nextDay(date9);
	}

	@Test
	public void test634() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test227");
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
		Year year25 = new Year(52);
		Month month26 = new Month((int) (short) 10, year25);
		boolean b27 = month26.isValid();
		boolean b28 = month26.increment();
		day7.setDay(11, month26);
		int i30 = day7.getDay();
		boolean b31 = day7.increment();
	}

	@Test
	public void test635() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test228");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b5 = month4.increment();
		boolean b6 = month4.increment();
		boolean b7 = month4.isValid();
		boolean b8 = month4.increment();
		boolean b9 = month4.increment();
		Date date13 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year14 = date13.getYear();
		boolean b16 = date13.equals((java.lang.Object) "hi!");
		Month month17 = date13.getMonth();
		date13.printDate();
		java.lang.String str19 = date13.toString();
		date13.printDate();
		boolean b21 = month4.equals((java.lang.Object) date13);
		Year year22 = date13.getYear();
		Year year25 = new Year(1);
		boolean b26 = year25.isValid();
		boolean b27 = year25.isLeap();
		int i28 = year25.getYear();
		boolean b29 = year25.isLeap();
		Month month30 = new Month((int) (byte) 1, year25);
		boolean b31 = year25.increment();
		int i32 = year25.getYear();
		boolean b33 = year22.equals((java.lang.Object) i32);
	}

	@Test
	public void test636() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test229");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date5 = Nextday.nextDay(date4);
		java.lang.String str6 = date5.toString();
		Month month7 = date5.getMonth();
		try {
			Day day8 = new Day(33, month7);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test637() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test230");
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
		date10.increment();
		Date date19 = new Date((int) (short) 10, 11, (int) (short) 100);
		Month month20 = date19.getMonth();
		boolean b21 = date10.equals((java.lang.Object) month20);
		java.lang.String str22 = date10.toString();
	}

	@Test
	public void test638() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test231");
		Year year1 = new Year((int) (short) 1);
		boolean b2 = year1.increment();
	}

	@Test
	public void test639() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test233");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.printDate();
		Year year8 = date3.getYear();
		date3.increment();
		Date date10 = Nextday.nextDay(date3);
		date10.printDate();
		java.lang.String str12 = date10.toString();
		Date date13 = Nextday.nextDay(date10);
		Date date14 = Nextday.nextDay(date10);
		Month month15 = date14.getMonth();
		boolean b16 = month15.increment();
	}

	@Test
	public void test640() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test234");
		try {
			Date date3 = new Date(53, 2, 101);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test641() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test235");
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
		int i15 = month5.getMonthSize();
		boolean b16 = month5.increment();
		boolean b17 = month5.increment();
		try {
			Day day18 = new Day(2, month5);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test642() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test237");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		Year year7 = new Year((int) (byte) 100);
		boolean b8 = year7.isValid();
		Month month9 = new Month((int) (short) 10, year7);
		boolean b10 = month9.increment();
		boolean b11 = date3.equals((java.lang.Object) month9);
		Year year12 = date3.getYear();
		Date date13 = Nextday.nextDay(date3);
		Month month14 = date13.getMonth();
		boolean b15 = month14.increment();
	}

	@Test
	public void test643() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test240");
		Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year6 = date5.getYear();
		boolean b8 = date5.equals((java.lang.Object) "hi!");
		java.lang.String str9 = date5.toString();
		Year year10 = date5.getYear();
		Date date11 = Nextday.nextDay(date5);
		Month month12 = date11.getMonth();
		date11.printDate();
		date11.printDate();
		Date date15 = Nextday.nextDay(date11);
		Year year16 = date15.getYear();
		int i17 = year16.getYear();
		boolean b18 = year16.isValid();
		year16.setYear((int) (short) 100);
		year16.setYear((-1));
		Month month23 = new Month(1, year16);
		try {
			Month month24 = new Month((int) '4', year16);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test644() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test241");
		Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date6 = Nextday.nextDay(date5);
		Year year9 = new Year((int) (byte) 100);
		boolean b10 = year9.isValid();
		Month month11 = new Month((int) (short) 10, year9);
		boolean b12 = month11.increment();
		int i13 = month11.getMonthSize();
		boolean b14 = month11.isValid();
		boolean b15 = date6.equals((java.lang.Object) month11);
		int i16 = month11.getMonthSize();
		int i17 = month11.getMonth();
		Date date22 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year23 = date22.getYear();
		boolean b25 = date22.equals((java.lang.Object) "hi!");
		date22.printDate();
		Year year27 = date22.getYear();
		date22.increment();
		Date date29 = Nextday.nextDay(date22);
		Year year30 = date22.getYear();
		Year year32 = new Year(1);
		boolean b33 = year32.increment();
		int i34 = year32.getYear();
		year32.setYear((int) (short) -1);
		boolean b37 = year30.equals((java.lang.Object) (short) -1);
		year30.setYear(3);
		month11.setMonth((int) (short) 1, year30);
		Day day41 = new Day(11, month11);
		Day day42 = new Day(14, month11);
		Year year44 = new Year(1);
		boolean b45 = year44.isValid();
		boolean b46 = year44.isValid();
		boolean b47 = year44.isLeap();
		boolean b48 = year44.isLeap();
		int i49 = year44.getYear();
		year44.setYear(12);
		boolean b52 = day42.equals((java.lang.Object) year44);
	}

	@Test
	public void test645() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test244");
		Year year1 = new Year(1);
		boolean b2 = year1.increment();
		boolean b3 = year1.increment();
		int i4 = year1.getYear();
	}

	@Test
	public void test646() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test245");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		int i5 = month4.getMonth();
		Year year8 = new Year((int) (short) 1);
		boolean b9 = year8.isLeap();
		month4.setMonth((int) (short) 10, year8);
		int i11 = month4.getMonthSize();
		java.lang.Object obj12 = null;
		boolean b13 = month4.equals(obj12);
	}

	@Test
	public void test647() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test248");
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
		Day day17 = date3.getDay();
		Month month18 = date3.getMonth();
		date3.increment();
		Day day20 = date3.getDay();
		boolean b21 = day20.increment();
	}

	@Test
	public void test648() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test254");
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
		Day day16 = date3.getDay();
		Date date17 = Nextday.nextDay(date3);
		Month month18 = date17.getMonth();
		Day day19 = date17.getDay();
	}

	@Test
	public void test649() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test257");
		Year year1 = new Year((int) (short) 100);
		boolean b2 = year1.increment();
		Year year4 = new Year(1);
		boolean b5 = year4.isValid();
		int i6 = year4.getYear();
		year4.setYear(100);
		boolean b9 = year1.equals((java.lang.Object) year4);
		boolean b11 = year4.equals((java.lang.Object) (byte) -1);
		Date date15 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year16 = date15.getYear();
		boolean b18 = date15.equals((java.lang.Object) "hi!");
		java.lang.String str19 = date15.toString();
		Year year20 = date15.getYear();
		Date date21 = Nextday.nextDay(date15);
		Month month22 = date21.getMonth();
		int i23 = month22.getMonth();
		boolean b24 = year4.equals((java.lang.Object) month22);
		boolean b25 = year4.increment();
		boolean b26 = year4.increment();
		int i27 = year4.getYear();
		boolean b28 = year4.increment();
	}

	@Test
	public void test650() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test265");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		Month month10 = date9.getMonth();
		date9.printDate();
		Day day12 = date9.getDay();
		date9.increment();
		date9.printDate();
		date9.increment();
		Year year16 = date9.getYear();
		boolean b17 = year16.isValid();
		boolean b18 = year16.isValid();
		year16.setYear((int) (short) 10);
	}

	@Test
	public void test651() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test266");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		int i6 = month5.getMonth();
		Day day7 = new Day(30, month5);
		int i8 = day7.getDay();
		boolean b9 = day7.isValid();
		boolean b10 = day7.increment();
		boolean b11 = day7.isValid();
		boolean b12 = day7.increment();
		Date date17 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date18 = Nextday.nextDay(date17);
		date17.printDate();
		Month month20 = date17.getMonth();
		int i21 = month20.getMonth();
		day7.setDay((int) (short) 1, month20);
	}

	@Test
	public void test652() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test267");
		Year year3 = new Year(1);
		boolean b4 = year3.isLeap();
		boolean b5 = year3.isLeap();
		boolean b6 = year3.increment();
		Month month7 = new Month((int) (short) 1, year3);
		Date date11 = new Date(10, (int) (byte) 10, (int) (short) 1);
		java.lang.String str12 = date11.toString();
		boolean b13 = month7.equals((java.lang.Object) date11);
		Day day14 = new Day((int) (byte) 10, month7);
		Year year18 = new Year((int) (byte) 100);
		boolean b19 = year18.isValid();
		Month month20 = new Month((int) (short) 10, year18);
		boolean b22 = month20.equals((java.lang.Object) 10L);
		int i23 = month20.getMonth();
		boolean b24 = month20.isValid();
		boolean b25 = month20.isValid();
		boolean b26 = month20.isValid();
		boolean b27 = month20.isValid();
		boolean b28 = month20.increment();
		try {
			day14.setDay(53, month20);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test653() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test269");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Year year10 = date3.getYear();
		Date date11 = Nextday.nextDay(date3);
		date11.increment();
		java.lang.String str13 = date11.toString();
		Date date14 = Nextday.nextDay(date11);
		date11.printDate();
		Day day16 = date11.getDay();
	}

	@Test
	public void test654() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest5.test270");
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
		boolean b22 = day9.isValid();
		boolean b23 = day9.increment();
		int i24 = day9.getDay();
	}

	@Test
	public void test655() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test001");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b6 = date4.equals((java.lang.Object) (-1));
		Year year8 = new Year(1);
		boolean b9 = year8.isValid();
		boolean b10 = year8.isLeap();
		int i11 = year8.getYear();
		boolean b12 = year8.isLeap();
		boolean b13 = year8.isLeap();
		boolean b14 = date4.equals((java.lang.Object) b13);
		java.lang.String str15 = date4.toString();
		Month month16 = date4.getMonth();
		Month month17 = date4.getMonth();
		Day day18 = date4.getDay();
		date4.increment();
		Date date20 = Nextday.nextDay(date4);
		Month month21 = date20.getMonth();
		Day day22 = new Day((int) (short) 10, month21);
		boolean b23 = month21.isValid();
	}

	@Test
	public void test656() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test002");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		Date date8 = Nextday.nextDay(date3);
		date3.printDate();
		Day day10 = date3.getDay();
		java.lang.String str11 = date3.toString();
		date3.increment();
		Day day13 = date3.getDay();
		java.lang.String str14 = date3.toString();
		date3.increment();
	}

	@Test
	public void test657() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test006");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Year year11 = new Year((int) (byte) 100);
		boolean b12 = year11.isValid();
		Month month13 = new Month((int) (short) 10, year11);
		day7.setDay((int) (short) 10, month13);
		Year year17 = new Year(52);
		Month month18 = new Month((int) (short) 10, year17);
		year17.setYear(102);
		boolean b21 = day7.equals((java.lang.Object) year17);
		year17.setYear((int) (short) 10);
		java.lang.Object obj24 = null;
		boolean b25 = year17.equals(obj24);
	}

	@Test
	public void test658() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test008");
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
		boolean b16 = year11.isLeap();
		boolean b17 = year11.isValid();
	}

	@Test
	public void test659() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test010");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b5 = month4.increment();
		boolean b6 = month4.increment();
		int i7 = month4.getMonth();
		boolean b8 = month4.isValid();
		int i9 = month4.getMonth();
		Year year12 = new Year((int) (short) 1);
		boolean b13 = year12.isLeap();
		try {
			month4.setMonth(0, year12);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test660() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test013");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isValid();
		boolean b5 = year2.isLeap();
		boolean b6 = year2.isLeap();
		int i7 = year2.getYear();
		boolean b8 = year2.increment();
		boolean b9 = year2.increment();
		boolean b10 = year2.increment();
		Month month11 = new Month(4, year2);
		boolean b12 = month11.increment();
	}

	@Test
	public void test661() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test014");
		Year year1 = new Year(1);
		year1.setYear(32);
		boolean b4 = year1.increment();
		boolean b5 = year1.isLeap();
		boolean b6 = year1.isLeap();
	}

	@Test
	public void test662() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test015");
		Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b7 = date5.equals((java.lang.Object) (-1));
		Year year8 = date5.getYear();
		Month month9 = new Month(3, year8);
		Year year12 = new Year(3);
		month9.setMonth(11, year12);
		boolean b14 = month9.increment();
		boolean b15 = month9.increment();
		try {
			Day day16 = new Day(52, month9);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test663() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test016");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		int i6 = month5.getMonth();
		Year year9 = new Year((int) (short) 1);
		boolean b10 = year9.isLeap();
		month5.setMonth((int) (short) 10, year9);
		boolean b12 = month5.isValid();
		int i13 = month5.getMonthSize();
		Day day14 = new Day((int) (short) 1, month5);
		Year year17 = new Year((int) (byte) 10);
		boolean b18 = year17.increment();
		boolean b19 = year17.isLeap();
		try {
			month5.setMonth(53, year17);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test664() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test017");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		date3.printDate();
		java.lang.String str9 = date3.toString();
		Year year10 = date3.getYear();
		year10.setYear(10);
		Year year14 = new Year(1);
		boolean b15 = year14.isLeap();
		boolean b16 = year14.isLeap();
		boolean b17 = year14.increment();
		java.lang.Object obj18 = null;
		boolean b19 = year14.equals(obj18);
		boolean b20 = year14.isValid();
		boolean b21 = year10.equals((java.lang.Object) b20);
	}

	@Test
	public void test665() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test019");
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
		boolean b16 = day15.isValid();
		boolean b18 = day15.equals((java.lang.Object) "10/12/1");
		boolean b19 = day15.increment();
		boolean b20 = day15.isValid();
		boolean b21 = day15.isValid();
		boolean b22 = day15.increment();
		int i23 = day15.getDay();
	}

	@Test
	public void test666() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test026");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		Day day5 = date4.getDay();
		Year year6 = date4.getYear();
		Year year7 = date4.getYear();
		Year year8 = date4.getYear();
		boolean b9 = year8.isLeap();
	}

	@Test
	public void test667() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test029");
		Year year1 = new Year((int) (short) 1);
		boolean b2 = year1.isLeap();
		year1.setYear((int) (short) -1);
		int i5 = year1.getYear();
		boolean b6 = year1.isValid();
		try {
			year1.setYear(0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test668() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test030");
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
		date3.printDate();
		Day day19 = date3.getDay();
		int i20 = day19.getDay();
	}

	@Test
	public void test669() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test031");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		date3.printDate();
		Year year6 = date3.getYear();
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		Date date9 = Nextday.nextDay(date3);
		Month month10 = date3.getMonth();
	}

	@Test
	public void test670() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test032");
		Date date3 = new Date((int) (byte) 10, 13, (-1));
	}

	@Test
	public void test671() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test034");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		Month month8 = date4.getMonth();
		date4.increment();
		Month month10 = date4.getMonth();
		boolean b11 = month10.isValid();
		try {
			Day day12 = new Day(35, month10);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test672() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test036");
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
		date3.increment();
		Month month16 = date3.getMonth();
		java.lang.String str17 = date3.toString();
		java.lang.String str18 = date3.toString();
		Month month19 = date3.getMonth();
		date3.increment();
	}

	@Test
	public void test673() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test038");
		Year year1 = new Year((int) (byte) 100);
		java.lang.Object obj2 = new java.lang.Object();
		boolean b3 = year1.equals(obj2);
		int i4 = year1.getYear();
		int i5 = year1.getYear();
		year1.setYear(1);
		boolean b8 = year1.increment();
	}

	@Test
	public void test674() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test040");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Year year10 = date3.getYear();
		Date date11 = Nextday.nextDay(date3);
		date3.increment();
		Year year13 = date3.getYear();
		Year year14 = date3.getYear();
		year14.setYear((int) (short) 100);
	}

	@Test
	public void test675() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test041");
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
		boolean b20 = day7.isValid();
		int i21 = day7.getDay();
		boolean b22 = day7.isValid();
	}

	@Test
	public void test676() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test044");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.printDate();
		date3.printDate();
		Month month9 = date3.getMonth();
		Day day10 = date3.getDay();
		date3.increment();
	}

	@Test
	public void test677() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test045");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		int i3 = year1.getYear();
		boolean b4 = year1.isValid();
		boolean b5 = year1.isLeap();
		boolean b6 = year1.isValid();
		boolean b7 = year1.isValid();
		boolean b8 = year1.isLeap();
		boolean b9 = year1.isValid();
	}

	@Test
	public void test678() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test049");
		try {
			Date date3 = new Date(53, 1, 28);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test679() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test051");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		date3.printDate();
		Day day10 = date3.getDay();
		boolean b11 = day10.increment();
		Year year14 = new Year((int) (byte) 100);
		boolean b15 = year14.isValid();
		Month month16 = new Month((int) (short) 10, year14);
		boolean b18 = month16.equals((java.lang.Object) 10L);
		int i19 = month16.getMonth();
		boolean b20 = month16.isValid();
		boolean b21 = month16.isValid();
		boolean b22 = month16.isValid();
		boolean b23 = month16.increment();
		boolean b24 = day10.equals((java.lang.Object) month16);
		int i25 = month16.getMonthSize();
	}

	@Test
	public void test680() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test052");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		int i8 = month7.getMonthSize();
		boolean b10 = month7.equals((java.lang.Object) 0L);
		int i11 = month7.getMonth();
		int i12 = month7.getMonth();
	}

	@Test
	public void test681() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test054");
		Year year3 = new Year(52);
		Month month4 = new Month((int) (short) 10, year3);
		Month month5 = new Month(5, year3);
		year3.setYear(2);
		try {
			year3.setYear(0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test682() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test056");
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
		Day day16 = date3.getDay();
		Day day17 = date3.getDay();
		boolean b18 = day17.isValid();
		Date date23 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year24 = date23.getYear();
		boolean b26 = date23.equals((java.lang.Object) "hi!");
		Month month27 = date23.getMonth();
		Month month28 = date23.getMonth();
		int i29 = month28.getMonth();
		boolean b30 = month28.isValid();
		int i31 = month28.getMonthSize();
		int i32 = month28.getMonth();
		try {
			day17.setDay(32, month28);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test683() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test057");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		Year year7 = new Year((int) (byte) 100);
		boolean b8 = year7.isValid();
		Month month9 = new Month((int) (short) 10, year7);
		boolean b10 = month9.increment();
		int i11 = month9.getMonthSize();
		boolean b12 = month9.isValid();
		boolean b13 = date4.equals((java.lang.Object) month9);
		Year year14 = date4.getYear();
		date4.increment();
		Year year16 = date4.getYear();
		date4.printDate();
		Day day18 = date4.getDay();
	}

	@Test
	public void test684() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test058");
		Year year1 = new Year(31);
		int i2 = year1.getYear();
		boolean b3 = year1.isLeap();
		int i4 = year1.getYear();
		boolean b5 = year1.isLeap();
	}

	@Test
	public void test685() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test059");
		Year year4 = new Year((int) (byte) 100);
		boolean b5 = year4.isValid();
		Month month6 = new Month((int) (short) 10, year4);
		int i7 = month6.getMonth();
		Day day8 = new Day(30, month6);
		boolean b9 = month6.increment();
		boolean b10 = month6.increment();
		boolean b11 = month6.isValid();
		boolean b12 = month6.increment();
		try {
			Day day13 = new Day(30, month6);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test686() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test060");
		Year year1 = new Year(33);
		boolean b2 = year1.isLeap();
		Date date6 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year7 = date6.getYear();
		boolean b9 = date6.equals((java.lang.Object) "hi!");
		date6.printDate();
		Year year11 = date6.getYear();
		date6.increment();
		Date date13 = Nextday.nextDay(date6);
		Year year14 = date6.getYear();
		Day day15 = date6.getDay();
		Day day16 = date6.getDay();
		boolean b17 = year1.equals((java.lang.Object) date6);
		date6.printDate();
		java.lang.Object obj19 = null;
		boolean b20 = date6.equals(obj19);
	}

	@Test
	public void test687() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test063");
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
		boolean b26 = year1.increment();
		Year year28 = new Year((int) (byte) 100);
		boolean b29 = year28.isValid();
		boolean b30 = year28.increment();
		year28.setYear((int) '4');
		boolean b33 = year28.isValid();
		year28.setYear(30);
		boolean b36 = year1.equals((java.lang.Object) year28);
		boolean b37 = year28.isValid();
		boolean b38 = year28.isValid();
		boolean b39 = year28.increment();
	}

	@Test
	public void test688() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test065");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		java.lang.String str8 = date3.toString();
		date3.printDate();
		Year year10 = date3.getYear();
		Year year15 = new Year((int) (byte) 100);
		boolean b16 = year15.isValid();
		Month month17 = new Month((int) (short) 10, year15);
		int i18 = month17.getMonth();
		Day day19 = new Day(30, month17);
		boolean b20 = day19.isValid();
		int i21 = day19.getDay();
		Year year23 = new Year(101);
		boolean b24 = year23.isLeap();
		boolean b25 = day19.equals((java.lang.Object) year23);
		Month month26 = new Month(2, year23);
		boolean b27 = date3.equals((java.lang.Object) 2);
		Day day28 = date3.getDay();
		Date date29 = Nextday.nextDay(date3);
		Day day30 = date29.getDay();
	}

	@Test
	public void test689() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test066");
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
		Day day17 = date14.getDay();
		Date date18 = Nextday.nextDay(date14);
		Day day19 = date14.getDay();
		Year year22 = new Year((int) (byte) 100);
		boolean b23 = year22.isValid();
		Month month24 = new Month((int) (short) 10, year22);
		boolean b26 = month24.equals((java.lang.Object) 10L);
		boolean b27 = month24.isValid();
		int i28 = month24.getMonthSize();
		int i29 = month24.getMonth();
		boolean b30 = month24.increment();
		boolean b31 = date14.equals((java.lang.Object) month24);
		java.lang.String str32 = date14.toString();
	}

	@Test
	public void test690() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test067");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		date3.increment();
		Month month9 = date3.getMonth();
		boolean b10 = month9.isValid();
		boolean b11 = month9.increment();
		int i12 = month9.getMonthSize();
	}

	@Test
	public void test691() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test068");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		int i6 = month5.getMonth();
		Day day7 = new Day(30, month5);
		int i8 = day7.getDay();
		boolean b9 = day7.isValid();
		boolean b10 = day7.increment();
		boolean b11 = day7.isValid();
		int i12 = day7.getDay();
	}

	@Test
	public void test692() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test077");
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
		boolean b17 = year14.increment();
		int i18 = year14.getYear();
	}

	@Test
	public void test693() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test078");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isValid();
		boolean b6 = year3.isValid();
		boolean b7 = year3.isValid();
		int i8 = year3.getYear();
		Month month9 = new Month((int) (short) 1, year3);
		boolean b10 = month9.increment();
		try {
			Day day11 = new Day(101, month9);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test694() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test079");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		date3.printDate();
		Year year9 = date3.getYear();
		Year year10 = date3.getYear();
		Year year11 = date3.getYear();
		Year year12 = date3.getYear();
		year12.setYear((int) (short) 10);
	}

	@Test
	public void test695() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test081");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		Year year7 = new Year((int) (byte) 100);
		boolean b8 = year7.isValid();
		Month month9 = new Month((int) (short) 10, year7);
		boolean b10 = month9.increment();
		int i11 = month9.getMonthSize();
		boolean b12 = month9.isValid();
		boolean b13 = date4.equals((java.lang.Object) month9);
		Year year14 = date4.getYear();
		Month month15 = date4.getMonth();
		int i16 = month15.getMonthSize();
	}

	@Test
	public void test696() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test082");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		int i3 = year1.getYear();
		year1.setYear(100);
		boolean b6 = year1.isValid();
		int i7 = year1.getYear();
		Date date11 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b13 = date11.equals((java.lang.Object) (-1));
		Year year15 = new Year(1);
		boolean b16 = year15.isValid();
		boolean b17 = year15.isLeap();
		int i18 = year15.getYear();
		boolean b19 = year15.isLeap();
		boolean b20 = year15.isLeap();
		boolean b21 = date11.equals((java.lang.Object) b20);
		Date date22 = Nextday.nextDay(date11);
		date22.printDate();
		Month month24 = date22.getMonth();
		boolean b25 = year1.equals((java.lang.Object) month24);
		int i26 = year1.getYear();
	}

	@Test
	public void test697() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test084");
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
		Date date18 = Nextday.nextDay(date3);
		Month month19 = date18.getMonth();
		boolean b20 = month19.increment();
	}

	@Test
	public void test698() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test085");
		try {
			Date date3 = new Date(102, 0, 33);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test699() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test086");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		date3.printDate();
		java.lang.String str9 = date3.toString();
		Month month10 = date3.getMonth();
		Year year11 = date3.getYear();
		java.lang.String str12 = date3.toString();
		Month month13 = date3.getMonth();
		int i14 = month13.getMonthSize();
	}

	@Test
	public void test700() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test087");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		Year year7 = new Year((int) (byte) 100);
		boolean b8 = year7.isValid();
		Month month9 = new Month((int) (short) 10, year7);
		boolean b10 = month9.increment();
		boolean b11 = date3.equals((java.lang.Object) month9);
		boolean b12 = month9.isValid();
		boolean b13 = month9.isValid();
	}

	@Test
	public void test701() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test088");
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
		int i15 = month5.getMonth();
		Year year17 = new Year((int) (byte) 100);
		boolean b18 = year17.isValid();
		boolean b19 = year17.increment();
		year17.setYear((int) '4');
		boolean b22 = year17.isValid();
		boolean b23 = month5.equals((java.lang.Object) b22);
		boolean b24 = month5.increment();
	}

	@Test
	public void test702() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test092");
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
		Month month15 = date13.getMonth();
		Day day16 = date13.getDay();
		Day day17 = date13.getDay();
	}

	@Test
	public void test703() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test093");
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
		int i14 = month10.getMonthSize();
	}

	@Test
	public void test704() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test094");
		try {
			Date date3 = new Date((int) 'a', 53, 35);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test705() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test095");
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
		date3.increment();
		Date date22 = Nextday.nextDay(date3);
		Day day23 = date3.getDay();
		date3.increment();
		Day day25 = date3.getDay();
		Month month26 = date3.getMonth();
	}

	@Test
	public void test706() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test096");
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
		Year year25 = new Year(52);
		Month month26 = new Month((int) (short) 10, year25);
		boolean b27 = month26.isValid();
		boolean b28 = month26.increment();
		day7.setDay(11, month26);
		Year year32 = new Year((int) (short) 100);
		boolean b33 = year32.increment();
		Year year35 = new Year(1);
		boolean b36 = year35.isValid();
		int i37 = year35.getYear();
		year35.setYear(100);
		boolean b40 = year32.equals((java.lang.Object) year35);
		boolean b42 = year35.equals((java.lang.Object) (byte) -1);
		Date date46 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year47 = date46.getYear();
		boolean b49 = date46.equals((java.lang.Object) "hi!");
		java.lang.String str50 = date46.toString();
		Year year51 = date46.getYear();
		Date date52 = Nextday.nextDay(date46);
		Month month53 = date52.getMonth();
		int i54 = month53.getMonth();
		boolean b55 = year35.equals((java.lang.Object) month53);
		boolean b56 = year35.increment();
		boolean b57 = year35.increment();
		try {
			month26.setMonth(102, year35);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test707() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test097");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.printDate();
		Year year8 = date3.getYear();
		date3.increment();
		Date date10 = Nextday.nextDay(date3);
		date10.printDate();
		java.lang.String str12 = date10.toString();
		Date date13 = Nextday.nextDay(date10);
		Day day14 = date10.getDay();
		boolean b15 = day14.isValid();
		Month month17 = null;
		try {
			day14.setDay(13, month17);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test708() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test099");
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
		boolean b18 = month12.increment();
		int i19 = month12.getMonth();
		int i20 = month12.getMonthSize();
		int i21 = month12.getMonth();
	}

	@Test
	public void test709() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test100");
		Year year1 = new Year((int) (byte) 100);
		java.lang.Object obj2 = new java.lang.Object();
		boolean b3 = year1.equals(obj2);
		Date date7 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year8 = date7.getYear();
		boolean b10 = date7.equals((java.lang.Object) "hi!");
		Month month11 = date7.getMonth();
		boolean b12 = year1.equals((java.lang.Object) date7);
		date7.increment();
		Year year14 = date7.getYear();
		Year year16 = new Year(1);
		boolean b17 = year16.isLeap();
		boolean b18 = year16.isLeap();
		boolean b19 = date7.equals((java.lang.Object) year16);
		int i20 = year16.getYear();
		year16.setYear((int) (short) 100);
		year16.setYear((int) (short) 100);
	}

	@Test
	public void test710() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test101");
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
		boolean b21 = day7.increment();
	}

	@Test
	public void test711() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test103");
		Year year1 = new Year((int) '#');
		Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year6 = date5.getYear();
		boolean b8 = date5.equals((java.lang.Object) "hi!");
		date5.printDate();
		Year year10 = date5.getYear();
		Year year12 = new Year(1);
		boolean b13 = year12.isValid();
		boolean b14 = year12.isValid();
		boolean b15 = year12.isLeap();
		boolean b16 = year12.increment();
		int i17 = year12.getYear();
		boolean b18 = date5.equals((java.lang.Object) year12);
		boolean b19 = year1.equals((java.lang.Object) year12);
		java.lang.Object obj20 = null;
		boolean b21 = year12.equals(obj20);
		boolean b22 = year12.isLeap();
	}

	@Test
	public void test712() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test104");
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
		int i28 = month21.getMonth();
		boolean b29 = month21.isValid();
	}

	@Test
	public void test713() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test105");
		Date date3 = new Date(2, 10, 10);
		Date date4 = Nextday.nextDay(date3);
		Date date5 = Nextday.nextDay(date3);
		Month month6 = date5.getMonth();
	}

	@Test
	public void test714() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test107");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Date date7 = Nextday.nextDay(date3);
		Month month8 = date3.getMonth();
		date3.printDate();
		java.lang.String str10 = date3.toString();
	}

	@Test
	public void test715() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test108");
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
		date10.increment();
		Date date19 = new Date((int) (short) 10, 11, (int) (short) 100);
		Month month20 = date19.getMonth();
		boolean b21 = date10.equals((java.lang.Object) month20);
		boolean b22 = month20.isValid();
	}

	@Test
	public void test716() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test109");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		int i5 = month4.getMonth();
		boolean b6 = month4.increment();
		Year year9 = new Year(1);
		boolean b10 = year9.isValid();
		boolean b11 = year9.isLeap();
		int i12 = year9.getYear();
		boolean b13 = year9.isLeap();
		boolean b14 = year9.isValid();
		boolean b15 = year9.isLeap();
		month4.setMonth((int) (byte) 10, year9);
		int i17 = month4.getMonth();
		boolean b18 = month4.isValid();
		Year year21 = new Year(1);
		boolean b22 = year21.isLeap();
		int i23 = year21.getYear();
		year21.setYear(100);
		boolean b26 = year21.increment();
		boolean b27 = year21.increment();
		try {
			month4.setMonth((int) (short) -1, year21);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test717() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test111");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Date date10 = Nextday.nextDay(date3);
		date10.increment();
		date10.printDate();
		Year year13 = date10.getYear();
		boolean b14 = year13.increment();
		boolean b15 = year13.isValid();
		boolean b16 = year13.increment();
		year13.setYear((int) (byte) 10);
	}

	@Test
	public void test718() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test114");
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
		date15.printDate();
		Date date18 = Nextday.nextDay(date15);
		Year year19 = date18.getYear();
		boolean b20 = year19.isLeap();
		try {
			Month month21 = new Month(0, year19);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test719() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test121");
		Year year1 = new Year((int) (short) 100);
		boolean b2 = year1.increment();
		Year year4 = new Year(1);
		boolean b5 = year4.isValid();
		int i6 = year4.getYear();
		year4.setYear(100);
		boolean b9 = year1.equals((java.lang.Object) year4);
		boolean b11 = year4.equals((java.lang.Object) (byte) -1);
		boolean b13 = year4.equals((java.lang.Object) 52);
		boolean b14 = year4.isValid();
		int i15 = year4.getYear();
		int i16 = year4.getYear();
	}

	@Test
	public void test720() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test123");
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
		boolean b20 = day7.equals((java.lang.Object) "10/11/1");
		int i21 = day7.getDay();
	}

	@Test
	public void test721() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test124");
		Year year1 = new Year(1);
		boolean b2 = year1.increment();
		int i3 = year1.getYear();
		year1.setYear((int) (short) -1);
		boolean b6 = year1.increment();
	}

	@Test
	public void test722() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test128");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		int i6 = month5.getMonth();
		Day day7 = new Day(30, month5);
		boolean b8 = month5.increment();
		int i9 = month5.getMonth();
		Date date14 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year15 = date14.getYear();
		int i16 = year15.getYear();
		year15.setYear((int) 'a');
		boolean b19 = year15.isLeap();
		try {
			month5.setMonth((int) (short) 100, year15);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test723() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test129");
		Date date3 = new Date(10, 10, 11);
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
		boolean b22 = day11.equals((java.lang.Object) "hi!");
		boolean b23 = day11.isValid();
		boolean b24 = date3.equals((java.lang.Object) day11);
		Date date29 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year30 = date29.getYear();
		Year year33 = new Year((int) (byte) 100);
		boolean b34 = year33.isValid();
		Month month35 = new Month((int) (short) 10, year33);
		boolean b36 = month35.increment();
		boolean b37 = date29.equals((java.lang.Object) month35);
		Year year38 = date29.getYear();
		Date date39 = Nextday.nextDay(date29);
		Date date40 = Nextday.nextDay(date29);
		Month month41 = date40.getMonth();
		Month month42 = date40.getMonth();
		try {
			day11.setDay(35, month42);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test724() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test132");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		int i5 = month4.getMonth();
		Year year8 = new Year((int) (short) 1);
		boolean b9 = year8.isLeap();
		month4.setMonth((int) (short) 10, year8);
		int i11 = month4.getMonth();
		int i12 = month4.getMonth();
		boolean b13 = month4.increment();
		int i14 = month4.getMonth();
		int i15 = month4.getMonth();
		boolean b16 = month4.increment();
	}

	@Test
	public void test725() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test133");
		Year year1 = new Year((int) (byte) 100);
		java.lang.Object obj2 = new java.lang.Object();
		boolean b3 = year1.equals(obj2);
		Date date7 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year8 = date7.getYear();
		boolean b10 = date7.equals((java.lang.Object) "hi!");
		Month month11 = date7.getMonth();
		boolean b12 = year1.equals((java.lang.Object) date7);
		date7.increment();
		Year year14 = date7.getYear();
		java.lang.String str15 = date7.toString();
	}

	@Test
	public void test726() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test134");
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
		boolean b19 = month8.isValid();
		Year year21 = new Year((int) (byte) 100);
		int i22 = year21.getYear();
		int i23 = year21.getYear();
		boolean b24 = month8.equals((java.lang.Object) year21);
		Year year27 = new Year(1);
		boolean b28 = year27.isLeap();
		boolean b30 = year27.equals((java.lang.Object) 100.0f);
		Date date34 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year35 = date34.getYear();
		boolean b37 = date34.equals((java.lang.Object) "hi!");
		Day day38 = date34.getDay();
		Year year42 = new Year((int) (byte) 100);
		boolean b43 = year42.isValid();
		Month month44 = new Month((int) (short) 10, year42);
		day38.setDay((int) (short) 10, month44);
		java.lang.Object obj46 = null;
		boolean b47 = day38.equals(obj46);
		boolean b48 = day38.increment();
		boolean b49 = day38.isValid();
		boolean b50 = day38.isValid();
		boolean b51 = year27.equals((java.lang.Object) b50);
		boolean b52 = year27.increment();
		Year year54 = new Year((int) (byte) 100);
		boolean b55 = year54.isValid();
		boolean b56 = year54.increment();
		year54.setYear((int) '4');
		boolean b59 = year54.isValid();
		year54.setYear(30);
		boolean b62 = year27.equals((java.lang.Object) year54);
		try {
			month8.setMonth(34, year54);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test727() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test142");
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
		boolean b20 = day7.isValid();
		Year year23 = new Year(1);
		boolean b24 = year23.isValid();
		boolean b25 = year23.isValid();
		boolean b26 = year23.isValid();
		boolean b27 = year23.isValid();
		int i28 = year23.getYear();
		Month month29 = new Month((int) (short) 10, year23);
		boolean b30 = year23.increment();
		boolean b31 = day7.equals((java.lang.Object) b30);
		boolean b32 = day7.increment();
		int i33 = day7.getDay();
		int i34 = day7.getDay();
		java.lang.Object obj35 = null;
		boolean b36 = day7.equals(obj35);
	}

	@Test
	public void test728() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test145");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		Date date8 = Nextday.nextDay(date3);
		date3.printDate();
		Day day10 = date3.getDay();
		java.lang.String str11 = date3.toString();
		date3.printDate();
		Day day13 = date3.getDay();
		date3.increment();
	}

	@Test
	public void test729() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test149");
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
		boolean b27 = year1.isValid();
		boolean b28 = year1.isValid();
	}

	@Test
	public void test730() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test153");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b5 = date3.equals((java.lang.Object) (-1));
		Year year7 = new Year(1);
		boolean b8 = year7.isValid();
		boolean b9 = year7.isLeap();
		int i10 = year7.getYear();
		boolean b11 = year7.isLeap();
		boolean b12 = year7.isLeap();
		boolean b13 = date3.equals((java.lang.Object) b12);
		Day day14 = date3.getDay();
		Month month15 = date3.getMonth();
		boolean b16 = month15.isValid();
		boolean b17 = month15.isValid();
		boolean b18 = month15.increment();
		int i19 = month15.getMonth();
	}

	@Test
	public void test731() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test157");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		Year year7 = new Year((int) (byte) 100);
		boolean b8 = year7.isValid();
		Month month9 = new Month((int) (short) 10, year7);
		boolean b10 = month9.increment();
		int i11 = month9.getMonthSize();
		boolean b12 = month9.isValid();
		boolean b13 = date4.equals((java.lang.Object) month9);
		Year year14 = date4.getYear();
		Month month15 = date4.getMonth();
		Year year16 = date4.getYear();
		boolean b17 = year16.isLeap();
	}

	@Test
	public void test732() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test160");
		Year year2 = new Year(52);
		Month month3 = new Month((int) (short) 10, year2);
		boolean b4 = month3.isValid();
		Date date8 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date12 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year13 = date12.getYear();
		boolean b15 = date12.equals((java.lang.Object) "hi!");
		Day day16 = date12.getDay();
		Year year20 = new Year((int) (byte) 100);
		boolean b21 = year20.isValid();
		Month month22 = new Month((int) (short) 10, year20);
		day16.setDay((int) (short) 10, month22);
		java.lang.Object obj24 = null;
		boolean b25 = day16.equals(obj24);
		boolean b26 = day16.increment();
		int i27 = day16.getDay();
		boolean b28 = day16.isValid();
		boolean b29 = date8.equals((java.lang.Object) day16);
		int i30 = day16.getDay();
		boolean b31 = day16.increment();
		boolean b32 = day16.isValid();
		boolean b33 = month3.equals((java.lang.Object) b32);
	}

	@Test
	public void test733() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test162");
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
		boolean b17 = day15.isValid();
		boolean b18 = day15.isValid();
		int i19 = day15.getDay();
	}

	@Test
	public void test734() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test165");
		Year year3 = new Year((int) (byte) 100);
		Month month4 = new Month((int) (short) 1, year3);
		Date date8 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date9 = Nextday.nextDay(date8);
		date8.increment();
		date8.increment();
		java.lang.String str12 = date8.toString();
		boolean b13 = month4.equals((java.lang.Object) date8);
		Year year15 = new Year(1);
		boolean b16 = year15.isValid();
		boolean b17 = year15.isValid();
		boolean b18 = year15.isLeap();
		boolean b19 = year15.isLeap();
		int i20 = year15.getYear();
		boolean b21 = year15.increment();
		boolean b22 = year15.increment();
		boolean b23 = year15.increment();
		boolean b24 = year15.increment();
		boolean b25 = month4.equals((java.lang.Object) year15);
		Day day26 = new Day(12, month4);
		int i27 = day26.getDay();
	}

	@Test
	public void test735() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test166");
		Year year1 = new Year(100);
		Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year6 = date5.getYear();
		boolean b8 = date5.equals((java.lang.Object) "hi!");
		java.lang.String str9 = date5.toString();
		Year year10 = date5.getYear();
		Date date11 = Nextday.nextDay(date5);
		Month month12 = date5.getMonth();
		Year year13 = date5.getYear();
		boolean b14 = year1.equals((java.lang.Object) date5);
		java.lang.String str15 = date5.toString();
	}

	@Test
	public void test736() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test167");
		try {
			Date date3 = new Date(33, 97, 33);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test737() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test169");
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
		Day day17 = date3.getDay();
		Month month18 = date3.getMonth();
		Month month19 = date3.getMonth();
		java.lang.String str20 = date3.toString();
	}

	@Test
	public void test738() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test172");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year9 = new Year(1);
		boolean b10 = year9.isValid();
		boolean b11 = year9.isLeap();
		int i12 = year9.getYear();
		boolean b13 = year9.increment();
		boolean b14 = date3.equals((java.lang.Object) b13);
		Month month15 = date3.getMonth();
		java.lang.String str16 = date3.toString();
	}

	@Test
	public void test739() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test174");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		int i8 = month7.getMonthSize();
		int i9 = month7.getMonthSize();
		boolean b10 = month7.isValid();
		int i11 = month7.getMonthSize();
		int i12 = month7.getMonthSize();
	}

	@Test
	public void test740() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test175");
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
		date10.increment();
		java.lang.String str16 = date10.toString();
	}

	@Test
	public void test741() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test179");
		Date date3 = new Date(2, 10, 10);
		Date date4 = Nextday.nextDay(date3);
		date4.printDate();
	}

	@Test
	public void test742() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test180");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		Day day9 = date3.getDay();
		boolean b10 = day9.isValid();
		int i11 = day9.getDay();
		int i12 = day9.getDay();
		boolean b13 = day9.isValid();
		boolean b14 = day9.increment();
		boolean b15 = day9.increment();
		boolean b16 = day9.isValid();
		boolean b17 = day9.increment();
	}

	@Test
	public void test743() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test181");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isLeap();
		int i6 = year3.getYear();
		boolean b7 = year3.isLeap();
		Month month8 = new Month((int) (byte) 1, year3);
		Day day9 = new Day(31, month8);
		boolean b10 = day9.isValid();
		int i11 = day9.getDay();
		Date date16 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year17 = date16.getYear();
		Year year20 = new Year((int) (byte) 100);
		boolean b21 = year20.isValid();
		Month month22 = new Month((int) (short) 10, year20);
		boolean b23 = month22.increment();
		boolean b24 = date16.equals((java.lang.Object) month22);
		Year year25 = date16.getYear();
		Date date26 = Nextday.nextDay(date16);
		Month month27 = date16.getMonth();
		Month month28 = date16.getMonth();
		int i29 = month28.getMonth();
		try {
			day9.setDay(97, month28);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test744() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test183");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b5 = month4.increment();
		boolean b6 = month4.increment();
		boolean b7 = month4.increment();
		Year year9 = new Year(1);
		boolean b10 = year9.increment();
		int i11 = year9.getYear();
		boolean b12 = month4.equals((java.lang.Object) year9);
		int i13 = year9.getYear();
	}

	@Test
	public void test745() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test184");
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
		boolean b14 = year4.increment();
		Date date18 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year19 = date18.getYear();
		boolean b21 = date18.equals((java.lang.Object) "hi!");
		date18.printDate();
		date18.printDate();
		Month month24 = date18.getMonth();
		int i25 = month24.getMonth();
		boolean b26 = year4.equals((java.lang.Object) month24);
		boolean b27 = month24.increment();
	}

	@Test
	public void test746() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test185");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		date4.printDate();
		Year year7 = date4.getYear();
		Day day8 = date4.getDay();
		Month month9 = date4.getMonth();
		boolean b10 = month9.increment();
		int i11 = month9.getMonth();
		try {
			Day day12 = new Day((int) (short) 0, month9);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test747() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test186");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		Year year7 = new Year((int) (byte) 100);
		boolean b8 = year7.isValid();
		Month month9 = new Month((int) (short) 10, year7);
		boolean b10 = month9.increment();
		boolean b11 = date3.equals((java.lang.Object) month9);
		boolean b12 = month9.increment();
		int i13 = month9.getMonth();
		boolean b14 = month9.increment();
	}

	@Test
	public void test748() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test188");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		date3.printDate();
		date3.printDate();
		Date date10 = Nextday.nextDay(date3);
		java.lang.Object obj11 = null;
		boolean b12 = date10.equals(obj11);
		date10.printDate();
	}

	@Test
	public void test749() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test189");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		Year year8 = new Year((int) (byte) 100);
		boolean b9 = year8.isValid();
		Month month10 = new Month((int) (short) 10, year8);
		boolean b11 = month10.increment();
		boolean b12 = date4.equals((java.lang.Object) month10);
		Year year13 = date4.getYear();
		java.lang.String str14 = date4.toString();
		date4.increment();
		Day day16 = date4.getDay();
		Year year18 = new Year(1);
		boolean b19 = year18.isValid();
		boolean b20 = year18.isLeap();
		int i21 = year18.getYear();
		boolean b22 = year18.isLeap();
		boolean b23 = day16.equals((java.lang.Object) year18);
		boolean b24 = year18.isValid();
		int i25 = year18.getYear();
		Month month26 = new Month((int) (short) 10, year18);
	}

	@Test
	public void test750() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test196");
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
		try {
			year1.setYear((int) (byte) 0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test751() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test197");
		try {
			Date date3 = new Date(52, 101, 2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test752() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test200");
		Year year1 = new Year((int) (byte) 100);
		Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b6 = year1.equals((java.lang.Object) 10);
		year1.setYear((int) (byte) 1);
	}

	@Test
	public void test753() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test201");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		Day day9 = date3.getDay();
		boolean b10 = day9.isValid();
		int i11 = day9.getDay();
		int i12 = day9.getDay();
		boolean b13 = day9.isValid();
		boolean b14 = day9.increment();
		boolean b15 = day9.isValid();
		boolean b16 = day9.isValid();
		boolean b17 = day9.increment();
	}

	@Test
	public void test754() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test203");
		Year year1 = new Year((int) (short) 100);
		boolean b2 = year1.increment();
		Year year4 = new Year(1);
		boolean b5 = year4.isValid();
		int i6 = year4.getYear();
		year4.setYear(100);
		boolean b9 = year1.equals((java.lang.Object) year4);
		boolean b11 = year4.equals((java.lang.Object) (byte) -1);
		boolean b12 = year4.isLeap();
	}

	@Test
	public void test755() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test204");
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
		boolean b28 = month21.increment();
		Year year33 = new Year(1);
		boolean b34 = year33.isLeap();
		boolean b35 = year33.isLeap();
		boolean b36 = year33.increment();
		Month month37 = new Month((int) (short) 1, year33);
		Date date41 = new Date(10, (int) (byte) 10, (int) (short) 1);
		java.lang.String str42 = date41.toString();
		boolean b43 = month37.equals((java.lang.Object) date41);
		Day day44 = new Day((int) (byte) 10, month37);
		Year year47 = new Year(1);
		boolean b48 = year47.isLeap();
		boolean b49 = year47.isLeap();
		Date date53 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year54 = date53.getYear();
		boolean b56 = date53.equals((java.lang.Object) "hi!");
		date53.increment();
		java.lang.String str58 = date53.toString();
		boolean b59 = year47.equals((java.lang.Object) date53);
		Month month60 = new Month((int) (short) 10, year47);
		boolean b61 = year47.isLeap();
		boolean b62 = day44.equals((java.lang.Object) year47);
		year47.setYear((int) (short) 100);
		try {
			month21.setMonth(34, year47);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test756() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test205");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		int i6 = month5.getMonth();
		Day day7 = new Day(30, month5);
		boolean b8 = day7.isValid();
		int i9 = day7.getDay();
		Year year11 = new Year(101);
		boolean b12 = year11.isLeap();
		boolean b13 = day7.equals((java.lang.Object) year11);
		boolean b15 = day7.equals((java.lang.Object) 30);
	}

	@Test
	public void test757() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test207");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		java.lang.String str8 = date4.toString();
		boolean b10 = date4.equals((java.lang.Object) (short) 100);
		Date date11 = Nextday.nextDay(date4);
		date11.increment();
		date11.printDate();
		Date date14 = Nextday.nextDay(date11);
		Month month15 = date14.getMonth();
		boolean b16 = month15.isValid();
		boolean b17 = month15.isValid();
		Day day18 = new Day(2, month15);
	}

	@Test
	public void test758() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test208");
		Year year5 = new Year((int) (byte) 100);
		boolean b6 = year5.isValid();
		Month month7 = new Month((int) (short) 10, year5);
		boolean b8 = month7.increment();
		int i9 = month7.getMonthSize();
		boolean b10 = month7.isValid();
		Day day11 = new Day(10, month7);
		Day day12 = new Day(12, month7);
		Date date17 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year18 = date17.getYear();
		boolean b20 = date17.equals((java.lang.Object) "hi!");
		java.lang.String str21 = date17.toString();
		boolean b23 = date17.equals((java.lang.Object) (short) 100);
		Year year24 = date17.getYear();
		Date date25 = Nextday.nextDay(date17);
		date25.increment();
		Month month27 = date25.getMonth();
		day12.setDay(5, month27);
		int i29 = month27.getMonth();
		int i30 = month27.getMonth();
		try {
			Day day31 = new Day((-1), month27);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test759() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test209");
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
		Day day28 = date3.getDay();
		Year year29 = date3.getYear();
		boolean b30 = year29.increment();
		boolean b31 = year29.isValid();
	}

	@Test
	public void test760() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test211");
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
		boolean b16 = day15.isValid();
		boolean b18 = day15.equals((java.lang.Object) "10/12/1");
		boolean b19 = day15.increment();
		boolean b20 = day15.isValid();
		int i21 = day15.getDay();
		boolean b22 = day15.isValid();
		boolean b23 = day15.isValid();
		boolean b24 = day15.isValid();
		Date date29 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year30 = date29.getYear();
		Year year33 = new Year((int) (byte) 100);
		boolean b34 = year33.isValid();
		Month month35 = new Month((int) (short) 10, year33);
		boolean b36 = month35.increment();
		boolean b37 = date29.equals((java.lang.Object) month35);
		Year year38 = date29.getYear();
		Date date39 = Nextday.nextDay(date29);
		Month month40 = date29.getMonth();
		boolean b41 = month40.isValid();
		try {
			day15.setDay((int) (short) -1, month40);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test761() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test214");
		Year year1 = new Year((int) (byte) 100);
		java.lang.Object obj2 = new java.lang.Object();
		boolean b3 = year1.equals(obj2);
		Date date7 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year8 = date7.getYear();
		boolean b10 = date7.equals((java.lang.Object) "hi!");
		Month month11 = date7.getMonth();
		boolean b12 = year1.equals((java.lang.Object) date7);
		Date date13 = Nextday.nextDay(date7);
		date13.printDate();
		Day day15 = date13.getDay();
	}

	@Test
	public void test762() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test216");
		Year year1 = new Year((int) (short) 1);
		boolean b2 = year1.isLeap();
		boolean b3 = year1.isLeap();
		year1.setYear(1);
		int i6 = year1.getYear();
	}

	@Test
	public void test763() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test217");
		Year year1 = new Year((int) (short) 100);
		boolean b2 = year1.increment();
		Year year4 = new Year(1);
		boolean b5 = year4.isValid();
		int i6 = year4.getYear();
		year4.setYear(100);
		boolean b9 = year1.equals((java.lang.Object) year4);
		boolean b11 = year4.equals((java.lang.Object) (byte) -1);
		Date date15 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year16 = date15.getYear();
		boolean b18 = date15.equals((java.lang.Object) "hi!");
		java.lang.String str19 = date15.toString();
		Year year20 = date15.getYear();
		Date date21 = Nextday.nextDay(date15);
		Month month22 = date21.getMonth();
		int i23 = month22.getMonth();
		boolean b24 = year4.equals((java.lang.Object) month22);
		boolean b25 = year4.isValid();
		boolean b26 = year4.isValid();
	}

	@Test
	public void test764() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test221");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		date3.increment();
		date3.increment();
		Date date7 = Nextday.nextDay(date3);
		date3.increment();
		Date date9 = Nextday.nextDay(date3);
	}

	@Test
	public void test765() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test222");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		Date date8 = Nextday.nextDay(date3);
		date3.printDate();
		Day day10 = date3.getDay();
		java.lang.String str11 = date3.toString();
		date3.increment();
		Day day13 = date3.getDay();
		boolean b14 = day13.increment();
	}

	@Test
	public void test766() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test224");
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
		int i21 = month19.getMonth();
		int i22 = month19.getMonthSize();
	}

	@Test
	public void test767() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test229");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		date3.printDate();
		Day day9 = date3.getDay();
		Day day10 = date3.getDay();
		int i11 = day10.getDay();
	}

	@Test
	public void test768() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test236");
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
		boolean b16 = day15.isValid();
		boolean b18 = day15.equals((java.lang.Object) "10/12/1");
		boolean b19 = day15.increment();
		Year year23 = new Year((int) (byte) 100);
		boolean b24 = year23.isValid();
		Month month25 = new Month((int) (short) 10, year23);
		boolean b26 = month25.increment();
		int i27 = month25.getMonthSize();
		boolean b28 = month25.isValid();
		boolean b29 = month25.increment();
		day15.setDay((int) (byte) 10, month25);
		Month month32 = null;
		try {
			day15.setDay(0, month32);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test769() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test237");
		try {
			Date date3 = new Date((int) (short) 100, (int) (byte) 10, 4);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test770() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test238");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		date3.printDate();
		java.lang.String str7 = date3.toString();
		Date date8 = Nextday.nextDay(date3);
		Year year9 = date8.getYear();
	}

	@Test
	public void test771() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test241");
		Date date3 = new Date((int) (short) 10, 11, (int) (short) 100);
		Month month4 = date3.getMonth();
		boolean b5 = month4.increment();
		int i6 = month4.getMonth();
		boolean b7 = month4.isValid();
		boolean b8 = month4.increment();
		int i9 = month4.getMonth();
	}

	@Test
	public void test772() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test244");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b6 = month4.equals((java.lang.Object) 10L);
		Year year8 = new Year(1);
		boolean b9 = year8.increment();
		boolean b10 = month4.equals((java.lang.Object) year8);
		boolean b11 = month4.isValid();
		boolean b12 = month4.isValid();
	}

	@Test
	public void test773() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test247");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		boolean b6 = month5.increment();
		boolean b7 = month5.increment();
		Date date11 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year12 = date11.getYear();
		date11.printDate();
		boolean b14 = month5.equals((java.lang.Object) date11);
		Year year15 = date11.getYear();
		try {
			Month month16 = new Month((int) '#', year15);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test774() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test252");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		Month month8 = date4.getMonth();
		boolean b9 = month8.increment();
		boolean b10 = month8.increment();
		Date date14 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date15 = Nextday.nextDay(date14);
		Year year18 = new Year((int) (byte) 100);
		boolean b19 = year18.isValid();
		Month month20 = new Month((int) (short) 10, year18);
		boolean b21 = month20.increment();
		int i22 = month20.getMonthSize();
		boolean b23 = month20.isValid();
		boolean b24 = date15.equals((java.lang.Object) month20);
		int i25 = month20.getMonthSize();
		int i26 = month20.getMonth();
		boolean b27 = month8.equals((java.lang.Object) month20);
		boolean b28 = month20.isValid();
		Year year30 = new Year(1);
		boolean b31 = year30.isValid();
		boolean b32 = year30.increment();
		boolean b33 = year30.increment();
		boolean b34 = year30.isLeap();
		int i35 = year30.getYear();
		boolean b36 = year30.isValid();
		boolean b37 = year30.isValid();
		boolean b38 = month20.equals((java.lang.Object) year30);
		Month month39 = new Month((int) (byte) 10, year30);
	}

	@Test
	public void test775() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test255");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year9 = new Year(1);
		boolean b10 = year9.isValid();
		boolean b11 = year9.isLeap();
		int i12 = year9.getYear();
		boolean b13 = year9.increment();
		boolean b14 = date3.equals((java.lang.Object) b13);
		Month month15 = date3.getMonth();
		date3.printDate();
	}

	@Test
	public void test776() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test256");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		date3.printDate();
		Year year9 = date3.getYear();
		Year year10 = date3.getYear();
		Year year11 = date3.getYear();
		Year year12 = date3.getYear();
		boolean b13 = year12.increment();
	}

	@Test
	public void test777() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test258");
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
		boolean b17 = month13.increment();
		boolean b18 = month13.increment();
		boolean b19 = month13.isValid();
	}

	@Test
	public void test778() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test259");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		java.lang.String str8 = date3.toString();
		java.lang.String str9 = date3.toString();
		Date date10 = Nextday.nextDay(date3);
		Day day11 = date10.getDay();
		Date date12 = Nextday.nextDay(date10);
		java.lang.String str13 = date12.toString();
	}

	@Test
	public void test779() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test261");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		int i4 = year2.getYear();
		boolean b6 = year2.equals((java.lang.Object) 1);
		boolean b7 = year2.isValid();
		Month month8 = new Month(1, year2);
		boolean b9 = year2.isValid();
		try {
			year2.setYear((int) (short) 0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test780() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test265");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isValid();
		boolean b4 = year1.isLeap();
		boolean b5 = year1.increment();
		int i6 = year1.getYear();
		boolean b7 = year1.increment();
		Date date11 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year12 = date11.getYear();
		boolean b14 = date11.equals((java.lang.Object) "hi!");
		Month month15 = date11.getMonth();
		Day day16 = date11.getDay();
		boolean b17 = day16.isValid();
		boolean b18 = year1.equals((java.lang.Object) b17);
	}

	@Test
	public void test781() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test268");
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
		boolean b16 = day14.isValid();
	}

	@Test
	public void test782() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test270");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		int i5 = month4.getMonth();
		Year year8 = new Year((int) (short) 1);
		boolean b9 = year8.isLeap();
		month4.setMonth((int) (short) 10, year8);
		Year year13 = new Year(1);
		boolean b14 = year13.isValid();
		boolean b15 = year13.isLeap();
		int i16 = year13.getYear();
		boolean b17 = year13.isLeap();
		Month month18 = new Month((int) (byte) 1, year13);
		int i19 = month18.getMonthSize();
		int i20 = month18.getMonthSize();
		int i21 = month18.getMonthSize();
		boolean b22 = month18.isValid();
		int i23 = month18.getMonth();
		boolean b24 = month18.increment();
		int i25 = month18.getMonthSize();
		boolean b26 = year8.equals((java.lang.Object) i25);
	}

	@Test
	public void test783() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test275");
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
		int i16 = day14.getDay();
		int i17 = day14.getDay();
	}

	@Test
	public void test784() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test278");
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
		Month month15 = date13.getMonth();
		Day day16 = date13.getDay();
		java.lang.String str17 = date13.toString();
		date13.increment();
	}

	@Test
	public void test785() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test279");
		Year year1 = new Year((int) (short) 100);
		boolean b2 = year1.increment();
		boolean b3 = year1.isValid();
		Date date7 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year8 = date7.getYear();
		boolean b10 = date7.equals((java.lang.Object) "hi!");
		Day day11 = date7.getDay();
		Month month12 = date7.getMonth();
		Day day13 = date7.getDay();
		boolean b14 = day13.isValid();
		int i15 = day13.getDay();
		int i16 = day13.getDay();
		Year year18 = new Year((int) (byte) 100);
		int i19 = year18.getYear();
		int i20 = year18.getYear();
		boolean b21 = year18.isValid();
		int i22 = year18.getYear();
		boolean b23 = day13.equals((java.lang.Object) year18);
		int i24 = day13.getDay();
		boolean b25 = year1.equals((java.lang.Object) day13);
	}

	@Test
	public void test786() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test282");
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
		int i20 = day7.getDay();
		boolean b21 = day7.increment();
		int i22 = day7.getDay();
		boolean b23 = day7.isValid();
	}

	@Test
	public void test787() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test283");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		Day day9 = date3.getDay();
		boolean b10 = day9.isValid();
		int i11 = day9.getDay();
		int i12 = day9.getDay();
		boolean b13 = day9.isValid();
		boolean b14 = day9.increment();
		boolean b15 = day9.isValid();
		int i16 = day9.getDay();
		boolean b17 = day9.isValid();
	}

	@Test
	public void test788() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test284");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		int i3 = year1.getYear();
		year1.setYear(100);
		year1.setYear((int) '4');
		int i8 = year1.getYear();
		year1.setYear(12);
		year1.setYear((int) (byte) 1);
	}

	@Test
	public void test789() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test286");
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
		Year year25 = new Year(1);
		boolean b26 = year25.isValid();
		boolean b27 = year25.isValid();
		boolean b28 = year25.isLeap();
		boolean b29 = year25.isLeap();
		int i30 = year25.getYear();
		int i31 = year25.getYear();
		month9.setMonth(3, year25);
		int i33 = month9.getMonth();
		boolean b34 = month9.isValid();
	}

	@Test
	public void test790() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test288");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		Day day6 = date3.getDay();
		Month month7 = date3.getMonth();
		Day day8 = date3.getDay();
	}

	@Test
	public void test791() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test289");
		Year year1 = new Year((int) (byte) 10);
		boolean b2 = year1.isValid();
		int i3 = year1.getYear();
		boolean b4 = year1.isLeap();
		year1.setYear(100);
	}

	@Test
	public void test792() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test291");
		Year year2 = new Year((int) (byte) 100);
		Month month3 = new Month((int) (short) 1, year2);
		Date date7 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year8 = date7.getYear();
		boolean b10 = date7.equals((java.lang.Object) "hi!");
		Month month11 = date7.getMonth();
		date7.increment();
		Month month13 = date7.getMonth();
		boolean b14 = month13.isValid();
		boolean b15 = month13.increment();
		boolean b16 = month3.equals((java.lang.Object) b15);
		boolean b17 = month3.increment();
		Date date22 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year23 = date22.getYear();
		boolean b25 = date22.equals((java.lang.Object) "hi!");
		date22.increment();
		Date date27 = Nextday.nextDay(date22);
		date22.printDate();
		Day day29 = date22.getDay();
		Month month30 = date22.getMonth();
		Year year33 = new Year(2);
		month30.setMonth(2, year33);
		boolean b35 = year33.isLeap();
		try {
			month3.setMonth(14, year33);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test793() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test293");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b5 = date3.equals((java.lang.Object) (-1));
		date3.increment();
		date3.increment();
		date3.increment();
	}

	@Test
	public void test794() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test296");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		date3.printDate();
		Month month6 = date3.getMonth();
		Month month7 = date3.getMonth();
		Month month8 = date3.getMonth();
	}

	@Test
	public void test795() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test298");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		date4.printDate();
		Year year7 = date4.getYear();
		Day day8 = date4.getDay();
		Month month9 = date4.getMonth();
		Day day10 = new Day(12, month9);
		boolean b11 = month9.isValid();
		int i12 = month9.getMonth();
		int i13 = month9.getMonth();
		int i14 = month9.getMonthSize();
	}

	@Test
	public void test796() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test299");
		try {
			Date date3 = new Date(35, 33, 101);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test797() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test301");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.printDate();
		Year year8 = date3.getYear();
		date3.increment();
		Date date10 = Nextday.nextDay(date3);
		date10.printDate();
		Day day12 = date10.getDay();
		boolean b13 = day12.isValid();
		Date date18 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b20 = date18.equals((java.lang.Object) (-1));
		Year year22 = new Year(1);
		boolean b23 = year22.isValid();
		boolean b24 = year22.isLeap();
		int i25 = year22.getYear();
		boolean b26 = year22.isLeap();
		boolean b27 = year22.isLeap();
		boolean b28 = date18.equals((java.lang.Object) b27);
		Day day29 = date18.getDay();
		Month month30 = date18.getMonth();
		boolean b31 = month30.isValid();
		try {
			day12.setDay(100, month30);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test798() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test302");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		date4.printDate();
		Year year7 = date4.getYear();
		Day day8 = date4.getDay();
		Month month9 = date4.getMonth();
		boolean b10 = month9.increment();
		Day day11 = new Day(4, month9);
	}

	@Test
	public void test799() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test306");
		Year year2 = new Year(31);
		int i3 = year2.getYear();
		try {
			Month month4 = new Month(53, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test800() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test307");
		Year year1 = new Year((int) (short) 1);
		boolean b2 = year1.isLeap();
		boolean b3 = year1.isLeap();
		boolean b4 = year1.increment();
		int i5 = year1.getYear();
		Date date9 = new Date((int) (short) 10, 11, (int) (short) 100);
		Day day10 = date9.getDay();
		Date date11 = Nextday.nextDay(date9);
		Month month12 = date9.getMonth();
		Date date16 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date17 = Nextday.nextDay(date16);
		Year year20 = new Year((int) (byte) 100);
		boolean b21 = year20.isValid();
		Month month22 = new Month((int) (short) 10, year20);
		boolean b23 = month22.increment();
		int i24 = month22.getMonthSize();
		boolean b25 = month22.isValid();
		boolean b26 = date17.equals((java.lang.Object) month22);
		Year year29 = new Year(1);
		boolean b30 = year29.isValid();
		boolean b31 = year29.increment();
		boolean b32 = year29.increment();
		boolean b33 = year29.increment();
		month22.setMonth(1, year29);
		boolean b35 = date9.equals((java.lang.Object) 1);
		Day day36 = date9.getDay();
		Year year37 = date9.getYear();
		boolean b38 = year1.equals((java.lang.Object) year37);
		boolean b39 = year37.isValid();
	}

	@Test
	public void test801() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test308");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		Month month10 = date9.getMonth();
		int i11 = month10.getMonthSize();
		boolean b12 = month10.isValid();
		boolean b13 = month10.increment();
	}

	@Test
	public void test802() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test310");
		Date date3 = new Date((int) (short) 10, 28, (int) (short) 1);
		Year year5 = new Year(31);
		Date date9 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year10 = date9.getYear();
		boolean b12 = date9.equals((java.lang.Object) "hi!");
		java.lang.String str13 = date9.toString();
		boolean b15 = date9.equals((java.lang.Object) (short) 100);
		Year year16 = date9.getYear();
		Year year18 = new Year(1);
		boolean b19 = year18.isLeap();
		int i20 = year18.getYear();
		boolean b22 = year18.equals((java.lang.Object) 1);
		year18.setYear(32);
		boolean b25 = date9.equals((java.lang.Object) 32);
		boolean b26 = year5.equals((java.lang.Object) b25);
		boolean b27 = date3.equals((java.lang.Object) b25);
		Month month28 = date3.getMonth();
	}

	@Test
	public void test803() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test311");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isValid();
		boolean b4 = year1.isLeap();
		boolean b5 = year1.isLeap();
		int i6 = year1.getYear();
		Date date10 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year11 = date10.getYear();
		boolean b13 = date10.equals((java.lang.Object) "hi!");
		date10.printDate();
		date10.increment();
		Day day16 = date10.getDay();
		boolean b17 = year1.equals((java.lang.Object) day16);
	}

	@Test
	public void test804() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test312");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		Day day8 = date3.getDay();
		Date date9 = Nextday.nextDay(date3);
		date3.increment();
	}

	@Test
	public void test805() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test314");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Year year10 = date3.getYear();
		Date date11 = Nextday.nextDay(date3);
		Day day12 = date3.getDay();
		boolean b13 = day12.isValid();
		boolean b14 = day12.isValid();
	}

	@Test
	public void test806() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test315");
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
		boolean b24 = month16.isValid();
		boolean b25 = month16.isValid();
	}

	@Test
	public void test807() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test317");
		Year year1 = new Year(101);
		boolean b2 = year1.isLeap();
		boolean b3 = year1.isValid();
		boolean b4 = year1.increment();
	}

	@Test
	public void test808() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test318");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		Date date6 = Nextday.nextDay(date3);
		java.lang.Object obj7 = null;
		boolean b8 = date3.equals(obj7);
		Year year9 = date3.getYear();
		int i10 = year9.getYear();
	}

	@Test
	public void test809() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test319");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Date date10 = Nextday.nextDay(date3);
		date10.increment();
		Month month12 = date10.getMonth();
		Year year14 = new Year(1);
		boolean b15 = year14.isLeap();
		int i16 = year14.getYear();
		year14.setYear(100);
		boolean b19 = year14.isValid();
		year14.setYear((-1));
		boolean b22 = month12.equals((java.lang.Object) year14);
		int i23 = month12.getMonth();
	}

	@Test
	public void test810() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test321");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		Day day8 = date4.getDay();
		Month month9 = date4.getMonth();
		date4.printDate();
		java.lang.String str11 = date4.toString();
		Date date12 = Nextday.nextDay(date4);
		Month month13 = date4.getMonth();
		try {
			Day day14 = new Day(102, month13);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test811() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test322");
		Year year1 = new Year((int) (byte) 100);
		java.lang.Object obj2 = new java.lang.Object();
		boolean b3 = year1.equals(obj2);
		Date date7 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year8 = date7.getYear();
		boolean b10 = date7.equals((java.lang.Object) "hi!");
		Month month11 = date7.getMonth();
		boolean b12 = year1.equals((java.lang.Object) date7);
		date7.increment();
		Date date14 = Nextday.nextDay(date7);
		Date date18 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date18.printDate();
		Year year20 = date18.getYear();
		boolean b21 = date7.equals((java.lang.Object) year20);
	}

	@Test
	public void test812() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test324");
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
		Date date17 = Nextday.nextDay(date3);
	}

	@Test
	public void test813() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test325");
		Year year2 = new Year((int) (byte) 100);
		Month month3 = new Month((int) (short) 1, year2);
		Date date7 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date8 = Nextday.nextDay(date7);
		date7.increment();
		date7.increment();
		java.lang.String str11 = date7.toString();
		boolean b12 = month3.equals((java.lang.Object) date7);
		Year year13 = date7.getYear();
		Month month14 = date7.getMonth();
		java.lang.String str15 = date7.toString();
	}

	@Test
	public void test814() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test326");
		try {
			Date date3 = new Date((int) (byte) 1, (int) (short) -1, 13);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test815() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test329");
		Year year1 = new Year((int) (byte) 100);
		boolean b2 = year1.isValid();
		year1.setYear(52);
		boolean b5 = year1.isLeap();
		boolean b6 = year1.isValid();
		boolean b7 = year1.isLeap();
	}

	@Test
	public void test816() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test331");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		Month month10 = date9.getMonth();
		boolean b11 = month10.increment();
		boolean b12 = month10.increment();
		int i13 = month10.getMonth();
	}

	@Test
	public void test817() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test334");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		date3.printDate();
		Day day10 = date3.getDay();
		int i11 = day10.getDay();
		boolean b12 = day10.isValid();
		java.lang.Object obj13 = null;
		boolean b14 = day10.equals(obj13);
		boolean b15 = day10.increment();
	}

	@Test
	public void test818() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test336");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		boolean b4 = year2.isLeap();
		java.lang.Object obj5 = new java.lang.Object();
		boolean b6 = year2.equals(obj5);
		boolean b7 = year2.isValid();
		Month month8 = new Month((int) (byte) 10, year2);
		int i9 = year2.getYear();
		Date date13 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date13.printDate();
		Date date18 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year19 = date18.getYear();
		boolean b21 = date18.equals((java.lang.Object) "hi!");
		Day day22 = date18.getDay();
		Year year26 = new Year((int) (byte) 100);
		boolean b27 = year26.isValid();
		Month month28 = new Month((int) (short) 10, year26);
		day22.setDay((int) (short) 10, month28);
		boolean b30 = date13.equals((java.lang.Object) (short) 10);
		date13.increment();
		Date date32 = Nextday.nextDay(date13);
		Day day33 = date13.getDay();
		int i34 = day33.getDay();
		boolean b35 = year2.equals((java.lang.Object) i34);
	}

	@Test
	public void test819() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test337");
		Year year1 = new Year((int) (byte) 100);
		java.lang.Object obj2 = new java.lang.Object();
		boolean b3 = year1.equals(obj2);
		Date date7 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year8 = date7.getYear();
		boolean b10 = date7.equals((java.lang.Object) "hi!");
		Month month11 = date7.getMonth();
		boolean b12 = year1.equals((java.lang.Object) date7);
		Date date13 = Nextday.nextDay(date7);
		java.lang.String str14 = date13.toString();
		Year year15 = date13.getYear();
		year15.setYear((int) (short) 10);
	}

	@Test
	public void test820() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test338");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		Date date6 = Nextday.nextDay(date3);
		Year year7 = date3.getYear();
		date3.increment();
		Year year9 = date3.getYear();
	}

	@Test
	public void test821() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test340");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		Date date6 = Nextday.nextDay(date3);
		Year year7 = date3.getYear();
		Year year8 = date3.getYear();
		Year year10 = new Year((int) (byte) 100);
		boolean b11 = year10.isValid();
		year10.setYear(52);
		boolean b14 = year8.equals((java.lang.Object) year10);
	}

	@Test
	public void test822() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test343");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		boolean b3 = year1.isLeap();
		boolean b4 = year1.increment();
		java.lang.Object obj5 = null;
		boolean b6 = year1.equals(obj5);
		int i7 = year1.getYear();
		Date date11 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date11.printDate();
		Year year13 = date11.getYear();
		Date date14 = Nextday.nextDay(date11);
		Date date15 = Nextday.nextDay(date11);
		boolean b16 = year1.equals((java.lang.Object) date15);
		Date date17 = Nextday.nextDay(date15);
		java.lang.String str18 = date15.toString();
		Year year19 = date15.getYear();
		year19.setYear(4);
	}

	@Test
	public void test823() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test348");
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
		Month month15 = date11.getMonth();
		java.lang.Object obj16 = null;
		boolean b17 = month15.equals(obj16);
		Year year20 = new Year(11);
		boolean b21 = year20.increment();
		Month month22 = new Month(3, year20);
		boolean b23 = month15.equals((java.lang.Object) 3);
	}

	@Test
	public void test824() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test349");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		date4.increment();
		java.lang.String str9 = date4.toString();
		date4.printDate();
		Year year11 = date4.getYear();
		Date date12 = Nextday.nextDay(date4);
		Year year13 = date12.getYear();
		try {
			Month month14 = new Month(53, year13);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test825() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test350");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		date3.printDate();
		java.lang.String str10 = date3.toString();
		Date date11 = Nextday.nextDay(date3);
		Month month12 = date3.getMonth();
		date3.increment();
		date3.printDate();
	}

	@Test
	public void test826() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test351");
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
		boolean b18 = day17.increment();
	}

	@Test
	public void test827() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test352");
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
		boolean b17 = day7.isValid();
		Year year19 = new Year(1);
		boolean b20 = year19.isValid();
		boolean b21 = year19.isLeap();
		int i22 = year19.getYear();
		boolean b23 = year19.isLeap();
		boolean b24 = year19.isLeap();
		boolean b25 = year19.increment();
		boolean b26 = day7.equals((java.lang.Object) b25);
	}

	@Test
	public void test828() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test353");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		Day day5 = date4.getDay();
		Year year6 = date4.getYear();
		date4.printDate();
		date4.printDate();
		date4.increment();
		Day day10 = date4.getDay();
		boolean b11 = day10.increment();
	}

	@Test
	public void test829() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test354");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Year year11 = new Year(1);
		boolean b12 = year11.isValid();
		boolean b13 = year11.increment();
		boolean b14 = year11.increment();
		boolean b15 = year11.isLeap();
		int i16 = year11.getYear();
		boolean b17 = year11.isLeap();
		boolean b18 = date3.equals((java.lang.Object) b17);
		Date date19 = Nextday.nextDay(date3);
	}

	@Test
	public void test830() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test355");
		try {
			Date date3 = new Date(97, 101, 102);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test831() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test356");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year9 = new Year((int) (byte) 100);
		int i10 = year9.getYear();
		boolean b11 = date3.equals((java.lang.Object) year9);
		Year year12 = date3.getYear();
		Date date13 = Nextday.nextDay(date3);
		Day day14 = date13.getDay();
		boolean b15 = day14.isValid();
	}

	@Test
	public void test832() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test358");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Year year10 = date3.getYear();
		Date date11 = Nextday.nextDay(date3);
		date3.increment();
		date3.increment();
		date3.printDate();
		Year year15 = date3.getYear();
	}

	@Test
	public void test833() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test359");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		Day day5 = date4.getDay();
		Year year6 = date4.getYear();
		date4.printDate();
		Date date8 = Nextday.nextDay(date4);
		Day day9 = date8.getDay();
	}

	@Test
	public void test834() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test362");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		java.lang.String str4 = date3.toString();
		java.lang.String str5 = date3.toString();
		Date date9 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year10 = date9.getYear();
		boolean b12 = date9.equals((java.lang.Object) "hi!");
		Day day13 = date9.getDay();
		Month month14 = date9.getMonth();
		date9.printDate();
		java.lang.String str16 = date9.toString();
		Month month17 = date9.getMonth();
		boolean b18 = date3.equals((java.lang.Object) date9);
		Year year19 = date9.getYear();
	}

	@Test
	public void test835() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test365");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		Day day5 = date4.getDay();
		Year year6 = date4.getYear();
		Month month7 = date4.getMonth();
		date4.printDate();
		Month month9 = date4.getMonth();
	}

	@Test
	public void test836() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test368");
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
		int i24 = month8.getMonth();
		int i25 = month8.getMonthSize();
		try {
			Day day26 = new Day((int) (short) 100, month8);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test837() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test369");
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
		Day day28 = date24.getDay();
		Month month29 = date24.getMonth();
		date24.printDate();
		java.lang.String str31 = date24.toString();
		Month month32 = date24.getMonth();
		try {
			day7.setDay((int) ' ', month32);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test838() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test370");
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
		Year year16 = new Year((int) (short) 10);
		year16.setYear((int) (byte) -1);
		boolean b19 = month4.equals((java.lang.Object) year16);
	}

	@Test
	public void test839() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test372");
		try {
			Date date3 = new Date(35, 2, (int) (byte) -1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test840() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test373");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		int i8 = month7.getMonthSize();
		int i9 = month7.getMonthSize();
		int i10 = month7.getMonth();
		boolean b11 = month7.isValid();
	}

	@Test
	public void test841() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test374");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		Date date6 = Nextday.nextDay(date3);
		Day day7 = date6.getDay();
		int i8 = day7.getDay();
		boolean b9 = day7.isValid();
		int i10 = day7.getDay();
		boolean b11 = day7.isValid();
	}

	@Test
	public void test842() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test375");
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
		boolean b16 = day14.isValid();
	}

	@Test
	public void test843() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test379");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		date3.printDate();
		java.lang.String str9 = date3.toString();
		Day day10 = date3.getDay();
		date3.increment();
		Year year12 = date3.getYear();
		Month month13 = date3.getMonth();
		int i14 = month13.getMonthSize();
	}

	@Test
	public void test844() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test381");
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
		boolean b13 = year2.isLeap();
		Year year15 = new Year((int) (short) 1);
		boolean b16 = year15.isLeap();
		year15.setYear((int) (short) -1);
		int i19 = year15.getYear();
		boolean b20 = year15.isValid();
		boolean b21 = year15.increment();
		boolean b22 = year15.increment();
		int i23 = year15.getYear();
		boolean b24 = year2.equals((java.lang.Object) i23);
		year2.setYear((int) '4');
	}

	@Test
	public void test845() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test383");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		date4.printDate();
		Year year9 = date4.getYear();
		date4.increment();
		Month month11 = date4.getMonth();
		int i12 = month11.getMonthSize();
		try {
			Day day13 = new Day(35, month11);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test846() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test385");
		Year year2 = new Year(11);
		boolean b3 = year2.increment();
		Month month4 = new Month(3, year2);
		Year year7 = new Year((int) (byte) 100);
		java.lang.Object obj8 = new java.lang.Object();
		boolean b9 = year7.equals(obj8);
		Date date13 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year14 = date13.getYear();
		boolean b16 = date13.equals((java.lang.Object) "hi!");
		Month month17 = date13.getMonth();
		boolean b18 = year7.equals((java.lang.Object) date13);
		Day day19 = date13.getDay();
		Year year21 = new Year((int) (short) 100);
		boolean b22 = year21.increment();
		Year year24 = new Year(1);
		boolean b25 = year24.isValid();
		int i26 = year24.getYear();
		year24.setYear(100);
		boolean b29 = year21.equals((java.lang.Object) year24);
		boolean b30 = day19.equals((java.lang.Object) year24);
		boolean b31 = year24.increment();
		month4.setMonth(12, year24);
	}

	@Test
	public void test847() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test388");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		Month month10 = date9.getMonth();
		Day day11 = date9.getDay();
		Date date12 = Nextday.nextDay(date9);
	}

	@Test
	public void test848() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test389");
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
		boolean b20 = day17.isValid();
		boolean b21 = day17.increment();
	}

	@Test
	public void test849() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test390");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b5 = month4.increment();
		boolean b6 = month4.isValid();
		Year year8 = new Year((int) '#');
		Date date12 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year13 = date12.getYear();
		boolean b15 = date12.equals((java.lang.Object) "hi!");
		date12.printDate();
		Year year17 = date12.getYear();
		Year year19 = new Year(1);
		boolean b20 = year19.isValid();
		boolean b21 = year19.isValid();
		boolean b22 = year19.isLeap();
		boolean b23 = year19.increment();
		int i24 = year19.getYear();
		boolean b25 = date12.equals((java.lang.Object) year19);
		boolean b26 = year8.equals((java.lang.Object) year19);
		boolean b27 = month4.equals((java.lang.Object) year8);
		year8.setYear(13);
	}

	@Test
	public void test850() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test391");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.printDate();
		Year year8 = date3.getYear();
		date3.increment();
		Date date10 = Nextday.nextDay(date3);
		Month month11 = date10.getMonth();
		java.lang.String str12 = date10.toString();
		java.lang.String str13 = date10.toString();
		java.lang.String str14 = date10.toString();
		Day day15 = date10.getDay();
		boolean b16 = day15.isValid();
		boolean b17 = day15.isValid();
		Year year21 = new Year(1);
		boolean b22 = year21.isValid();
		boolean b23 = year21.isLeap();
		int i24 = year21.getYear();
		boolean b25 = year21.isLeap();
		Month month26 = new Month((int) (byte) 1, year21);
		int i27 = month26.getMonthSize();
		int i28 = month26.getMonthSize();
		int i29 = month26.getMonthSize();
		boolean b30 = month26.isValid();
		int i31 = month26.getMonth();
		Year year33 = new Year(1);
		boolean b34 = year33.isValid();
		boolean b35 = year33.isValid();
		boolean b36 = year33.isLeap();
		boolean b37 = year33.isLeap();
		int i38 = year33.getYear();
		boolean b39 = year33.increment();
		boolean b40 = year33.increment();
		boolean b42 = year33.equals((java.lang.Object) "10/10/1");
		int i43 = year33.getYear();
		boolean b44 = month26.equals((java.lang.Object) year33);
		try {
			day15.setDay(53, month26);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test851() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test393");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		int i4 = year2.getYear();
		boolean b6 = year2.equals((java.lang.Object) 1);
		boolean b7 = year2.isValid();
		Month month8 = new Month(1, year2);
		boolean b9 = year2.increment();
		boolean b11 = year2.equals((java.lang.Object) (byte) 100);
	}

	@Test
	public void test852() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test394");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		Month month10 = date9.getMonth();
		Year year11 = date9.getYear();
		year11.setYear(3);
		boolean b14 = year11.increment();
	}

	@Test
	public void test853() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test395");
		Date date3 = new Date((int) (byte) 1, (int) (short) 1, (int) (short) -1);
		Year year4 = date3.getYear();
	}

	@Test
	public void test854() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test399");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		Month month8 = date4.getMonth();
		boolean b9 = month8.increment();
		boolean b10 = month8.increment();
		Date date14 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date15 = Nextday.nextDay(date14);
		Year year18 = new Year((int) (byte) 100);
		boolean b19 = year18.isValid();
		Month month20 = new Month((int) (short) 10, year18);
		boolean b21 = month20.increment();
		int i22 = month20.getMonthSize();
		boolean b23 = month20.isValid();
		boolean b24 = date15.equals((java.lang.Object) month20);
		int i25 = month20.getMonthSize();
		int i26 = month20.getMonth();
		boolean b27 = month8.equals((java.lang.Object) month20);
		int i28 = month8.getMonth();
		Day day29 = new Day(1, month8);
		boolean b30 = day29.increment();
		boolean b31 = day29.isValid();
		Date date36 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date37 = Nextday.nextDay(date36);
		Year year41 = new Year(1);
		boolean b42 = year41.isValid();
		boolean b43 = year41.isLeap();
		int i44 = year41.getYear();
		boolean b45 = year41.isLeap();
		Month month46 = new Month((int) (byte) 1, year41);
		Day day47 = new Day(31, month46);
		boolean b48 = day47.isValid();
		Year year52 = new Year((int) (byte) 100);
		boolean b53 = year52.isValid();
		Month month54 = new Month((int) (short) 10, year52);
		boolean b56 = month54.equals((java.lang.Object) 10L);
		int i57 = month54.getMonth();
		boolean b58 = month54.isValid();
		day47.setDay((int) (short) 1, month54);
		boolean b60 = date37.equals((java.lang.Object) month54);
		boolean b61 = month54.increment();
		try {
			day29.setDay((int) 'a', month54);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test855() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test401");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		Date date8 = Nextday.nextDay(date3);
		date3.printDate();
		Day day10 = date3.getDay();
		java.lang.String str11 = date3.toString();
		date3.printDate();
		Month month13 = date3.getMonth();
		Year year16 = new Year((int) (byte) 100);
		java.lang.Object obj17 = new java.lang.Object();
		boolean b18 = year16.equals(obj17);
		int i19 = year16.getYear();
		int i20 = year16.getYear();
		year16.setYear(1);
		boolean b23 = year16.isLeap();
		year16.setYear(101);
		try {
			month13.setMonth(52, year16);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test856() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test402");
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
		Month month14 = date13.getMonth();
		int i15 = month14.getMonthSize();
		boolean b16 = month14.isValid();
		Year year19 = new Year((int) (short) 1);
		boolean b20 = year19.isLeap();
		year19.setYear((int) (short) -1);
		int i23 = year19.getYear();
		try {
			month14.setMonth(52, year19);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test857() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test405");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Date date8 = Nextday.nextDay(date3);
		date8.increment();
		Day day10 = date8.getDay();
		boolean b12 = day10.equals((java.lang.Object) "5/13/102");
	}

	@Test
	public void test858() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test407");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		date3.increment();
		Month month9 = date3.getMonth();
		int i10 = month9.getMonthSize();
		boolean b11 = month9.isValid();
		int i12 = month9.getMonthSize();
	}

	@Test
	public void test859() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test408");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b5 = date3.equals((java.lang.Object) (-1));
		Year year7 = new Year(1);
		boolean b8 = year7.isValid();
		boolean b9 = year7.isLeap();
		int i10 = year7.getYear();
		boolean b11 = year7.isLeap();
		boolean b12 = year7.isLeap();
		boolean b13 = date3.equals((java.lang.Object) b12);
		Day day14 = date3.getDay();
		Month month15 = date3.getMonth();
		boolean b16 = month15.isValid();
		boolean b17 = month15.isValid();
		boolean b18 = month15.increment();
		int i19 = month15.getMonthSize();
	}

	@Test
	public void test860() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test409");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		boolean b8 = month7.increment();
		boolean b9 = month7.increment();
		Date date13 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date14 = Nextday.nextDay(date13);
		Year year17 = new Year((int) (byte) 100);
		boolean b18 = year17.isValid();
		Month month19 = new Month((int) (short) 10, year17);
		boolean b20 = month19.increment();
		int i21 = month19.getMonthSize();
		boolean b22 = month19.isValid();
		boolean b23 = date14.equals((java.lang.Object) month19);
		int i24 = month19.getMonthSize();
		int i25 = month19.getMonth();
		boolean b26 = month7.equals((java.lang.Object) month19);
		boolean b27 = month19.isValid();
		Date date32 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year33 = date32.getYear();
		boolean b35 = date32.equals((java.lang.Object) "hi!");
		java.lang.String str36 = date32.toString();
		Year year37 = date32.getYear();
		Date date38 = Nextday.nextDay(date32);
		Month month39 = date38.getMonth();
		date38.printDate();
		date38.increment();
		Year year42 = date38.getYear();
		int i43 = year42.getYear();
		try {
			month19.setMonth(0, year42);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test861() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test410");
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
		try {
			year14.setYear(0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test862() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test411");
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
		boolean b13 = year1.isValid();
		boolean b14 = year1.increment();
		year1.setYear((int) (byte) -1);
	}

	@Test
	public void test863() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test413");
		Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year6 = date5.getYear();
		boolean b8 = date5.equals((java.lang.Object) "hi!");
		Day day9 = date5.getDay();
		Year year13 = new Year((int) (byte) 100);
		boolean b14 = year13.isValid();
		Month month15 = new Month((int) (short) 10, year13);
		day9.setDay((int) (short) 10, month15);
		boolean b17 = month15.increment();
		int i18 = month15.getMonthSize();
		boolean b19 = month15.increment();
		boolean b20 = month15.isValid();
		Day day21 = new Day(30, month15);
		Day day22 = new Day(31, month15);
		Year year26 = new Year((int) (byte) 100);
		boolean b27 = year26.isValid();
		Month month28 = new Month((int) (short) 10, year26);
		boolean b29 = month28.increment();
		int i30 = month28.getMonth();
		int i31 = month28.getMonth();
		Year year33 = new Year(1);
		boolean b34 = year33.isLeap();
		int i35 = year33.getYear();
		year33.setYear(100);
		year33.setYear((-1));
		boolean b40 = month28.equals((java.lang.Object) year33);
		try {
			month15.setMonth((int) 'a', year33);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test864() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test418");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		Month month10 = date9.getMonth();
		boolean b11 = month10.increment();
		boolean b12 = month10.increment();
		java.lang.Object obj13 = null;
		boolean b14 = month10.equals(obj13);
		int i15 = month10.getMonthSize();
		Date date19 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year20 = date19.getYear();
		boolean b22 = date19.equals((java.lang.Object) "hi!");
		Month month23 = date19.getMonth();
		date19.printDate();
		java.lang.String str25 = date19.toString();
		Month month26 = date19.getMonth();
		Day day27 = date19.getDay();
		date19.increment();
		Year year29 = date19.getYear();
		boolean b30 = year29.increment();
		boolean b31 = month10.equals((java.lang.Object) year29);
	}

	@Test
	public void test865() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test420");
		Year year1 = new Year((int) (short) 1);
		boolean b2 = year1.isLeap();
		year1.setYear(31);
		boolean b5 = year1.increment();
		Date date9 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year10 = date9.getYear();
		boolean b12 = date9.equals((java.lang.Object) "hi!");
		date9.increment();
		date9.printDate();
		boolean b15 = year1.equals((java.lang.Object) date9);
		boolean b16 = year1.isValid();
		boolean b17 = year1.isValid();
	}

	@Test
	public void test866() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test421");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isLeap();
		int i4 = year1.getYear();
		boolean b5 = year1.increment();
		boolean b6 = year1.isValid();
	}

	@Test
	public void test867() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test422");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		boolean b8 = month7.increment();
		boolean b9 = month7.increment();
		Date date13 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date14 = Nextday.nextDay(date13);
		Year year17 = new Year((int) (byte) 100);
		boolean b18 = year17.isValid();
		Month month19 = new Month((int) (short) 10, year17);
		boolean b20 = month19.increment();
		int i21 = month19.getMonthSize();
		boolean b22 = month19.isValid();
		boolean b23 = date14.equals((java.lang.Object) month19);
		int i24 = month19.getMonthSize();
		int i25 = month19.getMonth();
		boolean b26 = month7.equals((java.lang.Object) month19);
		boolean b27 = month19.isValid();
		Year year29 = new Year(1);
		boolean b30 = year29.isValid();
		boolean b31 = year29.increment();
		boolean b32 = year29.increment();
		boolean b33 = year29.isLeap();
		int i34 = year29.getYear();
		boolean b35 = year29.isValid();
		boolean b36 = year29.isValid();
		boolean b37 = month19.equals((java.lang.Object) year29);
		boolean b38 = year29.isLeap();
	}

	@Test
	public void test868() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test427");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		Month month8 = date4.getMonth();
		date4.printDate();
		java.lang.String str10 = date4.toString();
		Day day11 = date4.getDay();
		boolean b12 = day11.isValid();
		Year year14 = new Year(1);
		boolean b15 = year14.increment();
		year14.setYear((int) ' ');
		boolean b18 = day11.equals((java.lang.Object) year14);
		int i19 = year14.getYear();
		try {
			Month month20 = new Month((int) '4', year14);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test869() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test428");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		Day day5 = date3.getDay();
	}

	@Test
	public void test870() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test431");
		try {
			Date date3 = new Date(4, (int) (byte) -1, 102);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test871() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test433");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		Date date8 = Nextday.nextDay(date3);
		Date date9 = Nextday.nextDay(date8);
		Month month10 = date8.getMonth();
		Month month11 = date8.getMonth();
		Year year14 = new Year(1);
		boolean b15 = year14.isLeap();
		int i16 = year14.getYear();
		year14.setYear(100);
		boolean b19 = year14.isValid();
		year14.setYear((-1));
		try {
			month11.setMonth((int) ' ', year14);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test872() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test434");
		Year year4 = new Year(52);
		Month month5 = new Month((int) (short) 10, year4);
		Month month6 = new Month(5, year4);
		Day day7 = new Day((int) (short) 10, month6);
		boolean b8 = day7.isValid();
	}

	@Test
	public void test873() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test435");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isValid();
		boolean b5 = year2.isLeap();
		int i6 = year2.getYear();
		Month month7 = new Month((int) (byte) 10, year2);
		Year year10 = new Year(1);
		boolean b11 = year10.isLeap();
		boolean b12 = year10.isLeap();
		boolean b13 = year10.increment();
		java.lang.Object obj14 = null;
		boolean b15 = year10.equals(obj14);
		int i16 = year10.getYear();
		boolean b17 = year10.increment();
		boolean b18 = year10.isLeap();
		boolean b19 = year10.isLeap();
		try {
			month7.setMonth(13, year10);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test874() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test440");
		try {
			Date date3 = new Date(2, 33, (int) (byte) 1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test875() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test444");
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
		Day day17 = date14.getDay();
		Month month18 = date14.getMonth();
		date14.printDate();
	}

	@Test
	public void test876() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test451");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		int i4 = year2.getYear();
		boolean b6 = year2.equals((java.lang.Object) 1);
		boolean b7 = year2.isValid();
		boolean b8 = year2.isLeap();
		year2.setYear(31);
		Month month11 = new Month(11, year2);
		boolean b12 = year2.isLeap();
		boolean b13 = year2.isLeap();
		Date date17 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year18 = date17.getYear();
		boolean b20 = date17.equals((java.lang.Object) "hi!");
		java.lang.String str21 = date17.toString();
		Year year22 = date17.getYear();
		Date date23 = Nextday.nextDay(date17);
		Month month24 = date23.getMonth();
		date23.printDate();
		date23.increment();
		Year year27 = date23.getYear();
		int i28 = year27.getYear();
		boolean b29 = year2.equals((java.lang.Object) year27);
		boolean b30 = year27.isValid();
	}

	@Test
	public void test877() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test452");
		Year year2 = new Year((int) (byte) 100);
		java.lang.Object obj3 = new java.lang.Object();
		boolean b4 = year2.equals(obj3);
		Date date8 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year9 = date8.getYear();
		boolean b11 = date8.equals((java.lang.Object) "hi!");
		Month month12 = date8.getMonth();
		boolean b13 = year2.equals((java.lang.Object) date8);
		Date date14 = Nextday.nextDay(date8);
		java.lang.String str15 = date14.toString();
		Year year17 = new Year(1);
		boolean b18 = year17.isLeap();
		boolean b19 = year17.isLeap();
		boolean b20 = year17.increment();
		java.lang.Object obj21 = null;
		boolean b22 = year17.equals(obj21);
		int i23 = year17.getYear();
		int i24 = year17.getYear();
		boolean b25 = year17.increment();
		boolean b26 = date14.equals((java.lang.Object) year17);
		Month month27 = new Month(3, year17);
		Date date32 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year33 = date32.getYear();
		boolean b35 = date32.equals((java.lang.Object) "hi!");
		date32.printDate();
		Year year37 = date32.getYear();
		date32.increment();
		Date date39 = Nextday.nextDay(date32);
		date39.printDate();
		java.lang.String str41 = date39.toString();
		Date date42 = Nextday.nextDay(date39);
		Year year43 = date42.getYear();
		try {
			month27.setMonth(101, year43);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test878() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test454");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Date date10 = Nextday.nextDay(date3);
		date10.increment();
		Date date12 = Nextday.nextDay(date10);
		Day day13 = date10.getDay();
	}

	@Test
	public void test879() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test457");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		Month month8 = date4.getMonth();
		boolean b9 = month8.increment();
		boolean b10 = month8.increment();
		Date date14 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date15 = Nextday.nextDay(date14);
		Year year18 = new Year((int) (byte) 100);
		boolean b19 = year18.isValid();
		Month month20 = new Month((int) (short) 10, year18);
		boolean b21 = month20.increment();
		int i22 = month20.getMonthSize();
		boolean b23 = month20.isValid();
		boolean b24 = date15.equals((java.lang.Object) month20);
		int i25 = month20.getMonthSize();
		int i26 = month20.getMonth();
		boolean b27 = month8.equals((java.lang.Object) month20);
		int i28 = month8.getMonth();
		Day day29 = new Day(1, month8);
		Year year34 = new Year((int) (byte) 100);
		boolean b35 = year34.isValid();
		Month month36 = new Month((int) (short) 10, year34);
		int i37 = month36.getMonth();
		Day day38 = new Day(1, month36);
		int i39 = month36.getMonthSize();
		try {
			day29.setDay((int) ' ', month36);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test880() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test458");
		Date date3 = new Date((int) (short) 10, 11, (int) (short) 100);
		Month month4 = date3.getMonth();
		Month month5 = date3.getMonth();
		Date date10 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year11 = date10.getYear();
		boolean b13 = date10.equals((java.lang.Object) "hi!");
		Day day14 = date10.getDay();
		Year year15 = date10.getYear();
		month5.setMonth((int) (byte) 10, year15);
		int i17 = month5.getMonth();
	}

	@Test
	public void test881() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test459");
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
		boolean b23 = month16.isValid();
		int i24 = month16.getMonth();
		boolean b25 = month16.increment();
	}

	@Test
	public void test882() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test461");
		Year year2 = new Year(52);
		Month month3 = new Month((int) (short) 10, year2);
		Year year6 = new Year(1);
		boolean b7 = year6.isValid();
		boolean b8 = year6.isValid();
		boolean b9 = year6.isLeap();
		boolean b10 = year6.isLeap();
		int i11 = year6.getYear();
		boolean b12 = year6.increment();
		boolean b13 = year6.increment();
		boolean b15 = year6.equals((java.lang.Object) "10/10/1");
		boolean b16 = year6.isLeap();
		int i17 = year6.getYear();
		boolean b18 = year6.isValid();
		try {
			month3.setMonth(35, year6);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test883() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test462");
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
		boolean b21 = day7.isValid();
		int i22 = day7.getDay();
		boolean b23 = day7.increment();
		int i24 = day7.getDay();
		boolean b25 = day7.increment();
		boolean b26 = day7.isValid();
		boolean b27 = day7.increment();
	}

	@Test
	public void test884() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test464");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		int i6 = month5.getMonth();
		Day day7 = new Day(30, month5);
		int i8 = day7.getDay();
		boolean b9 = day7.isValid();
		boolean b10 = day7.increment();
		boolean b11 = day7.isValid();
		boolean b12 = day7.isValid();
		boolean b13 = day7.isValid();
	}

	@Test
	public void test885() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test465");
		try {
			Date date3 = new Date(97, 5, 31);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test886() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test468");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		date3.printDate();
		java.lang.String str7 = date3.toString();
		Day day8 = date3.getDay();
		Date date9 = Nextday.nextDay(date3);
		Month month10 = date9.getMonth();
		date9.printDate();
	}

	@Test
	public void test887() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test469");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isValid();
		boolean b4 = year1.isLeap();
		boolean b5 = year1.isLeap();
		boolean b6 = year1.increment();
		boolean b7 = year1.isValid();
	}

	@Test
	public void test888() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test470");
		try {
			Date date3 = new Date((-1), 1, 30);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test889() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test471");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		java.lang.String str8 = date4.toString();
		boolean b10 = date4.equals((java.lang.Object) (short) 100);
		Date date11 = Nextday.nextDay(date4);
		date11.increment();
		Month month13 = date11.getMonth();
		java.lang.String str14 = date11.toString();
		Month month15 = date11.getMonth();
		Day day16 = new Day(2, month15);
		boolean b17 = day16.increment();
		boolean b18 = day16.isValid();
	}

	@Test
	public void test890() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test472");
		Year year1 = new Year(1);
		boolean b2 = year1.increment();
		int i3 = year1.getYear();
		boolean b4 = year1.increment();
		year1.setYear(12);
		year1.setYear(12);
		Year year11 = new Year((int) (byte) 100);
		Month month12 = new Month((int) (short) 1, year11);
		int i13 = month12.getMonth();
		boolean b14 = year1.equals((java.lang.Object) month12);
	}

	@Test
	public void test891() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test473");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.increment();
		boolean b4 = year1.increment();
		boolean b5 = year1.increment();
		boolean b6 = year1.isValid();
		boolean b7 = year1.isValid();
	}

	@Test
	public void test892() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test474");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.increment();
		boolean b5 = year2.increment();
		boolean b6 = year2.isLeap();
		year2.setYear(11);
		boolean b9 = year2.isLeap();
		Month month10 = new Month((int) (byte) 10, year2);
		boolean b11 = month10.increment();
	}

	@Test
	public void test893() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test475");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b5 = month4.increment();
		int i6 = month4.getMonth();
		Date date10 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year11 = date10.getYear();
		boolean b13 = date10.equals((java.lang.Object) "hi!");
		java.lang.String str14 = date10.toString();
		Day day15 = date10.getDay();
		Day day16 = date10.getDay();
		boolean b17 = month4.equals((java.lang.Object) day16);
	}

	@Test
	public void test894() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test477");
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
		boolean b20 = day7.isValid();
	}

	@Test
	public void test895() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test479");
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
		Year year15 = date14.getYear();
	}

	@Test
	public void test896() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test480");
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
		boolean b29 = month22.isValid();
		boolean b30 = month22.isValid();
		int i31 = month22.getMonthSize();
		try {
			Day day32 = new Day(35, month22);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test897() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test481");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		java.lang.String str4 = date3.toString();
		Date date5 = Nextday.nextDay(date3);
		Day day6 = date5.getDay();
	}

	@Test
	public void test898() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test482");
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
		boolean b17 = day16.isValid();
		boolean b18 = day16.isValid();
		Year year20 = new Year(34);
		boolean b21 = day16.equals((java.lang.Object) year20);
		boolean b22 = day16.increment();
	}

	@Test
	public void test899() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test484");
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
		boolean b17 = month15.isValid();
	}

	@Test
	public void test900() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test486");
		try {
			Date date3 = new Date(28, 0, 0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test901() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test488");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		date3.increment();
		date3.increment();
		Date date7 = Nextday.nextDay(date3);
		Month month8 = date7.getMonth();
	}

	@Test
	public void test902() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test493");
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
		boolean b15 = year14.isLeap();
	}

	@Test
	public void test903() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test498");
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
		boolean b16 = day15.isValid();
		Year year18 = new Year(1);
		boolean b19 = year18.isValid();
		boolean b20 = year18.isValid();
		boolean b21 = year18.isValid();
		boolean b22 = year18.isValid();
		boolean b23 = year18.isValid();
		year18.setYear((int) ' ');
		boolean b26 = day15.equals((java.lang.Object) year18);
		int i27 = day15.getDay();
	}

	@Test
	public void test904() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest3.test500");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		date3.printDate();
		java.lang.String str7 = date3.toString();
		Day day8 = date3.getDay();
		Date date9 = Nextday.nextDay(date3);
		Date date10 = Nextday.nextDay(date9);
		Day day11 = date10.getDay();
		Day day12 = date10.getDay();
		boolean b13 = day12.increment();
	}

	@Test
	public void test905() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test001");
		Month month1 = null;
		try {
			Day day2 = new Day(0, month1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test906() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test003");
		Date date0 = null;
		try {
			Date date1 = Nextday.nextDay(date0);
		} catch (java.lang.NullPointerException e) {
		}
	}

	@Test
	public void test907() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test004");
		Year year1 = null;
		try {
			Month month2 = new Month(0, year1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test908() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test005");
		Nextday nextday0 = new Nextday();
	}

	@Test
	public void test909() throws Throwable {
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
	public void test910() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test012");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isValid();
		boolean b5 = year2.isValid();
		try {
			Month month6 = new Month((int) '#', year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test911() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test019");
		try {
			Date date3 = new Date((int) (byte) 100, (-1), 1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test912() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test021");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		try {
			Month month4 = new Month((int) (short) -1, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test913() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test022");
		Month month1 = null;
		try {
			Day day2 = new Day((int) (short) 1, month1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test914() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test023");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		boolean b3 = year1.isLeap();
		boolean b4 = year1.increment();
		boolean b5 = year1.isLeap();
		try {
			year1.setYear((int) (byte) 0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test915() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test024");
		try {
			Date date3 = new Date((int) '#', (int) '#', 2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test916() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test027");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		int i5 = month4.getMonth();
		Year year8 = new Year((int) (short) 1);
		try {
			month4.setMonth(0, year8);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test917() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test028");
		Year year1 = new Year((int) (short) 1);
		boolean b2 = year1.isLeap();
		try {
			year1.setYear(0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test918() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test030");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isValid();
		int i5 = year2.getYear();
		year2.setYear((int) (byte) -1);
		try {
			Month month8 = new Month((int) (short) 0, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test919() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test032");
		try {
			Date date3 = new Date(31, 2, (int) 'a');
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test920() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test033");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		int i5 = month4.getMonth();
		Year year8 = new Year((int) (short) 1);
		boolean b9 = year8.isLeap();
		month4.setMonth((int) (short) 10, year8);
		int i11 = month4.getMonthSize();
		Year year14 = new Year(1);
		boolean b15 = year14.isValid();
		boolean b16 = year14.isValid();
		boolean b17 = year14.isLeap();
		boolean b18 = year14.isLeap();
		int i19 = year14.getYear();
		try {
			month4.setMonth((int) '#', year14);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test921() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test034");
		try {
			Date date3 = new Date((-1), 10, 2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test922() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test035");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		boolean b4 = year2.isLeap();
		try {
			Month month5 = new Month((-1), year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test923() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test040");
		Month month1 = null;
		try {
			Day day2 = new Day((int) '4', month1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test924() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test041");
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
	public void test925() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test042");
		Year year4 = new Year(1);
		boolean b5 = year4.isValid();
		boolean b6 = year4.isLeap();
		int i7 = year4.getYear();
		boolean b8 = year4.isLeap();
		Month month9 = new Month((int) (byte) 1, year4);
		Year year11 = new Year(1);
		boolean b12 = year11.isLeap();
		boolean b13 = year11.isLeap();
		boolean b14 = year4.equals((java.lang.Object) year11);
		Month month15 = new Month((int) (short) 1, year4);
		try {
			Day day16 = new Day((int) (short) -1, month15);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test926() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test044");
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
	public void test927() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test046");
		try {
			Date date3 = new Date((int) '4', (int) '#', 2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test928() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test049");
		try {
			Date date3 = new Date(0, (int) ' ', 1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test929() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test054");
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
	public void test930() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test055");
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
	public void test931() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test056");
		try {
			Date date3 = new Date(10, 0, 0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test932() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test057");
		Year year1 = null;
		try {
			Month month2 = new Month((int) 'a', year1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test933() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test060");
		try {
			Date date3 = new Date(1, 31, (int) (byte) 0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test934() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test061");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isLeap();
		int i6 = year3.getYear();
		boolean b7 = year3.isLeap();
		Month month8 = new Month((int) (byte) 1, year3);
		int i9 = month8.getMonthSize();
		int i10 = month8.getMonthSize();
		try {
			Day day11 = new Day(100, month8);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test935() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test062");
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
		Date date26 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year27 = date26.getYear();
		boolean b29 = date26.equals((java.lang.Object) "hi!");
		Month month30 = date26.getMonth();
		int i31 = month30.getMonthSize();
		boolean b33 = month30.equals((java.lang.Object) 0L);
		try {
			day9.setDay((int) (byte) 100, month30);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test936() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test064");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date4.printDate();
		Year year6 = date4.getYear();
		try {
			Month month7 = new Month((int) (short) -1, year6);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test937() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test067");
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
	public void test938() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test069");
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
	public void test939() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test071");
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
	public void test940() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test073");
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
	public void test941() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test074");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		int i5 = month4.getMonth();
		Year year8 = new Year((int) (short) 1);
		boolean b9 = year8.isLeap();
		month4.setMonth((int) (short) 10, year8);
		Year year13 = new Year((int) (short) 100);
		try {
			month4.setMonth(32, year13);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test942() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test076");
		try {
			Date date3 = new Date((int) (byte) 100, (int) (short) -1, 32);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test943() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test077");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isValid();
		Month month6 = new Month((int) (short) 10, year3);
		try {
			Day day7 = new Day((-1), month6);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test944() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test079");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b6 = month4.equals((java.lang.Object) 10L);
		boolean b7 = month4.isValid();
		int i8 = month4.getMonthSize();
		Year year11 = new Year(1);
		boolean b12 = year11.isValid();
		boolean b13 = year11.isValid();
		boolean b14 = year11.isValid();
		boolean b15 = year11.isValid();
		int i16 = year11.getYear();
		boolean b17 = year11.increment();
		boolean b18 = year11.increment();
		boolean b19 = year11.increment();
		boolean b20 = year11.increment();
		try {
			month4.setMonth((int) (short) 100, year11);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test945() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test084");
		try {
			Date date3 = new Date((int) (short) 0, (int) (byte) 1, 1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test946() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test086");
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
		Date date24 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year25 = date24.getYear();
		boolean b27 = date24.equals((java.lang.Object) "hi!");
		Month month28 = date24.getMonth();
		int i29 = month28.getMonthSize();
		int i30 = month28.getMonthSize();
		Year year32 = new Year(1);
		boolean b33 = year32.isValid();
		boolean b34 = year32.isValid();
		boolean b35 = year32.isValid();
		boolean b36 = month28.equals((java.lang.Object) year32);
		try {
			day7.setDay((int) (byte) 100, month28);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test947() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test088");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		int i4 = year2.getYear();
		try {
			Month month5 = new Month(30, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test948() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test092");
		try {
			Date date3 = new Date(32, 30, (int) (short) 0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test949() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test093");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		int i6 = month5.getMonth();
		Year year9 = new Year((int) (short) 1);
		boolean b10 = year9.isLeap();
		month5.setMonth((int) (short) 10, year9);
		int i12 = month5.getMonthSize();
		int i13 = month5.getMonth();
		try {
			Day day14 = new Day((int) (byte) 0, month5);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test950() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test101");
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
	public void test951() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test102");
		try {
			Date date3 = new Date(31, 0, 100);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test952() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test103");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isLeap();
		int i5 = year2.getYear();
		boolean b6 = year2.isLeap();
		Month month7 = new Month((int) (byte) 1, year2);
		Year year10 = new Year(1);
		boolean b11 = year10.isLeap();
		int i12 = year10.getYear();
		boolean b14 = year10.equals((java.lang.Object) 1);
		boolean b15 = year10.isValid();
		try {
			month7.setMonth((int) (byte) 0, year10);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test953() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test104");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isValid();
		boolean b4 = year1.isLeap();
		int i5 = year1.getYear();
		boolean b6 = year1.increment();
		try {
			year1.setYear(0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test954() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test108");
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
	public void test955() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test110");
		Year year2 = new Year((int) (short) 1);
		boolean b3 = year2.isLeap();
		year2.setYear((int) (short) -1);
		try {
			Month month6 = new Month(100, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test956() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test117");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		date3.printDate();
		Year year6 = date3.getYear();
		date3.increment();
	}

	@Test
	public void test957() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test118");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isValid();
		Month month6 = new Month((int) (short) 10, year3);
		int i7 = month6.getMonthSize();
		try {
			Day day8 = new Day((int) (short) -1, month6);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test958() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test119");
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
	public void test959() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test122");
		try {
			Date date3 = new Date((int) '#', 100, (int) ' ');
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test960() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test123");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		int i3 = year1.getYear();
		year1.setYear(100);
		boolean b6 = year1.isLeap();
		year1.setYear(3);
	}

	@Test
	public void test961() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test125");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		Year year7 = new Year((int) (byte) 100);
		boolean b8 = year7.isValid();
		Month month9 = new Month((int) (short) 10, year7);
		boolean b10 = month9.increment();
		int i11 = month9.getMonthSize();
		boolean b12 = month9.isValid();
		boolean b13 = date4.equals((java.lang.Object) month9);
		int i14 = month9.getMonthSize();
		Date date19 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date20 = Nextday.nextDay(date19);
		Year year24 = new Year(1);
		boolean b25 = year24.isValid();
		boolean b26 = year24.isLeap();
		int i27 = year24.getYear();
		boolean b28 = year24.isLeap();
		Month month29 = new Month((int) (byte) 1, year24);
		Day day30 = new Day(31, month29);
		boolean b31 = day30.isValid();
		Year year35 = new Year((int) (byte) 100);
		boolean b36 = year35.isValid();
		Month month37 = new Month((int) (short) 10, year35);
		boolean b39 = month37.equals((java.lang.Object) 10L);
		int i40 = month37.getMonth();
		boolean b41 = month37.isValid();
		day30.setDay((int) (short) 1, month37);
		boolean b43 = date20.equals((java.lang.Object) month37);
		Year year44 = date20.getYear();
		try {
			month9.setMonth((int) (byte) 0, year44);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test962() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test126");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Year year10 = date3.getYear();
		Month month11 = date3.getMonth();
		int i12 = month11.getMonthSize();
		Year year16 = new Year(1);
		boolean b17 = year16.isLeap();
		boolean b18 = year16.isLeap();
		Date date22 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year23 = date22.getYear();
		boolean b25 = date22.equals((java.lang.Object) "hi!");
		date22.increment();
		java.lang.String str27 = date22.toString();
		boolean b28 = year16.equals((java.lang.Object) date22);
		Month month29 = new Month((int) (short) 10, year16);
		try {
			month11.setMonth(0, year16);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test963() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test127");
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
		Date date25 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date26 = Nextday.nextDay(date25);
		Year year30 = new Year(1);
		boolean b31 = year30.isValid();
		boolean b32 = year30.isLeap();
		int i33 = year30.getYear();
		boolean b34 = year30.isLeap();
		Month month35 = new Month((int) (byte) 1, year30);
		Day day36 = new Day(31, month35);
		boolean b37 = day36.isValid();
		Year year41 = new Year((int) (byte) 100);
		boolean b42 = year41.isValid();
		Month month43 = new Month((int) (short) 10, year41);
		boolean b45 = month43.equals((java.lang.Object) 10L);
		int i46 = month43.getMonth();
		boolean b47 = month43.isValid();
		day36.setDay((int) (short) 1, month43);
		boolean b49 = date26.equals((java.lang.Object) month43);
		boolean b50 = month43.isValid();
		boolean b51 = month43.isValid();
		try {
			day7.setDay((int) 'a', month43);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test964() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test128");
		try {
			Date date3 = new Date(31, 101, (int) (short) 100);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test965() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test130");
		try {
			Date date3 = new Date((int) ' ', 32, 1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test966() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test132");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		date3.printDate();
		Day day11 = date3.getDay();
		int i12 = day11.getDay();
		Year year16 = new Year(1);
		boolean b17 = year16.isLeap();
		boolean b18 = year16.isLeap();
		java.lang.Object obj19 = new java.lang.Object();
		boolean b20 = year16.equals(obj19);
		boolean b21 = year16.isValid();
		Month month22 = new Month((int) (byte) 10, year16);
		try {
			day11.setDay((int) (short) -1, month22);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test967() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test133");
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
	public void test968() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test135");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Year year10 = date3.getYear();
		Date date11 = Nextday.nextDay(date3);
		java.lang.String str12 = date3.toString();
		date3.printDate();
	}

	@Test
	public void test969() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test136");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		boolean b6 = month5.increment();
		boolean b7 = month5.isValid();
		boolean b9 = month5.equals((java.lang.Object) 1);
		try {
			Day day10 = new Day((int) (byte) 0, month5);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test970() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test137");
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
	public void test971() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test138");
		Year year4 = new Year((int) (byte) 100);
		boolean b5 = year4.isValid();
		Month month6 = new Month((int) (short) 10, year4);
		int i7 = month6.getMonth();
		Day day8 = new Day(30, month6);
		try {
			Day day9 = new Day(0, month6);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test972() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test139");
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
	public void test973() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test140");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Year year11 = new Year((int) (byte) 100);
		boolean b12 = year11.isValid();
		Month month13 = new Month((int) (short) 10, year11);
		day7.setDay((int) (short) 10, month13);
		int i15 = day7.getDay();
		Date date20 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b22 = date20.equals((java.lang.Object) (-1));
		Year year24 = new Year(1);
		boolean b25 = year24.isValid();
		boolean b26 = year24.isLeap();
		int i27 = year24.getYear();
		boolean b28 = year24.isLeap();
		boolean b29 = year24.isLeap();
		boolean b30 = date20.equals((java.lang.Object) b29);
		java.lang.String str31 = date20.toString();
		Month month32 = date20.getMonth();
		Month month33 = date20.getMonth();
		try {
			day7.setDay(100, month33);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test974() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test142");
		try {
			Year year1 = new Year((int) (short) 0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test975() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test145");
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
	public void test976() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test148");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b6 = date4.equals((java.lang.Object) (-1));
		Year year8 = new Year(1);
		boolean b9 = year8.isValid();
		boolean b10 = year8.isLeap();
		int i11 = year8.getYear();
		boolean b12 = year8.isLeap();
		boolean b13 = year8.isLeap();
		boolean b14 = date4.equals((java.lang.Object) b13);
		java.lang.String str15 = date4.toString();
		Month month16 = date4.getMonth();
		Month month17 = date4.getMonth();
		try {
			Day day18 = new Day((-1), month17);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test977() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test150");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isLeap();
		int i6 = year3.getYear();
		boolean b7 = year3.isLeap();
		Month month8 = new Month((int) (byte) 1, year3);
		Day day9 = new Day(31, month8);
		boolean b10 = day9.increment();
		boolean b11 = day9.increment();
		Date date16 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year17 = date16.getYear();
		boolean b19 = date16.equals((java.lang.Object) "hi!");
		Day day20 = date16.getDay();
		Year year21 = date16.getYear();
		Month month22 = date16.getMonth();
		int i23 = month22.getMonth();
		try {
			day9.setDay(100, month22);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test978() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test152");
		Year year1 = new Year(1);
		boolean b2 = year1.increment();
		int i3 = year1.getYear();
		boolean b4 = year1.isLeap();
	}

	@Test
	public void test979() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test153");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b6 = month4.equals((java.lang.Object) 10L);
		boolean b7 = month4.increment();
		boolean b8 = month4.isValid();
	}

	@Test
	public void test980() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test157");
		try {
			Date date3 = new Date(10, 52, 52);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test981() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test159");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		Day day9 = date3.getDay();
		boolean b10 = day9.isValid();
		int i11 = day9.getDay();
		int i12 = day9.getDay();
		boolean b13 = day9.increment();
		Date date18 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year19 = date18.getYear();
		boolean b21 = date18.equals((java.lang.Object) "hi!");
		Month month22 = date18.getMonth();
		int i23 = month22.getMonthSize();
		int i24 = month22.getMonthSize();
		Year year26 = new Year(1);
		boolean b27 = year26.isValid();
		boolean b28 = year26.isValid();
		boolean b29 = year26.isValid();
		boolean b30 = month22.equals((java.lang.Object) year26);
		try {
			day9.setDay((int) '4', month22);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test982() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test162");
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
		Month month30 = date17.getMonth();
		boolean b31 = month30.increment();
		try {
			day12.setDay(32, month30);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test983() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test165");
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
	public void test984() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test167");
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
	public void test985() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test168");
		try {
			Date date3 = new Date(0, 100, 11);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test986() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test170");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isValid();
		int i4 = year1.getYear();
		year1.setYear((int) (byte) -1);
		boolean b7 = year1.isValid();
		boolean b8 = year1.increment();
	}

	@Test
	public void test987() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test171");
		try {
			Date date3 = new Date(3, 100, (int) 'a');
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test988() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test173");
		try {
			Date date3 = new Date((int) ' ', (int) (short) -1, (-1));
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test989() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test176");
		Year year1 = null;
		try {
			Month month2 = new Month(52, year1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test990() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test177");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isLeap();
		int i5 = year2.getYear();
		boolean b6 = year2.isLeap();
		java.lang.Object obj7 = null;
		boolean b8 = year2.equals(obj7);
		try {
			Month month9 = new Month(101, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test991() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test182");
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
	public void test992() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test184");
		try {
			Date date3 = new Date((int) (short) 100, 101, (int) (byte) 0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test993() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test188");
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
		Year year25 = new Year((int) (byte) 100);
		boolean b26 = year25.isValid();
		Month month27 = new Month((int) (short) 10, year25);
		boolean b28 = month27.increment();
		boolean b29 = month27.increment();
		try {
			day9.setDay(100, month27);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test994() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test189");
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
	public void test995() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test191");
		try {
			Date date3 = new Date((int) 'a', 32, (int) (short) 1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test996() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test192");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		java.lang.String str8 = date4.toString();
		Year year9 = date4.getYear();
		try {
			Month month10 = new Month(30, year9);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test997() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test198");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		Year year8 = new Year((int) (byte) 100);
		boolean b9 = year8.isValid();
		Month month10 = new Month((int) (short) 10, year8);
		boolean b11 = month10.increment();
		boolean b12 = date4.equals((java.lang.Object) month10);
		Year year13 = date4.getYear();
		Date date14 = Nextday.nextDay(date4);
		Month month15 = date4.getMonth();
		try {
			Day day16 = new Day(0, month15);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test998() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test202");
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
		Date date25 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b27 = date25.equals((java.lang.Object) (-1));
		Year year29 = new Year(1);
		boolean b30 = year29.isValid();
		boolean b31 = year29.isLeap();
		int i32 = year29.getYear();
		boolean b33 = year29.isLeap();
		boolean b34 = year29.isLeap();
		boolean b35 = date25.equals((java.lang.Object) b34);
		Date date36 = Nextday.nextDay(date25);
		date25.increment();
		Month month38 = date25.getMonth();
		try {
			day7.setDay((int) (byte) 100, month38);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test999() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test206");
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
	public void test1000() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test207");
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
		int i19 = day7.getDay();
		int i20 = day7.getDay();
		Year year23 = new Year((int) (byte) 100);
		int i24 = year23.getYear();
		Year year27 = new Year(1);
		boolean b28 = year27.isValid();
		boolean b29 = year27.isLeap();
		int i30 = year27.getYear();
		boolean b31 = year27.isLeap();
		Month month32 = new Month((int) (byte) 1, year27);
		int i33 = month32.getMonthSize();
		boolean b34 = year23.equals((java.lang.Object) month32);
		try {
			day7.setDay(52, month32);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1001() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test209");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Year year11 = new Year((int) (byte) 100);
		boolean b12 = year11.isValid();
		Month month13 = new Month((int) (short) 10, year11);
		day7.setDay((int) (short) 10, month13);
		boolean b15 = month13.increment();
		Date date20 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date21 = Nextday.nextDay(date20);
		Day day22 = date21.getDay();
		Year year23 = date21.getYear();
		boolean b24 = year23.isValid();
		int i25 = year23.getYear();
		try {
			month13.setMonth(0, year23);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1002() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test212");
		try {
			Date date3 = new Date((int) (short) -1, 102, 101);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1003() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test214");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		boolean b3 = year1.isLeap();
		boolean b4 = year1.increment();
		boolean b5 = year1.isLeap();
		boolean b6 = year1.isValid();
		boolean b7 = year1.increment();
	}

	@Test
	public void test1004() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test218");
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
	public void test1005() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test219");
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
	public void test1006() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test221");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		boolean b4 = year2.isLeap();
		boolean b5 = year2.increment();
		Month month6 = new Month((int) (short) 1, year2);
		Year year8 = new Year(1);
		boolean b9 = year8.isValid();
		boolean b10 = year8.isValid();
		boolean b11 = year8.isValid();
		boolean b12 = year8.isValid();
		boolean b13 = year8.isValid();
		year8.setYear((int) ' ');
		int i16 = year8.getYear();
		boolean b17 = month6.equals((java.lang.Object) i16);
		Year year20 = new Year(1);
		boolean b21 = year20.isValid();
		boolean b22 = year20.isValid();
		boolean b23 = year20.isLeap();
		boolean b24 = year20.isLeap();
		int i25 = year20.getYear();
		try {
			month6.setMonth(102, year20);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1007() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test222");
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
	public void test1008() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test225");
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
	public void test1009() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test227");
		Year year2 = new Year((int) (short) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month(12, year2);
		boolean b5 = year2.isLeap();
	}

	@Test
	public void test1010() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test228");
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
	public void test1011() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test231");
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
	public void test1012() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test232");
		try {
			Date date3 = new Date(0, 102, (int) (byte) -1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1013() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test239");
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
	public void test1014() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test241");
		Year year1 = new Year((int) (byte) 100);
		boolean b2 = year1.isValid();
		int i3 = year1.getYear();
		boolean b4 = year1.isValid();
	}

	@Test
	public void test1015() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test242");
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
	public void test1016() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test243");
		Year year1 = new Year(1);
		year1.setYear(32);
		boolean b4 = year1.isLeap();
	}

	@Test
	public void test1017() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test247");
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
	public void test1018() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test248");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		Year year7 = new Year((int) (byte) 100);
		boolean b8 = year7.isValid();
		Month month9 = new Month((int) (short) 10, year7);
		boolean b10 = month9.increment();
		boolean b11 = date3.equals((java.lang.Object) month9);
		Year year13 = new Year(1);
		boolean b14 = year13.isValid();
		boolean b15 = year13.increment();
		boolean b16 = month9.equals((java.lang.Object) year13);
		Year year19 = new Year(1);
		boolean b20 = year19.isValid();
		boolean b21 = year19.isValid();
		int i22 = year19.getYear();
		boolean b23 = year19.isLeap();
		try {
			month9.setMonth((int) (short) -1, year19);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1019() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test252");
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
	public void test1020() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test254");
		Year year1 = new Year((int) (byte) 100);
		boolean b2 = year1.isValid();
		boolean b3 = year1.increment();
		year1.setYear((int) '4');
		boolean b6 = year1.isLeap();
	}

	@Test
	public void test1021() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test257");
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
	public void test1022() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test258");
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
	public void test1023() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test259");
		try {
			Date date3 = new Date(1, 33, (int) ' ');
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1024() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test261");
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
	public void test1025() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test263");
		Month month1 = null;
		try {
			Day day2 = new Day((int) (byte) 10, month1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1026() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test265");
		try {
			Date date3 = new Date((int) (short) -1, (int) (byte) 1, 33);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1027() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test267");
		try {
			Date date3 = new Date((int) (short) 0, (int) (short) 1, (int) ' ');
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1028() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test268");
		try {
			Date date3 = new Date((int) (short) 0, 31, 28);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1029() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test270");
		Year year2 = new Year((int) (byte) 100);
		int i3 = year2.getYear();
		int i4 = year2.getYear();
		Month month5 = new Month((int) (short) 1, year2);
		boolean b6 = year2.isLeap();
	}

	@Test
	public void test1030() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test272");
		try {
			Date date3 = new Date((int) 'a', 3, (-1));
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1031() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test273");
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
	public void test1032() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test277");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		Date date8 = Nextday.nextDay(date3);
		Date date9 = Nextday.nextDay(date8);
		date8.increment();
		java.lang.String str11 = date8.toString();
	}

	@Test
	public void test1033() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test279");
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
		Date date25 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date26 = Nextday.nextDay(date25);
		Year year29 = new Year((int) (byte) 100);
		boolean b30 = year29.isValid();
		Month month31 = new Month((int) (short) 10, year29);
		boolean b32 = month31.increment();
		int i33 = month31.getMonthSize();
		boolean b34 = month31.isValid();
		boolean b35 = date26.equals((java.lang.Object) month31);
		int i36 = month31.getMonthSize();
		int i37 = month31.getMonth();
		try {
			day7.setDay(100, month31);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1034() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test280");
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
		boolean b20 = day7.increment();
		int i21 = day7.getDay();
		boolean b23 = day7.equals((java.lang.Object) 33);
	}

	@Test
	public void test1035() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test287");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isValid();
		boolean b4 = year1.isLeap();
		boolean b5 = year1.increment();
		int i6 = year1.getYear();
		boolean b7 = year1.increment();
		boolean b8 = year1.isLeap();
		int i9 = year1.getYear();
	}

	@Test
	public void test1036() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test288");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Day day8 = date3.getDay();
		Day day9 = date3.getDay();
		int i10 = day9.getDay();
		Date date15 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year16 = date15.getYear();
		boolean b18 = date15.equals((java.lang.Object) "hi!");
		java.lang.String str19 = date15.toString();
		Year year20 = date15.getYear();
		Date date21 = Nextday.nextDay(date15);
		Month month22 = date21.getMonth();
		boolean b23 = month22.isValid();
		int i24 = month22.getMonth();
		try {
			day9.setDay((int) (byte) -1, month22);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1037() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test289");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		date3.printDate();
		java.lang.String str9 = date3.toString();
		Day day10 = date3.getDay();
		date3.increment();
		java.lang.String str12 = date3.toString();
		Day day13 = date3.getDay();
	}

	@Test
	public void test1038() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test290");
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
	public void test1039() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test292");
		try {
			Date date3 = new Date((int) (short) 1, 100, 102);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1040() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test294");
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
	public void test1041() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test297");
		try {
			Date date3 = new Date(3, 1, 0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1042() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test298");
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
	public void test1043() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test302");
		try {
			Date date3 = new Date(100, (int) (short) 0, 3);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1044() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test303");
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
		date14.increment();
		date14.printDate();
	}

	@Test
	public void test1045() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test305");
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
	public void test1046() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test308");
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
	public void test1047() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test309");
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
	public void test1048() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test310");
		Date date3 = new Date(11, 3, 28);
	}

	@Test
	public void test1049() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test313");
		Year year1 = new Year((int) (byte) 100);
		java.lang.Object obj2 = new java.lang.Object();
		boolean b3 = year1.equals(obj2);
		boolean b4 = year1.isValid();
	}

	@Test
	public void test1050() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test316");
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
	public void test1051() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test317");
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
		date14.increment();
		boolean b17 = date14.equals((java.lang.Object) "");
		date14.printDate();
	}

	@Test
	public void test1052() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test319");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		Date date6 = Nextday.nextDay(date3);
		Day day7 = date6.getDay();
		boolean b8 = day7.increment();
		Year year12 = new Year(1);
		boolean b13 = year12.isValid();
		boolean b14 = year12.isValid();
		Month month15 = new Month((int) (short) 10, year12);
		int i16 = month15.getMonthSize();
		try {
			day7.setDay((int) (short) -1, month15);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1053() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test320");
		Date date3 = new Date((int) (short) 1, 1, (int) 'a');
	}

	@Test
	public void test1054() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test321");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isValid();
		boolean b5 = year2.isLeap();
		boolean b6 = year2.isLeap();
		boolean b7 = year2.isValid();
		Year year11 = new Year((int) (byte) 100);
		boolean b12 = year11.isValid();
		Month month13 = new Month((int) (short) 10, year11);
		boolean b14 = month13.increment();
		int i15 = month13.getMonthSize();
		boolean b16 = month13.isValid();
		Day day17 = new Day(10, month13);
		boolean b18 = year2.equals((java.lang.Object) month13);
		try {
			Day day19 = new Day(31, month13);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1055() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test322");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		boolean b4 = year2.isLeap();
		boolean b5 = year2.increment();
		Month month6 = new Month((int) (short) 1, year2);
		Date date10 = new Date(10, (int) (byte) 10, (int) (short) 1);
		java.lang.String str11 = date10.toString();
		boolean b12 = month6.equals((java.lang.Object) date10);
		Year year15 = new Year(1);
		boolean b16 = year15.isValid();
		boolean b17 = year15.increment();
		boolean b18 = year15.increment();
		boolean b19 = year15.isLeap();
		year15.setYear(11);
		try {
			month6.setMonth(102, year15);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1056() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test327");
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
		boolean b27 = year1.isLeap();
	}

	@Test
	public void test1057() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test328");
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
		int i21 = day7.getDay();
	}

	@Test
	public void test1058() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test329");
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
		Year year16 = new Year(1);
		boolean b17 = year16.isLeap();
		int i18 = year16.getYear();
		boolean b19 = year16.isValid();
		int i20 = year16.getYear();
		try {
			month4.setMonth((int) (byte) 0, year16);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1059() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test330");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		Year year11 = new Year((int) '#');
		Date date15 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year16 = date15.getYear();
		boolean b18 = date15.equals((java.lang.Object) "hi!");
		date15.printDate();
		Year year20 = date15.getYear();
		Year year22 = new Year(1);
		boolean b23 = year22.isValid();
		boolean b24 = year22.isValid();
		boolean b25 = year22.isLeap();
		boolean b26 = year22.increment();
		int i27 = year22.getYear();
		boolean b28 = date15.equals((java.lang.Object) year22);
		boolean b29 = year11.equals((java.lang.Object) year22);
		try {
			month8.setMonth(0, year11);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1060() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test332");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Year year10 = date3.getYear();
		year10.setYear(32);
	}

	@Test
	public void test1061() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test333");
		try {
			Date date3 = new Date((int) (byte) 100, (int) (short) 10, (int) '4');
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1062() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test336");
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
			Month month19 = new Month((int) '#', year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1063() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test337");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		boolean b4 = year2.increment();
		boolean b5 = year2.increment();
		boolean b6 = year2.isLeap();
		try {
			Month month7 = new Month(52, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1064() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test338");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		boolean b3 = year1.isLeap();
		boolean b4 = year1.increment();
		java.lang.Object obj5 = null;
		boolean b6 = year1.equals(obj5);
		int i7 = year1.getYear();
		int i8 = year1.getYear();
		boolean b9 = year1.increment();
		Year year11 = new Year((int) (byte) 100);
		Date date15 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b16 = year11.equals((java.lang.Object) 10);
		boolean b17 = year1.equals((java.lang.Object) b16);
		year1.setYear((int) '4');
	}

	@Test
	public void test1065() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test339");
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
		int i20 = day7.getDay();
		boolean b21 = day7.increment();
		boolean b22 = day7.increment();
		Year year26 = new Year((int) (byte) 100);
		boolean b27 = year26.isValid();
		Month month28 = new Month((int) (short) 10, year26);
		int i29 = month28.getMonth();
		Year year32 = new Year((int) (short) 1);
		boolean b33 = year32.isLeap();
		month28.setMonth((int) (short) 10, year32);
		int i35 = month28.getMonth();
		try {
			day7.setDay(101, month28);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1066() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test340");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b6 = date4.equals((java.lang.Object) (-1));
		Year year8 = new Year(1);
		boolean b9 = year8.isValid();
		boolean b10 = year8.isLeap();
		int i11 = year8.getYear();
		boolean b12 = year8.isLeap();
		boolean b13 = year8.isLeap();
		boolean b14 = date4.equals((java.lang.Object) b13);
		java.lang.String str15 = date4.toString();
		Month month16 = date4.getMonth();
		Month month17 = date4.getMonth();
		boolean b18 = month17.increment();
		int i19 = month17.getMonthSize();
		try {
			Day day20 = new Day(32, month17);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1067() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test345");
		try {
			Date date3 = new Date(100, (int) (short) 0, (int) (byte) 10);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1068() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test346");
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
		int i15 = month5.getMonthSize();
		try {
			Day day16 = new Day((int) (short) 0, month5);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1069() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test348");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		date3.printDate();
		java.lang.String str7 = date3.toString();
		java.lang.String str8 = date3.toString();
		date3.printDate();
	}

	@Test
	public void test1070() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test349");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Date date10 = Nextday.nextDay(date3);
		date3.increment();
	}

	@Test
	public void test1071() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test350");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		boolean b6 = month5.increment();
		int i7 = month5.getMonthSize();
		try {
			Day day8 = new Day((int) (short) 0, month5);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1072() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test352");
		try {
			Date date3 = new Date(102, (int) (short) 1, (int) ' ');
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1073() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test353");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		date3.printDate();
		java.lang.String str9 = date3.toString();
		Year year10 = date3.getYear();
		year10.setYear(10);
		int i13 = year10.getYear();
	}

	@Test
	public void test1074() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test354");
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
		int i22 = day7.getDay();
	}

	@Test
	public void test1075() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test355");
		try {
			Date date3 = new Date(101, 3, 3);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1076() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test356");
		Year year1 = new Year((int) (byte) 100);
		java.lang.Object obj2 = new java.lang.Object();
		boolean b3 = year1.equals(obj2);
		Date date7 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year8 = date7.getYear();
		boolean b10 = date7.equals((java.lang.Object) "hi!");
		Month month11 = date7.getMonth();
		boolean b12 = year1.equals((java.lang.Object) date7);
		Day day13 = date7.getDay();
		Day day14 = date7.getDay();
		Date date19 = new Date((int) (short) 10, 11, (int) (short) 100);
		Month month20 = date19.getMonth();
		try {
			day14.setDay((int) '4', month20);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1077() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test357");
		try {
			Date date3 = new Date(32, (int) (short) 10, (int) (short) 1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1078() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test360");
		Year year2 = new Year(1);
		boolean b3 = year2.increment();
		year2.setYear((int) ' ');
		try {
			Month month6 = new Month(0, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1079() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test361");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		Day day9 = date3.getDay();
		boolean b10 = day9.isValid();
		int i11 = day9.getDay();
		int i12 = day9.getDay();
		boolean b13 = day9.increment();
		boolean b14 = day9.isValid();
		Year year19 = new Year(1);
		boolean b20 = year19.isValid();
		boolean b21 = year19.isLeap();
		int i22 = year19.getYear();
		boolean b23 = year19.isLeap();
		Month month24 = new Month((int) (byte) 1, year19);
		Day day25 = new Day(10, month24);
		try {
			day9.setDay((int) '#', month24);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1080() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test362");
		try {
			Date date3 = new Date((int) '4', 12, 11);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1081() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test363");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b5 = month4.increment();
		int i6 = month4.getMonthSize();
		Year year9 = new Year((int) (byte) 100);
		Date date13 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b14 = year9.equals((java.lang.Object) 10);
		int i15 = year9.getYear();
		try {
			month4.setMonth((-1), year9);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1082() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test366");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		Date date6 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year7 = date6.getYear();
		boolean b9 = date6.equals((java.lang.Object) "hi!");
		boolean b10 = year1.equals((java.lang.Object) date6);
		boolean b11 = year1.isLeap();
	}

	@Test
	public void test1083() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test367");
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
		day10.setDay((int) (short) 1, month17);
		boolean b23 = month17.isValid();
		try {
			Day day24 = new Day((int) (byte) -1, month17);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1084() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test369");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		boolean b4 = year2.isLeap();
		boolean b5 = year2.increment();
		Month month6 = new Month((int) (short) 1, year2);
		year2.setYear(11);
	}

	@Test
	public void test1085() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test371");
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
		boolean b15 = month5.isValid();
		boolean b16 = month5.increment();
		try {
			Day day17 = new Day((int) (short) 100, month5);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1086() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test372");
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
		boolean b15 = year13.isValid();
		boolean b16 = year13.isLeap();
		boolean b17 = year13.increment();
		boolean b18 = year13.increment();
		try {
			month8.setMonth((-1), year13);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1087() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test373");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b6 = month4.equals((java.lang.Object) 10L);
		boolean b7 = month4.increment();
		boolean b8 = month4.increment();
		int i9 = month4.getMonthSize();
		boolean b10 = month4.increment();
		try {
			int i11 = month4.getMonthSize();
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
		}
	}

	@Test
	public void test1088() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test375");
		try {
			Date date3 = new Date(102, (int) '4', (int) (short) 100);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1089() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test376");
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
		int i17 = day16.getDay();
	}

	@Test
	public void test1090() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test377");
		try {
			Date date3 = new Date((int) (short) -1, 30, 10);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1091() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test381");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		date3.printDate();
		java.lang.String str10 = date3.toString();
		Month month11 = date3.getMonth();
		Year year14 = new Year(1);
		boolean b15 = year14.isLeap();
		boolean b16 = year14.isLeap();
		boolean b17 = year14.increment();
		year14.setYear(2);
		try {
			month11.setMonth(100, year14);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1092() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test384");
		try {
			Date date3 = new Date(2, (int) '4', 101);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1093() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test385");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		Day day8 = date4.getDay();
		Year year9 = date4.getYear();
		Month month10 = date4.getMonth();
		try {
			Day day11 = new Day((int) (byte) 0, month10);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1094() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test387");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		int i6 = month5.getMonth();
		Year year9 = new Year((int) (short) 1);
		boolean b10 = year9.isLeap();
		month5.setMonth((int) (short) 10, year9);
		int i12 = month5.getMonthSize();
		boolean b13 = month5.isValid();
		try {
			Day day14 = new Day((int) (short) -1, month5);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1095() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test388");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		date3.printDate();
		Month month6 = date3.getMonth();
		Date date7 = Nextday.nextDay(date3);
		Day day8 = date7.getDay();
		Date date13 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year14 = date13.getYear();
		boolean b16 = date13.equals((java.lang.Object) "hi!");
		java.lang.String str17 = date13.toString();
		boolean b19 = date13.equals((java.lang.Object) (short) 100);
		Year year20 = date13.getYear();
		Date date21 = Nextday.nextDay(date13);
		date21.increment();
		Month month23 = date21.getMonth();
		try {
			day8.setDay(32, month23);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1096() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test390");
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
		Month month16 = date13.getMonth();
		Year year19 = new Year((int) (byte) 100);
		Date date23 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b24 = year19.equals((java.lang.Object) 10);
		int i25 = year19.getYear();
		boolean b26 = year19.isValid();
		try {
			month16.setMonth((int) '4', year19);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1097() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test391");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		Year year7 = new Year((int) (byte) 100);
		boolean b8 = year7.isValid();
		Month month9 = new Month((int) (short) 10, year7);
		boolean b10 = month9.increment();
		boolean b11 = date3.equals((java.lang.Object) month9);
		Year year13 = new Year(1);
		boolean b14 = year13.isValid();
		boolean b15 = year13.increment();
		boolean b16 = month9.equals((java.lang.Object) year13);
		boolean b17 = year13.isValid();
	}

	@Test
	public void test1098() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test392");
		Date date3 = new Date(11, 1, 12);
	}

	@Test
	public void test1099() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test393");
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
			month15.setMonth(0, year20);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1100() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test395");
		try {
			Date date3 = new Date(100, 2, 1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1101() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test397");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Year year11 = new Year(1);
		boolean b12 = year11.isValid();
		boolean b13 = year11.isValid();
		Month month14 = new Month((int) (short) 10, year11);
		Year year17 = new Year((int) (byte) 100);
		boolean b18 = year17.isValid();
		Month month19 = new Month((int) (short) 10, year17);
		boolean b20 = year17.increment();
		boolean b21 = month14.equals((java.lang.Object) year17);
		try {
			day7.setDay((int) (short) 100, month14);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1102() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test398");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		date3.printDate();
		java.lang.String str9 = date3.toString();
		Year year11 = new Year(1);
		boolean b12 = year11.isLeap();
		boolean b13 = year11.isLeap();
		boolean b14 = year11.increment();
		java.lang.Object obj15 = null;
		boolean b16 = year11.equals(obj15);
		int i17 = year11.getYear();
		boolean b18 = year11.isLeap();
		boolean b19 = date3.equals((java.lang.Object) b18);
		date3.printDate();
	}

	@Test
	public void test1103() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test400");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		date3.printDate();
		java.lang.String str7 = date3.toString();
		Day day8 = date3.getDay();
		boolean b9 = day8.increment();
		boolean b10 = day8.isValid();
		int i11 = day8.getDay();
	}

	@Test
	public void test1104() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test401");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		Month month5 = date3.getMonth();
		Year year8 = new Year((int) (short) 1);
		boolean b9 = year8.isLeap();
		year8.setYear(31);
		boolean b12 = year8.increment();
		year8.setYear((int) (short) 10);
		Year year16 = new Year((int) (short) 1);
		boolean b17 = year16.isLeap();
		boolean b18 = year16.isLeap();
		boolean b19 = year8.equals((java.lang.Object) year16);
		try {
			month5.setMonth(100, year16);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1105() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test403");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isValid();
		Month month6 = new Month((int) (short) 10, year3);
		Year year9 = new Year((int) (byte) 100);
		boolean b10 = year9.isValid();
		Month month11 = new Month((int) (short) 10, year9);
		boolean b12 = year9.increment();
		boolean b13 = month6.equals((java.lang.Object) year9);
		try {
			Month month14 = new Month((int) (byte) 100, year9);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1106() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test404");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b6 = month4.equals((java.lang.Object) 10L);
		boolean b7 = month4.isValid();
		boolean b8 = month4.isValid();
		Year year10 = new Year(1);
		boolean b11 = year10.isValid();
		boolean b12 = year10.isLeap();
		int i13 = year10.getYear();
		boolean b14 = month4.equals((java.lang.Object) year10);
		int i15 = month4.getMonthSize();
		Year year18 = new Year(1);
		boolean b19 = year18.isValid();
		boolean b20 = year18.isLeap();
		int i21 = year18.getYear();
		boolean b22 = year18.isLeap();
		boolean b23 = year18.isValid();
		try {
			month4.setMonth((int) (short) -1, year18);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1107() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test405");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isValid();
		Month month5 = new Month((int) (short) 10, year2);
		int i6 = month5.getMonthSize();
		int i7 = month5.getMonth();
		int i8 = month5.getMonth();
		Year year12 = new Year(1);
		boolean b13 = year12.isLeap();
		boolean b14 = year12.isLeap();
		java.lang.Object obj15 = new java.lang.Object();
		boolean b16 = year12.equals(obj15);
		boolean b17 = year12.isValid();
		Month month18 = new Month((int) (byte) 10, year12);
		try {
			month5.setMonth(31, year12);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1108() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test406");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		date3.printDate();
		java.lang.String str10 = date3.toString();
		Day day11 = date3.getDay();
		boolean b12 = day11.increment();
		Year year16 = new Year((int) (byte) 100);
		boolean b17 = year16.isValid();
		Month month18 = new Month((int) (short) 10, year16);
		boolean b19 = month18.increment();
		boolean b20 = month18.increment();
		boolean b21 = month18.isValid();
		boolean b22 = month18.increment();
		Year year24 = new Year(1);
		year24.setYear(32);
		boolean b27 = month18.equals((java.lang.Object) year24);
		try {
			day11.setDay((int) 'a', month18);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1109() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test408");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		int i6 = month5.getMonth();
		Day day7 = new Day(30, month5);
		int i8 = day7.getDay();
		boolean b9 = day7.isValid();
		boolean b10 = day7.isValid();
	}

	@Test
	public void test1110() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test409");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isValid();
		int i4 = year1.getYear();
		Year year6 = new Year(1);
		boolean b7 = year6.isLeap();
		int i8 = year6.getYear();
		boolean b9 = year1.equals((java.lang.Object) i8);
		year1.setYear((-1));
		year1.setYear((int) (short) -1);
		boolean b14 = year1.isLeap();
	}

	@Test
	public void test1111() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test410");
		Year year1 = new Year((int) (byte) 100);
		boolean b2 = year1.isValid();
		boolean b3 = year1.increment();
		int i4 = year1.getYear();
	}

	@Test
	public void test1112() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test412");
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
		Year year21 = new Year(1);
		boolean b22 = year21.isValid();
		boolean b23 = year21.increment();
		try {
			month12.setMonth(0, year21);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1113() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test414");
		Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year6 = date5.getYear();
		boolean b8 = date5.equals((java.lang.Object) "hi!");
		java.lang.String str9 = date5.toString();
		boolean b11 = date5.equals((java.lang.Object) (short) 100);
		Date date12 = Nextday.nextDay(date5);
		date12.increment();
		date12.printDate();
		Year year15 = date12.getYear();
		boolean b16 = year15.increment();
		int i17 = year15.getYear();
		Month month18 = new Month(10, year15);
		boolean b19 = month18.increment();
		try {
			Day day20 = new Day(0, month18);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1114() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test417");
		try {
			Date date3 = new Date(28, (int) (byte) 1, (int) (byte) 1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1115() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test420");
		try {
			Date date3 = new Date(5, (int) '#', (int) (short) 1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1116() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test421");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Day day8 = date3.getDay();
		Day day9 = date3.getDay();
		date3.printDate();
		Year year13 = new Year((int) (byte) 100);
		boolean b14 = year13.isValid();
		Month month15 = new Month((int) (short) 10, year13);
		boolean b16 = month15.increment();
		int i17 = month15.getMonth();
		int i18 = month15.getMonth();
		int i19 = month15.getMonthSize();
		boolean b20 = date3.equals((java.lang.Object) month15);
		Date date25 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year26 = date25.getYear();
		Year year29 = new Year((int) (byte) 100);
		boolean b30 = year29.isValid();
		Month month31 = new Month((int) (short) 10, year29);
		boolean b32 = month31.increment();
		boolean b33 = date25.equals((java.lang.Object) month31);
		Year year34 = date25.getYear();
		java.lang.String str35 = date25.toString();
		date25.increment();
		Day day37 = date25.getDay();
		Day day38 = date25.getDay();
		Day day39 = date25.getDay();
		Month month40 = date25.getMonth();
		Date date46 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b48 = date46.equals((java.lang.Object) (-1));
		Year year49 = date46.getYear();
		Month month50 = new Month(3, year49);
		month40.setMonth((int) (short) 10, year49);
		boolean b52 = year49.increment();
		try {
			month15.setMonth(31, year49);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1117() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test424");
		try {
			Date date3 = new Date((int) 'a', (int) '#', 2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1118() throws Throwable {
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
		Date date13 = Nextday.nextDay(date3);
		date13.increment();
		Month month15 = date13.getMonth();
		boolean b16 = month15.isValid();
	}

	@Test
	public void test1119() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test427");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b5 = year4.isValid();
		int i6 = year4.getYear();
		boolean b7 = year4.increment();
	}

	@Test
	public void test1120() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test429");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		boolean b4 = year2.isLeap();
		boolean b5 = year2.increment();
		int i6 = year2.getYear();
		try {
			Month month7 = new Month((int) (short) -1, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1121() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test431");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		int i3 = year1.getYear();
		boolean b5 = year1.equals((java.lang.Object) 1);
		year1.setYear(32);
		boolean b8 = year1.isLeap();
		boolean b9 = year1.isLeap();
	}

	@Test
	public void test1122() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test432");
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
		int i20 = day7.getDay();
		boolean b21 = day7.isValid();
		Year year25 = new Year((int) (byte) 100);
		boolean b26 = year25.isValid();
		Month month27 = new Month((int) (short) 10, year25);
		boolean b28 = month27.increment();
		boolean b29 = month27.increment();
		Date date33 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year34 = date33.getYear();
		date33.printDate();
		boolean b36 = month27.equals((java.lang.Object) date33);
		java.lang.Object obj37 = null;
		boolean b38 = month27.equals(obj37);
		try {
			day7.setDay((int) (short) 100, month27);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1123() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test437");
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
		boolean b16 = month15.increment();
	}

	@Test
	public void test1124() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test438");
		Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b7 = date5.equals((java.lang.Object) (-1));
		Year year9 = new Year(1);
		boolean b10 = year9.isValid();
		boolean b11 = year9.isLeap();
		int i12 = year9.getYear();
		boolean b13 = year9.isLeap();
		boolean b14 = year9.isLeap();
		boolean b15 = date5.equals((java.lang.Object) b14);
		Date date16 = Nextday.nextDay(date5);
		Year year17 = date16.getYear();
		Month month18 = new Month((int) (byte) 1, year17);
		try {
			Day day19 = new Day(0, month18);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1125() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test439");
		Year year3 = new Year(11);
		boolean b4 = year3.increment();
		Month month5 = new Month(3, year3);
		try {
			Day day6 = new Day(101, month5);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1126() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test440");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Year year11 = new Year((int) (byte) 100);
		boolean b12 = year11.isValid();
		Month month13 = new Month((int) (short) 10, year11);
		day7.setDay((int) (short) 10, month13);
		Year year17 = new Year(101);
		boolean b18 = year17.isValid();
		try {
			month13.setMonth((int) (short) 100, year17);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1127() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test441");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		int i3 = year1.getYear();
		year1.setYear(100);
		boolean b6 = year1.isValid();
		year1.setYear((-1));
		year1.setYear(33);
	}

	@Test
	public void test1128() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test442");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		int i3 = year1.getYear();
		year1.setYear(100);
		year1.setYear((int) '4');
		int i8 = year1.getYear();
		year1.setYear(12);
		boolean b11 = year1.isValid();
	}

	@Test
	public void test1129() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test444");
		Year year1 = new Year(31);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isLeap();
	}

	@Test
	public void test1130() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test445");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		Day day6 = date3.getDay();
		Day day7 = date3.getDay();
		boolean b8 = day7.increment();
	}

	@Test
	public void test1131() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test450");
		Year year1 = new Year((int) (byte) 100);
		boolean b2 = year1.isValid();
		boolean b3 = year1.increment();
		boolean b4 = year1.increment();
	}

	@Test
	public void test1132() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test451");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.printDate();
		Year year8 = date3.getYear();
		date3.increment();
		Date date10 = Nextday.nextDay(date3);
		Month month11 = date10.getMonth();
		java.lang.String str12 = date10.toString();
		java.lang.String str13 = date10.toString();
		java.lang.String str14 = date10.toString();
		date10.increment();
	}

	@Test
	public void test1133() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test452");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		Month month10 = date3.getMonth();
		boolean b11 = month10.increment();
		Year year15 = new Year(1);
		boolean b16 = year15.isLeap();
		boolean b17 = year15.isLeap();
		boolean b18 = year15.increment();
		Month month19 = new Month((int) (short) 1, year15);
		Date date23 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date24 = Nextday.nextDay(date23);
		Day day25 = date24.getDay();
		Year year26 = date24.getYear();
		Year year27 = date24.getYear();
		boolean b28 = month19.equals((java.lang.Object) year27);
		try {
			month10.setMonth(102, year27);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1134() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test455");
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
		Year year17 = new Year(1);
		boolean b18 = year17.isLeap();
		boolean b19 = year17.isLeap();
		boolean b20 = date4.equals((java.lang.Object) year17);
		Month month21 = new Month((int) (byte) 10, year17);
		boolean b22 = year17.isValid();
		boolean b23 = year17.isValid();
	}

	@Test
	public void test1135() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test459");
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
		date14.increment();
	}

	@Test
	public void test1136() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test463");
		Year year1 = new Year((int) (byte) 100);
		java.lang.Object obj2 = new java.lang.Object();
		boolean b3 = year1.equals(obj2);
		Date date7 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year8 = date7.getYear();
		boolean b10 = date7.equals((java.lang.Object) "hi!");
		Month month11 = date7.getMonth();
		boolean b12 = year1.equals((java.lang.Object) date7);
		Day day13 = date7.getDay();
		Year year15 = new Year((int) (short) 100);
		boolean b16 = year15.increment();
		Year year18 = new Year(1);
		boolean b19 = year18.isValid();
		int i20 = year18.getYear();
		year18.setYear(100);
		boolean b23 = year15.equals((java.lang.Object) year18);
		boolean b24 = day13.equals((java.lang.Object) year18);
		boolean b25 = year18.increment();
		year18.setYear((int) '#');
	}

	@Test
	public void test1137() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test464");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		int i5 = month4.getMonth();
		Year year8 = new Year((int) (short) 1);
		boolean b9 = year8.isLeap();
		month4.setMonth((int) (short) 10, year8);
		boolean b11 = year8.isLeap();
		try {
			year8.setYear((int) (byte) 0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1138() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test466");
		Year year2 = new Year((int) (byte) 100);
		int i3 = year2.getYear();
		Year year6 = new Year(1);
		boolean b7 = year6.isValid();
		boolean b8 = year6.isLeap();
		int i9 = year6.getYear();
		boolean b10 = year6.isLeap();
		Month month11 = new Month((int) (byte) 1, year6);
		int i12 = month11.getMonthSize();
		boolean b13 = year2.equals((java.lang.Object) month11);
		boolean b14 = month11.isValid();
		try {
			Day day15 = new Day(102, month11);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1139() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test467");
		Year year1 = new Year(101);
		boolean b2 = year1.isValid();
		boolean b3 = year1.increment();
	}

	@Test
	public void test1140() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test468");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		int i3 = year1.getYear();
		year1.setYear(100);
		boolean b6 = year1.increment();
		Date date10 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year11 = date10.getYear();
		boolean b13 = date10.equals((java.lang.Object) "hi!");
		java.lang.String str14 = date10.toString();
		boolean b16 = date10.equals((java.lang.Object) (short) 100);
		Year year17 = date10.getYear();
		Date date18 = Nextday.nextDay(date10);
		date10.increment();
		boolean b20 = year1.equals((java.lang.Object) date10);
	}

	@Test
	public void test1141() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test469");
		try {
			Date date3 = new Date((int) 'a', (int) '#', 12);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1142() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test472");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		date3.printDate();
		java.lang.String str9 = date3.toString();
		Month month10 = date3.getMonth();
		Year year11 = date3.getYear();
		java.lang.String str12 = date3.toString();
		Day day13 = date3.getDay();
	}

	@Test
	public void test1143() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test473");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		Month month10 = date9.getMonth();
		date9.printDate();
		date9.increment();
		Month month13 = date9.getMonth();
		Year year16 = new Year(1);
		boolean b17 = year16.isValid();
		boolean b18 = year16.isLeap();
		int i19 = year16.getYear();
		Year year21 = new Year(1);
		boolean b22 = year21.isValid();
		boolean b23 = year21.isLeap();
		int i24 = year21.getYear();
		boolean b25 = year21.isLeap();
		boolean b26 = year16.equals((java.lang.Object) b25);
		try {
			month13.setMonth(32, year16);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1144() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test474");
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
		java.lang.String str16 = date3.toString();
	}

	@Test
	public void test1145() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test475");
		Year year2 = new Year(52);
		Month month3 = new Month((int) (short) 10, year2);
		boolean b4 = month3.isValid();
		Year year7 = new Year((int) (byte) 100);
		int i8 = year7.getYear();
		Year year11 = new Year(1);
		boolean b12 = year11.isValid();
		boolean b13 = year11.isLeap();
		int i14 = year11.getYear();
		boolean b15 = year11.isLeap();
		Month month16 = new Month((int) (byte) 1, year11);
		int i17 = month16.getMonthSize();
		boolean b18 = year7.equals((java.lang.Object) month16);
		year7.setYear(100);
		try {
			month3.setMonth((-1), year7);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1146() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test476");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b6 = date4.equals((java.lang.Object) (-1));
		Year year7 = date4.getYear();
		Month month8 = new Month(3, year7);
		Year year11 = new Year(3);
		month8.setMonth(11, year11);
		boolean b13 = month8.increment();
		boolean b14 = month8.increment();
		try {
			int i15 = month8.getMonthSize();
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
		}
	}

	@Test
	public void test1147() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test477");
		try {
			Date date3 = new Date(0, (int) (short) -1, (int) '#');
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1148() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test479");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		int i4 = year2.getYear();
		boolean b6 = year2.equals((java.lang.Object) 1);
		year2.setYear(32);
		boolean b9 = year2.isLeap();
		try {
			Month month10 = new Month(33, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1149() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test483");
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
		Month month28 = date27.getMonth();
		Year year31 = new Year(1);
		year31.setYear(32);
		try {
			month28.setMonth(32, year31);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1150() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test486");
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
			Month month14 = new Month((int) 'a', year3);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1151() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test487");
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
			Day day30 = new Day(32, month22);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1152() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test488");
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
		boolean b17 = month16.increment();
		boolean b18 = month16.isValid();
		Year year21 = new Year(101);
		boolean b22 = year21.isValid();
		year21.setYear((int) '#');
		try {
			month16.setMonth(33, year21);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1153() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test492");
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
		boolean b20 = day16.isValid();
		Date date25 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year26 = date25.getYear();
		boolean b28 = date25.equals((java.lang.Object) "hi!");
		Month month29 = date25.getMonth();
		Year year31 = new Year(1);
		boolean b32 = year31.isValid();
		boolean b33 = year31.increment();
		boolean b34 = year31.increment();
		boolean b35 = month29.equals((java.lang.Object) b34);
		try {
			day16.setDay((int) (short) -1, month29);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1154() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test493");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		Month month8 = date4.getMonth();
		int i9 = month8.getMonthSize();
		boolean b10 = month8.increment();
		Day day11 = new Day(2, month8);
		boolean b12 = month8.increment();
		boolean b13 = month8.isValid();
	}

	@Test
	public void test1155() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test494");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		int i6 = month5.getMonth();
		Day day7 = new Day(1, month5);
		Date date12 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year13 = date12.getYear();
		boolean b15 = date12.equals((java.lang.Object) "hi!");
		date12.printDate();
		Year year17 = date12.getYear();
		int i18 = year17.getYear();
		try {
			month5.setMonth(97, year17);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1156() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test496");
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
		int i25 = month8.getMonthSize();
		int i26 = month8.getMonth();
	}

	@Test
	public void test1157() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test497");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isLeap();
		int i6 = year3.getYear();
		boolean b7 = year3.isLeap();
		Month month8 = new Month((int) (byte) 1, year3);
		Day day9 = new Day(10, month8);
		boolean b10 = month8.isValid();
		boolean b11 = month8.isValid();
	}

	@Test
	public void test1158() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test001");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isValid();
		boolean b5 = year2.isLeap();
		boolean b6 = year2.increment();
		try {
			Month month7 = new Month((int) '4', year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1159() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test003");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		int i3 = year1.getYear();
		year1.setYear(100);
		boolean b6 = year1.isValid();
		boolean b7 = year1.isValid();
	}

	@Test
	public void test1160() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test005");
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
			Day day30 = new Day(52, month22);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1161() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test006");
		Year year2 = new Year(52);
		try {
			Month month3 = new Month(100, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1162() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test011");
		Date date3 = new Date(11, 28, (int) (byte) 10);
	}

	@Test
	public void test1163() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test013");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Day day8 = date3.getDay();
		Day day9 = date3.getDay();
		date3.printDate();
		date3.printDate();
		date3.increment();
	}

	@Test
	public void test1164() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test014");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Year year10 = date3.getYear();
		Date date11 = Nextday.nextDay(date3);
		date3.increment();
		Day day13 = date3.getDay();
	}

	@Test
	public void test1165() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test015");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.increment();
		boolean b5 = year2.increment();
		boolean b6 = year2.isLeap();
		int i7 = year2.getYear();
		Month month8 = new Month(1, year2);
		boolean b9 = year2.increment();
		int i10 = year2.getYear();
	}

	@Test
	public void test1166() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test019");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		boolean b6 = year5.increment();
	}

	@Test
	public void test1167() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test020");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		Day day9 = date3.getDay();
		boolean b10 = day9.isValid();
		int i11 = day9.getDay();
		int i12 = day9.getDay();
		Year year16 = new Year((int) '#');
		Date date20 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year21 = date20.getYear();
		boolean b23 = date20.equals((java.lang.Object) "hi!");
		date20.printDate();
		Year year25 = date20.getYear();
		Year year27 = new Year(1);
		boolean b28 = year27.isValid();
		boolean b29 = year27.isValid();
		boolean b30 = year27.isLeap();
		boolean b31 = year27.increment();
		int i32 = year27.getYear();
		boolean b33 = date20.equals((java.lang.Object) year27);
		boolean b34 = year16.equals((java.lang.Object) year27);
		Month month35 = new Month((int) (byte) 1, year27);
		try {
			day9.setDay(33, month35);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1168() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test022");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Date date10 = Nextday.nextDay(date3);
		date10.increment();
		Month month12 = date10.getMonth();
		date10.printDate();
	}

	@Test
	public void test1169() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test025");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isValid();
		boolean b4 = year1.isLeap();
		boolean b5 = year1.increment();
		boolean b6 = year1.increment();
		boolean b7 = year1.isLeap();
	}

	@Test
	public void test1170() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test027");
		Year year1 = new Year((int) (byte) 1);
		int i2 = year1.getYear();
		year1.setYear(30);
	}

	@Test
	public void test1171() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test029");
		try {
			Date date3 = new Date(32, 0, (int) (byte) 10);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1172() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test030");
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
		date3.printDate();
		date3.increment();
	}

	@Test
	public void test1173() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test031");
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
		Month month33 = null;
		try {
			day17.setDay(13, month33);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1174() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test034");
		Year year1 = new Year(1);
		boolean b2 = year1.increment();
		int i3 = year1.getYear();
		boolean b4 = year1.isValid();
		boolean b5 = year1.increment();
	}

	@Test
	public void test1175() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test038");
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
		Month month15 = date13.getMonth();
		Year year16 = date13.getYear();
		boolean b17 = year16.isLeap();
	}

	@Test
	public void test1176() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test040");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isValid();
		boolean b4 = year1.isLeap();
		boolean b5 = year1.isLeap();
		int i6 = year1.getYear();
		int i7 = year1.getYear();
		boolean b8 = year1.increment();
		year1.setYear(32);
	}

	@Test
	public void test1177() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test042");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		date3.printDate();
		java.lang.String str9 = date3.toString();
		Month month10 = date3.getMonth();
		int i11 = month10.getMonthSize();
		Year year14 = new Year(1);
		boolean b15 = year14.isLeap();
		boolean b16 = year14.isLeap();
		boolean b17 = year14.increment();
		java.lang.Object obj18 = null;
		boolean b19 = year14.equals(obj18);
		int i20 = year14.getYear();
		boolean b21 = year14.isLeap();
		int i22 = year14.getYear();
		Date date26 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year27 = date26.getYear();
		boolean b29 = date26.equals((java.lang.Object) "hi!");
		Day day30 = date26.getDay();
		Year year34 = new Year((int) (byte) 100);
		boolean b35 = year34.isValid();
		Month month36 = new Month((int) (short) 10, year34);
		day30.setDay((int) (short) 10, month36);
		java.lang.Object obj38 = null;
		boolean b39 = day30.equals(obj38);
		boolean b40 = day30.increment();
		int i41 = day30.getDay();
		boolean b42 = day30.increment();
		boolean b43 = day30.isValid();
		boolean b44 = year14.equals((java.lang.Object) day30);
		try {
			month10.setMonth(0, year14);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1178() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test043");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Year year10 = date3.getYear();
		Date date11 = Nextday.nextDay(date3);
		date11.increment();
		date11.printDate();
		date11.increment();
		date11.printDate();
		date11.increment();
	}

	@Test
	public void test1179() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test045");
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
		Year year19 = new Year((int) (byte) 100);
		java.lang.Object obj20 = new java.lang.Object();
		boolean b21 = year19.equals(obj20);
		Date date25 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year26 = date25.getYear();
		boolean b28 = date25.equals((java.lang.Object) "hi!");
		Month month29 = date25.getMonth();
		boolean b30 = year19.equals((java.lang.Object) date25);
		Date date31 = Nextday.nextDay(date25);
		Month month32 = date31.getMonth();
		Day day33 = new Day(11, month32);
		try {
			day14.setDay(101, month32);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1180() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test046");
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
		boolean b19 = day16.isValid();
		Year year23 = new Year((int) (byte) 100);
		boolean b24 = year23.isValid();
		Month month25 = new Month((int) (short) 10, year23);
		boolean b26 = month25.increment();
		boolean b27 = month25.isValid();
		boolean b29 = month25.equals((java.lang.Object) 1);
		try {
			day16.setDay(33, month25);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1181() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test047");
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
		Date date25 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year26 = date25.getYear();
		boolean b28 = date25.equals((java.lang.Object) "hi!");
		java.lang.String str29 = date25.toString();
		boolean b31 = date25.equals((java.lang.Object) (short) 100);
		Date date32 = Nextday.nextDay(date25);
		date32.increment();
		date32.printDate();
		Year year35 = date32.getYear();
		boolean b36 = year35.increment();
		boolean b37 = year35.isValid();
		Month month38 = new Month(3, year35);
		try {
			day7.setDay((int) ' ', month38);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1182() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test048");
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
		Day day28 = date27.getDay();
		Month month29 = date27.getMonth();
		Year year31 = null;
		try {
			month29.setMonth(13, year31);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1183() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test049");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		boolean b3 = year1.isLeap();
		boolean b4 = year1.increment();
		java.lang.Object obj5 = null;
		boolean b6 = year1.equals(obj5);
		int i7 = year1.getYear();
		Date date11 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date11.printDate();
		Year year13 = date11.getYear();
		Date date14 = Nextday.nextDay(date11);
		Date date15 = Nextday.nextDay(date11);
		boolean b16 = year1.equals((java.lang.Object) date15);
		Date date17 = Nextday.nextDay(date15);
		date15.printDate();
		boolean b20 = date15.equals((java.lang.Object) 0.0d);
	}

	@Test
	public void test1184() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test050");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		Day day9 = date3.getDay();
		boolean b10 = day9.isValid();
		int i11 = day9.getDay();
		int i12 = day9.getDay();
		boolean b13 = day9.isValid();
		boolean b14 = day9.increment();
		int i15 = day9.getDay();
	}

	@Test
	public void test1185() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test051");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		boolean b8 = month7.increment();
		boolean b9 = month7.increment();
		Date date13 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date14 = Nextday.nextDay(date13);
		Year year17 = new Year((int) (byte) 100);
		boolean b18 = year17.isValid();
		Month month19 = new Month((int) (short) 10, year17);
		boolean b20 = month19.increment();
		int i21 = month19.getMonthSize();
		boolean b22 = month19.isValid();
		boolean b23 = date14.equals((java.lang.Object) month19);
		int i24 = month19.getMonthSize();
		int i25 = month19.getMonth();
		boolean b26 = month7.equals((java.lang.Object) month19);
		int i27 = month19.getMonth();
		int i28 = month19.getMonthSize();
	}

	@Test
	public void test1186() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test052");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		Month month8 = date4.getMonth();
		int i9 = month8.getMonthSize();
		boolean b10 = month8.increment();
		Day day11 = new Day(2, month8);
		int i12 = day11.getDay();
		Year year16 = new Year((int) (byte) 100);
		boolean b17 = year16.isValid();
		Month month18 = new Month((int) (short) 10, year16);
		int i19 = month18.getMonth();
		Day day20 = new Day(1, month18);
		boolean b21 = day11.equals((java.lang.Object) month18);
	}

	@Test
	public void test1187() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test053");
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
		boolean b17 = month13.increment();
		boolean b18 = month13.isValid();
		Date date23 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year24 = date23.getYear();
		boolean b26 = date23.equals((java.lang.Object) "hi!");
		Day day27 = date23.getDay();
		Date date28 = Nextday.nextDay(date23);
		Day day29 = date28.getDay();
		Month month30 = date28.getMonth();
		Year year31 = date28.getYear();
		try {
			month13.setMonth(0, year31);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1188() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test054");
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
		date11.printDate();
		Day day16 = date11.getDay();
		int i17 = day16.getDay();
	}

	@Test
	public void test1189() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test055");
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
		Year year28 = date4.getYear();
		boolean b29 = year28.increment();
		boolean b30 = year28.increment();
		boolean b31 = year28.isValid();
		boolean b32 = year28.isLeap();
		boolean b33 = year28.isLeap();
		boolean b34 = year28.isValid();
	}

	@Test
	public void test1190() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test063");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		Day day9 = date3.getDay();
		int i10 = day9.getDay();
		int i11 = day9.getDay();
		boolean b12 = day9.isValid();
		boolean b13 = day9.increment();
	}

	@Test
	public void test1191() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test065");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		Year year7 = new Year((int) (byte) 100);
		boolean b8 = year7.isValid();
		Month month9 = new Month((int) (short) 10, year7);
		boolean b10 = month9.increment();
		boolean b11 = date3.equals((java.lang.Object) month9);
		Year year12 = date3.getYear();
		boolean b13 = year12.isLeap();
		int i14 = year12.getYear();
	}

	@Test
	public void test1192() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test068");
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
		date14.increment();
		date14.increment();
		date14.increment();
	}

	@Test
	public void test1193() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test072");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		date3.printDate();
		Day day10 = date3.getDay();
		boolean b11 = day10.isValid();
		boolean b12 = day10.increment();
		int i13 = day10.getDay();
		boolean b14 = day10.increment();
		boolean b15 = day10.isValid();
	}

	@Test
	public void test1194() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test073");
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
		boolean b21 = day7.isValid();
		boolean b22 = day7.increment();
		boolean b23 = day7.increment();
		boolean b24 = day7.isValid();
	}

	@Test
	public void test1195() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test074");
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
		date11.printDate();
		java.lang.String str16 = date11.toString();
		java.lang.String str17 = date11.toString();
	}

	@Test
	public void test1196() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test079");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		int i6 = month5.getMonth();
		Day day7 = new Day(30, month5);
		int i8 = month5.getMonth();
		Date date13 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year14 = date13.getYear();
		boolean b16 = date13.equals((java.lang.Object) "hi!");
		java.lang.String str17 = date13.toString();
		Year year18 = date13.getYear();
		Date date19 = Nextday.nextDay(date13);
		Month month20 = date19.getMonth();
		date19.printDate();
		date19.printDate();
		Date date23 = Nextday.nextDay(date19);
		Year year24 = date23.getYear();
		try {
			month5.setMonth(31, year24);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1197() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test082");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b6 = date4.equals((java.lang.Object) (-1));
		Year year8 = new Year(1);
		boolean b9 = year8.isValid();
		boolean b10 = year8.isLeap();
		int i11 = year8.getYear();
		boolean b12 = year8.isLeap();
		boolean b13 = year8.isLeap();
		boolean b14 = date4.equals((java.lang.Object) b13);
		java.lang.String str15 = date4.toString();
		Month month16 = date4.getMonth();
		date4.printDate();
		Day day18 = date4.getDay();
		Month month19 = date4.getMonth();
		Day day20 = new Day(11, month19);
	}

	@Test
	public void test1198() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test083");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		int i3 = year1.getYear();
		boolean b5 = year1.equals((java.lang.Object) 1);
		year1.setYear(32);
		boolean b8 = year1.increment();
	}

	@Test
	public void test1199() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test084");
		try {
			Date date3 = new Date(5, 0, 32);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1200() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test085");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b6 = date4.equals((java.lang.Object) (-1));
		Year year7 = date4.getYear();
		Month month8 = new Month(3, year7);
		boolean b9 = year7.increment();
	}

	@Test
	public void test1201() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test086");
		try {
			Date date3 = new Date((int) (byte) -1, (int) 'a', (-1));
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1202() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test087");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		java.lang.String str8 = date3.toString();
		date3.printDate();
		Month month10 = date3.getMonth();
		int i11 = month10.getMonth();
		Year year14 = new Year((int) (byte) 100);
		boolean b15 = year14.isValid();
		Month month16 = new Month((int) (short) 10, year14);
		boolean b18 = month16.equals((java.lang.Object) 10L);
		boolean b19 = month16.increment();
		boolean b20 = month16.increment();
		int i21 = month16.getMonthSize();
		boolean b22 = month16.increment();
		boolean b23 = month10.equals((java.lang.Object) b22);
	}

	@Test
	public void test1203() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test088");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		int i4 = year2.getYear();
		Year year6 = new Year(1);
		boolean b7 = year6.isValid();
		boolean b8 = year6.isValid();
		boolean b9 = year6.isLeap();
		boolean b10 = year6.increment();
		boolean b11 = year6.increment();
		int i12 = year6.getYear();
		boolean b13 = year2.equals((java.lang.Object) i12);
		try {
			Month month14 = new Month((int) 'a', year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1204() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test092");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		Date date10 = Nextday.nextDay(date9);
		Year year11 = date10.getYear();
		int i12 = year11.getYear();
	}

	@Test
	public void test1205() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test093");
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
		int i18 = day7.getDay();
	}

	@Test
	public void test1206() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test094");
		try {
			Date date3 = new Date(2, 32, (int) ' ');
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1207() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test097");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isLeap();
		int i6 = year3.getYear();
		boolean b7 = year3.isLeap();
		Month month8 = new Month((int) (byte) 1, year3);
		Day day9 = new Day(31, month8);
		boolean b10 = day9.isValid();
		boolean b11 = day9.increment();
		boolean b12 = day9.increment();
		Date date16 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date17 = Nextday.nextDay(date16);
		Year year20 = new Year((int) (byte) 100);
		boolean b21 = year20.isValid();
		Month month22 = new Month((int) (short) 10, year20);
		boolean b23 = month22.increment();
		int i24 = month22.getMonthSize();
		boolean b25 = month22.isValid();
		boolean b26 = date17.equals((java.lang.Object) month22);
		int i27 = month22.getMonthSize();
		boolean b28 = day9.equals((java.lang.Object) month22);
		Year year32 = new Year((int) (byte) 100);
		boolean b33 = year32.isValid();
		Month month34 = new Month((int) (short) 10, year32);
		boolean b36 = month34.equals((java.lang.Object) 10L);
		boolean b37 = month34.increment();
		try {
			day9.setDay((int) (short) 100, month34);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1208() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test098");
		try {
			Date date3 = new Date((int) (byte) 0, (int) ' ', (int) (short) 0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1209() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test099");
		try {
			Date date3 = new Date(11, (int) (byte) 100, 33);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1210() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test102");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		boolean b4 = year2.isLeap();
		java.lang.Object obj5 = new java.lang.Object();
		boolean b6 = year2.equals(obj5);
		boolean b7 = year2.increment();
		Date date11 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year12 = date11.getYear();
		boolean b14 = date11.equals((java.lang.Object) "hi!");
		java.lang.String str15 = date11.toString();
		boolean b17 = date11.equals((java.lang.Object) (short) 100);
		Year year18 = date11.getYear();
		Date date19 = Nextday.nextDay(date11);
		date19.increment();
		boolean b21 = year2.equals((java.lang.Object) date19);
		date19.increment();
		Month month23 = date19.getMonth();
		Year year24 = date19.getYear();
		Month month25 = new Month((int) (byte) 10, year24);
	}

	@Test
	public void test1211() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test103");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isLeap();
		int i5 = year2.getYear();
		boolean b6 = year2.isLeap();
		Month month7 = new Month((int) (byte) 1, year2);
		int i8 = month7.getMonthSize();
		boolean b9 = month7.increment();
		int i10 = month7.getMonth();
		int i11 = month7.getMonth();
	}

	@Test
	public void test1212() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test104");
		Date date3 = new Date(2, (int) (short) 1, (int) 'a');
		date3.printDate();
	}

	@Test
	public void test1213() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test105");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		Day day9 = date3.getDay();
		boolean b10 = day9.isValid();
		int i11 = day9.getDay();
		int i12 = day9.getDay();
		boolean b13 = day9.increment();
		Date date18 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year19 = date18.getYear();
		boolean b21 = date18.equals((java.lang.Object) "hi!");
		Day day22 = date18.getDay();
		Year year23 = date18.getYear();
		Month month24 = date18.getMonth();
		int i25 = month24.getMonth();
		try {
			day9.setDay((int) (short) 100, month24);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1214() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test107");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		date3.printDate();
		java.lang.String str10 = date3.toString();
		date3.increment();
		Date date12 = Nextday.nextDay(date3);
		date3.printDate();
	}

	@Test
	public void test1215() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test109");
		Year year3 = new Year(1);
		boolean b4 = year3.isLeap();
		int i5 = year3.getYear();
		boolean b7 = year3.equals((java.lang.Object) 1);
		year3.setYear(32);
		boolean b10 = year3.isLeap();
		boolean b11 = year3.increment();
		Month month12 = new Month((int) (short) 1, year3);
		try {
			Day day13 = new Day(0, month12);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1216() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test112");
		Year year1 = new Year((int) (short) 100);
		boolean b2 = year1.increment();
		Year year4 = new Year(1);
		boolean b5 = year4.isValid();
		int i6 = year4.getYear();
		year4.setYear(100);
		boolean b9 = year1.equals((java.lang.Object) year4);
		boolean b11 = year4.equals((java.lang.Object) (byte) -1);
		int i12 = year4.getYear();
		int i13 = year4.getYear();
	}

	@Test
	public void test1217() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test113");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		java.lang.String str8 = date3.toString();
		date3.printDate();
		Year year10 = date3.getYear();
		Year year15 = new Year((int) (byte) 100);
		boolean b16 = year15.isValid();
		Month month17 = new Month((int) (short) 10, year15);
		int i18 = month17.getMonth();
		Day day19 = new Day(30, month17);
		boolean b20 = day19.isValid();
		int i21 = day19.getDay();
		Year year23 = new Year(101);
		boolean b24 = year23.isLeap();
		boolean b25 = day19.equals((java.lang.Object) year23);
		Month month26 = new Month(2, year23);
		boolean b27 = date3.equals((java.lang.Object) 2);
		Day day28 = date3.getDay();
		java.lang.String str29 = date3.toString();
	}

	@Test
	public void test1218() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test114");
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
		int i16 = year6.getYear();
		boolean b17 = year6.increment();
		year6.setYear((int) (byte) -1);
	}

	@Test
	public void test1219() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test115");
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
		int i15 = year14.getYear();
	}

	@Test
	public void test1220() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test120");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		boolean b7 = month5.equals((java.lang.Object) 10L);
		boolean b8 = month5.increment();
		try {
			Day day9 = new Day(101, month5);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1221() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test121");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		date3.printDate();
		date3.printDate();
	}

	@Test
	public void test1222() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test122");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isValid();
		Month month5 = new Month((int) (short) 10, year2);
		boolean b6 = month5.isValid();
	}

	@Test
	public void test1223() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test125");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		Month month6 = date4.getMonth();
		boolean b7 = month6.increment();
		java.lang.Object obj8 = null;
		boolean b9 = month6.equals(obj8);
		boolean b10 = month6.increment();
		try {
			Day day11 = new Day(32, month6);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1224() throws Throwable {
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
		java.lang.Object obj15 = null;
		boolean b16 = day7.equals(obj15);
		boolean b17 = day7.increment();
		int i18 = day7.getDay();
		boolean b19 = day7.isValid();
		boolean b20 = day7.isValid();
		Year year23 = new Year(1);
		boolean b24 = year23.isValid();
		boolean b25 = year23.isValid();
		boolean b26 = year23.isValid();
		boolean b27 = year23.isValid();
		int i28 = year23.getYear();
		Month month29 = new Month((int) (short) 10, year23);
		boolean b30 = year23.increment();
		boolean b31 = day7.equals((java.lang.Object) b30);
		boolean b32 = day7.increment();
		int i33 = day7.getDay();
		boolean b34 = day7.isValid();
	}

	@Test
	public void test1225() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test127");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		Month month10 = date3.getMonth();
		Year year11 = date3.getYear();
		date3.printDate();
	}

	@Test
	public void test1226() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test129");
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
		Date date22 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year23 = date22.getYear();
		boolean b25 = date22.equals((java.lang.Object) "hi!");
		Day day26 = date22.getDay();
		Year year30 = new Year((int) (byte) 100);
		boolean b31 = year30.isValid();
		Month month32 = new Month((int) (short) 10, year30);
		day26.setDay((int) (short) 10, month32);
		java.lang.Object obj34 = null;
		boolean b35 = day26.equals(obj34);
		boolean b37 = day26.equals((java.lang.Object) "hi!");
		int i38 = day26.getDay();
		boolean b39 = day26.isValid();
		Year year41 = new Year(52);
		boolean b42 = day26.equals((java.lang.Object) year41);
		boolean b43 = year41.isLeap();
		try {
			month17.setMonth((int) (byte) 0, year41);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1227() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test131");
		Year year2 = new Year((int) (byte) 100);
		java.lang.Object obj3 = new java.lang.Object();
		boolean b4 = year2.equals(obj3);
		Date date8 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year9 = date8.getYear();
		boolean b11 = date8.equals((java.lang.Object) "hi!");
		Month month12 = date8.getMonth();
		boolean b13 = year2.equals((java.lang.Object) date8);
		Day day14 = date8.getDay();
		Year year16 = new Year((int) (short) 100);
		boolean b17 = year16.increment();
		Year year19 = new Year(1);
		boolean b20 = year19.isValid();
		int i21 = year19.getYear();
		year19.setYear(100);
		boolean b24 = year16.equals((java.lang.Object) year19);
		boolean b25 = day14.equals((java.lang.Object) year19);
		boolean b26 = year19.increment();
		boolean b27 = year19.increment();
		int i28 = year19.getYear();
		try {
			Month month29 = new Month((int) (short) 100, year19);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1228() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test132");
		try {
			Date date3 = new Date(102, 0, (int) (byte) 1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1229() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test133");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		date3.printDate();
		Day day10 = date3.getDay();
		boolean b11 = day10.isValid();
		boolean b12 = day10.increment();
		int i13 = day10.getDay();
		int i14 = day10.getDay();
		Year year18 = new Year((int) (byte) 100);
		java.lang.Object obj19 = new java.lang.Object();
		boolean b20 = year18.equals(obj19);
		Date date24 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year25 = date24.getYear();
		boolean b27 = date24.equals((java.lang.Object) "hi!");
		Month month28 = date24.getMonth();
		boolean b29 = year18.equals((java.lang.Object) date24);
		Date date30 = Nextday.nextDay(date24);
		Month month31 = date30.getMonth();
		Day day32 = new Day(11, month31);
		Year year34 = new Year(1);
		boolean b35 = year34.isValid();
		int i36 = year34.getYear();
		year34.setYear(100);
		year34.setYear((int) ' ');
		boolean b41 = month31.equals((java.lang.Object) year34);
		try {
			day10.setDay((int) ' ', month31);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1230() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test135");
		try {
			Date date3 = new Date((int) (byte) 0, (int) (short) 0, (int) (byte) 1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1231() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test147");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isValid();
		boolean b4 = year1.isLeap();
		boolean b5 = year1.isLeap();
		year1.setYear(3);
		boolean b8 = year1.isLeap();
	}

	@Test
	public void test1232() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test148");
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
		int i16 = year6.getYear();
		boolean b17 = year6.isLeap();
	}

	@Test
	public void test1233() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test149");
		Date date3 = new Date((int) (short) 1, 13, 5);
	}

	@Test
	public void test1234() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test151");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b5 = month4.increment();
		int i6 = month4.getMonthSize();
		boolean b7 = month4.isValid();
		boolean b8 = month4.increment();
		Year year11 = new Year((int) (byte) 1);
		year11.setYear((int) (short) 10);
		try {
			month4.setMonth(0, year11);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1235() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test152");
		Year year2 = new Year((int) (byte) 100);
		Month month3 = new Month((int) (short) 1, year2);
		int i4 = month3.getMonth();
		Year year7 = new Year(1);
		boolean b8 = year7.isValid();
		boolean b9 = year7.isLeap();
		int i10 = year7.getYear();
		boolean b11 = year7.isLeap();
		java.lang.Object obj12 = null;
		boolean b13 = year7.equals(obj12);
		int i14 = year7.getYear();
		try {
			month3.setMonth(102, year7);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1236() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test154");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		int i6 = month5.getMonth();
		Year year9 = new Year((int) (short) 1);
		boolean b10 = year9.isLeap();
		month5.setMonth((int) (short) 10, year9);
		int i12 = month5.getMonth();
		int i13 = month5.getMonth();
		boolean b14 = month5.increment();
		try {
			Day day15 = new Day((int) (byte) 0, month5);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1237() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test155");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isValid();
		boolean b5 = year2.isValid();
		boolean b6 = year2.isValid();
		Month month7 = new Month(12, year2);
		Date date12 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year13 = date12.getYear();
		boolean b15 = date12.equals((java.lang.Object) "hi!");
		date12.printDate();
		Year year17 = date12.getYear();
		date12.increment();
		Date date19 = Nextday.nextDay(date12);
		Year year20 = date12.getYear();
		try {
			month7.setMonth((int) (short) 0, year20);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1238() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test156");
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
		boolean b22 = day9.increment();
		boolean b23 = day9.increment();
		Date date28 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b30 = date28.equals((java.lang.Object) (-1));
		Year year32 = new Year(1);
		boolean b33 = year32.isValid();
		boolean b34 = year32.isLeap();
		int i35 = year32.getYear();
		boolean b36 = year32.isLeap();
		boolean b37 = year32.isLeap();
		boolean b38 = date28.equals((java.lang.Object) b37);
		Date date39 = Nextday.nextDay(date28);
		date28.increment();
		Month month41 = date28.getMonth();
		try {
			day9.setDay((int) (short) 0, month41);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1239() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test157");
		try {
			Date date3 = new Date(100, 12, 30);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1240() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test160");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isLeap();
		int i6 = year3.getYear();
		boolean b7 = year3.isLeap();
		Month month8 = new Month((int) (byte) 1, year3);
		Day day9 = new Day(31, month8);
		Year year13 = new Year((int) (byte) 100);
		boolean b14 = year13.isValid();
		Month month15 = new Month((int) (short) 10, year13);
		boolean b16 = month15.increment();
		boolean b17 = month15.isValid();
		boolean b19 = month15.equals((java.lang.Object) 1);
		int i20 = month15.getMonthSize();
		int i21 = month15.getMonthSize();
		Year year24 = new Year(1);
		boolean b25 = year24.isValid();
		boolean b26 = year24.isLeap();
		int i27 = year24.getYear();
		boolean b28 = year24.isLeap();
		Month month29 = new Month((int) (byte) 1, year24);
		int i30 = month29.getMonthSize();
		boolean b31 = month29.increment();
		boolean b32 = month29.isValid();
		boolean b33 = month15.equals((java.lang.Object) month29);
		try {
			day9.setDay(0, month15);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1241() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test161");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		Year year7 = new Year((int) (byte) 100);
		boolean b8 = year7.isValid();
		Month month9 = new Month((int) (short) 10, year7);
		boolean b10 = month9.increment();
		int i11 = month9.getMonthSize();
		boolean b12 = month9.isValid();
		boolean b13 = date4.equals((java.lang.Object) month9);
		Year year14 = date4.getYear();
		date4.increment();
		Year year16 = date4.getYear();
		Date date17 = Nextday.nextDay(date4);
		date17.printDate();
	}

	@Test
	public void test1242() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test166");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		date3.printDate();
		Day day10 = date3.getDay();
		boolean b11 = day10.increment();
		Year year14 = new Year((int) (byte) 100);
		boolean b15 = year14.isValid();
		Month month16 = new Month((int) (short) 10, year14);
		boolean b18 = month16.equals((java.lang.Object) 10L);
		int i19 = month16.getMonth();
		boolean b20 = month16.isValid();
		boolean b21 = month16.isValid();
		boolean b22 = month16.isValid();
		boolean b23 = month16.increment();
		boolean b24 = day10.equals((java.lang.Object) month16);
		Year year27 = new Year(12);
		boolean b28 = year27.isLeap();
		int i29 = year27.getYear();
		try {
			month16.setMonth((int) ' ', year27);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1243() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test169");
		try {
			Date date3 = new Date(2, (int) (short) 100, 4);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1244() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test171");
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
		boolean b17 = day7.isValid();
		Date date21 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date22 = Nextday.nextDay(date21);
		date21.increment();
		Month month24 = date21.getMonth();
		boolean b25 = day7.equals((java.lang.Object) date21);
	}

	@Test
	public void test1245() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test172");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		java.lang.String str8 = date4.toString();
		boolean b10 = date4.equals((java.lang.Object) (short) 100);
		Date date11 = Nextday.nextDay(date4);
		date11.increment();
		Month month13 = date11.getMonth();
		java.lang.String str14 = date11.toString();
		Month month15 = date11.getMonth();
		Day day16 = new Day(2, month15);
		boolean b17 = month15.isValid();
	}

	@Test
	public void test1246() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test173");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.increment();
		java.lang.String str8 = date3.toString();
		date3.printDate();
		Day day10 = date3.getDay();
	}

	@Test
	public void test1247() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test175");
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
		boolean b16 = day15.isValid();
		boolean b18 = day15.equals((java.lang.Object) "10/12/1");
		boolean b19 = day15.increment();
		Date date25 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year26 = date25.getYear();
		date25.printDate();
		Year year28 = date25.getYear();
		Day day29 = date25.getDay();
		Month month30 = date25.getMonth();
		Day day31 = new Day(12, month30);
		boolean b32 = month30.isValid();
		try {
			day15.setDay((int) (byte) -1, month30);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1248() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test176");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		date3.printDate();
		Day day10 = date3.getDay();
		boolean b11 = day10.isValid();
		int i12 = day10.getDay();
		Month month14 = null;
		try {
			day10.setDay((int) (short) 10, month14);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1249() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test177");
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
		boolean b23 = month9.increment();
		Date date28 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year29 = date28.getYear();
		Year year32 = new Year((int) (byte) 100);
		boolean b33 = year32.isValid();
		Month month34 = new Month((int) (short) 10, year32);
		boolean b35 = month34.increment();
		boolean b36 = date28.equals((java.lang.Object) month34);
		Year year37 = date28.getYear();
		Date date38 = Nextday.nextDay(date28);
		date38.increment();
		java.lang.String str40 = date38.toString();
		Date date41 = Nextday.nextDay(date38);
		Year year42 = date38.getYear();
		try {
			month9.setMonth((-1), year42);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1250() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test180");
		try {
			Date date3 = new Date(28, (int) (short) -1, 5);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1251() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test184");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		boolean b3 = year1.isLeap();
		boolean b4 = year1.increment();
		java.lang.Object obj5 = null;
		boolean b6 = year1.equals(obj5);
		int i7 = year1.getYear();
		int i8 = year1.getYear();
		boolean b9 = year1.increment();
		Year year11 = new Year((int) (byte) 100);
		Date date15 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b16 = year11.equals((java.lang.Object) 10);
		boolean b17 = year1.equals((java.lang.Object) b16);
		year1.setYear((int) (byte) 100);
		int i20 = year1.getYear();
	}

	@Test
	public void test1252() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test187");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		Day day6 = date3.getDay();
		Day day7 = date3.getDay();
		Date date8 = Nextday.nextDay(date3);
		date3.increment();
	}

	@Test
	public void test1253() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test191");
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
		year21.setYear(28);
		boolean b24 = year21.isValid();
	}

	@Test
	public void test1254() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test192");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		int i8 = month7.getMonthSize();
		int i9 = month7.getMonth();
		int i10 = month7.getMonthSize();
		Year year13 = new Year(1);
		boolean b14 = year13.isLeap();
		boolean b16 = year13.equals((java.lang.Object) 100.0f);
		Date date20 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year21 = date20.getYear();
		boolean b23 = date20.equals((java.lang.Object) "hi!");
		Day day24 = date20.getDay();
		Year year28 = new Year((int) (byte) 100);
		boolean b29 = year28.isValid();
		Month month30 = new Month((int) (short) 10, year28);
		day24.setDay((int) (short) 10, month30);
		java.lang.Object obj32 = null;
		boolean b33 = day24.equals(obj32);
		boolean b34 = day24.increment();
		boolean b35 = day24.isValid();
		boolean b36 = day24.isValid();
		boolean b37 = year13.equals((java.lang.Object) b36);
		boolean b38 = year13.increment();
		Year year40 = new Year((int) (byte) 100);
		boolean b41 = year40.isValid();
		boolean b42 = year40.increment();
		year40.setYear((int) '4');
		boolean b45 = year40.isValid();
		year40.setYear(30);
		boolean b48 = year13.equals((java.lang.Object) year40);
		try {
			month7.setMonth((int) '4', year40);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1255() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test194");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		Month month10 = date9.getMonth();
		date9.printDate();
		Day day12 = date9.getDay();
		boolean b13 = day12.increment();
	}

	@Test
	public void test1256() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test196");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		int i5 = month4.getMonth();
		Year year8 = new Year((int) (short) 1);
		boolean b9 = year8.isLeap();
		month4.setMonth((int) (short) 10, year8);
		int i11 = month4.getMonthSize();
		int i12 = month4.getMonth();
		int i13 = month4.getMonth();
		boolean b14 = month4.isValid();
		boolean b15 = month4.increment();
	}

	@Test
	public void test1257() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test197");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		int i6 = month5.getMonth();
		Day day7 = new Day(30, month5);
		int i8 = day7.getDay();
		boolean b9 = day7.isValid();
		boolean b10 = day7.increment();
		int i11 = day7.getDay();
	}

	@Test
	public void test1258() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test198");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b6 = month4.equals((java.lang.Object) 10L);
		Year year8 = new Year(1);
		int i9 = year8.getYear();
		boolean b10 = month4.equals((java.lang.Object) i9);
		int i11 = month4.getMonth();
	}

	@Test
	public void test1259() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test200");
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
		java.lang.String str22 = date18.toString();
	}

	@Test
	public void test1260() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test201");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Date date10 = Nextday.nextDay(date3);
		Month month11 = date3.getMonth();
		Date date16 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year17 = date16.getYear();
		boolean b19 = date16.equals((java.lang.Object) "hi!");
		java.lang.String str20 = date16.toString();
		Year year21 = date16.getYear();
		Date date22 = Nextday.nextDay(date16);
		Month month23 = date22.getMonth();
		date22.printDate();
		date22.printDate();
		Date date26 = Nextday.nextDay(date22);
		Year year27 = date26.getYear();
		int i28 = year27.getYear();
		boolean b29 = year27.isValid();
		boolean b30 = year27.increment();
		try {
			month11.setMonth(13, year27);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1261() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test202");
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
		Year year21 = new Year(1);
		boolean b22 = year21.isValid();
		int i23 = year21.getYear();
		boolean b24 = year21.increment();
		boolean b25 = year21.increment();
		boolean b26 = day7.equals((java.lang.Object) b25);
	}

	@Test
	public void test1262() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test203");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		Date date6 = Nextday.nextDay(date3);
		date6.increment();
		java.lang.String str8 = date6.toString();
		Day day9 = date6.getDay();
		int i10 = day9.getDay();
		Date date15 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date16 = Nextday.nextDay(date15);
		Year year19 = new Year((int) (byte) 100);
		boolean b20 = year19.isValid();
		Month month21 = new Month((int) (short) 10, year19);
		boolean b22 = month21.increment();
		int i23 = month21.getMonthSize();
		boolean b24 = month21.isValid();
		boolean b25 = date16.equals((java.lang.Object) month21);
		int i26 = month21.getMonthSize();
		try {
			day9.setDay(0, month21);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1263() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test205");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		java.lang.String str8 = date4.toString();
		boolean b10 = date4.equals((java.lang.Object) (short) 100);
		Year year11 = date4.getYear();
		Month month12 = date4.getMonth();
		int i13 = month12.getMonthSize();
		try {
			Day day14 = new Day((int) (byte) 0, month12);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1264() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test206");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		int i3 = year1.getYear();
		int i4 = year1.getYear();
		Date date8 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b10 = date8.equals((java.lang.Object) (-1));
		Year year12 = new Year(1);
		boolean b13 = year12.isValid();
		boolean b14 = year12.isLeap();
		int i15 = year12.getYear();
		boolean b16 = year12.isLeap();
		boolean b17 = year12.isLeap();
		boolean b18 = date8.equals((java.lang.Object) b17);
		java.lang.String str19 = date8.toString();
		Month month20 = date8.getMonth();
		int i21 = month20.getMonth();
		boolean b22 = year1.equals((java.lang.Object) i21);
		boolean b23 = year1.increment();
	}

	@Test
	public void test1265() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test207");
		Date date3 = new Date((int) (byte) 1, 3, 102);
		java.lang.String str4 = date3.toString();
		Day day5 = date3.getDay();
		Date date10 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year11 = date10.getYear();
		Year year14 = new Year((int) (byte) 100);
		boolean b15 = year14.isValid();
		Month month16 = new Month((int) (short) 10, year14);
		boolean b17 = month16.increment();
		boolean b18 = date10.equals((java.lang.Object) month16);
		Year year19 = date10.getYear();
		java.lang.String str20 = date10.toString();
		date10.increment();
		Day day22 = date10.getDay();
		Day day23 = date10.getDay();
		Day day24 = date10.getDay();
		Month month25 = date10.getMonth();
		Month month26 = date10.getMonth();
		int i27 = month26.getMonth();
		boolean b28 = month26.increment();
		try {
			day5.setDay((int) '#', month26);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1266() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test208");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isValid();
		boolean b4 = year1.isLeap();
		boolean b5 = year1.isLeap();
		try {
			year1.setYear((int) (short) 0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1267() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test210");
		Year year2 = new Year((int) '#');
		Date date6 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year7 = date6.getYear();
		boolean b9 = date6.equals((java.lang.Object) "hi!");
		date6.printDate();
		Year year11 = date6.getYear();
		Year year13 = new Year(1);
		boolean b14 = year13.isValid();
		boolean b15 = year13.isValid();
		boolean b16 = year13.isLeap();
		boolean b17 = year13.increment();
		int i18 = year13.getYear();
		boolean b19 = date6.equals((java.lang.Object) year13);
		boolean b20 = year2.equals((java.lang.Object) year13);
		try {
			Month month21 = new Month(13, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1268() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test211");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		int i3 = year1.getYear();
		int i4 = year1.getYear();
		boolean b5 = year1.isLeap();
	}

	@Test
	public void test1269() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test216");
		Year year2 = new Year(101);
		boolean b3 = year2.isLeap();
		try {
			Month month4 = new Month(0, year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1270() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test218");
		Year year4 = new Year((int) (byte) 100);
		boolean b5 = year4.isValid();
		Month month6 = new Month((int) (short) 10, year4);
		int i7 = month6.getMonth();
		Year year10 = new Year((int) (short) 1);
		boolean b11 = year10.isLeap();
		month6.setMonth((int) (short) 10, year10);
		int i13 = month6.getMonthSize();
		int i14 = month6.getMonth();
		int i15 = month6.getMonth();
		boolean b16 = month6.isValid();
		int i17 = month6.getMonthSize();
		Day day18 = new Day(3, month6);
		try {
			Day day19 = new Day(0, month6);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1271() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test221");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		boolean b4 = year2.isLeap();
		boolean b5 = year2.increment();
		Month month6 = new Month((int) (short) 1, year2);
		Date date10 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date11 = Nextday.nextDay(date10);
		Day day12 = date11.getDay();
		Year year13 = date11.getYear();
		Year year14 = date11.getYear();
		boolean b15 = month6.equals((java.lang.Object) year14);
		int i16 = month6.getMonthSize();
	}

	@Test
	public void test1272() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test222");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isLeap();
		int i6 = year3.getYear();
		boolean b7 = year3.isLeap();
		Month month8 = new Month((int) (byte) 1, year3);
		Day day9 = new Day(31, month8);
		boolean b10 = month8.increment();
		int i11 = month8.getMonthSize();
		Year year14 = new Year((int) (short) 100);
		boolean b15 = year14.isValid();
		int i16 = year14.getYear();
		boolean b17 = year14.isLeap();
		boolean b18 = year14.isLeap();
		year14.setYear(100);
		try {
			month8.setMonth((int) (byte) 0, year14);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1273() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test226");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		Year year7 = new Year((int) (byte) 100);
		boolean b8 = year7.isValid();
		Month month9 = new Month((int) (short) 10, year7);
		boolean b10 = month9.increment();
		boolean b11 = date3.equals((java.lang.Object) month9);
		Year year12 = date3.getYear();
		boolean b13 = year12.isLeap();
		boolean b14 = year12.isValid();
		int i15 = year12.getYear();
	}

	@Test
	public void test1274() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test229");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isLeap();
		int i6 = year3.getYear();
		boolean b7 = year3.isLeap();
		Month month8 = new Month((int) (byte) 1, year3);
		Day day9 = new Day(10, month8);
		boolean b10 = month8.increment();
		Year year13 = new Year(1);
		boolean b14 = year13.isValid();
		boolean b15 = year13.isValid();
		boolean b16 = year13.isValid();
		try {
			month8.setMonth((int) '#', year13);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1275() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test231");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.isLeap();
		int i5 = year2.getYear();
		boolean b6 = year2.isLeap();
		boolean b7 = year2.increment();
		Date date11 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year12 = date11.getYear();
		boolean b14 = date11.equals((java.lang.Object) "hi!");
		Month month15 = date11.getMonth();
		Day day16 = date11.getDay();
		Year year18 = new Year((int) (short) 1);
		boolean b19 = date11.equals((java.lang.Object) year18);
		boolean b20 = year2.equals((java.lang.Object) year18);
		year18.setYear(3);
		try {
			Month month23 = new Month(100, year18);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1276() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test233");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isLeap();
		int i6 = year3.getYear();
		boolean b7 = year3.isLeap();
		Month month8 = new Month((int) (byte) 1, year3);
		int i9 = month8.getMonthSize();
		int i10 = month8.getMonthSize();
		int i11 = month8.getMonthSize();
		int i12 = month8.getMonthSize();
		int i13 = month8.getMonthSize();
		boolean b14 = month8.increment();
		try {
			Day day15 = new Day((int) (byte) -1, month8);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1277() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test234");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b5 = month4.increment();
		boolean b6 = month4.isValid();
		Year year9 = new Year(1);
		boolean b10 = year9.isLeap();
		boolean b11 = year9.isLeap();
		boolean b12 = year9.increment();
		java.lang.Object obj13 = null;
		boolean b14 = year9.equals(obj13);
		int i15 = year9.getYear();
		boolean b16 = year9.isLeap();
		int i17 = year9.getYear();
		try {
			month4.setMonth(13, year9);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1278() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test235");
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
		boolean b40 = year32.increment();
		year32.setYear(2);
	}

	@Test
	public void test1279() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test236");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		Day day6 = date3.getDay();
		Month month7 = date3.getMonth();
		Date date12 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b14 = date12.equals((java.lang.Object) (-1));
		Year year16 = new Year(1);
		boolean b17 = year16.isValid();
		boolean b18 = year16.isLeap();
		int i19 = year16.getYear();
		boolean b20 = year16.isLeap();
		boolean b21 = year16.isLeap();
		boolean b22 = date12.equals((java.lang.Object) b21);
		Year year23 = date12.getYear();
		try {
			month7.setMonth((int) '#', year23);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1280() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test241");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Year year10 = date3.getYear();
		Date date11 = Nextday.nextDay(date3);
		Day day12 = date3.getDay();
		int i13 = day12.getDay();
	}

	@Test
	public void test1281() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test244");
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
		date10.increment();
		date10.increment();
		date10.printDate();
	}

	@Test
	public void test1282() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test245");
		Year year1 = new Year((int) (byte) 100);
		int i2 = year1.getYear();
		boolean b3 = year1.isLeap();
	}

	@Test
	public void test1283() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test247");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		date3.printDate();
		java.lang.String str10 = date3.toString();
		date3.increment();
		Date date12 = Nextday.nextDay(date3);
		date3.increment();
	}

	@Test
	public void test1284() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test250");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isValid();
		boolean b4 = year1.isLeap();
		boolean b5 = year1.isLeap();
		int i6 = year1.getYear();
		boolean b7 = year1.increment();
		boolean b8 = year1.increment();
		boolean b9 = year1.isValid();
		boolean b10 = year1.isLeap();
		Year year12 = new Year((int) (byte) 10);
		boolean b13 = year12.isValid();
		boolean b14 = year1.equals((java.lang.Object) b13);
	}

	@Test
	public void test1285() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test251");
		Year year1 = new Year((int) (short) 1);
		boolean b2 = year1.isLeap();
		year1.setYear(31);
		boolean b5 = year1.increment();
		Date date9 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year10 = date9.getYear();
		boolean b12 = date9.equals((java.lang.Object) "hi!");
		date9.increment();
		date9.printDate();
		boolean b15 = year1.equals((java.lang.Object) date9);
		boolean b16 = year1.isValid();
		boolean b17 = year1.increment();
	}

	@Test
	public void test1286() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test253");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		date3.printDate();
		java.lang.String str7 = date3.toString();
		Day day8 = date3.getDay();
		boolean b9 = day8.increment();
		boolean b10 = day8.isValid();
		boolean b11 = day8.increment();
		boolean b12 = day8.isValid();
	}

	@Test
	public void test1287() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test254");
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
		date10.increment();
		date10.printDate();
		date10.increment();
	}

	@Test
	public void test1288() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test255");
		Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b7 = date5.equals((java.lang.Object) (-1));
		Year year8 = date5.getYear();
		Month month9 = new Month(3, year8);
		Day day10 = new Day((int) (byte) 1, month9);
		Date date15 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year16 = date15.getYear();
		Year year19 = new Year((int) (byte) 100);
		boolean b20 = year19.isValid();
		Month month21 = new Month((int) (short) 10, year19);
		boolean b22 = month21.increment();
		boolean b23 = date15.equals((java.lang.Object) month21);
		Year year24 = date15.getYear();
		java.lang.String str25 = date15.toString();
		date15.increment();
		Day day27 = date15.getDay();
		Day day28 = date15.getDay();
		Day day29 = date15.getDay();
		Month month30 = date15.getMonth();
		Month month31 = date15.getMonth();
		Year year32 = date15.getYear();
		Month month33 = date15.getMonth();
		boolean b34 = month33.isValid();
		try {
			day10.setDay(0, month33);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1289() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test256");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		date3.printDate();
		Month month6 = date3.getMonth();
		Day day7 = date3.getDay();
		Date date11 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year12 = date11.getYear();
		boolean b14 = date11.equals((java.lang.Object) "hi!");
		java.lang.String str15 = date11.toString();
		boolean b17 = date11.equals((java.lang.Object) (short) 100);
		Year year18 = date11.getYear();
		Date date19 = Nextday.nextDay(date11);
		date19.increment();
		java.lang.String str21 = date19.toString();
		Day day22 = date19.getDay();
		date19.printDate();
		Day day24 = date19.getDay();
		boolean b25 = date3.equals((java.lang.Object) date19);
	}

	@Test
	public void test1290() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test257");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isValid();
		boolean b4 = year1.isLeap();
		int i5 = year1.getYear();
		boolean b6 = year1.isValid();
		boolean b7 = year1.isLeap();
	}

	@Test
	public void test1291() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test261");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		boolean b3 = year1.isLeap();
		boolean b4 = year1.increment();
		java.lang.Object obj5 = null;
		boolean b6 = year1.equals(obj5);
		int i7 = year1.getYear();
		int i8 = year1.getYear();
		boolean b9 = year1.increment();
		Year year11 = new Year((int) (byte) 100);
		Date date15 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b16 = year11.equals((java.lang.Object) 10);
		boolean b17 = year1.equals((java.lang.Object) b16);
		int i18 = year1.getYear();
	}

	@Test
	public void test1292() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test266");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isValid();
		int i4 = year1.getYear();
		boolean b5 = year1.isLeap();
		int i6 = year1.getYear();
		Date date10 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b12 = date10.equals((java.lang.Object) (-1));
		Year year14 = new Year(1);
		boolean b15 = year14.isValid();
		boolean b16 = year14.isLeap();
		int i17 = year14.getYear();
		boolean b18 = year14.isLeap();
		boolean b19 = year14.isLeap();
		boolean b20 = date10.equals((java.lang.Object) b19);
		java.lang.String str21 = date10.toString();
		Month month22 = date10.getMonth();
		Date date23 = Nextday.nextDay(date10);
		boolean b24 = year1.equals((java.lang.Object) date23);
		int i25 = year1.getYear();
		boolean b26 = year1.increment();
	}

	@Test
	public void test1293() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test267");
		try {
			Date date3 = new Date((-1), 5, (int) (byte) -1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1294() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test268");
		try {
			Date date3 = new Date((int) '#', (int) (short) -1, 10);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1295() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test270");
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
		boolean b21 = day7.isValid();
		int i22 = day7.getDay();
		Date date27 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year28 = date27.getYear();
		boolean b30 = date27.equals((java.lang.Object) "hi!");
		Month month31 = date27.getMonth();
		int i32 = month31.getMonth();
		boolean b33 = month31.isValid();
		try {
			day7.setDay((int) (byte) 100, month31);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1296() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test273");
		Year year4 = new Year((int) (byte) 100);
		boolean b5 = year4.isValid();
		Month month6 = new Month((int) (short) 10, year4);
		int i7 = month6.getMonth();
		Day day8 = new Day(30, month6);
		boolean b9 = month6.increment();
		boolean b10 = month6.increment();
		boolean b11 = month6.isValid();
		boolean b12 = month6.increment();
		try {
			Day day13 = new Day(100, month6);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1297() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test278");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		int i6 = month5.getMonth();
		Day day7 = new Day(1, month5);
		int i8 = month5.getMonthSize();
		boolean b9 = month5.increment();
	}

	@Test
	public void test1298() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test279");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		int i6 = month5.getMonth();
		Day day7 = new Day(30, month5);
		boolean b8 = month5.increment();
		boolean b9 = month5.increment();
		boolean b10 = month5.isValid();
		int i11 = month5.getMonthSize();
	}

	@Test
	public void test1299() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test281");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		boolean b6 = month5.increment();
		boolean b7 = month5.increment();
		Date date11 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year12 = date11.getYear();
		date11.printDate();
		boolean b14 = month5.equals((java.lang.Object) date11);
		Year year15 = date11.getYear();
		date11.increment();
		Date date20 = new Date((int) (short) 10, 11, (int) (short) 100);
		Month month21 = date20.getMonth();
		boolean b22 = date11.equals((java.lang.Object) month21);
		Day day23 = new Day(3, month21);
	}

	@Test
	public void test1300() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test286");
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
		Date date21 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date25 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year26 = date25.getYear();
		boolean b28 = date25.equals((java.lang.Object) "hi!");
		Day day29 = date25.getDay();
		Year year33 = new Year((int) (byte) 100);
		boolean b34 = year33.isValid();
		Month month35 = new Month((int) (short) 10, year33);
		day29.setDay((int) (short) 10, month35);
		java.lang.Object obj37 = null;
		boolean b38 = day29.equals(obj37);
		boolean b39 = day29.increment();
		int i40 = day29.getDay();
		boolean b41 = day29.isValid();
		boolean b42 = date21.equals((java.lang.Object) day29);
		Month month43 = date21.getMonth();
		boolean b44 = month43.increment();
		try {
			day7.setDay((int) (byte) -1, month43);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1301() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test288");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year9 = new Year((int) (byte) 100);
		int i10 = year9.getYear();
		boolean b11 = date3.equals((java.lang.Object) year9);
		Year year12 = date3.getYear();
		int i13 = year12.getYear();
	}

	@Test
	public void test1302() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test289");
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
		Year year16 = new Year(1);
		boolean b17 = year16.isLeap();
		boolean b18 = year16.isLeap();
		boolean b19 = date3.equals((java.lang.Object) year16);
		boolean b20 = year16.isLeap();
		boolean b21 = year16.increment();
	}

	@Test
	public void test1303() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test290");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		boolean b3 = year1.isLeap();
		boolean b4 = year1.increment();
		boolean b5 = year1.isLeap();
		boolean b6 = year1.isValid();
		int i7 = year1.getYear();
	}

	@Test
	public void test1304() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test292");
		Date date3 = new Date(11, 13, 32);
	}

	@Test
	public void test1305() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test293");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.printDate();
		Year year8 = date3.getYear();
		date3.increment();
		Date date10 = Nextday.nextDay(date3);
		Month month11 = date10.getMonth();
		java.lang.String str12 = date10.toString();
		java.lang.String str13 = date10.toString();
		java.lang.String str14 = date10.toString();
		Day day15 = date10.getDay();
		java.lang.String str16 = date10.toString();
	}

	@Test
	public void test1306() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test296");
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
		Day day16 = date3.getDay();
		int i17 = day16.getDay();
	}

	@Test
	public void test1307() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test297");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Date date8 = Nextday.nextDay(date3);
		date8.increment();
		Day day10 = date8.getDay();
		Month month11 = date8.getMonth();
		Year year15 = new Year(1);
		boolean b16 = year15.isLeap();
		boolean b17 = year15.isLeap();
		java.lang.Object obj18 = new java.lang.Object();
		boolean b19 = year15.equals(obj18);
		boolean b20 = year15.isValid();
		Month month21 = new Month((int) (byte) 10, year15);
		boolean b22 = year15.isValid();
		try {
			month11.setMonth((int) (short) 100, year15);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1308() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test298");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Year year10 = date3.getYear();
		Date date11 = Nextday.nextDay(date3);
		date11.increment();
		date11.printDate();
		date11.increment();
		Month month15 = date11.getMonth();
		boolean b16 = month15.isValid();
		boolean b17 = month15.isValid();
	}

	@Test
	public void test1309() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test301");
		try {
			Date date3 = new Date((int) '4', 11, 0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1310() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test302");
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
		boolean b16 = month13.increment();
		try {
			Day day17 = new Day((int) ' ', month13);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1311() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test303");
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
		boolean b13 = year2.isLeap();
		int i14 = year2.getYear();
	}

	@Test
	public void test1312() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test304");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		date3.printDate();
		java.lang.String str7 = date3.toString();
		Day day8 = date3.getDay();
		boolean b9 = day8.isValid();
	}

	@Test
	public void test1313() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test307");
		Year year2 = new Year((int) (byte) 100);
		Month month3 = new Month((int) (short) 1, year2);
		Date date7 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year8 = date7.getYear();
		boolean b10 = date7.equals((java.lang.Object) "hi!");
		date7.printDate();
		Year year12 = date7.getYear();
		java.lang.String str13 = date7.toString();
		date7.increment();
		boolean b15 = month3.equals((java.lang.Object) date7);
		java.lang.String str16 = date7.toString();
	}

	@Test
	public void test1314() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test308");
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
		Month month16 = date13.getMonth();
		boolean b17 = month16.increment();
		boolean b18 = month16.increment();
	}

	@Test
	public void test1315() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test310");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		Month month10 = date9.getMonth();
		date9.printDate();
		date9.increment();
		Month month13 = date9.getMonth();
		Day day14 = date9.getDay();
		date9.increment();
	}

	@Test
	public void test1316() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test315");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		Month month8 = date4.getMonth();
		int i9 = month8.getMonthSize();
		int i10 = month8.getMonthSize();
		Day day11 = new Day(11, month8);
		Year year14 = new Year(1);
		boolean b15 = year14.isValid();
		boolean b16 = year14.isValid();
		int i17 = year14.getYear();
		year14.setYear((int) (byte) -1);
		try {
			month8.setMonth(101, year14);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1317() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test316");
		Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year6 = date5.getYear();
		date5.printDate();
		Year year8 = date5.getYear();
		Day day9 = date5.getDay();
		Month month10 = date5.getMonth();
		Year year11 = date5.getYear();
		Month month12 = new Month((int) (short) 10, year11);
		int i13 = month12.getMonth();
		try {
			Day day14 = new Day(100, month12);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1318() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test318");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Year year10 = date3.getYear();
		Date date11 = Nextday.nextDay(date3);
		date11.increment();
		date11.printDate();
		Month month14 = date11.getMonth();
		date11.printDate();
	}

	@Test
	public void test1319() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test323");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		date3.printDate();
		Year year8 = date3.getYear();
		int i9 = year8.getYear();
		int i10 = year8.getYear();
		year8.setYear(33);
		year8.setYear(100);
	}

	@Test
	public void test1320() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test328");
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
		Year year28 = date4.getYear();
		boolean b29 = year28.increment();
		boolean b30 = year28.increment();
		boolean b31 = year28.isValid();
		boolean b32 = year28.isLeap();
		boolean b33 = year28.isLeap();
		boolean b34 = year28.increment();
	}

	@Test
	public void test1321() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test329");
		Year year2 = new Year((int) '#');
		Date date6 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year7 = date6.getYear();
		boolean b9 = date6.equals((java.lang.Object) "hi!");
		date6.printDate();
		Year year11 = date6.getYear();
		Year year13 = new Year(1);
		boolean b14 = year13.isValid();
		boolean b15 = year13.isValid();
		boolean b16 = year13.isLeap();
		boolean b17 = year13.increment();
		int i18 = year13.getYear();
		boolean b19 = date6.equals((java.lang.Object) year13);
		boolean b20 = year2.equals((java.lang.Object) year13);
		Month month21 = new Month((int) (byte) 1, year13);
		int i22 = month21.getMonthSize();
	}

	@Test
	public void test1322() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test330");
		Date date3 = new Date((int) (short) 10, 11, (int) (short) 100);
		Day day4 = date3.getDay();
		Date date9 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b11 = date9.equals((java.lang.Object) (-1));
		Year year13 = new Year(1);
		boolean b14 = year13.isValid();
		boolean b15 = year13.isLeap();
		int i16 = year13.getYear();
		boolean b17 = year13.isLeap();
		boolean b18 = year13.isLeap();
		boolean b19 = date9.equals((java.lang.Object) b18);
		java.lang.String str20 = date9.toString();
		Month month21 = date9.getMonth();
		Month month22 = date9.getMonth();
		boolean b23 = month22.isValid();
		try {
			day4.setDay((int) ' ', month22);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1323() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test332");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isLeap();
		int i6 = year3.getYear();
		boolean b7 = year3.isLeap();
		Month month8 = new Month((int) (byte) 1, year3);
		Day day9 = new Day(31, month8);
		boolean b10 = day9.isValid();
		boolean b11 = day9.increment();
		boolean b12 = day9.increment();
		Date date16 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date17 = Nextday.nextDay(date16);
		Year year20 = new Year((int) (byte) 100);
		boolean b21 = year20.isValid();
		Month month22 = new Month((int) (short) 10, year20);
		boolean b23 = month22.increment();
		int i24 = month22.getMonthSize();
		boolean b25 = month22.isValid();
		boolean b26 = date17.equals((java.lang.Object) month22);
		int i27 = month22.getMonthSize();
		boolean b28 = day9.equals((java.lang.Object) month22);
		boolean b29 = day9.isValid();
		boolean b30 = day9.increment();
	}

	@Test
	public void test1324() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test336");
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
		boolean b19 = day7.isValid();
		Year year21 = new Year((int) (byte) 1);
		year21.setYear((int) (short) 10);
		Year year25 = new Year((int) (byte) 100);
		int i26 = year25.getYear();
		boolean b27 = year25.increment();
		boolean b28 = year21.equals((java.lang.Object) b27);
		boolean b29 = day7.equals((java.lang.Object) b28);
		Date date34 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b36 = date34.equals((java.lang.Object) (-1));
		Year year38 = new Year(1);
		boolean b39 = year38.isValid();
		boolean b40 = year38.isLeap();
		int i41 = year38.getYear();
		boolean b42 = year38.isLeap();
		boolean b43 = year38.isLeap();
		boolean b44 = date34.equals((java.lang.Object) b43);
		Date date45 = Nextday.nextDay(date34);
		date45.printDate();
		date45.increment();
		Day day48 = date45.getDay();
		Date date49 = Nextday.nextDay(date45);
		Day day50 = date45.getDay();
		Year year53 = new Year((int) (byte) 100);
		boolean b54 = year53.isValid();
		Month month55 = new Month((int) (short) 10, year53);
		boolean b57 = month55.equals((java.lang.Object) 10L);
		boolean b58 = month55.isValid();
		int i59 = month55.getMonthSize();
		int i60 = month55.getMonth();
		boolean b61 = month55.increment();
		boolean b62 = date45.equals((java.lang.Object) month55);
		try {
			day7.setDay((int) (byte) 0, month55);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1325() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test337");
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
		year1.setYear(102);
	}

	@Test
	public void test1326() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test338");
		Year year1 = new Year((int) (byte) 100);
		java.lang.Object obj2 = new java.lang.Object();
		boolean b3 = year1.equals(obj2);
		Date date7 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year8 = date7.getYear();
		boolean b10 = date7.equals((java.lang.Object) "hi!");
		Month month11 = date7.getMonth();
		boolean b12 = year1.equals((java.lang.Object) date7);
		date7.increment();
		Year year14 = date7.getYear();
		Year year15 = date7.getYear();
		boolean b16 = year15.isValid();
	}

	@Test
	public void test1327() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test340");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isLeap();
		int i6 = year3.getYear();
		boolean b7 = year3.isLeap();
		Month month8 = new Month((int) (byte) 1, year3);
		Day day9 = new Day(31, month8);
		boolean b10 = day9.isValid();
		boolean b11 = day9.increment();
		boolean b12 = day9.increment();
		int i13 = day9.getDay();
		int i14 = day9.getDay();
	}

	@Test
	public void test1328() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test341");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		Month month10 = date3.getMonth();
		Year year11 = date3.getYear();
		Day day12 = date3.getDay();
		java.lang.String str13 = date3.toString();
	}

	@Test
	public void test1329() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test342");
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
		date10.increment();
		Year year16 = date10.getYear();
	}

	@Test
	public void test1330() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test344");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		date3.printDate();
		Day day10 = date3.getDay();
		boolean b11 = day10.isValid();
		boolean b12 = day10.increment();
		Date date17 = new Date((int) (short) 10, 11, (int) (short) 100);
		Month month18 = date17.getMonth();
		Month month19 = date17.getMonth();
		int i20 = month19.getMonthSize();
		try {
			day10.setDay((int) (byte) 0, month19);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1331() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test347");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		date4.printDate();
		Year year9 = date4.getYear();
		date4.increment();
		Date date11 = Nextday.nextDay(date4);
		Year year12 = date4.getYear();
		Year year14 = new Year(1);
		boolean b15 = year14.increment();
		int i16 = year14.getYear();
		year14.setYear((int) (short) -1);
		boolean b19 = year12.equals((java.lang.Object) (short) -1);
		try {
			Month month20 = new Month((int) (byte) 100, year12);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1332() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test348");
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
		Day day17 = date14.getDay();
		boolean b18 = day17.increment();
	}

	@Test
	public void test1333() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test350");
		try {
			Date date3 = new Date((int) (byte) 100, 11, (int) (short) 10);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1334() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test351");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		boolean b9 = date3.equals((java.lang.Object) (short) 100);
		Year year10 = date3.getYear();
		Date date11 = Nextday.nextDay(date3);
		date11.increment();
		java.lang.String str13 = date11.toString();
		Date date14 = Nextday.nextDay(date11);
		date14.printDate();
		Month month16 = date14.getMonth();
	}

	@Test
	public void test1335() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test355");
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
		boolean b29 = year1.increment();
	}

	@Test
	public void test1336() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test358");
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
		Date date17 = Nextday.nextDay(date14);
		java.lang.String str18 = date17.toString();
	}

	@Test
	public void test1337() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test361");
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
		java.lang.String str14 = date9.toString();
	}

	@Test
	public void test1338() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test363");
		Year year1 = new Year(4);
		boolean b2 = year1.increment();
		boolean b3 = year1.increment();
	}

	@Test
	public void test1339() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test366");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		boolean b3 = year1.isLeap();
		boolean b4 = year1.increment();
		boolean b5 = year1.isLeap();
		int i6 = year1.getYear();
		year1.setYear((int) '4');
	}

	@Test
	public void test1340() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test367");
		Year year3 = new Year(1);
		boolean b4 = year3.isValid();
		boolean b5 = year3.isLeap();
		int i6 = year3.getYear();
		boolean b7 = year3.isLeap();
		Month month8 = new Month((int) (byte) 1, year3);
		Day day9 = new Day(10, month8);
		int i10 = month8.getMonthSize();
		Year year12 = null;
		try {
			month8.setMonth((-1), year12);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1341() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test369");
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
		boolean b27 = year11.isValid();
		try {
			Month month28 = new Month(100, year11);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1342() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test373");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		Day day5 = date4.getDay();
		Year year6 = date4.getYear();
		Year year7 = date4.getYear();
		Year year8 = date4.getYear();
		year8.setYear(97);
	}

	@Test
	public void test1343() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test374");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		boolean b8 = month7.increment();
		boolean b9 = month7.increment();
		Date date13 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date14 = Nextday.nextDay(date13);
		Year year17 = new Year((int) (byte) 100);
		boolean b18 = year17.isValid();
		Month month19 = new Month((int) (short) 10, year17);
		boolean b20 = month19.increment();
		int i21 = month19.getMonthSize();
		boolean b22 = month19.isValid();
		boolean b23 = date14.equals((java.lang.Object) month19);
		int i24 = month19.getMonthSize();
		int i25 = month19.getMonth();
		boolean b26 = month7.equals((java.lang.Object) month19);
		int i27 = month7.getMonth();
		Date date32 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year33 = date32.getYear();
		boolean b35 = date32.equals((java.lang.Object) "hi!");
		date32.increment();
		date32.printDate();
		Year year38 = date32.getYear();
		Year year39 = date32.getYear();
		year39.setYear(33);
		Year year43 = new Year((int) (byte) 100);
		java.lang.Object obj44 = new java.lang.Object();
		boolean b45 = year43.equals(obj44);
		Date date49 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year50 = date49.getYear();
		boolean b52 = date49.equals((java.lang.Object) "hi!");
		Month month53 = date49.getMonth();
		boolean b54 = year43.equals((java.lang.Object) date49);
		boolean b55 = year39.equals((java.lang.Object) year43);
		try {
			month7.setMonth(102, year43);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1344() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test375");
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
		boolean b20 = day17.isValid();
		boolean b21 = day17.isValid();
	}

	@Test
	public void test1345() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test377");
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
		Year year28 = date4.getYear();
		boolean b29 = year28.increment();
		year28.setYear((int) '#');
	}

	@Test
	public void test1346() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test381");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year9 = new Year((int) (byte) 100);
		int i10 = year9.getYear();
		boolean b11 = date3.equals((java.lang.Object) year9);
		Year year12 = date3.getYear();
		Month month13 = date3.getMonth();
		int i14 = month13.getMonth();
	}

	@Test
	public void test1347() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test382");
		try {
			Date date3 = new Date(30, 30, 11);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1348() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test383");
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
		int i15 = month5.getMonthSize();
		boolean b16 = month5.increment();
		boolean b17 = month5.increment();
		try {
			Day day18 = new Day((int) (short) 10, month5);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1349() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test385");
		Year year1 = new Year((int) (byte) 100);
		boolean b2 = year1.isValid();
		boolean b3 = year1.isValid();
	}

	@Test
	public void test1350() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test388");
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
		boolean b16 = day14.increment();
		Date date21 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b23 = date21.equals((java.lang.Object) (-1));
		Year year25 = new Year(1);
		boolean b26 = year25.isValid();
		boolean b27 = year25.isLeap();
		int i28 = year25.getYear();
		boolean b29 = year25.isLeap();
		boolean b30 = year25.isLeap();
		boolean b31 = date21.equals((java.lang.Object) b30);
		java.lang.String str32 = date21.toString();
		Month month33 = date21.getMonth();
		Date date34 = Nextday.nextDay(date21);
		Month month35 = date34.getMonth();
		boolean b36 = month35.isValid();
		try {
			day14.setDay((int) (short) 100, month35);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1351() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test390");
		Year year1 = new Year(101);
		boolean b2 = year1.isValid();
		Date date6 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year7 = date6.getYear();
		boolean b9 = date6.equals((java.lang.Object) "hi!");
		java.lang.String str10 = date6.toString();
		boolean b12 = date6.equals((java.lang.Object) (short) 100);
		Year year13 = date6.getYear();
		Date date14 = Nextday.nextDay(date6);
		date14.increment();
		date14.printDate();
		boolean b17 = year1.equals((java.lang.Object) date14);
		boolean b18 = year1.isValid();
	}

	@Test
	public void test1352() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test392");
		Year year1 = new Year(1);
		boolean b2 = year1.isLeap();
		int i3 = year1.getYear();
		boolean b4 = year1.isValid();
		boolean b5 = year1.increment();
		year1.setYear(10);
	}

	@Test
	public void test1353() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test394");
		Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year6 = date5.getYear();
		boolean b8 = date5.equals((java.lang.Object) "hi!");
		java.lang.String str9 = date5.toString();
		Year year10 = date5.getYear();
		Date date11 = Nextday.nextDay(date5);
		Month month12 = date11.getMonth();
		date11.printDate();
		date11.increment();
		Year year15 = date11.getYear();
		Month month16 = new Month(10, year15);
		try {
			Day day17 = new Day(32, month16);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1354() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test397");
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
		int i15 = year1.getYear();
	}

	@Test
	public void test1355() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test399");
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
		int i26 = month4.getMonth();
		boolean b27 = month4.isValid();
	}

	@Test
	public void test1356() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test400");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Date date7 = Nextday.nextDay(date3);
		date7.increment();
	}

	@Test
	public void test1357() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test401");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		date3.printDate();
		java.lang.String str10 = date3.toString();
		Date date11 = Nextday.nextDay(date3);
		Month month12 = date3.getMonth();
		boolean b13 = month12.isValid();
		int i14 = month12.getMonth();
	}

	@Test
	public void test1358() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test402");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		date3.printDate();
		Year year6 = date3.getYear();
		Day day7 = date3.getDay();
		Month month8 = date3.getMonth();
		boolean b9 = month8.isValid();
		boolean b10 = month8.increment();
	}

	@Test
	public void test1359() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test403");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		date3.printDate();
		java.lang.String str7 = date3.toString();
		Date date8 = Nextday.nextDay(date3);
		Year year9 = date3.getYear();
		Year year10 = date3.getYear();
	}

	@Test
	public void test1360() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test405");
		try {
			Date date3 = new Date(52, (int) '4', 30);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1361() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test406");
		Year year1 = null;
		try {
			Month month2 = new Month((int) (byte) 100, year1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1362() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test409");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		date3.increment();
		date3.printDate();
	}

	@Test
	public void test1363() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test413");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b5 = date3.equals((java.lang.Object) (-1));
		Year year7 = new Year(1);
		boolean b8 = year7.isValid();
		boolean b9 = year7.isLeap();
		int i10 = year7.getYear();
		boolean b11 = year7.isLeap();
		boolean b12 = year7.isLeap();
		boolean b13 = date3.equals((java.lang.Object) b12);
		date3.printDate();
	}

	@Test
	public void test1364() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test414");
		try {
			Date date3 = new Date((int) (short) 100, (int) (byte) -1, (int) (byte) 100);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1365() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test415");
		Date date3 = new Date((int) (byte) 1, 30, (int) (short) 100);
	}

	@Test
	public void test1366() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test416");
		Year year1 = new Year(33);
		boolean b2 = year1.isLeap();
		year1.setYear(33);
	}

	@Test
	public void test1367() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test417");
		Year year1 = new Year((int) (byte) 100);
		boolean b2 = year1.isValid();
		boolean b3 = year1.increment();
		year1.setYear((int) '4');
		boolean b6 = year1.isValid();
		boolean b7 = year1.isLeap();
		boolean b8 = year1.increment();
		int i9 = year1.getYear();
	}

	@Test
	public void test1368() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test418");
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
		boolean b18 = day7.isValid();
	}

	@Test
	public void test1369() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test419");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b5 = month4.increment();
		int i6 = month4.getMonth();
		boolean b7 = month4.increment();
	}

	@Test
	public void test1370() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test420");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		boolean b7 = date4.equals((java.lang.Object) "hi!");
		Month month8 = date4.getMonth();
		int i9 = month8.getMonthSize();
		int i10 = month8.getMonthSize();
		int i11 = month8.getMonthSize();
		try {
			Day day12 = new Day(102, month8);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1371() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test421");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		date3.printDate();
		Year year5 = date3.getYear();
		Date date6 = Nextday.nextDay(date3);
		Day day7 = date6.getDay();
		int i8 = day7.getDay();
		int i9 = day7.getDay();
		boolean b10 = day7.isValid();
		Month month12 = null;
		try {
			day7.setDay((int) (short) 100, month12);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1372() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test425");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		java.lang.String str7 = date3.toString();
		Year year8 = date3.getYear();
		Date date9 = Nextday.nextDay(date3);
		Month month10 = date9.getMonth();
		date9.printDate();
		date9.printDate();
		Year year13 = date9.getYear();
		boolean b14 = year13.isLeap();
		boolean b15 = year13.isLeap();
	}

	@Test
	public void test1373() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test426");
		try {
			Date date3 = new Date(28, (int) (short) 10, (int) (byte) -1);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1374() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test427");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b5 = date3.equals((java.lang.Object) (-1));
		Year year6 = date3.getYear();
		Day day7 = date3.getDay();
		Date date12 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b14 = date12.equals((java.lang.Object) (-1));
		Year year16 = new Year(1);
		boolean b17 = year16.isValid();
		boolean b18 = year16.isLeap();
		int i19 = year16.getYear();
		boolean b20 = year16.isLeap();
		boolean b21 = year16.isLeap();
		boolean b22 = date12.equals((java.lang.Object) b21);
		Day day23 = date12.getDay();
		Month month24 = date12.getMonth();
		try {
			day7.setDay((int) (short) -1, month24);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1375() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test430");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		int i6 = month5.getMonth();
		Day day7 = new Day(30, month5);
		boolean b8 = month5.increment();
		boolean b9 = month5.increment();
		boolean b10 = month5.isValid();
		Year year13 = new Year(1);
		boolean b14 = year13.isLeap();
		int i15 = year13.getYear();
		year13.setYear(100);
		int i18 = year13.getYear();
		try {
			month5.setMonth(100, year13);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1376() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test431");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		boolean b6 = month5.increment();
		int i7 = month5.getMonthSize();
		boolean b8 = month5.isValid();
		Day day9 = new Day(10, month5);
		int i10 = day9.getDay();
	}

	@Test
	public void test1377() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test433");
		Year year1 = new Year(28);
	}

	@Test
	public void test1378() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test434");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		boolean b4 = year2.isLeap();
		java.lang.Object obj5 = new java.lang.Object();
		boolean b6 = year2.equals(obj5);
		boolean b7 = year2.isValid();
		int i8 = year2.getYear();
		year2.setYear((int) 'a');
		boolean b11 = year2.isValid();
		try {
			Month month12 = new Month((int) '4', year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1379() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test435");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b5 = month4.increment();
		boolean b6 = month4.increment();
		boolean b7 = month4.isValid();
		boolean b8 = month4.increment();
		Year year10 = new Year(1);
		year10.setYear(32);
		boolean b13 = month4.equals((java.lang.Object) year10);
		boolean b14 = year10.increment();
		int i15 = year10.getYear();
	}

	@Test
	public void test1380() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test437");
		try {
			Date date3 = new Date((int) (byte) 10, 0, 30);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1381() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test439");
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
		Year year13 = new Year(1);
		boolean b14 = year13.isValid();
		boolean b15 = year13.increment();
		boolean b16 = year13.increment();
		boolean b17 = year13.isLeap();
		year13.setYear(11);
		boolean b20 = month7.equals((java.lang.Object) 11);
		Year year23 = new Year(1);
		boolean b24 = year23.isLeap();
		boolean b25 = year23.isLeap();
		java.lang.Object obj26 = new java.lang.Object();
		boolean b27 = year23.equals(obj26);
		boolean b28 = year23.increment();
		try {
			month7.setMonth(53, year23);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1382() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test440");
		Year year2 = new Year(1);
		boolean b3 = year2.isLeap();
		boolean b4 = year2.isValid();
		int i5 = year2.getYear();
		Year year8 = new Year(1);
		boolean b9 = year8.isLeap();
		boolean b10 = year8.isLeap();
		boolean b11 = year8.increment();
		Month month12 = new Month((int) (short) 1, year8);
		Date date16 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date17 = Nextday.nextDay(date16);
		Day day18 = date17.getDay();
		Year year19 = date17.getYear();
		Year year20 = date17.getYear();
		boolean b21 = month12.equals((java.lang.Object) year20);
		boolean b22 = year2.equals((java.lang.Object) month12);
		try {
			Month month23 = new Month((-1), year2);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1383() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test443");
		Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year5 = date4.getYear();
		Month month6 = date4.getMonth();
		Year year7 = date4.getYear();
		try {
			Month month8 = new Month(0, year7);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1384() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test444");
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
		boolean b17 = year1.equals((java.lang.Object) "10/11/1");
		try {
			year1.setYear((int) (byte) 0);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1385() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test445");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		date3.increment();
		date3.increment();
		java.lang.String str7 = date3.toString();
		Date date8 = Nextday.nextDay(date3);
	}

	@Test
	public void test1386() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test446");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year4 = date3.getYear();
		boolean b6 = date3.equals((java.lang.Object) "hi!");
		Month month7 = date3.getMonth();
		date3.printDate();
		java.lang.String str9 = date3.toString();
		Month month10 = date3.getMonth();
		Date date16 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b18 = date16.equals((java.lang.Object) (-1));
		Year year20 = new Year(1);
		boolean b21 = year20.isValid();
		boolean b22 = year20.isLeap();
		int i23 = year20.getYear();
		boolean b24 = year20.isLeap();
		boolean b25 = year20.isLeap();
		boolean b26 = date16.equals((java.lang.Object) b25);
		Date date27 = Nextday.nextDay(date16);
		Year year28 = date27.getYear();
		Month month29 = new Month((int) (byte) 1, year28);
		try {
			month10.setMonth((int) '#', year28);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1387() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test447");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		boolean b5 = date3.equals((java.lang.Object) (-1));
		Year year7 = new Year(1);
		boolean b8 = year7.isValid();
		boolean b9 = year7.isLeap();
		int i10 = year7.getYear();
		boolean b11 = year7.isLeap();
		boolean b12 = year7.isLeap();
		boolean b13 = date3.equals((java.lang.Object) b12);
		Day day14 = date3.getDay();
		Month month15 = date3.getMonth();
		boolean b16 = month15.isValid();
		int i17 = month15.getMonthSize();
		boolean b18 = month15.isValid();
	}

	@Test
	public void test1388() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test449");
		Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date4 = Nextday.nextDay(date3);
		Year year7 = new Year((int) (byte) 100);
		boolean b8 = year7.isValid();
		Month month9 = new Month((int) (short) 10, year7);
		boolean b10 = month9.increment();
		int i11 = month9.getMonthSize();
		boolean b12 = month9.isValid();
		boolean b13 = date4.equals((java.lang.Object) month9);
		Year year14 = date4.getYear();
		Month month15 = date4.getMonth();
		Year year16 = date4.getYear();
		year16.setYear(53);
	}

	@Test
	public void test1389() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test450");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		int i3 = year1.getYear();
		year1.setYear(100);
		boolean b6 = year1.isLeap();
		boolean b7 = year1.isLeap();
		Date date11 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date15 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year16 = date15.getYear();
		boolean b18 = date15.equals((java.lang.Object) "hi!");
		Day day19 = date15.getDay();
		Year year23 = new Year((int) (byte) 100);
		boolean b24 = year23.isValid();
		Month month25 = new Month((int) (short) 10, year23);
		day19.setDay((int) (short) 10, month25);
		java.lang.Object obj27 = null;
		boolean b28 = day19.equals(obj27);
		boolean b29 = day19.increment();
		int i30 = day19.getDay();
		boolean b31 = day19.isValid();
		boolean b32 = date11.equals((java.lang.Object) day19);
		Month month33 = date11.getMonth();
		int i34 = month33.getMonthSize();
		boolean b35 = year1.equals((java.lang.Object) i34);
	}

	@Test
	public void test1390() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test451");
		Year year1 = new Year((int) (byte) 100);
		java.lang.Object obj2 = new java.lang.Object();
		boolean b3 = year1.equals(obj2);
		Date date7 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year8 = date7.getYear();
		boolean b10 = date7.equals((java.lang.Object) "hi!");
		Month month11 = date7.getMonth();
		boolean b12 = year1.equals((java.lang.Object) date7);
		date7.increment();
		Year year14 = date7.getYear();
		Year year15 = date7.getYear();
		java.lang.String str16 = date7.toString();
	}

	@Test
	public void test1391() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test456");
		Year year3 = new Year((int) (byte) 100);
		boolean b4 = year3.isValid();
		Month month5 = new Month((int) (short) 10, year3);
		int i6 = month5.getMonth();
		Day day7 = new Day(30, month5);
		int i8 = day7.getDay();
		boolean b9 = day7.increment();
		int i10 = day7.getDay();
		int i11 = day7.getDay();
		boolean b12 = day7.isValid();
	}

	@Test
	public void test1392() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test457");
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
		Year year15 = date3.getYear();
	}

	@Test
	public void test1393() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test459");
		Year year2 = new Year(1);
		boolean b3 = year2.isValid();
		boolean b4 = year2.increment();
		boolean b5 = year2.increment();
		boolean b6 = year2.isLeap();
		int i7 = year2.getYear();
		Month month8 = new Month(1, year2);
		boolean b9 = month8.isValid();
	}

	@Test
	public void test1394() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test460");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b6 = month4.equals((java.lang.Object) 10L);
		int i7 = month4.getMonth();
		boolean b8 = month4.isValid();
		boolean b9 = month4.isValid();
		boolean b10 = month4.isValid();
		boolean b11 = month4.increment();
		boolean b12 = month4.increment();
	}

	@Test
	public void test1395() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test461");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.increment();
		boolean b4 = year1.increment();
		boolean b5 = year1.isLeap();
		int i6 = year1.getYear();
		boolean b7 = year1.isValid();
		boolean b8 = year1.isValid();
		int i9 = year1.getYear();
	}

	@Test
	public void test1396() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test464");
		Year year1 = new Year((int) (short) 100);
		boolean b2 = year1.increment();
		Year year4 = new Year(1);
		boolean b5 = year4.isValid();
		int i6 = year4.getYear();
		year4.setYear(100);
		boolean b9 = year1.equals((java.lang.Object) year4);
		boolean b11 = year4.equals((java.lang.Object) (byte) -1);
		boolean b12 = year4.isValid();
		int i13 = year4.getYear();
		boolean b14 = year4.isValid();
		boolean b15 = year4.isLeap();
	}

	@Test
	public void test1397() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test466");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.increment();
		boolean b4 = year1.increment();
		boolean b5 = year1.isLeap();
		year1.setYear(11);
		year1.setYear(100);
		year1.setYear(97);
	}

	@Test
	public void test1398() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test468");
		try {
			Date date3 = new Date((int) (short) 10, (int) (byte) 100, (int) '#');
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1399() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test470");
		Year year1 = new Year(1);
		boolean b2 = year1.isValid();
		boolean b3 = year1.increment();
		boolean b4 = year1.increment();
		boolean b5 = year1.increment();
		boolean b6 = year1.isValid();
		boolean b7 = year1.isLeap();
		int i8 = year1.getYear();
		boolean b9 = year1.isValid();
	}

	@Test
	public void test1400() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test471");
		Year year1 = new Year((int) (byte) 100);
		java.lang.Object obj2 = new java.lang.Object();
		boolean b3 = year1.equals(obj2);
		int i4 = year1.getYear();
		int i5 = year1.getYear();
		year1.setYear(1);
		year1.setYear(12);
	}

	@Test
	public void test1401() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test476");
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
		date11.increment();
	}

	@Test
	public void test1402() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test477");
		try {
			Date date3 = new Date(31, (int) (byte) 100, 10);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1403() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test478");
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
		Month month16 = date3.getMonth();
	}

	@Test
	public void test1404() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test479");
		Year year2 = new Year((int) (byte) 100);
		boolean b3 = year2.isValid();
		Month month4 = new Month((int) (short) 10, year2);
		boolean b5 = year2.increment();
		boolean b6 = year2.isLeap();
		boolean b7 = year2.isValid();
	}

	@Test
	public void test1405() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test481");
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
		boolean b20 = day7.increment();
		boolean b21 = day7.increment();
		int i22 = day7.getDay();
		Date date28 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year29 = date28.getYear();
		boolean b31 = date28.equals((java.lang.Object) "hi!");
		Month month32 = date28.getMonth();
		Year year34 = new Year(1);
		boolean b35 = year34.isValid();
		boolean b36 = year34.increment();
		boolean b37 = year34.increment();
		boolean b38 = month32.equals((java.lang.Object) b37);
		Year year41 = new Year(1);
		boolean b42 = year41.isValid();
		boolean b43 = year41.isLeap();
		int i44 = year41.getYear();
		boolean b45 = year41.isLeap();
		month32.setMonth(10, year41);
		boolean b47 = year41.increment();
		boolean b48 = year41.isLeap();
		Month month49 = new Month(10, year41);
		try {
			day7.setDay(102, month49);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1406() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test482");
		try {
			Date date3 = new Date(30, 100, 101);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1407() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test484");
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
		int i16 = day15.getDay();
	}

	@Test
	public void test1408() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test488");
		try {
			Date date3 = new Date((-1), 11, (int) (short) 100);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1409() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test489");
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
		Day day17 = date3.getDay();
		Month month18 = date3.getMonth();
		Month month19 = date3.getMonth();
		Month month20 = date3.getMonth();
	}

	@Test
	public void test1410() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test490");
		try {
			Date date3 = new Date(102, (int) (byte) -1, 100);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1411() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test493");
		Date date3 = new Date(1, (int) (short) 10, (int) '4');
	}

	@Test
	public void test1412() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test494");
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
		int i15 = year2.getYear();
		int i16 = year2.getYear();
	}

	@Test
	public void test1413() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test496");
		Year year1 = new Year((int) (short) 1);
		boolean b2 = year1.isLeap();
		year1.setYear(31);
		Date date8 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date12 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year13 = date12.getYear();
		boolean b15 = date12.equals((java.lang.Object) "hi!");
		Day day16 = date12.getDay();
		Year year20 = new Year((int) (byte) 100);
		boolean b21 = year20.isValid();
		Month month22 = new Month((int) (short) 10, year20);
		day16.setDay((int) (short) 10, month22);
		java.lang.Object obj24 = null;
		boolean b25 = day16.equals(obj24);
		boolean b26 = day16.increment();
		int i27 = day16.getDay();
		boolean b28 = day16.isValid();
		boolean b29 = date8.equals((java.lang.Object) day16);
		Month month30 = date8.getMonth();
		Month month31 = date8.getMonth();
		Date date32 = Nextday.nextDay(date8);
		boolean b33 = year1.equals((java.lang.Object) date32);
		Month month34 = date32.getMonth();
	}

	@Test
	public void test1414() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test498");
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
		boolean b16 = month12.isValid();
		Date date21 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Date date22 = Nextday.nextDay(date21);
		Year year25 = new Year((int) (byte) 100);
		boolean b26 = year25.isValid();
		Month month27 = new Month((int) (short) 10, year25);
		boolean b28 = month27.increment();
		int i29 = month27.getMonthSize();
		boolean b30 = month27.isValid();
		boolean b31 = date22.equals((java.lang.Object) month27);
		Year year32 = date22.getYear();
		date22.increment();
		Year year34 = date22.getYear();
		boolean b35 = year34.isLeap();
		try {
			month12.setMonth(53, year34);
		} catch (java.lang.IllegalArgumentException e) {
		}
	}

	@Test
	public void test1415() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test499");
		Year year1 = new Year(1);
		boolean b2 = year1.increment();
		int i3 = year1.getYear();
		boolean b4 = year1.increment();
		year1.setYear(12);
		year1.setYear(10);
		Date date12 = new Date(10, (int) (byte) 10, (int) (short) 1);
		Year year13 = date12.getYear();
		boolean b14 = year13.isValid();
		int i15 = year13.getYear();
		boolean b16 = year1.equals((java.lang.Object) year13);
		boolean b17 = year13.isValid();
	}

	@Test
	public void test1416() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest1.test500");
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
		Day day28 = date3.getDay();
		int i29 = day28.getDay();
	}
}
