import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
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
    public void test002() throws Throwable {
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
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test003");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Month month7 = date3.getMonth();
        Day day8 = date3.getDay();
        boolean b9 = day8.isValid();
        boolean b10 = day8.increment();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test004");
        Year year1 = new Year(1);
        boolean b2 = year1.isLeap();
        boolean b3 = year1.isLeap();
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = year1.equals(obj4);
        boolean b6 = year1.isValid();
        int i7 = year1.getYear();
        year1.setYear((int) 'a');
        Year year11 = new Year(1);
        boolean b12 = year11.isLeap();
        int i13 = year11.getYear();
        Year year15 = new Year(1);
        boolean b16 = year15.isValid();
        boolean b17 = year15.isValid();
        boolean b18 = year15.isLeap();
        boolean b19 = year15.increment();
        boolean b20 = year15.increment();
        int i21 = year15.getYear();
        boolean b22 = year11.equals((java.lang.Object) i21);
        boolean b23 = year1.equals((java.lang.Object) b22);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test005");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year5 = date4.getYear();
        boolean b7 = date4.equals((java.lang.Object) "hi!");
        date4.printDate();
        date4.printDate();
        Month month10 = date4.getMonth();
        boolean b11 = month10.increment();
        try {
            Day day12 = new Day(35, month10);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test007");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        date3.printDate();
        Year year5 = date3.getYear();
        Day day6 = date3.getDay();
        Day day7 = date3.getDay();
        date3.printDate();
        Month month9 = date3.getMonth();
        Day day10 = date3.getDay();
    }

    @Test
    public void test008() throws Throwable {
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
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test009");
        Year year3 = new Year(1);
        boolean b4 = year3.isLeap();
        boolean b5 = year3.isLeap();
        Date date9 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year10 = date9.getYear();
        boolean b12 = date9.equals((java.lang.Object) "hi!");
        date9.increment();
        java.lang.String str14 = date9.toString();
        boolean b15 = year3.equals((java.lang.Object) date9);
        Month month16 = new Month((int) (short) 10, year3);
        boolean b17 = year3.increment();
        year3.setYear((int) (byte) 1);
        int i20 = year3.getYear();
        year3.setYear(102);
        try {
            Month month23 = new Month(0, year3);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
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
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test011");
        try {
            Date date3 = new Date(0, 2, 11);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test012");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.printDate();
        Year year8 = date3.getYear();
        date3.increment();
        Date date10 = Nextday.nextDay(date3);
        Day day11 = date10.getDay();
        int i12 = day11.getDay();
    }

    @Test
    public void test013() throws Throwable {
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
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test014");
        Year year1 = new Year(1);
        year1.setYear(32);
        boolean b4 = year1.increment();
        boolean b5 = year1.isLeap();
        boolean b6 = year1.isLeap();
    }

    @Test
    public void test015() throws Throwable {
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
    public void test016() throws Throwable {
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
    public void test017() throws Throwable {
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
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test018");
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
        Year year22 = new Year(1);
        boolean b23 = year22.isValid();
        boolean b24 = year22.isValid();
        Month month25 = new Month((int) (short) 10, year22);
        int i26 = month25.getMonthSize();
        int i27 = month25.getMonth();
        try {
            day14.setDay(0, month25);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test019() throws Throwable {
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
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test020");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isValid();
        year1.setYear((int) 'a');
        boolean b6 = year1.isLeap();
        boolean b7 = year1.isLeap();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test021");
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
        boolean b21 = day7.isValid();
        boolean b22 = day7.increment();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test022");
        Year year1 = new Year(102);
        Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year6 = date5.getYear();
        boolean b8 = date5.equals((java.lang.Object) "hi!");
        Month month9 = date5.getMonth();
        date5.printDate();
        java.lang.String str11 = date5.toString();
        Month month12 = date5.getMonth();
        Year year13 = date5.getYear();
        java.lang.String str14 = date5.toString();
        Year year15 = date5.getYear();
        date5.increment();
        boolean b17 = year1.equals((java.lang.Object) date5);
        year1.setYear(10);
        boolean b20 = year1.isValid();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test023");
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
        year1.setYear((int) (byte) 1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test024");
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
        Date date29 = Nextday.nextDay(date4);
        Year year30 = date29.getYear();
        boolean b31 = year30.increment();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test025");
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
        boolean b18 = month17.increment();
        boolean b19 = month17.increment();
    }

    @Test
    public void test026() throws Throwable {
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
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test027");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.increment();
        java.lang.String str8 = date3.toString();
        date3.printDate();
        Year year10 = date3.getYear();
        Date date11 = Nextday.nextDay(date3);
        date3.printDate();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test028");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isValid();
        boolean b5 = year2.isValid();
        boolean b6 = year2.isValid();
        int i7 = year2.getYear();
        Month month8 = new Month((int) (short) 10, year2);
        int i9 = month8.getMonth();
        int i10 = month8.getMonth();
        Date date14 = new Date(10, (int) (byte) 10, (int) (short) 1);
        java.lang.String str15 = date14.toString();
        Date date16 = Nextday.nextDay(date14);
        java.lang.String str17 = date14.toString();
        Month month18 = date14.getMonth();
        boolean b19 = month8.equals((java.lang.Object) month18);
    }

    @Test
    public void test029() throws Throwable {
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
    public void test030() throws Throwable {
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
    public void test031() throws Throwable {
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
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test032");
        Date date3 = new Date((int) (byte) 10, 13, (-1));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test033");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        date3.printDate();
        Year year6 = date3.getYear();
        Day day7 = date3.getDay();
        Month month8 = date3.getMonth();
        boolean b9 = month8.increment();
        int i10 = month8.getMonth();
        int i11 = month8.getMonthSize();
    }

    @Test
    public void test034() throws Throwable {
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
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test035");
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
        Month month22 = new Month((int) (byte) 10, year18);
        int i23 = year18.getYear();
        Month month24 = new Month(5, year18);
    }

    @Test
    public void test036() throws Throwable {
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
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test037");
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
        boolean b16 = year2.isValid();
        boolean b17 = year2.isValid();
        java.lang.Object obj18 = null;
        boolean b19 = year2.equals(obj18);
        boolean b20 = year2.isValid();
    }

    @Test
    public void test038() throws Throwable {
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
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test039");
        Year year1 = new Year(35);
    }

    @Test
    public void test040() throws Throwable {
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
    public void test041() throws Throwable {
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
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test042");
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
        Year year28 = new Year(1);
        boolean b29 = year28.isValid();
        boolean b30 = year28.increment();
        boolean b31 = year28.increment();
        boolean b32 = year28.isLeap();
        int i33 = year28.getYear();
        boolean b34 = year28.isLeap();
        try {
            month8.setMonth(52, year28);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test043");
        try {
            Date date3 = new Date(32, 4, (int) (byte) 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test044() throws Throwable {
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
    public void test045() throws Throwable {
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
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test046");
        Year year1 = new Year(1);
        boolean b2 = year1.isLeap();
        int i3 = year1.getYear();
        year1.setYear(100);
        year1.setYear((-1));
        boolean b8 = year1.isLeap();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test047");
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
        boolean b20 = day9.increment();
        boolean b21 = day9.increment();
        boolean b22 = day9.increment();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test048");
        try {
            Date date3 = new Date(34, 11, 34);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test049");
        try {
            Date date3 = new Date(53, 1, 28);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test050");
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
        Year year26 = new Year((int) (byte) 100);
        Month month27 = new Month((int) (short) 1, year26);
        Date date31 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year32 = date31.getYear();
        boolean b34 = date31.equals((java.lang.Object) "hi!");
        date31.printDate();
        Year year36 = date31.getYear();
        java.lang.String str37 = date31.toString();
        date31.increment();
        boolean b39 = month27.equals((java.lang.Object) date31);
        try {
            day22.setDay((int) (short) 100, month27);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test051() throws Throwable {
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
    public void test052() throws Throwable {
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
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test053");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Month month7 = date3.getMonth();
        date3.printDate();
        java.lang.String str9 = date3.toString();
        Year year10 = date3.getYear();
        year10.setYear(10);
        boolean b13 = year10.isLeap();
        boolean b14 = year10.increment();
    }

    @Test
    public void test054() throws Throwable {
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
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test055");
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
        boolean b21 = day7.increment();
        int i22 = day7.getDay();
    }

    @Test
    public void test056() throws Throwable {
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
    public void test057() throws Throwable {
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
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test058");
        Year year1 = new Year(31);
        int i2 = year1.getYear();
        boolean b3 = year1.isLeap();
        int i4 = year1.getYear();
        boolean b5 = year1.isLeap();
    }

    @Test
    public void test059() throws Throwable {
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
    public void test060() throws Throwable {
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
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test061");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Day day7 = date3.getDay();
        Year year11 = new Year((int) (byte) 100);
        boolean b12 = year11.isValid();
        Month month13 = new Month((int) (short) 10, year11);
        day7.setDay((int) (short) 10, month13);
        int i15 = day7.getDay();
        Date date21 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year22 = date21.getYear();
        boolean b24 = date21.equals((java.lang.Object) "hi!");
        Month month25 = date21.getMonth();
        int i26 = month25.getMonthSize();
        int i27 = month25.getMonthSize();
        Day day28 = new Day(11, month25);
        int i29 = month25.getMonth();
        try {
            day7.setDay((int) (byte) 0, month25);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test062");
        try {
            Date date3 = new Date(13, 11, (int) (short) 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test063() throws Throwable {
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
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test064");
        Year year1 = new Year(1);
        boolean b2 = year1.isLeap();
        boolean b3 = year1.isLeap();
        boolean b4 = year1.increment();
        int i5 = year1.getYear();
        boolean b6 = year1.isValid();
        try {
            year1.setYear(0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test065() throws Throwable {
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
    public void test066() throws Throwable {
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
    public void test067() throws Throwable {
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
    public void test068() throws Throwable {
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
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test069");
        Year year1 = new Year((int) (byte) 100);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = year1.equals(obj2);
        Date date7 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year8 = date7.getYear();
        boolean b10 = date7.equals((java.lang.Object) "hi!");
        Month month11 = date7.getMonth();
        boolean b12 = year1.equals((java.lang.Object) date7);
        Day day13 = date7.getDay();
        Year year14 = date7.getYear();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test070");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        date3.printDate();
        Year year6 = date3.getYear();
        Day day7 = date3.getDay();
        Month month8 = date3.getMonth();
        Year year9 = date3.getYear();
        Date date10 = Nextday.nextDay(date3);
        date10.printDate();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test071");
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
        int i20 = day18.getDay();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test072");
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
        Year year25 = new Year((int) (byte) 100);
        boolean b26 = year25.isValid();
        Month month27 = new Month((int) (short) 10, year25);
        boolean b29 = month27.equals((java.lang.Object) 10L);
        boolean b30 = month27.isValid();
        boolean b31 = month27.isValid();
        boolean b32 = day15.equals((java.lang.Object) b31);
        boolean b33 = day15.increment();
        Date date37 = new Date(10, 3, 33);
        Month month38 = date37.getMonth();
        Day day39 = date37.getDay();
        boolean b40 = day15.equals((java.lang.Object) date37);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test073");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isLeap();
        int i5 = year2.getYear();
        boolean b6 = year2.isLeap();
        Month month7 = new Month((int) (byte) 1, year2);
        int i8 = month7.getMonthSize();
        boolean b9 = month7.increment();
        int i10 = month7.getMonth();
        boolean b11 = month7.isValid();
        Year year13 = new Year(1);
        boolean b14 = year13.increment();
        int i15 = year13.getYear();
        boolean b16 = year13.increment();
        year13.setYear(12);
        boolean b19 = year13.increment();
        boolean b20 = month7.equals((java.lang.Object) year13);
        int i21 = month7.getMonthSize();
        int i22 = month7.getMonth();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test074");
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
        boolean b16 = year13.increment();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test075");
        Year year1 = new Year((int) (byte) -1);
        Year year3 = new Year(1);
        boolean b4 = year3.isLeap();
        int i5 = year3.getYear();
        boolean b7 = year3.equals((java.lang.Object) 1);
        boolean b8 = year1.equals((java.lang.Object) b7);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test076");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        int i5 = year4.getYear();
        boolean b6 = year4.increment();
    }

    @Test
    public void test077() throws Throwable {
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
    public void test078() throws Throwable {
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
    public void test079() throws Throwable {
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
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test080");
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
        boolean b26 = year18.increment();
        year18.setYear((int) '#');
        boolean b29 = year18.increment();
    }

    @Test
    public void test081() throws Throwable {
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
    public void test082() throws Throwable {
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
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test083");
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
        int i28 = month13.getMonthSize();
    }

    @Test
    public void test084() throws Throwable {
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
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test085");
        try {
            Date date3 = new Date(102, 0, 33);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test086() throws Throwable {
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
    public void test087() throws Throwable {
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
    public void test088() throws Throwable {
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
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test089");
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
        date3.increment();
        Date date21 = Nextday.nextDay(date3);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test090");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isValid();
        boolean b5 = year2.isLeap();
        boolean b6 = year2.isLeap();
        int i7 = year2.getYear();
        boolean b8 = year2.increment();
        boolean b9 = year2.increment();
        boolean b10 = year2.isValid();
        boolean b11 = year2.isLeap();
        boolean b12 = year2.isLeap();
        boolean b13 = year2.isLeap();
        try {
            Month month14 = new Month(0, year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test091");
        Date date3 = new Date(10, 3, 33);
        Month month4 = date3.getMonth();
        Day day5 = date3.getDay();
        Date date10 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year11 = date10.getYear();
        boolean b13 = date10.equals((java.lang.Object) "hi!");
        date10.increment();
        java.lang.String str15 = date10.toString();
        date10.increment();
        Year year19 = new Year((int) (byte) 100);
        boolean b20 = year19.isValid();
        Month month21 = new Month((int) (short) 10, year19);
        int i22 = month21.getMonth();
        boolean b23 = month21.increment();
        boolean b24 = date10.equals((java.lang.Object) month21);
        Month month25 = date10.getMonth();
        day5.setDay(10, month25);
        int i27 = month25.getMonthSize();
    }

    @Test
    public void test092() throws Throwable {
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
    public void test093() throws Throwable {
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
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test094");
        try {
            Date date3 = new Date((int) 'a', 53, 35);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test095() throws Throwable {
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
    public void test096() throws Throwable {
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
    public void test097() throws Throwable {
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
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test098");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year5 = date4.getYear();
        boolean b7 = date4.equals((java.lang.Object) "hi!");
        Month month8 = date4.getMonth();
        Month month9 = date4.getMonth();
        Day day10 = new Day((int) (byte) 10, month9);
        int i11 = day10.getDay();
    }

    @Test
    public void test099() throws Throwable {
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
    public void test100() throws Throwable {
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
    public void test101() throws Throwable {
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
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test102");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Day day7 = date3.getDay();
        Month month8 = date3.getMonth();
        date3.printDate();
        Year year10 = date3.getYear();
    }

    @Test
    public void test103() throws Throwable {
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
    public void test104() throws Throwable {
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
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test105");
        Date date3 = new Date(2, 10, 10);
        Date date4 = Nextday.nextDay(date3);
        Date date5 = Nextday.nextDay(date3);
        Month month6 = date5.getMonth();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test106");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b6 = month4.equals((java.lang.Object) 10L);
        Year year8 = new Year(1);
        boolean b9 = year8.increment();
        boolean b10 = month4.equals((java.lang.Object) year8);
        int i11 = month4.getMonth();
        Year year15 = new Year(1);
        boolean b16 = year15.isLeap();
        boolean b17 = year15.isLeap();
        Month month18 = new Month((int) (short) 1, year15);
        try {
            month4.setMonth(35, year15);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test107() throws Throwable {
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
    public void test108() throws Throwable {
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
    public void test109() throws Throwable {
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
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test110");
        Year year3 = new Year(1);
        boolean b4 = year3.isValid();
        boolean b5 = year3.isLeap();
        int i6 = year3.getYear();
        boolean b7 = year3.isLeap();
        Month month8 = new Month((int) (byte) 1, year3);
        Day day9 = new Day(31, month8);
        boolean b10 = day9.isValid();
        int i11 = day9.getDay();
        Year year16 = new Year(1);
        boolean b17 = year16.isValid();
        boolean b18 = year16.isLeap();
        int i19 = year16.getYear();
        boolean b20 = year16.isLeap();
        Month month21 = new Month((int) (byte) 1, year16);
        Year year23 = new Year(1);
        boolean b24 = year23.isLeap();
        boolean b25 = year23.isLeap();
        boolean b26 = year16.equals((java.lang.Object) year23);
        Month month27 = new Month((int) (short) 1, year16);
        try {
            day9.setDay(100, month27);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test111() throws Throwable {
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
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test112");
        Date date3 = new Date(5, 13, 102);
        java.lang.String str4 = date3.toString();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test113");
        Year year1 = null;
        try {
            Month month2 = new Month((int) (short) -1, year1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test114() throws Throwable {
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
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test115");
        Year year2 = new Year((int) (byte) 100);
        int i3 = year2.getYear();
        int i4 = year2.getYear();
        Month month5 = new Month((int) (short) 1, year2);
        year2.setYear(31);
        boolean b8 = year2.isLeap();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test116");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Month month7 = date3.getMonth();
        date3.printDate();
        java.lang.String str9 = date3.toString();
        Year year10 = date3.getYear();
        Year year11 = date3.getYear();
        Date date12 = Nextday.nextDay(date3);
        java.lang.String str13 = date12.toString();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test117");
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
        boolean b30 = month24.increment();
        Year year33 = new Year(1);
        boolean b34 = year33.isLeap();
        boolean b35 = year33.isLeap();
        java.lang.Object obj36 = new java.lang.Object();
        boolean b37 = year33.equals(obj36);
        boolean b38 = year33.increment();
        month24.setMonth(1, year33);
        Day day40 = new Day(3, month24);
        boolean b41 = month24.increment();
        boolean b42 = month24.isValid();
        try {
            day14.setDay((-1), month24);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test118");
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
        Year year16 = new Year(1);
        boolean b17 = year16.isValid();
        boolean b18 = year16.isValid();
        boolean b19 = year16.isLeap();
        boolean b20 = year16.isLeap();
        int i21 = year16.getYear();
        int i22 = year16.getYear();
        boolean b23 = year16.isLeap();
        boolean b24 = year16.increment();
        try {
            month9.setMonth(0, year16);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test119");
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
        boolean b14 = month7.increment();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test120");
        Year year1 = new Year((int) (byte) 100);
        int i2 = year1.getYear();
        int i3 = year1.getYear();
        boolean b4 = year1.increment();
    }

    @Test
    public void test121() throws Throwable {
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
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test122");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date4 = Nextday.nextDay(date3);
        date3.increment();
        date3.increment();
        Date date7 = Nextday.nextDay(date3);
        java.lang.String str8 = date3.toString();
    }

    @Test
    public void test123() throws Throwable {
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
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test124");
        Year year1 = new Year(1);
        boolean b2 = year1.increment();
        int i3 = year1.getYear();
        year1.setYear((int) (short) -1);
        boolean b6 = year1.increment();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test125");
        try {
            Date date3 = new Date(0, 12, 102);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test126");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.increment();
        date3.increment();
        Date date9 = Nextday.nextDay(date3);
        Year year10 = date9.getYear();
        boolean b11 = year10.isValid();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test127");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Month month7 = date3.getMonth();
        date3.printDate();
        java.lang.String str9 = date3.toString();
        Day day10 = date3.getDay();
        date3.increment();
        Year year12 = date3.getYear();
        java.lang.String str13 = date3.toString();
    }

    @Test
    public void test128() throws Throwable {
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
    public void test129() throws Throwable {
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
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test130");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Month month7 = date3.getMonth();
        date3.printDate();
        java.lang.String str9 = date3.toString();
        Day day10 = date3.getDay();
        date3.increment();
        Year year12 = date3.getYear();
        date3.increment();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test131");
        Year year1 = new Year((int) (short) 100);
        boolean b2 = year1.increment();
        Year year4 = new Year(1);
        boolean b5 = year4.isValid();
        int i6 = year4.getYear();
        year4.setYear(100);
        boolean b9 = year1.equals((java.lang.Object) year4);
        int i10 = year1.getYear();
        boolean b11 = year1.isValid();
        Date date15 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year16 = date15.getYear();
        boolean b18 = date15.equals((java.lang.Object) "hi!");
        Month month19 = date15.getMonth();
        date15.printDate();
        java.lang.String str21 = date15.toString();
        Month month22 = date15.getMonth();
        Day day23 = date15.getDay();
        date15.increment();
        Day day25 = date15.getDay();
        int i26 = day25.getDay();
        boolean b27 = year1.equals((java.lang.Object) day25);
    }

    @Test
    public void test132() throws Throwable {
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
    public void test133() throws Throwable {
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
    public void test134() throws Throwable {
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
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test135");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b6 = month4.equals((java.lang.Object) 10L);
        int i7 = month4.getMonth();
        boolean b8 = month4.isValid();
        boolean b9 = month4.isValid();
        boolean b10 = month4.isValid();
        int i11 = month4.getMonth();
        Year year13 = null;
        try {
            month4.setMonth(10, year13);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test136");
        Year year2 = new Year((int) (byte) 100);
        Month month3 = new Month((int) (short) 1, year2);
        boolean b4 = month3.isValid();
        int i5 = month3.getMonthSize();
        boolean b6 = month3.increment();
        int i7 = month3.getMonth();
        int i8 = month3.getMonth();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test137");
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
        Month month24 = date18.getMonth();
        date18.increment();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test138");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.increment();
        Date date8 = Nextday.nextDay(date3);
        date3.printDate();
        Day day10 = date3.getDay();
        Month month11 = date3.getMonth();
        date3.printDate();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test139");
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
        boolean b17 = day15.isValid();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test140");
        Date date3 = new Date((int) (short) 10, 11, (int) (short) 100);
        Day day4 = date3.getDay();
        java.lang.Object obj5 = null;
        boolean b6 = day4.equals(obj5);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test141");
        Year year2 = new Year(1);
        boolean b3 = year2.isLeap();
        int i4 = year2.getYear();
        Month month5 = new Month(10, year2);
        int i6 = month5.getMonthSize();
        boolean b7 = month5.increment();
    }

    @Test
    public void test142() throws Throwable {
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
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test143");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b6 = month4.equals((java.lang.Object) 10L);
        boolean b7 = month4.isValid();
        boolean b8 = month4.increment();
        int i9 = month4.getMonthSize();
        boolean b10 = month4.isValid();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test144");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        date3.printDate();
        Year year5 = date3.getYear();
        Date date6 = Nextday.nextDay(date3);
        Year year7 = date3.getYear();
        Month month8 = date3.getMonth();
        Year year11 = new Year(1);
        boolean b12 = year11.isLeap();
        boolean b14 = year11.equals((java.lang.Object) 100.0f);
        boolean b15 = year11.isLeap();
        boolean b16 = year11.isValid();
        try {
            month8.setMonth(33, year11);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test145() throws Throwable {
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
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test146");
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
        boolean b15 = day10.isValid();
        boolean b16 = day10.increment();
        boolean b17 = day10.isValid();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test147");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b6 = month4.equals((java.lang.Object) 10L);
        int i7 = month4.getMonth();
        boolean b8 = month4.isValid();
        boolean b9 = month4.isValid();
        boolean b10 = month4.isValid();
        int i11 = month4.getMonth();
        int i12 = month4.getMonthSize();
        int i13 = month4.getMonthSize();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test148");
        try {
            Date date3 = new Date(2, 52, (int) (short) 10);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test149() throws Throwable {
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
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test150");
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
        Year year25 = new Year(1);
        boolean b26 = year25.isValid();
        boolean b27 = year25.isLeap();
        int i28 = year25.getYear();
        boolean b29 = year25.isLeap();
        Month month30 = new Month((int) (byte) 1, year25);
        int i31 = month30.getMonthSize();
        int i32 = month30.getMonthSize();
        int i33 = month30.getMonthSize();
        int i34 = month30.getMonthSize();
        try {
            day7.setDay((int) ' ', month30);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test151");
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
        Year year17 = date3.getYear();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test152");
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
        int i22 = month21.getMonthSize();
    }

    @Test
    public void test153() throws Throwable {
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
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test154");
        Year year2 = new Year(1);
        boolean b3 = year2.isLeap();
        Date date7 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year8 = date7.getYear();
        boolean b10 = date7.equals((java.lang.Object) "hi!");
        boolean b11 = year2.equals((java.lang.Object) date7);
        year2.setYear((int) 'a');
        Month month14 = new Month(11, year2);
        boolean b15 = year2.isLeap();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test155");
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
        Date date29 = Nextday.nextDay(date4);
        date29.printDate();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test156");
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
        int i21 = month19.getMonthSize();
    }

    @Test
    public void test157() throws Throwable {
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
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test158");
        Month month1 = null;
        try {
            Day day2 = new Day(31, month1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test159");
        Year year1 = new Year((int) (byte) 1);
        year1.setYear((int) (short) 10);
        Year year5 = new Year((int) (byte) 100);
        int i6 = year5.getYear();
        boolean b7 = year5.increment();
        boolean b8 = year1.equals((java.lang.Object) b7);
        boolean b9 = year1.increment();
        boolean b10 = year1.increment();
    }

    @Test
    public void test160() throws Throwable {
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
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test161");
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
        Day day27 = new Day(31, month17);
    }

    @Test
    public void test162() throws Throwable {
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
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test163");
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
        int i26 = month15.getMonthSize();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test164");
        Year year1 = new Year(1);
        boolean b2 = year1.isLeap();
        boolean b3 = year1.increment();
        boolean b4 = year1.isValid();
        year1.setYear(34);
    }

    @Test
    public void test165() throws Throwable {
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
    public void test166() throws Throwable {
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
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test167");
        try {
            Date date3 = new Date(33, 97, 33);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test168");
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
        int i26 = year4.getYear();
        int i27 = year4.getYear();
        boolean b28 = year4.isLeap();
    }

    @Test
    public void test169() throws Throwable {
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
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test170");
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
        date9.increment();
        date9.increment();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test171");
        try {
            Date date3 = new Date(11, 34, (-1));
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test172() throws Throwable {
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
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test173");
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
        year1.setYear((int) ' ');
    }

    @Test
    public void test174() throws Throwable {
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
    public void test175() throws Throwable {
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
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test176");
        Year year2 = new Year(1);
        boolean b3 = year2.isLeap();
        int i4 = year2.getYear();
        boolean b6 = year2.equals((java.lang.Object) 1);
        year2.setYear(32);
        boolean b9 = year2.isLeap();
        boolean b10 = year2.increment();
        Month month11 = new Month((int) (short) 1, year2);
        boolean b12 = month11.increment();
        Year year15 = new Year(1);
        boolean b16 = year15.isLeap();
        boolean b17 = year15.isLeap();
        boolean b18 = year15.increment();
        int i19 = year15.getYear();
        boolean b20 = year15.isValid();
        try {
            month11.setMonth((int) (short) -1, year15);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test177");
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
        boolean b14 = year12.increment();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test178");
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
        java.lang.Object obj19 = null;
        boolean b20 = date14.equals(obj19);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test179");
        Date date3 = new Date(2, 10, 10);
        Date date4 = Nextday.nextDay(date3);
        date4.printDate();
    }

    @Test
    public void test180() throws Throwable {
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
    public void test181() throws Throwable {
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
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test182");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Date date7 = Nextday.nextDay(date3);
        Day day8 = date7.getDay();
        boolean b9 = day8.isValid();
    }

    @Test
    public void test183() throws Throwable {
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
    public void test184() throws Throwable {
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
    public void test185() throws Throwable {
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
    public void test186() throws Throwable {
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
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test187");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isValid();
        boolean b5 = year2.isValid();
        boolean b6 = year2.isValid();
        int i7 = year2.getYear();
        Month month8 = new Month((int) (short) 10, year2);
        int i9 = month8.getMonth();
        boolean b10 = month8.increment();
    }

    @Test
    public void test188() throws Throwable {
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
    public void test189() throws Throwable {
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
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test190");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year5 = date4.getYear();
        boolean b7 = date4.equals((java.lang.Object) "hi!");
        java.lang.String str8 = date4.toString();
        boolean b10 = date4.equals((java.lang.Object) (short) 100);
        Date date11 = Nextday.nextDay(date4);
        date11.increment();
        Month month13 = date11.getMonth();
        Year year15 = new Year(1);
        boolean b16 = year15.isLeap();
        int i17 = year15.getYear();
        year15.setYear(100);
        boolean b20 = year15.isValid();
        year15.setYear((-1));
        boolean b23 = month13.equals((java.lang.Object) year15);
        try {
            Day day24 = new Day((int) (short) -1, month13);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test191");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        Day day8 = date3.getDay();
        Day day9 = date3.getDay();
        boolean b10 = day9.increment();
        boolean b11 = day9.isValid();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test192");
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
        Year year21 = date17.getYear();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test193");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isValid();
        boolean b4 = year1.isLeap();
        int i5 = year1.getYear();
        boolean b6 = year1.increment();
        year1.setYear(2);
        boolean b9 = year1.increment();
        year1.setYear((int) (byte) -1);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test194");
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
        Day day16 = date7.getDay();
        boolean b17 = day16.isValid();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test195");
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
        Year year15 = date3.getYear();
        Month month16 = date3.getMonth();
    }

    @Test
    public void test196() throws Throwable {
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
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test197");
        try {
            Date date3 = new Date(52, 101, 2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test198");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isValid();
        boolean b5 = year2.isValid();
        boolean b6 = year2.isValid();
        int i7 = year2.getYear();
        Month month8 = new Month((int) (short) 10, year2);
        boolean b9 = year2.isValid();
        int i10 = year2.getYear();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test199");
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
        int i26 = month4.getMonthSize();
        int i27 = month4.getMonthSize();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test200");
        Year year1 = new Year((int) (byte) 100);
        Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
        boolean b6 = year1.equals((java.lang.Object) 10);
        year1.setYear((int) (byte) 1);
    }

    @Test
    public void test201() throws Throwable {
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
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test202");
        Year year3 = new Year((int) (byte) 100);
        boolean b4 = year3.isValid();
        Month month5 = new Month((int) (short) 10, year3);
        boolean b7 = month5.equals((java.lang.Object) 10L);
        boolean b8 = month5.increment();
        try {
            Day day9 = new Day((int) '4', month5);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test203() throws Throwable {
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
    public void test204() throws Throwable {
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
    public void test205() throws Throwable {
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
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test206");
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
        boolean b21 = year19.increment();
    }

    @Test
    public void test207() throws Throwable {
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
    public void test208() throws Throwable {
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
    public void test209() throws Throwable {
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
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test210");
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
        Year year14 = date3.getYear();
    }

    @Test
    public void test211() throws Throwable {
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
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test212");
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
        int i31 = day15.getDay();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test213");
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
        boolean b14 = day7.isValid();
    }

    @Test
    public void test214() throws Throwable {
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
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test215");
        Year year2 = new Year((int) (byte) 100);
        Month month3 = new Month((int) (short) 1, year2);
        int i4 = month3.getMonthSize();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test216");
        Year year1 = new Year((int) (short) 1);
        boolean b2 = year1.isLeap();
        boolean b3 = year1.isLeap();
        year1.setYear(1);
        int i6 = year1.getYear();
    }

    @Test
    public void test217() throws Throwable {
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
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test218");
        try {
            Date date3 = new Date((int) (short) 0, (int) (short) 0, (int) (byte) 1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test219");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date4 = Nextday.nextDay(date3);
        Day day5 = date4.getDay();
        java.lang.String str6 = date4.toString();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test220");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        date4.printDate();
        Year year6 = date4.getYear();
        try {
            Month month7 = new Month(31, year6);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test221() throws Throwable {
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
    public void test222() throws Throwable {
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
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test223");
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
        java.lang.String str19 = date3.toString();
        date3.printDate();
    }

    @Test
    public void test224() throws Throwable {
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
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test225");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Month month7 = date3.getMonth();
        date3.printDate();
        java.lang.String str9 = date3.toString();
        date3.printDate();
        Month month11 = date3.getMonth();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test226");
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
        int i13 = day9.getDay();
        int i14 = day9.getDay();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test227");
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
        boolean b21 = day7.isValid();
        boolean b22 = day7.isValid();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test228");
        Year year3 = new Year(1);
        boolean b4 = year3.isLeap();
        boolean b5 = year3.isLeap();
        boolean b6 = year3.increment();
        Month month7 = new Month((int) (short) 1, year3);
        Date date11 = new Date(10, (int) (byte) 10, (int) (short) 1);
        java.lang.String str12 = date11.toString();
        boolean b13 = month7.equals((java.lang.Object) date11);
        Day day14 = new Day((int) (byte) 10, month7);
        Year year17 = new Year(1);
        boolean b18 = year17.isLeap();
        boolean b19 = year17.isLeap();
        Date date23 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year24 = date23.getYear();
        boolean b26 = date23.equals((java.lang.Object) "hi!");
        date23.increment();
        java.lang.String str28 = date23.toString();
        boolean b29 = year17.equals((java.lang.Object) date23);
        Month month30 = new Month((int) (short) 10, year17);
        boolean b31 = year17.isLeap();
        boolean b32 = day14.equals((java.lang.Object) year17);
        Year year36 = new Year((int) (byte) 100);
        boolean b37 = year36.isValid();
        Month month38 = new Month((int) (short) 10, year36);
        int i39 = month38.getMonth();
        Day day40 = new Day(30, month38);
        int i41 = day40.getDay();
        boolean b42 = year17.equals((java.lang.Object) day40);
        year17.setYear(3);
        boolean b45 = year17.isLeap();
    }

    @Test
    public void test229() throws Throwable {
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
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test230");
        Year year1 = new Year((int) (short) 1);
        boolean b2 = year1.isLeap();
        year1.setYear((int) (short) -1);
        int i5 = year1.getYear();
        boolean b6 = year1.isValid();
        boolean b7 = year1.increment();
        boolean b8 = year1.increment();
        int i9 = year1.getYear();
        int i10 = year1.getYear();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test231");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        date3.printDate();
        Year year5 = date3.getYear();
        Date date6 = Nextday.nextDay(date3);
        java.lang.Object obj7 = null;
        boolean b8 = date3.equals(obj7);
        Date date9 = Nextday.nextDay(date3);
        Month month10 = date9.getMonth();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test232");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isLeap();
        int i5 = year2.getYear();
        boolean b6 = year2.isLeap();
        Month month7 = new Month((int) (byte) 1, year2);
        int i8 = month7.getMonthSize();
        int i9 = month7.getMonthSize();
        int i10 = month7.getMonth();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test233");
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
        Day day28 = date3.getDay();
        Date date33 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year34 = date33.getYear();
        boolean b36 = date33.equals((java.lang.Object) "hi!");
        java.lang.String str37 = date33.toString();
        boolean b39 = date33.equals((java.lang.Object) (short) 100);
        Year year40 = date33.getYear();
        Date date41 = Nextday.nextDay(date33);
        date41.increment();
        java.lang.String str43 = date41.toString();
        Day day44 = date41.getDay();
        Month month45 = date41.getMonth();
        try {
            day28.setDay((int) ' ', month45);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test234");
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
        boolean b24 = month9.isValid();
        int i25 = month9.getMonth();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test235");
        try {
            Date date3 = new Date(53, (int) (short) 10, 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test236() throws Throwable {
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
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test237");
        try {
            Date date3 = new Date((int) (short) 100, (int) (byte) 10, 4);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test238() throws Throwable {
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
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test239");
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
        Date date21 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year22 = date21.getYear();
        boolean b24 = date21.equals((java.lang.Object) "hi!");
        Month month25 = date21.getMonth();
        date21.printDate();
        java.lang.String str27 = date21.toString();
        Month month28 = date21.getMonth();
        Year year29 = date21.getYear();
        boolean b30 = day14.equals((java.lang.Object) date21);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test240");
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
        boolean b22 = day7.increment();
        int i23 = day7.getDay();
    }

    @Test
    public void test241() throws Throwable {
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
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test242");
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
        int i29 = day9.getDay();
        boolean b30 = day9.increment();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test243");
        Year year1 = new Year((int) (byte) 100);
        Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
        boolean b6 = year1.equals((java.lang.Object) 10);
        boolean b7 = year1.isLeap();
        boolean b8 = year1.increment();
        year1.setYear((int) (byte) 100);
    }

    @Test
    public void test244() throws Throwable {
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
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test245");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year5 = date4.getYear();
        boolean b7 = date4.equals((java.lang.Object) "hi!");
        Month month8 = date4.getMonth();
        date4.printDate();
        java.lang.String str10 = date4.toString();
        Year year11 = date4.getYear();
        Year year12 = date4.getYear();
        boolean b13 = year12.isLeap();
        try {
            Month month14 = new Month(100, year12);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test246");
        Year year1 = new Year(1);
        boolean b2 = year1.isLeap();
        boolean b3 = year1.isLeap();
        boolean b4 = year1.increment();
        java.lang.Object obj5 = null;
        boolean b6 = year1.equals(obj5);
        int i7 = year1.getYear();
        int i8 = year1.getYear();
        boolean b9 = year1.increment();
        Date date13 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year14 = date13.getYear();
        date13.printDate();
        Year year16 = date13.getYear();
        Day day17 = date13.getDay();
        Month month18 = date13.getMonth();
        boolean b19 = year1.equals((java.lang.Object) month18);
        int i20 = month18.getMonthSize();
    }

    @Test
    public void test247() throws Throwable {
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
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test248");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.increment();
        java.lang.String str8 = date3.toString();
        java.lang.String str9 = date3.toString();
        Date date10 = Nextday.nextDay(date3);
        Day day11 = date10.getDay();
        Date date12 = Nextday.nextDay(date10);
        Date date13 = Nextday.nextDay(date12);
        date13.increment();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test249");
        try {
            Date date3 = new Date((int) (short) 100, 14, 100);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test250");
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
        date14.increment();
        date14.increment();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test251");
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
        java.lang.String str16 = date3.toString();
        date3.increment();
    }

    @Test
    public void test252() throws Throwable {
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
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test253");
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
        Year year18 = date4.getYear();
        Day day19 = date4.getDay();
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test254");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isLeap();
        int i5 = year2.getYear();
        Year year7 = new Year(1);
        boolean b8 = year7.isValid();
        boolean b9 = year7.isLeap();
        int i10 = year7.getYear();
        boolean b11 = year7.isLeap();
        boolean b12 = year2.equals((java.lang.Object) b11);
        boolean b13 = year2.isValid();
        try {
            Month month14 = new Month(101, year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test255() throws Throwable {
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
    public void test256() throws Throwable {
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
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test257");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isValid();
        year1.setYear((int) 'a');
        boolean b6 = year1.isLeap();
        boolean b7 = year1.increment();
        Date date11 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date12 = Nextday.nextDay(date11);
        Day day13 = date12.getDay();
        Year year14 = date12.getYear();
        Month month15 = date12.getMonth();
        date12.printDate();
        date12.increment();
        java.lang.String str18 = date12.toString();
        boolean b19 = year1.equals((java.lang.Object) date12);
    }

    @Test
    public void test258() throws Throwable {
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
    public void test259() throws Throwable {
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
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test260");
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
        java.lang.String str16 = date3.toString();
    }

    @Test
    public void test261() throws Throwable {
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
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test262");
        try {
            Date date3 = new Date(30, 101, 12);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test263");
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
        int i31 = year30.getYear();
        boolean b32 = year30.increment();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test264");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b6 = month4.equals((java.lang.Object) 10L);
        boolean b7 = month4.increment();
        Year year10 = new Year(1);
        boolean b11 = year10.increment();
        year10.setYear((int) ' ');
        int i14 = year10.getYear();
        try {
            month4.setMonth((int) (short) 0, year10);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test265() throws Throwable {
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
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test266");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.printDate();
        date3.printDate();
        date3.printDate();
        Month month10 = date3.getMonth();
        boolean b11 = month10.isValid();
        boolean b12 = month10.increment();
        int i13 = month10.getMonthSize();
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test267");
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
        boolean b16 = month5.isValid();
        try {
            Day day17 = new Day((int) (short) -1, month5);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test268() throws Throwable {
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
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test269");
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
        Year year21 = new Year((int) (short) 100);
        boolean b22 = year21.increment();
        Year year24 = new Year(1);
        boolean b25 = year24.isValid();
        int i26 = year24.getYear();
        year24.setYear(100);
        boolean b29 = year21.equals((java.lang.Object) year24);
        try {
            month12.setMonth((int) (byte) 0, year24);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test270() throws Throwable {
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
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test271");
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
        boolean b17 = day16.increment();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test272");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.printDate();
        Year year8 = date3.getYear();
        java.lang.Object obj9 = null;
        boolean b10 = date3.equals(obj9);
        Year year11 = date3.getYear();
        Year year12 = date3.getYear();
        Date date13 = Nextday.nextDay(date3);
        Year year14 = date3.getYear();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test273");
        Year year2 = new Year(1);
        boolean b3 = year2.isLeap();
        int i4 = year2.getYear();
        boolean b6 = year2.equals((java.lang.Object) 1);
        boolean b7 = year2.isValid();
        Month month8 = new Month(1, year2);
        int i9 = month8.getMonthSize();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test274");
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
        Year year30 = new Year(101);
        boolean b31 = year30.isLeap();
        try {
            month19.setMonth(28, year30);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test275() throws Throwable {
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
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test276");
        Year year1 = new Year((int) (byte) 100);
        boolean b2 = year1.increment();
        boolean b3 = year1.isValid();
        boolean b4 = year1.increment();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test277");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isValid();
        boolean b4 = year1.isValid();
        boolean b5 = year1.isValid();
        boolean b6 = year1.isLeap();
    }

    @Test
    public void test278() throws Throwable {
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
    public void test279() throws Throwable {
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
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test280");
        Date date3 = new Date((int) (byte) 1, 3, 102);
        java.lang.String str4 = date3.toString();
        Day day5 = date3.getDay();
        date3.printDate();
        java.lang.String str7 = date3.toString();
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test281");
        Year year3 = new Year(1);
        boolean b4 = year3.isValid();
        boolean b5 = year3.isValid();
        boolean b6 = year3.isValid();
        boolean b7 = year3.isValid();
        Month month8 = new Month(12, year3);
        Month month9 = new Month(11, year3);
        int i10 = year3.getYear();
        int i11 = year3.getYear();
        int i12 = year3.getYear();
    }

    @Test
    public void test282() throws Throwable {
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
    public void test283() throws Throwable {
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
    public void test284() throws Throwable {
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
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test285");
        Year year1 = new Year(1);
        boolean b2 = year1.isLeap();
        int i3 = year1.getYear();
        boolean b4 = year1.isValid();
        int i5 = year1.getYear();
        year1.setYear((int) (short) 100);
        Year year9 = new Year(12);
        boolean b10 = year1.equals((java.lang.Object) 12);
    }

    @Test
    public void test286() throws Throwable {
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
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test287");
        Year year1 = new Year(4);
        boolean b2 = year1.isValid();
    }

    @Test
    public void test288() throws Throwable {
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
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test289");
        Year year1 = new Year((int) (byte) 10);
        boolean b2 = year1.isValid();
        int i3 = year1.getYear();
        boolean b4 = year1.isLeap();
        year1.setYear(100);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test290");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isLeap();
        int i5 = year2.getYear();
        boolean b6 = year2.isLeap();
        Month month7 = new Month((int) (byte) 1, year2);
        int i8 = month7.getMonthSize();
        boolean b9 = month7.increment();
        int i10 = month7.getMonth();
        boolean b11 = month7.isValid();
        Year year13 = new Year(1);
        boolean b14 = year13.increment();
        int i15 = year13.getYear();
        boolean b16 = year13.increment();
        year13.setYear(12);
        boolean b19 = year13.increment();
        boolean b20 = month7.equals((java.lang.Object) year13);
        year13.setYear(5);
    }

    @Test
    public void test291() throws Throwable {
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
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test292");
        Year year1 = new Year((int) (short) 100);
        boolean b2 = year1.increment();
        int i3 = year1.getYear();
        year1.setYear((int) (short) -1);
        boolean b6 = year1.isLeap();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test293");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        boolean b5 = date3.equals((java.lang.Object) (-1));
        date3.increment();
        date3.increment();
        date3.increment();
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test294");
        Year year1 = new Year(1);
        boolean b2 = year1.isLeap();
        boolean b3 = year1.isLeap();
        boolean b4 = year1.increment();
        java.lang.Object obj5 = null;
        boolean b6 = year1.equals(obj5);
        int i7 = year1.getYear();
        boolean b8 = year1.increment();
        boolean b9 = year1.isLeap();
        boolean b10 = year1.increment();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test295");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        Year year8 = date3.getYear();
        Date date9 = Nextday.nextDay(date3);
        date3.printDate();
        Day day11 = date3.getDay();
        java.lang.String str12 = date3.toString();
    }

    @Test
    public void test296() throws Throwable {
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
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test297");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Month month7 = date3.getMonth();
        date3.printDate();
        java.lang.String str9 = date3.toString();
        Month month10 = date3.getMonth();
        Day day11 = date3.getDay();
        date3.increment();
        Month month13 = date3.getMonth();
    }

    @Test
    public void test298() throws Throwable {
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
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test299");
        try {
            Date date3 = new Date(35, 33, 101);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test300");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.increment();
        boolean b5 = year2.increment();
        boolean b6 = year2.isLeap();
        int i7 = year2.getYear();
        Month month8 = new Month(1, year2);
        boolean b9 = year2.isValid();
        int i10 = year2.getYear();
    }

    @Test
    public void test301() throws Throwable {
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
    public void test302() throws Throwable {
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
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test303");
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
        boolean b32 = year28.isValid();
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test304");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        date3.printDate();
        Year year5 = date3.getYear();
        Date date6 = Nextday.nextDay(date3);
        Date date7 = Nextday.nextDay(date3);
        Day day8 = date7.getDay();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test305");
        Year year1 = new Year(1);
        boolean b2 = year1.isLeap();
        boolean b3 = year1.isLeap();
        year1.setYear(13);
    }

    @Test
    public void test306() throws Throwable {
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
    public void test307() throws Throwable {
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
    public void test308() throws Throwable {
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
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test309");
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
        date9.printDate();
    }

    @Test
    public void test310() throws Throwable {
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
    public void test311() throws Throwable {
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
    public void test312() throws Throwable {
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
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test313");
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
        boolean b38 = year29.increment();
    }

    @Test
    public void test314() throws Throwable {
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
    public void test315() throws Throwable {
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
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test316");
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
        boolean b15 = day9.isValid();
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test317");
        Year year1 = new Year(101);
        boolean b2 = year1.isLeap();
        boolean b3 = year1.isValid();
        boolean b4 = year1.increment();
    }

    @Test
    public void test318() throws Throwable {
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
    public void test319() throws Throwable {
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
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test320");
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
        boolean b20 = day7.increment();
        boolean b21 = day7.increment();
        int i22 = day7.getDay();
        boolean b23 = day7.increment();
        boolean b24 = day7.isValid();
        boolean b25 = day7.increment();
    }

    @Test
    public void test321() throws Throwable {
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
    public void test322() throws Throwable {
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
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test323");
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
        int i29 = month26.getMonth();
        boolean b30 = month26.isValid();
        boolean b31 = month26.isValid();
    }

    @Test
    public void test324() throws Throwable {
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
    public void test325() throws Throwable {
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
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test326");
        try {
            Date date3 = new Date((int) (byte) 1, (int) (short) -1, 13);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test327");
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
        boolean b18 = day17.isValid();
        int i19 = day17.getDay();
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test328");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.increment();
        java.lang.String str8 = date3.toString();
        date3.printDate();
        Month month10 = date3.getMonth();
        Year year11 = date3.getYear();
        Day day12 = date3.getDay();
    }

    @Test
    public void test329() throws Throwable {
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
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test330");
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
        Year year14 = date13.getYear();
        boolean b15 = year14.isValid();
    }

    @Test
    public void test331() throws Throwable {
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
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test332");
        Year year3 = new Year((int) (byte) 100);
        boolean b4 = year3.isValid();
        Month month5 = new Month((int) (short) 10, year3);
        int i6 = month5.getMonth();
        Day day7 = new Day(30, month5);
        boolean b8 = month5.increment();
        boolean b9 = month5.isValid();
        int i10 = month5.getMonth();
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test333");
        try {
            Date date3 = new Date((int) '4', 35, 5);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test334() throws Throwable {
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
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test335");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isValid();
        boolean b4 = year1.isLeap();
        boolean b5 = year1.isLeap();
        int i6 = year1.getYear();
        boolean b7 = year1.increment();
        boolean b8 = year1.increment();
        year1.setYear((int) ' ');
    }

    @Test
    public void test336() throws Throwable {
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
    public void test337() throws Throwable {
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
    public void test338() throws Throwable {
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
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test339");
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
        year1.setYear(101);
    }

    @Test
    public void test340() throws Throwable {
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
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test341");
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
        Date date29 = Nextday.nextDay(date4);
        date4.increment();
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test342");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        int i3 = year1.getYear();
        year1.setYear(100);
        int i6 = year1.getYear();
        int i7 = year1.getYear();
    }

    @Test
    public void test343() throws Throwable {
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
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test344");
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
        boolean b30 = month29.increment();
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test345");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date4 = Nextday.nextDay(date3);
        java.lang.String str5 = date4.toString();
        Month month6 = date4.getMonth();
        boolean b7 = month6.isValid();
        int i8 = month6.getMonthSize();
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test346");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.printDate();
        Year year8 = date3.getYear();
        Month month9 = date3.getMonth();
        int i10 = month9.getMonth();
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test347");
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
        int i17 = month16.getMonth();
        try {
            Day day18 = new Day((int) (short) 0, month16);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test348() throws Throwable {
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
    public void test349() throws Throwable {
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
    public void test350() throws Throwable {
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
    public void test351() throws Throwable {
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
    public void test352() throws Throwable {
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
    public void test353() throws Throwable {
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
    public void test354() throws Throwable {
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
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test355");
        try {
            Date date3 = new Date(97, 101, 102);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test356() throws Throwable {
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
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test357");
        Date date3 = new Date(12, (int) (byte) 10, (int) ' ');
    }

    @Test
    public void test358() throws Throwable {
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
    public void test359() throws Throwable {
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
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test360");
        Year year1 = new Year((int) (byte) 100);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = year1.equals(obj2);
        Date date7 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year8 = date7.getYear();
        boolean b10 = date7.equals((java.lang.Object) "hi!");
        Month month11 = date7.getMonth();
        boolean b12 = year1.equals((java.lang.Object) date7);
        Day day13 = date7.getDay();
        boolean b14 = day13.isValid();
        boolean b15 = day13.increment();
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test361");
        Year year3 = new Year((int) (byte) 100);
        boolean b4 = year3.isValid();
        Month month5 = new Month((int) (short) 10, year3);
        boolean b7 = month5.equals((java.lang.Object) 10L);
        boolean b8 = month5.isValid();
        boolean b9 = month5.increment();
        try {
            Day day10 = new Day((int) (short) 100, month5);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test362() throws Throwable {
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
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test363");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.increment();
        boolean b4 = year1.isLeap();
        boolean b5 = year1.isLeap();
        boolean b6 = year1.isValid();
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test364");
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
        Year year26 = new Year(1);
        boolean b27 = year26.isValid();
        boolean b28 = year26.isValid();
        boolean b29 = year26.isLeap();
        boolean b30 = year26.isLeap();
        int i31 = year26.getYear();
        boolean b32 = year26.increment();
        boolean b33 = year26.increment();
        boolean b34 = year26.increment();
        Month month35 = new Month(4, year26);
        day7.setDay(13, month35);
        boolean b37 = month35.isValid();
    }

    @Test
    public void test365() throws Throwable {
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
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test366");
        Year year3 = new Year((int) (byte) 100);
        boolean b4 = year3.isValid();
        Month month5 = new Month((int) (short) 10, year3);
        boolean b7 = year3.equals((java.lang.Object) (short) -1);
        year3.setYear(101);
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
        boolean b30 = day17.isValid();
        Year year33 = new Year(1);
        boolean b34 = year33.isValid();
        boolean b35 = year33.isValid();
        boolean b36 = year33.isValid();
        boolean b37 = year33.isValid();
        int i38 = year33.getYear();
        Month month39 = new Month((int) (short) 10, year33);
        boolean b40 = year33.increment();
        boolean b41 = day17.equals((java.lang.Object) b40);
        boolean b42 = day17.increment();
        boolean b43 = year3.equals((java.lang.Object) b42);
        try {
            Month month44 = new Month(33, year3);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test367");
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
        boolean b29 = day28.isValid();
    }

    @Test
    public void test368() throws Throwable {
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
    public void test369() throws Throwable {
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
    public void test370() throws Throwable {
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
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test371");
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
        java.lang.String str15 = date3.toString();
        Date date16 = Nextday.nextDay(date3);
        date3.increment();
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test372");
        try {
            Date date3 = new Date(35, 2, (int) (byte) -1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test373() throws Throwable {
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
    public void test374() throws Throwable {
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
    public void test375() throws Throwable {
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
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test376");
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
        Day day28 = date3.getDay();
        date3.increment();
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test377");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        boolean b9 = date3.equals((java.lang.Object) (short) 100);
        Date date10 = Nextday.nextDay(date3);
        date10.increment();
        Month month12 = date10.getMonth();
        Month month13 = date10.getMonth();
        Date date14 = Nextday.nextDay(date10);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test378");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.increment();
        java.lang.String str8 = date3.toString();
        java.lang.String str9 = date3.toString();
        Date date10 = Nextday.nextDay(date3);
        Day day11 = date10.getDay();
        Date date12 = Nextday.nextDay(date10);
        Month month13 = date10.getMonth();
    }

    @Test
    public void test379() throws Throwable {
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
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test380");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isValid();
        boolean b4 = year1.isLeap();
        boolean b5 = year1.increment();
        int i6 = year1.getYear();
        boolean b7 = year1.increment();
        boolean b8 = year1.isValid();
        int i9 = year1.getYear();
        int i10 = year1.getYear();
        int i11 = year1.getYear();
    }

    @Test
    public void test381() throws Throwable {
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
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test382");
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
        boolean b20 = day7.isValid();
        int i21 = day7.getDay();
    }

    @Test
    public void test383() throws Throwable {
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
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test384");
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
        Year year15 = date10.getYear();
    }

    @Test
    public void test385() throws Throwable {
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
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test386");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        boolean b9 = date3.equals((java.lang.Object) (short) 100);
        Year year10 = date3.getYear();
        Date date11 = Nextday.nextDay(date3);
        java.lang.String str12 = date3.toString();
        Month month13 = date3.getMonth();
        date3.printDate();
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test387");
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
        boolean b18 = day7.increment();
        Date date22 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date23 = Nextday.nextDay(date22);
        date22.increment();
        date22.increment();
        boolean b26 = day7.equals((java.lang.Object) date22);
        boolean b27 = day7.isValid();
        boolean b28 = day7.increment();
        int i29 = day7.getDay();
    }

    @Test
    public void test388() throws Throwable {
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
    public void test389() throws Throwable {
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
    public void test390() throws Throwable {
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
    public void test391() throws Throwable {
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
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test392");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isValid();
        boolean b5 = year2.isValid();
        boolean b6 = year2.isValid();
        Month month7 = new Month(12, year2);
        boolean b8 = year2.increment();
        boolean b9 = year2.isLeap();
    }

    @Test
    public void test393() throws Throwable {
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
    public void test394() throws Throwable {
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
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test395");
        Date date3 = new Date((int) (byte) 1, (int) (short) 1, (int) (short) -1);
        Year year4 = date3.getYear();
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test396");
        Year year1 = new Year(1);
        boolean b2 = year1.isLeap();
        boolean b3 = year1.isLeap();
        boolean b4 = year1.increment();
        java.lang.Object obj5 = null;
        boolean b6 = year1.equals(obj5);
        int i7 = year1.getYear();
        boolean b8 = year1.isLeap();
        boolean b9 = year1.isLeap();
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test397");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Month month7 = date3.getMonth();
        Day day8 = date3.getDay();
        Date date9 = Nextday.nextDay(date3);
        Year year10 = date3.getYear();
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test398");
        Year year1 = new Year((int) (short) 100);
        boolean b2 = year1.isValid();
        int i3 = year1.getYear();
        boolean b4 = year1.isValid();
        boolean b5 = year1.isLeap();
    }

    @Test
    public void test399() throws Throwable {
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
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test400");
        Year year1 = new Year((int) '4');
        int i2 = year1.getYear();
    }

    @Test
    public void test401() throws Throwable {
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
    public void test402() throws Throwable {
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
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test403");
        Year year3 = new Year((int) (byte) 100);
        boolean b4 = year3.isValid();
        Month month5 = new Month((int) (short) 10, year3);
        boolean b6 = month5.increment();
        int i7 = month5.getMonth();
        int i8 = month5.getMonth();
        Day day9 = new Day((int) (byte) 1, month5);
        boolean b10 = day9.increment();
        int i11 = day9.getDay();
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test404");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year5 = date4.getYear();
        Year year8 = new Year((int) (byte) 100);
        boolean b9 = year8.isValid();
        Month month10 = new Month((int) (short) 10, year8);
        boolean b11 = month10.increment();
        boolean b12 = date4.equals((java.lang.Object) month10);
        Day day13 = new Day(3, month10);
        boolean b14 = day13.isValid();
        int i15 = day13.getDay();
    }

    @Test
    public void test405() throws Throwable {
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
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test406");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        date3.printDate();
        Year year5 = date3.getYear();
        Day day6 = date3.getDay();
        Day day7 = date3.getDay();
        date3.printDate();
        date3.printDate();
    }

    @Test
    public void test407() throws Throwable {
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
    public void test408() throws Throwable {
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
    public void test409() throws Throwable {
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
    public void test410() throws Throwable {
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
    public void test411() throws Throwable {
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
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test412");
        Year year1 = new Year(1);
        boolean b2 = year1.isLeap();
        boolean b3 = year1.isValid();
        boolean b4 = year1.isLeap();
    }

    @Test
    public void test413() throws Throwable {
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
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test414");
        Year year1 = new Year(1);
        boolean b2 = year1.isLeap();
        boolean b3 = year1.isLeap();
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = year1.equals(obj4);
        boolean b6 = year1.isValid();
        int i7 = year1.getYear();
        year1.setYear((int) 'a');
        boolean b10 = year1.isLeap();
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test415");
        Year year3 = new Year(1);
        boolean b4 = year3.isLeap();
        boolean b5 = year3.isLeap();
        boolean b6 = year3.increment();
        Month month7 = new Month((int) (short) 1, year3);
        Date date11 = new Date(10, (int) (byte) 10, (int) (short) 1);
        java.lang.String str12 = date11.toString();
        boolean b13 = month7.equals((java.lang.Object) date11);
        Day day14 = new Day((int) (byte) 10, month7);
        Year year17 = new Year(1);
        boolean b18 = year17.isLeap();
        boolean b19 = year17.isLeap();
        Date date23 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year24 = date23.getYear();
        boolean b26 = date23.equals((java.lang.Object) "hi!");
        date23.increment();
        java.lang.String str28 = date23.toString();
        boolean b29 = year17.equals((java.lang.Object) date23);
        Month month30 = new Month((int) (short) 10, year17);
        boolean b31 = year17.isLeap();
        boolean b32 = day14.equals((java.lang.Object) year17);
        year17.setYear((int) (short) 100);
        boolean b35 = year17.isValid();
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test416");
        Date date3 = new Date(10, 3, 33);
        Year year4 = date3.getYear();
        Year year5 = date3.getYear();
        year5.setYear(53);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test417");
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
        int i27 = month7.getMonthSize();
    }

    @Test
    public void test418() throws Throwable {
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
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test419");
        try {
            Date date3 = new Date(32, (int) 'a', 53);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test420() throws Throwable {
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
    public void test421() throws Throwable {
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
    public void test422() throws Throwable {
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
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test423");
        Year year3 = new Year((int) (byte) 100);
        boolean b4 = year3.isValid();
        Month month5 = new Month((int) (short) 10, year3);
        int i6 = month5.getMonth();
        Day day7 = new Day(30, month5);
        int i8 = month5.getMonth();
        boolean b9 = month5.isValid();
        int i10 = month5.getMonth();
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test424");
        Year year1 = new Year((int) (short) 1);
        boolean b2 = year1.isLeap();
        boolean b3 = year1.isLeap();
        boolean b4 = year1.isValid();
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test425");
        Year year4 = new Year((int) (byte) 100);
        boolean b5 = year4.isValid();
        Month month6 = new Month((int) (short) 10, year4);
        boolean b7 = month6.increment();
        int i8 = month6.getMonthSize();
        boolean b9 = month6.isValid();
        Day day10 = new Day(10, month6);
        Day day11 = new Day(12, month6);
        boolean b12 = month6.increment();
        boolean b13 = month6.increment();
        try {
            int i14 = month6.getMonthSize();
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test426");
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
        Year year16 = new Year(1);
        boolean b17 = year16.isLeap();
        boolean b18 = year16.isLeap();
        java.lang.Object obj19 = new java.lang.Object();
        boolean b20 = year16.equals(obj19);
        boolean b21 = date5.equals((java.lang.Object) year16);
        boolean b22 = year16.increment();
    }

    @Test
    public void test427() throws Throwable {
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
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test428");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        Day day5 = date3.getDay();
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test429");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date4 = Nextday.nextDay(date3);
        Day day5 = date4.getDay();
        Year year6 = date4.getYear();
        Month month7 = date4.getMonth();
        Year year8 = date4.getYear();
        Year year9 = date4.getYear();
        boolean b10 = year9.isLeap();
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test430");
        Year year1 = new Year((int) (short) 1);
        boolean b2 = year1.isLeap();
        year1.setYear(31);
        int i5 = year1.getYear();
        boolean b6 = year1.increment();
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test431");
        try {
            Date date3 = new Date(4, (int) (byte) -1, 102);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test432");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.increment();
        date3.printDate();
        date3.printDate();
        Date date10 = Nextday.nextDay(date3);
        date3.increment();
    }

    @Test
    public void test433() throws Throwable {
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
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test434");
        Year year4 = new Year(52);
        Month month5 = new Month((int) (short) 10, year4);
        Month month6 = new Month(5, year4);
        Day day7 = new Day((int) (short) 10, month6);
        boolean b8 = day7.isValid();
    }

    @Test
    public void test435() throws Throwable {
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
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test436");
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
        int i18 = day14.getDay();
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test437");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        int i4 = year2.getYear();
        year2.setYear(100);
        int i7 = year2.getYear();
        boolean b8 = year2.increment();
        try {
            Month month9 = new Month(35, year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test438");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        boolean b9 = date3.equals((java.lang.Object) (short) 100);
        java.lang.String str10 = date3.toString();
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test439");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        date3.printDate();
        Year year5 = date3.getYear();
        date3.printDate();
        java.lang.String str7 = date3.toString();
        Day day8 = date3.getDay();
        boolean b9 = day8.increment();
        int i10 = day8.getDay();
        boolean b11 = day8.increment();
        int i12 = day8.getDay();
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test440");
        try {
            Date date3 = new Date(2, 33, (int) (byte) 1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test441");
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
        boolean b26 = month25.isValid();
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test442");
        Date date3 = new Date((int) (short) 10, 11, (int) (short) 100);
        Day day4 = date3.getDay();
        Year year8 = new Year((int) (byte) 100);
        boolean b9 = year8.isValid();
        Month month10 = new Month((int) (short) 10, year8);
        int i11 = month10.getMonth();
        Year year14 = new Year((int) (short) 1);
        boolean b15 = year14.isLeap();
        month10.setMonth((int) (short) 10, year14);
        int i17 = month10.getMonthSize();
        boolean b18 = month10.isValid();
        boolean b19 = month10.increment();
        int i20 = month10.getMonth();
        int i21 = month10.getMonth();
        day4.setDay(12, month10);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test443");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date5 = Nextday.nextDay(date4);
        Day day6 = date5.getDay();
        Year year7 = date5.getYear();
        Year year8 = date5.getYear();
        try {
            Month month9 = new Month((int) (short) 100, year8);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test444() throws Throwable {
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
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test445");
        Date date5 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year6 = date5.getYear();
        boolean b8 = date5.equals((java.lang.Object) "hi!");
        Month month9 = date5.getMonth();
        int i10 = month9.getMonthSize();
        int i11 = month9.getMonthSize();
        int i12 = month9.getMonth();
        Day day13 = new Day((int) (short) 1, month9);
        try {
            Day day14 = new Day(0, month9);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test446");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        Year year9 = new Year((int) (byte) 100);
        int i10 = year9.getYear();
        boolean b11 = date3.equals((java.lang.Object) year9);
        Year year12 = date3.getYear();
        Month month13 = date3.getMonth();
        int i14 = month13.getMonthSize();
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test447");
        Year year1 = new Year(1);
        boolean b2 = year1.isLeap();
        int i3 = year1.getYear();
        year1.setYear(100);
        int i6 = year1.getYear();
        boolean b7 = year1.isValid();
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test448");
        Date date3 = new Date((int) (short) 10, 11, (int) (short) 100);
        java.lang.String str4 = date3.toString();
        date3.printDate();
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test449");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year5 = date4.getYear();
        boolean b7 = date4.equals((java.lang.Object) "hi!");
        date4.printDate();
        Year year9 = date4.getYear();
        date4.increment();
        Date date11 = Nextday.nextDay(date4);
        Year year12 = date4.getYear();
        Month month13 = date4.getMonth();
        boolean b14 = month13.isValid();
        boolean b15 = month13.increment();
        Day day16 = new Day(12, month13);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test450");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.increment();
        date3.increment();
        Month month9 = date3.getMonth();
        Day day10 = date3.getDay();
        Year year12 = new Year(1);
        boolean b13 = year12.isLeap();
        boolean b14 = year12.isValid();
        int i15 = year12.getYear();
        year12.setYear(31);
        boolean b18 = day10.equals((java.lang.Object) year12);
    }

    @Test
    public void test451() throws Throwable {
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
    public void test452() throws Throwable {
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
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test453");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        boolean b5 = date3.equals((java.lang.Object) (-1));
        Date date6 = Nextday.nextDay(date3);
    }

    @Test
    public void test454() throws Throwable {
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
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test455");
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
        Year year19 = new Year(1);
        boolean b20 = year19.isValid();
        boolean b21 = year19.isValid();
        boolean b22 = year19.isValid();
        boolean b23 = year19.isValid();
        int i24 = year19.getYear();
        Month month25 = new Month((int) (short) 10, year19);
        int i26 = month25.getMonth();
        boolean b27 = month25.isValid();
        boolean b28 = month25.isValid();
        boolean b29 = month25.isValid();
        boolean b30 = month25.increment();
        try {
            day14.setDay((int) 'a', month25);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test456");
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
        year11.setYear(3);
        boolean b21 = year11.increment();
    }

    @Test
    public void test457() throws Throwable {
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
    public void test458() throws Throwable {
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
    public void test459() throws Throwable {
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
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test460");
        Year year1 = new Year(5);
        java.lang.Object obj2 = null;
        boolean b3 = year1.equals(obj2);
    }

    @Test
    public void test461() throws Throwable {
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
    public void test462() throws Throwable {
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
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test463");
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
        int i29 = month8.getMonthSize();
    }

    @Test
    public void test464() throws Throwable {
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
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test465");
        try {
            Date date3 = new Date(97, 5, 31);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test466");
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
        boolean b23 = month9.isValid();
        int i24 = month9.getMonthSize();
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test467");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        date3.printDate();
        Year year5 = date3.getYear();
        date3.printDate();
        java.lang.String str7 = date3.toString();
        Day day8 = date3.getDay();
        Date date9 = Nextday.nextDay(date3);
        Year year10 = date9.getYear();
        boolean b11 = year10.isLeap();
    }

    @Test
    public void test468() throws Throwable {
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
    public void test469() throws Throwable {
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
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test470");
        try {
            Date date3 = new Date((-1), 1, 30);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test471() throws Throwable {
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
    public void test472() throws Throwable {
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
    public void test473() throws Throwable {
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
    public void test474() throws Throwable {
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
    public void test475() throws Throwable {
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
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test476");
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
        Year year18 = new Year(1);
        boolean b19 = year18.isValid();
        boolean b20 = year18.isLeap();
        int i21 = year18.getYear();
        boolean b22 = year18.isLeap();
        Month month23 = new Month((int) (byte) 1, year18);
        int i24 = month23.getMonthSize();
        boolean b25 = month23.increment();
        int i26 = month23.getMonth();
        boolean b27 = month23.isValid();
        try {
            day14.setDay((int) (byte) 100, month23);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test477() throws Throwable {
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
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test478");
        Year year1 = new Year(1);
        int i2 = year1.getYear();
        boolean b3 = year1.isValid();
        int i4 = year1.getYear();
        boolean b5 = year1.isValid();
    }

    @Test
    public void test479() throws Throwable {
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
    public void test480() throws Throwable {
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
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test481");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        java.lang.String str4 = date3.toString();
        Date date5 = Nextday.nextDay(date3);
        Day day6 = date5.getDay();
    }

    @Test
    public void test482() throws Throwable {
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
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test483");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Month month7 = date3.getMonth();
        Day day8 = date3.getDay();
        Year year9 = date3.getYear();
        Day day10 = date3.getDay();
        int i11 = day10.getDay();
    }

    @Test
    public void test484() throws Throwable {
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
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test485");
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
        Day day20 = date3.getDay();
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test486");
        try {
            Date date3 = new Date(28, 0, 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test487");
        Year year2 = new Year(1);
        boolean b3 = year2.isLeap();
        boolean b4 = year2.isLeap();
        boolean b5 = year2.increment();
        boolean b6 = year2.isLeap();
        boolean b7 = year2.isValid();
        boolean b8 = year2.isLeap();
        Month month9 = new Month(5, year2);
        boolean b10 = year2.increment();
    }

    @Test
    public void test488() throws Throwable {
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
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test489");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year5 = date4.getYear();
        boolean b7 = date4.equals((java.lang.Object) "hi!");
        Day day8 = date4.getDay();
        int i9 = day8.getDay();
        Year year13 = new Year((int) (byte) 100);
        boolean b14 = year13.isValid();
        Month month15 = new Month((int) (short) 10, year13);
        boolean b17 = month15.equals((java.lang.Object) 10L);
        boolean b18 = month15.isValid();
        int i19 = month15.getMonthSize();
        day8.setDay(3, month15);
        Day day21 = new Day(2, month15);
        boolean b22 = day21.increment();
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test490");
        Year year1 = new Year(14);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test491");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Day day7 = date3.getDay();
        Month month8 = date3.getMonth();
        Day day9 = date3.getDay();
        Month month10 = date3.getMonth();
        Year year11 = date3.getYear();
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test492");
        try {
            Date date3 = new Date(53, (-1), (int) (short) -1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test493() throws Throwable {
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
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test494");
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
        java.lang.Object obj38 = null;
        boolean b39 = year1.equals(obj38);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test495");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b6 = month4.equals((java.lang.Object) 10L);
        boolean b7 = month4.isValid();
        int i8 = month4.getMonthSize();
        int i9 = month4.getMonth();
        boolean b10 = month4.increment();
        boolean b11 = month4.increment();
        int i12 = month4.getMonthSize();
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test496");
        try {
            Date date3 = new Date(32, 97, (int) 'a');
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test497");
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
        boolean b23 = year16.isValid();
    }

    @Test
    public void test498() throws Throwable {
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
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test499");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Month month7 = date3.getMonth();
        date3.printDate();
        java.lang.String str9 = date3.toString();
        Date date10 = Nextday.nextDay(date3);
    }

    @Test
    public void test500() throws Throwable {
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
}

