import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
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
    public void test002() throws Throwable {
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
    public void test003() throws Throwable {
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
    public void test004() throws Throwable {
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
    public void test005() throws Throwable {
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
    public void test006() throws Throwable {
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test007");
        try {
            Date date3 = new Date(34, 100, (int) ' ');
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
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
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test009");
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
        int i18 = month15.getMonthSize();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test010");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Month month7 = date3.getMonth();
        Month month8 = date3.getMonth();
        date3.printDate();
        Date date10 = Nextday.nextDay(date3);
        date10.increment();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test011");
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
        Year year18 = new Year(1);
        boolean b19 = year18.isLeap();
        boolean b20 = year18.isLeap();
        month5.setMonth(1, year18);
        Date date25 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year26 = date25.getYear();
        boolean b28 = date25.equals((java.lang.Object) "hi!");
        java.lang.String str29 = date25.toString();
        boolean b31 = date25.equals((java.lang.Object) (short) 100);
        Year year32 = date25.getYear();
        Date date33 = Nextday.nextDay(date25);
        date25.increment();
        Year year35 = date25.getYear();
        boolean b36 = year35.increment();
        boolean b37 = year18.equals((java.lang.Object) year35);
        boolean b38 = year18.increment();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test012");
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
        boolean b21 = day7.isValid();
    }

    @Test
    public void test013() throws Throwable {
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
    public void test014() throws Throwable {
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
    public void test015() throws Throwable {
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
    public void test016() throws Throwable {
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
    public void test017() throws Throwable {
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
    public void test018() throws Throwable {
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
    public void test019() throws Throwable {
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
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test020");
        Year year1 = new Year(1);
        boolean b2 = year1.isLeap();
        boolean b3 = year1.isLeap();
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = year1.equals(obj4);
        boolean b6 = year1.isValid();
        int i7 = year1.getYear();
        year1.setYear((int) 'a');
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
        Day day25 = date24.getDay();
        date24.printDate();
        Date date27 = Nextday.nextDay(date24);
        boolean b28 = year1.equals((java.lang.Object) date27);
        Month month29 = date27.getMonth();
        Year year32 = new Year((int) (byte) 100);
        Month month33 = new Month((int) (short) 1, year32);
        boolean b34 = month33.isValid();
        int i35 = month33.getMonthSize();
        boolean b36 = month33.increment();
        boolean b37 = month33.increment();
        boolean b38 = date27.equals((java.lang.Object) month33);
        int i39 = month33.getMonthSize();
        boolean b40 = month33.isValid();
        int i41 = month33.getMonth();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test021");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        Day day8 = date3.getDay();
        Month month9 = date3.getMonth();
        boolean b10 = month9.increment();
        int i11 = month9.getMonthSize();
        Year year14 = new Year(1);
        boolean b15 = year14.isValid();
        boolean b16 = year14.isValid();
        boolean b17 = year14.isLeap();
        int i18 = year14.getYear();
        boolean b19 = year14.increment();
        int i20 = year14.getYear();
        try {
            month9.setMonth(34, year14);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test022");
        try {
            Date date3 = new Date(34, 2, (int) (short) 1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test023");
        Date date3 = new Date(2, (int) (short) 1, (int) 'a');
        Date date4 = Nextday.nextDay(date3);
        Month month5 = date4.getMonth();
        boolean b6 = month5.isValid();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test024");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b5 = month4.increment();
        boolean b6 = month4.increment();
        boolean b7 = month4.isValid();
        boolean b8 = month4.increment();
        boolean b9 = month4.increment();
        Year year14 = new Year(1);
        boolean b15 = year14.isValid();
        boolean b16 = year14.isLeap();
        int i17 = year14.getYear();
        boolean b18 = year14.isLeap();
        Month month19 = new Month((int) (byte) 1, year14);
        Day day20 = new Day(31, month19);
        boolean b21 = day20.isValid();
        boolean b22 = day20.increment();
        boolean b23 = day20.increment();
        Year year26 = new Year(1);
        boolean b27 = year26.isValid();
        boolean b28 = year26.isValid();
        boolean b29 = year26.isValid();
        boolean b30 = year26.isValid();
        Month month31 = new Month(12, year26);
        boolean b32 = day20.equals((java.lang.Object) year26);
        boolean b33 = year26.increment();
        try {
            month4.setMonth((int) '#', year26);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test025() throws Throwable {
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
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test026");
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
        int i19 = month4.getMonth();
        int i20 = month4.getMonth();
        int i21 = month4.getMonth();
    }

    @Test
    public void test027() throws Throwable {
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
    public void test028() throws Throwable {
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
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test029");
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
        boolean b24 = month23.isValid();
    }

    @Test
    public void test030() throws Throwable {
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
    public void test031() throws Throwable {
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
    public void test032() throws Throwable {
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
    public void test033() throws Throwable {
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
    public void test034() throws Throwable {
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
    public void test035() throws Throwable {
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
    public void test036() throws Throwable {
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
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test037");
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
        Day day23 = date3.getDay();
    }

    @Test
    public void test038() throws Throwable {
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
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test039");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        boolean b5 = date3.equals((java.lang.Object) (-1));
        Year year6 = date3.getYear();
        Year year7 = date3.getYear();
        Month month8 = date3.getMonth();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test040");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b5 = month4.increment();
        boolean b6 = month4.isValid();
        boolean b8 = month4.equals((java.lang.Object) 1);
        int i9 = month4.getMonthSize();
        int i10 = month4.getMonthSize();
        Date date14 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date15 = Nextday.nextDay(date14);
        date14.printDate();
        java.lang.String str17 = date14.toString();
        Day day18 = date14.getDay();
        boolean b19 = month4.equals((java.lang.Object) day18);
        boolean b20 = day18.isValid();
    }

    @Test
    public void test041() throws Throwable {
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
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test042");
        Date date3 = new Date(5, 1, (int) (short) 100);
        Year year4 = date3.getYear();
        date3.increment();
        Day day6 = date3.getDay();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test043");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Day day7 = date3.getDay();
        Month month8 = date3.getMonth();
        Day day9 = date3.getDay();
        boolean b10 = day9.isValid();
        Date date14 = new Date((int) (short) 10, 11, (int) (short) 100);
        Month month15 = date14.getMonth();
        boolean b16 = day9.equals((java.lang.Object) month15);
        boolean b17 = month15.increment();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test044");
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
        Date date23 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date24 = Nextday.nextDay(date23);
        date23.increment();
        date23.increment();
        date23.increment();
        boolean b28 = date3.equals((java.lang.Object) date23);
    }

    @Test
    public void test045() throws Throwable {
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
    public void test046() throws Throwable {
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
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test047");
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
        boolean b20 = day17.isValid();
        int i21 = day17.getDay();
        boolean b22 = day17.isValid();
        java.lang.Object obj23 = null;
        boolean b24 = day17.equals(obj23);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test048");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b6 = month4.equals((java.lang.Object) 10L);
        boolean b7 = month4.isValid();
        boolean b8 = month4.isValid();
        boolean b9 = month4.isValid();
        boolean b10 = month4.isValid();
        boolean b11 = month4.increment();
        boolean b12 = month4.increment();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test049");
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
        boolean b30 = month4.isValid();
    }

    @Test
    public void test050() throws Throwable {
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
    public void test051() throws Throwable {
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
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test052");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        boolean b4 = year2.increment();
        year2.setYear((int) '4');
        boolean b7 = year2.isValid();
        boolean b8 = year2.isLeap();
        boolean b9 = year2.isValid();
        int i10 = year2.getYear();
        boolean b11 = year2.isValid();
        Month month12 = new Month((int) (byte) 10, year2);
        year2.setYear(34);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test053");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date4 = Nextday.nextDay(date3);
        date3.printDate();
        date3.increment();
    }

    @Test
    public void test054() throws Throwable {
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
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test055");
        Year year2 = new Year(52);
        Month month3 = new Month((int) (short) 10, year2);
        year2.setYear(101);
        int i6 = year2.getYear();
    }

    @Test
    public void test056() throws Throwable {
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
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test057");
        Date date3 = new Date(2, 10, 10);
        java.lang.String str4 = date3.toString();
    }

    @Test
    public void test058() throws Throwable {
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
    public void test059() throws Throwable {
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
    public void test060() throws Throwable {
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
    public void test061() throws Throwable {
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
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test062");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        boolean b9 = date3.equals((java.lang.Object) (short) 100);
        Year year10 = date3.getYear();
        Date date11 = Nextday.nextDay(date3);
        date11.increment();
        Day day13 = date11.getDay();
        boolean b14 = day13.increment();
    }

    @Test
    public void test063() throws Throwable {
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
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test064");
        Date date3 = new Date((int) (byte) 1, 1, (int) '#');
        java.lang.String str4 = date3.toString();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test065");
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
        Year year24 = date3.getYear();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test066");
        try {
            Date date3 = new Date(53, (int) (short) 0, 102);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test067() throws Throwable {
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
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test068");
        Year year1 = new Year((int) 'a');
        year1.setYear((int) (byte) 100);
    }

    @Test
    public void test069() throws Throwable {
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
    public void test070() throws Throwable {
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
    public void test071() throws Throwable {
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
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test072");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isValid();
        boolean b4 = year1.isLeap();
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
        date10.printDate();
        Day day24 = date10.getDay();
        int i25 = day24.getDay();
        boolean b26 = year1.equals((java.lang.Object) i25);
    }

    @Test
    public void test073() throws Throwable {
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
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test074");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.increment();
        Date date8 = Nextday.nextDay(date3);
        Date date9 = Nextday.nextDay(date8);
        Month month10 = date8.getMonth();
        Month month11 = date8.getMonth();
        boolean b12 = month11.isValid();
        boolean b13 = month11.increment();
        java.lang.Object obj14 = null;
        boolean b15 = month11.equals(obj14);
    }

    @Test
    public void test075() throws Throwable {
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
    public void test076() throws Throwable {
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
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test077");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.printDate();
        date3.printDate();
        date3.printDate();
        Month month10 = date3.getMonth();
        Day day11 = date3.getDay();
        Day day12 = date3.getDay();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test078");
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
        Month month28 = new Month(11, year19);
        boolean b29 = year19.isValid();
    }

    @Test
    public void test079() throws Throwable {
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
    public void test080() throws Throwable {
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
    public void test081() throws Throwable {
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
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test082");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.increment();
        boolean b4 = year1.increment();
        boolean b5 = year1.increment();
        boolean b6 = year1.isValid();
        boolean b7 = year1.isLeap();
        int i8 = year1.getYear();
        boolean b9 = year1.increment();
    }

    @Test
    public void test083() throws Throwable {
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
    public void test084() throws Throwable {
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
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test085");
        try {
            Date date3 = new Date((int) '4', 1, (int) '#');
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test086");
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
        boolean b21 = day7.increment();
        boolean b22 = day7.increment();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test087");
        Date date3 = new Date((int) (short) 10, 11, (int) (short) 100);
        Month month4 = date3.getMonth();
        boolean b5 = month4.increment();
        int i6 = month4.getMonth();
        boolean b7 = month4.isValid();
        boolean b8 = month4.increment();
        Date date12 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year13 = date12.getYear();
        Year year16 = new Year((int) (byte) 100);
        boolean b17 = year16.isValid();
        Month month18 = new Month((int) (short) 10, year16);
        boolean b19 = month18.increment();
        boolean b20 = date12.equals((java.lang.Object) month18);
        Year year21 = date12.getYear();
        java.lang.String str22 = date12.toString();
        date12.increment();
        Day day24 = date12.getDay();
        Day day25 = date12.getDay();
        Day day26 = date12.getDay();
        Month month27 = date12.getMonth();
        java.lang.String str28 = date12.toString();
        Year year30 = new Year(1);
        boolean b31 = year30.isLeap();
        boolean b32 = year30.isLeap();
        boolean b33 = year30.increment();
        boolean b34 = date12.equals((java.lang.Object) year30);
        boolean b35 = month4.equals((java.lang.Object) year30);
        boolean b36 = month4.isValid();
    }

    @Test
    public void test088() throws Throwable {
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
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test089");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Day day7 = date3.getDay();
        Year year11 = new Year((int) (byte) 100);
        boolean b12 = year11.isValid();
        Month month13 = new Month((int) (short) 10, year11);
        day7.setDay((int) (short) 10, month13);
        boolean b15 = day7.isValid();
        Year year19 = new Year(11);
        int i20 = year19.getYear();
        year19.setYear(52);
        Month month23 = new Month(10, year19);
        Date date27 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year28 = date27.getYear();
        boolean b30 = date27.equals((java.lang.Object) "hi!");
        java.lang.String str31 = date27.toString();
        Year year32 = date27.getYear();
        Date date33 = Nextday.nextDay(date27);
        Month month34 = date33.getMonth();
        date33.printDate();
        Day day36 = date33.getDay();
        date33.increment();
        date33.printDate();
        boolean b39 = month23.equals((java.lang.Object) date33);
        try {
            day7.setDay((int) (short) 0, month23);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test090() throws Throwable {
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
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test091");
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
        Year year25 = new Year(1);
        boolean b26 = year25.isLeap();
        boolean b27 = year25.isLeap();
        java.lang.Object obj28 = new java.lang.Object();
        boolean b29 = year25.equals(obj28);
        boolean b30 = year25.isValid();
        boolean b31 = month9.equals((java.lang.Object) year25);
        boolean b32 = year25.isLeap();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test092");
        Year year2 = new Year(1);
        boolean b3 = year2.isLeap();
        boolean b4 = year2.isLeap();
        java.lang.Object obj5 = new java.lang.Object();
        boolean b6 = year2.equals(obj5);
        boolean b7 = year2.isValid();
        Month month8 = new Month((int) (byte) 10, year2);
        int i9 = month8.getMonth();
        boolean b10 = month8.increment();
        boolean b11 = month8.increment();
        boolean b12 = month8.increment();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test093");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        year1.setYear((int) (short) -1);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test094");
        Year year2 = new Year(1);
        boolean b3 = year2.isLeap();
        int i4 = year2.getYear();
        boolean b6 = year2.equals((java.lang.Object) 1);
        boolean b7 = year2.isValid();
        Month month8 = new Month(1, year2);
        boolean b9 = year2.increment();
        boolean b10 = year2.isLeap();
        boolean b11 = year2.isValid();
    }

    @Test
    public void test095() throws Throwable {
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
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test096");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year5 = date4.getYear();
        boolean b7 = date4.equals((java.lang.Object) "hi!");
        Month month8 = date4.getMonth();
        int i9 = month8.getMonth();
        int i10 = month8.getMonth();
        int i11 = month8.getMonth();
        try {
            Day day12 = new Day((int) (byte) 0, month8);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test097() throws Throwable {
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
    public void test098() throws Throwable {
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
    public void test099() throws Throwable {
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
    public void test100() throws Throwable {
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
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test101");
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
        Year year36 = new Year(52);
        Month month37 = new Month((int) (short) 10, year36);
        Month month38 = new Month(5, year36);
        Day day39 = new Day((int) (short) 10, month38);
        boolean b40 = month24.equals((java.lang.Object) month38);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test102");
        Year year1 = null;
        try {
            Month month2 = new Month((int) (byte) -1, year1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test103() throws Throwable {
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
    public void test104() throws Throwable {
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
    public void test105() throws Throwable {
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
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test106");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Month month7 = date3.getMonth();
        date3.printDate();
        java.lang.String str9 = date3.toString();
        Month month10 = date3.getMonth();
        Year year11 = date3.getYear();
        java.lang.String str12 = date3.toString();
        Year year13 = date3.getYear();
        Date date14 = Nextday.nextDay(date3);
    }

    @Test
    public void test107() throws Throwable {
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
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test108");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b5 = month4.increment();
        boolean b6 = month4.isValid();
        boolean b8 = month4.equals((java.lang.Object) 1);
        int i9 = month4.getMonthSize();
        int i10 = month4.getMonthSize();
        Date date14 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date15 = Nextday.nextDay(date14);
        date14.printDate();
        java.lang.String str17 = date14.toString();
        Day day18 = date14.getDay();
        boolean b19 = month4.equals((java.lang.Object) day18);
        boolean b20 = month4.increment();
        int i21 = month4.getMonth();
    }

    @Test
    public void test109() throws Throwable {
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
    public void test110() throws Throwable {
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
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test111");
        Year year1 = new Year((int) (byte) 100);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = year1.equals(obj2);
        int i4 = year1.getYear();
        int i5 = year1.getYear();
        year1.setYear(1);
        int i8 = year1.getYear();
        boolean b9 = year1.isLeap();
        boolean b10 = year1.isValid();
    }

    @Test
    public void test112() throws Throwable {
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
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test113");
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
        try {
            Day day25 = new Day(32, month5);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test114");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.increment();
        date3.printDate();
        Year year9 = date3.getYear();
        Date date10 = Nextday.nextDay(date3);
        Year year11 = date10.getYear();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test115");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date4 = Nextday.nextDay(date3);
        date3.printDate();
        Month month6 = date3.getMonth();
        Day day7 = date3.getDay();
        int i8 = day7.getDay();
    }

    @Test
    public void test116() throws Throwable {
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
    public void test117() throws Throwable {
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
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test118");
        Year year3 = new Year((int) (byte) 100);
        boolean b4 = year3.isValid();
        Month month5 = new Month((int) (short) 10, year3);
        boolean b6 = month5.increment();
        boolean b7 = month5.increment();
        int i8 = month5.getMonth();
        boolean b9 = month5.isValid();
        int i10 = month5.getMonth();
        try {
            Day day11 = new Day(0, month5);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test119() throws Throwable {
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
    public void test120() throws Throwable {
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
    public void test121() throws Throwable {
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
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test122");
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
        boolean b13 = day9.isValid();
        boolean b14 = day9.increment();
    }

    @Test
    public void test123() throws Throwable {
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
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test124");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.increment();
        Date date8 = Nextday.nextDay(date3);
        date3.printDate();
        Day day10 = date3.getDay();
        boolean b11 = day10.isValid();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test125");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        Year year9 = new Year((int) (byte) 100);
        int i10 = year9.getYear();
        boolean b11 = date3.equals((java.lang.Object) year9);
        Year year12 = date3.getYear();
        Date date13 = Nextday.nextDay(date3);
        Year year14 = date13.getYear();
        int i15 = year14.getYear();
    }

    @Test
    public void test126() throws Throwable {
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
    public void test127() throws Throwable {
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
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test128");
        Year year1 = new Year(1);
        boolean b2 = year1.isLeap();
        boolean b3 = year1.isLeap();
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = year1.equals(obj4);
        boolean b6 = year1.isValid();
        boolean b7 = year1.isLeap();
        boolean b8 = year1.isLeap();
    }

    @Test
    public void test129() throws Throwable {
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
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test130");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year5 = date4.getYear();
        boolean b7 = date4.equals((java.lang.Object) "hi!");
        date4.printDate();
        Year year9 = date4.getYear();
        date4.increment();
        Month month11 = date4.getMonth();
        int i12 = month11.getMonthSize();
        Day day13 = new Day((int) (short) 10, month11);
    }

    @Test
    public void test131() throws Throwable {
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
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test132");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        date3.printDate();
        Year year5 = date3.getYear();
        date3.printDate();
        java.lang.String str7 = date3.toString();
        Day day8 = date3.getDay();
        Date date9 = Nextday.nextDay(date3);
        Date date10 = Nextday.nextDay(date9);
        Day day11 = date10.getDay();
        Month month12 = date10.getMonth();
        int i13 = month12.getMonth();
        Date date18 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year19 = date18.getYear();
        boolean b21 = date18.equals((java.lang.Object) "hi!");
        date18.printDate();
        Year year23 = date18.getYear();
        java.lang.Object obj24 = null;
        boolean b25 = date18.equals(obj24);
        Year year26 = date18.getYear();
        boolean b27 = year26.isValid();
        try {
            month12.setMonth(33, year26);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test133");
        Date date3 = new Date(11, (int) (short) 10, (int) ' ');
        java.lang.String str4 = date3.toString();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test134");
        Year year2 = new Year(1);
        boolean b3 = year2.isLeap();
        int i4 = year2.getYear();
        Month month5 = new Month(10, year2);
        int i6 = month5.getMonth();
        int i7 = month5.getMonth();
        int i8 = month5.getMonthSize();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test135");
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
        boolean b30 = month21.increment();
        boolean b31 = month21.isValid();
    }

    @Test
    public void test136() throws Throwable {
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
    public void test137() throws Throwable {
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
    public void test138() throws Throwable {
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
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test139");
        Date date4 = new Date((int) (short) 10, 11, (int) (short) 100);
        Year year5 = date4.getYear();
        year5.setYear((int) '#');
        try {
            Month month8 = new Month(34, year5);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test140");
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
        Date date21 = new Date((int) (short) 10, 11, (int) (short) 100);
        Month month22 = date21.getMonth();
        boolean b23 = month22.increment();
        int i24 = month22.getMonth();
        boolean b25 = month22.isValid();
        boolean b26 = year14.equals((java.lang.Object) month22);
        boolean b27 = month22.isValid();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test141");
        Year year2 = new Year(101);
        boolean b3 = year2.increment();
        year2.setYear(32);
        try {
            Month month6 = new Month((int) (short) 0, year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test142() throws Throwable {
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
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test143");
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
        Date date41 = new Date((int) (byte) 1, 3, 102);
        java.lang.String str42 = date41.toString();
        Day day43 = date41.getDay();
        java.lang.String str44 = date41.toString();
        boolean b45 = year1.equals((java.lang.Object) date41);
        year1.setYear((int) (byte) -1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test144");
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
        date13.printDate();
    }

    @Test
    public void test145() throws Throwable {
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
    public void test146() throws Throwable {
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
    public void test147() throws Throwable {
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
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test148");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        java.lang.String str4 = date3.toString();
        Day day5 = date3.getDay();
        boolean b6 = day5.increment();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test149");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.printDate();
        Year year8 = date3.getYear();
        date3.increment();
        Date date10 = Nextday.nextDay(date3);
        Year year11 = date3.getYear();
        date3.increment();
        date3.increment();
        java.lang.String str14 = date3.toString();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test150");
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
        boolean b26 = year1.isLeap();
        boolean b27 = year1.increment();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test151");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Day day7 = date3.getDay();
        boolean b8 = day7.increment();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test152");
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
        Year year22 = new Year((int) (byte) 100);
        boolean b23 = year22.isValid();
        Month month24 = new Month((int) (short) 10, year22);
        boolean b25 = year22.increment();
        boolean b26 = day19.equals((java.lang.Object) b25);
        boolean b27 = day19.isValid();
        boolean b28 = day19.isValid();
    }

    @Test
    public void test153() throws Throwable {
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
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test154");
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
        date15.printDate();
        date15.increment();
        date15.increment();
        Month month19 = date15.getMonth();
        int i20 = month19.getMonth();
        Day day21 = new Day(3, month19);
        int i22 = month19.getMonthSize();
    }

    @Test
    public void test155() throws Throwable {
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
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test156");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        date3.printDate();
        Year year5 = date3.getYear();
        Date date6 = Nextday.nextDay(date3);
        Year year7 = date3.getYear();
        date3.increment();
        date3.printDate();
    }

    @Test
    public void test157() throws Throwable {
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
    public void test158() throws Throwable {
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
    public void test159() throws Throwable {
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
    public void test160() throws Throwable {
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
    public void test161() throws Throwable {
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
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test162");
        Year year1 = new Year(4);
        boolean b2 = year1.isLeap();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test163");
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
        java.lang.String str18 = date14.toString();
        date14.printDate();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test164");
        Year year1 = new Year((int) (short) 100);
        boolean b2 = year1.increment();
        boolean b3 = year1.isLeap();
    }

    @Test
    public void test165() throws Throwable {
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
    public void test166() throws Throwable {
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
    public void test167() throws Throwable {
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
    public void test168() throws Throwable {
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
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test169");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        int i3 = year1.getYear();
        int i4 = year1.getYear();
        boolean b5 = year1.increment();
        boolean b6 = year1.increment();
    }

    @Test
    public void test170() throws Throwable {
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
    public void test171() throws Throwable {
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
    public void test172() throws Throwable {
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
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test173");
        try {
            Date date3 = new Date((int) (short) 0, 4, 97);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test174");
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
        boolean b35 = day17.increment();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test175");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date4 = Nextday.nextDay(date3);
        date3.increment();
        date3.increment();
        java.lang.String str7 = date3.toString();
        java.lang.Object obj8 = null;
        boolean b9 = date3.equals(obj8);
        date3.increment();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test176");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year5 = date4.getYear();
        boolean b7 = date4.equals((java.lang.Object) "hi!");
        java.lang.String str8 = date4.toString();
        boolean b10 = date4.equals((java.lang.Object) (short) 100);
        Year year11 = date4.getYear();
        Month month12 = date4.getMonth();
        Day day13 = new Day((int) (byte) 1, month12);
        boolean b14 = day13.isValid();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test177");
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
        Month month20 = date3.getMonth();
        java.lang.String str21 = date3.toString();
    }

    @Test
    public void test178() throws Throwable {
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
    public void test179() throws Throwable {
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
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test180");
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
        boolean b41 = day40.isValid();
        int i42 = day40.getDay();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test181");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isValid();
        boolean b4 = year1.increment();
        Date date8 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date9 = Nextday.nextDay(date8);
        Day day10 = date9.getDay();
        Year year11 = date9.getYear();
        Year year12 = date9.getYear();
        date9.printDate();
        Day day14 = date9.getDay();
        boolean b15 = year1.equals((java.lang.Object) day14);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test182");
        Year year3 = new Year((int) (byte) 100);
        Month month4 = new Month((int) (short) 1, year3);
        Date date8 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year9 = date8.getYear();
        boolean b11 = date8.equals((java.lang.Object) "hi!");
        Month month12 = date8.getMonth();
        date8.increment();
        Month month14 = date8.getMonth();
        boolean b15 = month14.isValid();
        boolean b16 = month14.increment();
        boolean b17 = month4.equals((java.lang.Object) b16);
        Day day18 = new Day(10, month4);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test183");
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
        date4.printDate();
        Year year30 = date4.getYear();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test184");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b5 = year2.increment();
        boolean b6 = year2.isLeap();
        boolean b7 = year2.increment();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test185");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date4 = Nextday.nextDay(date3);
        Day day5 = date4.getDay();
        boolean b6 = day5.isValid();
        boolean b7 = day5.isValid();
        int i8 = day5.getDay();
        boolean b9 = day5.increment();
        Date date13 = new Date((int) (short) 10, 11, (int) (short) 100);
        Day day14 = date13.getDay();
        boolean b15 = day5.equals((java.lang.Object) date13);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test186");
        Year year4 = new Year((int) (byte) 100);
        boolean b5 = year4.isValid();
        Month month6 = new Month((int) (short) 10, year4);
        int i7 = month6.getMonth();
        Year year10 = new Year((int) (short) 1);
        boolean b11 = year10.isLeap();
        month6.setMonth((int) (short) 10, year10);
        boolean b13 = month6.isValid();
        int i14 = month6.getMonthSize();
        Day day15 = new Day((int) (short) 1, month6);
        boolean b16 = month6.increment();
        try {
            Day day17 = new Day((int) (short) 100, month6);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test187");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isValid();
        Month month5 = new Month((int) (short) 10, year2);
        Year year8 = new Year((int) (byte) 100);
        boolean b9 = year8.isValid();
        Month month10 = new Month((int) (short) 10, year8);
        boolean b11 = year8.increment();
        boolean b12 = month5.equals((java.lang.Object) year8);
        boolean b13 = year8.isLeap();
        Year year15 = new Year(31);
        boolean b16 = year15.isValid();
        boolean b17 = year15.isValid();
        boolean b18 = year8.equals((java.lang.Object) year15);
    }

    @Test
    public void test188() throws Throwable {
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
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test189");
        Date date3 = new Date(10, 3, 33);
        Month month4 = date3.getMonth();
        Day day5 = date3.getDay();
        int i6 = day5.getDay();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test190");
        Year year1 = new Year((int) (byte) 100);
        boolean b2 = year1.isValid();
        boolean b3 = year1.increment();
        year1.setYear((int) '4');
        boolean b6 = year1.isValid();
        boolean b7 = year1.increment();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test191");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Day day7 = date3.getDay();
        Month month8 = date3.getMonth();
        date3.printDate();
        java.lang.String str10 = date3.toString();
        date3.increment();
        Date date12 = Nextday.nextDay(date3);
        java.lang.String str13 = date12.toString();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test192");
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
        boolean b15 = day10.increment();
    }

    @Test
    public void test193() throws Throwable {
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
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test194");
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
        Day day18 = date14.getDay();
        Year year22 = new Year((int) (byte) 100);
        boolean b23 = year22.isValid();
        Month month24 = new Month((int) (short) 10, year22);
        boolean b26 = month24.equals((java.lang.Object) 10L);
        boolean b27 = month24.isValid();
        boolean b28 = month24.isValid();
        Date date32 = new Date(10, 3, 33);
        Month month33 = date32.getMonth();
        boolean b34 = month24.equals((java.lang.Object) month33);
        int i35 = month33.getMonth();
        day18.setDay((int) (short) 1, month33);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test195");
        Date date3 = new Date(10, 3, 33);
        date3.printDate();
    }

    @Test
    public void test196() throws Throwable {
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
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test197");
        Date date3 = new Date(11, 28, 31);
    }

    @Test
    public void test198() throws Throwable {
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
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test199");
        Year year2 = new Year(1);
        boolean b3 = year2.isLeap();
        boolean b5 = year2.equals((java.lang.Object) 100.0f);
        year2.setYear(32);
        Month month8 = new Month((int) (byte) 1, year2);
        Year year12 = new Year(1);
        boolean b13 = year12.isValid();
        boolean b14 = year12.isLeap();
        int i15 = year12.getYear();
        boolean b16 = year12.isLeap();
        Month month17 = new Month((int) (byte) 1, year12);
        int i18 = month17.getMonthSize();
        boolean b19 = month17.increment();
        boolean b20 = month17.isValid();
        boolean b21 = month17.isValid();
        Day day22 = new Day(3, month17);
        boolean b23 = year2.equals((java.lang.Object) 3);
    }

    @Test
    public void test200() throws Throwable {
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
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test201");
        try {
            Date date3 = new Date(32, (int) '#', (int) (byte) -1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test202() throws Throwable {
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
    public void test203() throws Throwable {
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
    public void test204() throws Throwable {
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
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test205");
        Year year4 = new Year((int) (byte) 100);
        boolean b5 = year4.isValid();
        Month month6 = new Month((int) (short) 10, year4);
        boolean b7 = month6.increment();
        boolean b8 = month6.isValid();
        boolean b10 = month6.equals((java.lang.Object) 1);
        int i11 = month6.getMonthSize();
        Day day12 = new Day(4, month6);
        Year year14 = new Year(1);
        int i15 = year14.getYear();
        boolean b16 = month6.equals((java.lang.Object) i15);
        Day day17 = new Day(3, month6);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test206");
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
        Month month16 = date13.getMonth();
        date13.increment();
    }

    @Test
    public void test207() throws Throwable {
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
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test208");
        Year year1 = new Year(3);
        boolean b2 = year1.increment();
        year1.setYear(11);
        boolean b5 = year1.isLeap();
        boolean b6 = year1.increment();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test209");
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
        date3.increment();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test210");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        boolean b9 = date3.equals((java.lang.Object) (short) 100);
        Year year10 = date3.getYear();
        Date date11 = Nextday.nextDay(date3);
        java.lang.String str12 = date3.toString();
        Year year13 = date3.getYear();
        year13.setYear(28);
        Year year17 = new Year(1);
        boolean b18 = year17.increment();
        int i19 = year17.getYear();
        boolean b20 = year17.increment();
        year17.setYear(12);
        year17.setYear(12);
        boolean b25 = year13.equals((java.lang.Object) year17);
    }

    @Test
    public void test211() throws Throwable {
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
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test212");
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
        int i14 = month13.getMonth();
        int i15 = month13.getMonth();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test213");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        Month month5 = date3.getMonth();
        date3.increment();
        Day day7 = date3.getDay();
    }

    @Test
    public void test214() throws Throwable {
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
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test215");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        boolean b4 = year2.increment();
        year2.setYear((int) '4');
        boolean b7 = year2.isValid();
        boolean b8 = year2.isLeap();
        boolean b9 = year2.isValid();
        int i10 = year2.getYear();
        Month month11 = new Month(1, year2);
    }

    @Test
    public void test216() throws Throwable {
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
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test217");
        Date date3 = new Date((int) (byte) 1, 13, 12);
        Month month4 = date3.getMonth();
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
        int i19 = month12.getMonthSize();
        boolean b20 = date3.equals((java.lang.Object) i19);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test218");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        date4.printDate();
        Year year6 = date4.getYear();
        Date date7 = Nextday.nextDay(date4);
        Date date8 = Nextday.nextDay(date4);
        date8.printDate();
        Month month10 = date8.getMonth();
        boolean b11 = month10.increment();
        boolean b12 = month10.increment();
        try {
            Day day13 = new Day((int) (short) 0, month10);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test219");
        Year year3 = new Year((int) (byte) 100);
        boolean b4 = year3.isValid();
        Month month5 = new Month((int) (short) 10, year3);
        boolean b6 = month5.increment();
        boolean b7 = month5.isValid();
        boolean b9 = month5.equals((java.lang.Object) 1);
        int i10 = month5.getMonthSize();
        Day day11 = new Day(4, month5);
        Date date16 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year17 = date16.getYear();
        boolean b19 = date16.equals((java.lang.Object) "hi!");
        Month month20 = date16.getMonth();
        int i21 = month20.getMonthSize();
        int i22 = month20.getMonthSize();
        boolean b23 = month20.isValid();
        boolean b24 = month20.increment();
        day11.setDay(13, month20);
    }

    @Test
    public void test220() throws Throwable {
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
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test221");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isLeap();
        int i5 = year2.getYear();
        boolean b6 = year2.isLeap();
        Month month7 = new Month((int) (byte) 1, year2);
        int i8 = year2.getYear();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test222");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        Year year8 = date3.getYear();
        Date date9 = Nextday.nextDay(date3);
        Month month10 = date9.getMonth();
        Day day11 = date9.getDay();
        int i12 = day11.getDay();
    }

    @Test
    public void test223() throws Throwable {
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
    public void test224() throws Throwable {
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
    public void test225() throws Throwable {
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
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test226");
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
        boolean b22 = month4.isValid();
    }

    @Test
    public void test227() throws Throwable {
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
    public void test228() throws Throwable {
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
    public void test229() throws Throwable {
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
    public void test230() throws Throwable {
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
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test231");
        Year year1 = new Year((int) (short) 1);
        boolean b2 = year1.increment();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test232");
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
        date3.increment();
        date3.increment();
    }

    @Test
    public void test233() throws Throwable {
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
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test234");
        try {
            Date date3 = new Date(53, 2, 101);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test235() throws Throwable {
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
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test236");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        date3.printDate();
        Year year5 = date3.getYear();
        date3.printDate();
        java.lang.String str7 = date3.toString();
        Day day8 = date3.getDay();
        boolean b9 = day8.increment();
        int i10 = day8.getDay();
        boolean b11 = day8.increment();
        boolean b12 = day8.isValid();
        boolean b14 = day8.equals((java.lang.Object) 0L);
    }

    @Test
    public void test237() throws Throwable {
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
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test238");
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
        Year year20 = new Year(10);
        month14.setMonth(10, year20);
        Month month22 = new Month(5, year20);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test239");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isValid();
        boolean b5 = year2.isLeap();
        int i6 = year2.getYear();
        boolean b7 = year2.increment();
        Month month8 = new Month(1, year2);
        Year year10 = new Year(1);
        boolean b11 = year10.isLeap();
        boolean b12 = year10.isLeap();
        java.lang.Object obj13 = new java.lang.Object();
        boolean b14 = year10.equals(obj13);
        boolean b15 = year10.increment();
        Date date19 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year20 = date19.getYear();
        boolean b22 = date19.equals((java.lang.Object) "hi!");
        java.lang.String str23 = date19.toString();
        boolean b25 = date19.equals((java.lang.Object) (short) 100);
        Year year26 = date19.getYear();
        Date date27 = Nextday.nextDay(date19);
        date27.increment();
        boolean b29 = year10.equals((java.lang.Object) date27);
        date27.increment();
        Month month31 = date27.getMonth();
        Month month32 = date27.getMonth();
        Month month33 = date27.getMonth();
        boolean b34 = year2.equals((java.lang.Object) date27);
    }

    @Test
    public void test240() throws Throwable {
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
    public void test241() throws Throwable {
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
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test242");
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
        date3.printDate();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test243");
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
        int i22 = day9.getDay();
        boolean b23 = day9.isValid();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test244");
        Year year1 = new Year(1);
        boolean b2 = year1.increment();
        boolean b3 = year1.increment();
        int i4 = year1.getYear();
    }

    @Test
    public void test245() throws Throwable {
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
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test246");
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
        Day day18 = date3.getDay();
        date3.printDate();
        Month month20 = date3.getMonth();
        Day day21 = date3.getDay();
        Year year22 = date3.getYear();
        year22.setYear(102);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test247");
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
        boolean b21 = year14.isValid();
        boolean b22 = year14.increment();
    }

    @Test
    public void test248() throws Throwable {
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
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test249");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isLeap();
        int i4 = year1.getYear();
        boolean b5 = year1.isLeap();
        boolean b6 = year1.isValid();
        year1.setYear((int) '4');
        try {
            year1.setYear((int) (short) 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test250");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Day day7 = date3.getDay();
        Month month8 = date3.getMonth();
        date3.printDate();
        java.lang.String str10 = date3.toString();
        Date date11 = Nextday.nextDay(date3);
        Date date12 = Nextday.nextDay(date3);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test251");
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
        date19.increment();
        date19.printDate();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test252");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        boolean b4 = year2.increment();
        year2.setYear((int) '4');
        boolean b7 = year2.isValid();
        boolean b8 = year2.isLeap();
        boolean b9 = year2.isValid();
        int i10 = year2.getYear();
        boolean b11 = year2.isValid();
        Month month12 = new Month((int) (byte) 10, year2);
        Year year15 = new Year((int) (byte) 100);
        java.lang.Object obj16 = new java.lang.Object();
        boolean b17 = year15.equals(obj16);
        int i18 = year15.getYear();
        int i19 = year15.getYear();
        year15.setYear(1);
        int i22 = year15.getYear();
        boolean b23 = year15.isLeap();
        try {
            month12.setMonth(13, year15);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test253");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date4 = Nextday.nextDay(date3);
        date3.printDate();
        Month month6 = date3.getMonth();
        Date date10 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year11 = date10.getYear();
        boolean b13 = date10.equals((java.lang.Object) "hi!");
        Day day14 = date10.getDay();
        Year year18 = new Year((int) (byte) 100);
        boolean b19 = year18.isValid();
        Month month20 = new Month((int) (short) 10, year18);
        day14.setDay((int) (short) 10, month20);
        java.lang.Object obj22 = null;
        boolean b23 = day14.equals(obj22);
        boolean b24 = day14.isValid();
        boolean b25 = day14.increment();
        boolean b26 = date3.equals((java.lang.Object) b25);
        Day day27 = date3.getDay();
        Date date28 = Nextday.nextDay(date3);
    }

    @Test
    public void test254() throws Throwable {
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
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test255");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isValid();
        boolean b5 = year2.isValid();
        boolean b6 = year2.isValid();
        int i7 = year2.getYear();
        Month month8 = new Month((int) (short) 10, year2);
        boolean b9 = year2.isValid();
        boolean b10 = year2.isLeap();
        boolean b11 = year2.isLeap();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test256");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        Year year8 = date3.getYear();
        Date date9 = Nextday.nextDay(date3);
        Month month10 = date9.getMonth();
        boolean b11 = month10.isValid();
        int i12 = month10.getMonthSize();
        int i13 = month10.getMonthSize();
    }

    @Test
    public void test257() throws Throwable {
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
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test258");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        boolean b9 = date3.equals((java.lang.Object) (short) 100);
        Year year10 = date3.getYear();
        Date date11 = Nextday.nextDay(date3);
        java.lang.String str12 = date11.toString();
        date11.printDate();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test259");
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
        boolean b16 = year15.isLeap();
        year15.setYear(101);
        boolean b20 = year15.equals((java.lang.Object) 1.0f);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test260");
        Year year1 = new Year(1);
        boolean b2 = year1.isLeap();
        boolean b4 = year1.equals((java.lang.Object) 100.0f);
        boolean b5 = year1.isLeap();
        boolean b6 = year1.isValid();
        int i7 = year1.getYear();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test261");
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
            Day day19 = new Day((int) 'a', month16);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test262");
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
        Day day14 = date9.getDay();
        Date date15 = Nextday.nextDay(date9);
        date9.increment();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test263");
        Year year1 = new Year(1);
        int i2 = year1.getYear();
        boolean b3 = year1.isValid();
        boolean b4 = year1.increment();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test264");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Day day7 = date3.getDay();
        Date date8 = Nextday.nextDay(date3);
        Day day9 = date8.getDay();
        Month month10 = date8.getMonth();
        date8.increment();
    }

    @Test
    public void test265() throws Throwable {
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
    public void test266() throws Throwable {
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
    public void test267() throws Throwable {
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
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test268");
        Year year1 = new Year(1);
        boolean b2 = year1.isLeap();
        boolean b3 = year1.isLeap();
        boolean b4 = year1.increment();
        boolean b5 = year1.increment();
        int i6 = year1.getYear();
        year1.setYear((int) 'a');
        boolean b9 = year1.isValid();
    }

    @Test
    public void test269() throws Throwable {
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
    public void test270() throws Throwable {
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
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test271");
        Year year1 = new Year((int) (byte) 1);
        boolean b2 = year1.isValid();
        year1.setYear((int) (byte) 1);
    }
}

