import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
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
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test002");
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
        Date date23 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year24 = date23.getYear();
        boolean b26 = date23.equals((java.lang.Object) "hi!");
        date23.printDate();
        Year year28 = date23.getYear();
        date23.increment();
        Year year30 = date23.getYear();
        try {
            month15.setMonth(32, year30);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test004");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isLeap();
        int i4 = year1.getYear();
        boolean b5 = year1.increment();
        boolean b6 = year1.increment();
        Year year9 = new Year((int) (byte) 100);
        boolean b10 = year9.isValid();
        Month month11 = new Month((int) (short) 10, year9);
        boolean b13 = month11.equals((java.lang.Object) 10L);
        boolean b14 = month11.isValid();
        int i15 = month11.getMonthSize();
        int i16 = month11.getMonth();
        Year year19 = new Year(1);
        boolean b20 = year19.isValid();
        boolean b21 = year19.isLeap();
        int i22 = year19.getYear();
        boolean b23 = year19.isLeap();
        Month month24 = new Month((int) (byte) 1, year19);
        int i25 = month24.getMonthSize();
        int i26 = month24.getMonthSize();
        int i27 = month24.getMonthSize();
        boolean b28 = month24.isValid();
        int i29 = month24.getMonth();
        boolean b30 = month11.equals((java.lang.Object) i29);
        Year year32 = new Year(1);
        boolean b33 = year32.isLeap();
        boolean b34 = year32.isLeap();
        java.lang.Object obj35 = new java.lang.Object();
        boolean b36 = year32.equals(obj35);
        boolean b37 = year32.increment();
        boolean b38 = month11.equals((java.lang.Object) year32);
        boolean b39 = year1.equals((java.lang.Object) year32);
        boolean b40 = year32.increment();
    }

    @Test
    public void test005() throws Throwable {
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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test006");
        Year year2 = new Year(52);
        try {
            Month month3 = new Month(100, year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test007");
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
        try {
            Day day25 = new Day(0, month8);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test008");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b6 = month4.equals((java.lang.Object) 10L);
        boolean b7 = month4.increment();
        Year year10 = new Year((int) (short) 1);
        boolean b11 = year10.isLeap();
        year10.setYear(31);
        boolean b14 = year10.increment();
        year10.setYear((int) '4');
        int i17 = year10.getYear();
        year10.setYear(52);
        try {
            month4.setMonth((int) 'a', year10);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test009");
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
        int i18 = day16.getDay();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test010");
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
        date3.printDate();
        date3.increment();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test011");
        Date date3 = new Date(11, 28, (int) (byte) 10);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test012");
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
        Date date20 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year21 = date20.getYear();
        boolean b23 = date20.equals((java.lang.Object) "hi!");
        java.lang.String str24 = date20.toString();
        Day day25 = date20.getDay();
        Day day26 = date20.getDay();
        date20.printDate();
        Year year30 = new Year((int) (byte) 100);
        boolean b31 = year30.isValid();
        Month month32 = new Month((int) (short) 10, year30);
        boolean b33 = month32.increment();
        int i34 = month32.getMonth();
        int i35 = month32.getMonth();
        int i36 = month32.getMonthSize();
        boolean b37 = date20.equals((java.lang.Object) month32);
        try {
            day15.setDay(100, month32);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
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
    public void test014() throws Throwable {
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
    public void test015() throws Throwable {
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
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test016");
        Year year2 = new Year((int) (byte) 100);
        java.lang.Object obj3 = new java.lang.Object();
        boolean b4 = year2.equals(obj3);
        boolean b5 = year2.isLeap();
        boolean b6 = year2.increment();
        try {
            Month month7 = new Month((int) (short) 0, year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test017");
        Year year2 = new Year((int) (byte) 100);
        int i3 = year2.getYear();
        int i4 = year2.getYear();
        Month month5 = new Month(5, year2);
        Year year8 = new Year((int) (byte) 100);
        boolean b9 = year8.isValid();
        boolean b10 = year8.increment();
        year8.setYear((int) '4');
        boolean b13 = year8.increment();
        try {
            month5.setMonth(100, year8);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test018");
        try {
            Date date3 = new Date((int) '4', 33, 97);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test019");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        date3.printDate();
        Year year5 = date3.getYear();
        boolean b6 = year5.increment();
    }

    @Test
    public void test020() throws Throwable {
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
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test021");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Day day7 = date3.getDay();
        Year year8 = date3.getYear();
        int i9 = year8.getYear();
    }

    @Test
    public void test022() throws Throwable {
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
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test023");
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
        int i23 = month7.getMonthSize();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test024");
        Year year1 = new Year(31);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isValid();
        int i4 = year1.getYear();
    }

    @Test
    public void test025() throws Throwable {
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
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test026");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        date3.printDate();
        date3.increment();
        java.lang.String str10 = date3.toString();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test027");
        Year year1 = new Year((int) (byte) 1);
        int i2 = year1.getYear();
        year1.setYear(30);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test028");
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
        date15.printDate();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test029");
        try {
            Date date3 = new Date(32, 0, (int) (byte) 10);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test030() throws Throwable {
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
    public void test031() throws Throwable {
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
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test032");
        try {
            Date date3 = new Date((int) (byte) 100, 52, 2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test033");
        Year year3 = new Year((int) (byte) 100);
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = year3.equals(obj4);
        Date date9 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year10 = date9.getYear();
        boolean b12 = date9.equals((java.lang.Object) "hi!");
        Month month13 = date9.getMonth();
        boolean b14 = year3.equals((java.lang.Object) date9);
        Date date15 = Nextday.nextDay(date9);
        Month month16 = date15.getMonth();
        Day day17 = new Day(11, month16);
        Year year19 = new Year(1);
        boolean b20 = year19.isValid();
        int i21 = year19.getYear();
        year19.setYear(100);
        year19.setYear((int) ' ');
        boolean b26 = month16.equals((java.lang.Object) year19);
        boolean b27 = month16.increment();
        int i28 = month16.getMonthSize();
        try {
            Day day29 = new Day((int) (short) 100, month16);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test034");
        Year year1 = new Year(1);
        boolean b2 = year1.increment();
        int i3 = year1.getYear();
        boolean b4 = year1.isValid();
        boolean b5 = year1.increment();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test035");
        try {
            Date date3 = new Date(12, 52, (int) (short) 100);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test036");
        Year year2 = new Year((int) (short) 100);
        boolean b3 = year2.increment();
        Year year5 = new Year(1);
        boolean b6 = year5.isValid();
        int i7 = year5.getYear();
        year5.setYear(100);
        boolean b10 = year2.equals((java.lang.Object) year5);
        boolean b11 = year2.isValid();
        try {
            Month month12 = new Month((int) (byte) -1, year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test037");
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
        int i17 = day16.getDay();
    }

    @Test
    public void test038() throws Throwable {
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
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test039");
        Date date3 = new Date((int) (byte) 1, 3, 102);
        java.lang.String str4 = date3.toString();
        date3.printDate();
    }

    @Test
    public void test040() throws Throwable {
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
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test041");
        try {
            Date date3 = new Date(101, 11, (int) (short) 1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test042() throws Throwable {
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
    public void test043() throws Throwable {
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
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test044");
        Year year2 = new Year((int) (short) 100);
        boolean b3 = year2.increment();
        boolean b5 = year2.equals((java.lang.Object) "10/10/1");
        year2.setYear((int) (short) 10);
        try {
            Month month8 = new Month(0, year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test045() throws Throwable {
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
    public void test046() throws Throwable {
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
    public void test047() throws Throwable {
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
    public void test048() throws Throwable {
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
    public void test049() throws Throwable {
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
    public void test050() throws Throwable {
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
    public void test051() throws Throwable {
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
    public void test052() throws Throwable {
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
    public void test053() throws Throwable {
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
    public void test054() throws Throwable {
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
    public void test055() throws Throwable {
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
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test056");
        Year year1 = new Year((int) (byte) 100);
        boolean b2 = year1.isValid();
        year1.setYear(52);
        boolean b5 = year1.isLeap();
        boolean b6 = year1.isValid();
        year1.setYear(101);
        boolean b9 = year1.increment();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test057");
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
        Date date25 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year26 = date25.getYear();
        Year year29 = new Year((int) (byte) 100);
        boolean b30 = year29.isValid();
        Month month31 = new Month((int) (short) 10, year29);
        boolean b32 = month31.increment();
        boolean b33 = date25.equals((java.lang.Object) month31);
        Year year34 = date25.getYear();
        Date date35 = Nextday.nextDay(date25);
        Month month36 = date25.getMonth();
        Month month37 = date25.getMonth();
        int i38 = month37.getMonth();
        try {
            day7.setDay(102, month37);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test058");
        Year year1 = new Year(1);
        boolean b2 = year1.isLeap();
        boolean b3 = year1.isLeap();
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = year1.equals(obj4);
        boolean b6 = year1.increment();
        boolean b7 = year1.isValid();
        boolean b8 = year1.increment();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test059");
        Year year1 = new Year(1);
        boolean b2 = year1.isLeap();
        int i3 = year1.getYear();
        boolean b5 = year1.equals((java.lang.Object) 1);
        year1.setYear(32);
        boolean b8 = year1.isLeap();
        boolean b9 = year1.increment();
        boolean b10 = year1.isLeap();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test060");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date4 = Nextday.nextDay(date3);
        date3.printDate();
        Month month6 = date3.getMonth();
        Date date7 = Nextday.nextDay(date3);
        java.lang.String str8 = date7.toString();
        java.lang.String str9 = date7.toString();
        Day day10 = date7.getDay();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test061");
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
        Date date20 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date21 = Nextday.nextDay(date20);
        Year year25 = new Year(1);
        boolean b26 = year25.isValid();
        boolean b27 = year25.isLeap();
        int i28 = year25.getYear();
        boolean b29 = year25.isLeap();
        Month month30 = new Month((int) (byte) 1, year25);
        Day day31 = new Day(31, month30);
        boolean b32 = day31.isValid();
        Year year36 = new Year((int) (byte) 100);
        boolean b37 = year36.isValid();
        Month month38 = new Month((int) (short) 10, year36);
        boolean b40 = month38.equals((java.lang.Object) 10L);
        int i41 = month38.getMonth();
        boolean b42 = month38.isValid();
        day31.setDay((int) (short) 1, month38);
        boolean b44 = date21.equals((java.lang.Object) month38);
        Year year45 = date21.getYear();
        try {
            month9.setMonth((-1), year45);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test062");
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
        int i21 = month15.getMonth();
        boolean b22 = month15.increment();
    }

    @Test
    public void test063() throws Throwable {
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
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test064");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b5 = month4.increment();
        boolean b6 = month4.increment();
        boolean b7 = month4.isValid();
        boolean b8 = month4.increment();
        boolean b9 = month4.increment();
        Year year12 = new Year((int) '#');
        Date date16 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year17 = date16.getYear();
        boolean b19 = date16.equals((java.lang.Object) "hi!");
        date16.printDate();
        Year year21 = date16.getYear();
        Year year23 = new Year(1);
        boolean b24 = year23.isValid();
        boolean b25 = year23.isValid();
        boolean b26 = year23.isLeap();
        boolean b27 = year23.increment();
        int i28 = year23.getYear();
        boolean b29 = date16.equals((java.lang.Object) year23);
        boolean b30 = year12.equals((java.lang.Object) year23);
        try {
            month4.setMonth((int) ' ', year23);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test065() throws Throwable {
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
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test066");
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
        int i16 = month9.getMonthSize();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test067");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year5 = date4.getYear();
        boolean b7 = date4.equals((java.lang.Object) "hi!");
        Month month8 = date4.getMonth();
        int i9 = month8.getMonthSize();
        boolean b10 = month8.increment();
        Day day11 = new Day(2, month8);
        java.lang.Object obj12 = null;
        boolean b13 = month8.equals(obj12);
    }

    @Test
    public void test068() throws Throwable {
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
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test069");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b5 = month4.increment();
        boolean b6 = month4.isValid();
        boolean b8 = month4.equals((java.lang.Object) 1);
        int i9 = month4.getMonthSize();
        int i10 = month4.getMonthSize();
        Year year13 = new Year(1);
        boolean b14 = year13.isLeap();
        boolean b15 = year13.isLeap();
        boolean b16 = year13.increment();
        boolean b17 = year13.isLeap();
        try {
            month4.setMonth((int) ' ', year13);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test070");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        date3.printDate();
        Year year5 = date3.getYear();
        date3.printDate();
        java.lang.String str7 = date3.toString();
        Day day8 = date3.getDay();
        date3.printDate();
        date3.increment();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test071");
        Year year1 = new Year(1);
        boolean b2 = year1.isLeap();
        boolean b3 = year1.increment();
        boolean b4 = year1.isLeap();
        year1.setYear(30);
    }

    @Test
    public void test072() throws Throwable {
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
    public void test073() throws Throwable {
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
    public void test074() throws Throwable {
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
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test075");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year5 = date4.getYear();
        Year year8 = new Year((int) (byte) 100);
        boolean b9 = year8.isValid();
        Month month10 = new Month((int) (short) 10, year8);
        boolean b11 = month10.increment();
        boolean b12 = date4.equals((java.lang.Object) month10);
        try {
            Day day13 = new Day((int) (short) -1, month10);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test076");
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
        boolean b14 = year2.isValid();
        try {
            Month month15 = new Month((int) '#', year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test077");
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
        try {
            Day day24 = new Day((int) (short) 0, month10);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test078");
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
        Year year19 = new Year(1);
        boolean b20 = year19.isLeap();
        boolean b21 = year19.isLeap();
        boolean b22 = year19.increment();
        Month month23 = new Month((int) (short) 1, year19);
        Date date27 = new Date(10, (int) (byte) 10, (int) (short) 1);
        java.lang.String str28 = date27.toString();
        boolean b29 = month23.equals((java.lang.Object) date27);
        Day day30 = new Day((int) (byte) 10, month23);
        Year year33 = new Year(1);
        boolean b34 = year33.isLeap();
        boolean b35 = year33.isLeap();
        Date date39 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year40 = date39.getYear();
        boolean b42 = date39.equals((java.lang.Object) "hi!");
        date39.increment();
        java.lang.String str44 = date39.toString();
        boolean b45 = year33.equals((java.lang.Object) date39);
        Month month46 = new Month((int) (short) 10, year33);
        boolean b47 = year33.isLeap();
        boolean b48 = day30.equals((java.lang.Object) year33);
        Year year52 = new Year((int) (byte) 100);
        boolean b53 = year52.isValid();
        Month month54 = new Month((int) (short) 10, year52);
        int i55 = month54.getMonth();
        Day day56 = new Day(30, month54);
        int i57 = day56.getDay();
        boolean b58 = year33.equals((java.lang.Object) day56);
        boolean b59 = year33.increment();
        try {
            month4.setMonth((int) 'a', year33);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test079() throws Throwable {
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
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test080");
        try {
            Date date3 = new Date(32, (int) 'a', 2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test081");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        Year year8 = date3.getYear();
        boolean b9 = year8.isLeap();
    }

    @Test
    public void test082() throws Throwable {
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
    public void test083() throws Throwable {
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
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test084");
        try {
            Date date3 = new Date(5, 0, 32);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test085");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        boolean b6 = date4.equals((java.lang.Object) (-1));
        Year year7 = date4.getYear();
        Month month8 = new Month(3, year7);
        boolean b9 = year7.increment();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test086");
        try {
            Date date3 = new Date((int) (byte) -1, (int) 'a', (-1));
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test087() throws Throwable {
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
    public void test088() throws Throwable {
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
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test089");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year5 = date4.getYear();
        boolean b7 = date4.equals((java.lang.Object) "hi!");
        java.lang.String str8 = date4.toString();
        boolean b10 = date4.equals((java.lang.Object) (short) 100);
        Year year11 = date4.getYear();
        Date date12 = Nextday.nextDay(date4);
        date12.increment();
        date12.printDate();
        date12.increment();
        Month month16 = date12.getMonth();
        try {
            Day day17 = new Day(32, month16);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test090");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        Day day8 = date3.getDay();
        Day day9 = date3.getDay();
        date3.increment();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test091");
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
        boolean b21 = day11.isValid();
        Date date28 = new Date(10, (int) (byte) 10, (int) (short) 1);
        boolean b30 = date28.equals((java.lang.Object) (-1));
        Year year31 = date28.getYear();
        Month month32 = new Month(3, year31);
        Day day33 = new Day((int) (byte) 1, month32);
        try {
            day11.setDay(101, month32);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test092() throws Throwable {
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
    public void test093() throws Throwable {
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
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test094");
        try {
            Date date3 = new Date(2, 32, (int) ' ');
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test095");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Day day7 = date3.getDay();
        Month month8 = date3.getMonth();
        date3.printDate();
        Day day10 = date3.getDay();
        Day day11 = date3.getDay();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test096");
        try {
            Date date3 = new Date(28, 0, 33);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test097() throws Throwable {
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
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test098");
        try {
            Date date3 = new Date((int) (byte) 0, (int) ' ', (int) (short) 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test099");
        try {
            Date date3 = new Date(11, (int) (byte) 100, 33);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test100");
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
        boolean b22 = month9.isValid();
        int i23 = month9.getMonthSize();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test101");
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
        Year year17 = new Year((int) (short) 1);
        boolean b18 = year17.isLeap();
        year17.setYear(31);
        boolean b21 = year17.increment();
        year17.setYear((int) (short) 10);
        boolean b24 = date4.equals((java.lang.Object) (short) 10);
    }

    @Test
    public void test102() throws Throwable {
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
    public void test103() throws Throwable {
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
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test104");
        Date date3 = new Date(2, (int) (short) 1, (int) 'a');
        date3.printDate();
    }

    @Test
    public void test105() throws Throwable {
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
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test106");
        try {
            Date date3 = new Date(97, 2, 11);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test107() throws Throwable {
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
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test108");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Day day7 = date3.getDay();
        Year year8 = date3.getYear();
        boolean b9 = year8.isValid();
    }

    @Test
    public void test109() throws Throwable {
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
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test110");
        Year year3 = new Year((int) (byte) 100);
        boolean b4 = year3.isValid();
        Month month5 = new Month((int) (short) 10, year3);
        boolean b6 = month5.increment();
        boolean b7 = month5.increment();
        int i8 = month5.getMonth();
        boolean b9 = month5.isValid();
        Day day10 = new Day(2, month5);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test111");
        Year year1 = new Year(1);
        boolean b2 = year1.isLeap();
        boolean b4 = year1.equals((java.lang.Object) 100.0f);
        boolean b5 = year1.increment();
    }

    @Test
    public void test112() throws Throwable {
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
    public void test113() throws Throwable {
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
    public void test114() throws Throwable {
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
    public void test115() throws Throwable {
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
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test116");
        Year year2 = new Year(1);
        boolean b3 = year2.isLeap();
        boolean b4 = year2.isLeap();
        boolean b5 = year2.increment();
        boolean b6 = year2.increment();
        Month month7 = new Month((int) (byte) 10, year2);
        int i8 = month7.getMonth();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test117");
        Year year1 = new Year(1);
        boolean b2 = year1.increment();
        boolean b3 = year1.increment();
        boolean b4 = year1.increment();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test118");
        try {
            Date date3 = new Date(30, 4, 5);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test119");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.printDate();
        Year year8 = date3.getYear();
        int i9 = year8.getYear();
        int i10 = year8.getYear();
        year8.setYear(33);
        year8.setYear(4);
    }

    @Test
    public void test120() throws Throwable {
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
    public void test121() throws Throwable {
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
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test122");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isValid();
        Month month5 = new Month((int) (short) 10, year2);
        boolean b6 = month5.isValid();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test123");
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
        try {
            Month month24 = new Month(28, year18);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test124");
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
        boolean b22 = day7.isValid();
    }

    @Test
    public void test125() throws Throwable {
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
    public void test126() throws Throwable {
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
    public void test127() throws Throwable {
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
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test128");
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
        try {
            Day day29 = new Day(97, month27);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test129() throws Throwable {
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
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test130");
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
        boolean b16 = year15.isLeap();
        boolean b17 = year15.isLeap();
    }

    @Test
    public void test131() throws Throwable {
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
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test132");
        try {
            Date date3 = new Date(102, 0, (int) (byte) 1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test133() throws Throwable {
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
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test134");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.increment();
        date3.printDate();
        Year year12 = new Year(1);
        boolean b13 = year12.isLeap();
        boolean b14 = year12.isLeap();
        boolean b15 = year12.increment();
        Month month16 = new Month((int) (short) 1, year12);
        Date date20 = new Date(10, (int) (byte) 10, (int) (short) 1);
        java.lang.String str21 = date20.toString();
        boolean b22 = month16.equals((java.lang.Object) date20);
        Day day23 = new Day((int) (byte) 10, month16);
        int i24 = month16.getMonthSize();
        int i25 = month16.getMonthSize();
        boolean b26 = date3.equals((java.lang.Object) i25);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test135");
        try {
            Date date3 = new Date((int) (byte) 0, (int) (short) 0, (int) (byte) 1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test136");
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
        boolean b21 = day15.increment();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test137");
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
        date16.increment();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test138");
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
        int i18 = day7.getDay();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test139");
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
        Year year28 = new Year(1);
        boolean b29 = year28.isValid();
        boolean b30 = year28.isValid();
        year28.setYear((int) 'a');
        try {
            month15.setMonth(33, year28);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test140");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isValid();
        boolean b5 = year2.isValid();
        boolean b6 = year2.isValid();
        int i7 = year2.getYear();
        Month month8 = new Month((int) (short) 10, year2);
        boolean b9 = year2.increment();
        Year year11 = new Year(1);
        boolean b12 = year11.isValid();
        boolean b13 = year11.isValid();
        boolean b14 = year11.isLeap();
        boolean b15 = year11.isLeap();
        boolean b16 = year2.equals((java.lang.Object) year11);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test141");
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
        Date date25 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year26 = date25.getYear();
        boolean b28 = date25.equals((java.lang.Object) "hi!");
        java.lang.String str29 = date25.toString();
        Year year31 = new Year((int) (byte) 100);
        int i32 = year31.getYear();
        boolean b33 = date25.equals((java.lang.Object) year31);
        date25.increment();
        Month month35 = date25.getMonth();
        try {
            day11.setDay(0, month35);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test142");
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
        date14.increment();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test143");
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
        boolean b23 = year16.increment();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test144");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isValid();
        int i4 = year1.getYear();
        Year year6 = new Year(1);
        boolean b7 = year6.isLeap();
        int i8 = year6.getYear();
        boolean b9 = year1.equals((java.lang.Object) i8);
        year1.setYear((-1));
        year1.setYear((int) 'a');
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test145");
        try {
            Date date3 = new Date((-1), 97, (int) (short) -1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test146");
        try {
            Date date3 = new Date(30, (int) (byte) 100, (int) (byte) 10);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test147() throws Throwable {
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
    public void test148() throws Throwable {
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
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test149");
        Date date3 = new Date((int) (short) 1, 13, 5);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test150");
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
        int i21 = month17.getMonthSize();
    }

    @Test
    public void test151() throws Throwable {
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
    public void test152() throws Throwable {
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
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test153");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year5 = date4.getYear();
        boolean b7 = date4.equals((java.lang.Object) "hi!");
        Month month8 = date4.getMonth();
        Month month9 = date4.getMonth();
        int i10 = month9.getMonth();
        boolean b11 = month9.isValid();
        int i12 = month9.getMonthSize();
        int i13 = month9.getMonth();
        try {
            Day day14 = new Day((int) (short) 0, month9);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test154() throws Throwable {
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
    public void test155() throws Throwable {
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
    public void test156() throws Throwable {
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
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test157");
        try {
            Date date3 = new Date(100, 12, 30);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test158");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.printDate();
        Year year8 = date3.getYear();
        date3.increment();
        Date date10 = Nextday.nextDay(date3);
        Month month11 = date10.getMonth();
        date10.printDate();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test159");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.printDate();
        Year year8 = date3.getYear();
        date3.increment();
        Date date10 = Nextday.nextDay(date3);
        date3.printDate();
        Date date12 = Nextday.nextDay(date3);
        date12.printDate();
    }

    @Test
    public void test160() throws Throwable {
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
    public void test161() throws Throwable {
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
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test162");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year5 = date4.getYear();
        Year year8 = new Year((int) (byte) 100);
        boolean b9 = year8.isValid();
        Month month10 = new Month((int) (short) 10, year8);
        boolean b11 = month10.increment();
        boolean b12 = date4.equals((java.lang.Object) month10);
        Year year13 = date4.getYear();
        try {
            Month month14 = new Month(30, year13);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test163");
        try {
            Date date3 = new Date(12, 0, 1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test164");
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
        boolean b16 = year15.increment();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test165");
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
        date14.increment();
    }

    @Test
    public void test166() throws Throwable {
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
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test167");
        Month month1 = null;
        try {
            Day day2 = new Day((int) '#', month1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test168");
        try {
            Date date3 = new Date((int) (short) 0, 13, (int) (byte) 10);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test169");
        try {
            Date date3 = new Date(2, (int) (short) 100, 4);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test170");
        Date date3 = new Date(5, 1, (int) (short) 100);
        Year year4 = date3.getYear();
        boolean b5 = year4.increment();
    }

    @Test
    public void test171() throws Throwable {
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
    public void test172() throws Throwable {
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
    public void test173() throws Throwable {
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
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test174");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b6 = month4.equals((java.lang.Object) 10L);
        boolean b7 = month4.isValid();
        int i8 = month4.getMonthSize();
        Year year12 = new Year(1);
        boolean b13 = year12.isValid();
        boolean b14 = year12.isValid();
        Month month15 = new Month((int) (short) 10, year12);
        Year year18 = new Year((int) (byte) 100);
        boolean b19 = year18.isValid();
        Month month20 = new Month((int) (short) 10, year18);
        boolean b21 = year18.increment();
        boolean b22 = month15.equals((java.lang.Object) year18);
        boolean b23 = year18.isLeap();
        boolean b24 = year18.increment();
        try {
            month4.setMonth(0, year18);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test175() throws Throwable {
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
    public void test176() throws Throwable {
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
    public void test177() throws Throwable {
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
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test178");
        Date date3 = new Date((int) (short) 10, 11, (int) (short) 100);
        date3.increment();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test179");
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
        Month month18 = date3.getMonth();
        date3.printDate();
        date3.increment();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test180");
        try {
            Date date3 = new Date(28, (int) (short) -1, 5);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test181");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date4 = Nextday.nextDay(date3);
        date3.printDate();
        Month month6 = date3.getMonth();
        Month month7 = date3.getMonth();
        boolean b8 = month7.isValid();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test182");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        date3.printDate();
        Year year6 = date3.getYear();
        Day day7 = date3.getDay();
        Month month8 = date3.getMonth();
        Day day9 = date3.getDay();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test183");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.increment();
        Year year8 = date3.getYear();
        Date date9 = Nextday.nextDay(date3);
        Day day10 = date3.getDay();
        int i11 = day10.getDay();
    }

    @Test
    public void test184() throws Throwable {
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
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test185");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isValid();
        Month month5 = new Month((int) (short) 10, year2);
        Year year8 = new Year((int) (byte) 100);
        boolean b9 = year8.isValid();
        Month month10 = new Month((int) (short) 10, year8);
        boolean b11 = year8.increment();
        boolean b12 = month5.equals((java.lang.Object) year8);
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
        boolean b28 = year24.increment();
        try {
            month5.setMonth(100, year24);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test186");
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
        int i23 = month7.getMonth();
        int i24 = month7.getMonth();
    }

    @Test
    public void test187() throws Throwable {
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
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test188");
        Year year1 = new Year(1);
        boolean b2 = year1.isLeap();
        int i3 = year1.getYear();
        year1.setYear(100);
        int i6 = year1.getYear();
        int i7 = year1.getYear();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test189");
        Year year3 = new Year((int) (byte) 100);
        boolean b4 = year3.isValid();
        Month month5 = new Month((int) (short) 10, year3);
        boolean b6 = month5.increment();
        boolean b7 = month5.isValid();
        boolean b9 = month5.equals((java.lang.Object) 1);
        int i10 = month5.getMonthSize();
        int i11 = month5.getMonthSize();
        Date date15 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date16 = Nextday.nextDay(date15);
        date15.printDate();
        java.lang.String str18 = date15.toString();
        Day day19 = date15.getDay();
        boolean b20 = month5.equals((java.lang.Object) day19);
        try {
            Day day21 = new Day(52, month5);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test190");
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
        java.lang.Object obj18 = null;
        boolean b19 = day15.equals(obj18);
        boolean b20 = day15.isValid();
        boolean b21 = day15.isValid();
    }

    @Test
    public void test191() throws Throwable {
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
    public void test192() throws Throwable {
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
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test193");
        Year year1 = new Year(31);
        Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year6 = date5.getYear();
        boolean b8 = date5.equals((java.lang.Object) "hi!");
        java.lang.String str9 = date5.toString();
        boolean b11 = date5.equals((java.lang.Object) (short) 100);
        Year year12 = date5.getYear();
        Year year14 = new Year(1);
        boolean b15 = year14.isLeap();
        int i16 = year14.getYear();
        boolean b18 = year14.equals((java.lang.Object) 1);
        year14.setYear(32);
        boolean b21 = date5.equals((java.lang.Object) 32);
        boolean b22 = year1.equals((java.lang.Object) b21);
        int i23 = year1.getYear();
    }

    @Test
    public void test194() throws Throwable {
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
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test195");
        Year year1 = new Year(101);
        boolean b2 = year1.increment();
        year1.setYear((int) (byte) 10);
    }

    @Test
    public void test196() throws Throwable {
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
    public void test197() throws Throwable {
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
    public void test198() throws Throwable {
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
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test199");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Month month7 = date3.getMonth();
        int i8 = month7.getMonthSize();
        int i9 = month7.getMonthSize();
        Year year12 = new Year(1);
        boolean b13 = year12.isValid();
        boolean b14 = year12.isValid();
        boolean b15 = year12.isLeap();
        boolean b16 = year12.increment();
        int i17 = year12.getYear();
        boolean b18 = year12.increment();
        boolean b19 = year12.isLeap();
        boolean b20 = year12.isValid();
        java.lang.Object obj21 = null;
        boolean b22 = year12.equals(obj21);
        try {
            month7.setMonth((int) ' ', year12);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test200() throws Throwable {
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
    public void test201() throws Throwable {
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
    public void test202() throws Throwable {
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
    public void test203() throws Throwable {
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
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test204");
        Year year1 = new Year((int) (short) 10);
        Year year4 = new Year((int) (byte) 100);
        boolean b5 = year4.isValid();
        Month month6 = new Month((int) (short) 10, year4);
        boolean b7 = month6.increment();
        boolean b8 = month6.increment();
        boolean b9 = month6.isValid();
        boolean b10 = month6.increment();
        Year year12 = new Year(1);
        year12.setYear(32);
        boolean b15 = month6.equals((java.lang.Object) year12);
        boolean b16 = year1.equals((java.lang.Object) year12);
        year12.setYear(28);
    }

    @Test
    public void test205() throws Throwable {
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
    public void test206() throws Throwable {
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
    public void test207() throws Throwable {
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
    public void test208() throws Throwable {
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
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test209");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isValid();
        Month month5 = new Month((int) (short) 10, year2);
        int i6 = month5.getMonthSize();
        int i7 = month5.getMonth();
        int i8 = month5.getMonth();
        int i9 = month5.getMonthSize();
    }

    @Test
    public void test210() throws Throwable {
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
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test211");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        int i3 = year1.getYear();
        int i4 = year1.getYear();
        boolean b5 = year1.isLeap();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test212");
        try {
            Date date3 = new Date((int) (short) 100, (int) (short) 1, 30);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test213");
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
        boolean b19 = month18.isValid();
        boolean b20 = month18.increment();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test214");
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
        Month month18 = date3.getMonth();
        date3.printDate();
        date3.printDate();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test215");
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
        int i14 = month12.getMonthSize();
    }

    @Test
    public void test216() throws Throwable {
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
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test217");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        date3.printDate();
        Year year5 = date3.getYear();
        date3.printDate();
        java.lang.String str7 = date3.toString();
        date3.increment();
    }

    @Test
    public void test218() throws Throwable {
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
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test219");
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
        boolean b16 = month5.isValid();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test220");
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
        boolean b12 = month7.increment();
    }

    @Test
    public void test221() throws Throwable {
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
    public void test222() throws Throwable {
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
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test223");
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
        java.lang.String str17 = date16.toString();
        java.lang.String str18 = date16.toString();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test224");
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
        year1.setYear(100);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test225");
        Year year2 = new Year(101);
        boolean b3 = year2.isLeap();
        boolean b4 = year2.isValid();
        try {
            Month month5 = new Month(97, year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test226() throws Throwable {
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
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test227");
        Year year3 = new Year((int) (byte) 100);
        boolean b4 = year3.isValid();
        Month month5 = new Month((int) (short) 10, year3);
        boolean b6 = month5.increment();
        int i7 = month5.getMonthSize();
        boolean b8 = month5.isValid();
        Day day9 = new Day(10, month5);
        boolean b10 = month5.increment();
        Year year13 = new Year(1);
        boolean b14 = year13.isValid();
        try {
            month5.setMonth((int) (byte) 0, year13);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test228");
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
        int i21 = month19.getMonth();
        Date date26 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year27 = date26.getYear();
        boolean b29 = date26.equals((java.lang.Object) "hi!");
        date26.increment();
        date26.printDate();
        Year year32 = date26.getYear();
        date26.increment();
        Year year34 = date26.getYear();
        try {
            month19.setMonth((int) '#', year34);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test229() throws Throwable {
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
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test230");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        boolean b6 = date4.equals((java.lang.Object) (-1));
        Year year7 = date4.getYear();
        Month month8 = new Month(3, year7);
        Year year11 = new Year(3);
        month8.setMonth(11, year11);
        Year year15 = new Year((int) (byte) 100);
        java.lang.Object obj16 = new java.lang.Object();
        boolean b17 = year15.equals(obj16);
        Date date21 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year22 = date21.getYear();
        boolean b24 = date21.equals((java.lang.Object) "hi!");
        Month month25 = date21.getMonth();
        boolean b26 = year15.equals((java.lang.Object) date21);
        try {
            month8.setMonth((int) (short) -1, year15);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test231() throws Throwable {
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
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test232");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        boolean b9 = date3.equals((java.lang.Object) (short) 100);
        Date date10 = Nextday.nextDay(date3);
        date10.increment();
        date10.printDate();
        Date date13 = Nextday.nextDay(date10);
        date13.printDate();
    }

    @Test
    public void test233() throws Throwable {
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
    public void test234() throws Throwable {
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
    public void test235() throws Throwable {
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
    public void test236() throws Throwable {
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
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test237");
        try {
            Date date3 = new Date(101, 100, (int) (byte) -1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test238");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isValid();
        boolean b5 = year2.isValid();
        boolean b6 = year2.isValid();
        int i7 = year2.getYear();
        Month month8 = new Month((int) (short) 10, year2);
        int i9 = month8.getMonth();
        boolean b10 = month8.isValid();
        boolean b11 = month8.isValid();
        boolean b12 = month8.isValid();
        boolean b13 = month8.increment();
        int i14 = month8.getMonth();
        Year year17 = new Year(1);
        boolean b18 = year17.isLeap();
        boolean b19 = year17.isLeap();
        boolean b20 = year17.increment();
        java.lang.Object obj21 = null;
        boolean b22 = year17.equals(obj21);
        boolean b23 = year17.isValid();
        Date date27 = new Date(10, (int) (byte) 10, (int) (short) 1);
        boolean b28 = year17.equals((java.lang.Object) (byte) 10);
        boolean b29 = year17.isValid();
        Year year31 = new Year((int) (byte) 100);
        java.lang.Object obj32 = new java.lang.Object();
        boolean b33 = year31.equals(obj32);
        boolean b34 = year17.equals((java.lang.Object) year31);
        try {
            month8.setMonth(28, year17);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test239");
        Year year3 = new Year(1);
        boolean b4 = year3.isValid();
        boolean b5 = year3.isLeap();
        int i6 = year3.getYear();
        boolean b7 = year3.isLeap();
        Month month8 = new Month((int) (byte) 1, year3);
        Day day9 = new Day(10, month8);
        int i10 = month8.getMonth();
        int i11 = month8.getMonthSize();
        int i12 = month8.getMonthSize();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test240");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        int i5 = month4.getMonth();
        Year year8 = new Year((int) (short) 1);
        boolean b9 = year8.isLeap();
        month4.setMonth((int) (short) 10, year8);
        int i11 = month4.getMonth();
        Date date16 = new Date(10, (int) (byte) 10, (int) (short) 1);
        boolean b18 = date16.equals((java.lang.Object) (-1));
        Year year20 = new Year(1);
        boolean b21 = year20.isValid();
        boolean b22 = year20.isLeap();
        int i23 = year20.getYear();
        boolean b24 = year20.isLeap();
        boolean b25 = year20.isLeap();
        boolean b26 = date16.equals((java.lang.Object) b25);
        java.lang.String str27 = date16.toString();
        Month month28 = date16.getMonth();
        Day day29 = date16.getDay();
        Year year30 = date16.getYear();
        boolean b31 = year30.isValid();
        try {
            month4.setMonth((int) 'a', year30);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test241() throws Throwable {
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
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test242");
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
        boolean b20 = year12.increment();
        boolean b21 = year12.increment();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test243");
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
        boolean b21 = month20.isValid();
        int i22 = month20.getMonth();
    }

    @Test
    public void test244() throws Throwable {
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
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test245");
        Year year1 = new Year((int) (byte) 100);
        int i2 = year1.getYear();
        boolean b3 = year1.isLeap();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test246");
        Year year1 = new Year(13);
    }

    @Test
    public void test247() throws Throwable {
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
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test248");
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
        java.lang.String str18 = date14.toString();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test249");
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
        java.lang.Object obj16 = null;
        boolean b17 = year14.equals(obj16);
    }

    @Test
    public void test250() throws Throwable {
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
    public void test251() throws Throwable {
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
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test252");
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
        try {
            Month month26 = new Month(52, year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test253() throws Throwable {
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
    public void test254() throws Throwable {
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
    public void test255() throws Throwable {
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
    public void test256() throws Throwable {
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
    public void test257() throws Throwable {
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
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test258");
        Year year3 = new Year((int) (byte) 100);
        boolean b4 = year3.isValid();
        Month month5 = new Month((int) (short) 10, year3);
        int i6 = month5.getMonth();
        Day day7 = new Day(30, month5);
        boolean b8 = month5.increment();
        int i9 = month5.getMonth();
        int i10 = month5.getMonthSize();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test259");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        boolean b9 = date3.equals((java.lang.Object) (short) 100);
        Date date10 = Nextday.nextDay(date3);
        date10.increment();
        date10.printDate();
        Date date13 = Nextday.nextDay(date10);
        date13.increment();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test260");
        Date date3 = new Date((int) (short) 10, 11, (int) (short) 100);
        Month month4 = date3.getMonth();
        boolean b5 = month4.isValid();
    }

    @Test
    public void test261() throws Throwable {
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
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test262");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        date3.printDate();
        Year year5 = date3.getYear();
        Day day6 = date3.getDay();
        Day day7 = date3.getDay();
        date3.increment();
        date3.printDate();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test263");
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
        Year year33 = new Year((int) (byte) 100);
        boolean b34 = year33.isValid();
        Month month35 = new Month((int) (short) 10, year33);
        int i36 = month35.getMonth();
        Year year39 = new Year((int) (short) 1);
        boolean b40 = year39.isLeap();
        month35.setMonth((int) (short) 10, year39);
        int i42 = month35.getMonthSize();
        boolean b43 = month35.isValid();
        boolean b44 = month35.increment();
        try {
            day9.setDay(31, month35);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test264");
        Date date3 = new Date((int) (byte) 1, 1, 13);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test265");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        boolean b5 = date3.equals((java.lang.Object) (-1));
        Year year6 = date3.getYear();
        Year year7 = date3.getYear();
        java.lang.String str8 = date3.toString();
        date3.printDate();
        date3.printDate();
        date3.printDate();
    }

    @Test
    public void test266() throws Throwable {
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
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test267");
        try {
            Date date3 = new Date((-1), 5, (int) (byte) -1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test268");
        try {
            Date date3 = new Date((int) '#', (int) (short) -1, 10);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test269");
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
        try {
            Day day16 = new Day((int) (byte) 0, month15);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test270() throws Throwable {
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
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test271");
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
        boolean b18 = month16.isValid();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test272");
        Year year2 = new Year(1);
        boolean b3 = year2.isLeap();
        boolean b4 = year2.isLeap();
        Month month5 = new Month((int) (short) 1, year2);
        int i6 = month5.getMonth();
    }

    @Test
    public void test273() throws Throwable {
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
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test274");
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
        boolean b14 = day10.isValid();
        boolean b15 = day10.isValid();
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test275");
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
        Month month24 = null;
        try {
            day7.setDay(0, month24);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test276");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Month month7 = date3.getMonth();
        int i8 = month7.getMonthSize();
        int i9 = month7.getMonthSize();
        boolean b10 = month7.isValid();
        boolean b11 = month7.increment();
        boolean b13 = month7.equals((java.lang.Object) "hi!");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test277");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b5 = month4.increment();
        boolean b6 = month4.increment();
        boolean b7 = month4.increment();
        Date date11 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year12 = date11.getYear();
        boolean b14 = date11.equals((java.lang.Object) "hi!");
        Month month15 = date11.getMonth();
        Day day16 = date11.getDay();
        Date date17 = Nextday.nextDay(date11);
        boolean b18 = month4.equals((java.lang.Object) date17);
    }

    @Test
    public void test278() throws Throwable {
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
    public void test279() throws Throwable {
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
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test280");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        Year year8 = date3.getYear();
        Date date9 = Nextday.nextDay(date3);
        Month month10 = date9.getMonth();
        date9.increment();
        Date date12 = Nextday.nextDay(date9);
    }

    @Test
    public void test281() throws Throwable {
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
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test282");
        Year year3 = new Year(1);
        boolean b4 = year3.isLeap();
        boolean b5 = year3.isLeap();
        java.lang.Object obj6 = new java.lang.Object();
        boolean b7 = year3.equals(obj6);
        boolean b8 = year3.isValid();
        Month month9 = new Month((int) (byte) 10, year3);
        int i10 = month9.getMonth();
        boolean b11 = month9.increment();
        try {
            Day day12 = new Day((int) (byte) 100, month9);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test283");
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
        Year year24 = new Year(1);
        boolean b25 = year24.isValid();
        boolean b26 = year24.isLeap();
        int i27 = year24.getYear();
        Month month28 = new Month((int) (byte) 1, year24);
        try {
            month7.setMonth(0, year24);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test284");
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
        year1.setYear((int) (short) -1);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test285");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year5 = date4.getYear();
        boolean b7 = date4.equals((java.lang.Object) "hi!");
        java.lang.String str8 = date4.toString();
        boolean b10 = date4.equals((java.lang.Object) (short) 100);
        Year year11 = date4.getYear();
        try {
            Month month12 = new Month(13, year11);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test286() throws Throwable {
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
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test287");
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
        int i25 = day11.getDay();
        boolean b26 = day11.increment();
        int i27 = day11.getDay();
    }

    @Test
    public void test288() throws Throwable {
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
    public void test289() throws Throwable {
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
    public void test290() throws Throwable {
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
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test291");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.printDate();
        Year year8 = date3.getYear();
        date3.increment();
        Year year10 = date3.getYear();
        java.lang.String str11 = date3.toString();
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test292");
        Date date3 = new Date(11, 13, 32);
    }

    @Test
    public void test293() throws Throwable {
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
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test294");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year5 = date4.getYear();
        boolean b7 = date4.equals((java.lang.Object) "hi!");
        date4.printDate();
        date4.printDate();
        Month month10 = date4.getMonth();
        Month month11 = date4.getMonth();
        Day day12 = new Day(3, month11);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test295");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date4 = Nextday.nextDay(date3);
        Day day5 = date4.getDay();
        Year year6 = date4.getYear();
        Month month7 = date4.getMonth();
        Year year8 = date4.getYear();
        boolean b9 = year8.increment();
        boolean b10 = year8.isValid();
    }

    @Test
    public void test296() throws Throwable {
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
    public void test297() throws Throwable {
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
    public void test298() throws Throwable {
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
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test299");
        Year year1 = new Year(11);
        Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year6 = date5.getYear();
        boolean b8 = date5.equals((java.lang.Object) "hi!");
        Month month9 = date5.getMonth();
        date5.printDate();
        java.lang.String str11 = date5.toString();
        Month month12 = date5.getMonth();
        int i13 = month12.getMonthSize();
        boolean b14 = year1.equals((java.lang.Object) month12);
        int i15 = year1.getYear();
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test300");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isLeap();
        int i5 = year2.getYear();
        boolean b6 = year2.isLeap();
        Month month7 = new Month((int) (byte) 1, year2);
        int i8 = month7.getMonthSize();
        boolean b9 = month7.increment();
        Year year12 = new Year(1);
        boolean b13 = year12.isValid();
        boolean b14 = year12.isLeap();
        int i15 = year12.getYear();
        boolean b16 = year12.isLeap();
        boolean b17 = year12.isLeap();
        try {
            month7.setMonth(33, year12);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test301");
        try {
            Date date3 = new Date((int) '4', 11, 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test302() throws Throwable {
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
    public void test303() throws Throwable {
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
    public void test304() throws Throwable {
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
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test305");
        try {
            Date date3 = new Date((int) (short) 100, (int) (short) 0, (int) (short) 10);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test306");
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
        boolean b24 = year22.isLeap();
        boolean b25 = year22.increment();
    }

    @Test
    public void test307() throws Throwable {
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
    public void test308() throws Throwable {
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
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test309");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isValid();
        int i5 = year2.getYear();
        year2.setYear((int) (byte) -1);
        boolean b8 = year2.isValid();
        try {
            Month month9 = new Month(100, year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test310() throws Throwable {
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
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test311");
        try {
            Date date3 = new Date((-1), (int) (short) 10, (int) (byte) 10);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test312");
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
        int i17 = day14.getDay();
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test313");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        boolean b5 = date3.equals((java.lang.Object) (-1));
        Year year7 = new Year(1);
        boolean b8 = year7.isValid();
        boolean b9 = year7.isLeap();
        int i10 = year7.getYear();
        boolean b11 = year7.isLeap();
        boolean b12 = year7.isLeap();
        boolean b13 = date3.equals((java.lang.Object) b12);
        Year year14 = date3.getYear();
        boolean b15 = year14.isValid();
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test314");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isLeap();
        int i4 = year1.getYear();
        boolean b5 = year1.isLeap();
        java.lang.Object obj6 = null;
        boolean b7 = year1.equals(obj6);
        boolean b8 = year1.isValid();
    }

    @Test
    public void test315() throws Throwable {
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
    public void test316() throws Throwable {
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
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test317");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        Year year5 = date3.getYear();
        boolean b6 = year5.isValid();
    }

    @Test
    public void test318() throws Throwable {
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
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test319");
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
        boolean b18 = month15.increment();
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test320");
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
        boolean b15 = month7.isValid();
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test321");
        Year year1 = new Year((int) (byte) 100);
        boolean b2 = year1.isValid();
        boolean b3 = year1.increment();
        year1.setYear((int) '4');
        boolean b6 = year1.isValid();
        boolean b7 = year1.isLeap();
        boolean b8 = year1.isValid();
        boolean b9 = year1.isLeap();
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test322");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b6 = month4.equals((java.lang.Object) 10L);
        int i7 = month4.getMonth();
        Year year10 = new Year(1);
        boolean b11 = year10.isLeap();
        int i12 = year10.getYear();
        boolean b14 = year10.equals((java.lang.Object) 1);
        boolean b15 = year10.isValid();
        boolean b16 = year10.isLeap();
        try {
            month4.setMonth((int) (byte) 0, year10);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test323() throws Throwable {
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
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test324");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Month month7 = date3.getMonth();
        date3.printDate();
        java.lang.String str9 = date3.toString();
        Year year10 = date3.getYear();
        int i11 = year10.getYear();
        int i12 = year10.getYear();
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test325");
        Year year3 = new Year(1);
        boolean b4 = year3.isLeap();
        boolean b5 = year3.isLeap();
        Month month6 = new Month((int) (short) 1, year3);
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
        Month month23 = date10.getMonth();
        boolean b24 = year3.equals((java.lang.Object) month23);
        try {
            Day day25 = new Day((int) (short) 100, month23);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test326");
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
        boolean b22 = day7.isValid();
        Date date27 = new Date(10, (int) (byte) 10, (int) (short) 1);
        date27.printDate();
        Year year29 = date27.getYear();
        Date date30 = Nextday.nextDay(date27);
        Date date31 = Nextday.nextDay(date27);
        date31.printDate();
        Month month33 = date31.getMonth();
        try {
            day7.setDay(101, month33);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test327");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.printDate();
        date3.printDate();
        date3.printDate();
        Month month10 = date3.getMonth();
        Day day11 = date3.getDay();
        boolean b12 = day11.isValid();
    }

    @Test
    public void test328() throws Throwable {
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
    public void test329() throws Throwable {
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
    public void test330() throws Throwable {
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
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test331");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        date3.printDate();
        Year year5 = date3.getYear();
        date3.printDate();
        java.lang.String str7 = date3.toString();
        java.lang.String str8 = date3.toString();
        date3.increment();
    }

    @Test
    public void test332() throws Throwable {
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
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test333");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isValid();
        boolean b4 = year1.isLeap();
        boolean b5 = year1.isLeap();
        int i6 = year1.getYear();
        boolean b7 = year1.increment();
        boolean b8 = year1.increment();
        boolean b9 = year1.increment();
        boolean b10 = year1.increment();
        boolean b11 = year1.isValid();
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test334");
        Year year1 = new Year(11);
        year1.setYear((int) ' ');
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test335");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isValid();
        boolean b4 = year1.isLeap();
        boolean b5 = year1.isLeap();
        int i6 = year1.getYear();
        int i7 = year1.getYear();
        boolean b8 = year1.isValid();
        boolean b9 = year1.isValid();
    }

    @Test
    public void test336() throws Throwable {
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
    public void test337() throws Throwable {
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
    public void test338() throws Throwable {
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
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test339");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.increment();
        boolean b5 = year2.increment();
        boolean b6 = year2.isLeap();
        year2.setYear(11);
        boolean b9 = year2.isLeap();
        int i10 = year2.getYear();
        Month month11 = new Month(11, year2);
        Year year13 = null;
        try {
            month11.setMonth((int) '#', year13);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test340() throws Throwable {
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
    public void test341() throws Throwable {
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
    public void test342() throws Throwable {
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
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test343");
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
        boolean b17 = month15.increment();
    }

    @Test
    public void test344() throws Throwable {
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
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test345");
        Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year6 = date5.getYear();
        boolean b8 = date5.equals((java.lang.Object) "hi!");
        Month month9 = date5.getMonth();
        boolean b10 = month9.increment();
        boolean b11 = month9.increment();
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
        int i27 = month21.getMonth();
        boolean b28 = month9.equals((java.lang.Object) month21);
        int i29 = month9.getMonth();
        Day day30 = new Day(1, month9);
        Day day31 = new Day(31, month9);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test346");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        Year year8 = date3.getYear();
        Date date9 = Nextday.nextDay(date3);
        Month month10 = date3.getMonth();
        Year year11 = date3.getYear();
        boolean b12 = year11.increment();
    }

    @Test
    public void test347() throws Throwable {
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
    public void test348() throws Throwable {
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
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test349");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date5 = Nextday.nextDay(date4);
        Day day6 = date5.getDay();
        Year year7 = date5.getYear();
        Year year8 = date5.getYear();
        Year year9 = date5.getYear();
        try {
            Month month10 = new Month(52, year9);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test350");
        try {
            Date date3 = new Date((int) (byte) 100, 11, (int) (short) 10);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test351() throws Throwable {
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
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test352");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        int i5 = month4.getMonth();
        Year year8 = new Year((int) (short) 1);
        boolean b9 = year8.isLeap();
        month4.setMonth((int) (short) 10, year8);
        int i11 = month4.getMonthSize();
        int i12 = month4.getMonth();
        Year year15 = new Year((int) (short) 1);
        boolean b16 = year15.isLeap();
        year15.setYear(31);
        boolean b19 = year15.increment();
        year15.setYear((int) (short) 10);
        boolean b22 = year15.isValid();
        month4.setMonth((int) (short) 10, year15);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test353");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.increment();
        Date date8 = Nextday.nextDay(date3);
        Date date9 = Nextday.nextDay(date8);
        Month month10 = date8.getMonth();
        Month month11 = date8.getMonth();
        boolean b12 = month11.isValid();
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
        Date date29 = Nextday.nextDay(date17);
        Year year30 = date17.getYear();
        try {
            month11.setMonth((int) (short) -1, year30);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test354");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        date3.increment();
    }

    @Test
    public void test355() throws Throwable {
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
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test356");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        date3.increment();
        Date date6 = Nextday.nextDay(date3);
        Year year7 = date6.getYear();
        year7.setYear((int) (byte) 10);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test357");
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
        date11.printDate();
    }

    @Test
    public void test358() throws Throwable {
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
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test359");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date4 = Nextday.nextDay(date3);
        date3.printDate();
        java.lang.String str6 = date3.toString();
        Day day7 = date3.getDay();
        date3.printDate();
        date3.increment();
        Day day10 = date3.getDay();
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test360");
        try {
            Date date3 = new Date(28, (int) (short) 0, 1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test361() throws Throwable {
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
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test362");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        Year year9 = new Year((int) (byte) 100);
        int i10 = year9.getYear();
        boolean b11 = date3.equals((java.lang.Object) year9);
        Year year12 = date3.getYear();
        Month month13 = date3.getMonth();
        Day day14 = date3.getDay();
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test363");
        Year year1 = new Year(4);
        boolean b2 = year1.increment();
        boolean b3 = year1.increment();
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test364");
        try {
            Date date3 = new Date((int) ' ', 101, 31);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test365");
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
        java.lang.Object obj19 = null;
        boolean b20 = day17.equals(obj19);
    }

    @Test
    public void test366() throws Throwable {
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
    public void test367() throws Throwable {
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
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test368");
        Year year3 = new Year((int) (byte) 100);
        boolean b4 = year3.isValid();
        Month month5 = new Month((int) (short) 10, year3);
        int i6 = month5.getMonth();
        Day day7 = new Day(30, month5);
        int i8 = day7.getDay();
        boolean b9 = day7.increment();
        java.lang.Object obj10 = null;
        boolean b11 = day7.equals(obj10);
        boolean b12 = day7.increment();
        int i13 = day7.getDay();
    }

    @Test
    public void test369() throws Throwable {
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
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test370");
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
        int i15 = day9.getDay();
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test371");
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
        boolean b17 = day15.isValid();
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test372");
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
        java.lang.String str18 = date14.toString();
    }

    @Test
    public void test373() throws Throwable {
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
    public void test374() throws Throwable {
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
    public void test375() throws Throwable {
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
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test376");
        Date date3 = new Date((int) (byte) 1, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test377() throws Throwable {
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
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test378");
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
        int i16 = month15.getMonth();
        boolean b17 = month15.isValid();
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test379");
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
        date4.printDate();
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test380");
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
        Year year15 = new Year(1);
        boolean b16 = year15.isValid();
        boolean b17 = year15.isValid();
        boolean b18 = year15.isLeap();
        boolean b19 = year15.isLeap();
        int i20 = year15.getYear();
        boolean b21 = year15.increment();
        boolean b22 = year15.increment();
        boolean b24 = year15.equals((java.lang.Object) "10/10/1");
        int i25 = year15.getYear();
        boolean b26 = month8.equals((java.lang.Object) year15);
        Day day27 = new Day(5, month8);
        int i28 = month8.getMonth();
        Year year31 = new Year(1);
        boolean b32 = year31.isValid();
        boolean b33 = year31.isValid();
        boolean b34 = year31.isLeap();
        boolean b35 = year31.increment();
        boolean b36 = year31.increment();
        int i37 = year31.getYear();
        boolean b38 = year31.isValid();
        try {
            month8.setMonth(28, year31);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test381() throws Throwable {
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
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test382");
        try {
            Date date3 = new Date(30, 30, 11);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test383() throws Throwable {
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
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test384");
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
        boolean b23 = day9.increment();
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test385");
        Year year1 = new Year((int) (byte) 100);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isValid();
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test386");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isLeap();
        int i4 = year1.getYear();
        boolean b5 = year1.increment();
        Date date9 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year10 = date9.getYear();
        date9.printDate();
        Year year12 = date9.getYear();
        Day day13 = date9.getDay();
        Month month14 = date9.getMonth();
        boolean b15 = year1.equals((java.lang.Object) date9);
        boolean b16 = year1.isLeap();
        Year year19 = new Year((int) (byte) 100);
        int i20 = year19.getYear();
        int i21 = year19.getYear();
        Month month22 = new Month((int) (short) 1, year19);
        year19.setYear(31);
        boolean b25 = year19.increment();
        boolean b26 = year1.equals((java.lang.Object) year19);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test387");
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
        Date date21 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year22 = date21.getYear();
        boolean b24 = date21.equals((java.lang.Object) "hi!");
        Day day25 = date21.getDay();
        Month month26 = date21.getMonth();
        date21.printDate();
        Day day28 = date21.getDay();
        boolean b29 = day28.increment();
        Year year32 = new Year((int) (byte) 100);
        boolean b33 = year32.isValid();
        Month month34 = new Month((int) (short) 10, year32);
        boolean b36 = month34.equals((java.lang.Object) 10L);
        int i37 = month34.getMonth();
        boolean b38 = month34.isValid();
        boolean b39 = month34.isValid();
        boolean b40 = month34.isValid();
        boolean b41 = month34.increment();
        boolean b42 = day28.equals((java.lang.Object) month34);
        try {
            day16.setDay(0, month34);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test388() throws Throwable {
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
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test389");
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
        boolean b24 = month4.isValid();
    }

    @Test
    public void test390() throws Throwable {
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
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test391");
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
        java.lang.String str14 = date10.toString();
    }

    @Test
    public void test392() throws Throwable {
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
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test393");
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
        Date date20 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year21 = date20.getYear();
        boolean b23 = date20.equals((java.lang.Object) "hi!");
        java.lang.String str24 = date20.toString();
        Year year26 = new Year((int) (byte) 100);
        int i27 = year26.getYear();
        boolean b28 = date20.equals((java.lang.Object) year26);
        Month month29 = date20.getMonth();
        try {
            day15.setDay((int) ' ', month29);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test394() throws Throwable {
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
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test395");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date5 = Nextday.nextDay(date4);
        date4.increment();
        date4.increment();
        date4.increment();
        Year year9 = date4.getYear();
        Month month10 = new Month((int) (byte) 1, year9);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test396");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        Year year8 = date3.getYear();
        Date date9 = Nextday.nextDay(date3);
        Date date10 = Nextday.nextDay(date9);
        Year year11 = date9.getYear();
        boolean b12 = year11.isValid();
        boolean b13 = year11.isValid();
    }

    @Test
    public void test397() throws Throwable {
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
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test398");
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
        date3.printDate();
    }

    @Test
    public void test399() throws Throwable {
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
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test400");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Date date7 = Nextday.nextDay(date3);
        date7.increment();
    }

    @Test
    public void test401() throws Throwable {
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
    public void test402() throws Throwable {
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
    public void test403() throws Throwable {
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
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test404");
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
        int i20 = month19.getMonth();
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test405");
        try {
            Date date3 = new Date(52, (int) '4', 30);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test406");
        Year year1 = null;
        try {
            Month month2 = new Month((int) (byte) 100, year1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test407");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b5 = year2.increment();
        int i6 = year2.getYear();
        Year year9 = new Year((int) (byte) 100);
        boolean b10 = year9.isValid();
        Month month11 = new Month((int) (short) 10, year9);
        boolean b12 = month11.increment();
        boolean b13 = month11.increment();
        boolean b14 = month11.isValid();
        boolean b15 = year2.equals((java.lang.Object) b14);
        boolean b16 = year2.isValid();
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test408");
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
        boolean b20 = day7.increment();
        boolean b21 = day7.isValid();
        boolean b22 = day7.increment();
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test409");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        date3.increment();
        date3.printDate();
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test410");
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
        Year year13 = new Year(1);
        boolean b14 = year13.isValid();
        boolean b15 = year13.isValid();
        boolean b16 = year13.isValid();
        boolean b17 = year13.isValid();
        int i18 = year13.getYear();
        Month month19 = new Month((int) (short) 10, year13);
        boolean b20 = year13.isValid();
        Year year22 = new Year(11);
        boolean b23 = year13.equals((java.lang.Object) year22);
        boolean b24 = year13.isLeap();
        boolean b25 = year1.equals((java.lang.Object) b24);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test411");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b6 = month4.equals((java.lang.Object) 10L);
        boolean b7 = month4.isValid();
        boolean b8 = month4.increment();
        int i9 = month4.getMonthSize();
        int i10 = month4.getMonthSize();
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test412");
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
        boolean b32 = year1.isLeap();
    }

    @Test
    public void test413() throws Throwable {
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
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test414");
        try {
            Date date3 = new Date((int) (short) 100, (int) (byte) -1, (int) (byte) 100);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test415");
        Date date3 = new Date((int) (byte) 1, 30, (int) (short) 100);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test416");
        Year year1 = new Year(33);
        boolean b2 = year1.isLeap();
        year1.setYear(33);
    }

    @Test
    public void test417() throws Throwable {
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
    public void test418() throws Throwable {
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
    public void test419() throws Throwable {
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
    public void test420() throws Throwable {
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
    public void test421() throws Throwable {
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
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test422");
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
        int i17 = day16.getDay();
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test423");
        try {
            Date date3 = new Date(100, (int) (short) 100, 32);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test424");
        Year year1 = new Year(1);
        boolean b2 = year1.isLeap();
        boolean b3 = year1.isLeap();
        boolean b4 = year1.increment();
        java.lang.Object obj5 = null;
        boolean b6 = year1.equals(obj5);
        int i7 = year1.getYear();
        boolean b8 = year1.isLeap();
        boolean b9 = year1.increment();
    }

    @Test
    public void test425() throws Throwable {
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
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test426");
        try {
            Date date3 = new Date(28, (int) (short) 10, (int) (byte) -1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test427() throws Throwable {
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
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test428");
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
        try {
            Day day20 = new Day((-1), month17);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test429");
        Year year2 = new Year(1);
        boolean b3 = year2.isLeap();
        int i4 = year2.getYear();
        boolean b5 = year2.isValid();
        int i6 = year2.getYear();
        year2.setYear((int) (short) 100);
        try {
            Month month9 = new Month((int) (short) -1, year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test430() throws Throwable {
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
    public void test431() throws Throwable {
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
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test432");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        date3.printDate();
        Year year5 = date3.getYear();
        Date date6 = Nextday.nextDay(date3);
        Day day7 = date6.getDay();
        int i8 = day7.getDay();
        boolean b9 = day7.isValid();
        boolean b10 = day7.increment();
        int i11 = day7.getDay();
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test433");
        Year year1 = new Year(28);
    }

    @Test
    public void test434() throws Throwable {
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
    public void test435() throws Throwable {
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
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test436");
        try {
            Date date3 = new Date(0, (-1), 101);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test437");
        try {
            Date date3 = new Date((int) (byte) 10, 0, 30);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test438");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date4 = Nextday.nextDay(date3);
        Day day5 = date4.getDay();
        Year year6 = date4.getYear();
        Month month7 = date4.getMonth();
        boolean b8 = month7.increment();
        boolean b9 = month7.increment();
        Year year13 = new Year(1);
        boolean b14 = year13.isValid();
        boolean b15 = year13.isValid();
        boolean b16 = year13.isValid();
        boolean b17 = year13.isValid();
        int i18 = year13.getYear();
        Month month19 = new Month((int) (short) 10, year13);
        year13.setYear((-1));
        try {
            month7.setMonth((-1), year13);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test439() throws Throwable {
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
    public void test440() throws Throwable {
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
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test441");
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
            Day day16 = new Day((int) (byte) 100, month13);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test442");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Month month7 = date3.getMonth();
        Day day8 = date3.getDay();
        Year year9 = date3.getYear();
        Day day10 = date3.getDay();
        boolean b11 = day10.increment();
    }

    @Test
    public void test443() throws Throwable {
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
    public void test444() throws Throwable {
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
    public void test445() throws Throwable {
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
    public void test446() throws Throwable {
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
    public void test447() throws Throwable {
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
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test448");
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
        Date date32 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year33 = date32.getYear();
        boolean b35 = date32.equals((java.lang.Object) "hi!");
        java.lang.String str36 = date32.toString();
        Year year37 = date32.getYear();
        Date date38 = Nextday.nextDay(date32);
        Month month39 = date38.getMonth();
        date38.printDate();
        date38.printDate();
        Date date42 = Nextday.nextDay(date38);
        Year year43 = date42.getYear();
        int i44 = year43.getYear();
        boolean b45 = year43.isValid();
        year43.setYear((int) (short) 100);
        year43.setYear((-1));
        Month month50 = new Month(1, year43);
        try {
            month15.setMonth(30, year43);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test449() throws Throwable {
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
    public void test450() throws Throwable {
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
    public void test451() throws Throwable {
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
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test452");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isValid();
        boolean b5 = year2.isValid();
        boolean b6 = year2.isValid();
        int i7 = year2.getYear();
        boolean b8 = year2.increment();
        boolean b9 = year2.increment();
        boolean b10 = year2.increment();
        boolean b11 = year2.increment();
        year2.setYear((int) (byte) 100);
        Month month14 = new Month((int) (short) 1, year2);
        boolean b15 = month14.isValid();
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test453");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.printDate();
        Year year8 = date3.getYear();
        date3.printDate();
        Date date10 = Nextday.nextDay(date3);
        date10.printDate();
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test454");
        Year year1 = null;
        try {
            Month month2 = new Month(33, year1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test455");
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
        Year year17 = date10.getYear();
    }

    @Test
    public void test456() throws Throwable {
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
    public void test457() throws Throwable {
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
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test458");
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
        date3.increment();
    }

    @Test
    public void test459() throws Throwable {
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
    public void test460() throws Throwable {
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
    public void test461() throws Throwable {
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
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test462");
        Year year1 = new Year(1);
        boolean b2 = year1.isLeap();
        int i3 = year1.getYear();
        year1.setYear(100);
        year1.setYear((int) '4');
        int i8 = year1.getYear();
        year1.setYear(12);
        Year year14 = new Year(1);
        boolean b15 = year14.isValid();
        boolean b16 = year14.isLeap();
        int i17 = year14.getYear();
        boolean b18 = year14.isLeap();
        Month month19 = new Month((int) (byte) 1, year14);
        Day day20 = new Day(31, month19);
        boolean b21 = day20.isValid();
        boolean b22 = day20.increment();
        boolean b23 = year1.equals((java.lang.Object) day20);
        Date date27 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year28 = date27.getYear();
        boolean b30 = date27.equals((java.lang.Object) "hi!");
        java.lang.String str31 = date27.toString();
        Year year32 = date27.getYear();
        Date date33 = Nextday.nextDay(date27);
        Month month34 = date27.getMonth();
        Year year35 = date27.getYear();
        Year year37 = new Year(1);
        boolean b38 = year37.isValid();
        int i39 = year37.getYear();
        year37.setYear(100);
        boolean b42 = year35.equals((java.lang.Object) 100);
        boolean b43 = year35.increment();
        boolean b44 = year1.equals((java.lang.Object) b43);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test463");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.increment();
        date3.printDate();
        Year year9 = date3.getYear();
        date3.increment();
        Year year11 = date3.getYear();
        date3.printDate();
        date3.printDate();
    }

    @Test
    public void test464() throws Throwable {
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
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test465");
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
        boolean b24 = day7.isValid();
        Year year28 = new Year((int) (byte) 100);
        java.lang.Object obj29 = new java.lang.Object();
        boolean b30 = year28.equals(obj29);
        Date date34 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year35 = date34.getYear();
        boolean b37 = date34.equals((java.lang.Object) "hi!");
        Month month38 = date34.getMonth();
        boolean b39 = year28.equals((java.lang.Object) date34);
        Date date40 = Nextday.nextDay(date34);
        Month month41 = date40.getMonth();
        Day day42 = new Day(11, month41);
        boolean b43 = month41.increment();
        try {
            day7.setDay(100, month41);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test466() throws Throwable {
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
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test467");
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
        boolean b15 = month5.isValid();
        int i16 = month5.getMonthSize();
        Day day17 = new Day(3, month5);
        int i18 = month5.getMonth();
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test468");
        try {
            Date date3 = new Date((int) (short) 10, (int) (byte) 100, (int) '#');
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test469");
        Year year3 = new Year((int) (byte) 100);
        boolean b4 = year3.isValid();
        Month month5 = new Month((int) (short) 10, year3);
        boolean b6 = month5.increment();
        int i7 = month5.getMonthSize();
        boolean b8 = month5.isValid();
        Day day9 = new Day(10, month5);
        boolean b10 = day9.isValid();
    }

    @Test
    public void test470() throws Throwable {
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
    public void test471() throws Throwable {
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
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test472");
        Year year2 = new Year((int) (short) 1);
        boolean b3 = year2.isLeap();
        boolean b4 = year2.isLeap();
        boolean b5 = year2.increment();
        Month month6 = new Month((int) (short) 1, year2);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test473");
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
        int i12 = month8.getMonth();
        boolean b13 = month8.isValid();
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test474");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Day day7 = date3.getDay();
        Year year8 = date3.getYear();
        Month month9 = date3.getMonth();
        boolean b10 = month9.increment();
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test475");
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
        boolean b25 = month16.increment();
    }

    @Test
    public void test476() throws Throwable {
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
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test477");
        try {
            Date date3 = new Date(31, (int) (byte) 100, 10);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test478() throws Throwable {
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
    public void test479() throws Throwable {
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
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test480");
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
        boolean b15 = day14.increment();
    }

    @Test
    public void test481() throws Throwable {
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
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test482");
        try {
            Date date3 = new Date(30, 100, 101);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test483");
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
        boolean b20 = year1.isLeap();
        java.lang.Object obj21 = null;
        boolean b22 = year1.equals(obj21);
    }

    @Test
    public void test484() throws Throwable {
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
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test485");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b5 = month4.increment();
        int i6 = month4.getMonthSize();
        boolean b7 = month4.isValid();
        Year year10 = new Year((int) (short) 1);
        boolean b11 = year10.isLeap();
        year10.setYear(31);
        boolean b14 = year10.increment();
        year10.setYear((int) (short) 10);
        try {
            month4.setMonth(97, year10);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test486");
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
        Year year19 = new Year(10);
        month13.setMonth(10, year19);
        Year year24 = new Year((int) (byte) 100);
        boolean b25 = year24.isValid();
        Month month26 = new Month((int) (short) 10, year24);
        boolean b28 = month26.equals((java.lang.Object) 10L);
        boolean b29 = month26.isValid();
        int i30 = month26.getMonthSize();
        int i31 = month26.getMonth();
        Year year34 = new Year(1);
        boolean b35 = year34.isValid();
        boolean b36 = year34.isLeap();
        int i37 = year34.getYear();
        boolean b38 = year34.isLeap();
        Month month39 = new Month((int) (byte) 1, year34);
        int i40 = month39.getMonthSize();
        int i41 = month39.getMonthSize();
        int i42 = month39.getMonthSize();
        boolean b43 = month39.isValid();
        int i44 = month39.getMonth();
        boolean b45 = month26.equals((java.lang.Object) i44);
        Year year47 = new Year(1);
        boolean b48 = year47.isLeap();
        boolean b49 = year47.isLeap();
        java.lang.Object obj50 = new java.lang.Object();
        boolean b51 = year47.equals(obj50);
        boolean b52 = year47.increment();
        boolean b53 = month26.equals((java.lang.Object) year47);
        try {
            month13.setMonth((int) (short) 0, year47);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test487");
        Year year3 = new Year(1);
        boolean b4 = year3.isValid();
        boolean b5 = year3.isLeap();
        int i6 = year3.getYear();
        boolean b7 = year3.isLeap();
        Month month8 = new Month((int) (byte) 1, year3);
        Day day9 = new Day(31, month8);
        int i10 = month8.getMonthSize();
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test488");
        try {
            Date date3 = new Date((-1), 11, (int) (short) 100);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test489() throws Throwable {
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
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test490");
        try {
            Date date3 = new Date(102, (int) (byte) -1, 100);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test491");
        Date date4 = new Date((int) (short) 10, 11, (int) (short) 100);
        Month month5 = date4.getMonth();
        int i6 = month5.getMonthSize();
        try {
            Day day7 = new Day(53, month5);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test492");
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
        Year year21 = null;
        try {
            month4.setMonth((int) (byte) -1, year21);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test493");
        Date date3 = new Date(1, (int) (short) 10, (int) '4');
    }

    @Test
    public void test494() throws Throwable {
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
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test495");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        date3.printDate();
        Year year5 = date3.getYear();
        date3.printDate();
        java.lang.String str7 = date3.toString();
        java.lang.String str8 = date3.toString();
        Year year9 = date3.getYear();
    }

    @Test
    public void test496() throws Throwable {
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
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test497");
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
        Month month23 = date18.getMonth();
        Date date24 = Nextday.nextDay(date18);
        Year year25 = date24.getYear();
        int i26 = year25.getYear();
    }

    @Test
    public void test498() throws Throwable {
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
    public void test499() throws Throwable {
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
    public void test500() throws Throwable {
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

