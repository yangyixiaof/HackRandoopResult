import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test001");
        Date date3 = new Date(3, (int) (byte) 10, (int) (byte) 100);
        java.lang.String str4 = date3.toString();
    }

    @Test
    public void test002() throws Throwable {
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
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test003");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year5 = date4.getYear();
        boolean b7 = date4.equals((java.lang.Object) "hi!");
        date4.increment();
        date4.increment();
        Date date10 = Nextday.nextDay(date4);
        Year year11 = date10.getYear();
        try {
            Month month12 = new Month(0, year11);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
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
    public void test005() throws Throwable {
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
    public void test006() throws Throwable {
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
    public void test007() throws Throwable {
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
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test008");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Month month7 = date3.getMonth();
        date3.printDate();
        java.lang.String str9 = date3.toString();
        Day day10 = date3.getDay();
        boolean b11 = day10.isValid();
        int i12 = day10.getDay();
        int i13 = day10.getDay();
        Date date18 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year19 = date18.getYear();
        boolean b21 = date18.equals((java.lang.Object) "hi!");
        java.lang.String str22 = date18.toString();
        Year year23 = date18.getYear();
        Date date24 = Nextday.nextDay(date18);
        Month month25 = date18.getMonth();
        boolean b26 = month25.increment();
        try {
            day10.setDay(0, month25);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
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
    public void test010() throws Throwable {
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
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test011");
        try {
            Date date3 = new Date(11, (int) (byte) 100, 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test012");
        Year year1 = new Year(12);
        boolean b2 = year1.isLeap();
        int i3 = year1.getYear();
        boolean b4 = year1.increment();
        boolean b5 = year1.isValid();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test013");
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
        int i16 = month15.getMonth();
    }

    @Test
    public void test014() throws Throwable {
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
    public void test015() throws Throwable {
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
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test016");
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
        date3.increment();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test017");
        try {
            Date date3 = new Date((int) (byte) -1, 32, 32);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test018() throws Throwable {
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
    public void test019() throws Throwable {
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
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test020");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isLeap();
        int i5 = year2.getYear();
        Month month6 = new Month((int) (byte) 1, year2);
        int i7 = month6.getMonthSize();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test021");
        Year year3 = new Year(1);
        boolean b4 = year3.isValid();
        boolean b5 = year3.isValid();
        Month month6 = new Month((int) (short) 10, year3);
        Year year9 = new Year((int) (byte) 100);
        boolean b10 = year9.isValid();
        Month month11 = new Month((int) (short) 10, year9);
        boolean b12 = year9.increment();
        boolean b13 = month6.equals((java.lang.Object) year9);
        boolean b14 = year9.isLeap();
        boolean b15 = year9.increment();
        try {
            Month month16 = new Month((int) '4', year9);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test022() throws Throwable {
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
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test023");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Day day7 = date3.getDay();
        Month month8 = date3.getMonth();
        date3.printDate();
        java.lang.String str10 = date3.toString();
        Month month11 = date3.getMonth();
        Month month12 = date3.getMonth();
        boolean b13 = month12.isValid();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test024");
        try {
            Date date3 = new Date(30, 53, 53);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test025");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isValid();
        boolean b5 = year2.isLeap();
        Month month6 = new Month(10, year2);
        try {
            year2.setYear((int) (short) 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test026() throws Throwable {
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
    public void test027() throws Throwable {
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
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test028");
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
        Year year21 = new Year((int) '4');
        try {
            month16.setMonth((int) (byte) 100, year21);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test029");
        Year year3 = new Year((int) (byte) 100);
        boolean b4 = year3.isValid();
        Month month5 = new Month((int) (short) 10, year3);
        boolean b6 = month5.increment();
        int i7 = month5.getMonthSize();
        boolean b8 = month5.isValid();
        Day day9 = new Day(10, month5);
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
        Year year24 = date19.getYear();
        boolean b25 = day9.equals((java.lang.Object) year24);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test030");
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
        java.lang.String str19 = date3.toString();
        date3.increment();
    }

    @Test
    public void test031() throws Throwable {
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
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test032");
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
        boolean b36 = day26.increment();
        int i37 = day26.getDay();
        boolean b38 = day26.isValid();
        boolean b39 = day26.isValid();
        boolean b40 = day26.increment();
        boolean b41 = year14.equals((java.lang.Object) b40);
        try {
            month11.setMonth((int) (byte) -1, year14);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test033");
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
        Year year15 = new Year(1);
        boolean b16 = year15.isValid();
        boolean b17 = year15.isValid();
        boolean b18 = year15.isValid();
        boolean b19 = year15.isValid();
        Month month20 = new Month(12, year15);
        boolean b21 = day9.equals((java.lang.Object) year15);
        year15.setYear(31);
        int i24 = year15.getYear();
    }

    @Test
    public void test034() throws Throwable {
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
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test035");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Month month7 = date3.getMonth();
        Day day8 = date3.getDay();
        boolean b9 = day8.increment();
        boolean b10 = day8.isValid();
    }

    @Test
    public void test036() throws Throwable {
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
    public void test037() throws Throwable {
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
    public void test038() throws Throwable {
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
    public void test039() throws Throwable {
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
    public void test040() throws Throwable {
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
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test041");
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
        int i14 = month4.getMonth();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test042");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isValid();
        boolean b5 = year2.isLeap();
        boolean b6 = year2.isLeap();
        int i7 = year2.getYear();
        boolean b8 = year2.increment();
        boolean b9 = year2.increment();
        boolean b11 = year2.equals((java.lang.Object) "10/10/1");
        boolean b12 = year2.isLeap();
        year2.setYear((int) ' ');
        try {
            Month month15 = new Month((-1), year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test043() throws Throwable {
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
    public void test044() throws Throwable {
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
    public void test045() throws Throwable {
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
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test046");
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
        Date date18 = Nextday.nextDay(date3);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test047");
        Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year6 = date5.getYear();
        boolean b8 = date5.equals((java.lang.Object) "hi!");
        java.lang.String str9 = date5.toString();
        Day day10 = date5.getDay();
        Day day11 = date5.getDay();
        date5.printDate();
        Year year15 = new Year((int) (byte) 100);
        boolean b16 = year15.isValid();
        Month month17 = new Month((int) (short) 10, year15);
        boolean b18 = month17.increment();
        int i19 = month17.getMonth();
        int i20 = month17.getMonth();
        int i21 = month17.getMonthSize();
        boolean b22 = date5.equals((java.lang.Object) month17);
        int i23 = month17.getMonth();
        Day day24 = new Day((int) (short) 10, month17);
        try {
            Day day25 = new Day((int) (short) -1, month17);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test048() throws Throwable {
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
    public void test049() throws Throwable {
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
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test050");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        Year year9 = new Year((int) (byte) 100);
        int i10 = year9.getYear();
        boolean b11 = date3.equals((java.lang.Object) year9);
        date3.increment();
        Month month13 = date3.getMonth();
        int i14 = month13.getMonthSize();
        int i15 = month13.getMonth();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test051");
        Year year1 = new Year(1);
        boolean b2 = year1.increment();
        int i3 = year1.getYear();
        year1.setYear((int) (short) -1);
        year1.setYear(1);
        year1.setYear((int) (byte) -1);
    }

    @Test
    public void test052() throws Throwable {
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
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test053");
        Date date3 = new Date(2, 10, 10);
        Date date4 = Nextday.nextDay(date3);
        date3.increment();
        date3.increment();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test054");
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
        Year year17 = new Year(1);
        boolean b18 = year17.isValid();
        boolean b19 = year17.isLeap();
        int i20 = year17.getYear();
        boolean b21 = year17.isLeap();
        boolean b22 = day15.equals((java.lang.Object) year17);
        boolean b23 = year17.isValid();
        year17.setYear((int) (short) 100);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test055");
        Year year1 = new Year((int) (byte) 100);
        boolean b2 = year1.increment();
        boolean b3 = year1.isValid();
        boolean b4 = year1.isLeap();
    }

    @Test
    public void test056() throws Throwable {
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
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test057");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Month month7 = date3.getMonth();
        Day day8 = date3.getDay();
        boolean b9 = day8.increment();
        Year year13 = new Year((int) (short) 100);
        boolean b14 = year13.isValid();
        Month month15 = new Month(12, year13);
        boolean b16 = month15.increment();
        try {
            day8.setDay(13, month15);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test058");
        Month month1 = null;
        try {
            Day day2 = new Day(28, month1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test059() throws Throwable {
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
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test060");
        Year year3 = new Year(1);
        boolean b4 = year3.isLeap();
        boolean b5 = year3.isLeap();
        boolean b6 = year3.increment();
        Month month7 = new Month((int) (short) 1, year3);
        Date date11 = new Date(10, (int) (byte) 10, (int) (short) 1);
        java.lang.String str12 = date11.toString();
        boolean b13 = month7.equals((java.lang.Object) date11);
        Day day14 = new Day((int) (byte) 10, month7);
        boolean b15 = day14.isValid();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test061");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.increment();
        date3.increment();
        Date date9 = Nextday.nextDay(date3);
        Month month10 = date3.getMonth();
    }

    @Test
    public void test062() throws Throwable {
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
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test063");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date4 = Nextday.nextDay(date3);
        Day day5 = date4.getDay();
        Year year6 = date4.getYear();
        Month month7 = date4.getMonth();
        Year year8 = date4.getYear();
        java.lang.String str9 = date4.toString();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test064");
        try {
            Date date3 = new Date((int) ' ', 12, (int) (byte) 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test065");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isValid();
        boolean b5 = year2.isValid();
        boolean b6 = year2.isValid();
        int i7 = year2.getYear();
        Month month8 = new Month((int) (short) 10, year2);
        boolean b9 = year2.isValid();
        boolean b10 = year2.isLeap();
        boolean b11 = year2.increment();
    }

    @Test
    public void test066() throws Throwable {
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
    public void test067() throws Throwable {
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
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test068");
        try {
            Date date3 = new Date(5, 0, (int) (short) -1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test069");
        Year year1 = new Year((int) (short) 100);
        boolean b2 = year1.increment();
        boolean b4 = year1.equals((java.lang.Object) "10/10/1");
        boolean b5 = year1.isLeap();
        boolean b6 = year1.isValid();
    }

    @Test
    public void test070() throws Throwable {
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
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test071");
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
        int i31 = month25.getMonthSize();
        int i32 = month25.getMonthSize();
        int i33 = month25.getMonthSize();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test072");
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
        Day day15 = date13.getDay();
        boolean b16 = day15.increment();
        int i17 = day15.getDay();
        Month month19 = null;
        try {
            day15.setDay((int) (short) -1, month19);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test073");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b5 = month4.increment();
        int i6 = month4.getMonth();
        int i7 = month4.getMonth();
        int i8 = month4.getMonthSize();
        Year year11 = new Year(1);
        boolean b12 = year11.isValid();
        boolean b13 = year11.isValid();
        boolean b14 = year11.isLeap();
        boolean b15 = year11.increment();
        try {
            month4.setMonth(53, year11);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test074() throws Throwable {
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
    public void test075() throws Throwable {
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
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test076");
        Year year1 = new Year(101);
        boolean b2 = year1.isLeap();
        boolean b3 = year1.isLeap();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test077");
        Year year1 = new Year((int) (byte) 100);
        boolean b2 = year1.isValid();
        boolean b3 = year1.increment();
        year1.setYear(5);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test078");
        Year year2 = new Year(101);
        boolean b3 = year2.increment();
        year2.setYear(32);
        Year year7 = new Year((int) (short) 100);
        boolean b8 = year7.increment();
        Year year10 = new Year(1);
        boolean b11 = year10.isValid();
        int i12 = year10.getYear();
        year10.setYear(100);
        boolean b15 = year7.equals((java.lang.Object) year10);
        boolean b17 = year10.equals((java.lang.Object) (byte) -1);
        boolean b18 = year10.isValid();
        boolean b19 = year2.equals((java.lang.Object) year10);
        Month month20 = new Month((int) (short) 10, year10);
        Year year25 = new Year(1);
        boolean b26 = year25.isValid();
        boolean b27 = year25.isLeap();
        int i28 = year25.getYear();
        boolean b29 = year25.isLeap();
        Month month30 = new Month((int) (byte) 1, year25);
        Day day31 = new Day(31, month30);
        boolean b32 = day31.isValid();
        boolean b33 = day31.increment();
        boolean b34 = day31.increment();
        Year year37 = new Year(1);
        boolean b38 = year37.isValid();
        boolean b39 = year37.isValid();
        boolean b40 = year37.isValid();
        boolean b41 = year37.isValid();
        Month month42 = new Month(12, year37);
        boolean b43 = day31.equals((java.lang.Object) year37);
        month20.setMonth((int) (byte) 10, year37);
        boolean b45 = year37.increment();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test079");
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
        boolean b16 = year15.increment();
    }

    @Test
    public void test080() throws Throwable {
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
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test081");
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
        int i17 = year11.getYear();
    }

    @Test
    public void test082() throws Throwable {
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
    public void test083() throws Throwable {
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
    public void test084() throws Throwable {
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
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test085");
        try {
            Date date3 = new Date((int) (short) 100, 2, (int) 'a');
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test086");
        Year year3 = new Year(1);
        boolean b4 = year3.isValid();
        boolean b5 = year3.isLeap();
        int i6 = year3.getYear();
        boolean b7 = year3.isLeap();
        Month month8 = new Month((int) (byte) 1, year3);
        Day day9 = new Day(31, month8);
        boolean b10 = day9.isValid();
        boolean b11 = day9.isValid();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test087");
        Year year2 = new Year((int) (byte) 100);
        java.lang.Object obj3 = new java.lang.Object();
        boolean b4 = year2.equals(obj3);
        Date date8 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year9 = date8.getYear();
        boolean b11 = date8.equals((java.lang.Object) "hi!");
        Month month12 = date8.getMonth();
        boolean b13 = year2.equals((java.lang.Object) date8);
        Day day14 = date8.getDay();
        Date date15 = Nextday.nextDay(date8);
        date15.printDate();
        Month month17 = date15.getMonth();
        boolean b18 = month17.isValid();
        int i19 = month17.getMonthSize();
        Year year21 = new Year(1);
        boolean b22 = year21.isValid();
        boolean b23 = year21.increment();
        boolean b24 = year21.isLeap();
        boolean b25 = year21.isValid();
        boolean b26 = month17.equals((java.lang.Object) year21);
        try {
            Month month27 = new Month(101, year21);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test088");
        try {
            Date date3 = new Date(52, 12, (int) (byte) 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test089() throws Throwable {
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
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test090");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        boolean b9 = date3.equals((java.lang.Object) (short) 100);
        Date date10 = Nextday.nextDay(date3);
        date10.increment();
        date10.printDate();
        Day day13 = date10.getDay();
        int i14 = day13.getDay();
        boolean b15 = day13.isValid();
    }

    @Test
    public void test091() throws Throwable {
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
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test092");
        Year year3 = new Year(1);
        boolean b4 = year3.isValid();
        boolean b5 = year3.isLeap();
        int i6 = year3.getYear();
        boolean b7 = year3.isLeap();
        Month month8 = new Month((int) (byte) 1, year3);
        Day day9 = new Day(31, month8);
        boolean b10 = day9.increment();
        boolean b11 = day9.isValid();
    }

    @Test
    public void test093() throws Throwable {
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
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test094");
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
        try {
            year21.setYear(0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test095");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Month month7 = date3.getMonth();
        date3.printDate();
        date3.printDate();
        Year year10 = date3.getYear();
        int i11 = year10.getYear();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test096");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        Year year8 = date3.getYear();
        Date date9 = Nextday.nextDay(date3);
        Month month10 = date3.getMonth();
        Year year12 = null;
        try {
            month10.setMonth((int) (short) 1, year12);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test097");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.increment();
        java.lang.String str8 = date3.toString();
        date3.increment();
        date3.increment();
    }

    @Test
    public void test098() throws Throwable {
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
    public void test099() throws Throwable {
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
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test100");
        try {
            Date date3 = new Date((int) '#', 30, (int) (short) -1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test101");
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
        int i12 = month7.getMonthSize();
        boolean b13 = month7.increment();
        int i14 = month7.getMonth();
    }

    @Test
    public void test102() throws Throwable {
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
    public void test103() throws Throwable {
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
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test104");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year5 = date4.getYear();
        date4.printDate();
        Year year7 = date4.getYear();
        Day day8 = date4.getDay();
        Month month9 = date4.getMonth();
        Day day10 = new Day(11, month9);
        int i11 = day10.getDay();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test105");
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
        int i16 = month7.getMonthSize();
        int i17 = month7.getMonth();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test106");
        Year year1 = new Year(1);
        boolean b2 = year1.increment();
        int i3 = year1.getYear();
        boolean b4 = year1.isValid();
        boolean b5 = year1.isValid();
    }

    @Test
    public void test107() throws Throwable {
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
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test108");
        Date date3 = new Date(10, 3, 33);
        Year year4 = date3.getYear();
        Day day5 = date3.getDay();
    }

    @Test
    public void test109() throws Throwable {
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
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test110");
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
        Date date15 = Nextday.nextDay(date3);
        Day day16 = date15.getDay();
        boolean b17 = day16.increment();
    }

    @Test
    public void test111() throws Throwable {
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
    public void test112() throws Throwable {
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
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test113");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        boolean b9 = date3.equals((java.lang.Object) (short) 100);
        Year year10 = date3.getYear();
        Month month11 = date3.getMonth();
        boolean b12 = month11.isValid();
        Year year16 = new Year(1);
        boolean b17 = year16.isValid();
        boolean b18 = year16.isValid();
        boolean b19 = year16.isValid();
        boolean b20 = year16.isValid();
        Month month21 = new Month(12, year16);
        try {
            month11.setMonth(31, year16);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test114() throws Throwable {
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
    public void test115() throws Throwable {
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
    public void test116() throws Throwable {
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
    public void test117() throws Throwable {
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
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test118");
        Year year1 = new Year((int) (short) 100);
        boolean b2 = year1.increment();
        Year year4 = new Year(1);
        boolean b5 = year4.isValid();
        int i6 = year4.getYear();
        year4.setYear(100);
        boolean b9 = year1.equals((java.lang.Object) year4);
        boolean b11 = year4.equals((java.lang.Object) (byte) -1);
        boolean b13 = year4.equals((java.lang.Object) 52);
        int i14 = year4.getYear();
        boolean b15 = year4.increment();
        boolean b16 = year4.isLeap();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test119");
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
        int i15 = year10.getYear();
        year10.setYear(10);
    }

    @Test
    public void test120() throws Throwable {
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
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test121");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isValid();
        year1.setYear(100);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test122");
        Year year3 = new Year((int) (byte) 100);
        boolean b4 = year3.isValid();
        Month month5 = new Month((int) (short) 10, year3);
        boolean b7 = month5.equals((java.lang.Object) 10L);
        boolean b8 = month5.isValid();
        boolean b9 = month5.increment();
        Day day10 = new Day((int) (short) 1, month5);
        Date date14 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year15 = date14.getYear();
        boolean b17 = date14.equals((java.lang.Object) "hi!");
        Day day18 = date14.getDay();
        Month month19 = date14.getMonth();
        Day day20 = date14.getDay();
        boolean b21 = day10.equals((java.lang.Object) date14);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test123");
        try {
            Date date3 = new Date((int) ' ', (int) '4', (int) 'a');
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test124");
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
        boolean b33 = day7.isValid();
        boolean b34 = day7.increment();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test125");
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
        try {
            Month month38 = new Month(97, year29);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test126");
        try {
            Date date3 = new Date((int) 'a', 2, 10);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test127() throws Throwable {
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
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test128");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        date3.printDate();
        Year year5 = date3.getYear();
        Day day6 = date3.getDay();
        Month month7 = date3.getMonth();
        date3.printDate();
    }

    @Test
    public void test129() throws Throwable {
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
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test130");
        Year year2 = new Year(97);
        try {
            Month month3 = new Month(28, year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test131() throws Throwable {
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
    public void test132() throws Throwable {
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
    public void test133() throws Throwable {
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
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test134");
        Date date3 = new Date((int) (byte) 10, 5, (int) (byte) 100);
    }

    @Test
    public void test135() throws Throwable {
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
    public void test136() throws Throwable {
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
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test137");
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
        Year year39 = new Year((int) (byte) 100);
        boolean b40 = year39.isValid();
        Month month41 = new Month((int) (short) 10, year39);
        int i42 = month41.getMonth();
        Year year45 = new Year((int) (short) 1);
        boolean b46 = year45.isLeap();
        month41.setMonth((int) (short) 10, year45);
        int i48 = month41.getMonthSize();
        boolean b49 = month41.isValid();
        Day day50 = new Day((int) (short) 10, month41);
        int i51 = month41.getMonth();
        Year year53 = new Year((int) (byte) 100);
        boolean b54 = year53.isValid();
        boolean b55 = year53.increment();
        year53.setYear((int) '4');
        boolean b58 = year53.isValid();
        boolean b59 = month41.equals((java.lang.Object) b58);
        try {
            day7.setDay(100, month41);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test138");
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
        java.lang.String str15 = date14.toString();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test139");
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
        boolean b17 = year16.isLeap();
        int i18 = year16.getYear();
    }

    @Test
    public void test140() throws Throwable {
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
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test141");
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
        Day day18 = date14.getDay();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test142");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        date3.printDate();
        Year year6 = date3.getYear();
        Day day7 = date3.getDay();
        Month month8 = date3.getMonth();
        Year year9 = date3.getYear();
        boolean b10 = year9.isValid();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test143");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isLeap();
        int i5 = year2.getYear();
        boolean b6 = year2.isLeap();
        Month month7 = new Month((int) (byte) 1, year2);
        Date date12 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date16 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year17 = date16.getYear();
        boolean b19 = date16.equals((java.lang.Object) "hi!");
        Day day20 = date16.getDay();
        Year year24 = new Year((int) (byte) 100);
        boolean b25 = year24.isValid();
        Month month26 = new Month((int) (short) 10, year24);
        day20.setDay((int) (short) 10, month26);
        java.lang.Object obj28 = null;
        boolean b29 = day20.equals(obj28);
        boolean b30 = day20.increment();
        int i31 = day20.getDay();
        boolean b32 = day20.isValid();
        boolean b33 = date12.equals((java.lang.Object) day20);
        Month month34 = date12.getMonth();
        Year year35 = date12.getYear();
        boolean b36 = year35.isValid();
        try {
            month7.setMonth((int) '4', year35);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test144");
        Year year1 = new Year((int) (short) 10);
        boolean b2 = year1.isValid();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test145");
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
        int i15 = year10.getYear();
        year10.setYear((int) '#');
        year10.setYear(33);
    }

    @Test
    public void test146() throws Throwable {
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
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test147");
        Year year1 = null;
        try {
            Month month2 = new Month(1, year1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test148() throws Throwable {
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
    public void test149() throws Throwable {
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
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test150");
        Year year1 = new Year(101);
        int i2 = year1.getYear();
    }

    @Test
    public void test151() throws Throwable {
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
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test152");
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
        int i28 = year8.getYear();
        boolean b29 = year8.isValid();
    }

    @Test
    public void test153() throws Throwable {
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
    public void test154() throws Throwable {
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
    public void test155() throws Throwable {
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
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test156");
        Year year2 = new Year(100);
        try {
            Month month3 = new Month((int) (byte) 100, year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test157() throws Throwable {
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
    public void test158() throws Throwable {
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
    public void test159() throws Throwable {
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
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test160");
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
        date13.printDate();
        Day day16 = date13.getDay();
        date13.increment();
    }

    @Test
    public void test161() throws Throwable {
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
    public void test162() throws Throwable {
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
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test163");
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
        java.lang.Object obj13 = null;
        boolean b14 = year1.equals(obj13);
        year1.setYear((int) (byte) -1);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test164");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.increment();
        boolean b4 = year1.increment();
        boolean b5 = year1.increment();
        boolean b6 = year1.isValid();
        boolean b7 = year1.isLeap();
        boolean b8 = year1.increment();
        boolean b9 = year1.isLeap();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test165");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year5 = date4.getYear();
        boolean b7 = date4.equals((java.lang.Object) "hi!");
        java.lang.String str8 = date4.toString();
        Year year9 = date4.getYear();
        Date date10 = Nextday.nextDay(date4);
        Month month11 = date10.getMonth();
        int i12 = month11.getMonth();
        int i13 = month11.getMonth();
        try {
            Day day14 = new Day(33, month11);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test166");
        try {
            Date date3 = new Date((-1), 3, 13);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test167");
        Year year1 = new Year(5);
        year1.setYear(10);
    }

    @Test
    public void test168() throws Throwable {
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
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test169");
        try {
            Date date3 = new Date(30, 0, 12);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test170() throws Throwable {
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
    public void test171() throws Throwable {
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
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test172");
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
        int i14 = month10.getMonthSize();
        boolean b15 = month10.increment();
        int i16 = month10.getMonthSize();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test173");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.increment();
        boolean b4 = year1.isLeap();
        boolean b5 = year1.isValid();
        int i6 = year1.getYear();
        year1.setYear((int) (byte) 100);
    }

    @Test
    public void test174() throws Throwable {
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
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test175");
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
        int i18 = day7.getDay();
        boolean b19 = day7.isValid();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test176");
        Year year1 = new Year(10);
        int i2 = year1.getYear();
    }

    @Test
    public void test177() throws Throwable {
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
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test178");
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
        Date date15 = Nextday.nextDay(date9);
        date15.increment();
    }

    @Test
    public void test179() throws Throwable {
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
    public void test180() throws Throwable {
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
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test181");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        boolean b6 = date4.equals((java.lang.Object) (-1));
        Year year7 = date4.getYear();
        Month month8 = new Month(3, year7);
        Year year11 = new Year(3);
        month8.setMonth(11, year11);
        boolean b13 = month8.increment();
        Year year15 = new Year(1);
        boolean b16 = year15.isValid();
        boolean b17 = year15.isValid();
        boolean b18 = year15.isLeap();
        boolean b19 = year15.isLeap();
        int i20 = year15.getYear();
        boolean b21 = year15.increment();
        boolean b22 = year15.increment();
        boolean b23 = year15.isValid();
        boolean b24 = year15.isLeap();
        boolean b25 = year15.isLeap();
        year15.setYear(11);
        boolean b28 = month8.equals((java.lang.Object) 11);
        int i29 = month8.getMonthSize();
    }

    @Test
    public void test182() throws Throwable {
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
    public void test183() throws Throwable {
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
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test184");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isValid();
        boolean b4 = year1.isLeap();
        boolean b5 = year1.isLeap();
        int i6 = year1.getYear();
        int i7 = year1.getYear();
        boolean b8 = year1.isLeap();
        boolean b9 = year1.increment();
        boolean b10 = year1.isValid();
    }

    @Test
    public void test185() throws Throwable {
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
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test186");
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
        Month month27 = date3.getMonth();
        Day day28 = date3.getDay();
        boolean b29 = day28.isValid();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test187");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date4 = Nextday.nextDay(date3);
        date3.increment();
        date3.increment();
        java.lang.String str7 = date3.toString();
        Day day8 = date3.getDay();
        java.lang.String str9 = date3.toString();
        Month month10 = date3.getMonth();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test188");
        try {
            Date date3 = new Date(28, 10, 5);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test189");
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
        boolean b14 = day9.increment();
        int i15 = day9.getDay();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test190");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b6 = month4.equals((java.lang.Object) 10L);
        Year year8 = new Year(1);
        boolean b9 = year8.increment();
        boolean b10 = month4.equals((java.lang.Object) year8);
        int i11 = month4.getMonth();
        Date date17 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year18 = date17.getYear();
        boolean b20 = date17.equals((java.lang.Object) "hi!");
        java.lang.String str21 = date17.toString();
        Year year22 = date17.getYear();
        Date date23 = Nextday.nextDay(date17);
        Month month24 = date23.getMonth();
        Year year25 = date23.getYear();
        Month month26 = new Month(12, year25);
        try {
            month4.setMonth((int) (byte) -1, year25);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test191() throws Throwable {
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
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test192");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        Day day8 = date3.getDay();
        Day day9 = date3.getDay();
        date3.printDate();
        date3.printDate();
        java.lang.String str12 = date3.toString();
        Date date13 = Nextday.nextDay(date3);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test193");
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
        boolean b18 = day14.isValid();
    }

    @Test
    public void test194() throws Throwable {
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
    public void test195() throws Throwable {
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
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test196");
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
        Year year21 = new Year(1);
        boolean b22 = year21.isLeap();
        int i23 = year21.getYear();
        year21.setYear(100);
        year21.setYear((int) '4');
        int i28 = year21.getYear();
        int i29 = year21.getYear();
        boolean b30 = day17.equals((java.lang.Object) year21);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test197");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        date3.printDate();
        Year year5 = date3.getYear();
        Date date6 = Nextday.nextDay(date3);
        Date date7 = Nextday.nextDay(date3);
        Month month8 = date7.getMonth();
        date7.printDate();
        Year year10 = date7.getYear();
    }

    @Test
    public void test198() throws Throwable {
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
    public void test199() throws Throwable {
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
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test200");
        Year year1 = new Year(1);
        boolean b2 = year1.isLeap();
        boolean b3 = year1.increment();
        boolean b4 = year1.isLeap();
        boolean b5 = year1.isValid();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test201");
        Date date3 = new Date((int) (short) 10, 11, (int) (short) 100);
        Month month4 = date3.getMonth();
        Month month5 = date3.getMonth();
        Month month6 = date3.getMonth();
    }

    @Test
    public void test202() throws Throwable {
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
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test203");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Day day7 = date3.getDay();
        Year year8 = date3.getYear();
        Month month9 = date3.getMonth();
        date3.increment();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test204");
        Date date3 = new Date((int) (byte) 1, 3, 102);
        java.lang.String str4 = date3.toString();
        java.lang.String str5 = date3.toString();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test205");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year5 = date4.getYear();
        boolean b7 = date4.equals((java.lang.Object) "hi!");
        date4.printDate();
        Year year9 = date4.getYear();
        date4.increment();
        Date date11 = Nextday.nextDay(date4);
        Year year12 = date4.getYear();
        Month month13 = date4.getMonth();
        Day day14 = new Day(3, month13);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test206");
        Year year1 = new Year(32);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isLeap();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test207");
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
        int i33 = year28.getYear();
        boolean b34 = year28.increment();
    }

    @Test
    public void test208() throws Throwable {
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
    public void test209() throws Throwable {
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
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test210");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        date3.printDate();
        Year year6 = date3.getYear();
        Day day7 = date3.getDay();
        Month month8 = date3.getMonth();
        Year year9 = date3.getYear();
        int i10 = year9.getYear();
        year9.setYear(4);
        boolean b13 = year9.isLeap();
    }

    @Test
    public void test211() throws Throwable {
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
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test212");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        date3.printDate();
        Year year5 = date3.getYear();
        Date date6 = Nextday.nextDay(date3);
        Date date7 = Nextday.nextDay(date3);
        date7.printDate();
        Month month9 = date7.getMonth();
        boolean b10 = month9.increment();
        boolean b11 = month9.increment();
        Year year14 = new Year((int) (byte) 100);
        Date date18 = new Date(10, (int) (byte) 10, (int) (short) 1);
        boolean b19 = year14.equals((java.lang.Object) 10);
        try {
            month9.setMonth(34, year14);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test213");
        try {
            Date date3 = new Date((int) '4', (int) (byte) 0, 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test214() throws Throwable {
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
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test215");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isValid();
        boolean b4 = year1.isLeap();
        boolean b5 = year1.isLeap();
        int i6 = year1.getYear();
        boolean b7 = year1.increment();
        boolean b8 = year1.increment();
        boolean b9 = year1.increment();
        year1.setYear((int) (short) 10);
    }

    @Test
    public void test216() throws Throwable {
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
    public void test217() throws Throwable {
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
    public void test218() throws Throwable {
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
    public void test219() throws Throwable {
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
    public void test220() throws Throwable {
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
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test221");
        Date date3 = new Date(2, (int) (short) 1, (int) 'a');
        Day day4 = date3.getDay();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test222");
        Year year3 = new Year((int) (byte) 100);
        boolean b4 = year3.isValid();
        Month month5 = new Month((int) (short) 10, year3);
        boolean b7 = month5.equals((java.lang.Object) 10L);
        boolean b8 = month5.isValid();
        boolean b9 = month5.isValid();
        Year year11 = new Year(1);
        boolean b12 = year11.isValid();
        boolean b13 = year11.isLeap();
        int i14 = year11.getYear();
        boolean b15 = month5.equals((java.lang.Object) year11);
        boolean b16 = year11.isLeap();
        try {
            Month month17 = new Month(28, year11);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test223");
        Year year4 = new Year((int) (byte) 100);
        boolean b5 = year4.isValid();
        Month month6 = new Month((int) (short) 10, year4);
        boolean b7 = year4.increment();
        Month month8 = new Month(2, year4);
        boolean b9 = year4.isValid();
        Month month10 = new Month(5, year4);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test224");
        Year year4 = new Year(1);
        boolean b5 = year4.isValid();
        boolean b6 = year4.isLeap();
        int i7 = year4.getYear();
        boolean b8 = year4.isLeap();
        Month month9 = new Month((int) (byte) 1, year4);
        Day day10 = new Day(10, month9);
        int i11 = month9.getMonthSize();
        try {
            Day day12 = new Day((int) ' ', month9);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test225");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        date3.printDate();
        Year year5 = date3.getYear();
        date3.printDate();
        java.lang.String str7 = date3.toString();
        Day day8 = date3.getDay();
        Date date9 = Nextday.nextDay(date3);
        date9.increment();
        Day day11 = date9.getDay();
        Date date16 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year17 = date16.getYear();
        Year year20 = new Year((int) (byte) 100);
        boolean b21 = year20.isValid();
        Month month22 = new Month((int) (short) 10, year20);
        boolean b23 = month22.increment();
        boolean b24 = date16.equals((java.lang.Object) month22);
        Year year25 = date16.getYear();
        java.lang.String str26 = date16.toString();
        date16.increment();
        Day day28 = date16.getDay();
        Day day29 = date16.getDay();
        Day day30 = date16.getDay();
        Month month31 = date16.getMonth();
        Month month32 = date16.getMonth();
        int i33 = month32.getMonth();
        try {
            day11.setDay((int) (short) -1, month32);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test226() throws Throwable {
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
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test227");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isValid();
        boolean b4 = year1.isLeap();
        int i5 = year1.getYear();
        boolean b6 = year1.increment();
        year1.setYear(2);
        boolean b9 = year1.increment();
        year1.setYear(13);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test228");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b5 = month4.increment();
        boolean b6 = month4.increment();
        boolean b7 = month4.isValid();
        boolean b8 = month4.increment();
        boolean b9 = month4.increment();
        try {
            int i10 = month4.getMonthSize();
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test229");
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
        Year year25 = new Year(1);
        boolean b26 = year25.isLeap();
        boolean b27 = year25.isLeap();
        java.lang.Object obj28 = new java.lang.Object();
        boolean b29 = year25.equals(obj28);
        boolean b30 = year25.increment();
        boolean b31 = month4.equals((java.lang.Object) year25);
        boolean b32 = year25.isLeap();
    }

    @Test
    public void test230() throws Throwable {
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
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test231");
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
        Date date20 = new Date(10, (int) (byte) 10, (int) (short) 1);
        java.lang.String str21 = date20.toString();
        java.lang.String str22 = date20.toString();
        Day day23 = date20.getDay();
        boolean b24 = day16.equals((java.lang.Object) date20);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test232");
        try {
            Date date3 = new Date(3, 97, 3);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test233");
        Year year1 = new Year((int) (byte) 100);
        int i2 = year1.getYear();
        int i3 = year1.getYear();
        boolean b4 = year1.isLeap();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test234");
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
        Date date18 = new Date((int) (short) 10, 11, (int) (short) 100);
        Month month19 = date18.getMonth();
        try {
            day10.setDay(0, month19);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test235() throws Throwable {
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
    public void test236() throws Throwable {
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
    public void test237() throws Throwable {
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
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test238");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Day day7 = date3.getDay();
        int i8 = day7.getDay();
        int i9 = day7.getDay();
        Date date14 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year15 = date14.getYear();
        boolean b17 = date14.equals((java.lang.Object) "hi!");
        java.lang.String str18 = date14.toString();
        boolean b20 = date14.equals((java.lang.Object) (short) 100);
        Date date21 = Nextday.nextDay(date14);
        date21.increment();
        Month month23 = date21.getMonth();
        try {
            day7.setDay(52, month23);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test239() throws Throwable {
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
    public void test240() throws Throwable {
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
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test241");
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
        Date date23 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year24 = date23.getYear();
        date23.printDate();
        Year year26 = date23.getYear();
        Day day27 = date23.getDay();
        Month month28 = date23.getMonth();
        Day day29 = new Day(11, month28);
        try {
            day17.setDay((int) '4', month28);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test242");
        Year year3 = new Year((int) (byte) 100);
        boolean b4 = year3.isValid();
        Month month5 = new Month((int) (short) 10, year3);
        boolean b6 = month5.increment();
        int i7 = month5.getMonthSize();
        try {
            Day day8 = new Day(0, month5);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test243() throws Throwable {
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
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test244");
        Year year1 = new Year(1);
        boolean b2 = year1.isLeap();
        int i3 = year1.getYear();
        boolean b4 = year1.isValid();
        int i5 = year1.getYear();
        year1.setYear(101);
        boolean b8 = year1.isValid();
    }

    @Test
    public void test245() throws Throwable {
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
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test246");
        Year year3 = new Year(1);
        boolean b4 = year3.isValid();
        boolean b5 = year3.isLeap();
        int i6 = year3.getYear();
        boolean b7 = year3.isLeap();
        Month month8 = new Month((int) (byte) 1, year3);
        Day day9 = new Day(31, month8);
        boolean b10 = day9.isValid();
        int i11 = day9.getDay();
        int i12 = day9.getDay();
        boolean b13 = day9.isValid();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test247");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isValid();
        int i4 = year1.getYear();
        year1.setYear((int) (byte) -1);
        boolean b7 = year1.isValid();
        year1.setYear(2);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test248");
        Year year3 = new Year(52);
        Month month4 = new Month((int) (short) 10, year3);
        try {
            Day day5 = new Day(53, month4);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test249");
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
        boolean b17 = year1.isLeap();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test250");
        Year year3 = new Year(1);
        boolean b4 = year3.isValid();
        boolean b5 = year3.isValid();
        boolean b6 = year3.isValid();
        boolean b7 = year3.isValid();
        Month month8 = new Month(12, year3);
        Month month9 = new Month(11, year3);
        year3.setYear((int) 'a');
    }

    @Test
    public void test251() throws Throwable {
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
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test252");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        date3.printDate();
        Year year6 = date3.getYear();
        Day day7 = date3.getDay();
        Month month8 = date3.getMonth();
        Year year9 = date3.getYear();
        Date date10 = Nextday.nextDay(date3);
        Date date11 = Nextday.nextDay(date10);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test253");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        Year year8 = date3.getYear();
        Date date9 = Nextday.nextDay(date3);
        date3.printDate();
        Year year11 = date3.getYear();
        Day day12 = date3.getDay();
        Year year13 = date3.getYear();
        Year year14 = date3.getYear();
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test254");
        Year year1 = new Year((int) (byte) 10);
        boolean b2 = year1.isLeap();
    }

    @Test
    public void test255() throws Throwable {
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
    public void test256() throws Throwable {
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
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test257");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        boolean b6 = date4.equals((java.lang.Object) (-1));
        Year year8 = new Year(1);
        boolean b9 = year8.isValid();
        boolean b10 = year8.isLeap();
        int i11 = year8.getYear();
        boolean b12 = year8.isLeap();
        boolean b13 = year8.isLeap();
        boolean b14 = date4.equals((java.lang.Object) b13);
        Day day15 = date4.getDay();
        Month month16 = date4.getMonth();
        boolean b17 = month16.isValid();
        int i18 = month16.getMonthSize();
        try {
            Day day19 = new Day((-1), month16);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test258");
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
        Date date26 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year27 = date26.getYear();
        boolean b29 = date26.equals((java.lang.Object) "hi!");
        Day day30 = date26.getDay();
        Year year34 = new Year((int) (byte) 100);
        boolean b35 = year34.isValid();
        Month month36 = new Month((int) (short) 10, year34);
        day30.setDay((int) (short) 10, month36);
        boolean b38 = month36.increment();
        int i39 = month36.getMonthSize();
        boolean b40 = month36.increment();
        boolean b41 = month36.increment();
        boolean b42 = month36.increment();
        try {
            day7.setDay((int) (byte) 0, month36);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test259() throws Throwable {
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
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test260");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Day day7 = date3.getDay();
        Date date8 = Nextday.nextDay(date3);
        Month month9 = date3.getMonth();
        java.lang.String str10 = date3.toString();
        date3.printDate();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test261");
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
        boolean b19 = day7.increment();
        boolean b20 = day7.increment();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test262");
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
        boolean b33 = year25.increment();
        boolean b34 = year25.isValid();
        boolean b35 = year25.increment();
        boolean b36 = year25.increment();
    }

    @Test
    public void test263() throws Throwable {
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
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test264");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isValid();
        Month month5 = new Month((int) (short) 10, year2);
        int i6 = month5.getMonthSize();
        int i7 = month5.getMonth();
        int i8 = month5.getMonth();
        boolean b9 = month5.isValid();
        int i10 = month5.getMonthSize();
    }

    @Test
    public void test265() throws Throwable {
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
    public void test266() throws Throwable {
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
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test267");
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
        boolean b19 = year9.isLeap();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test268");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        date3.printDate();
        Year year5 = date3.getYear();
        Month month6 = date3.getMonth();
        int i7 = month6.getMonth();
    }

    @Test
    public void test269() throws Throwable {
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
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test270");
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
        int i29 = month22.getMonth();
    }

    @Test
    public void test271() throws Throwable {
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
    public void test272() throws Throwable {
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
    public void test273() throws Throwable {
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
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test274");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        date4.printDate();
        Year year6 = date4.getYear();
        Day day7 = date4.getDay();
        Day day8 = date4.getDay();
        Date date9 = Nextday.nextDay(date4);
        Month month10 = date9.getMonth();
        try {
            Day day11 = new Day(101, month10);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test275() throws Throwable {
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
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test276");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.increment();
        boolean b5 = year2.increment();
        boolean b6 = year2.isLeap();
        int i7 = year2.getYear();
        Month month8 = new Month(1, year2);
        year2.setYear((int) (byte) 1);
        boolean b11 = year2.increment();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test277");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.printDate();
        date3.printDate();
        Month month9 = date3.getMonth();
        Month month10 = date3.getMonth();
        java.lang.String str11 = date3.toString();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test278");
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
        int i34 = year29.getYear();
        Month month35 = new Month(3, year29);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test279");
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
        Day day16 = date14.getDay();
        boolean b18 = day16.equals((java.lang.Object) (byte) 10);
    }

    @Test
    public void test280() throws Throwable {
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
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test281");
        Year year1 = new Year((int) (byte) 100);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = year1.equals(obj2);
        Date date7 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year8 = date7.getYear();
        boolean b10 = date7.equals((java.lang.Object) "hi!");
        Month month11 = date7.getMonth();
        boolean b12 = year1.equals((java.lang.Object) date7);
        Date date13 = Nextday.nextDay(date7);
        Month month14 = date13.getMonth();
        boolean b15 = month14.isValid();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test282");
        try {
            Date date3 = new Date((int) (byte) -1, 100, (int) (short) 1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test283() throws Throwable {
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
    public void test284() throws Throwable {
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
    public void test285() throws Throwable {
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
    public void test286() throws Throwable {
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
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test287");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        Month month5 = date3.getMonth();
        date3.increment();
        java.lang.String str7 = date3.toString();
    }

    @Test
    public void test288() throws Throwable {
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
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test289");
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
        date13.increment();
    }

    @Test
    public void test290() throws Throwable {
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
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test291");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        Day day8 = date3.getDay();
        Day day9 = date3.getDay();
        int i10 = day9.getDay();
        boolean b11 = day9.increment();
        Date date16 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year17 = date16.getYear();
        boolean b19 = date16.equals((java.lang.Object) "hi!");
        java.lang.String str20 = date16.toString();
        Year year21 = date16.getYear();
        Date date22 = Nextday.nextDay(date16);
        Month month23 = date16.getMonth();
        Year year24 = date16.getYear();
        Day day25 = date16.getDay();
        Month month26 = date16.getMonth();
        try {
            day9.setDay((int) 'a', month26);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test292() throws Throwable {
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
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test293");
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
        boolean b17 = day15.isValid();
    }

    @Test
    public void test294() throws Throwable {
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
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test295");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        date3.printDate();
        Year year5 = date3.getYear();
        Date date6 = Nextday.nextDay(date3);
        date6.increment();
        java.lang.String str8 = date6.toString();
        Day day9 = date6.getDay();
        int i10 = day9.getDay();
        boolean b11 = day9.increment();
        int i12 = day9.getDay();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test296");
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
        Month month27 = date3.getMonth();
        Day day28 = date3.getDay();
        int i29 = day28.getDay();
    }

    @Test
    public void test297() throws Throwable {
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
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test298");
        try {
            Date date3 = new Date(5, (int) (short) 0, (int) ' ');
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test299");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date5 = Nextday.nextDay(date4);
        Year year8 = new Year((int) (byte) 100);
        boolean b9 = year8.isValid();
        Month month10 = new Month((int) (short) 10, year8);
        boolean b11 = month10.increment();
        int i12 = month10.getMonthSize();
        boolean b13 = month10.isValid();
        boolean b14 = date5.equals((java.lang.Object) month10);
        Year year17 = new Year(1);
        boolean b18 = year17.isValid();
        boolean b19 = year17.increment();
        boolean b20 = year17.increment();
        boolean b21 = year17.increment();
        month10.setMonth(1, year17);
        boolean b23 = month10.increment();
        boolean b24 = month10.increment();
        try {
            Day day25 = new Day(52, month10);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test300");
        Year year3 = new Year((int) (byte) 100);
        int i4 = year3.getYear();
        int i5 = year3.getYear();
        Month month6 = new Month(5, year3);
        Month month7 = new Month(11, year3);
    }

    @Test
    public void test301() throws Throwable {
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
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test302");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Day day7 = date3.getDay();
        Year year8 = date3.getYear();
        boolean b9 = year8.increment();
        year8.setYear(5);
        boolean b12 = year8.isLeap();
        boolean b13 = year8.isLeap();
        Date date17 = new Date(2, 10, 10);
        Date date18 = Nextday.nextDay(date17);
        boolean b19 = year8.equals((java.lang.Object) date17);
        date17.increment();
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test303");
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
        java.lang.String str18 = date3.toString();
    }

    @Test
    public void test304() throws Throwable {
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
    public void test305() throws Throwable {
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
    public void test306() throws Throwable {
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
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test307");
        Date date3 = new Date(5, (int) (byte) 1, 12);
    }

    @Test
    public void test308() throws Throwable {
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
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test309");
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
        int i12 = month7.getMonthSize();
        int i13 = month7.getMonthSize();
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test310");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        boolean b5 = date3.equals((java.lang.Object) (-1));
        date3.increment();
        date3.increment();
        Day day8 = date3.getDay();
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test311");
        Year year2 = new Year((int) (byte) -1);
        boolean b3 = year2.isValid();
        try {
            Month month4 = new Month(97, year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test312");
        Year year1 = new Year((int) ' ');
        boolean b2 = year1.isValid();
        boolean b3 = year1.isValid();
    }

    @Test
    public void test313() throws Throwable {
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
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test314");
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
        date13.increment();
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test315");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        boolean b9 = date3.equals((java.lang.Object) (short) 100);
        Date date10 = Nextday.nextDay(date3);
        date10.increment();
        Month month12 = date10.getMonth();
        java.lang.String str13 = date10.toString();
        date10.increment();
        date10.printDate();
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test316");
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
        boolean b17 = year13.isLeap();
        boolean b18 = year13.isLeap();
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test317");
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
        boolean b27 = day15.isValid();
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test318");
        Year year2 = new Year((int) (short) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month(12, year2);
        boolean b5 = year2.increment();
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test319");
        Year year3 = new Year(52);
        Month month4 = new Month((int) (short) 10, year3);
        Month month5 = new Month(5, year3);
        year3.setYear(2);
        boolean b8 = year3.isValid();
    }

    @Test
    public void test320() throws Throwable {
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
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test321");
        Date date3 = new Date(12, 31, (int) (short) -1);
    }

    @Test
    public void test322() throws Throwable {
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
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test323");
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
        int i20 = year14.getYear();
    }

    @Test
    public void test324() throws Throwable {
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
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test325");
        Year year2 = new Year((int) (byte) 100);
        int i3 = year2.getYear();
        int i4 = year2.getYear();
        Month month5 = new Month(5, year2);
        int i6 = month5.getMonth();
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test326");
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
        boolean b18 = year14.isValid();
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test327");
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
        date3.printDate();
    }

    @Test
    public void test328() throws Throwable {
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
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test329");
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
        boolean b13 = year1.isLeap();
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test330");
        Year year1 = null;
        try {
            Month month2 = new Month(32, year1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test331() throws Throwable {
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
    public void test332() throws Throwable {
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
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test333");
        try {
            Date date3 = new Date((int) (byte) 100, 31, 2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test334");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        date3.printDate();
        Year year6 = date3.getYear();
        Day day7 = date3.getDay();
        Month month8 = date3.getMonth();
        int i9 = month8.getMonth();
        int i10 = month8.getMonth();
    }

    @Test
    public void test335() throws Throwable {
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
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test336");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        Year year8 = date3.getYear();
        Date date9 = Nextday.nextDay(date3);
        date3.printDate();
        Year year11 = date3.getYear();
        Day day12 = date3.getDay();
        date3.printDate();
        Year year17 = new Year((int) (byte) 100);
        boolean b18 = year17.isValid();
        Month month19 = new Month((int) (short) 10, year17);
        boolean b20 = month19.increment();
        boolean b21 = month19.isValid();
        boolean b23 = month19.equals((java.lang.Object) 1);
        int i24 = month19.getMonthSize();
        Day day25 = new Day(4, month19);
        boolean b26 = date3.equals((java.lang.Object) 4);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test337");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.increment();
        java.lang.String str8 = date3.toString();
        date3.printDate();
        Year year10 = date3.getYear();
        Date date11 = Nextday.nextDay(date3);
        date11.printDate();
        date11.increment();
        Date date14 = Nextday.nextDay(date11);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test338");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.increment();
        boolean b4 = year1.isLeap();
        boolean b5 = year1.isValid();
        int i6 = year1.getYear();
        Year year11 = new Year(1);
        boolean b12 = year11.isLeap();
        boolean b13 = year11.isLeap();
        boolean b14 = year11.increment();
        Month month15 = new Month((int) (short) 1, year11);
        Date date19 = new Date(10, (int) (byte) 10, (int) (short) 1);
        java.lang.String str20 = date19.toString();
        boolean b21 = month15.equals((java.lang.Object) date19);
        Day day22 = new Day((int) (byte) 10, month15);
        Year year25 = new Year(1);
        boolean b26 = year25.isLeap();
        boolean b27 = year25.isLeap();
        Date date31 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year32 = date31.getYear();
        boolean b34 = date31.equals((java.lang.Object) "hi!");
        date31.increment();
        java.lang.String str36 = date31.toString();
        boolean b37 = year25.equals((java.lang.Object) date31);
        Month month38 = new Month((int) (short) 10, year25);
        boolean b39 = year25.isLeap();
        boolean b40 = day22.equals((java.lang.Object) year25);
        Year year44 = new Year((int) (byte) 100);
        boolean b45 = year44.isValid();
        Month month46 = new Month((int) (short) 10, year44);
        int i47 = month46.getMonth();
        Day day48 = new Day(30, month46);
        int i49 = day48.getDay();
        boolean b50 = year25.equals((java.lang.Object) day48);
        year25.setYear(3);
        Month month53 = new Month(3, year25);
        Date date57 = new Date((int) (short) 10, 11, (int) (short) 100);
        Day day58 = date57.getDay();
        Day day59 = date57.getDay();
        boolean b60 = month53.equals((java.lang.Object) date57);
        boolean b61 = year1.equals((java.lang.Object) month53);
    }

    @Test
    public void test339() throws Throwable {
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
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test340");
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
        Month month16 = date4.getMonth();
        boolean b17 = month16.increment();
        Year year19 = new Year(1);
        boolean b20 = year19.isValid();
        int i21 = year19.getYear();
        year19.setYear(100);
        boolean b24 = month16.equals((java.lang.Object) year19);
        try {
            Day day25 = new Day((int) (byte) 0, month16);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test341() throws Throwable {
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
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test342");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Day day7 = date3.getDay();
        Month month8 = date3.getMonth();
        Day day9 = date3.getDay();
        Month month10 = date3.getMonth();
        Day day11 = date3.getDay();
        Year year12 = date3.getYear();
    }

    @Test
    public void test343() throws Throwable {
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
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test344");
        try {
            Date date3 = new Date(5, 97, 30);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test345");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        year1.setYear((int) (short) 100);
        int i5 = year1.getYear();
    }

    @Test
    public void test346() throws Throwable {
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
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test347");
        Year year1 = new Year(1);
        boolean b2 = year1.isLeap();
        boolean b3 = year1.isLeap();
        boolean b4 = year1.increment();
        java.lang.Object obj5 = null;
        boolean b6 = year1.equals(obj5);
        boolean b7 = year1.isLeap();
        Date date11 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year12 = date11.getYear();
        boolean b13 = year1.equals((java.lang.Object) date11);
        Day day14 = date11.getDay();
        boolean b15 = day14.isValid();
        Year year19 = new Year((int) (byte) 100);
        boolean b20 = year19.isValid();
        Month month21 = new Month((int) (short) 10, year19);
        boolean b22 = month21.increment();
        int i23 = month21.getMonth();
        int i24 = month21.getMonth();
        Day day25 = new Day((int) (byte) 1, month21);
        Year year27 = new Year(1);
        boolean b28 = year27.isValid();
        boolean b29 = year27.isValid();
        boolean b30 = year27.isLeap();
        int i31 = year27.getYear();
        boolean b32 = year27.increment();
        int i33 = year27.getYear();
        boolean b34 = year27.isLeap();
        year27.setYear((int) (short) 100);
        boolean b37 = day25.equals((java.lang.Object) year27);
        year27.setYear(3);
        boolean b40 = day14.equals((java.lang.Object) year27);
        boolean b41 = day14.increment();
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test348");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.increment();
        Date date8 = Nextday.nextDay(date3);
        date3.printDate();
        Day day10 = date3.getDay();
        java.lang.String str11 = date3.toString();
        date3.printDate();
        date3.printDate();
        date3.increment();
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test349");
        Year year1 = new Year(101);
        boolean b2 = year1.isValid();
        int i3 = year1.getYear();
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test350");
        Year year1 = new Year(30);
        boolean b2 = year1.isValid();
    }

    @Test
    public void test351() throws Throwable {
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
    public void test352() throws Throwable {
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
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test353");
        Year year3 = new Year((int) (byte) 100);
        boolean b4 = year3.isValid();
        Month month5 = new Month((int) (short) 10, year3);
        int i6 = month5.getMonth();
        Year year9 = new Year((int) (short) 1);
        boolean b10 = year9.isLeap();
        month5.setMonth((int) (short) 10, year9);
        int i12 = month5.getMonth();
        Day day13 = new Day(12, month5);
        Year year15 = null;
        try {
            month5.setMonth(12, year15);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test354");
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
        Date date22 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year23 = date22.getYear();
        boolean b25 = date22.equals((java.lang.Object) "hi!");
        date22.printDate();
        Year year27 = date22.getYear();
        int i28 = year27.getYear();
        int i29 = year27.getYear();
        try {
            month13.setMonth((int) ' ', year27);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test355() throws Throwable {
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
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test356");
        try {
            Date date3 = new Date(13, (int) (short) 0, 2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test357");
        Year year2 = new Year(31);
        int i3 = year2.getYear();
        boolean b4 = year2.isLeap();
        int i5 = year2.getYear();
        Year year8 = new Year(1);
        boolean b9 = year8.isValid();
        boolean b10 = year8.isLeap();
        int i11 = year8.getYear();
        boolean b12 = year8.isLeap();
        Month month13 = new Month((int) (byte) 1, year8);
        int i14 = month13.getMonthSize();
        int i15 = month13.getMonthSize();
        int i16 = month13.getMonthSize();
        boolean b17 = month13.isValid();
        int i18 = month13.getMonth();
        boolean b19 = month13.increment();
        Year year22 = new Year(1);
        boolean b23 = year22.isLeap();
        boolean b24 = year22.isLeap();
        java.lang.Object obj25 = new java.lang.Object();
        boolean b26 = year22.equals(obj25);
        boolean b27 = year22.increment();
        month13.setMonth(1, year22);
        int i29 = month13.getMonth();
        int i30 = month13.getMonthSize();
        boolean b31 = year2.equals((java.lang.Object) month13);
        int i32 = month13.getMonthSize();
        try {
            Day day33 = new Day(101, month13);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test358");
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
        int i23 = year14.getYear();
    }

    @Test
    public void test359() throws Throwable {
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
    public void test360() throws Throwable {
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
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test361");
        try {
            Date date3 = new Date(97, 52, 52);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test362");
        try {
            Date date3 = new Date(35, (int) (byte) 1, (int) ' ');
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test363() throws Throwable {
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
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test364");
        Date date3 = new Date((int) (short) 10, 11, (int) (short) 100);
        Year year4 = date3.getYear();
        Day day5 = date3.getDay();
        java.lang.String str6 = date3.toString();
        date3.printDate();
    }

    @Test
    public void test365() throws Throwable {
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
    public void test366() throws Throwable {
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
    public void test367() throws Throwable {
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
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test368");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.printDate();
        Year year8 = date3.getYear();
        date3.increment();
        Year year10 = date3.getYear();
        Date date11 = Nextday.nextDay(date3);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test369");
        try {
            Date date3 = new Date(52, (int) (short) 10, 13);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test370() throws Throwable {
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
    public void test371() throws Throwable {
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
    public void test372() throws Throwable {
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
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test373");
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
        int i22 = year17.getYear();
        year17.setYear(5);
    }

    @Test
    public void test374() throws Throwable {
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
    public void test375() throws Throwable {
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
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test376");
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
        int i16 = month7.getMonthSize();
        Date date21 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year22 = date21.getYear();
        boolean b24 = date21.equals((java.lang.Object) "hi!");
        java.lang.String str25 = date21.toString();
        boolean b27 = date21.equals((java.lang.Object) (short) 100);
        Year year28 = date21.getYear();
        Date date29 = Nextday.nextDay(date21);
        date21.increment();
        Year year31 = date21.getYear();
        boolean b32 = year31.increment();
        try {
            month7.setMonth((int) (short) -1, year31);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test377() throws Throwable {
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
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test378");
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
        Year year16 = new Year(1);
        boolean b17 = year16.isValid();
        boolean b18 = year16.isValid();
        boolean b19 = year16.isLeap();
        boolean b20 = year16.isLeap();
        int i21 = year16.getYear();
        boolean b22 = year16.increment();
        boolean b23 = year16.increment();
        boolean b25 = year16.equals((java.lang.Object) "10/10/1");
        boolean b26 = year16.isLeap();
        int i27 = year16.getYear();
        boolean b28 = month14.equals((java.lang.Object) i27);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test379");
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
        boolean b16 = day9.increment();
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test380");
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
        boolean b19 = month13.increment();
        int i20 = month13.getMonth();
    }

    @Test
    public void test381() throws Throwable {
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
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test382");
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
        boolean b26 = year25.isLeap();
        boolean b27 = year25.isLeap();
        boolean b28 = year25.increment();
        java.lang.Object obj29 = null;
        boolean b30 = year25.equals(obj29);
        int i31 = year25.getYear();
        boolean b32 = year25.isLeap();
        int i33 = year25.getYear();
        boolean b34 = year25.increment();
        int i35 = year25.getYear();
        try {
            month9.setMonth((int) ' ', year25);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test383");
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
        Year year27 = new Year(53);
        month16.setMonth(12, year27);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test384");
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
        int i25 = month16.getMonth();
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test385");
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
        Day day17 = date16.getDay();
        Date date18 = Nextday.nextDay(date16);
        Date date19 = Nextday.nextDay(date18);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test386");
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
        boolean b18 = month17.isValid();
        Day day19 = new Day(2, month17);
    }

    @Test
    public void test387() throws Throwable {
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
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test388");
        Year year4 = new Year((int) (byte) 100);
        boolean b5 = year4.isValid();
        Month month6 = new Month((int) (short) 10, year4);
        boolean b7 = month6.increment();
        int i8 = month6.getMonthSize();
        boolean b9 = month6.isValid();
        Day day10 = new Day(10, month6);
        Day day11 = new Day(12, month6);
        Date date16 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year17 = date16.getYear();
        boolean b19 = date16.equals((java.lang.Object) "hi!");
        java.lang.String str20 = date16.toString();
        boolean b22 = date16.equals((java.lang.Object) (short) 100);
        Year year23 = date16.getYear();
        Date date24 = Nextday.nextDay(date16);
        date24.increment();
        Month month26 = date24.getMonth();
        day11.setDay(5, month26);
        int i28 = month26.getMonth();
        int i29 = month26.getMonthSize();
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test389");
        try {
            Date date3 = new Date((int) (byte) 0, (int) (short) 100, (int) '#');
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test390");
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
        date14.printDate();
        Month month18 = date14.getMonth();
        int i19 = month18.getMonth();
    }

    @Test
    public void test391() throws Throwable {
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
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test392");
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
        boolean b15 = year1.isLeap();
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test393");
        try {
            Date date3 = new Date(101, (int) (byte) 10, 31);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test394() throws Throwable {
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
    public void test395() throws Throwable {
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
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test396");
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
        Year year18 = new Year(1);
        boolean b19 = year18.isValid();
        boolean b20 = year18.isValid();
        boolean b21 = year18.isLeap();
        boolean b22 = year18.isLeap();
        int i23 = year18.getYear();
        boolean b24 = year18.increment();
        boolean b25 = year18.increment();
        boolean b26 = year18.isValid();
        boolean b27 = year18.isLeap();
        try {
            month9.setMonth(34, year18);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test397() throws Throwable {
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
    public void test398() throws Throwable {
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
    public void test399() throws Throwable {
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
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test400");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year5 = date4.getYear();
        boolean b7 = date4.equals((java.lang.Object) "hi!");
        Month month8 = date4.getMonth();
        Day day9 = date4.getDay();
        Year year10 = date4.getYear();
        try {
            Month month11 = new Month(53, year10);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test401() throws Throwable {
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
    public void test402() throws Throwable {
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
    public void test403() throws Throwable {
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
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test404");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.increment();
        boolean b4 = year1.isLeap();
        boolean b5 = year1.isLeap();
        boolean b6 = year1.increment();
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test405");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isValid();
        boolean b4 = year1.isLeap();
        boolean b5 = year1.isLeap();
        int i6 = year1.getYear();
        boolean b7 = year1.increment();
        boolean b8 = year1.increment();
        boolean b10 = year1.equals((java.lang.Object) "10/10/1");
        boolean b11 = year1.increment();
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test406");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year5 = date4.getYear();
        date4.printDate();
        Year year7 = date4.getYear();
        Day day8 = date4.getDay();
        Month month9 = date4.getMonth();
        Day day10 = new Day(12, month9);
        boolean b11 = month9.isValid();
        int i12 = month9.getMonth();
        boolean b13 = month9.increment();
        boolean b14 = month9.isValid();
    }

    @Test
    public void test407() throws Throwable {
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
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test408");
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
        int i16 = day15.getDay();
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test409");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        boolean b9 = date3.equals((java.lang.Object) (short) 100);
        Date date10 = Nextday.nextDay(date3);
        date10.increment();
        date10.printDate();
        Day day13 = date10.getDay();
        Date date14 = Nextday.nextDay(date10);
        java.lang.String str15 = date10.toString();
    }

    @Test
    public void test410() throws Throwable {
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
    public void test411() throws Throwable {
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
    public void test412() throws Throwable {
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
    public void test413() throws Throwable {
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
    public void test414() throws Throwable {
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
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test415");
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
        Day day17 = date4.getDay();
        Day day18 = date4.getDay();
        Month month19 = date4.getMonth();
        Date date25 = new Date(10, (int) (byte) 10, (int) (short) 1);
        boolean b27 = date25.equals((java.lang.Object) (-1));
        Year year28 = date25.getYear();
        Month month29 = new Month(3, year28);
        month19.setMonth((int) (short) 10, year28);
        try {
            Month month31 = new Month(101, year28);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test416() throws Throwable {
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
    public void test417() throws Throwable {
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
    public void test418() throws Throwable {
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
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test419");
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
        java.lang.String str14 = date3.toString();
        date3.printDate();
        Day day16 = date3.getDay();
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test420");
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
        boolean b22 = day7.isValid();
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test421");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        Year year8 = date3.getYear();
        Date date9 = Nextday.nextDay(date3);
        Month month10 = date9.getMonth();
        date9.printDate();
        date9.increment();
        date9.increment();
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test422");
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
        java.lang.String str31 = date3.toString();
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test423");
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
        boolean b26 = year10.increment();
        boolean b27 = year10.increment();
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test424");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date4 = Nextday.nextDay(date3);
        date3.printDate();
        Month month6 = date3.getMonth();
        Date date7 = Nextday.nextDay(date3);
        java.lang.String str8 = date7.toString();
        java.lang.String str9 = date7.toString();
        java.lang.String str10 = date7.toString();
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test425");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Month month7 = date3.getMonth();
        date3.printDate();
        java.lang.String str9 = date3.toString();
        Month month10 = date3.getMonth();
        Year year11 = date3.getYear();
        java.lang.String str12 = date3.toString();
        date3.printDate();
        date3.printDate();
    }

    @Test
    public void test426() throws Throwable {
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
    public void test427() throws Throwable {
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
    public void test428() throws Throwable {
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
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test429");
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
        int i14 = month13.getMonth();
        int i15 = month13.getMonth();
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test430");
        Date date3 = new Date(2, (int) (short) 1, (int) 'a');
        Date date4 = Nextday.nextDay(date3);
        Day day5 = date3.getDay();
    }

    @Test
    public void test431() throws Throwable {
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
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test432");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year5 = date4.getYear();
        boolean b7 = date4.equals((java.lang.Object) "hi!");
        Day day8 = date4.getDay();
        Year year12 = new Year((int) (byte) 100);
        boolean b13 = year12.isValid();
        Month month14 = new Month((int) (short) 10, year12);
        day8.setDay((int) (short) 10, month14);
        boolean b16 = month14.increment();
        int i17 = month14.getMonthSize();
        boolean b18 = month14.increment();
        boolean b19 = month14.isValid();
        Day day20 = new Day(30, month14);
        int i21 = month14.getMonthSize();
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test433");
        Year year2 = new Year(1);
        boolean b3 = year2.isLeap();
        boolean b4 = year2.isLeap();
        java.lang.Object obj5 = new java.lang.Object();
        boolean b6 = year2.equals(obj5);
        boolean b7 = year2.isValid();
        int i8 = year2.getYear();
        year2.setYear((int) 'a');
        Month month11 = new Month(2, year2);
        Year year14 = new Year(1);
        boolean b15 = year14.isValid();
        boolean b16 = year14.isLeap();
        int i17 = year14.getYear();
        boolean b18 = year14.isLeap();
        boolean b19 = year14.isValid();
        int i20 = year14.getYear();
        boolean b21 = year14.isLeap();
        try {
            month11.setMonth((int) 'a', year14);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test434");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date5 = Nextday.nextDay(date4);
        Year year8 = new Year((int) (byte) 100);
        boolean b9 = year8.isValid();
        Month month10 = new Month((int) (short) 10, year8);
        boolean b11 = month10.increment();
        int i12 = month10.getMonthSize();
        boolean b13 = month10.isValid();
        boolean b14 = date5.equals((java.lang.Object) month10);
        Year year15 = date5.getYear();
        date5.increment();
        Year year17 = date5.getYear();
        boolean b18 = year17.isLeap();
        try {
            Month month19 = new Month((int) (byte) 100, year17);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test435");
        Date date3 = new Date((int) (short) 10, 11, (int) (short) 100);
        Day day4 = date3.getDay();
        java.lang.String str5 = date3.toString();
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test436");
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
        date3.increment();
        date3.printDate();
    }

    @Test
    public void test437() throws Throwable {
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
    public void test438() throws Throwable {
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
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test439");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Month month7 = date3.getMonth();
        date3.printDate();
        java.lang.String str9 = date3.toString();
        Month month10 = date3.getMonth();
        boolean b11 = month10.isValid();
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test440");
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
        date13.printDate();
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test441");
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
        Year year26 = new Year((int) (byte) 100);
        Month month27 = new Month((int) (short) 1, year26);
        boolean b28 = month27.isValid();
        int i29 = month27.getMonthSize();
        boolean b30 = month27.increment();
        int i31 = month27.getMonth();
        try {
            day15.setDay(100, month27);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test442");
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
        boolean b14 = day9.isValid();
        boolean b15 = day9.increment();
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test443");
        Year year1 = new Year((int) ' ');
        Year year4 = new Year((int) (byte) 100);
        boolean b5 = year4.isValid();
        Month month6 = new Month((int) (short) 10, year4);
        int i7 = month6.getMonth();
        boolean b8 = year1.equals((java.lang.Object) i7);
        boolean b9 = year1.isValid();
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test444");
        try {
            Date date3 = new Date((int) '#', 100, 31);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test445");
        Year year2 = new Year(1);
        try {
            Month month3 = new Month(31, year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test446");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Month month7 = date3.getMonth();
        int i8 = month7.getMonthSize();
        int i9 = month7.getMonthSize();
        Year year11 = new Year(1);
        boolean b12 = year11.isValid();
        boolean b13 = year11.isValid();
        boolean b14 = year11.isValid();
        boolean b15 = month7.equals((java.lang.Object) year11);
        year11.setYear(4);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test447");
        try {
            Date date3 = new Date(0, (int) ' ', (int) ' ');
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test448() throws Throwable {
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
    public void test449() throws Throwable {
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
    public void test450() throws Throwable {
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
    public void test451() throws Throwable {
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
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test452");
        Year year1 = new Year(12);
        boolean b2 = year1.isLeap();
        year1.setYear(101);
    }

    @Test
    public void test453() throws Throwable {
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
    public void test454() throws Throwable {
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
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test455");
        try {
            Date date3 = new Date(52, 101, (int) (short) -1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test456");
        Year year1 = new Year((int) (byte) 100);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = year1.equals(obj2);
        Date date7 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year8 = date7.getYear();
        boolean b10 = date7.equals((java.lang.Object) "hi!");
        Month month11 = date7.getMonth();
        boolean b12 = year1.equals((java.lang.Object) date7);
        Day day13 = date7.getDay();
        date7.increment();
        Month month15 = date7.getMonth();
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test457");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.printDate();
        Year year8 = date3.getYear();
        date3.increment();
        Date date10 = Nextday.nextDay(date3);
        Year year11 = date3.getYear();
        Year year12 = date3.getYear();
        date3.printDate();
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test458");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.printDate();
        Year year8 = date3.getYear();
        date3.increment();
        Date date10 = Nextday.nextDay(date3);
        date10.printDate();
        Day day12 = date10.getDay();
        java.lang.String str13 = date10.toString();
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test459");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.printDate();
        date3.printDate();
        date3.printDate();
        Month month10 = date3.getMonth();
        Day day11 = date3.getDay();
        Month month12 = date3.getMonth();
    }

    @Test
    public void test460() throws Throwable {
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
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test461");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.increment();
        Year year8 = date3.getYear();
        Date date9 = Nextday.nextDay(date3);
        Day day10 = date3.getDay();
        Month month11 = date3.getMonth();
        Day day12 = date3.getDay();
    }

    @Test
    public void test462() throws Throwable {
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
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test463");
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
        java.lang.Object obj23 = null;
        boolean b24 = day7.equals(obj23);
        boolean b25 = day7.increment();
        Year year29 = new Year((int) (byte) 100);
        boolean b30 = year29.isValid();
        Month month31 = new Month((int) (short) 10, year29);
        boolean b32 = month31.increment();
        boolean b33 = month31.increment();
        boolean b34 = month31.increment();
        Year year36 = new Year(1);
        boolean b37 = year36.increment();
        int i38 = year36.getYear();
        boolean b39 = month31.equals((java.lang.Object) year36);
        try {
            day7.setDay(13, month31);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test464");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.increment();
        boolean b4 = year1.increment();
        boolean b5 = year1.increment();
        boolean b6 = year1.increment();
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test465");
        try {
            Date date3 = new Date((int) '#', 0, 1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test466() throws Throwable {
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
    public void test467() throws Throwable {
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
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test468");
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
        Date date30 = new Date(10, (int) (byte) 10, (int) (short) 1);
        boolean b32 = date30.equals((java.lang.Object) (-1));
        Year year33 = date30.getYear();
        Month month34 = new Month(3, year33);
        Year year37 = new Year(3);
        month34.setMonth(11, year37);
        boolean b39 = month34.increment();
        try {
            day24.setDay((int) (byte) -1, month34);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test469() throws Throwable {
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
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test470");
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
        int i34 = day17.getDay();
    }

    @Test
    public void test471() throws Throwable {
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
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test472");
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
        int i20 = year2.getYear();
        year2.setYear((int) ' ');
    }

    @Test
    public void test473() throws Throwable {
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
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test474");
        Year year1 = new Year(31);
        int i2 = year1.getYear();
        int i3 = year1.getYear();
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test475");
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
        int i20 = day16.getDay();
    }

    @Test
    public void test476() throws Throwable {
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
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test477");
        Year year3 = new Year(1);
        boolean b4 = year3.isLeap();
        int i5 = year3.getYear();
        boolean b7 = year3.equals((java.lang.Object) 1);
        year3.setYear(32);
        boolean b10 = year3.isLeap();
        boolean b11 = year3.increment();
        Month month12 = new Month((int) (short) 1, year3);
        try {
            Day day13 = new Day((int) ' ', month12);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test478() throws Throwable {
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
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test479");
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
        java.lang.Object obj23 = null;
        boolean b24 = month12.equals(obj23);
        boolean b25 = month12.isValid();
    }

    @Test
    public void test480() throws Throwable {
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
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test481");
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
        int i17 = year12.getYear();
        try {
            Month month18 = new Month(0, year12);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test482() throws Throwable {
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
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test483");
        Year year3 = new Year((int) (byte) 100);
        boolean b4 = year3.isValid();
        Month month5 = new Month((int) (short) 10, year3);
        int i6 = month5.getMonth();
        Year year9 = new Year((int) (short) 1);
        boolean b10 = year9.isLeap();
        month5.setMonth((int) (short) 10, year9);
        int i12 = month5.getMonth();
        Day day13 = new Day(12, month5);
        boolean b14 = month5.isValid();
    }

    @Test
    public void test484() throws Throwable {
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
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test485");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        int i3 = year1.getYear();
        int i4 = year1.getYear();
        boolean b5 = year1.increment();
        boolean b6 = year1.isValid();
        int i7 = year1.getYear();
    }

    @Test
    public void test486() throws Throwable {
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
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test487");
        Date date3 = new Date(10, 3, 33);
        Month month4 = date3.getMonth();
        Year year6 = new Year((int) (byte) 100);
        java.lang.Object obj7 = new java.lang.Object();
        boolean b8 = year6.equals(obj7);
        Date date12 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year13 = date12.getYear();
        boolean b15 = date12.equals((java.lang.Object) "hi!");
        Month month16 = date12.getMonth();
        boolean b17 = year6.equals((java.lang.Object) date12);
        Date date18 = Nextday.nextDay(date12);
        Date date19 = Nextday.nextDay(date18);
        boolean b20 = date3.equals((java.lang.Object) date19);
        date3.printDate();
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test488");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        Year year8 = date3.getYear();
        Date date9 = Nextday.nextDay(date3);
        Month month10 = date9.getMonth();
        Year year11 = date9.getYear();
        int i12 = year11.getYear();
        int i13 = year11.getYear();
    }

    @Test
    public void test489() throws Throwable {
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
    public void test490() throws Throwable {
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
    public void test491() throws Throwable {
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
    public void test492() throws Throwable {
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
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test493");
        Year year3 = new Year((int) (byte) 100);
        boolean b4 = year3.isValid();
        Month month5 = new Month((int) (short) 10, year3);
        int i6 = month5.getMonth();
        Year year9 = new Year((int) (short) 1);
        boolean b10 = year9.isLeap();
        month5.setMonth((int) (short) 10, year9);
        int i12 = month5.getMonth();
        Day day13 = new Day(12, month5);
        int i14 = day13.getDay();
        boolean b15 = day13.increment();
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test494");
        try {
            Date date3 = new Date(53, 13, 34);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test495() throws Throwable {
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
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test496");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        Year year8 = date3.getYear();
        Date date9 = Nextday.nextDay(date3);
        date3.printDate();
        Day day11 = date3.getDay();
        Month month12 = date3.getMonth();
        Date date16 = new Date(1, 10, 100);
        boolean b17 = month12.equals((java.lang.Object) 100);
        boolean b18 = month12.increment();
    }

    @Test
    public void test497() throws Throwable {
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
    public void test498() throws Throwable {
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
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test499");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        boolean b5 = date3.equals((java.lang.Object) (-1));
        Year year6 = date3.getYear();
        Day day7 = date3.getDay();
        Date date8 = Nextday.nextDay(date3);
    }

    @Test
    public void test500() throws Throwable {
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
}

