import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        Month month1 = null;
        try {
            Day day2 = new Day(0, month1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        Month month1 = null;
        try {
            Day day2 = new Day((int) 'a', month1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        Date date0 = null;
        try {
            Date date1 = Nextday.nextDay(date0);
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        Year year1 = null;
        try {
            Month month2 = new Month(0, year1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        Nextday nextday0 = new Nextday();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        try {
            Date date3 = new Date((int) '4', (int) (short) -1, (int) (short) 10);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        try {
            Date date3 = new Date((int) (byte) -1, 1, (int) (byte) 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
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
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        try {
            Date date3 = new Date((int) (short) 0, (int) (short) 1, (int) '4');
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isValid();
        boolean b5 = year2.isLeap();
        try {
            Month month6 = new Month((int) (byte) -1, year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        Year year2 = new Year((int) (byte) 100);
        try {
            Month month3 = new Month((int) ' ', year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
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
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        try {
            Date date3 = new Date(0, (int) (byte) 10, (int) (byte) -1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        try {
            Date date3 = new Date((int) '4', (int) '4', 100);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        Month month1 = null;
        try {
            Day day2 = new Day((int) (short) 0, month1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isValid();
        int i5 = year2.getYear();
        try {
            Month month6 = new Month((int) (byte) -1, year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        Year year1 = null;
        try {
            Month month2 = new Month((int) (byte) 1, year1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test018() throws Throwable {
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
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        try {
            Date date3 = new Date((int) (byte) 100, (-1), 1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isValid();
        int i5 = year2.getYear();
        try {
            Month month6 = new Month((int) (byte) 100, year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test021() throws Throwable {
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
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        Month month1 = null;
        try {
            Day day2 = new Day((int) (short) 1, month1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test023() throws Throwable {
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
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        try {
            Date date3 = new Date((int) '#', (int) '#', 2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
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
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
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
    public void test027() throws Throwable {
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
    public void test028() throws Throwable {
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
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        try {
            Year year1 = new Year(0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test030() throws Throwable {
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
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
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
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        try {
            Date date3 = new Date(31, 2, (int) 'a');
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test033() throws Throwable {
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
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        try {
            Date date3 = new Date((-1), 10, 2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test035() throws Throwable {
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
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
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
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        Month month1 = null;
        try {
            Day day2 = new Day((int) ' ', month1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Day day7 = date3.getDay();
        Year year11 = new Year((int) (byte) 100);
        boolean b12 = year11.isValid();
        Month month13 = new Month((int) (short) 10, year11);
        boolean b15 = month13.equals((java.lang.Object) 10L);
        boolean b16 = month13.isValid();
        try {
            day7.setDay((int) (byte) 100, month13);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
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
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        Month month1 = null;
        try {
            Day day2 = new Day((int) '4', month1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test041() throws Throwable {
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
    public void test042() throws Throwable {
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
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        boolean b4 = year2.increment();
        try {
            Month month5 = new Month((int) (byte) 0, year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test044() throws Throwable {
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
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        Year year2 = new Year((int) (short) 1);
        try {
            Month month3 = new Month((int) 'a', year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        try {
            Date date3 = new Date((int) '4', (int) '#', 2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
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
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        try {
            Date date3 = new Date(0, 10, 1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        try {
            Date date3 = new Date(0, (int) ' ', 1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
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
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
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
        boolean b17 = month16.increment();
        try {
            day9.setDay((int) (byte) 100, month16);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
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
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        try {
            Date date3 = new Date((int) (byte) 1, 10, (int) (short) 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test054() throws Throwable {
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
    public void test055() throws Throwable {
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
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        try {
            Date date3 = new Date(10, 0, 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        Year year1 = null;
        try {
            Month month2 = new Month((int) 'a', year1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isValid();
        boolean b4 = year1.isValid();
        boolean b5 = year1.isValid();
        boolean b6 = year1.isValid();
        year1.setYear((int) ' ');
        int i9 = year1.getYear();
        try {
            year1.setYear((int) (byte) 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        Year year1 = new Year(1);
        boolean b2 = year1.isLeap();
        int i3 = year1.getYear();
        year1.setYear(100);
        boolean b6 = year1.isLeap();
        try {
            year1.setYear(0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        try {
            Date date3 = new Date(1, 31, (int) (byte) 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test061() throws Throwable {
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
    public void test062() throws Throwable {
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
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        Year year1 = null;
        try {
            Month month2 = new Month(11, year1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test064() throws Throwable {
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
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b5 = month4.increment();
        Year year8 = new Year(1);
        boolean b9 = year8.isLeap();
        int i10 = year8.getYear();
        try {
            month4.setMonth((int) (short) 0, year8);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
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
    public void test067() throws Throwable {
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
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Month month7 = date3.getMonth();
        Day day8 = date3.getDay();
        Date date13 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date14 = Nextday.nextDay(date13);
        Year year18 = new Year(1);
        boolean b19 = year18.isValid();
        boolean b20 = year18.isLeap();
        int i21 = year18.getYear();
        boolean b22 = year18.isLeap();
        Month month23 = new Month((int) (byte) 1, year18);
        Day day24 = new Day(31, month23);
        boolean b25 = day24.isValid();
        Year year29 = new Year((int) (byte) 100);
        boolean b30 = year29.isValid();
        Month month31 = new Month((int) (short) 10, year29);
        boolean b33 = month31.equals((java.lang.Object) 10L);
        int i34 = month31.getMonth();
        boolean b35 = month31.isValid();
        day24.setDay((int) (short) 1, month31);
        boolean b37 = date14.equals((java.lang.Object) month31);
        try {
            day8.setDay(0, month31);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test069() throws Throwable {
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
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        try {
            Date date3 = new Date((int) (byte) 10, (int) (short) 100, (-1));
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test071() throws Throwable {
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
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        try {
            Year year1 = new Year((int) (byte) 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test073() throws Throwable {
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
    public void test074() throws Throwable {
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
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
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
            day7.setDay((int) (short) -1, month28);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        try {
            Date date3 = new Date((int) (byte) 100, (int) (short) -1, 32);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test077() throws Throwable {
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
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
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
    public void test079() throws Throwable {
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
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        Year year3 = new Year((int) (byte) 100);
        boolean b4 = year3.isValid();
        Month month5 = new Month((int) (short) 10, year3);
        try {
            Day day6 = new Day((int) '4', month5);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        try {
            Date date3 = new Date((int) (short) 100, (int) (short) -1, 10);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        boolean b6 = date4.equals((java.lang.Object) (-1));
        Year year7 = date4.getYear();
        try {
            Month month8 = new Month((int) (short) -1, year7);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        try {
            Date date3 = new Date(1, (int) (byte) 0, (int) '#');
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        try {
            Date date3 = new Date((int) (short) 0, (int) (byte) 1, 1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isLeap();
        int i5 = year2.getYear();
        boolean b6 = year2.isLeap();
        Month month7 = new Month((int) (byte) 1, year2);
        int i8 = month7.getMonthSize();
        int i9 = month7.getMonthSize();
        Year year12 = new Year((int) (short) 100);
        boolean b13 = year12.increment();
        Year year15 = new Year(1);
        boolean b16 = year15.isValid();
        int i17 = year15.getYear();
        year15.setYear(100);
        boolean b20 = year12.equals((java.lang.Object) year15);
        try {
            month7.setMonth((-1), year12);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test086() throws Throwable {
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
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
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
    public void test088() throws Throwable {
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
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
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
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
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
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
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
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        try {
            Date date3 = new Date(32, 30, (int) (short) 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test093() throws Throwable {
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
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
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
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        try {
            Date date3 = new Date((int) (byte) -1, 31, 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
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
        try {
            Month month14 = new Month(0, year3);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        try {
            Date date3 = new Date(30, 1, 11);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        try {
            Date date3 = new Date(1, 30, (int) (short) 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        boolean b5 = date3.equals((java.lang.Object) (-1));
        Year year6 = date3.getYear();
        java.lang.String str7 = date3.toString();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
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
    public void test101() throws Throwable {
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
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        try {
            Date date3 = new Date(31, 0, 100);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test103() throws Throwable {
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
    public void test104() throws Throwable {
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
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Month month7 = date3.getMonth();
        Day day8 = date3.getDay();
        Date date13 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year14 = date13.getYear();
        boolean b16 = date13.equals((java.lang.Object) "hi!");
        java.lang.String str17 = date13.toString();
        boolean b19 = date13.equals((java.lang.Object) (short) 100);
        Year year20 = date13.getYear();
        Month month21 = date13.getMonth();
        boolean b22 = month21.isValid();
        try {
            day8.setDay((int) (short) 100, month21);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
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
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        try {
            Date date3 = new Date((int) ' ', (-1), 2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test108() throws Throwable {
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
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        Month month1 = null;
        try {
            Day day2 = new Day((int) (byte) -1, month1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test110() throws Throwable {
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
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        try {
            Date date3 = new Date((int) (byte) 0, 10, (int) (byte) -1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
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
        Year year23 = new Year(1);
        boolean b24 = year23.isValid();
        boolean b25 = year23.isValid();
        boolean b26 = year23.isValid();
        boolean b27 = year23.isValid();
        int i28 = year23.getYear();
        Month month29 = new Month((int) (short) 10, year23);
        int i30 = month29.getMonth();
        boolean b31 = month29.isValid();
        boolean b32 = month29.isValid();
        boolean b33 = month29.isValid();
        try {
            day7.setDay(32, month29);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        Year year1 = new Year(1);
        boolean b2 = year1.isLeap();
        int i3 = year1.getYear();
        boolean b4 = year1.isValid();
        int i5 = year1.getYear();
        int i6 = year1.getYear();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
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
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
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
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
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
        Month month14 = new Month((int) (short) 1, year3);
        Year year17 = new Year(1);
        boolean b18 = year17.isLeap();
        int i19 = year17.getYear();
        boolean b20 = year17.isValid();
        int i21 = year17.getYear();
        try {
            month14.setMonth((int) (byte) 0, year17);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        date3.printDate();
        Year year6 = date3.getYear();
        date3.increment();
    }

    @Test
    public void test118() throws Throwable {
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
    public void test119() throws Throwable {
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
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
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
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        try {
            Date date3 = new Date((int) '4', (int) (byte) -1, 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        try {
            Date date3 = new Date((int) '#', 100, (int) ' ');
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test123() throws Throwable {
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
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        boolean b9 = date3.equals((java.lang.Object) (short) 100);
        Year year10 = date3.getYear();
        Date date11 = Nextday.nextDay(date3);
        Day day12 = date3.getDay();
        Year year16 = new Year((int) (byte) 100);
        boolean b17 = year16.isValid();
        Month month18 = new Month((int) (short) 10, year16);
        int i19 = month18.getMonth();
        Year year22 = new Year((int) (short) 1);
        boolean b23 = year22.isLeap();
        month18.setMonth((int) (short) 10, year22);
        try {
            day12.setDay(0, month18);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test125() throws Throwable {
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
    public void test126() throws Throwable {
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
    public void test127() throws Throwable {
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
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        try {
            Date date3 = new Date(31, 101, (int) (short) 100);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
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
        try {
            Day day14 = new Day((int) (byte) 0, month11);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        try {
            Date date3 = new Date((int) ' ', 32, 1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        Year year2 = new Year((int) (byte) 100);
        Month month3 = new Month((int) (short) 1, year2);
        boolean b4 = month3.isValid();
        boolean b5 = month3.increment();
    }

    @Test
    public void test132() throws Throwable {
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
    public void test133() throws Throwable {
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
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
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
    public void test135() throws Throwable {
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
    public void test136() throws Throwable {
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
    public void test137() throws Throwable {
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
    public void test138() throws Throwable {
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
    public void test139() throws Throwable {
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
    public void test140() throws Throwable {
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
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
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
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        try {
            Year year1 = new Year((int) (short) 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        try {
            Date date3 = new Date(11, (int) (byte) 100, 3);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
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
            Month month14 = new Month(0, year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test145() throws Throwable {
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
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isValid();
        boolean b4 = year1.isValid();
        boolean b5 = year1.isValid();
        int i6 = year1.getYear();
        boolean b7 = year1.increment();
        boolean b8 = year1.increment();
        boolean b9 = year1.isLeap();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        try {
            Date date3 = new Date(11, (int) (short) 100, 101);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test148() throws Throwable {
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
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b6 = month4.equals((java.lang.Object) 10L);
        Year year10 = new Year(1);
        boolean b11 = year10.isValid();
        boolean b12 = year10.isValid();
        boolean b13 = year10.isValid();
        boolean b14 = year10.isValid();
        int i15 = year10.getYear();
        Month month16 = new Month((int) (short) 10, year10);
        boolean b17 = year10.increment();
        try {
            month4.setMonth((-1), year10);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test150() throws Throwable {
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
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
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
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        Year year1 = new Year(1);
        boolean b2 = year1.increment();
        int i3 = year1.getYear();
        boolean b4 = year1.isLeap();
    }

    @Test
    public void test153() throws Throwable {
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
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
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
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Month month7 = date3.getMonth();
        Day day8 = date3.getDay();
        Year year10 = new Year((int) (short) 1);
        boolean b11 = date3.equals((java.lang.Object) year10);
        int i12 = year10.getYear();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
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
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        try {
            Date date3 = new Date(10, 52, 52);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
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
        Year year17 = new Year(1);
        boolean b18 = year17.isValid();
        boolean b19 = year17.isValid();
        boolean b20 = year17.isValid();
        boolean b21 = year17.isValid();
        int i22 = year17.getYear();
        Month month23 = new Month((int) (short) 10, year17);
        int i24 = month23.getMonth();
        boolean b25 = month23.isValid();
        Year year28 = new Year((int) (byte) 100);
        boolean b29 = year28.isValid();
        Month month30 = new Month((int) (short) 10, year28);
        boolean b31 = month30.increment();
        boolean b32 = month30.increment();
        boolean b33 = month23.equals((java.lang.Object) month30);
        try {
            day9.setDay((int) (short) -1, month30);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test159() throws Throwable {
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
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
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
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        try {
            Date date3 = new Date(100, 0, 30);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test162() throws Throwable {
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
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isValid();
        Month month5 = new Month((int) (short) 10, year2);
        int i6 = month5.getMonthSize();
        int i7 = month5.getMonth();
        boolean b8 = month5.isValid();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        Year year2 = new Year(1);
        boolean b3 = year2.isLeap();
        boolean b5 = year2.equals((java.lang.Object) 100.0f);
        boolean b6 = year2.isLeap();
        try {
            Month month7 = new Month(0, year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test165() throws Throwable {
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
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        Month month1 = null;
        try {
            Day day2 = new Day((-1), month1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test167() throws Throwable {
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
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        try {
            Date date3 = new Date(0, 100, 11);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
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
    public void test170() throws Throwable {
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
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        try {
            Date date3 = new Date(3, 100, (int) 'a');
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
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
        java.lang.Object obj17 = null;
        boolean b18 = year13.equals(obj17);
        int i19 = year13.getYear();
        int i20 = year13.getYear();
        try {
            month4.setMonth(30, year13);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        try {
            Date date3 = new Date((int) ' ', (int) (short) -1, (-1));
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
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
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
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
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        Year year1 = null;
        try {
            Month month2 = new Month(52, year1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test177() throws Throwable {
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
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        Year year3 = new Year(1);
        boolean b4 = year3.isValid();
        boolean b5 = year3.isLeap();
        int i6 = year3.getYear();
        boolean b7 = year3.isLeap();
        Month month8 = new Month((int) (byte) 1, year3);
        Day day9 = new Day(10, month8);
        java.lang.Object obj10 = null;
        boolean b11 = month8.equals(obj10);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b6 = month4.equals((java.lang.Object) 10L);
        boolean b7 = month4.isValid();
        boolean b8 = month4.isValid();
        boolean b9 = month4.increment();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        try {
            Date date3 = new Date(102, (int) (byte) 100, 102);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
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
        Year year19 = new Year(1);
        boolean b20 = year19.isValid();
        boolean b21 = year19.isLeap();
        int i22 = year19.getYear();
        boolean b23 = year19.isLeap();
        Month month24 = new Month((int) (byte) 1, year19);
        Day day25 = new Day(10, month24);
        int i26 = month24.getMonth();
        try {
            day10.setDay((int) (byte) -1, month24);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test182() throws Throwable {
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
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        try {
            Date date3 = new Date(100, 0, (int) (byte) -1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        try {
            Date date3 = new Date((int) (short) 100, 101, (int) (byte) 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
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
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        Year year1 = new Year(1);
        boolean b2 = year1.isLeap();
        boolean b3 = year1.isLeap();
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = year1.equals(obj4);
        boolean b6 = year1.increment();
        boolean b7 = year1.isLeap();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        Date date9 = new Date(10, (int) (byte) 10, (int) (short) 1);
        boolean b11 = date9.equals((java.lang.Object) (-1));
        Year year13 = new Year(1);
        boolean b14 = year13.isValid();
        boolean b15 = year13.isLeap();
        int i16 = year13.getYear();
        boolean b17 = year13.isLeap();
        boolean b18 = year13.isLeap();
        boolean b19 = date9.equals((java.lang.Object) b18);
        Date date20 = Nextday.nextDay(date9);
        Year year21 = date20.getYear();
        try {
            month4.setMonth((int) (byte) 100, year21);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test188() throws Throwable {
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
    public void test189() throws Throwable {
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
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        try {
            Date date3 = new Date(32, (int) '#', 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        try {
            Date date3 = new Date((int) 'a', 32, (int) (short) 1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test192() throws Throwable {
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
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
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
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
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
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        try {
            Date date3 = new Date(0, (int) (byte) -1, 2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
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
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        try {
            Date date3 = new Date((int) (byte) 1, 0, 52);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test198() throws Throwable {
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
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
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
        Year year18 = new Year(1);
        boolean b19 = year18.isValid();
        boolean b20 = year18.isValid();
        boolean b21 = year18.isLeap();
        boolean b22 = year18.increment();
        int i23 = year18.getYear();
        boolean b24 = year18.increment();
        boolean b25 = year18.isLeap();
        boolean b26 = year18.isValid();
        try {
            month15.setMonth(30, year18);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Month month7 = date3.getMonth();
        int i8 = month7.getMonthSize();
        int i9 = month7.getMonthSize();
        Year year11 = null;
        try {
            month7.setMonth((int) (short) 10, year11);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
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
    public void test202() throws Throwable {
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
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
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
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
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
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        try {
            Date date3 = new Date((int) (byte) 0, (int) (byte) -1, 101);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test206() throws Throwable {
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
    public void test207() throws Throwable {
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
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        Year year8 = date3.getYear();
        Date date9 = Nextday.nextDay(date3);
        date3.printDate();
        Year year11 = date3.getYear();
        java.lang.String str12 = date3.toString();
    }

    @Test
    public void test209() throws Throwable {
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
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
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
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
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
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        try {
            Date date3 = new Date((int) (short) -1, 102, 101);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
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
        Year year22 = new Year((int) (byte) 100);
        boolean b23 = year22.isValid();
        Month month24 = new Month((int) (short) 10, year22);
        boolean b26 = month24.equals((java.lang.Object) 10L);
        boolean b27 = month24.isValid();
        boolean b28 = month24.increment();
        try {
            day7.setDay((int) (byte) -1, month24);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test214() throws Throwable {
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
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
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
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
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
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
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
    public void test218() throws Throwable {
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
    public void test219() throws Throwable {
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
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        try {
            Date date3 = new Date((int) '4', 1, 101);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test221() throws Throwable {
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
    public void test222() throws Throwable {
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
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
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
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        try {
            Date date3 = new Date(101, 1, (int) '4');
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test225() throws Throwable {
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
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
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
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        Year year2 = new Year((int) (short) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month(12, year2);
        boolean b5 = year2.isLeap();
    }

    @Test
    public void test228() throws Throwable {
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
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
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
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
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
    public void test231() throws Throwable {
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
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        try {
            Date date3 = new Date(0, 102, (int) (byte) -1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
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
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        try {
            Date date3 = new Date(30, (int) (byte) 0, 12);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year5 = date4.getYear();
        boolean b7 = date4.equals((java.lang.Object) "hi!");
        Month month8 = date4.getMonth();
        int i9 = month8.getMonth();
        try {
            Day day10 = new Day(100, month8);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
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
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        Year year1 = new Year((int) (byte) 100);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = year1.equals(obj2);
        int i4 = year1.getYear();
        boolean b5 = year1.isLeap();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date4 = Nextday.nextDay(date3);
        date3.increment();
        date3.increment();
        date3.printDate();
    }

    @Test
    public void test239() throws Throwable {
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
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
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
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        Year year1 = new Year((int) (byte) 100);
        boolean b2 = year1.isValid();
        int i3 = year1.getYear();
        boolean b4 = year1.isValid();
    }

    @Test
    public void test242() throws Throwable {
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
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        Year year1 = new Year(1);
        year1.setYear(32);
        boolean b4 = year1.isLeap();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
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
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        try {
            Date date3 = new Date((int) '#', (int) (byte) 10, (int) 'a');
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isValid();
        Month month5 = new Month((int) (short) 10, year2);
        year2.setYear((int) 'a');
    }

    @Test
    public void test247() throws Throwable {
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
    public void test248() throws Throwable {
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
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        try {
            Date date3 = new Date(0, (int) (short) 0, 30);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Month month7 = date3.getMonth();
        int i8 = month7.getMonthSize();
        int i9 = month7.getMonthSize();
        Year year12 = new Year(1);
        boolean b13 = year12.isLeap();
        int i14 = year12.getYear();
        year12.setYear(100);
        year12.setYear((int) '4');
        int i19 = year12.getYear();
        try {
            month7.setMonth(102, year12);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b6 = month4.equals((java.lang.Object) 10L);
        Year year8 = new Year(1);
        int i9 = year8.getYear();
        boolean b10 = month4.equals((java.lang.Object) i9);
        boolean b11 = month4.isValid();
        boolean b12 = month4.increment();
        int i13 = month4.getMonthSize();
        Date date18 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date19 = Nextday.nextDay(date18);
        Day day20 = date19.getDay();
        Year year21 = date19.getYear();
        boolean b22 = year21.isValid();
        try {
            month4.setMonth((int) (byte) 100, year21);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test252() throws Throwable {
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
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        Year year2 = new Year(1);
        boolean b3 = year2.isLeap();
        int i4 = year2.getYear();
        year2.setYear(100);
        year2.setYear((int) '4');
        int i9 = year2.getYear();
        try {
            Month month10 = new Month(0, year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        Year year1 = new Year((int) (byte) 100);
        boolean b2 = year1.isValid();
        boolean b3 = year1.increment();
        year1.setYear((int) '4');
        boolean b6 = year1.isLeap();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
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
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
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
        Year year25 = new Year((int) (byte) 100);
        boolean b26 = year25.isValid();
        Month month27 = new Month((int) (short) 10, year25);
        boolean b29 = month27.equals((java.lang.Object) 10L);
        Year year31 = new Year(1);
        boolean b32 = year31.increment();
        boolean b33 = month27.equals((java.lang.Object) year31);
        boolean b34 = month27.isValid();
        try {
            day7.setDay(0, month27);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test257() throws Throwable {
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
    public void test258() throws Throwable {
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
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        try {
            Date date3 = new Date(1, 33, (int) ' ');
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
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
    public void test261() throws Throwable {
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
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
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
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        Month month1 = null;
        try {
            Day day2 = new Day((int) (byte) 10, month1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        try {
            Date date3 = new Date(2, (int) (short) -1, 28);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        try {
            Date date3 = new Date((int) (short) -1, (int) (byte) 1, 33);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        Year year2 = new Year(11);
        boolean b3 = year2.increment();
        Month month4 = new Month(3, year2);
        Year year7 = new Year((int) (short) 100);
        try {
            month4.setMonth(0, year7);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        try {
            Date date3 = new Date((int) (short) 0, (int) (short) 1, (int) ' ');
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        try {
            Date date3 = new Date((int) (short) 0, 31, 28);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        date3.printDate();
        date3.printDate();
        Month month9 = date3.getMonth();
        java.lang.String str10 = date3.toString();
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        Year year2 = new Year((int) (byte) 100);
        int i3 = year2.getYear();
        int i4 = year2.getYear();
        Month month5 = new Month((int) (short) 1, year2);
        boolean b6 = year2.isLeap();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
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
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        try {
            Date date3 = new Date((int) 'a', 3, (-1));
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test273() throws Throwable {
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
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
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
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
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
        boolean b17 = day16.increment();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        Year year2 = new Year((int) (short) 1);
        boolean b3 = year2.isLeap();
        try {
            Month month4 = new Month(0, year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test277() throws Throwable {
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
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        Year year2 = new Year(1);
        boolean b3 = year2.isLeap();
        boolean b4 = year2.isLeap();
        java.lang.Object obj5 = new java.lang.Object();
        boolean b6 = year2.equals(obj5);
        boolean b7 = year2.isValid();
        int i8 = year2.getYear();
        year2.setYear((int) 'a');
        try {
            Month month11 = new Month((int) (short) -1, year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test279() throws Throwable {
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
    public void test280() throws Throwable {
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
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
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
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isValid();
        boolean b4 = year1.isLeap();
        boolean b5 = year1.isLeap();
        int i6 = year1.getYear();
        boolean b7 = year1.increment();
        boolean b8 = year1.increment();
        boolean b9 = year1.isValid();
        int i10 = year1.getYear();
        int i11 = year1.getYear();
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        try {
            Date date3 = new Date(33, 32, 33);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
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
        boolean b15 = year14.increment();
        year14.setYear(32);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
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
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        Day day8 = date3.getDay();
        Day day9 = date3.getDay();
        Day day10 = date3.getDay();
    }

    @Test
    public void test287() throws Throwable {
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
    public void test288() throws Throwable {
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
    public void test289() throws Throwable {
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
    public void test290() throws Throwable {
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
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isLeap();
        int i4 = year1.getYear();
        boolean b5 = year1.isLeap();
        boolean b6 = year1.isLeap();
        int i7 = year1.getYear();
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        try {
            Date date3 = new Date((int) (short) 1, 100, 102);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
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
    public void test294() throws Throwable {
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
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
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
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
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
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        try {
            Date date3 = new Date(3, 1, 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test298() throws Throwable {
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
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
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
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Date date4 = Nextday.nextDay(date3);
        Day day5 = date4.getDay();
        Year year6 = date4.getYear();
        date4.increment();
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Month month7 = date3.getMonth();
        date3.printDate();
        java.lang.String str9 = date3.toString();
        Month month10 = date3.getMonth();
        Year year13 = new Year(1);
        boolean b14 = year13.isLeap();
        boolean b15 = year13.isLeap();
        boolean b16 = year13.increment();
        java.lang.Object obj17 = null;
        boolean b18 = year13.equals(obj17);
        int i19 = year13.getYear();
        boolean b20 = year13.isLeap();
        int i21 = year13.getYear();
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
        boolean b41 = day29.increment();
        boolean b42 = day29.isValid();
        boolean b43 = year13.equals((java.lang.Object) day29);
        try {
            month10.setMonth(102, year13);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        try {
            Date date3 = new Date(100, (int) (short) 0, 3);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test303() throws Throwable {
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
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
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
    public void test305() throws Throwable {
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
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        Year year1 = new Year((int) (short) -1);
        int i2 = year1.getYear();
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
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
    public void test308() throws Throwable {
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
    public void test309() throws Throwable {
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
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        Date date3 = new Date(11, 3, 28);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
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
        boolean b21 = year2.increment();
        try {
            Month month22 = new Month((int) '4', year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
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
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        Year year1 = new Year((int) (byte) 100);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = year1.equals(obj2);
        boolean b4 = year1.isValid();
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
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
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
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
    public void test316() throws Throwable {
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
    public void test317() throws Throwable {
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
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
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
        Year year28 = new Year(31);
        boolean b29 = year28.isValid();
        try {
            month4.setMonth(52, year28);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test319() throws Throwable {
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
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        Date date3 = new Date((int) (short) 1, 1, (int) 'a');
    }

    @Test
    public void test321() throws Throwable {
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
    public void test322() throws Throwable {
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
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b5 = month4.increment();
        boolean b6 = month4.isValid();
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
        Date date32 = new Date(10, (int) (byte) 10, (int) (short) 1);
        boolean b34 = date32.equals((java.lang.Object) (-1));
        Year year35 = date32.getYear();
        Month month36 = new Month(3, year35);
        month26.setMonth((int) (short) 10, year35);
        try {
            month4.setMonth(102, year35);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        try {
            Date date3 = new Date(0, 0, (int) (byte) 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isValid();
        boolean b4 = year1.isLeap();
        boolean b5 = year1.increment();
        int i6 = year1.getYear();
        boolean b7 = year1.increment();
        boolean b8 = year1.isLeap();
        boolean b9 = year1.isValid();
        try {
            year1.setYear((int) (byte) 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        try {
            Date date3 = new Date(31, 1, (int) (short) 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test327() throws Throwable {
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
    public void test328() throws Throwable {
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
    public void test329() throws Throwable {
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
    public void test330() throws Throwable {
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
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        try {
            Date date3 = new Date((int) 'a', 10, (int) (short) 10);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test332() throws Throwable {
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
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        try {
            Date date3 = new Date((int) (byte) 100, (int) (short) 10, (int) '4');
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
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
        Year year16 = new Year(1);
        boolean b17 = year16.isLeap();
        boolean b18 = year16.isLeap();
        boolean b19 = year16.increment();
        java.lang.Object obj20 = null;
        boolean b21 = year16.equals(obj20);
        int i22 = year16.getYear();
        int i23 = year16.getYear();
        boolean b24 = year16.increment();
        boolean b25 = date13.equals((java.lang.Object) year16);
        int i26 = year16.getYear();
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
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
        Year year17 = new Year((int) (byte) 100);
        boolean b18 = year17.isValid();
        Month month19 = new Month((int) (short) 10, year17);
        int i20 = month19.getMonth();
        Day day21 = new Day(30, month19);
        int i22 = day21.getDay();
        boolean b23 = day21.isValid();
        boolean b24 = date9.equals((java.lang.Object) day21);
        Date date29 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year30 = date29.getYear();
        boolean b32 = date29.equals((java.lang.Object) "hi!");
        Day day33 = date29.getDay();
        Year year34 = date29.getYear();
        Month month35 = date29.getMonth();
        int i36 = month35.getMonth();
        try {
            day21.setDay((int) (short) 100, month35);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test336() throws Throwable {
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
    public void test337() throws Throwable {
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
    public void test338() throws Throwable {
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
    public void test339() throws Throwable {
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
    public void test340() throws Throwable {
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
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
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
        Year year21 = new Year(1);
        boolean b22 = year21.isValid();
        boolean b23 = year21.isLeap();
        int i24 = year21.getYear();
        Year year26 = new Year(1);
        boolean b27 = year26.isValid();
        boolean b28 = year26.isLeap();
        int i29 = year26.getYear();
        boolean b30 = year26.isLeap();
        boolean b31 = year21.equals((java.lang.Object) b30);
        try {
            month18.setMonth(30, year21);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        Year year3 = new Year((int) (byte) 100);
        boolean b4 = year3.isValid();
        Month month5 = new Month((int) (short) 10, year3);
        int i6 = month5.getMonth();
        Day day7 = new Day(30, month5);
        int i8 = day7.getDay();
        boolean b9 = day7.isValid();
        Date date14 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year15 = date14.getYear();
        boolean b17 = date14.equals((java.lang.Object) "hi!");
        java.lang.String str18 = date14.toString();
        boolean b20 = date14.equals((java.lang.Object) (short) 100);
        Year year21 = date14.getYear();
        Date date22 = Nextday.nextDay(date14);
        java.lang.String str23 = date14.toString();
        Month month24 = date14.getMonth();
        try {
            day7.setDay((-1), month24);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isValid();
        boolean b5 = year2.isValid();
        boolean b6 = year2.isValid();
        int i7 = year2.getYear();
        Month month8 = new Month((int) (short) 10, year2);
        year2.setYear((-1));
        boolean b11 = year2.isValid();
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b6 = month4.equals((java.lang.Object) 10L);
        int i7 = month4.getMonth();
        boolean b8 = month4.isValid();
        boolean b9 = month4.isValid();
        boolean b10 = month4.isValid();
        boolean b11 = month4.increment();
        Year year14 = new Year(1);
        boolean b15 = year14.isLeap();
        boolean b17 = year14.equals((java.lang.Object) 100.0f);
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
        boolean b36 = day25.isValid();
        boolean b37 = day25.isValid();
        boolean b38 = year14.equals((java.lang.Object) b37);
        int i39 = year14.getYear();
        int i40 = year14.getYear();
        boolean b41 = year14.isValid();
        int i42 = year14.getYear();
        try {
            month4.setMonth((int) 'a', year14);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        try {
            Date date3 = new Date(100, (int) (short) 0, (int) (byte) 10);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test346() throws Throwable {
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
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b6 = month4.equals((java.lang.Object) 10L);
        Year year8 = new Year(1);
        boolean b9 = year8.increment();
        boolean b10 = month4.equals((java.lang.Object) year8);
        boolean b11 = year8.isValid();
    }

    @Test
    public void test348() throws Throwable {
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
    public void test349() throws Throwable {
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
    public void test350() throws Throwable {
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
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
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
        try {
            year1.setYear((int) (short) 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        try {
            Date date3 = new Date(102, (int) (short) 1, (int) ' ');
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test353() throws Throwable {
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
    public void test354() throws Throwable {
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
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        try {
            Date date3 = new Date(101, 3, 3);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test356() throws Throwable {
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
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        try {
            Date date3 = new Date(32, (int) (short) 10, (int) (short) 1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isLeap();
        int i4 = year1.getYear();
        boolean b5 = year1.isLeap();
        boolean b6 = year1.isValid();
        try {
            year1.setYear((int) (short) 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
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
        try {
            Month month18 = new Month((int) '4', year15);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test360() throws Throwable {
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
    public void test361() throws Throwable {
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
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        try {
            Date date3 = new Date((int) '4', 12, 11);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test363() throws Throwable {
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
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
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
        Year year17 = null;
        try {
            month15.setMonth((int) (short) 100, year17);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        Year year3 = new Year((int) (byte) 100);
        boolean b4 = year3.isValid();
        Month month5 = new Month((int) (short) 10, year3);
        boolean b7 = month5.equals((java.lang.Object) 10L);
        Year year9 = new Year(1);
        boolean b10 = year9.increment();
        boolean b11 = month5.equals((java.lang.Object) year9);
        boolean b12 = month5.isValid();
        int i13 = month5.getMonthSize();
        try {
            Day day14 = new Day((int) (byte) 100, month5);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test366() throws Throwable {
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
    public void test367() throws Throwable {
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
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        Year year3 = new Year((int) (byte) 100);
        boolean b4 = year3.isValid();
        Month month5 = new Month((int) (short) 10, year3);
        boolean b7 = month5.equals((java.lang.Object) 10L);
        Year year9 = new Year(1);
        boolean b10 = year9.increment();
        boolean b11 = month5.equals((java.lang.Object) year9);
        boolean b12 = month5.isValid();
        int i13 = month5.getMonthSize();
        boolean b14 = month5.isValid();
        try {
            Day day15 = new Day((int) '4', month5);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test369() throws Throwable {
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
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        try {
            Date date3 = new Date(101, (int) (short) 100, (int) '4');
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test371() throws Throwable {
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
    public void test372() throws Throwable {
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
    public void test373() throws Throwable {
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
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        boolean b5 = date3.equals((java.lang.Object) (-1));
        Year year6 = date3.getYear();
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
        boolean b26 = year6.equals((java.lang.Object) month25);
        try {
            year6.setYear(0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        try {
            Date date3 = new Date(102, (int) '4', (int) (short) 100);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test376() throws Throwable {
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
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        try {
            Date date3 = new Date((int) (short) -1, 30, 10);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        Year year3 = new Year(1);
        boolean b4 = year3.isValid();
        boolean b5 = year3.isValid();
        Month month6 = new Month((int) (short) 10, year3);
        try {
            Month month7 = new Month((int) (byte) 100, year3);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isValid();
        Month month5 = new Month((int) (short) 10, year2);
        int i6 = month5.getMonthSize();
        int i7 = month5.getMonth();
        int i8 = month5.getMonth();
        Year year10 = null;
        try {
            month5.setMonth((int) (byte) -1, year10);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
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
        Date date25 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year26 = date25.getYear();
        boolean b28 = date25.equals((java.lang.Object) "hi!");
        Month month29 = date25.getMonth();
        boolean b30 = month29.increment();
        boolean b31 = month29.increment();
        boolean b32 = month29.isValid();
        int i33 = month29.getMonthSize();
        try {
            day7.setDay(0, month29);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test381() throws Throwable {
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
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        Year year3 = new Year(1);
        boolean b4 = year3.isValid();
        boolean b5 = year3.isLeap();
        int i6 = year3.getYear();
        boolean b7 = year3.isLeap();
        Month month8 = new Month((int) (byte) 1, year3);
        Day day9 = new Day(31, month8);
        boolean b10 = day9.increment();
        Year year14 = new Year(1);
        boolean b15 = year14.isLeap();
        boolean b16 = year14.isLeap();
        boolean b17 = year14.increment();
        Month month18 = new Month((int) (short) 1, year14);
        Year year20 = new Year(1);
        boolean b21 = year20.isValid();
        boolean b22 = year20.isValid();
        boolean b23 = year20.isValid();
        boolean b24 = year20.isValid();
        boolean b25 = year20.isValid();
        year20.setYear((int) ' ');
        int i28 = year20.getYear();
        boolean b29 = month18.equals((java.lang.Object) i28);
        Day day30 = new Day((int) (byte) 10, month18);
        boolean b31 = day9.equals((java.lang.Object) (byte) 10);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
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
        try {
            year2.setYear(0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        try {
            Date date3 = new Date(2, (int) '4', 101);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test385() throws Throwable {
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
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
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
        Year year18 = new Year(1);
        boolean b19 = year18.isValid();
        boolean b20 = year18.increment();
        boolean b21 = year18.increment();
        boolean b22 = year18.isLeap();
        boolean b23 = day16.equals((java.lang.Object) b22);
        boolean b24 = day16.increment();
        Year year29 = new Year((int) (byte) 100);
        boolean b30 = year29.isValid();
        Month month31 = new Month((int) (short) 10, year29);
        boolean b32 = year29.increment();
        Month month33 = new Month(2, year29);
        try {
            day16.setDay(30, month33);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test387() throws Throwable {
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
    public void test388() throws Throwable {
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
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
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
        Year year21 = new Year(3);
        boolean b22 = day7.equals((java.lang.Object) 3);
        Year year26 = new Year((int) (byte) 100);
        boolean b27 = year26.isValid();
        Month month28 = new Month((int) (short) 10, year26);
        boolean b30 = month28.equals((java.lang.Object) 10L);
        Year year32 = new Year(1);
        int i33 = year32.getYear();
        boolean b34 = month28.equals((java.lang.Object) i33);
        boolean b35 = month28.isValid();
        try {
            day7.setDay(100, month28);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test390() throws Throwable {
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
    public void test391() throws Throwable {
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
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        Date date3 = new Date(11, 1, 12);
    }

    @Test
    public void test393() throws Throwable {
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
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
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
        Year year14 = new Year((int) (byte) 100);
        int i15 = year14.getYear();
        int i16 = year14.getYear();
        boolean b17 = year14.isValid();
        int i18 = year14.getYear();
        boolean b19 = year14.isLeap();
        try {
            month8.setMonth(97, year14);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        try {
            Date date3 = new Date(100, 2, 1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isValid();
        boolean b4 = year1.isLeap();
        boolean b5 = year1.increment();
        int i6 = year1.getYear();
        boolean b7 = year1.increment();
        try {
            year1.setYear((int) (byte) 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test397() throws Throwable {
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
    public void test398() throws Throwable {
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
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        java.lang.String str7 = date3.toString();
        Year year8 = date3.getYear();
        Date date9 = Nextday.nextDay(date3);
        Month month10 = date9.getMonth();
        Year year11 = date9.getYear();
        int i12 = year11.getYear();
        boolean b13 = year11.isLeap();
        boolean b14 = year11.increment();
    }

    @Test
    public void test400() throws Throwable {
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
    public void test401() throws Throwable {
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
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
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
        date22.increment();
    }

    @Test
    public void test403() throws Throwable {
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
    public void test404() throws Throwable {
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
    public void test405() throws Throwable {
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
    public void test406() throws Throwable {
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
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        Year year3 = new Year((int) (byte) 100);
        boolean b4 = year3.isValid();
        Month month5 = new Month((int) (short) 10, year3);
        int i6 = month5.getMonth();
        Day day7 = new Day(30, month5);
        int i8 = day7.getDay();
        boolean b9 = day7.increment();
        boolean b10 = day7.increment();
    }

    @Test
    public void test408() throws Throwable {
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
    public void test409() throws Throwable {
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
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        Year year1 = new Year((int) (byte) 100);
        boolean b2 = year1.isValid();
        boolean b3 = year1.increment();
        int i4 = year1.getYear();
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        try {
            Date date3 = new Date(0, 0, (int) (byte) 100);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test412() throws Throwable {
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
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        Year year3 = new Year(1);
        boolean b4 = year3.isValid();
        boolean b5 = year3.isLeap();
        int i6 = year3.getYear();
        boolean b7 = year3.isLeap();
        Month month8 = new Month((int) (byte) 1, year3);
        int i9 = month8.getMonthSize();
        boolean b10 = month8.increment();
        int i11 = month8.getMonth();
        boolean b12 = month8.increment();
        boolean b13 = month8.isValid();
        Day day14 = new Day(4, month8);
    }

    @Test
    public void test414() throws Throwable {
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
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
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
        boolean b14 = year1.isLeap();
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
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
        try {
            year1.setYear(0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        try {
            Date date3 = new Date(28, (int) (byte) 1, (int) (byte) 1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
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
        Year year19 = new Year(101);
        boolean b20 = month17.equals((java.lang.Object) 101);
        Year year23 = new Year((int) (byte) 100);
        int i24 = year23.getYear();
        int i25 = year23.getYear();
        try {
            month17.setMonth(30, year23);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b6 = month4.equals((java.lang.Object) 10L);
        boolean b7 = month4.isValid();
        boolean b8 = month4.isValid();
        boolean b9 = month4.isValid();
        Year year11 = null;
        try {
            month4.setMonth(31, year11);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        try {
            Date date3 = new Date(5, (int) '#', (int) (short) 1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test421() throws Throwable {
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
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
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
        try {
            Day day21 = new Day(32, month9);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
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
        java.lang.String str27 = date3.toString();
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        try {
            Date date3 = new Date((int) 'a', (int) '#', 2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test425() throws Throwable {
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
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
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
        Year year42 = new Year((int) (short) -1);
        try {
            month21.setMonth(32, year42);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b5 = year4.isValid();
        int i6 = year4.getYear();
        boolean b7 = year4.increment();
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isValid();
        year1.setYear((int) 'a');
        int i6 = year1.getYear();
        boolean b7 = year1.isLeap();
    }

    @Test
    public void test429() throws Throwable {
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
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
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
        boolean b28 = year19.increment();
    }

    @Test
    public void test431() throws Throwable {
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
    public void test432() throws Throwable {
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
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        Year year1 = new Year(1);
        boolean b2 = year1.isLeap();
        int i3 = year1.getYear();
        year1.setYear(100);
        int i6 = year1.getYear();
        boolean b7 = year1.isLeap();
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b5 = month4.increment();
        boolean b6 = month4.isValid();
        int i7 = month4.getMonthSize();
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
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
        Year year17 = new Year(1);
        boolean b18 = year17.isValid();
        boolean b19 = year17.isValid();
        boolean b20 = year17.isLeap();
        boolean b21 = year17.increment();
        int i22 = year17.getYear();
        boolean b23 = year17.increment();
        boolean b24 = year17.isLeap();
        boolean b25 = year17.isValid();
        java.lang.Object obj26 = null;
        boolean b27 = year17.equals(obj26);
        try {
            month12.setMonth(101, year17);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
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
        try {
            Day day14 = new Day((int) (short) 100, month8);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test437() throws Throwable {
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
    public void test438() throws Throwable {
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
    public void test439() throws Throwable {
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
    public void test440() throws Throwable {
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
    public void test441() throws Throwable {
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
    public void test442() throws Throwable {
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
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b5 = month4.increment();
        boolean b6 = month4.increment();
        boolean b7 = month4.isValid();
        boolean b8 = month4.increment();
        try {
            int i9 = month4.getMonthSize();
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        Year year1 = new Year(31);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isLeap();
    }

    @Test
    public void test445() throws Throwable {
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
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        Year year3 = new Year((int) (short) 100);
        boolean b4 = year3.isValid();
        Month month5 = new Month(12, year3);
        boolean b6 = month5.increment();
        boolean b7 = month5.isValid();
        try {
            Day day8 = new Day(10, month5);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
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
        date3.increment();
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        Year year2 = new Year(1);
        boolean b3 = year2.isLeap();
        boolean b4 = year2.isLeap();
        boolean b5 = year2.increment();
        Month month6 = new Month((int) (short) 1, year2);
        year2.setYear((int) (short) 1);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        Year year1 = new Year(1);
        boolean b2 = year1.isLeap();
        int i3 = year1.getYear();
        boolean b4 = year1.isValid();
        boolean b5 = year1.increment();
        boolean b6 = year1.increment();
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        Year year1 = new Year((int) (byte) 100);
        boolean b2 = year1.isValid();
        boolean b3 = year1.increment();
        boolean b4 = year1.increment();
    }

    @Test
    public void test451() throws Throwable {
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
    public void test452() throws Throwable {
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
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        boolean b6 = month4.equals((java.lang.Object) 10L);
        boolean b7 = month4.increment();
        boolean b8 = month4.increment();
        int i9 = month4.getMonthSize();
        boolean b10 = month4.increment();
        int i11 = month4.getMonth();
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        try {
            Date date3 = new Date(32, (int) (short) 100, (int) (byte) 100);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test455() throws Throwable {
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
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        try {
            Date date3 = new Date((int) ' ', 102, (int) (short) 100);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        Year year2 = new Year(1);
        boolean b3 = year2.isLeap();
        int i4 = year2.getYear();
        Month month5 = new Month(10, year2);
        boolean b6 = month5.increment();
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        Date date4 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year5 = date4.getYear();
        boolean b7 = date4.equals((java.lang.Object) "hi!");
        Month month8 = date4.getMonth();
        int i9 = month8.getMonthSize();
        boolean b10 = month8.increment();
        Day day11 = new Day(2, month8);
        boolean b12 = month8.increment();
        int i13 = month8.getMonthSize();
    }

    @Test
    public void test459() throws Throwable {
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
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        Year year2 = new Year((int) (byte) 100);
        int i3 = year2.getYear();
        int i4 = year2.getYear();
        Month month5 = new Month((int) (short) 1, year2);
        boolean b6 = month5.increment();
        int i7 = month5.getMonthSize();
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        Year year5 = date3.getYear();
        year5.setYear(5);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        Year year1 = new Year(1);
        boolean b2 = year1.isValid();
        boolean b3 = year1.isValid();
        boolean b4 = year1.isLeap();
        boolean b5 = year1.increment();
        boolean b6 = year1.isLeap();
    }

    @Test
    public void test463() throws Throwable {
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
    public void test464() throws Throwable {
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
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        Year year2 = new Year(1);
        boolean b3 = year2.isLeap();
        int i4 = year2.getYear();
        boolean b6 = year2.equals((java.lang.Object) 1);
        Date date10 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year11 = date10.getYear();
        boolean b13 = date10.equals((java.lang.Object) "hi!");
        java.lang.String str14 = date10.toString();
        boolean b16 = date10.equals((java.lang.Object) (short) 100);
        Date date17 = Nextday.nextDay(date10);
        date17.increment();
        Month month19 = date17.getMonth();
        boolean b20 = year2.equals((java.lang.Object) month19);
        try {
            Month month21 = new Month((int) '#', year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test466() throws Throwable {
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
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        Year year1 = new Year(101);
        boolean b2 = year1.isValid();
        boolean b3 = year1.increment();
    }

    @Test
    public void test468() throws Throwable {
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
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        try {
            Date date3 = new Date((int) 'a', (int) '#', 12);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        try {
            Date date3 = new Date(11, 33, (int) (short) 100);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
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
        boolean b20 = day7.isValid();
    }

    @Test
    public void test472() throws Throwable {
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
    public void test473() throws Throwable {
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
    public void test474() throws Throwable {
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
    public void test475() throws Throwable {
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
    public void test476() throws Throwable {
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
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        try {
            Date date3 = new Date(0, (int) (short) -1, (int) '#');
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        Year year2 = new Year((int) (byte) 100);
        boolean b3 = year2.isValid();
        Month month4 = new Month((int) (short) 10, year2);
        int i5 = month4.getMonth();
        Year year8 = new Year((int) (short) 1);
        boolean b9 = year8.isLeap();
        month4.setMonth((int) (short) 10, year8);
        int i11 = month4.getMonthSize();
        boolean b12 = month4.isValid();
        Year year15 = new Year((int) (short) 1);
        boolean b16 = year15.isLeap();
        year15.setYear(31);
        boolean b19 = year15.increment();
        year15.setYear((int) (short) 10);
        try {
            month4.setMonth(33, year15);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test479() throws Throwable {
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
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b6 = date3.equals((java.lang.Object) "hi!");
        Month month7 = date3.getMonth();
        date3.printDate();
        java.lang.String str9 = date3.toString();
        date3.printDate();
        java.lang.String str11 = date3.toString();
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
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
        int i16 = month15.getMonth();
        int i17 = month15.getMonthSize();
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        try {
            Date date3 = new Date((-1), 1, 2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test483() throws Throwable {
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
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        try {
            Date date3 = new Date(101, (int) '4', 0);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        Year year1 = null;
        try {
            Month month2 = new Month(2, year1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test486() throws Throwable {
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
    public void test487() throws Throwable {
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
    public void test488() throws Throwable {
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
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
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
        int i14 = year12.getYear();
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        Year year2 = new Year(1);
        boolean b3 = year2.isValid();
        boolean b4 = year2.isLeap();
        int i5 = year2.getYear();
        boolean b6 = year2.increment();
        Date date10 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year11 = date10.getYear();
        date10.printDate();
        Year year13 = date10.getYear();
        Day day14 = date10.getDay();
        Month month15 = date10.getMonth();
        boolean b16 = year2.equals((java.lang.Object) date10);
        boolean b17 = year2.isLeap();
        try {
            Month month18 = new Month(30, year2);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        Year year3 = new Year(1);
        boolean b4 = year3.isLeap();
        boolean b5 = year3.isLeap();
        boolean b6 = year3.increment();
        Month month7 = new Month((int) (short) 1, year3);
        Date date11 = new Date(10, (int) (byte) 10, (int) (short) 1);
        java.lang.String str12 = date11.toString();
        boolean b13 = month7.equals((java.lang.Object) date11);
        int i14 = month7.getMonth();
        try {
            Day day15 = new Day(101, month7);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test492() throws Throwable {
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
    public void test493() throws Throwable {
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
    public void test494() throws Throwable {
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
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        Year year1 = null;
        try {
            Month month2 = new Month((int) (short) 100, year1);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test496() throws Throwable {
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
    public void test497() throws Throwable {
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
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
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
        Year year17 = new Year(1);
        boolean b18 = year17.isValid();
        boolean b19 = year17.isValid();
        boolean b20 = year17.isLeap();
        boolean b21 = year17.isLeap();
        int i22 = year17.getYear();
        year17.setYear(12);
        boolean b25 = day14.equals((java.lang.Object) 12);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        Year year3 = new Year(11);
        boolean b4 = year3.increment();
        Month month5 = new Month(3, year3);
        Day day6 = new Day(12, month5);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        Date date3 = new Date(10, (int) (byte) 10, (int) (short) 1);
        Year year4 = date3.getYear();
        boolean b5 = year4.isValid();
        int i6 = year4.getYear();
        boolean b7 = year4.isValid();
    }
}

