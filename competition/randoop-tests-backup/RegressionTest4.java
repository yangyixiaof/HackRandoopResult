import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
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
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test002");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.increment();
        date3.printDate();
        Year year9 = date3.getYear();
        Year year10 = date3.getYear();
        year10.setYear(33);
        boolean b13 = year10.isValid();
    }

    @Test
    public void test003() throws Throwable {
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
    public void test004() throws Throwable {
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
    public void test005() throws Throwable {
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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test006");
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
        boolean b28 = day7.isValid();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test007");
        try {
            Date date3 = new Date(2, 34, (int) (short) 100);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
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
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test009");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isValid();
        boolean b5 = year2.isValid();
        boolean b6 = year2.isValid();
        int i7 = year2.getYear();
        Month month8 = new Month((int) (short) 1, year2);
        int i9 = month8.getMonth();
        boolean b10 = month8.increment();
    }

    @Test
    public void test010() throws Throwable {
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
    public void test011() throws Throwable {
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
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test012");
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
        Date date14 = Nextday.nextDay(date3);
        Day day15 = date3.getDay();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test013");
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
        date3.increment();
    }

    @Test
    public void test014() throws Throwable {
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
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test015");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.increment();
        Date date8 = Nextday.nextDay(date3);
        Date date9 = Nextday.nextDay(date8);
        date8.increment();
        Date date11 = Nextday.nextDay(date8);
        Month month12 = date8.getMonth();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test016");
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
        java.lang.String str14 = date3.toString();
        Day day15 = date3.getDay();
        Year year19 = new Year((int) (byte) 100);
        boolean b20 = year19.isValid();
        Month month21 = new Month((int) (short) 10, year19);
        int i22 = month21.getMonth();
        Year year25 = new Year((int) (short) 1);
        boolean b26 = year25.isLeap();
        month21.setMonth((int) (short) 10, year25);
        int i28 = month21.getMonth();
        int i29 = month21.getMonth();
        int i30 = month21.getMonth();
        try {
            day15.setDay(35, month21);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test017() throws Throwable {
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
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test018");
        try {
            Date date3 = new Date(12, 53, (int) (short) 10);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test019");
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
        year1.setYear(2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test020");
        Year year2 = new Year(1);
        boolean b3 = year2.isLeap();
        int i4 = year2.getYear();
        boolean b6 = year2.equals((java.lang.Object) 1);
        boolean b7 = year2.isValid();
        boolean b8 = year2.isLeap();
        year2.setYear(31);
        Month month11 = new Month(11, year2);
        Year year14 = new Year((int) (short) 1);
        boolean b15 = year14.isLeap();
        year14.setYear(31);
        boolean b18 = year14.increment();
        Date date22 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year23 = date22.getYear();
        boolean b25 = date22.equals((java.lang.Object) "hi!");
        date22.increment();
        date22.printDate();
        boolean b28 = year14.equals((java.lang.Object) date22);
        boolean b29 = year14.isValid();
        java.lang.Object obj30 = null;
        boolean b31 = year14.equals(obj30);
        year14.setYear((int) (short) -1);
        boolean b34 = year14.isValid();
        try {
            month11.setMonth((int) (short) 0, year14);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test021");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        int i4 = year2.getYear();
        int i5 = year2.getYear();
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
        int i22 = month21.getMonth();
        boolean b23 = year2.equals((java.lang.Object) i22);
        try {
            Month month24 = new Month((int) '#', year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test022");
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
        boolean b28 = day11.isValid();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test023");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year5 = date4.getYear();
        boolean b7 = date4.equals((java.lang.Object) "hi!");
        Month month8 = date4.getMonth();
        int i9 = month8.getMonthSize();
        boolean b10 = month8.increment();
        Day day11 = new Day(2, month8);
        int i12 = day11.getDay();
        boolean b13 = day11.isValid();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test024");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.printDate();
        date3.printDate();
        date3.printDate();
        Month month10 = date3.getMonth();
        Day day11 = date3.getDay();
        boolean b12 = day11.increment();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test025");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        Year year8 = date3.getYear();
        Date date9 = Nextday.nextDay(date3);
        Month month10 = date3.getMonth();
        Year year11 = date3.getYear();
        Year year13 = new Year(1);
        boolean b14 = year13.isValid();
        int i15 = year13.getYear();
        year13.setYear(100);
        boolean b18 = year11.equals((java.lang.Object) 100);
        boolean b19 = year11.increment();
        boolean b20 = year11.isLeap();
        int i21 = year11.getYear();
    }

    @Test
    public void test026() throws Throwable {
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
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test027");
        Date date3 = new Date(11, 4, (int) '#');
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test028");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        date3.printDate();
        Year year6 = date3.getYear();
        Day day7 = date3.getDay();
        Month month8 = date3.getMonth();
        Year year9 = date3.getYear();
        int i10 = year9.getYear();
        year9.setYear(4);
        boolean b13 = year9.isValid();
        boolean b14 = year9.isValid();
    }

    @Test
    public void test029() throws Throwable {
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
    public void test030() throws Throwable {
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
    public void test031() throws Throwable {
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
    public void test032() throws Throwable {
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
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test033");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        Day day8 = date3.getDay();
        Date date9 = Nextday.nextDay(date3);
    }

    @Test
    public void test034() throws Throwable {
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
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test035");
        Year year1 = new Year((int) (short) 100);
        boolean b2 = year1.increment();
        boolean b4 = year1.equals((java.lang.Object) "10/10/1");
        boolean b5 = year1.isLeap();
        boolean b6 = year1.increment();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test036");
        Month month1 = null;
        try {
            Day day2 = new Day(34, month1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test037() throws Throwable {
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
    public void test038() throws Throwable {
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
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test039");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Day day7 = date3.getDay();
        int i8 = day7.getDay();
        Year year12 = new Year((int) (byte) 100);
        boolean b13 = year12.isValid();
        Month month14 = new Month((int) (short) 10, year12);
        boolean b16 = month14.equals((java.lang.Object) 10L);
        boolean b17 = month14.isValid();
        int i18 = month14.getMonthSize();
        day7.setDay(3, month14);
        boolean b20 = day7.increment();
        boolean b21 = day7.increment();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test040");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        Year year5 = date3.getYear();
        Year year6 = date3.getYear();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test041");
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
        Date date39 = Nextday.nextDay(date27);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test042");
        Year year3 = new Year(1);
        boolean b4 = year3.isValid();
        boolean b5 = year3.increment();
        boolean b6 = year3.increment();
        boolean b7 = year3.isLeap();
        int i8 = year3.getYear();
        Month month9 = new Month(1, year3);
        int i10 = year3.getYear();
        Month month11 = new Month((int) (byte) 10, year3);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test043");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        boolean b9 = date3.equals((java.lang.Object) (short) 100);
        Date date10 = Nextday.nextDay(date3);
        java.lang.String str11 = date3.toString();
        Year year12 = date3.getYear();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test044");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        date3.printDate();
        Year year6 = date3.getYear();
        boolean b7 = year6.increment();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test045");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Day day7 = date3.getDay();
        Month month8 = date3.getMonth();
        date3.printDate();
        java.lang.String str10 = date3.toString();
        date3.increment();
        Date date12 = Nextday.nextDay(date3);
        date12.printDate();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test046");
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
        date4.increment();
        Date date18 = Nextday.nextDay(date4);
    }

    @Test
    public void test047() throws Throwable {
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
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test048");
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
        boolean b18 = day7.equals((java.lang.Object) 1);
        boolean b19 = day7.isValid();
        boolean b20 = day7.increment();
        int i21 = day7.getDay();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test049");
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
        boolean b17 = day16.increment();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test050");
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
        boolean b14 = month11.increment();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test051");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.printDate();
        date3.printDate();
        java.lang.String str9 = date3.toString();
        date3.printDate();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test052");
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
        Month month15 = date10.getMonth();
    }

    @Test
    public void test053() throws Throwable {
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
    public void test054() throws Throwable {
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
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test055");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Day day7 = date3.getDay();
        Year year8 = date3.getYear();
        boolean b9 = year8.increment();
        year8.setYear(5);
        boolean b12 = year8.isLeap();
        boolean b13 = year8.increment();
        Year year16 = new Year((int) (short) 100);
        boolean b17 = year16.isValid();
        Month month18 = new Month(12, year16);
        boolean b19 = month18.isValid();
        boolean b20 = year8.equals((java.lang.Object) month18);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test056");
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
        date3.printDate();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test057");
        try {
            Date date3 = new Date(30, 52, 14);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test058() throws Throwable {
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
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test059");
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
        int i16 = day15.getDay();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test060");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.increment();
        date3.printDate();
        date3.printDate();
        Date date10 = Nextday.nextDay(date3);
        date10.printDate();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test061");
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
        date3.increment();
        Year year17 = date3.getYear();
    }

    @Test
    public void test062() throws Throwable {
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
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test063");
        try {
            Date date3 = new Date(3, (int) ' ', (int) (byte) 100);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test064() throws Throwable {
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
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test065");
        Year year3 = new Year(1);
        boolean b4 = year3.isValid();
        boolean b5 = year3.isLeap();
        int i6 = year3.getYear();
        boolean b7 = year3.isLeap();
        Month month8 = new Month((int) (byte) 1, year3);
        Day day9 = new Day(31, month8);
        boolean b10 = month8.increment();
        int i11 = month8.getMonth();
        Year year14 = new Year(1);
        boolean b15 = year14.isLeap();
        int i16 = year14.getYear();
        year14.setYear(100);
        boolean b19 = year14.isValid();
        int i20 = year14.getYear();
        Date date24 = new Date(10, (int) (byte) 10, (int) (short) 1);
        boolean b26 = date24.equals((java.lang.Object) (-1));
        Year year28 = new Year(1);
        boolean b29 = year28.isValid();
        boolean b30 = year28.isLeap();
        int i31 = year28.getYear();
        boolean b32 = year28.isLeap();
        boolean b33 = year28.isLeap();
        boolean b34 = date24.equals((java.lang.Object) b33);
        Date date35 = Nextday.nextDay(date24);
        date35.printDate();
        Month month37 = date35.getMonth();
        boolean b38 = year14.equals((java.lang.Object) month37);
        try {
            month8.setMonth((int) (short) 100, year14);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test066() throws Throwable {
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
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test067");
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
        year26.setYear((int) '#');
        boolean b29 = year26.isValid();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test068");
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
        Year year19 = date15.getYear();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test069");
        Year year3 = new Year((int) (byte) 100);
        boolean b4 = year3.isValid();
        Month month5 = new Month((int) (short) 10, year3);
        int i6 = month5.getMonth();
        Year year9 = new Year((int) (short) 1);
        boolean b10 = year9.isLeap();
        month5.setMonth((int) (short) 10, year9);
        int i12 = month5.getMonth();
        Day day13 = new Day(12, month5);
        int i14 = month5.getMonth();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test070");
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
        Year year21 = new Year((int) (byte) 100);
        boolean b22 = year21.isValid();
        Month month23 = new Month((int) (short) 10, year21);
        boolean b25 = month23.equals((java.lang.Object) 10L);
        boolean b26 = month23.isValid();
        int i27 = month23.getMonthSize();
        boolean b28 = year2.equals((java.lang.Object) i27);
        boolean b29 = year2.isLeap();
        int i30 = year2.getYear();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test071");
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
        Year year20 = date3.getYear();
    }

    @Test
    public void test072() throws Throwable {
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
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test073");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        try {
            Month month4 = new Month(0, year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test074");
        Year year1 = new Year((int) (short) 100);
        boolean b2 = year1.isValid();
        int i3 = year1.getYear();
        boolean b4 = year1.increment();
    }

    @Test
    public void test075() throws Throwable {
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
    public void test076() throws Throwable {
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
    public void test077() throws Throwable {
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
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test078");
        Year year1 = new Year(12);
        boolean b2 = year1.isLeap();
        int i3 = year1.getYear();
        boolean b4 = year1.increment();
        int i5 = year1.getYear();
    }

    @Test
    public void test079() throws Throwable {
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
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test080");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date4 = Nextday.nextDay(date3);
        date3.printDate();
        java.lang.String str6 = date3.toString();
        Day day7 = date3.getDay();
        date3.increment();
        Date date9 = Nextday.nextDay(date3);
        Date date10 = Nextday.nextDay(date3);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test081");
        try {
            Date date3 = new Date((int) (short) 100, (int) (short) -1, 2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test082() throws Throwable {
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
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test083");
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
        Month month15 = new Month(11, year9);
        boolean b16 = month15.increment();
        int i17 = month15.getMonth();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test084");
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
        java.lang.Object obj26 = null;
        boolean b27 = month25.equals(obj26);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test085");
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
        date3.printDate();
        Year year17 = date3.getYear();
        java.lang.String str18 = date3.toString();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test086");
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
        Year year15 = new Year(1);
        boolean b16 = year15.isValid();
        boolean b17 = year15.increment();
        boolean b18 = year15.isLeap();
        boolean b19 = year15.isValid();
        boolean b20 = date13.equals((java.lang.Object) year15);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test087");
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
        boolean b16 = month15.increment();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test088");
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
        int i22 = month20.getMonth();
        boolean b23 = month20.increment();
        boolean b24 = month20.increment();
        boolean b25 = month20.isValid();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test089");
        try {
            Date date3 = new Date((int) (byte) 1, 35, (int) 'a');
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test090");
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
        int i28 = month7.getMonth();
        Year year30 = new Year(1);
        boolean b31 = year30.isValid();
        year30.setYear((int) (short) 100);
        boolean b34 = month7.equals((java.lang.Object) year30);
    }

    @Test
    public void test091() throws Throwable {
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
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test092");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        java.lang.String str5 = date3.toString();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test093");
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
        Year year21 = new Year((int) (byte) 100);
        boolean b22 = year21.isValid();
        Month month23 = new Month((int) (short) 10, year21);
        boolean b25 = month23.equals((java.lang.Object) 10L);
        int i26 = month23.getMonth();
        try {
            day7.setDay(0, month23);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test094");
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
        boolean b16 = day14.increment();
        Year year20 = new Year((int) (byte) 100);
        boolean b21 = year20.isValid();
        Month month22 = new Month((int) (short) 10, year20);
        boolean b23 = month22.increment();
        boolean b24 = month22.isValid();
        boolean b26 = month22.equals((java.lang.Object) 1);
        int i27 = month22.getMonthSize();
        int i28 = month22.getMonthSize();
        Year year31 = new Year(1);
        boolean b32 = year31.isValid();
        boolean b33 = year31.isLeap();
        int i34 = year31.getYear();
        boolean b35 = year31.isLeap();
        Month month36 = new Month((int) (byte) 1, year31);
        int i37 = month36.getMonthSize();
        boolean b38 = month36.increment();
        boolean b39 = month36.isValid();
        boolean b40 = month22.equals((java.lang.Object) month36);
        boolean b41 = month36.isValid();
        try {
            day14.setDay((int) (short) 0, month36);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test095() throws Throwable {
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
    public void test096() throws Throwable {
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
    public void test097() throws Throwable {
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
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test098");
        Year year2 = new Year(1);
        boolean b3 = year2.isLeap();
        int i4 = year2.getYear();
        boolean b5 = year2.isValid();
        boolean b6 = year2.isLeap();
        boolean b7 = year2.isValid();
        try {
            Month month8 = new Month((int) (byte) -1, year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test099() throws Throwable {
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
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test100");
        Date date3 = new Date((int) (short) 10, 11, (int) (short) 100);
        Year year4 = date3.getYear();
        Day day5 = date3.getDay();
        int i6 = day5.getDay();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test101");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year5 = date4.getYear();
        boolean b7 = date4.equals((java.lang.Object) "hi!");
        java.lang.String str8 = date4.toString();
        Year year9 = date4.getYear();
        Date date10 = Nextday.nextDay(date4);
        Day day11 = date10.getDay();
        date10.printDate();
        Month month13 = date10.getMonth();
        try {
            Day day14 = new Day((int) ' ', month13);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test102() throws Throwable {
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
    public void test103() throws Throwable {
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
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test104");
        try {
            Date date3 = new Date((int) ' ', 13, 5);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test105");
        try {
            Date date3 = new Date((int) (short) 100, (int) (byte) 100, (int) (byte) 10);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test106");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b6 = month4.equals((java.lang.Object) 10L);
        Year year8 = new Year(1);
        int i9 = year8.getYear();
        boolean b10 = month4.equals((java.lang.Object) i9);
        boolean b11 = month4.increment();
        boolean b12 = month4.increment();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test107");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Month month7 = date3.getMonth();
        Month month8 = date3.getMonth();
        int i9 = month8.getMonth();
        boolean b10 = month8.isValid();
        int i11 = month8.getMonthSize();
        int i12 = month8.getMonth();
        boolean b13 = month8.increment();
    }

    @Test
    public void test108() throws Throwable {
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
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test109");
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
        java.lang.Object obj17 = null;
        boolean b18 = year1.equals(obj17);
        year1.setYear((int) (short) -1);
        boolean b21 = year1.isValid();
        boolean b22 = year1.isValid();
    }

    @Test
    public void test110() throws Throwable {
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
    public void test111() throws Throwable {
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
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test112");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year5 = date4.getYear();
        boolean b7 = date4.equals((java.lang.Object) "hi!");
        java.lang.String str8 = date4.toString();
        Year year9 = date4.getYear();
        Date date10 = Nextday.nextDay(date4);
        Month month11 = date10.getMonth();
        date10.printDate();
        date10.increment();
        Year year14 = date10.getYear();
        int i15 = year14.getYear();
        try {
            Month month16 = new Month(35, year14);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test113() throws Throwable {
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
    public void test114() throws Throwable {
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
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test115");
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
        Day day15 = date14.getDay();
        java.lang.String str16 = date14.toString();
        date14.printDate();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test116");
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
        Year year23 = new Year(1);
        boolean b24 = year23.isValid();
        boolean b25 = year23.isLeap();
        int i26 = year23.getYear();
        boolean b27 = year23.isLeap();
        Month month28 = new Month((int) (byte) 1, year23);
        int i29 = month28.getMonthSize();
        int i30 = month28.getMonthSize();
        int i31 = month28.getMonthSize();
        boolean b32 = month28.isValid();
        int i33 = month28.getMonth();
        boolean b34 = month28.increment();
        Year year37 = new Year(1);
        boolean b38 = year37.isLeap();
        boolean b39 = year37.isLeap();
        java.lang.Object obj40 = new java.lang.Object();
        boolean b41 = year37.equals(obj40);
        boolean b42 = year37.increment();
        month28.setMonth(1, year37);
        Day day44 = new Day(3, month28);
        Year year47 = new Year((int) (short) 100);
        boolean b48 = year47.isValid();
        Month month49 = new Month(12, year47);
        boolean b50 = month28.equals((java.lang.Object) year47);
        Date date54 = new Date((int) (short) 10, 11, (int) (short) 100);
        Day day55 = date54.getDay();
        Date date56 = Nextday.nextDay(date54);
        Month month57 = date54.getMonth();
        boolean b58 = month28.equals((java.lang.Object) month57);
        boolean b59 = month28.increment();
        try {
            day17.setDay(97, month28);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test117");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        boolean b9 = date3.equals((java.lang.Object) (short) 100);
        Year year10 = date3.getYear();
        Date date11 = Nextday.nextDay(date3);
        Day day12 = date3.getDay();
        date3.increment();
        Month month14 = date3.getMonth();
        boolean b15 = month14.increment();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test118");
        Year year1 = new Year((int) (byte) 100);
        Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
        boolean b6 = year1.equals((java.lang.Object) 10);
        boolean b7 = year1.isLeap();
        boolean b8 = year1.isLeap();
        year1.setYear(12);
    }

    @Test
    public void test119() throws Throwable {
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
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test120");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.increment();
        Date date8 = Nextday.nextDay(date3);
        date3.printDate();
        date3.printDate();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test121");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isValid();
        boolean b4 = year1.isLeap();
        int i5 = year1.getYear();
        boolean b6 = year1.increment();
        int i7 = year1.getYear();
        boolean b8 = year1.isLeap();
        year1.setYear((int) (short) 100);
        boolean b11 = year1.isLeap();
        Date date15 = new Date(10, (int) (byte) 10, (int) (short) 1);
        boolean b17 = date15.equals((java.lang.Object) (-1));
        Year year19 = new Year(1);
        boolean b20 = year19.isValid();
        boolean b21 = year19.isLeap();
        int i22 = year19.getYear();
        boolean b23 = year19.isLeap();
        boolean b24 = year19.isLeap();
        boolean b25 = date15.equals((java.lang.Object) b24);
        Date date26 = Nextday.nextDay(date15);
        Day day27 = date26.getDay();
        date26.printDate();
        java.lang.String str29 = date26.toString();
        boolean b30 = year1.equals((java.lang.Object) str29);
        boolean b31 = year1.isValid();
    }

    @Test
    public void test122() throws Throwable {
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
    public void test123() throws Throwable {
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
    public void test124() throws Throwable {
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
    public void test125() throws Throwable {
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
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test126");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isValid();
        boolean b4 = year1.isValid();
        boolean b5 = year1.isValid();
        int i6 = year1.getYear();
        boolean b7 = year1.increment();
        boolean b8 = year1.increment();
        year1.setYear(34);
    }

    @Test
    public void test127() throws Throwable {
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
    public void test128() throws Throwable {
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
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test129");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        int i5 = month4.getMonth();
        boolean b6 = month4.isValid();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test130");
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
        int i24 = year17.getYear();
        boolean b25 = year17.increment();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test131");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.printDate();
        date3.printDate();
        date3.printDate();
        date3.printDate();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test132");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.printDate();
        Year year8 = date3.getYear();
        Year year10 = new Year(1);
        boolean b11 = year10.isValid();
        boolean b12 = year10.isValid();
        boolean b13 = year10.isLeap();
        boolean b14 = year10.increment();
        int i15 = year10.getYear();
        boolean b16 = date3.equals((java.lang.Object) year10);
        date3.increment();
        date3.printDate();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test133");
        Year year1 = new Year(1);
        boolean b2 = year1.isLeap();
        boolean b3 = year1.isLeap();
        boolean b4 = year1.increment();
        java.lang.Object obj5 = null;
        boolean b6 = year1.equals(obj5);
        int i7 = year1.getYear();
        int i8 = year1.getYear();
        boolean b9 = year1.increment();
        boolean b10 = year1.isValid();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test134");
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
        Year year17 = new Year((int) (byte) 100);
        Month month18 = new Month((int) (short) 1, year17);
        boolean b19 = month18.isValid();
        int i20 = month18.getMonthSize();
        boolean b21 = month18.increment();
        boolean b22 = month18.increment();
        boolean b23 = date10.equals((java.lang.Object) month18);
        Year year24 = date10.getYear();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test135");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date4 = Nextday.nextDay(date3);
        date4.printDate();
        Month month6 = date4.getMonth();
    }

    @Test
    public void test136() throws Throwable {
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
    public void test137() throws Throwable {
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
    public void test138() throws Throwable {
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
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test139");
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
        int i21 = month13.getMonthSize();
        int i22 = month13.getMonth();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test140");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Month month7 = date3.getMonth();
        date3.printDate();
        java.lang.String str9 = date3.toString();
        Year year10 = date3.getYear();
        Date date11 = Nextday.nextDay(date3);
        date3.increment();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test141");
        Year year1 = new Year(102);
        year1.setYear(28);
        year1.setYear(5);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test142");
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
        Year year24 = new Year((int) (short) 1);
        boolean b25 = year24.isLeap();
        year24.setYear((int) (short) -1);
        int i28 = year24.getYear();
        boolean b29 = year24.isValid();
        int i30 = year24.getYear();
        try {
            month8.setMonth(34, year24);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test143");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.increment();
        date3.printDate();
        Year year9 = date3.getYear();
        Year year10 = date3.getYear();
        Year year11 = date3.getYear();
        date3.printDate();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test144");
        Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date6 = Nextday.nextDay(date5);
        Year year9 = new Year((int) (byte) 100);
        boolean b10 = year9.isValid();
        Month month11 = new Month((int) (short) 10, year9);
        boolean b12 = month11.increment();
        int i13 = month11.getMonthSize();
        boolean b14 = month11.isValid();
        boolean b15 = date6.equals((java.lang.Object) month11);
        Year year18 = new Year(1);
        boolean b19 = year18.isValid();
        boolean b20 = year18.increment();
        boolean b21 = year18.increment();
        boolean b22 = year18.increment();
        month11.setMonth(1, year18);
        boolean b24 = month11.increment();
        Year year27 = new Year(1);
        boolean b28 = year27.isValid();
        boolean b29 = year27.isValid();
        boolean b30 = year27.isLeap();
        boolean b31 = year27.isLeap();
        int i32 = year27.getYear();
        int i33 = year27.getYear();
        month11.setMonth(3, year27);
        Month month35 = new Month(5, year27);
        try {
            Month month36 = new Month(97, year27);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test145");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isValid();
        boolean b5 = year2.isLeap();
        boolean b6 = year2.isLeap();
        int i7 = year2.getYear();
        int i8 = year2.getYear();
        try {
            Month month9 = new Month(52, year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test146");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.increment();
        java.lang.String str8 = date3.toString();
        date3.printDate();
        date3.increment();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test147");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year5 = date4.getYear();
        date4.printDate();
        Year year7 = date4.getYear();
        Day day8 = date4.getDay();
        Month month9 = date4.getMonth();
        Year year10 = date4.getYear();
        Month month11 = new Month((int) (short) 10, year10);
        boolean b12 = month11.isValid();
        Year year15 = new Year(1);
        boolean b16 = year15.isValid();
        boolean b17 = year15.isLeap();
        int i18 = year15.getYear();
        boolean b19 = year15.increment();
        try {
            month11.setMonth((int) 'a', year15);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test148");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b6 = month4.equals((java.lang.Object) 10L);
        boolean b7 = month4.isValid();
        boolean b8 = month4.isValid();
        int i9 = month4.getMonthSize();
        java.lang.Object obj10 = null;
        boolean b11 = month4.equals(obj10);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test149");
        try {
            Date date3 = new Date(31, 31, (int) (short) 1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test150() throws Throwable {
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
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test151");
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
        Date date14 = Nextday.nextDay(date3);
        Year year15 = date14.getYear();
    }

    @Test
    public void test152() throws Throwable {
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
    public void test153() throws Throwable {
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
    public void test154() throws Throwable {
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
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test155");
        Year year3 = new Year(1);
        boolean b4 = year3.isLeap();
        int i5 = year3.getYear();
        boolean b7 = year3.equals((java.lang.Object) 1);
        year3.setYear(32);
        boolean b10 = year3.isLeap();
        boolean b11 = year3.increment();
        Month month12 = new Month((int) (short) 1, year3);
        boolean b13 = month12.isValid();
        Day day14 = new Day(5, month12);
        boolean b15 = day14.isValid();
    }

    @Test
    public void test156() throws Throwable {
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
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test157");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Day day7 = date3.getDay();
        Month month8 = date3.getMonth();
        date3.printDate();
        java.lang.String str10 = date3.toString();
        Day day11 = date3.getDay();
        boolean b12 = day11.increment();
        int i13 = day11.getDay();
        int i14 = day11.getDay();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test158");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.printDate();
        Year year8 = date3.getYear();
        int i9 = year8.getYear();
        boolean b10 = year8.isLeap();
    }

    @Test
    public void test159() throws Throwable {
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
    public void test160() throws Throwable {
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
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test161");
        Year year2 = new Year((-1));
        try {
            Month month3 = new Month(33, year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test162");
        Year year1 = new Year((int) (byte) -1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isValid();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test163");
        Year year1 = new Year((int) (short) 100);
        boolean b2 = year1.increment();
        Year year4 = new Year(1);
        boolean b5 = year4.isValid();
        int i6 = year4.getYear();
        year4.setYear(100);
        boolean b9 = year1.equals((java.lang.Object) year4);
        boolean b10 = year4.increment();
        boolean b11 = year4.isValid();
        int i12 = year4.getYear();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test164");
        Year year1 = new Year(11);
        int i2 = year1.getYear();
        year1.setYear(52);
        int i5 = year1.getYear();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test165");
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
        boolean b20 = year1.isValid();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test166");
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
        year26.setYear((int) '#');
        try {
            year26.setYear((int) (short) 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test167() throws Throwable {
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
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test168");
        try {
            Date date3 = new Date(14, 14, 100);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test169");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        Year year8 = date3.getYear();
        Date date9 = Nextday.nextDay(date3);
        date3.printDate();
        Year year11 = date3.getYear();
        Date date12 = Nextday.nextDay(date3);
        Month month13 = date12.getMonth();
        boolean b14 = month13.increment();
    }

    @Test
    public void test170() throws Throwable {
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
    public void test171() throws Throwable {
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
    public void test172() throws Throwable {
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
    public void test173() throws Throwable {
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
    public void test174() throws Throwable {
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
    public void test175() throws Throwable {
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
    public void test176() throws Throwable {
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
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test177");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b5 = month4.increment();
        int i6 = month4.getMonthSize();
        boolean b7 = month4.isValid();
        boolean b8 = month4.increment();
        Date date13 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year14 = date13.getYear();
        boolean b16 = date13.equals((java.lang.Object) "hi!");
        date13.increment();
        date13.printDate();
        Year year19 = date13.getYear();
        month4.setMonth(4, year19);
        int i21 = month4.getMonth();
        Year year25 = new Year((int) (byte) 100);
        boolean b26 = year25.isValid();
        Month month27 = new Month((int) (short) 10, year25);
        try {
            month4.setMonth(0, year25);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test178");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        date3.printDate();
        Date date6 = Nextday.nextDay(date3);
        Month month7 = date3.getMonth();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test179");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.increment();
        boolean b5 = year2.increment();
        boolean b6 = year2.isLeap();
        year2.setYear(11);
        year2.setYear(100);
        try {
            Month month11 = new Month(31, year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test180");
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
        Date date20 = Nextday.nextDay(date3);
        date3.increment();
        date3.printDate();
    }

    @Test
    public void test181() throws Throwable {
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
    public void test182() throws Throwable {
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
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test183");
        Year year1 = new Year(1);
        boolean b2 = year1.isLeap();
        int i3 = year1.getYear();
        boolean b4 = year1.isValid();
        boolean b5 = year1.isLeap();
        boolean b6 = year1.isValid();
        boolean b7 = year1.isValid();
        boolean b8 = year1.isValid();
    }

    @Test
    public void test184() throws Throwable {
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
    public void test185() throws Throwable {
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
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test186");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b5 = month4.increment();
        boolean b6 = month4.increment();
        Date date10 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year11 = date10.getYear();
        date10.printDate();
        boolean b13 = month4.equals((java.lang.Object) date10);
        date10.increment();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test187");
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
        boolean b24 = month4.increment();
    }

    @Test
    public void test188() throws Throwable {
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
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test189");
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
        date4.printDate();
        Date date16 = Nextday.nextDay(date4);
        Year year18 = new Year(1);
        boolean b19 = year18.isValid();
        boolean b20 = year18.isValid();
        boolean b21 = year18.isLeap();
        int i22 = year18.getYear();
        int i23 = year18.getYear();
        boolean b24 = year18.increment();
        boolean b25 = year18.increment();
        boolean b26 = year18.isValid();
        boolean b27 = date4.equals((java.lang.Object) b26);
    }

    @Test
    public void test190() throws Throwable {
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
    public void test191() throws Throwable {
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
    public void test192() throws Throwable {
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
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test193");
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
        java.lang.String str17 = date3.toString();
        Year year18 = date3.getYear();
    }

    @Test
    public void test194() throws Throwable {
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
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test195");
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
        Year year17 = new Year(1);
        boolean b18 = year17.isValid();
        boolean b19 = year17.isValid();
        boolean b20 = year17.isLeap();
        int i21 = year17.getYear();
        boolean b22 = year17.increment();
        Month month23 = new Month(1, year17);
        try {
            month7.setMonth(35, year17);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test196() throws Throwable {
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
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test197");
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
        java.lang.String str15 = date13.toString();
    }

    @Test
    public void test198() throws Throwable {
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
    public void test199() throws Throwable {
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
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test200");
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
        Date date32 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year33 = date32.getYear();
        boolean b35 = date32.equals((java.lang.Object) "hi!");
        java.lang.String str36 = date32.toString();
        Day day37 = date32.getDay();
        Month month38 = date32.getMonth();
        boolean b39 = month38.increment();
        try {
            day11.setDay(31, month38);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test201");
        try {
            Date date3 = new Date(32, 0, 14);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test202");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year5 = date4.getYear();
        boolean b7 = date4.equals((java.lang.Object) "hi!");
        java.lang.String str8 = date4.toString();
        Year year9 = date4.getYear();
        Date date10 = Nextday.nextDay(date4);
        Month month11 = date10.getMonth();
        date10.printDate();
        date10.printDate();
        Date date14 = Nextday.nextDay(date10);
        Year year15 = date14.getYear();
        int i16 = year15.getYear();
        boolean b17 = year15.isValid();
        year15.setYear((int) (short) 100);
        year15.setYear((-1));
        Month month22 = new Month(1, year15);
        Year year25 = new Year((int) (byte) 100);
        boolean b26 = year25.isValid();
        Month month27 = new Month((int) (short) 10, year25);
        int i28 = month27.getMonth();
        boolean b29 = month27.increment();
        Year year31 = new Year(31);
        boolean b32 = year31.isValid();
        boolean b33 = year31.isValid();
        boolean b34 = month27.equals((java.lang.Object) b33);
        boolean b35 = year15.equals((java.lang.Object) month27);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test203");
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
        date14.printDate();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test204");
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
        java.lang.String str23 = date13.toString();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test205");
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
        boolean b21 = year16.increment();
        boolean b22 = year16.isValid();
    }

    @Test
    public void test206() throws Throwable {
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
    public void test207() throws Throwable {
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
    public void test208() throws Throwable {
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
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test209");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isLeap();
        int i4 = year1.getYear();
        boolean b5 = year1.isLeap();
        boolean b6 = year1.isValid();
        int i7 = year1.getYear();
        boolean b8 = year1.isValid();
    }

    @Test
    public void test210() throws Throwable {
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
    public void test211() throws Throwable {
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
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test212");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Day day7 = date3.getDay();
        Month month8 = date3.getMonth();
        Day day9 = date3.getDay();
        int i10 = day9.getDay();
        int i11 = day9.getDay();
        int i12 = day9.getDay();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test213");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isValid();
        boolean b5 = year2.isLeap();
        int i6 = year2.getYear();
        boolean b7 = year2.increment();
        Month month8 = new Month(1, year2);
        year2.setYear(102);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test214");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        date3.printDate();
        Year year6 = date3.getYear();
        Day day7 = date3.getDay();
        Month month8 = date3.getMonth();
        Year year9 = date3.getYear();
        boolean b10 = year9.increment();
        boolean b11 = year9.isValid();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test215");
        Date date3 = new Date(2, 10, 10);
        Date date4 = Nextday.nextDay(date3);
        Month month5 = date3.getMonth();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test216");
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
        boolean b23 = year2.isValid();
    }

    @Test
    public void test217() throws Throwable {
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
    public void test218() throws Throwable {
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
    public void test219() throws Throwable {
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
    public void test220() throws Throwable {
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
    public void test221() throws Throwable {
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
    public void test222() throws Throwable {
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
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test223");
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
        int i18 = day17.getDay();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test224");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Day day7 = date3.getDay();
        Month month8 = date3.getMonth();
        Day day9 = date3.getDay();
        boolean b10 = day9.isValid();
        int i11 = day9.getDay();
        boolean b12 = day9.increment();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test225");
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
        Year year21 = new Year((int) (byte) 100);
        boolean b22 = year21.isValid();
        Month month23 = new Month((int) (short) 10, year21);
        boolean b25 = month23.equals((java.lang.Object) 10L);
        int i26 = month23.getMonth();
        boolean b27 = month23.isValid();
        boolean b28 = month23.isValid();
        day16.setDay(10, month23);
    }

    @Test
    public void test226() throws Throwable {
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
    public void test227() throws Throwable {
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
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test228");
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
        Year year18 = date3.getYear();
        Year year19 = date3.getYear();
    }

    @Test
    public void test229() throws Throwable {
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
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test230");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Month month7 = date3.getMonth();
        date3.printDate();
        java.lang.String str9 = date3.toString();
        Day day10 = date3.getDay();
        boolean b11 = day10.isValid();
        Year year13 = new Year(1);
        boolean b14 = year13.increment();
        year13.setYear((int) ' ');
        boolean b17 = day10.equals((java.lang.Object) year13);
        int i18 = year13.getYear();
        boolean b19 = year13.isValid();
        int i20 = year13.getYear();
    }

    @Test
    public void test231() throws Throwable {
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
    public void test232() throws Throwable {
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
    public void test233() throws Throwable {
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
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test234");
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
            Day day25 = new Day((int) '4', month10);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test235() throws Throwable {
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
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test236");
        Year year2 = new Year((int) (short) 1);
        boolean b3 = year2.isLeap();
        year2.setYear((int) (short) -1);
        boolean b6 = year2.isValid();
        int i7 = year2.getYear();
        Month month8 = new Month(4, year2);
    }

    @Test
    public void test237() throws Throwable {
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
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test238");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.increment();
        boolean b4 = year1.increment();
        boolean b5 = year1.isLeap();
        year1.setYear(11);
        year1.setYear(1);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test239");
        Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year6 = date5.getYear();
        date5.printDate();
        Year year8 = date5.getYear();
        Day day9 = date5.getDay();
        Month month10 = date5.getMonth();
        Day day11 = new Day(12, month10);
        boolean b12 = month10.isValid();
        int i13 = month10.getMonth();
        Day day14 = new Day(2, month10);
    }

    @Test
    public void test240() throws Throwable {
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
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test241");
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
        date15.printDate();
        Month month19 = date15.getMonth();
        try {
            Day day20 = new Day((int) 'a', month19);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test242");
        Year year2 = new Year((int) (short) 100);
        boolean b3 = year2.increment();
        Year year5 = new Year(1);
        boolean b6 = year5.isValid();
        int i7 = year5.getYear();
        year5.setYear(100);
        boolean b10 = year2.equals((java.lang.Object) year5);
        boolean b12 = year5.equals((java.lang.Object) (byte) -1);
        boolean b14 = year5.equals((java.lang.Object) 52);
        try {
            Month month15 = new Month(0, year5);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test243() throws Throwable {
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
    public void test244() throws Throwable {
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
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test245");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b6 = month4.equals((java.lang.Object) 10L);
        Year year8 = new Year(1);
        boolean b9 = year8.increment();
        boolean b10 = month4.equals((java.lang.Object) year8);
        boolean b11 = month4.isValid();
        int i12 = month4.getMonthSize();
        Date date17 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year18 = date17.getYear();
        boolean b20 = date17.equals((java.lang.Object) "hi!");
        java.lang.String str21 = date17.toString();
        boolean b23 = date17.equals((java.lang.Object) (short) 100);
        Year year24 = date17.getYear();
        Date date25 = Nextday.nextDay(date17);
        date25.increment();
        java.lang.String str27 = date25.toString();
        Year year28 = date25.getYear();
        month4.setMonth(3, year28);
        boolean b30 = year28.isLeap();
        int i31 = year28.getYear();
        int i32 = year28.getYear();
        year28.setYear(101);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test246");
        Year year1 = new Year((int) (short) 1);
        boolean b2 = year1.isLeap();
        year1.setYear(31);
        boolean b5 = year1.increment();
        year1.setYear((int) (short) 10);
        Year year9 = new Year((int) (short) 1);
        boolean b10 = year9.isLeap();
        boolean b11 = year9.isLeap();
        boolean b12 = year1.equals((java.lang.Object) year9);
        boolean b13 = year1.isValid();
        boolean b14 = year1.isLeap();
    }

    @Test
    public void test247() throws Throwable {
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
    public void test248() throws Throwable {
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
    public void test249() throws Throwable {
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
    public void test250() throws Throwable {
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
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test251");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        date3.printDate();
        Year year5 = date3.getYear();
        Day day6 = date3.getDay();
        Day day7 = date3.getDay();
        Date date8 = Nextday.nextDay(date3);
        Month month9 = date8.getMonth();
        int i10 = month9.getMonth();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test252");
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
        date3.increment();
    }

    @Test
    public void test253() throws Throwable {
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
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test254");
        try {
            Date date3 = new Date(101, 2, 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test255() throws Throwable {
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
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test256");
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
        java.lang.Object obj17 = null;
        boolean b18 = year15.equals(obj17);
    }

    @Test
    public void test257() throws Throwable {
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
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test258");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b5 = month4.increment();
        boolean b6 = month4.isValid();
        Date date11 = new Date((int) (short) 10, 11, (int) (short) 100);
        Year year12 = date11.getYear();
        month4.setMonth((int) (byte) 1, year12);
        Date date17 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year18 = date17.getYear();
        boolean b20 = date17.equals((java.lang.Object) "hi!");
        date17.printDate();
        Year year22 = date17.getYear();
        date17.increment();
        Date date24 = Nextday.nextDay(date17);
        date24.printDate();
        Day day26 = date24.getDay();
        boolean b27 = year12.equals((java.lang.Object) day26);
        boolean b28 = year12.increment();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test259");
        Year year1 = new Year((int) (short) 100);
        boolean b2 = year1.increment();
        Year year4 = new Year(1);
        boolean b5 = year4.isValid();
        int i6 = year4.getYear();
        year4.setYear(100);
        boolean b9 = year1.equals((java.lang.Object) year4);
        boolean b10 = year1.isValid();
        boolean b11 = year1.increment();
    }

    @Test
    public void test260() throws Throwable {
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
    public void test261() throws Throwable {
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
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test262");
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
        boolean b21 = day17.increment();
        int i22 = day17.getDay();
    }

    @Test
    public void test263() throws Throwable {
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
    public void test264() throws Throwable {
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
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test265");
        Year year1 = new Year(11);
        boolean b2 = year1.isLeap();
        boolean b3 = year1.increment();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test266");
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
        Year year20 = new Year(1);
        boolean b21 = year20.isValid();
        boolean b22 = year20.increment();
        boolean b23 = year20.increment();
        boolean b24 = year20.isLeap();
        int i25 = year20.getYear();
        Month month26 = new Month(1, year20);
        boolean b27 = date14.equals((java.lang.Object) 1);
        date14.printDate();
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test267");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        int i5 = month4.getMonth();
        boolean b6 = month4.increment();
        Year year8 = new Year(31);
        boolean b9 = year8.isValid();
        boolean b10 = year8.isValid();
        boolean b11 = month4.equals((java.lang.Object) b10);
        boolean b12 = month4.isValid();
    }

    @Test
    public void test268() throws Throwable {
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
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test269");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.increment();
        java.lang.String str8 = date3.toString();
        date3.printDate();
        Year year10 = date3.getYear();
        java.lang.String str11 = date3.toString();
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test270");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year5 = date4.getYear();
        boolean b7 = date4.equals((java.lang.Object) "hi!");
        Month month8 = date4.getMonth();
        int i9 = month8.getMonthSize();
        int i10 = month8.getMonthSize();
        int i11 = month8.getMonth();
        Day day12 = new Day((int) (short) 1, month8);
        boolean b13 = month8.increment();
    }

    @Test
    public void test271() throws Throwable {
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
    public void test272() throws Throwable {
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
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test273");
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
        boolean b18 = month3.increment();
    }

    @Test
    public void test274() throws Throwable {
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
    public void test275() throws Throwable {
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
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test276");
        Year year3 = new Year(11);
        boolean b4 = year3.increment();
        Month month5 = new Month(3, year3);
        try {
            Day day6 = new Day(102, month5);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test277() throws Throwable {
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
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test278");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date4 = Nextday.nextDay(date3);
        date4.printDate();
        java.lang.String str6 = date4.toString();
        java.lang.String str7 = date4.toString();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test279");
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
        Date date17 = Nextday.nextDay(date10);
    }

    @Test
    public void test280() throws Throwable {
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
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test281");
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
        boolean b20 = day19.isValid();
    }

    @Test
    public void test282() throws Throwable {
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
    public void test283() throws Throwable {
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
    public void test284() throws Throwable {
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
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test285");
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
        boolean b27 = day11.increment();
    }

    @Test
    public void test286() throws Throwable {
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
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test287");
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
        year1.setYear((int) ' ');
        boolean b14 = year1.isLeap();
        year1.setYear((int) (short) 1);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test288");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        Year year8 = date3.getYear();
        Date date9 = Nextday.nextDay(date3);
        Month month10 = date9.getMonth();
        date9.printDate();
        Month month12 = date9.getMonth();
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test289");
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
        int i21 = month20.getMonth();
        java.lang.Object obj22 = null;
        boolean b23 = month20.equals(obj22);
        int i24 = month20.getMonth();
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test290");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.increment();
        year1.setYear(97);
        int i6 = year1.getYear();
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test291");
        Date date3 = new Date(10, 3, 33);
        Year year4 = date3.getYear();
        java.lang.String str5 = date3.toString();
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test292");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        date3.printDate();
        Year year5 = date3.getYear();
        Date date6 = Nextday.nextDay(date3);
        Date date7 = Nextday.nextDay(date3);
        Month month8 = date7.getMonth();
        java.lang.String str9 = date7.toString();
        Day day10 = date7.getDay();
        Year year11 = date7.getYear();
    }

    @Test
    public void test293() throws Throwable {
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
    public void test294() throws Throwable {
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
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test295");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        date3.printDate();
        Year year5 = date3.getYear();
        Date date6 = Nextday.nextDay(date3);
        Day day7 = date6.getDay();
        int i8 = day7.getDay();
        int i9 = day7.getDay();
        int i10 = day7.getDay();
    }

    @Test
    public void test296() throws Throwable {
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
    public void test297() throws Throwable {
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
    public void test298() throws Throwable {
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
    public void test299() throws Throwable {
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
    public void test300() throws Throwable {
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
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test301");
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
        int i20 = year14.getYear();
    }

    @Test
    public void test302() throws Throwable {
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
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test303");
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
        Year year21 = date3.getYear();
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test304");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        date3.printDate();
        Year year5 = date3.getYear();
        Date date6 = Nextday.nextDay(date3);
        Year year7 = date6.getYear();
    }

    @Test
    public void test305() throws Throwable {
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
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test306");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        boolean b9 = date3.equals((java.lang.Object) (short) 100);
        Date date10 = Nextday.nextDay(date3);
        date10.increment();
        Month month12 = date10.getMonth();
        java.lang.String str13 = date10.toString();
        Month month14 = date10.getMonth();
        boolean b15 = month14.increment();
        boolean b16 = month14.increment();
        boolean b17 = month14.isValid();
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test307");
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
        boolean b18 = day7.equals((java.lang.Object) 1);
        boolean b19 = day7.isValid();
        boolean b20 = day7.increment();
        boolean b21 = day7.increment();
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test308");
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
        int i24 = month22.getMonth();
    }

    @Test
    public void test309() throws Throwable {
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
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test310");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year5 = date4.getYear();
        boolean b7 = date4.equals((java.lang.Object) "hi!");
        Month month8 = date4.getMonth();
        int i9 = month8.getMonthSize();
        boolean b11 = month8.equals((java.lang.Object) 0L);
        try {
            Day day12 = new Day(33, month8);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test311() throws Throwable {
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
    public void test312() throws Throwable {
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
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test313");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        Day day8 = date3.getDay();
        Day day9 = date3.getDay();
        boolean b10 = day9.isValid();
        Year year12 = new Year((int) (byte) 100);
        boolean b13 = year12.isValid();
        year12.setYear(52);
        boolean b16 = year12.isLeap();
        boolean b17 = year12.isValid();
        boolean b18 = day9.equals((java.lang.Object) b17);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test314");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        Day day8 = date3.getDay();
        Year year9 = date3.getYear();
        Year year10 = date3.getYear();
        Month month11 = date3.getMonth();
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test315");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.printDate();
        date3.printDate();
        date3.printDate();
        Month month10 = date3.getMonth();
        boolean b11 = month10.isValid();
        boolean b12 = month10.increment();
        boolean b13 = month10.isValid();
        int i14 = month10.getMonthSize();
    }

    @Test
    public void test316() throws Throwable {
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
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test317");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isValid();
        boolean b4 = year1.isValid();
        boolean b5 = year1.isValid();
        boolean b6 = year1.isValid();
        int i7 = year1.getYear();
    }

    @Test
    public void test318() throws Throwable {
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
    public void test319() throws Throwable {
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
    public void test320() throws Throwable {
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
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test321");
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
        try {
            year2.setYear((int) (short) 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test322");
        Year year1 = new Year(1);
        boolean b2 = year1.isLeap();
        int i3 = year1.getYear();
        Year year5 = new Year(1);
        boolean b6 = year5.isValid();
        boolean b7 = year5.isValid();
        boolean b8 = year5.isLeap();
        boolean b9 = year5.increment();
        boolean b10 = year5.increment();
        int i11 = year5.getYear();
        boolean b12 = year1.equals((java.lang.Object) i11);
        boolean b13 = year1.isLeap();
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test323");
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
        int i23 = day7.getDay();
        boolean b24 = day7.increment();
        boolean b25 = day7.increment();
    }

    @Test
    public void test324() throws Throwable {
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
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test325");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Day day7 = date3.getDay();
        Day day8 = date3.getDay();
        boolean b9 = day8.increment();
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test326");
        Year year4 = new Year((int) (byte) 100);
        boolean b5 = year4.isValid();
        Month month6 = new Month((int) (short) 10, year4);
        boolean b7 = month6.increment();
        int i8 = month6.getMonthSize();
        boolean b9 = month6.isValid();
        Day day10 = new Day(10, month6);
        Day day11 = new Day(12, month6);
        boolean b12 = month6.increment();
        int i13 = month6.getMonthSize();
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test327");
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
        year1.setYear(28);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test328");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Month month7 = date3.getMonth();
        Day day8 = date3.getDay();
        Date date9 = Nextday.nextDay(date3);
        Month month10 = date9.getMonth();
    }

    @Test
    public void test329() throws Throwable {
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
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test330");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year5 = date4.getYear();
        boolean b7 = date4.equals((java.lang.Object) "hi!");
        Day day8 = date4.getDay();
        Year year12 = new Year((int) (byte) 100);
        boolean b13 = year12.isValid();
        Month month14 = new Month((int) (short) 10, year12);
        day8.setDay((int) (short) 10, month14);
        Year year18 = new Year(52);
        Month month19 = new Month((int) (short) 10, year18);
        year18.setYear(102);
        boolean b22 = day8.equals((java.lang.Object) year18);
        Month month23 = new Month((int) (byte) 10, year18);
        int i24 = month23.getMonth();
        int i25 = month23.getMonthSize();
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test331");
        Year year2 = new Year(1);
        boolean b3 = year2.isLeap();
        boolean b5 = year2.equals((java.lang.Object) 100.0f);
        year2.setYear(32);
        Month month8 = new Month((int) (byte) 1, year2);
        boolean b9 = year2.increment();
    }

    @Test
    public void test332() throws Throwable {
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
    public void test333() throws Throwable {
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
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test334");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Day day7 = date3.getDay();
        Year year11 = new Year((int) (byte) 100);
        boolean b12 = year11.isValid();
        Month month13 = new Month((int) (short) 10, year11);
        day7.setDay((int) (short) 10, month13);
        boolean b15 = day7.increment();
        boolean b16 = day7.isValid();
        boolean b17 = day7.isValid();
        int i18 = day7.getDay();
        int i19 = day7.getDay();
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test335");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year5 = date4.getYear();
        boolean b7 = date4.equals((java.lang.Object) "hi!");
        Month month8 = date4.getMonth();
        date4.printDate();
        java.lang.String str10 = date4.toString();
        Day day11 = date4.getDay();
        date4.increment();
        Year year13 = date4.getYear();
        try {
            Month month14 = new Month(0, year13);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test336() throws Throwable {
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
    public void test337() throws Throwable {
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
    public void test338() throws Throwable {
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
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test339");
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
        year8.setYear(2);
        boolean b30 = year8.increment();
    }

    @Test
    public void test340() throws Throwable {
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
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test341");
        Year year3 = new Year(1);
        boolean b4 = year3.isValid();
        boolean b5 = year3.isLeap();
        int i6 = year3.getYear();
        boolean b7 = year3.isLeap();
        Month month8 = new Month((int) (byte) 1, year3);
        Day day9 = new Day(10, month8);
        int i10 = month8.getMonthSize();
        Year year12 = new Year((int) (byte) 100);
        java.lang.Object obj13 = new java.lang.Object();
        boolean b14 = year12.equals(obj13);
        int i15 = year12.getYear();
        int i16 = year12.getYear();
        year12.setYear(1);
        int i19 = year12.getYear();
        boolean b20 = month8.equals((java.lang.Object) year12);
        Year year24 = new Year((int) (short) -1);
        Month month25 = new Month(10, year24);
        try {
            month8.setMonth((-1), year24);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test342() throws Throwable {
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
    public void test343() throws Throwable {
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
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test344");
        Year year3 = new Year((int) (byte) 100);
        boolean b4 = year3.isValid();
        Month month5 = new Month((int) (short) 10, year3);
        boolean b7 = month5.equals((java.lang.Object) 10L);
        int i8 = month5.getMonth();
        boolean b9 = month5.isValid();
        boolean b10 = month5.isValid();
        Day day11 = new Day(1, month5);
    }

    @Test
    public void test345() throws Throwable {
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
    public void test346() throws Throwable {
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
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test347");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.printDate();
        Year year8 = date3.getYear();
        date3.increment();
        Date date10 = Nextday.nextDay(date3);
        Month month11 = date10.getMonth();
        java.lang.String str12 = date10.toString();
        Year year13 = date10.getYear();
        java.lang.Object obj14 = null;
        boolean b15 = year13.equals(obj14);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test348");
        Year year2 = new Year(1);
        boolean b3 = year2.isLeap();
        boolean b4 = year2.isLeap();
        boolean b5 = year2.increment();
        java.lang.Object obj6 = null;
        boolean b7 = year2.equals(obj6);
        int i8 = year2.getYear();
        int i9 = year2.getYear();
        boolean b10 = year2.increment();
        try {
            Month month11 = new Month(52, year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test349() throws Throwable {
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
    public void test350() throws Throwable {
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
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test351");
        Date date3 = new Date(10, 3, 33);
        Year year4 = date3.getYear();
        Date date5 = Nextday.nextDay(date3);
    }

    @Test
    public void test352() throws Throwable {
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
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test353");
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
        java.lang.String str20 = date3.toString();
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test354");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        boolean b5 = date3.equals((java.lang.Object) (-1));
        java.lang.String str6 = date3.toString();
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test355");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isValid();
        int i4 = year1.getYear();
        year1.setYear((int) (byte) -1);
        Date date10 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date11 = Nextday.nextDay(date10);
        date10.increment();
        date10.increment();
        java.lang.String str14 = date10.toString();
        Month month15 = date10.getMonth();
        boolean b16 = year1.equals((java.lang.Object) date10);
        boolean b17 = year1.isLeap();
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test356");
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
        boolean b22 = year16.increment();
        year16.setYear((int) (byte) 1);
    }

    @Test
    public void test357() throws Throwable {
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
    public void test358() throws Throwable {
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
    public void test359() throws Throwable {
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
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test360");
        try {
            Date date3 = new Date(13, (int) (byte) 100, 52);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test361");
        Year year1 = new Year(101);
        boolean b2 = year1.isValid();
        year1.setYear((int) '#');
        boolean b5 = year1.increment();
    }

    @Test
    public void test362() throws Throwable {
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
    public void test363() throws Throwable {
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
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test364");
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
        boolean b27 = month23.isValid();
    }

    @Test
    public void test365() throws Throwable {
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
    public void test366() throws Throwable {
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
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test367");
        Year year3 = new Year((int) (byte) 100);
        boolean b4 = year3.isValid();
        Month month5 = new Month((int) (short) 10, year3);
        boolean b7 = month5.equals((java.lang.Object) 10L);
        boolean b8 = month5.isValid();
        int i9 = month5.getMonthSize();
        boolean b10 = month5.isValid();
        Day day11 = new Day(31, month5);
        boolean b12 = day11.isValid();
    }

    @Test
    public void test368() throws Throwable {
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
    public void test369() throws Throwable {
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
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test370");
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
        Year year24 = new Year(1);
        boolean b25 = year24.increment();
        int i26 = year24.getYear();
        boolean b27 = year24.increment();
        year24.setYear(12);
        year24.setYear(12);
        Month month32 = new Month(11, year24);
        try {
            month19.setMonth((int) (short) 100, year24);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test371() throws Throwable {
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
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test372");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        Year year8 = date3.getYear();
        Date date9 = Nextday.nextDay(date3);
        Date date10 = Nextday.nextDay(date9);
        java.lang.String str11 = date9.toString();
    }

    @Test
    public void test373() throws Throwable {
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
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test374");
        Year year1 = new Year((int) (short) 100);
        boolean b2 = year1.increment();
        int i3 = year1.getYear();
        Date date7 = new Date((int) (byte) 1, 3, 102);
        java.lang.String str8 = date7.toString();
        Day day9 = date7.getDay();
        boolean b10 = year1.equals((java.lang.Object) day9);
        boolean b11 = year1.isLeap();
    }

    @Test
    public void test375() throws Throwable {
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
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test376");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        java.lang.String str4 = date3.toString();
        java.lang.String str5 = date3.toString();
        date3.printDate();
        java.lang.String str7 = date3.toString();
        Year year10 = new Year((int) (byte) 100);
        java.lang.Object obj11 = new java.lang.Object();
        boolean b12 = year10.equals(obj11);
        Date date16 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year17 = date16.getYear();
        boolean b19 = date16.equals((java.lang.Object) "hi!");
        Month month20 = date16.getMonth();
        boolean b21 = year10.equals((java.lang.Object) date16);
        Date date22 = Nextday.nextDay(date16);
        Month month23 = date22.getMonth();
        Day day24 = new Day(11, month23);
        Year year26 = new Year(1);
        boolean b27 = year26.isValid();
        int i28 = year26.getYear();
        year26.setYear(100);
        year26.setYear((int) ' ');
        boolean b33 = month23.equals((java.lang.Object) year26);
        boolean b34 = month23.increment();
        int i35 = month23.getMonthSize();
        boolean b36 = date3.equals((java.lang.Object) i35);
    }

    @Test
    public void test377() throws Throwable {
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
    public void test378() throws Throwable {
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
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test379");
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
        date4.increment();
    }

    @Test
    public void test380() throws Throwable {
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
    public void test381() throws Throwable {
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
    public void test382() throws Throwable {
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
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test383");
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
        date15.printDate();
        java.lang.String str18 = date15.toString();
    }

    @Test
    public void test384() throws Throwable {
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
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test385");
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
        boolean b29 = year1.isValid();
        boolean b30 = year1.increment();
    }

    @Test
    public void test386() throws Throwable {
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
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test387");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Date date7 = Nextday.nextDay(date3);
        date3.increment();
    }

    @Test
    public void test388() throws Throwable {
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
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test389");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.printDate();
        Year year8 = date3.getYear();
        date3.increment();
        Date date10 = Nextday.nextDay(date3);
        Year year11 = date3.getYear();
        Month month12 = date3.getMonth();
        Year year16 = new Year(1);
        boolean b17 = year16.isLeap();
        int i18 = year16.getYear();
        boolean b20 = year16.equals((java.lang.Object) 1);
        boolean b21 = year16.isValid();
        boolean b22 = year16.isLeap();
        year16.setYear(31);
        Month month25 = new Month(11, year16);
        boolean b26 = year16.isLeap();
        month12.setMonth((int) (byte) 10, year16);
        int i28 = month12.getMonthSize();
        int i29 = month12.getMonth();
    }

    @Test
    public void test390() throws Throwable {
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
    public void test391() throws Throwable {
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
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test392");
        Date date3 = new Date(2, (int) (short) 1, (int) 'a');
        Date date4 = Nextday.nextDay(date3);
        java.lang.String str5 = date4.toString();
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test393");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        boolean b9 = date3.equals((java.lang.Object) (short) 100);
        Date date10 = Nextday.nextDay(date3);
        date10.increment();
        Month month12 = date10.getMonth();
        java.lang.String str13 = date10.toString();
        Year year14 = date10.getYear();
        int i15 = year14.getYear();
        boolean b16 = year14.isValid();
    }

    @Test
    public void test394() throws Throwable {
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
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test395");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year5 = date4.getYear();
        boolean b7 = date4.equals((java.lang.Object) "hi!");
        java.lang.String str8 = date4.toString();
        Year year10 = new Year((int) (byte) 100);
        int i11 = year10.getYear();
        boolean b12 = date4.equals((java.lang.Object) year10);
        Month month13 = date4.getMonth();
        Month month14 = date4.getMonth();
        Day day15 = new Day((int) (short) 1, month14);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test396");
        Year year1 = new Year((int) (short) 1);
        boolean b2 = year1.isLeap();
        year1.setYear(3);
        year1.setYear(28);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test397");
        Date date3 = new Date(2, 10, 10);
        date3.printDate();
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test398");
        try {
            Date date3 = new Date(31, (int) (short) 0, (int) (byte) 1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test399");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date4 = Nextday.nextDay(date3);
        date3.printDate();
        Month month6 = date3.getMonth();
        Year year9 = new Year((int) (short) 1);
        boolean b10 = year9.isLeap();
        year9.setYear((int) (short) -1);
        boolean b13 = year9.increment();
        try {
            month6.setMonth((int) 'a', year9);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test400");
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
        Year year26 = new Year(32);
        boolean b27 = year26.isValid();
        boolean b28 = year18.equals((java.lang.Object) year26);
    }

    @Test
    public void test401() throws Throwable {
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
    public void test402() throws Throwable {
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
    public void test403() throws Throwable {
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
    public void test404() throws Throwable {
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
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test405");
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
        date9.printDate();
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test406");
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
        int i13 = year1.getYear();
    }

    @Test
    public void test407() throws Throwable {
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
    public void test408() throws Throwable {
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
    public void test409() throws Throwable {
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
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test410");
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
        Year year21 = new Year((int) (byte) 100);
        boolean b22 = year21.isValid();
        Month month23 = new Month((int) (short) 10, year21);
        int i24 = month23.getMonth();
        Day day25 = new Day(30, month23);
        int i26 = day25.getDay();
        boolean b27 = day25.increment();
        boolean b28 = month12.equals((java.lang.Object) day25);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test411");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        date3.printDate();
        Year year5 = date3.getYear();
        Date date6 = Nextday.nextDay(date3);
        Date date7 = Nextday.nextDay(date3);
        Month month8 = date7.getMonth();
        java.lang.String str9 = date7.toString();
        Day day10 = date7.getDay();
        boolean b11 = day10.increment();
    }

    @Test
    public void test412() throws Throwable {
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
    public void test413() throws Throwable {
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
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test414");
        try {
            Date date3 = new Date(31, (int) (short) 0, 30);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test415() throws Throwable {
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
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test416");
        try {
            Date date3 = new Date((int) '#', 4, (int) (byte) -1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test417");
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
        int i20 = month15.getMonth();
        boolean b21 = month15.increment();
        int i22 = month15.getMonth();
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test418");
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
        java.lang.Object obj15 = null;
        boolean b16 = date13.equals(obj15);
        Month month17 = date13.getMonth();
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test419");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        boolean b9 = date3.equals((java.lang.Object) (short) 100);
        Date date10 = Nextday.nextDay(date3);
        Date date11 = Nextday.nextDay(date10);
        java.lang.String str12 = date10.toString();
        Month month13 = date10.getMonth();
        boolean b14 = month13.isValid();
    }

    @Test
    public void test420() throws Throwable {
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
    public void test421() throws Throwable {
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
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test422");
        Year year1 = new Year(33);
        boolean b2 = year1.isLeap();
        int i3 = year1.getYear();
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test423");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        date3.printDate();
        Year year5 = date3.getYear();
        Day day6 = date3.getDay();
        Day day7 = date3.getDay();
        date3.increment();
        Year year9 = date3.getYear();
        year9.setYear(14);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test424");
        Month month1 = null;
        try {
            Day day2 = new Day((int) (byte) 0, month1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test425");
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
        Year year19 = date18.getYear();
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test426");
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
        boolean b24 = month23.isValid();
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test427");
        Year year1 = new Year(31);
        boolean b2 = year1.isLeap();
    }

    @Test
    public void test428() throws Throwable {
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
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test429");
        Year year1 = null;
        try {
            Month month2 = new Month((int) '4', year1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test430");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        boolean b9 = date3.equals((java.lang.Object) (short) 100);
        Day day10 = date3.getDay();
    }

    @Test
    public void test431() throws Throwable {
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
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test432");
        Year year1 = new Year(3);
        boolean b2 = year1.increment();
        year1.setYear(11);
        boolean b5 = year1.increment();
        int i6 = year1.getYear();
    }

    @Test
    public void test433() throws Throwable {
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
    public void test434() throws Throwable {
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
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test435");
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
        date3.printDate();
        Year year17 = date3.getYear();
        Day day18 = date3.getDay();
    }

    @Test
    public void test436() throws Throwable {
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
    public void test437() throws Throwable {
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
    public void test438() throws Throwable {
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
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test439");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.increment();
        Date date8 = Nextday.nextDay(date3);
        date3.printDate();
        Day day10 = date3.getDay();
        Month month11 = date3.getMonth();
        int i12 = month11.getMonth();
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test440");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        date3.printDate();
        Year year5 = date3.getYear();
        date3.printDate();
        java.lang.String str7 = date3.toString();
        Day day8 = date3.getDay();
        Year year10 = new Year(1);
        boolean b11 = year10.isValid();
        boolean b12 = year10.increment();
        boolean b13 = year10.increment();
        boolean b14 = year10.isLeap();
        year10.setYear(11);
        boolean b17 = year10.isLeap();
        boolean b18 = day8.equals((java.lang.Object) b17);
        Year year22 = new Year((int) (byte) 100);
        boolean b23 = year22.isValid();
        Month month24 = new Month((int) (short) 10, year22);
        int i25 = month24.getMonth();
        Day day26 = new Day(30, month24);
        boolean b27 = month24.increment();
        boolean b28 = month24.increment();
        boolean b29 = month24.isValid();
        boolean b30 = month24.increment();
        boolean b31 = month24.increment();
        boolean b32 = month24.isValid();
        boolean b33 = day8.equals((java.lang.Object) b32);
    }

    @Test
    public void test441() throws Throwable {
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
    public void test442() throws Throwable {
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
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test443");
        Year year2 = new Year(1);
        boolean b3 = year2.isLeap();
        boolean b4 = year2.increment();
        boolean b5 = year2.isValid();
        int i6 = year2.getYear();
        Month month7 = new Month((int) (short) 1, year2);
        int i8 = year2.getYear();
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test444");
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
        java.lang.Object obj22 = null;
        boolean b23 = month20.equals(obj22);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test445");
        Year year3 = new Year((int) (byte) 100);
        boolean b4 = year3.isValid();
        Month month5 = new Month((int) (short) 10, year3);
        boolean b7 = month5.equals((java.lang.Object) 10L);
        boolean b8 = month5.isValid();
        boolean b9 = month5.isValid();
        int i10 = month5.getMonthSize();
        try {
            Day day11 = new Day((int) '4', month5);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test446() throws Throwable {
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
    public void test447() throws Throwable {
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
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test448");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        int i3 = year1.getYear();
        year1.setYear(100);
        year1.setYear((int) ' ');
        boolean b8 = year1.isLeap();
        boolean b9 = year1.isValid();
    }

    @Test
    public void test449() throws Throwable {
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
    public void test450() throws Throwable {
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
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test451");
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
        boolean b15 = year14.isLeap();
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test452");
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
        try {
            Day day28 = new Day((int) ' ', month8);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test453");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b5 = month4.increment();
        int i6 = month4.getMonth();
        int i7 = month4.getMonth();
        int i8 = month4.getMonth();
    }

    @Test
    public void test454() throws Throwable {
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
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test455");
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
        Date date32 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year33 = date32.getYear();
        boolean b35 = date32.equals((java.lang.Object) "hi!");
        date32.printDate();
        date32.printDate();
        Month month38 = date32.getMonth();
        boolean b39 = month38.isValid();
        try {
            day27.setDay((int) (byte) 100, month38);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test456() throws Throwable {
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
    public void test457() throws Throwable {
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
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test458");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        boolean b9 = date3.equals((java.lang.Object) (short) 100);
        Date date10 = Nextday.nextDay(date3);
        Date date11 = Nextday.nextDay(date10);
        java.lang.String str12 = date10.toString();
        Month month13 = date10.getMonth();
        Day day14 = date10.getDay();
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test459");
        Year year1 = new Year(1);
        boolean b2 = year1.isLeap();
        int i3 = year1.getYear();
        Year year5 = new Year(1);
        boolean b6 = year5.isValid();
        boolean b7 = year5.isValid();
        boolean b8 = year5.isLeap();
        boolean b9 = year5.increment();
        boolean b10 = year5.increment();
        int i11 = year5.getYear();
        boolean b12 = year1.equals((java.lang.Object) i11);
        boolean b13 = year1.isValid();
        year1.setYear(32);
        int i16 = year1.getYear();
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
        boolean b39 = year1.equals((java.lang.Object) day26);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test460");
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
        int i27 = day19.getDay();
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test461");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Day day7 = date3.getDay();
        Month month8 = date3.getMonth();
        date3.printDate();
        java.lang.String str10 = date3.toString();
        Day day11 = date3.getDay();
        boolean b12 = day11.increment();
        boolean b13 = day11.increment();
    }

    @Test
    public void test462() throws Throwable {
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
    public void test463() throws Throwable {
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
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test464");
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
        boolean b21 = day7.isValid();
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test465");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        boolean b5 = date3.equals((java.lang.Object) (-1));
        Year year6 = date3.getYear();
        Day day7 = date3.getDay();
        java.lang.String str8 = date3.toString();
        date3.printDate();
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test466");
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
        boolean b38 = year1.increment();
        int i39 = year1.getYear();
    }

    @Test
    public void test467() throws Throwable {
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
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test468");
        Year year1 = new Year(5);
        int i2 = year1.getYear();
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test469");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.increment();
        boolean b4 = year1.increment();
        boolean b5 = year1.isLeap();
        year1.setYear(11);
        boolean b8 = year1.isLeap();
        boolean b9 = year1.increment();
    }

    @Test
    public void test470() throws Throwable {
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
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test471");
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
        Day day17 = new Day(10, month10);
        int i18 = month10.getMonth();
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test472");
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
        boolean b15 = month5.increment();
        int i16 = month5.getMonth();
    }

    @Test
    public void test473() throws Throwable {
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
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test474");
        try {
            Date date3 = new Date(97, 0, 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test475");
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
        Date date15 = Nextday.nextDay(date10);
        java.lang.String str16 = date10.toString();
    }

    @Test
    public void test476() throws Throwable {
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
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test477");
        Date date3 = new Date(10, 5, 29);
    }

    @Test
    public void test478() throws Throwable {
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
    public void test479() throws Throwable {
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
    public void test480() throws Throwable {
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
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test481");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        date3.printDate();
        Year year6 = date3.getYear();
        Day day7 = date3.getDay();
        Month month8 = date3.getMonth();
        Year year9 = date3.getYear();
        int i10 = year9.getYear();
        year9.setYear(4);
        boolean b13 = year9.isValid();
        boolean b14 = year9.increment();
        year9.setYear(102);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test482");
        Month month1 = null;
        try {
            Day day2 = new Day(97, month1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test483");
        Year year1 = new Year(100);
        Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year6 = date5.getYear();
        boolean b8 = date5.equals((java.lang.Object) "hi!");
        date5.increment();
        date5.printDate();
        Year year11 = date5.getYear();
        date5.increment();
        boolean b13 = year1.equals((java.lang.Object) date5);
        Month month14 = date5.getMonth();
        java.lang.Object obj15 = null;
        boolean b16 = month14.equals(obj15);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test484");
        Year year4 = new Year(52);
        Month month5 = new Month((int) (short) 10, year4);
        Month month6 = new Month(5, year4);
        Day day7 = new Day((int) (short) 10, month6);
        int i8 = day7.getDay();
        boolean b9 = day7.increment();
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test485");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        boolean b5 = date3.equals((java.lang.Object) (-1));
        Date date9 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year10 = date9.getYear();
        boolean b12 = date9.equals((java.lang.Object) "hi!");
        Month month13 = date9.getMonth();
        int i14 = month13.getMonthSize();
        boolean b15 = month13.increment();
        boolean b16 = date3.equals((java.lang.Object) b15);
        Date date17 = Nextday.nextDay(date3);
        date3.increment();
        boolean b20 = date3.equals((java.lang.Object) 101);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test486");
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
        Year year27 = new Year((int) (short) 100);
        boolean b28 = year27.isValid();
        Month month29 = new Month(12, year27);
        boolean b30 = month8.equals((java.lang.Object) year27);
        Date date34 = new Date((int) (short) 10, 11, (int) (short) 100);
        Day day35 = date34.getDay();
        Date date36 = Nextday.nextDay(date34);
        Month month37 = date34.getMonth();
        boolean b38 = month8.equals((java.lang.Object) month37);
        int i39 = month8.getMonth();
        int i40 = month8.getMonth();
        Year year43 = new Year((int) (short) 1);
        boolean b44 = year43.isLeap();
        year43.setYear(31);
        boolean b47 = year43.increment();
        year43.setYear((int) '4');
        int i50 = year43.getYear();
        year43.setYear(52);
        year43.setYear(101);
        month8.setMonth(10, year43);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test487");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        boolean b6 = date4.equals((java.lang.Object) (-1));
        Year year7 = date4.getYear();
        Month month8 = new Month(3, year7);
        Year year11 = new Year(3);
        month8.setMonth(11, year11);
        boolean b13 = month8.increment();
        java.lang.Object obj14 = null;
        boolean b15 = month8.equals(obj14);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test488");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        date3.increment();
        Month month6 = date3.getMonth();
    }

    @Test
    public void test489() throws Throwable {
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
    public void test490() throws Throwable {
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
    public void test491() throws Throwable {
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
    public void test492() throws Throwable {
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
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test493");
        Year year3 = new Year((int) (byte) 100);
        boolean b4 = year3.isValid();
        Month month5 = new Month((int) (short) 10, year3);
        boolean b6 = month5.increment();
        int i7 = month5.getMonth();
        int i8 = month5.getMonth();
        int i9 = month5.getMonthSize();
        try {
            Day day10 = new Day((int) (byte) 100, month5);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test494() throws Throwable {
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
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test495");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b5 = month4.increment();
        int i6 = month4.getMonthSize();
        boolean b7 = month4.isValid();
        boolean b8 = month4.increment();
        Date date13 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year14 = date13.getYear();
        boolean b16 = date13.equals((java.lang.Object) "hi!");
        date13.increment();
        date13.printDate();
        Year year19 = date13.getYear();
        month4.setMonth(4, year19);
        int i21 = month4.getMonth();
        boolean b22 = month4.isValid();
    }

    @Test
    public void test496() throws Throwable {
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
    public void test497() throws Throwable {
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
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test498");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        boolean b9 = date3.equals((java.lang.Object) (short) 100);
        Year year10 = date3.getYear();
        Year year12 = new Year(1);
        boolean b13 = year12.isLeap();
        int i14 = year12.getYear();
        boolean b16 = year12.equals((java.lang.Object) 1);
        year12.setYear(32);
        boolean b19 = date3.equals((java.lang.Object) 32);
        date3.printDate();
        Date date21 = Nextday.nextDay(date3);
        Date date22 = Nextday.nextDay(date21);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test499");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        int i5 = year4.getYear();
        year4.setYear((int) 'a');
        boolean b8 = year4.isLeap();
        boolean b9 = year4.isLeap();
        boolean b10 = year4.increment();
        boolean b11 = year4.isValid();
    }

    @Test
    public void test500() throws Throwable {
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
}

