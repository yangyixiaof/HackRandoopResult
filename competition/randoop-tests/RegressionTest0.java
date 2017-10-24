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
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        boolean b1 = stack_obj0.isEmpty();
        try {
            java.lang.Object obj2 = stack_obj0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        try {
            java.lang.Object obj1 = stack_obj0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
        } catch (java.util.EmptyStackException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        try {
            java.lang.Object obj4 = stack_obj0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        boolean b1 = stack_obj0.isEmpty();
        boolean b2 = stack_obj0.isEmpty();
        try {
            java.lang.Object obj3 = stack_obj0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        boolean b4 = stack_obj0.isEmpty();
        try {
            java.lang.Object obj5 = stack_obj0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        stack_obj0.push((java.lang.Object) 10.0f);
        java.lang.Object obj3 = stack_obj0.pop();
        try {
            java.lang.Object obj4 = stack_obj0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10.0f + "'", obj3.equals(10.0f));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        boolean b1 = stack_obj0.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj2 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj3 = new java.lang.Object();
        stack_obj2.push(obj3);
        java.lang.Object obj5 = stack_obj2.pop();
        stack_obj2.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable8 = new tutorial.Stack<java.io.Serializable>();
        stack_obj2.push((java.lang.Object) stack_serializable8);
        stack_obj0.push((java.lang.Object) stack_obj2);
        boolean b11 = stack_obj0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        tutorial.Stack<java.lang.String> stack_str0 = new tutorial.Stack<java.lang.String>();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) 1L);
        java.lang.Object obj6 = stack_obj0.pop();
        boolean b7 = stack_obj0.isEmpty();
        stack_obj0.push((java.lang.Object) (-1));
        java.lang.Object obj10 = stack_obj0.pop();
        boolean b11 = stack_obj0.isEmpty();
        try {
            java.lang.Object obj12 = stack_obj0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1L + "'", obj6.equals(1L));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1) + "'", obj10.equals((-1)));
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        boolean b1 = stack_obj0.isEmpty();
        stack_obj0.push((java.lang.Object) '#');
        java.lang.Object obj4 = stack_obj0.pop();
        boolean b5 = stack_obj0.isEmpty();
        try {
            java.lang.Object obj6 = stack_obj0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + '#' + "'", obj4.equals('#'));
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        boolean b1 = stack_obj0.isEmpty();
        boolean b2 = stack_obj0.isEmpty();
        boolean b3 = stack_obj0.isEmpty();
        boolean b4 = stack_obj0.isEmpty();
        try {
            java.lang.Object obj5 = stack_obj0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) false);
        java.lang.Object obj6 = stack_obj0.pop();
        try {
            java.lang.Object obj7 = stack_obj0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + false + "'", obj6.equals(false));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        boolean b1 = stack_obj0.isEmpty();
        boolean b2 = stack_obj0.isEmpty();
        boolean b3 = stack_obj0.isEmpty();
        try {
            java.lang.Object obj4 = stack_obj0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) 1L);
        java.lang.Object obj6 = stack_obj0.pop();
        boolean b7 = stack_obj0.isEmpty();
        try {
            java.lang.Object obj8 = stack_obj0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1L + "'", obj6.equals(1L));
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        boolean b4 = stack_obj0.isEmpty();
        boolean b5 = stack_obj0.isEmpty();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        stack_obj0.push((java.lang.Object) stack_obj5);
        tutorial.Stack<java.lang.Object> stack_obj9 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj10 = new java.lang.Object();
        stack_obj9.push(obj10);
        java.lang.Object obj12 = stack_obj9.pop();
        boolean b13 = stack_obj9.isEmpty();
        stack_obj5.push((java.lang.Object) b13);
        tutorial.Stack<java.lang.CharSequence> stack_charSequence15 = new tutorial.Stack<java.lang.CharSequence>();
        stack_obj5.push((java.lang.Object) stack_charSequence15);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) 1L);
        java.lang.Object obj6 = stack_obj0.pop();
        boolean b7 = stack_obj0.isEmpty();
        stack_obj0.push((java.lang.Object) (-1));
        java.lang.Object obj10 = stack_obj0.pop();
        try {
            java.lang.Object obj11 = stack_obj0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1L + "'", obj6.equals(1L));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1) + "'", obj10.equals((-1)));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) 1L);
        java.lang.Object obj6 = stack_obj0.pop();
        boolean b7 = stack_obj0.isEmpty();
        stack_obj0.push((java.lang.Object) (-1));
        java.lang.Object obj10 = stack_obj0.pop();
        boolean b11 = stack_obj0.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj12 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj13 = new java.lang.Object();
        stack_obj12.push(obj13);
        java.lang.Object obj15 = stack_obj12.pop();
        stack_obj0.push((java.lang.Object) stack_obj12);
        java.lang.Object obj17 = stack_obj0.pop();
        try {
            java.lang.Object obj18 = stack_obj0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1L + "'", obj6.equals(1L));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1) + "'", obj10.equals((-1)));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) false);
        java.lang.Object obj6 = stack_obj0.pop();
        tutorial.Stack<java.lang.Object> stack_obj7 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj8 = new java.lang.Object();
        stack_obj7.push(obj8);
        stack_obj7.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj12 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj13 = new java.lang.Object();
        stack_obj12.push(obj13);
        stack_obj7.push((java.lang.Object) stack_obj12);
        boolean b16 = stack_obj7.isEmpty();
        stack_obj0.push((java.lang.Object) b16);
        boolean b18 = stack_obj0.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj19 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj20 = new java.lang.Object();
        stack_obj19.push(obj20);
        boolean b22 = stack_obj19.isEmpty();
        stack_obj19.push((java.lang.Object) (short) 100);
        java.lang.Object obj25 = stack_obj19.pop();
        stack_obj0.push(obj25);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + false + "'", obj6.equals(false));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 100 + "'", obj25.equals((short) 100));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        boolean b1 = stack_obj0.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj2 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj3 = new java.lang.Object();
        stack_obj2.push(obj3);
        java.lang.Object obj5 = stack_obj2.pop();
        stack_obj2.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable8 = new tutorial.Stack<java.io.Serializable>();
        stack_obj2.push((java.lang.Object) stack_serializable8);
        stack_obj0.push((java.lang.Object) stack_obj2);
        java.lang.Object obj11 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) 0);
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        stack_obj0.push((java.lang.Object) stack_obj5);
        tutorial.Stack<java.lang.Object> stack_obj9 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj10 = new java.lang.Object();
        stack_obj9.push(obj10);
        java.lang.Object obj12 = stack_obj9.pop();
        boolean b13 = stack_obj9.isEmpty();
        stack_obj5.push((java.lang.Object) b13);
        tutorial.Stack<java.lang.Object> stack_obj15 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj16 = new java.lang.Object();
        stack_obj15.push(obj16);
        java.lang.Object obj18 = stack_obj15.pop();
        stack_obj15.push((java.lang.Object) 1L);
        java.lang.Object obj21 = stack_obj15.pop();
        boolean b22 = stack_obj15.isEmpty();
        stack_obj15.push((java.lang.Object) (-1));
        stack_obj5.push((java.lang.Object) stack_obj15);
        java.lang.Object obj26 = stack_obj5.pop();
        boolean b27 = stack_obj5.isEmpty();
        java.lang.Object obj28 = stack_obj5.pop();
        boolean b29 = stack_obj5.isEmpty();
        boolean b30 = stack_obj5.isEmpty();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1L + "'", obj21.equals(1L));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + true + "'", obj28.equals(true));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        stack_obj0.push((java.lang.Object) 10.0f);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) "hi!");
        boolean b6 = stack_obj0.isEmpty();
        boolean b7 = stack_obj0.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10.0f + "'", obj3.equals(10.0f));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        boolean b1 = stack_obj0.isEmpty();
        stack_obj0.push((java.lang.Object) '#');
        java.lang.Object obj4 = stack_obj0.pop();
        boolean b5 = stack_obj0.isEmpty();
        tutorial.Stack<java.lang.CharSequence> stack_charSequence6 = new tutorial.Stack<java.lang.CharSequence>();
        stack_obj0.push((java.lang.Object) stack_charSequence6);
        boolean b8 = stack_obj0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + '#' + "'", obj4.equals('#'));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        boolean b1 = stack_obj0.isEmpty();
        stack_obj0.push((java.lang.Object) 1.0d);
        tutorial.Stack<java.lang.Object> stack_obj4 = new tutorial.Stack<java.lang.Object>();
        boolean b5 = stack_obj4.isEmpty();
        stack_obj4.push((java.lang.Object) '#');
        java.lang.Object obj8 = stack_obj4.pop();
        boolean b9 = stack_obj4.isEmpty();
        stack_obj0.push((java.lang.Object) b9);
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#' + "'", obj8.equals('#'));
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        stack_obj0.push((java.lang.Object) stack_obj5);
        tutorial.Stack<java.lang.Object> stack_obj9 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj10 = new java.lang.Object();
        stack_obj9.push(obj10);
        java.lang.Object obj12 = stack_obj9.pop();
        boolean b13 = stack_obj9.isEmpty();
        stack_obj5.push((java.lang.Object) b13);
        tutorial.Stack<java.lang.Object> stack_obj15 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj16 = new java.lang.Object();
        stack_obj15.push(obj16);
        stack_obj15.push((java.lang.Object) (byte) 1);
        stack_obj5.push((java.lang.Object) (byte) 1);
        boolean b21 = stack_obj5.isEmpty();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        stack_obj0.push((java.lang.Object) 10.0f);
        stack_obj0.push((java.lang.Object) 100);
        stack_obj0.push((java.lang.Object) '#');
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) false);
        java.lang.Object obj6 = stack_obj0.pop();
        tutorial.Stack<java.lang.Object> stack_obj7 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj8 = new java.lang.Object();
        stack_obj7.push(obj8);
        stack_obj7.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj12 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj13 = new java.lang.Object();
        stack_obj12.push(obj13);
        stack_obj7.push((java.lang.Object) stack_obj12);
        boolean b16 = stack_obj7.isEmpty();
        stack_obj0.push((java.lang.Object) b16);
        boolean b18 = stack_obj0.isEmpty();
        java.lang.Object obj19 = stack_obj0.pop();
        boolean b20 = stack_obj0.isEmpty();
        try {
            java.lang.Object obj21 = stack_obj0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + false + "'", obj6.equals(false));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        stack_obj0.push((java.lang.Object) 10.0f);
        java.lang.Object obj3 = stack_obj0.pop();
        boolean b4 = stack_obj0.isEmpty();
        boolean b5 = stack_obj0.isEmpty();
        try {
            java.lang.Object obj6 = stack_obj0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10.0f + "'", obj3.equals(10.0f));
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        stack_obj0.push((java.lang.Object) stack_obj5);
        tutorial.Stack<java.lang.Object> stack_obj9 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj10 = new java.lang.Object();
        stack_obj9.push(obj10);
        java.lang.Object obj12 = stack_obj9.pop();
        boolean b13 = stack_obj9.isEmpty();
        stack_obj5.push((java.lang.Object) b13);
        tutorial.Stack<java.lang.Object> stack_obj15 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj16 = new java.lang.Object();
        stack_obj15.push(obj16);
        stack_obj15.push((java.lang.Object) (byte) 1);
        stack_obj5.push((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = stack_obj5.pop();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 1 + "'", obj21.equals((byte) 1));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) 1L);
        java.lang.Object obj6 = stack_obj0.pop();
        try {
            java.lang.Object obj7 = stack_obj0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1L + "'", obj6.equals(1L));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) 1L);
        java.lang.Object obj6 = stack_obj0.pop();
        boolean b7 = stack_obj0.isEmpty();
        stack_obj0.push((java.lang.Object) (-1));
        java.lang.Object obj10 = stack_obj0.pop();
        boolean b11 = stack_obj0.isEmpty();
        boolean b12 = stack_obj0.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj13 = new tutorial.Stack<java.lang.Object>();
        stack_obj13.push((java.lang.Object) 10.0f);
        java.lang.Object obj16 = stack_obj13.pop();
        tutorial.Stack<java.lang.Object> stack_obj17 = new tutorial.Stack<java.lang.Object>();
        boolean b18 = stack_obj17.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj19 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj20 = new java.lang.Object();
        stack_obj19.push(obj20);
        java.lang.Object obj22 = stack_obj19.pop();
        stack_obj19.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable25 = new tutorial.Stack<java.io.Serializable>();
        stack_obj19.push((java.lang.Object) stack_serializable25);
        stack_obj17.push((java.lang.Object) stack_obj19);
        stack_obj13.push((java.lang.Object) stack_obj17);
        stack_obj0.push((java.lang.Object) stack_obj17);
        tutorial.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str30 = new tutorial.Stack<java.lang.Comparable<java.lang.String>>();
        stack_obj17.push((java.lang.Object) stack_comparable_str30);
        java.lang.Object obj32 = stack_obj17.pop();
        java.lang.Object obj33 = stack_obj17.pop();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1L + "'", obj6.equals(1L));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1) + "'", obj10.equals((-1)));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 10.0f + "'", obj16.equals(10.0f));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        stack_obj0.push((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = stack_obj0.pop();
        try {
            java.lang.Object obj4 = stack_obj0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (byte) 0 + "'", obj3.equals((byte) 0));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        boolean b5 = stack_obj0.isEmpty();
        java.lang.Object obj6 = stack_obj0.pop();
        tutorial.Stack<java.lang.Object> stack_obj7 = new tutorial.Stack<java.lang.Object>();
        stack_obj7.push((java.lang.Object) (byte) 0);
        stack_obj0.push((java.lang.Object) stack_obj7);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 10.0f + "'", obj6.equals(10.0f));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        boolean b1 = stack_obj0.isEmpty();
        stack_obj0.push((java.lang.Object) 1.0d);
        java.lang.Object obj4 = stack_obj0.pop();
        try {
            java.lang.Object obj5 = stack_obj0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0d + "'", obj4.equals(1.0d));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        java.lang.Object obj8 = stack_obj5.pop();
        stack_obj5.push((java.lang.Object) 1L);
        java.lang.Object obj11 = stack_obj5.pop();
        boolean b12 = stack_obj5.isEmpty();
        stack_obj5.push((java.lang.Object) (-1));
        stack_obj0.push((java.lang.Object) stack_obj5);
        java.lang.Object obj16 = stack_obj5.pop();
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 1L + "'", obj11.equals(1L));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (-1) + "'", obj16.equals((-1)));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) 1L);
        java.lang.Object obj6 = stack_obj0.pop();
        boolean b7 = stack_obj0.isEmpty();
        stack_obj0.push((java.lang.Object) (-1));
        java.lang.Object obj10 = stack_obj0.pop();
        boolean b11 = stack_obj0.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj12 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj13 = new java.lang.Object();
        stack_obj12.push(obj13);
        java.lang.Object obj15 = stack_obj12.pop();
        stack_obj0.push((java.lang.Object) stack_obj12);
        boolean b17 = stack_obj12.isEmpty();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1L + "'", obj6.equals(1L));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1) + "'", obj10.equals((-1)));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        stack_obj0.push((java.lang.Object) 10.0f);
        stack_obj0.push((java.lang.Object) 100.0d);
        boolean b5 = stack_obj0.isEmpty();
        boolean b6 = stack_obj0.isEmpty();
        boolean b7 = stack_obj0.isEmpty();
        java.lang.Object obj8 = stack_obj0.pop();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 100.0d + "'", obj8.equals(100.0d));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        stack_obj0.push((java.lang.Object) stack_obj5);
        boolean b9 = stack_obj5.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj10 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj11 = new java.lang.Object();
        stack_obj10.push(obj11);
        java.lang.Object obj13 = stack_obj10.pop();
        stack_obj10.push((java.lang.Object) 1L);
        java.lang.Object obj16 = stack_obj10.pop();
        boolean b17 = stack_obj10.isEmpty();
        stack_obj10.push((java.lang.Object) (-1));
        java.lang.Object obj20 = stack_obj10.pop();
        boolean b21 = stack_obj10.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj22 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj23 = new java.lang.Object();
        stack_obj22.push(obj23);
        java.lang.Object obj25 = stack_obj22.pop();
        stack_obj10.push((java.lang.Object) stack_obj22);
        stack_obj5.push((java.lang.Object) stack_obj22);
        try {
            java.lang.Object obj28 = stack_obj22.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1L + "'", obj16.equals(1L));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (-1) + "'", obj20.equals((-1)));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        stack_obj0.push((java.lang.Object) stack_obj5);
        boolean b9 = stack_obj5.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj10 = new tutorial.Stack<java.lang.Object>();
        boolean b11 = stack_obj10.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj12 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj13 = new java.lang.Object();
        stack_obj12.push(obj13);
        java.lang.Object obj15 = stack_obj12.pop();
        stack_obj12.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable18 = new tutorial.Stack<java.io.Serializable>();
        stack_obj12.push((java.lang.Object) stack_serializable18);
        stack_obj10.push((java.lang.Object) stack_obj12);
        java.lang.Object obj21 = stack_obj12.pop();
        stack_obj5.push(obj21);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable6 = new tutorial.Stack<java.io.Serializable>();
        stack_obj0.push((java.lang.Object) stack_serializable6);
        boolean b8 = stack_obj0.isEmpty();
        stack_obj0.push((java.lang.Object) 100L);
        boolean b11 = stack_obj0.isEmpty();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        stack_obj0.push((java.lang.Object) 10.0f);
        java.lang.Object obj3 = stack_obj0.pop();
        boolean b4 = stack_obj0.isEmpty();
        try {
            java.lang.Object obj5 = stack_obj0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10.0f + "'", obj3.equals(10.0f));
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        boolean b1 = stack_obj0.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj2 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj3 = new java.lang.Object();
        stack_obj2.push(obj3);
        java.lang.Object obj5 = stack_obj2.pop();
        stack_obj2.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable8 = new tutorial.Stack<java.io.Serializable>();
        stack_obj2.push((java.lang.Object) stack_serializable8);
        stack_obj0.push((java.lang.Object) stack_obj2);
        java.lang.Object obj11 = stack_obj0.pop();
        tutorial.Stack<java.lang.Object> stack_obj12 = new tutorial.Stack<java.lang.Object>();
        stack_obj12.push((java.lang.Object) 10.0f);
        java.lang.Object obj15 = stack_obj12.pop();
        stack_obj12.push((java.lang.Object) "hi!");
        boolean b18 = stack_obj12.isEmpty();
        stack_obj0.push((java.lang.Object) stack_obj12);
        java.lang.Object obj20 = stack_obj0.pop();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 10.0f + "'", obj15.equals(10.0f));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        tutorial.Stack<java.lang.Object> stack_obj4 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj5 = new java.lang.Object();
        stack_obj4.push(obj5);
        stack_obj4.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj9 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj10 = new java.lang.Object();
        stack_obj9.push(obj10);
        stack_obj4.push((java.lang.Object) stack_obj9);
        boolean b13 = stack_obj4.isEmpty();
        stack_obj0.push((java.lang.Object) stack_obj4);
        java.lang.Object obj15 = stack_obj4.pop();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        stack_obj0.push((java.lang.Object) stack_obj5);
        tutorial.Stack<java.lang.Object> stack_obj9 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj10 = new java.lang.Object();
        stack_obj9.push(obj10);
        java.lang.Object obj12 = stack_obj9.pop();
        boolean b13 = stack_obj9.isEmpty();
        stack_obj5.push((java.lang.Object) b13);
        tutorial.Stack<java.lang.Object> stack_obj15 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj16 = new java.lang.Object();
        stack_obj15.push(obj16);
        java.lang.Object obj18 = stack_obj15.pop();
        stack_obj15.push((java.lang.Object) 1L);
        java.lang.Object obj21 = stack_obj15.pop();
        boolean b22 = stack_obj15.isEmpty();
        stack_obj15.push((java.lang.Object) (-1));
        stack_obj5.push((java.lang.Object) stack_obj15);
        java.lang.Object obj26 = stack_obj5.pop();
        boolean b27 = stack_obj5.isEmpty();
        java.lang.Object obj28 = stack_obj5.pop();
        boolean b29 = stack_obj5.isEmpty();
        java.lang.Object obj30 = stack_obj5.pop();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1L + "'", obj21.equals(1L));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + true + "'", obj28.equals(true));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        stack_obj0.push((java.lang.Object) stack_obj5);
        tutorial.Stack<java.lang.Object> stack_obj9 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj10 = new java.lang.Object();
        stack_obj9.push(obj10);
        java.lang.Object obj12 = stack_obj9.pop();
        boolean b13 = stack_obj9.isEmpty();
        stack_obj5.push((java.lang.Object) b13);
        tutorial.Stack<java.lang.Object> stack_obj15 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj16 = new java.lang.Object();
        stack_obj15.push(obj16);
        java.lang.Object obj18 = stack_obj15.pop();
        stack_obj15.push((java.lang.Object) 1L);
        java.lang.Object obj21 = stack_obj15.pop();
        boolean b22 = stack_obj15.isEmpty();
        stack_obj15.push((java.lang.Object) (-1));
        stack_obj5.push((java.lang.Object) stack_obj15);
        java.lang.Object obj26 = stack_obj5.pop();
        boolean b27 = stack_obj5.isEmpty();
        boolean b28 = stack_obj5.isEmpty();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1L + "'", obj21.equals(1L));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        stack_obj5.push((java.lang.Object) (short) 100);
        stack_obj0.push((java.lang.Object) (short) 100);
        stack_obj0.push((java.lang.Object) '#');
        boolean b13 = stack_obj0.isEmpty();
        boolean b14 = stack_obj0.isEmpty();
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        tutorial.Stack<java.lang.Object> stack_obj4 = new tutorial.Stack<java.lang.Object>();
        boolean b5 = stack_obj4.isEmpty();
        stack_obj4.push((java.lang.Object) 1.0d);
        stack_obj0.push((java.lang.Object) 1.0d);
        boolean b9 = stack_obj0.isEmpty();
        boolean b10 = stack_obj0.isEmpty();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        boolean b3 = stack_obj0.isEmpty();
        boolean b4 = stack_obj0.isEmpty();
        boolean b5 = stack_obj0.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        stack_obj0.push((java.lang.Object) 10.0f);
        java.lang.Object obj3 = stack_obj0.pop();
        boolean b4 = stack_obj0.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        stack_obj5.push((java.lang.Object) 10.0f);
        stack_obj5.push((java.lang.Object) 100);
        java.lang.Object obj10 = stack_obj5.pop();
        boolean b11 = stack_obj5.isEmpty();
        stack_obj0.push((java.lang.Object) stack_obj5);
        tutorial.Stack<java.lang.Object> stack_obj13 = new tutorial.Stack<java.lang.Object>();
        stack_obj13.push((java.lang.Object) 10.0f);
        java.lang.Object obj16 = stack_obj13.pop();
        stack_obj13.push((java.lang.Object) "hi!");
        boolean b19 = stack_obj13.isEmpty();
        java.lang.Object obj20 = stack_obj13.pop();
        stack_obj0.push(obj20);
        tutorial.Stack<java.lang.Object> stack_obj22 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj23 = new java.lang.Object();
        stack_obj22.push(obj23);
        stack_obj22.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj27 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj28 = new java.lang.Object();
        stack_obj27.push(obj28);
        stack_obj22.push((java.lang.Object) stack_obj27);
        tutorial.Stack<java.lang.Object> stack_obj31 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj32 = new java.lang.Object();
        stack_obj31.push(obj32);
        java.lang.Object obj34 = stack_obj31.pop();
        boolean b35 = stack_obj31.isEmpty();
        stack_obj27.push((java.lang.Object) b35);
        tutorial.Stack<java.lang.Object> stack_obj37 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj38 = new java.lang.Object();
        stack_obj37.push(obj38);
        stack_obj37.push((java.lang.Object) (byte) 1);
        stack_obj27.push((java.lang.Object) (byte) 1);
        stack_obj0.push((java.lang.Object) stack_obj27);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10.0f + "'", obj3.equals(10.0f));
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100 + "'", obj10.equals(100));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 10.0f + "'", obj16.equals(10.0f));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + "hi!" + "'", obj20.equals("hi!"));
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue(b35 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        stack_obj0.push((java.lang.Object) 10.0f);
        java.lang.Object obj3 = stack_obj0.pop();
        boolean b4 = stack_obj0.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        stack_obj5.push((java.lang.Object) 10.0f);
        stack_obj5.push((java.lang.Object) 100);
        java.lang.Object obj10 = stack_obj5.pop();
        boolean b11 = stack_obj5.isEmpty();
        stack_obj0.push((java.lang.Object) stack_obj5);
        boolean b13 = stack_obj5.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10.0f + "'", obj3.equals(10.0f));
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100 + "'", obj10.equals(100));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        stack_obj0.push((java.lang.Object) 10.0f);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) "hi!");
        tutorial.Stack<java.lang.Object> stack_obj6 = new tutorial.Stack<java.lang.Object>();
        boolean b7 = stack_obj6.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj8 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj9 = new java.lang.Object();
        stack_obj8.push(obj9);
        java.lang.Object obj11 = stack_obj8.pop();
        stack_obj8.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable14 = new tutorial.Stack<java.io.Serializable>();
        stack_obj8.push((java.lang.Object) stack_serializable14);
        stack_obj6.push((java.lang.Object) stack_obj8);
        stack_obj6.push((java.lang.Object) '4');
        stack_obj0.push((java.lang.Object) stack_obj6);
        java.lang.Object obj20 = stack_obj0.pop();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10.0f + "'", obj3.equals(10.0f));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        stack_obj0.push((java.lang.Object) stack_obj5);
        tutorial.Stack<java.lang.Object> stack_obj9 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj10 = new java.lang.Object();
        stack_obj9.push(obj10);
        java.lang.Object obj12 = stack_obj9.pop();
        boolean b13 = stack_obj9.isEmpty();
        stack_obj5.push((java.lang.Object) b13);
        tutorial.Stack<java.lang.Object> stack_obj15 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj16 = new java.lang.Object();
        stack_obj15.push(obj16);
        java.lang.Object obj18 = stack_obj15.pop();
        stack_obj15.push((java.lang.Object) 1L);
        java.lang.Object obj21 = stack_obj15.pop();
        boolean b22 = stack_obj15.isEmpty();
        stack_obj15.push((java.lang.Object) (-1));
        stack_obj5.push((java.lang.Object) stack_obj15);
        tutorial.Stack<java.lang.Object> stack_obj26 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj27 = new java.lang.Object();
        stack_obj26.push(obj27);
        java.lang.Object obj29 = stack_obj26.pop();
        stack_obj26.push((java.lang.Object) 1L);
        java.lang.Object obj32 = stack_obj26.pop();
        stack_obj26.push((java.lang.Object) (-1));
        boolean b35 = stack_obj26.isEmpty();
        boolean b36 = stack_obj26.isEmpty();
        stack_obj15.push((java.lang.Object) b36);
        java.lang.Object obj38 = stack_obj15.pop();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1L + "'", obj21.equals(1L));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 1L + "'", obj32.equals(1L));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + false + "'", obj38.equals(false));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) (byte) 1);
        boolean b5 = stack_obj0.isEmpty();
        boolean b6 = stack_obj0.isEmpty();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) 1L);
        java.lang.Object obj6 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) (-1));
        boolean b9 = stack_obj0.isEmpty();
        java.lang.Object obj10 = stack_obj0.pop();
        boolean b11 = stack_obj0.isEmpty();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1L + "'", obj6.equals(1L));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1) + "'", obj10.equals((-1)));
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        stack_obj0.push((java.lang.Object) stack_obj5);
        boolean b9 = stack_obj5.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj10 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj11 = new java.lang.Object();
        stack_obj10.push(obj11);
        java.lang.Object obj13 = stack_obj10.pop();
        stack_obj10.push((java.lang.Object) 1L);
        java.lang.Object obj16 = stack_obj10.pop();
        boolean b17 = stack_obj10.isEmpty();
        stack_obj10.push((java.lang.Object) (-1));
        java.lang.Object obj20 = stack_obj10.pop();
        boolean b21 = stack_obj10.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj22 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj23 = new java.lang.Object();
        stack_obj22.push(obj23);
        java.lang.Object obj25 = stack_obj22.pop();
        stack_obj10.push((java.lang.Object) stack_obj22);
        stack_obj5.push((java.lang.Object) stack_obj22);
        tutorial.Stack<java.lang.Object> stack_obj28 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj29 = new java.lang.Object();
        stack_obj28.push(obj29);
        stack_obj28.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj33 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj34 = new java.lang.Object();
        stack_obj33.push(obj34);
        stack_obj28.push((java.lang.Object) stack_obj33);
        java.lang.Object obj37 = stack_obj28.pop();
        tutorial.Stack<java.lang.Object> stack_obj38 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj39 = new java.lang.Object();
        stack_obj38.push(obj39);
        stack_obj38.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj43 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj44 = new java.lang.Object();
        stack_obj43.push(obj44);
        stack_obj38.push((java.lang.Object) stack_obj43);
        boolean b47 = stack_obj38.isEmpty();
        stack_obj28.push((java.lang.Object) stack_obj38);
        stack_obj5.push((java.lang.Object) stack_obj38);
        java.lang.Object obj50 = stack_obj5.pop();
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1L + "'", obj16.equals(1L));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (-1) + "'", obj20.equals((-1)));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(obj50);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        stack_obj0.push((java.lang.Object) stack_obj5);
        boolean b9 = stack_obj5.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj10 = new tutorial.Stack<java.lang.Object>();
        stack_obj10.push((java.lang.Object) 10.0f);
        stack_obj10.push((java.lang.Object) 100);
        boolean b15 = stack_obj10.isEmpty();
        java.lang.Object obj16 = stack_obj10.pop();
        stack_obj5.push(obj16);
        tutorial.Stack<java.lang.Object> stack_obj18 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj19 = new java.lang.Object();
        stack_obj18.push(obj19);
        stack_obj18.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj23 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj24 = new java.lang.Object();
        stack_obj23.push(obj24);
        stack_obj18.push((java.lang.Object) stack_obj23);
        tutorial.Stack<java.lang.Object> stack_obj27 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj28 = new java.lang.Object();
        stack_obj27.push(obj28);
        stack_obj23.push((java.lang.Object) stack_obj27);
        java.lang.Object obj31 = stack_obj27.pop();
        stack_obj5.push(obj31);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 100 + "'", obj16.equals(100));
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable6 = new tutorial.Stack<java.io.Serializable>();
        stack_obj0.push((java.lang.Object) stack_serializable6);
        java.lang.Object obj8 = stack_obj0.pop();
        boolean b9 = stack_obj0.isEmpty();
        java.lang.Object obj10 = stack_obj0.pop();
        try {
            java.lang.Object obj11 = stack_obj0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1L + "'", obj10.equals(1L));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) 1L);
        java.lang.Object obj6 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) (-1));
        boolean b9 = stack_obj0.isEmpty();
        boolean b10 = stack_obj0.isEmpty();
        boolean b11 = stack_obj0.isEmpty();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1L + "'", obj6.equals(1L));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) 1L);
        java.lang.Object obj6 = stack_obj0.pop();
        boolean b7 = stack_obj0.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj8 = new tutorial.Stack<java.lang.Object>();
        boolean b9 = stack_obj8.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj10 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj11 = new java.lang.Object();
        stack_obj10.push(obj11);
        java.lang.Object obj13 = stack_obj10.pop();
        stack_obj10.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable16 = new tutorial.Stack<java.io.Serializable>();
        stack_obj10.push((java.lang.Object) stack_serializable16);
        stack_obj8.push((java.lang.Object) stack_obj10);
        stack_obj0.push((java.lang.Object) stack_obj8);
        tutorial.Stack<java.lang.Object> stack_obj20 = new tutorial.Stack<java.lang.Object>();
        stack_obj20.push((java.lang.Object) 10.0f);
        stack_obj20.push((java.lang.Object) 100);
        java.lang.Object obj25 = null;
        stack_obj20.push(obj25);
        stack_obj0.push((java.lang.Object) stack_obj20);
        boolean b28 = stack_obj20.isEmpty();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1L + "'", obj6.equals(1L));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) false);
        java.lang.Object obj6 = stack_obj0.pop();
        tutorial.Stack<java.lang.Object> stack_obj7 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj8 = new java.lang.Object();
        stack_obj7.push(obj8);
        stack_obj7.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj12 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj13 = new java.lang.Object();
        stack_obj12.push(obj13);
        stack_obj7.push((java.lang.Object) stack_obj12);
        boolean b16 = stack_obj7.isEmpty();
        stack_obj0.push((java.lang.Object) b16);
        stack_obj0.push((java.lang.Object) (short) 100);
        boolean b20 = stack_obj0.isEmpty();
        java.lang.Object obj21 = stack_obj0.pop();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + false + "'", obj6.equals(false));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 100 + "'", obj21.equals((short) 100));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        stack_obj0.push((java.lang.Object) 0.0f);
        boolean b7 = stack_obj0.isEmpty();
        boolean b8 = stack_obj0.isEmpty();
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        java.lang.Object obj8 = stack_obj5.pop();
        stack_obj5.push((java.lang.Object) 1L);
        java.lang.Object obj11 = stack_obj5.pop();
        boolean b12 = stack_obj5.isEmpty();
        stack_obj5.push((java.lang.Object) (-1));
        stack_obj0.push((java.lang.Object) stack_obj5);
        tutorial.Stack<java.lang.Object> stack_obj16 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj17 = new java.lang.Object();
        stack_obj16.push(obj17);
        java.lang.Object obj19 = stack_obj16.pop();
        stack_obj16.push((java.lang.Object) 1L);
        java.lang.Object obj22 = stack_obj16.pop();
        boolean b23 = stack_obj16.isEmpty();
        stack_obj16.push((java.lang.Object) (-1));
        java.lang.Object obj26 = stack_obj16.pop();
        boolean b27 = stack_obj16.isEmpty();
        boolean b28 = stack_obj16.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj29 = new tutorial.Stack<java.lang.Object>();
        stack_obj29.push((java.lang.Object) 10.0f);
        java.lang.Object obj32 = stack_obj29.pop();
        tutorial.Stack<java.lang.Object> stack_obj33 = new tutorial.Stack<java.lang.Object>();
        boolean b34 = stack_obj33.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj35 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj36 = new java.lang.Object();
        stack_obj35.push(obj36);
        java.lang.Object obj38 = stack_obj35.pop();
        stack_obj35.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable41 = new tutorial.Stack<java.io.Serializable>();
        stack_obj35.push((java.lang.Object) stack_serializable41);
        stack_obj33.push((java.lang.Object) stack_obj35);
        stack_obj29.push((java.lang.Object) stack_obj33);
        stack_obj16.push((java.lang.Object) stack_obj33);
        tutorial.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str46 = new tutorial.Stack<java.lang.Comparable<java.lang.String>>();
        stack_obj33.push((java.lang.Object) stack_comparable_str46);
        stack_obj0.push((java.lang.Object) stack_comparable_str46);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 1L + "'", obj11.equals(1L));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 1L + "'", obj22.equals(1L));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (-1) + "'", obj26.equals((-1)));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 10.0f + "'", obj32.equals(10.0f));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(obj38);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        tutorial.Stack<java.lang.Object> stack_obj4 = new tutorial.Stack<java.lang.Object>();
        boolean b5 = stack_obj4.isEmpty();
        stack_obj4.push((java.lang.Object) 1.0d);
        stack_obj0.push((java.lang.Object) 1.0d);
        stack_obj0.push((java.lang.Object) '4');
        java.lang.Object obj11 = stack_obj0.pop();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + '4' + "'", obj11.equals('4'));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) (short) 100);
        boolean b5 = stack_obj0.isEmpty();
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) 1L);
        java.lang.Object obj6 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) (-1));
        stack_obj0.push((java.lang.Object) (-1L));
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1L + "'", obj6.equals(1L));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        stack_obj0.push((java.lang.Object) 10.0f);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) "hi!");
        tutorial.Stack<java.lang.Object> stack_obj6 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj7 = new java.lang.Object();
        stack_obj6.push(obj7);
        stack_obj6.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj11 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj12 = new java.lang.Object();
        stack_obj11.push(obj12);
        stack_obj11.push((java.lang.Object) (short) 100);
        stack_obj6.push((java.lang.Object) (short) 100);
        stack_obj6.push((java.lang.Object) '#');
        java.lang.Object obj19 = stack_obj6.pop();
        stack_obj0.push(obj19);
        tutorial.Stack<java.lang.Object> stack_obj21 = new tutorial.Stack<java.lang.Object>();
        boolean b22 = stack_obj21.isEmpty();
        boolean b23 = stack_obj21.isEmpty();
        stack_obj0.push((java.lang.Object) b23);
        tutorial.Stack<java.lang.Object> stack_obj25 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj26 = new java.lang.Object();
        stack_obj25.push(obj26);
        java.lang.Object obj28 = stack_obj25.pop();
        tutorial.Stack<java.lang.Object> stack_obj29 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj30 = new java.lang.Object();
        stack_obj29.push(obj30);
        stack_obj29.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj34 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj35 = new java.lang.Object();
        stack_obj34.push(obj35);
        stack_obj29.push((java.lang.Object) stack_obj34);
        boolean b38 = stack_obj29.isEmpty();
        stack_obj25.push((java.lang.Object) stack_obj29);
        stack_obj25.push((java.lang.Object) (byte) 1);
        stack_obj0.push((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10.0f + "'", obj3.equals(10.0f));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + '#' + "'", obj19.equals('#'));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        stack_obj0.push((java.lang.Object) stack_obj5);
        tutorial.Stack<java.lang.Object> stack_obj9 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj10 = new java.lang.Object();
        stack_obj9.push(obj10);
        stack_obj5.push((java.lang.Object) stack_obj9);
        java.lang.Object obj13 = stack_obj9.pop();
        tutorial.Stack<java.lang.Object> stack_obj14 = new tutorial.Stack<java.lang.Object>();
        stack_obj14.push((java.lang.Object) 10.0f);
        java.lang.Object obj17 = stack_obj14.pop();
        tutorial.Stack<java.lang.Object> stack_obj18 = new tutorial.Stack<java.lang.Object>();
        boolean b19 = stack_obj18.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj20 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj21 = new java.lang.Object();
        stack_obj20.push(obj21);
        java.lang.Object obj23 = stack_obj20.pop();
        stack_obj20.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable26 = new tutorial.Stack<java.io.Serializable>();
        stack_obj20.push((java.lang.Object) stack_serializable26);
        stack_obj18.push((java.lang.Object) stack_obj20);
        stack_obj14.push((java.lang.Object) stack_obj18);
        tutorial.Stack<java.lang.Object> stack_obj30 = new tutorial.Stack<java.lang.Object>();
        stack_obj30.push((java.lang.Object) 10.0f);
        boolean b33 = stack_obj30.isEmpty();
        stack_obj14.push((java.lang.Object) stack_obj30);
        stack_obj9.push((java.lang.Object) stack_obj14);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 10.0f + "'", obj17.equals(10.0f));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) 1L);
        java.lang.Object obj6 = stack_obj0.pop();
        boolean b7 = stack_obj0.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj8 = new tutorial.Stack<java.lang.Object>();
        boolean b9 = stack_obj8.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj10 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj11 = new java.lang.Object();
        stack_obj10.push(obj11);
        java.lang.Object obj13 = stack_obj10.pop();
        stack_obj10.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable16 = new tutorial.Stack<java.io.Serializable>();
        stack_obj10.push((java.lang.Object) stack_serializable16);
        stack_obj8.push((java.lang.Object) stack_obj10);
        stack_obj0.push((java.lang.Object) stack_obj8);
        tutorial.Stack<java.lang.Object> stack_obj20 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj21 = new java.lang.Object();
        stack_obj20.push(obj21);
        java.lang.Object obj23 = stack_obj20.pop();
        stack_obj20.push((java.lang.Object) 1L);
        java.lang.Object obj26 = stack_obj20.pop();
        boolean b27 = stack_obj20.isEmpty();
        stack_obj20.push((java.lang.Object) (-1));
        java.lang.Object obj30 = stack_obj20.pop();
        boolean b31 = stack_obj20.isEmpty();
        stack_obj0.push((java.lang.Object) stack_obj20);
        tutorial.Stack<java.lang.Object> stack_obj33 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj34 = new java.lang.Object();
        stack_obj33.push(obj34);
        stack_obj33.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj38 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj39 = new java.lang.Object();
        stack_obj38.push(obj39);
        java.lang.Object obj41 = stack_obj38.pop();
        stack_obj38.push((java.lang.Object) 1L);
        java.lang.Object obj44 = stack_obj38.pop();
        boolean b45 = stack_obj38.isEmpty();
        stack_obj38.push((java.lang.Object) (-1));
        stack_obj33.push((java.lang.Object) stack_obj38);
        tutorial.Stack<java.lang.Object> stack_obj49 = new tutorial.Stack<java.lang.Object>();
        stack_obj49.push((java.lang.Object) 10.0f);
        java.lang.Object obj52 = stack_obj49.pop();
        stack_obj49.push((java.lang.Object) "hi!");
        boolean b55 = stack_obj49.isEmpty();
        stack_obj33.push((java.lang.Object) b55);
        boolean b57 = stack_obj33.isEmpty();
        stack_obj20.push((java.lang.Object) stack_obj33);
        tutorial.Stack<java.lang.Object> stack_obj59 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj60 = new java.lang.Object();
        stack_obj59.push(obj60);
        java.lang.Object obj62 = stack_obj59.pop();
        stack_obj59.push((java.lang.Object) 1L);
        java.lang.Object obj65 = stack_obj59.pop();
        stack_obj20.push(obj65);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1L + "'", obj6.equals(1L));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 1L + "'", obj26.equals(1L));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (-1) + "'", obj30.equals((-1)));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 1L + "'", obj44.equals(1L));
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 10.0f + "'", obj52.equals(10.0f));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 1L + "'", obj65.equals(1L));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        stack_obj0.push((java.lang.Object) stack_obj5);
        java.lang.Object obj9 = stack_obj5.pop();
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        boolean b1 = stack_obj0.isEmpty();
        stack_obj0.push((java.lang.Object) 1.0d);
        boolean b4 = stack_obj0.isEmpty();
        boolean b5 = stack_obj0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) 1L);
        java.lang.Object obj6 = stack_obj0.pop();
        boolean b7 = stack_obj0.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj8 = new tutorial.Stack<java.lang.Object>();
        boolean b9 = stack_obj8.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj10 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj11 = new java.lang.Object();
        stack_obj10.push(obj11);
        java.lang.Object obj13 = stack_obj10.pop();
        stack_obj10.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable16 = new tutorial.Stack<java.io.Serializable>();
        stack_obj10.push((java.lang.Object) stack_serializable16);
        stack_obj8.push((java.lang.Object) stack_obj10);
        stack_obj0.push((java.lang.Object) stack_obj8);
        boolean b20 = stack_obj8.isEmpty();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1L + "'", obj6.equals(1L));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        boolean b1 = stack_obj0.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj2 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj3 = new java.lang.Object();
        stack_obj2.push(obj3);
        java.lang.Object obj5 = stack_obj2.pop();
        stack_obj2.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable8 = new tutorial.Stack<java.io.Serializable>();
        stack_obj2.push((java.lang.Object) stack_serializable8);
        stack_obj0.push((java.lang.Object) stack_obj2);
        java.lang.Object obj11 = stack_obj2.pop();
        boolean b12 = stack_obj2.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) false);
        java.lang.Object obj6 = stack_obj0.pop();
        tutorial.Stack<java.lang.Object> stack_obj7 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj8 = new java.lang.Object();
        stack_obj7.push(obj8);
        stack_obj7.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj12 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj13 = new java.lang.Object();
        stack_obj12.push(obj13);
        stack_obj7.push((java.lang.Object) stack_obj12);
        boolean b16 = stack_obj7.isEmpty();
        stack_obj0.push((java.lang.Object) b16);
        stack_obj0.push((java.lang.Object) (short) 100);
        java.lang.Object obj20 = stack_obj0.pop();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + false + "'", obj6.equals(false));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 100 + "'", obj20.equals((short) 100));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        stack_obj0.push((java.lang.Object) 10.0f);
        boolean b3 = stack_obj0.isEmpty();
        boolean b4 = stack_obj0.isEmpty();
        stack_obj0.push((java.lang.Object) false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        stack_obj0.push((java.lang.Object) 10.0f);
        java.lang.Object obj3 = stack_obj0.pop();
        tutorial.Stack<java.lang.Object> stack_obj4 = new tutorial.Stack<java.lang.Object>();
        boolean b5 = stack_obj4.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj6 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj7 = new java.lang.Object();
        stack_obj6.push(obj7);
        java.lang.Object obj9 = stack_obj6.pop();
        stack_obj6.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable12 = new tutorial.Stack<java.io.Serializable>();
        stack_obj6.push((java.lang.Object) stack_serializable12);
        stack_obj4.push((java.lang.Object) stack_obj6);
        stack_obj0.push((java.lang.Object) stack_obj4);
        boolean b16 = stack_obj4.isEmpty();
        boolean b17 = stack_obj4.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10.0f + "'", obj3.equals(10.0f));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) 1L);
        java.lang.Object obj6 = stack_obj0.pop();
        boolean b7 = stack_obj0.isEmpty();
        stack_obj0.push((java.lang.Object) (-1));
        java.lang.Object obj10 = stack_obj0.pop();
        boolean b11 = stack_obj0.isEmpty();
        boolean b12 = stack_obj0.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj13 = new tutorial.Stack<java.lang.Object>();
        stack_obj13.push((java.lang.Object) 10.0f);
        java.lang.Object obj16 = stack_obj13.pop();
        tutorial.Stack<java.lang.Object> stack_obj17 = new tutorial.Stack<java.lang.Object>();
        boolean b18 = stack_obj17.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj19 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj20 = new java.lang.Object();
        stack_obj19.push(obj20);
        java.lang.Object obj22 = stack_obj19.pop();
        stack_obj19.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable25 = new tutorial.Stack<java.io.Serializable>();
        stack_obj19.push((java.lang.Object) stack_serializable25);
        stack_obj17.push((java.lang.Object) stack_obj19);
        stack_obj13.push((java.lang.Object) stack_obj17);
        stack_obj0.push((java.lang.Object) stack_obj17);
        boolean b30 = stack_obj17.isEmpty();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1L + "'", obj6.equals(1L));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1) + "'", obj10.equals((-1)));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 10.0f + "'", obj16.equals(10.0f));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        stack_obj0.push((java.lang.Object) 10.0f);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) "hi!");
        tutorial.Stack<java.lang.Object> stack_obj6 = new tutorial.Stack<java.lang.Object>();
        boolean b7 = stack_obj6.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj8 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj9 = new java.lang.Object();
        stack_obj8.push(obj9);
        java.lang.Object obj11 = stack_obj8.pop();
        stack_obj8.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable14 = new tutorial.Stack<java.io.Serializable>();
        stack_obj8.push((java.lang.Object) stack_serializable14);
        stack_obj6.push((java.lang.Object) stack_obj8);
        stack_obj6.push((java.lang.Object) '4');
        stack_obj0.push((java.lang.Object) stack_obj6);
        java.lang.Object obj20 = stack_obj6.pop();
        boolean b21 = stack_obj6.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10.0f + "'", obj3.equals(10.0f));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + '4' + "'", obj20.equals('4'));
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        stack_obj0.push((java.lang.Object) 10.0f);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) "hi!");
        tutorial.Stack<java.lang.Object> stack_obj6 = new tutorial.Stack<java.lang.Object>();
        boolean b7 = stack_obj6.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj8 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj9 = new java.lang.Object();
        stack_obj8.push(obj9);
        java.lang.Object obj11 = stack_obj8.pop();
        stack_obj8.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable14 = new tutorial.Stack<java.io.Serializable>();
        stack_obj8.push((java.lang.Object) stack_serializable14);
        stack_obj6.push((java.lang.Object) stack_obj8);
        stack_obj6.push((java.lang.Object) '4');
        stack_obj0.push((java.lang.Object) stack_obj6);
        java.lang.Object obj20 = stack_obj6.pop();
        java.lang.Object obj21 = stack_obj6.pop();
        java.lang.Object obj22 = null;
        stack_obj6.push(obj22);
        java.lang.Object obj24 = stack_obj6.pop();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10.0f + "'", obj3.equals(10.0f));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + '4' + "'", obj20.equals('4'));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) 1L);
        java.lang.Object obj6 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) (-1));
        tutorial.Stack<java.lang.Object> stack_obj9 = new tutorial.Stack<java.lang.Object>();
        stack_obj9.push((java.lang.Object) 10.0f);
        java.lang.Object obj12 = stack_obj9.pop();
        boolean b13 = stack_obj9.isEmpty();
        stack_obj0.push((java.lang.Object) stack_obj9);
        boolean b15 = stack_obj9.isEmpty();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1L + "'", obj6.equals(1L));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 10.0f + "'", obj12.equals(10.0f));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        stack_obj0.push((java.lang.Object) 10.0f);
        java.lang.Object obj3 = stack_obj0.pop();
        tutorial.Stack<java.lang.Object> stack_obj4 = new tutorial.Stack<java.lang.Object>();
        boolean b5 = stack_obj4.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj6 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj7 = new java.lang.Object();
        stack_obj6.push(obj7);
        java.lang.Object obj9 = stack_obj6.pop();
        stack_obj6.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable12 = new tutorial.Stack<java.io.Serializable>();
        stack_obj6.push((java.lang.Object) stack_serializable12);
        stack_obj4.push((java.lang.Object) stack_obj6);
        stack_obj0.push((java.lang.Object) stack_obj4);
        java.lang.Object obj16 = stack_obj4.pop();
        boolean b17 = stack_obj4.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10.0f + "'", obj3.equals(10.0f));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) 1L);
        java.lang.Object obj6 = stack_obj0.pop();
        boolean b7 = stack_obj0.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj8 = new tutorial.Stack<java.lang.Object>();
        boolean b9 = stack_obj8.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj10 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj11 = new java.lang.Object();
        stack_obj10.push(obj11);
        java.lang.Object obj13 = stack_obj10.pop();
        stack_obj10.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable16 = new tutorial.Stack<java.io.Serializable>();
        stack_obj10.push((java.lang.Object) stack_serializable16);
        stack_obj8.push((java.lang.Object) stack_obj10);
        stack_obj0.push((java.lang.Object) stack_obj8);
        tutorial.Stack<java.lang.Object> stack_obj20 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj21 = new java.lang.Object();
        stack_obj20.push(obj21);
        java.lang.Object obj23 = stack_obj20.pop();
        stack_obj20.push((java.lang.Object) 1L);
        java.lang.Object obj26 = stack_obj20.pop();
        boolean b27 = stack_obj20.isEmpty();
        stack_obj20.push((java.lang.Object) (-1));
        java.lang.Object obj30 = stack_obj20.pop();
        boolean b31 = stack_obj20.isEmpty();
        stack_obj0.push((java.lang.Object) stack_obj20);
        try {
            java.lang.Object obj33 = stack_obj20.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1L + "'", obj6.equals(1L));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 1L + "'", obj26.equals(1L));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (-1) + "'", obj30.equals((-1)));
        org.junit.Assert.assertTrue(b31 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) 1L);
        java.lang.Object obj6 = stack_obj0.pop();
        boolean b7 = stack_obj0.isEmpty();
        stack_obj0.push((java.lang.Object) (-1));
        java.lang.Object obj10 = stack_obj0.pop();
        tutorial.Stack<java.lang.Object> stack_obj11 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj12 = new java.lang.Object();
        stack_obj11.push(obj12);
        stack_obj11.push((java.lang.Object) 10.0f);
        stack_obj11.push((java.lang.Object) 0.0f);
        stack_obj0.push((java.lang.Object) 0.0f);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1L + "'", obj6.equals(1L));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1) + "'", obj10.equals((-1)));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        boolean b1 = stack_obj0.isEmpty();
        stack_obj0.push((java.lang.Object) '#');
        boolean b4 = stack_obj0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) 1L);
        java.lang.Object obj6 = stack_obj0.pop();
        boolean b7 = stack_obj0.isEmpty();
        stack_obj0.push((java.lang.Object) (-1));
        java.lang.Object obj10 = stack_obj0.pop();
        boolean b11 = stack_obj0.isEmpty();
        boolean b12 = stack_obj0.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj13 = new tutorial.Stack<java.lang.Object>();
        stack_obj13.push((java.lang.Object) 10.0f);
        java.lang.Object obj16 = stack_obj13.pop();
        tutorial.Stack<java.lang.Object> stack_obj17 = new tutorial.Stack<java.lang.Object>();
        boolean b18 = stack_obj17.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj19 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj20 = new java.lang.Object();
        stack_obj19.push(obj20);
        java.lang.Object obj22 = stack_obj19.pop();
        stack_obj19.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable25 = new tutorial.Stack<java.io.Serializable>();
        stack_obj19.push((java.lang.Object) stack_serializable25);
        stack_obj17.push((java.lang.Object) stack_obj19);
        stack_obj13.push((java.lang.Object) stack_obj17);
        stack_obj0.push((java.lang.Object) stack_obj17);
        java.lang.Object obj30 = stack_obj0.pop();
        try {
            java.lang.Object obj31 = stack_obj0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1L + "'", obj6.equals(1L));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1) + "'", obj10.equals((-1)));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 10.0f + "'", obj16.equals(10.0f));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) (byte) 1);
        boolean b5 = stack_obj0.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj6 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj7 = new java.lang.Object();
        stack_obj6.push(obj7);
        java.lang.Object obj9 = stack_obj6.pop();
        stack_obj6.push((java.lang.Object) 1L);
        java.lang.Object obj12 = stack_obj6.pop();
        stack_obj6.push((java.lang.Object) (-1));
        boolean b15 = stack_obj6.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj16 = new tutorial.Stack<java.lang.Object>();
        stack_obj16.push((java.lang.Object) 10.0f);
        java.lang.Object obj19 = stack_obj16.pop();
        stack_obj16.push((java.lang.Object) "hi!");
        tutorial.Stack<java.lang.Object> stack_obj22 = new tutorial.Stack<java.lang.Object>();
        boolean b23 = stack_obj22.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj24 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj25 = new java.lang.Object();
        stack_obj24.push(obj25);
        java.lang.Object obj27 = stack_obj24.pop();
        stack_obj24.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable30 = new tutorial.Stack<java.io.Serializable>();
        stack_obj24.push((java.lang.Object) stack_serializable30);
        stack_obj22.push((java.lang.Object) stack_obj24);
        stack_obj22.push((java.lang.Object) '4');
        stack_obj16.push((java.lang.Object) stack_obj22);
        stack_obj6.push((java.lang.Object) stack_obj16);
        tutorial.Stack<java.lang.Object> stack_obj37 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj38 = new java.lang.Object();
        stack_obj37.push(obj38);
        stack_obj37.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj42 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj43 = new java.lang.Object();
        stack_obj42.push(obj43);
        stack_obj42.push((java.lang.Object) (short) 100);
        stack_obj37.push((java.lang.Object) (short) 100);
        stack_obj37.push((java.lang.Object) '#');
        stack_obj16.push((java.lang.Object) '#');
        stack_obj0.push((java.lang.Object) stack_obj16);
        boolean b52 = stack_obj16.isEmpty();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1L + "'", obj12.equals(1L));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 10.0f + "'", obj19.equals(10.0f));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue(b52 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        stack_obj0.push((java.lang.Object) stack_obj5);
        java.lang.Object obj9 = stack_obj0.pop();
        boolean b10 = stack_obj0.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj11 = new tutorial.Stack<java.lang.Object>();
        stack_obj11.push((java.lang.Object) 10.0f);
        java.lang.Object obj14 = stack_obj11.pop();
        stack_obj11.push((java.lang.Object) "hi!");
        boolean b17 = stack_obj11.isEmpty();
        stack_obj0.push((java.lang.Object) stack_obj11);
        java.lang.Object obj19 = null;
        stack_obj0.push(obj19);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 10.0f + "'", obj14.equals(10.0f));
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable6 = new tutorial.Stack<java.io.Serializable>();
        stack_obj0.push((java.lang.Object) stack_serializable6);
        java.lang.Object obj8 = stack_obj0.pop();
        boolean b9 = stack_obj0.isEmpty();
        java.lang.Object obj10 = stack_obj0.pop();
        boolean b11 = stack_obj0.isEmpty();
        try {
            java.lang.Object obj12 = stack_obj0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1L + "'", obj10.equals(1L));
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        stack_obj0.push((java.lang.Object) stack_obj5);
        tutorial.Stack<java.lang.Object> stack_obj9 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj10 = new java.lang.Object();
        stack_obj9.push(obj10);
        stack_obj5.push((java.lang.Object) stack_obj9);
        java.lang.Object obj13 = stack_obj9.pop();
        tutorial.Stack<java.lang.Object> stack_obj14 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj15 = new java.lang.Object();
        stack_obj14.push(obj15);
        boolean b17 = stack_obj14.isEmpty();
        boolean b18 = stack_obj14.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj19 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj20 = new java.lang.Object();
        stack_obj19.push(obj20);
        java.lang.Object obj22 = stack_obj19.pop();
        stack_obj19.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable25 = new tutorial.Stack<java.io.Serializable>();
        stack_obj19.push((java.lang.Object) stack_serializable25);
        java.lang.Object obj27 = stack_obj19.pop();
        stack_obj14.push(obj27);
        java.lang.Object obj29 = stack_obj14.pop();
        stack_obj9.push(obj29);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        stack_obj0.push((java.lang.Object) stack_obj5);
        tutorial.Stack<java.lang.Object> stack_obj9 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj10 = new java.lang.Object();
        stack_obj9.push(obj10);
        java.lang.Object obj12 = stack_obj9.pop();
        boolean b13 = stack_obj9.isEmpty();
        stack_obj5.push((java.lang.Object) b13);
        tutorial.Stack<java.lang.Object> stack_obj15 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj16 = new java.lang.Object();
        stack_obj15.push(obj16);
        java.lang.Object obj18 = stack_obj15.pop();
        stack_obj15.push((java.lang.Object) 1L);
        java.lang.Object obj21 = stack_obj15.pop();
        boolean b22 = stack_obj15.isEmpty();
        stack_obj15.push((java.lang.Object) (-1));
        stack_obj5.push((java.lang.Object) stack_obj15);
        java.lang.Object obj26 = stack_obj5.pop();
        boolean b27 = stack_obj5.isEmpty();
        java.lang.Object obj28 = stack_obj5.pop();
        java.lang.Object obj29 = stack_obj5.pop();
        tutorial.Stack<java.lang.Object> stack_obj30 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj31 = new java.lang.Object();
        stack_obj30.push(obj31);
        stack_obj30.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj35 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj36 = new java.lang.Object();
        stack_obj35.push(obj36);
        stack_obj30.push((java.lang.Object) stack_obj35);
        boolean b39 = stack_obj35.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj40 = new tutorial.Stack<java.lang.Object>();
        stack_obj40.push((java.lang.Object) 10.0f);
        stack_obj40.push((java.lang.Object) 100);
        boolean b45 = stack_obj40.isEmpty();
        java.lang.Object obj46 = stack_obj40.pop();
        stack_obj35.push(obj46);
        stack_obj5.push((java.lang.Object) stack_obj35);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1L + "'", obj21.equals(1L));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + true + "'", obj28.equals(true));
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 100 + "'", obj46.equals(100));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        stack_obj0.push((java.lang.Object) 10.0f);
        java.lang.Object obj3 = stack_obj0.pop();
        tutorial.Stack<java.lang.Object> stack_obj4 = new tutorial.Stack<java.lang.Object>();
        boolean b5 = stack_obj4.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj6 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj7 = new java.lang.Object();
        stack_obj6.push(obj7);
        java.lang.Object obj9 = stack_obj6.pop();
        stack_obj6.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable12 = new tutorial.Stack<java.io.Serializable>();
        stack_obj6.push((java.lang.Object) stack_serializable12);
        stack_obj4.push((java.lang.Object) stack_obj6);
        stack_obj0.push((java.lang.Object) stack_obj4);
        stack_obj0.push((java.lang.Object) (-1.0d));
        boolean b18 = stack_obj0.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10.0f + "'", obj3.equals(10.0f));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        boolean b1 = stack_obj0.isEmpty();
        stack_obj0.push((java.lang.Object) '#');
        tutorial.Stack<tutorial.Stack<java.lang.Object>> stack_stack_obj4 = new tutorial.Stack<tutorial.Stack<java.lang.Object>>();
        stack_obj0.push((java.lang.Object) stack_stack_obj4);
        org.junit.Assert.assertTrue(b1 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        stack_obj0.push((java.lang.Object) stack_obj5);
        tutorial.Stack<java.lang.Object> stack_obj9 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj10 = new java.lang.Object();
        stack_obj9.push(obj10);
        java.lang.Object obj12 = stack_obj9.pop();
        boolean b13 = stack_obj9.isEmpty();
        stack_obj5.push((java.lang.Object) b13);
        boolean b15 = stack_obj5.isEmpty();
        boolean b16 = stack_obj5.isEmpty();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) 1L);
        java.lang.Object obj6 = stack_obj0.pop();
        boolean b7 = stack_obj0.isEmpty();
        stack_obj0.push((java.lang.Object) (-1));
        java.lang.Object obj10 = stack_obj0.pop();
        boolean b11 = stack_obj0.isEmpty();
        boolean b12 = stack_obj0.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj13 = new tutorial.Stack<java.lang.Object>();
        boolean b14 = stack_obj13.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj15 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj16 = new java.lang.Object();
        stack_obj15.push(obj16);
        java.lang.Object obj18 = stack_obj15.pop();
        stack_obj15.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable21 = new tutorial.Stack<java.io.Serializable>();
        stack_obj15.push((java.lang.Object) stack_serializable21);
        stack_obj13.push((java.lang.Object) stack_obj15);
        java.lang.Object obj24 = stack_obj15.pop();
        stack_obj0.push((java.lang.Object) stack_obj15);
        boolean b26 = stack_obj15.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj27 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj28 = new java.lang.Object();
        stack_obj27.push(obj28);
        boolean b30 = stack_obj27.isEmpty();
        boolean b31 = stack_obj27.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj32 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj33 = new java.lang.Object();
        stack_obj32.push(obj33);
        java.lang.Object obj35 = stack_obj32.pop();
        stack_obj32.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable38 = new tutorial.Stack<java.io.Serializable>();
        stack_obj32.push((java.lang.Object) stack_serializable38);
        java.lang.Object obj40 = stack_obj32.pop();
        stack_obj27.push(obj40);
        stack_obj15.push((java.lang.Object) stack_obj27);
        boolean b43 = stack_obj27.isEmpty();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1L + "'", obj6.equals(1L));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1) + "'", obj10.equals((-1)));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue(b43 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        stack_obj5.push((java.lang.Object) (short) 100);
        stack_obj0.push((java.lang.Object) (short) 100);
        stack_obj0.push((java.lang.Object) '#');
        tutorial.Stack<java.lang.Object> stack_obj13 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj14 = new java.lang.Object();
        stack_obj13.push(obj14);
        java.lang.Object obj16 = stack_obj13.pop();
        stack_obj13.push((java.lang.Object) 1L);
        stack_obj0.push((java.lang.Object) 1L);
        tutorial.Stack<java.lang.Object> stack_obj20 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj21 = new java.lang.Object();
        stack_obj20.push(obj21);
        stack_obj20.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj25 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj26 = new java.lang.Object();
        stack_obj25.push(obj26);
        stack_obj20.push((java.lang.Object) stack_obj25);
        boolean b29 = stack_obj20.isEmpty();
        boolean b30 = stack_obj20.isEmpty();
        boolean b31 = stack_obj20.isEmpty();
        stack_obj0.push((java.lang.Object) b31);
        boolean b33 = stack_obj0.isEmpty();
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) 1L);
        java.lang.Object obj6 = stack_obj0.pop();
        boolean b7 = stack_obj0.isEmpty();
        stack_obj0.push((java.lang.Object) (-1));
        java.lang.Object obj10 = stack_obj0.pop();
        boolean b11 = stack_obj0.isEmpty();
        boolean b12 = stack_obj0.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj13 = new tutorial.Stack<java.lang.Object>();
        stack_obj13.push((java.lang.Object) 10.0f);
        java.lang.Object obj16 = stack_obj13.pop();
        tutorial.Stack<java.lang.Object> stack_obj17 = new tutorial.Stack<java.lang.Object>();
        boolean b18 = stack_obj17.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj19 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj20 = new java.lang.Object();
        stack_obj19.push(obj20);
        java.lang.Object obj22 = stack_obj19.pop();
        stack_obj19.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable25 = new tutorial.Stack<java.io.Serializable>();
        stack_obj19.push((java.lang.Object) stack_serializable25);
        stack_obj17.push((java.lang.Object) stack_obj19);
        stack_obj13.push((java.lang.Object) stack_obj17);
        stack_obj0.push((java.lang.Object) stack_obj17);
        boolean b30 = stack_obj0.isEmpty();
        java.lang.Object obj31 = stack_obj0.pop();
        tutorial.Stack<java.lang.Object> stack_obj32 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj33 = new java.lang.Object();
        stack_obj32.push(obj33);
        java.lang.Object obj35 = stack_obj32.pop();
        stack_obj32.push((java.lang.Object) 1L);
        java.lang.Object obj38 = stack_obj32.pop();
        boolean b39 = stack_obj32.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj40 = new tutorial.Stack<java.lang.Object>();
        boolean b41 = stack_obj40.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj42 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj43 = new java.lang.Object();
        stack_obj42.push(obj43);
        java.lang.Object obj45 = stack_obj42.pop();
        stack_obj42.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable48 = new tutorial.Stack<java.io.Serializable>();
        stack_obj42.push((java.lang.Object) stack_serializable48);
        stack_obj40.push((java.lang.Object) stack_obj42);
        stack_obj32.push((java.lang.Object) stack_obj40);
        tutorial.Stack<java.lang.Object> stack_obj52 = new tutorial.Stack<java.lang.Object>();
        stack_obj52.push((java.lang.Object) 10.0f);
        stack_obj52.push((java.lang.Object) 100);
        java.lang.Object obj57 = null;
        stack_obj52.push(obj57);
        stack_obj32.push((java.lang.Object) stack_obj52);
        stack_obj0.push((java.lang.Object) stack_obj52);
        stack_obj0.push((java.lang.Object) 1.0d);
        java.lang.Object obj63 = stack_obj0.pop();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1L + "'", obj6.equals(1L));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1) + "'", obj10.equals((-1)));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 10.0f + "'", obj16.equals(10.0f));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 1L + "'", obj38.equals(1L));
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 1.0d + "'", obj63.equals(1.0d));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) 1L);
        java.lang.Object obj6 = stack_obj0.pop();
        boolean b7 = stack_obj0.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj8 = new tutorial.Stack<java.lang.Object>();
        boolean b9 = stack_obj8.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj10 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj11 = new java.lang.Object();
        stack_obj10.push(obj11);
        java.lang.Object obj13 = stack_obj10.pop();
        stack_obj10.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable16 = new tutorial.Stack<java.io.Serializable>();
        stack_obj10.push((java.lang.Object) stack_serializable16);
        stack_obj8.push((java.lang.Object) stack_obj10);
        stack_obj0.push((java.lang.Object) stack_obj8);
        tutorial.Stack<java.lang.Object> stack_obj20 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj21 = new java.lang.Object();
        stack_obj20.push(obj21);
        java.lang.Object obj23 = stack_obj20.pop();
        stack_obj20.push((java.lang.Object) 1L);
        java.lang.Object obj26 = stack_obj20.pop();
        boolean b27 = stack_obj20.isEmpty();
        stack_obj20.push((java.lang.Object) (-1));
        java.lang.Object obj30 = stack_obj20.pop();
        boolean b31 = stack_obj20.isEmpty();
        stack_obj0.push((java.lang.Object) stack_obj20);
        tutorial.Stack<java.lang.Object> stack_obj33 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj34 = new java.lang.Object();
        stack_obj33.push(obj34);
        java.lang.Object obj36 = stack_obj33.pop();
        stack_obj33.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable39 = new tutorial.Stack<java.io.Serializable>();
        stack_obj33.push((java.lang.Object) stack_serializable39);
        boolean b41 = stack_obj33.isEmpty();
        stack_obj33.push((java.lang.Object) 1);
        java.lang.Object obj44 = stack_obj33.pop();
        stack_obj20.push(obj44);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1L + "'", obj6.equals(1L));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 1L + "'", obj26.equals(1L));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (-1) + "'", obj30.equals((-1)));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 1 + "'", obj44.equals(1));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        stack_obj0.push((java.lang.Object) stack_obj5);
        tutorial.Stack<java.lang.Object> stack_obj9 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj10 = new java.lang.Object();
        stack_obj9.push(obj10);
        java.lang.Object obj12 = stack_obj9.pop();
        boolean b13 = stack_obj9.isEmpty();
        stack_obj5.push((java.lang.Object) b13);
        tutorial.Stack<java.lang.Object> stack_obj15 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj16 = new java.lang.Object();
        stack_obj15.push(obj16);
        java.lang.Object obj18 = stack_obj15.pop();
        stack_obj15.push((java.lang.Object) 1L);
        java.lang.Object obj21 = stack_obj15.pop();
        boolean b22 = stack_obj15.isEmpty();
        stack_obj15.push((java.lang.Object) (-1));
        stack_obj5.push((java.lang.Object) stack_obj15);
        java.lang.Object obj26 = stack_obj15.pop();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1L + "'", obj21.equals(1L));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (-1) + "'", obj26.equals((-1)));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        stack_obj0.push((java.lang.Object) 10.0f);
        stack_obj0.push((java.lang.Object) 100.0d);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        stack_obj5.push((java.lang.Object) 10.0f);
        stack_obj5.push((java.lang.Object) 100);
        java.lang.Object obj10 = stack_obj5.pop();
        stack_obj0.push(obj10);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100 + "'", obj10.equals(100));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        stack_obj0.push((java.lang.Object) stack_obj5);
        tutorial.Stack<java.lang.Object> stack_obj9 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj10 = new java.lang.Object();
        stack_obj9.push(obj10);
        java.lang.Object obj12 = stack_obj9.pop();
        boolean b13 = stack_obj9.isEmpty();
        stack_obj5.push((java.lang.Object) b13);
        tutorial.Stack<java.lang.Object> stack_obj15 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj16 = new java.lang.Object();
        stack_obj15.push(obj16);
        java.lang.Object obj18 = stack_obj15.pop();
        stack_obj15.push((java.lang.Object) 1L);
        java.lang.Object obj21 = stack_obj15.pop();
        boolean b22 = stack_obj15.isEmpty();
        stack_obj15.push((java.lang.Object) (-1));
        stack_obj5.push((java.lang.Object) stack_obj15);
        tutorial.Stack<java.lang.Object> stack_obj26 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj27 = new java.lang.Object();
        stack_obj26.push(obj27);
        java.lang.Object obj29 = stack_obj26.pop();
        stack_obj26.push((java.lang.Object) 1L);
        java.lang.Object obj32 = stack_obj26.pop();
        stack_obj26.push((java.lang.Object) (-1));
        boolean b35 = stack_obj26.isEmpty();
        boolean b36 = stack_obj26.isEmpty();
        stack_obj15.push((java.lang.Object) b36);
        tutorial.Stack<java.lang.Object> stack_obj38 = new tutorial.Stack<java.lang.Object>();
        boolean b39 = stack_obj38.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj40 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj41 = new java.lang.Object();
        stack_obj40.push(obj41);
        java.lang.Object obj43 = stack_obj40.pop();
        stack_obj40.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable46 = new tutorial.Stack<java.io.Serializable>();
        stack_obj40.push((java.lang.Object) stack_serializable46);
        stack_obj38.push((java.lang.Object) stack_obj40);
        java.lang.Object obj49 = stack_obj38.pop();
        tutorial.Stack<java.lang.Object> stack_obj50 = new tutorial.Stack<java.lang.Object>();
        stack_obj50.push((java.lang.Object) 10.0f);
        java.lang.Object obj53 = stack_obj50.pop();
        stack_obj50.push((java.lang.Object) "hi!");
        boolean b56 = stack_obj50.isEmpty();
        stack_obj38.push((java.lang.Object) stack_obj50);
        java.lang.Object obj58 = stack_obj50.pop();
        stack_obj15.push(obj58);
        boolean b60 = stack_obj15.isEmpty();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1L + "'", obj21.equals(1L));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 1L + "'", obj32.equals(1L));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 10.0f + "'", obj53.equals(10.0f));
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + "hi!" + "'", obj58.equals("hi!"));
        org.junit.Assert.assertTrue(b60 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        stack_obj0.push((java.lang.Object) stack_obj5);
        tutorial.Stack<java.lang.Object> stack_obj9 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj10 = new java.lang.Object();
        stack_obj9.push(obj10);
        java.lang.Object obj12 = stack_obj9.pop();
        boolean b13 = stack_obj9.isEmpty();
        stack_obj5.push((java.lang.Object) b13);
        tutorial.Stack<java.lang.Object> stack_obj15 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj16 = new java.lang.Object();
        stack_obj15.push(obj16);
        java.lang.Object obj18 = stack_obj15.pop();
        stack_obj15.push((java.lang.Object) 1L);
        java.lang.Object obj21 = stack_obj15.pop();
        boolean b22 = stack_obj15.isEmpty();
        stack_obj15.push((java.lang.Object) (-1));
        stack_obj5.push((java.lang.Object) stack_obj15);
        tutorial.Stack<java.lang.Object> stack_obj26 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj27 = new java.lang.Object();
        stack_obj26.push(obj27);
        java.lang.Object obj29 = stack_obj26.pop();
        stack_obj26.push((java.lang.Object) 1L);
        java.lang.Object obj32 = stack_obj26.pop();
        stack_obj26.push((java.lang.Object) (-1));
        boolean b35 = stack_obj26.isEmpty();
        boolean b36 = stack_obj26.isEmpty();
        stack_obj15.push((java.lang.Object) b36);
        stack_obj15.push((java.lang.Object) (byte) -1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1L + "'", obj21.equals(1L));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 1L + "'", obj32.equals(1L));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        tutorial.Stack<java.lang.Object> stack_obj4 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj5 = new java.lang.Object();
        stack_obj4.push(obj5);
        stack_obj4.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj9 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj10 = new java.lang.Object();
        stack_obj9.push(obj10);
        stack_obj4.push((java.lang.Object) stack_obj9);
        boolean b13 = stack_obj4.isEmpty();
        stack_obj0.push((java.lang.Object) stack_obj4);
        java.lang.Object obj15 = stack_obj0.pop();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) 1L);
        tutorial.Stack<java.lang.Object> stack_obj6 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj7 = new java.lang.Object();
        stack_obj6.push(obj7);
        java.lang.Object obj9 = stack_obj6.pop();
        stack_obj6.push((java.lang.Object) 1L);
        java.lang.Object obj12 = stack_obj6.pop();
        boolean b13 = stack_obj6.isEmpty();
        stack_obj6.push((java.lang.Object) (-1));
        boolean b16 = stack_obj6.isEmpty();
        stack_obj0.push((java.lang.Object) b16);
        boolean b18 = stack_obj0.isEmpty();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1L + "'", obj12.equals(1L));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        stack_obj0.push((java.lang.Object) 10.0f);
        stack_obj0.push((java.lang.Object) 100);
        java.lang.Object obj5 = stack_obj0.pop();
        boolean b6 = stack_obj0.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj7 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj8 = new java.lang.Object();
        stack_obj7.push(obj8);
        java.lang.Object obj10 = stack_obj7.pop();
        stack_obj7.push((java.lang.Object) 1L);
        java.lang.Object obj13 = stack_obj7.pop();
        boolean b14 = stack_obj7.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj15 = new tutorial.Stack<java.lang.Object>();
        boolean b16 = stack_obj15.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj17 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj18 = new java.lang.Object();
        stack_obj17.push(obj18);
        java.lang.Object obj20 = stack_obj17.pop();
        stack_obj17.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable23 = new tutorial.Stack<java.io.Serializable>();
        stack_obj17.push((java.lang.Object) stack_serializable23);
        stack_obj15.push((java.lang.Object) stack_obj17);
        stack_obj7.push((java.lang.Object) stack_obj15);
        tutorial.Stack<java.lang.Object> stack_obj27 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj28 = new java.lang.Object();
        stack_obj27.push(obj28);
        java.lang.Object obj30 = stack_obj27.pop();
        stack_obj27.push((java.lang.Object) 1L);
        java.lang.Object obj33 = stack_obj27.pop();
        boolean b34 = stack_obj27.isEmpty();
        stack_obj27.push((java.lang.Object) (-1));
        java.lang.Object obj37 = stack_obj27.pop();
        boolean b38 = stack_obj27.isEmpty();
        stack_obj7.push((java.lang.Object) stack_obj27);
        tutorial.Stack<java.lang.Object> stack_obj40 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj41 = new java.lang.Object();
        stack_obj40.push(obj41);
        stack_obj40.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj45 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj46 = new java.lang.Object();
        stack_obj45.push(obj46);
        java.lang.Object obj48 = stack_obj45.pop();
        stack_obj45.push((java.lang.Object) 1L);
        java.lang.Object obj51 = stack_obj45.pop();
        boolean b52 = stack_obj45.isEmpty();
        stack_obj45.push((java.lang.Object) (-1));
        stack_obj40.push((java.lang.Object) stack_obj45);
        tutorial.Stack<java.lang.Object> stack_obj56 = new tutorial.Stack<java.lang.Object>();
        stack_obj56.push((java.lang.Object) 10.0f);
        java.lang.Object obj59 = stack_obj56.pop();
        stack_obj56.push((java.lang.Object) "hi!");
        boolean b62 = stack_obj56.isEmpty();
        stack_obj40.push((java.lang.Object) b62);
        boolean b64 = stack_obj40.isEmpty();
        stack_obj27.push((java.lang.Object) stack_obj40);
        stack_obj0.push((java.lang.Object) stack_obj40);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100 + "'", obj5.equals(100));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1L + "'", obj13.equals(1L));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 1L + "'", obj33.equals(1L));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (-1) + "'", obj37.equals((-1)));
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 1L + "'", obj51.equals(1L));
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 10.0f + "'", obj59.equals(10.0f));
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b64 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) 1L);
        java.lang.Object obj6 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) (-1));
        java.lang.Object obj9 = stack_obj0.pop();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1L + "'", obj6.equals(1L));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1) + "'", obj9.equals((-1)));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) false);
        java.lang.Object obj6 = stack_obj0.pop();
        tutorial.Stack<java.lang.Object> stack_obj7 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj8 = new java.lang.Object();
        stack_obj7.push(obj8);
        stack_obj7.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj12 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj13 = new java.lang.Object();
        stack_obj12.push(obj13);
        stack_obj7.push((java.lang.Object) stack_obj12);
        boolean b16 = stack_obj7.isEmpty();
        stack_obj0.push((java.lang.Object) b16);
        tutorial.Stack<java.lang.Object> stack_obj18 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj19 = new java.lang.Object();
        stack_obj18.push(obj19);
        java.lang.Object obj21 = stack_obj18.pop();
        stack_obj18.push((java.lang.Object) false);
        java.lang.Object obj24 = stack_obj18.pop();
        tutorial.Stack<java.lang.Object> stack_obj25 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj26 = new java.lang.Object();
        stack_obj25.push(obj26);
        stack_obj25.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj30 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj31 = new java.lang.Object();
        stack_obj30.push(obj31);
        stack_obj25.push((java.lang.Object) stack_obj30);
        boolean b34 = stack_obj25.isEmpty();
        stack_obj18.push((java.lang.Object) b34);
        boolean b36 = stack_obj18.isEmpty();
        java.lang.Object obj37 = stack_obj18.pop();
        stack_obj0.push(obj37);
        java.lang.Object obj39 = stack_obj0.pop();
        tutorial.Stack<java.lang.Object> stack_obj40 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj41 = new java.lang.Object();
        stack_obj40.push(obj41);
        boolean b43 = stack_obj40.isEmpty();
        stack_obj40.push((java.lang.Object) (short) 100);
        java.lang.Object obj46 = stack_obj40.pop();
        java.lang.Object obj47 = stack_obj40.pop();
        stack_obj0.push((java.lang.Object) stack_obj40);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + false + "'", obj6.equals(false));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + false + "'", obj24.equals(false));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + false + "'", obj37.equals(false));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + false + "'", obj39.equals(false));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + (short) 100 + "'", obj46.equals((short) 100));
        org.junit.Assert.assertNotNull(obj47);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        boolean b5 = stack_obj0.isEmpty();
        java.lang.Object obj6 = stack_obj0.pop();
        boolean b7 = stack_obj0.isEmpty();
        java.lang.Object obj8 = stack_obj0.pop();
        boolean b9 = stack_obj0.isEmpty();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 10.0f + "'", obj6.equals(10.0f));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        boolean b1 = stack_obj0.isEmpty();
        stack_obj0.push((java.lang.Object) '#');
        java.lang.Object obj4 = stack_obj0.pop();
        boolean b5 = stack_obj0.isEmpty();
        tutorial.Stack<java.lang.CharSequence> stack_charSequence6 = new tutorial.Stack<java.lang.CharSequence>();
        stack_obj0.push((java.lang.Object) stack_charSequence6);
        java.lang.Object obj8 = null;
        stack_obj0.push(obj8);
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + '#' + "'", obj4.equals('#'));
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        stack_obj0.push((java.lang.Object) stack_obj5);
        tutorial.Stack<java.lang.Object> stack_obj9 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj10 = new java.lang.Object();
        stack_obj9.push(obj10);
        java.lang.Object obj12 = stack_obj9.pop();
        boolean b13 = stack_obj9.isEmpty();
        stack_obj5.push((java.lang.Object) b13);
        boolean b15 = stack_obj5.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj16 = new tutorial.Stack<java.lang.Object>();
        stack_obj16.push((java.lang.Object) 10.0f);
        java.lang.Object obj19 = stack_obj16.pop();
        stack_obj16.push((java.lang.Object) "hi!");
        tutorial.Stack<java.lang.Object> stack_obj22 = new tutorial.Stack<java.lang.Object>();
        boolean b23 = stack_obj22.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj24 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj25 = new java.lang.Object();
        stack_obj24.push(obj25);
        java.lang.Object obj27 = stack_obj24.pop();
        stack_obj24.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable30 = new tutorial.Stack<java.io.Serializable>();
        stack_obj24.push((java.lang.Object) stack_serializable30);
        stack_obj22.push((java.lang.Object) stack_obj24);
        stack_obj22.push((java.lang.Object) '4');
        stack_obj16.push((java.lang.Object) stack_obj22);
        java.lang.Object obj36 = stack_obj22.pop();
        java.lang.Object obj37 = stack_obj22.pop();
        stack_obj5.push(obj37);
        java.lang.Object obj39 = stack_obj5.pop();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 10.0f + "'", obj19.equals(10.0f));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + '4' + "'", obj36.equals('4'));
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj39);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        tutorial.Stack<java.lang.Object> stack_obj4 = new tutorial.Stack<java.lang.Object>();
        boolean b5 = stack_obj4.isEmpty();
        stack_obj4.push((java.lang.Object) 1.0d);
        stack_obj0.push((java.lang.Object) 1.0d);
        java.lang.Object obj9 = stack_obj0.pop();
        try {
            java.lang.Object obj10 = stack_obj0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0d + "'", obj9.equals(1.0d));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        stack_obj0.push((java.lang.Object) stack_obj5);
        java.lang.Object obj9 = stack_obj0.pop();
        tutorial.Stack<java.lang.Object> stack_obj10 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj11 = new java.lang.Object();
        stack_obj10.push(obj11);
        stack_obj10.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj15 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj16 = new java.lang.Object();
        stack_obj15.push(obj16);
        stack_obj10.push((java.lang.Object) stack_obj15);
        boolean b19 = stack_obj10.isEmpty();
        stack_obj0.push((java.lang.Object) stack_obj10);
        boolean b21 = stack_obj0.isEmpty();
        boolean b22 = stack_obj0.isEmpty();
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        stack_obj0.push((java.lang.Object) 10.0f);
        java.lang.Object obj3 = stack_obj0.pop();
        tutorial.Stack<java.lang.Object> stack_obj4 = new tutorial.Stack<java.lang.Object>();
        boolean b5 = stack_obj4.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj6 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj7 = new java.lang.Object();
        stack_obj6.push(obj7);
        java.lang.Object obj9 = stack_obj6.pop();
        stack_obj6.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable12 = new tutorial.Stack<java.io.Serializable>();
        stack_obj6.push((java.lang.Object) stack_serializable12);
        stack_obj4.push((java.lang.Object) stack_obj6);
        stack_obj0.push((java.lang.Object) stack_obj4);
        boolean b16 = stack_obj4.isEmpty();
        java.lang.Object obj17 = stack_obj4.pop();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10.0f + "'", obj3.equals(10.0f));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        stack_obj0.push((java.lang.Object) stack_obj5);
        boolean b9 = stack_obj5.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj10 = new tutorial.Stack<java.lang.Object>();
        stack_obj10.push((java.lang.Object) 10.0f);
        stack_obj10.push((java.lang.Object) 100);
        boolean b15 = stack_obj10.isEmpty();
        java.lang.Object obj16 = stack_obj10.pop();
        stack_obj5.push(obj16);
        java.lang.Object obj18 = stack_obj5.pop();
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 100 + "'", obj16.equals(100));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 100 + "'", obj18.equals(100));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        stack_obj5.push((java.lang.Object) (short) 100);
        stack_obj0.push((java.lang.Object) (short) 100);
        stack_obj0.push((java.lang.Object) '#');
        stack_obj0.push((java.lang.Object) 10.0d);
        java.lang.Object obj15 = stack_obj0.pop();
        java.lang.Object obj16 = stack_obj0.pop();
        boolean b17 = stack_obj0.isEmpty();
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 10.0d + "'", obj15.equals(10.0d));
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + '#' + "'", obj16.equals('#'));
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        stack_obj0.push((java.lang.Object) 10.0f);
        java.lang.Object obj3 = stack_obj0.pop();
        tutorial.Stack<java.lang.Object> stack_obj4 = new tutorial.Stack<java.lang.Object>();
        boolean b5 = stack_obj4.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj6 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj7 = new java.lang.Object();
        stack_obj6.push(obj7);
        java.lang.Object obj9 = stack_obj6.pop();
        stack_obj6.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable12 = new tutorial.Stack<java.io.Serializable>();
        stack_obj6.push((java.lang.Object) stack_serializable12);
        stack_obj4.push((java.lang.Object) stack_obj6);
        stack_obj0.push((java.lang.Object) stack_obj4);
        stack_obj0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj18 = stack_obj0.pop();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10.0f + "'", obj3.equals(10.0f));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (-1.0d) + "'", obj18.equals((-1.0d)));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        tutorial.Stack<java.lang.Object> stack_obj4 = new tutorial.Stack<java.lang.Object>();
        boolean b5 = stack_obj4.isEmpty();
        stack_obj4.push((java.lang.Object) 1.0d);
        stack_obj0.push((java.lang.Object) 1.0d);
        java.lang.Object obj9 = stack_obj0.pop();
        tutorial.Stack<java.lang.Object> stack_obj10 = new tutorial.Stack<java.lang.Object>();
        stack_obj10.push((java.lang.Object) 10.0f);
        stack_obj10.push((java.lang.Object) 100);
        java.lang.Object obj15 = stack_obj10.pop();
        boolean b16 = stack_obj10.isEmpty();
        java.lang.Object obj17 = stack_obj10.pop();
        stack_obj0.push((java.lang.Object) stack_obj10);
        boolean b19 = stack_obj10.isEmpty();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0d + "'", obj9.equals(1.0d));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 100 + "'", obj15.equals(100));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 10.0f + "'", obj17.equals(10.0f));
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        stack_obj0.push((java.lang.Object) 10.0f);
        stack_obj0.push((java.lang.Object) '4');
        boolean b5 = stack_obj0.isEmpty();
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        stack_obj0.push((java.lang.Object) stack_obj5);
        boolean b9 = stack_obj5.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj10 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj11 = new java.lang.Object();
        stack_obj10.push(obj11);
        java.lang.Object obj13 = stack_obj10.pop();
        stack_obj10.push((java.lang.Object) 1L);
        java.lang.Object obj16 = stack_obj10.pop();
        boolean b17 = stack_obj10.isEmpty();
        stack_obj10.push((java.lang.Object) (-1));
        java.lang.Object obj20 = stack_obj10.pop();
        boolean b21 = stack_obj10.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj22 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj23 = new java.lang.Object();
        stack_obj22.push(obj23);
        java.lang.Object obj25 = stack_obj22.pop();
        stack_obj10.push((java.lang.Object) stack_obj22);
        stack_obj5.push((java.lang.Object) stack_obj22);
        java.lang.Object obj28 = null;
        stack_obj5.push(obj28);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1L + "'", obj16.equals(1L));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (-1) + "'", obj20.equals((-1)));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) 1L);
        java.lang.Object obj6 = stack_obj0.pop();
        boolean b7 = stack_obj0.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj8 = new tutorial.Stack<java.lang.Object>();
        boolean b9 = stack_obj8.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj10 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj11 = new java.lang.Object();
        stack_obj10.push(obj11);
        java.lang.Object obj13 = stack_obj10.pop();
        stack_obj10.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable16 = new tutorial.Stack<java.io.Serializable>();
        stack_obj10.push((java.lang.Object) stack_serializable16);
        stack_obj8.push((java.lang.Object) stack_obj10);
        stack_obj0.push((java.lang.Object) stack_obj8);
        tutorial.Stack<java.lang.Object> stack_obj20 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj21 = new java.lang.Object();
        stack_obj20.push(obj21);
        java.lang.Object obj23 = stack_obj20.pop();
        stack_obj20.push((java.lang.Object) 1L);
        java.lang.Object obj26 = stack_obj20.pop();
        boolean b27 = stack_obj20.isEmpty();
        stack_obj20.push((java.lang.Object) (-1));
        java.lang.Object obj30 = stack_obj20.pop();
        boolean b31 = stack_obj20.isEmpty();
        stack_obj0.push((java.lang.Object) stack_obj20);
        tutorial.Stack<java.lang.Object> stack_obj33 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj34 = new java.lang.Object();
        stack_obj33.push(obj34);
        stack_obj33.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj38 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj39 = new java.lang.Object();
        stack_obj38.push(obj39);
        java.lang.Object obj41 = stack_obj38.pop();
        stack_obj38.push((java.lang.Object) 1L);
        java.lang.Object obj44 = stack_obj38.pop();
        boolean b45 = stack_obj38.isEmpty();
        stack_obj38.push((java.lang.Object) (-1));
        stack_obj33.push((java.lang.Object) stack_obj38);
        tutorial.Stack<java.lang.Object> stack_obj49 = new tutorial.Stack<java.lang.Object>();
        stack_obj49.push((java.lang.Object) 10.0f);
        java.lang.Object obj52 = stack_obj49.pop();
        stack_obj49.push((java.lang.Object) "hi!");
        boolean b55 = stack_obj49.isEmpty();
        stack_obj33.push((java.lang.Object) b55);
        boolean b57 = stack_obj33.isEmpty();
        stack_obj20.push((java.lang.Object) stack_obj33);
        boolean b59 = stack_obj20.isEmpty();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1L + "'", obj6.equals(1L));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 1L + "'", obj26.equals(1L));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (-1) + "'", obj30.equals((-1)));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 1L + "'", obj44.equals(1L));
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 10.0f + "'", obj52.equals(10.0f));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b59 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        stack_obj0.push((java.lang.Object) stack_obj5);
        java.lang.Object obj9 = stack_obj0.pop();
        boolean b10 = stack_obj0.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj11 = new tutorial.Stack<java.lang.Object>();
        stack_obj11.push((java.lang.Object) 10.0f);
        java.lang.Object obj14 = stack_obj11.pop();
        stack_obj11.push((java.lang.Object) "hi!");
        boolean b17 = stack_obj11.isEmpty();
        stack_obj0.push((java.lang.Object) stack_obj11);
        java.lang.Object obj19 = stack_obj0.pop();
        tutorial.Stack<java.lang.Object> stack_obj20 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj21 = new java.lang.Object();
        stack_obj20.push(obj21);
        java.lang.Object obj23 = stack_obj20.pop();
        stack_obj20.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable26 = new tutorial.Stack<java.io.Serializable>();
        stack_obj20.push((java.lang.Object) stack_serializable26);
        boolean b28 = stack_obj20.isEmpty();
        stack_obj20.push((java.lang.Object) 1);
        stack_obj0.push((java.lang.Object) stack_obj20);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 10.0f + "'", obj14.equals(10.0f));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        stack_obj5.push((java.lang.Object) (short) 100);
        stack_obj0.push((java.lang.Object) (short) 100);
        java.lang.Object obj11 = stack_obj0.pop();
        boolean b12 = stack_obj0.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj13 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj14 = new java.lang.Object();
        stack_obj13.push(obj14);
        java.lang.Object obj16 = stack_obj13.pop();
        stack_obj13.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable19 = new tutorial.Stack<java.io.Serializable>();
        stack_obj13.push((java.lang.Object) stack_serializable19);
        java.lang.Object obj21 = stack_obj13.pop();
        boolean b22 = stack_obj13.isEmpty();
        java.lang.Object obj23 = stack_obj13.pop();
        tutorial.Stack<java.lang.Object> stack_obj24 = new tutorial.Stack<java.lang.Object>();
        stack_obj24.push((java.lang.Object) 10.0f);
        java.lang.Object obj27 = stack_obj24.pop();
        boolean b28 = stack_obj24.isEmpty();
        stack_obj13.push((java.lang.Object) b28);
        stack_obj0.push((java.lang.Object) stack_obj13);
        boolean b31 = stack_obj13.isEmpty();
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 100 + "'", obj11.equals((short) 100));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 1L + "'", obj23.equals(1L));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 10.0f + "'", obj27.equals(10.0f));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        stack_obj0.push((java.lang.Object) 10.0f);
        java.lang.Object obj3 = stack_obj0.pop();
        tutorial.Stack<java.lang.Object> stack_obj4 = new tutorial.Stack<java.lang.Object>();
        boolean b5 = stack_obj4.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj6 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj7 = new java.lang.Object();
        stack_obj6.push(obj7);
        java.lang.Object obj9 = stack_obj6.pop();
        stack_obj6.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable12 = new tutorial.Stack<java.io.Serializable>();
        stack_obj6.push((java.lang.Object) stack_serializable12);
        stack_obj4.push((java.lang.Object) stack_obj6);
        stack_obj0.push((java.lang.Object) stack_obj4);
        tutorial.Stack<java.lang.Object> stack_obj16 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj17 = new java.lang.Object();
        stack_obj16.push(obj17);
        java.lang.Object obj19 = stack_obj16.pop();
        stack_obj16.push((java.lang.Object) false);
        java.lang.Object obj22 = stack_obj16.pop();
        tutorial.Stack<java.lang.Object> stack_obj23 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj24 = new java.lang.Object();
        stack_obj23.push(obj24);
        stack_obj23.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj28 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj29 = new java.lang.Object();
        stack_obj28.push(obj29);
        stack_obj23.push((java.lang.Object) stack_obj28);
        boolean b32 = stack_obj23.isEmpty();
        stack_obj16.push((java.lang.Object) b32);
        stack_obj16.push((java.lang.Object) "hi!");
        stack_obj4.push((java.lang.Object) stack_obj16);
        boolean b37 = stack_obj4.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10.0f + "'", obj3.equals(10.0f));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + false + "'", obj22.equals(false));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b37 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        stack_obj5.push((java.lang.Object) (short) 100);
        stack_obj0.push((java.lang.Object) (short) 100);
        stack_obj0.push((java.lang.Object) '#');
        tutorial.Stack<java.lang.Object> stack_obj13 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj14 = new java.lang.Object();
        stack_obj13.push(obj14);
        java.lang.Object obj16 = stack_obj13.pop();
        stack_obj13.push((java.lang.Object) 1L);
        stack_obj0.push((java.lang.Object) 1L);
        tutorial.Stack<java.lang.Object> stack_obj20 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj21 = new java.lang.Object();
        stack_obj20.push(obj21);
        stack_obj20.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj25 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj26 = new java.lang.Object();
        stack_obj25.push(obj26);
        stack_obj20.push((java.lang.Object) stack_obj25);
        boolean b29 = stack_obj20.isEmpty();
        boolean b30 = stack_obj20.isEmpty();
        boolean b31 = stack_obj20.isEmpty();
        stack_obj0.push((java.lang.Object) b31);
        tutorial.Stack<java.lang.Object> stack_obj33 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj34 = new java.lang.Object();
        stack_obj33.push(obj34);
        java.lang.Object obj36 = stack_obj33.pop();
        tutorial.Stack<java.lang.Object> stack_obj37 = new tutorial.Stack<java.lang.Object>();
        stack_obj37.push((java.lang.Object) 10.0f);
        java.lang.Object obj40 = stack_obj37.pop();
        stack_obj37.push((java.lang.Object) "hi!");
        tutorial.Stack<java.lang.Object> stack_obj43 = new tutorial.Stack<java.lang.Object>();
        boolean b44 = stack_obj43.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj45 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj46 = new java.lang.Object();
        stack_obj45.push(obj46);
        java.lang.Object obj48 = stack_obj45.pop();
        stack_obj45.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable51 = new tutorial.Stack<java.io.Serializable>();
        stack_obj45.push((java.lang.Object) stack_serializable51);
        stack_obj43.push((java.lang.Object) stack_obj45);
        stack_obj43.push((java.lang.Object) '4');
        stack_obj37.push((java.lang.Object) stack_obj43);
        java.lang.Object obj57 = stack_obj43.pop();
        java.lang.Object obj58 = stack_obj43.pop();
        stack_obj33.push(obj58);
        java.lang.Object obj60 = stack_obj33.pop();
        stack_obj0.push((java.lang.Object) stack_obj33);
        boolean b62 = stack_obj33.isEmpty();
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 10.0f + "'", obj40.equals(10.0f));
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + '4' + "'", obj57.equals('4'));
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertTrue(b62 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) false);
        java.lang.Object obj6 = stack_obj0.pop();
        tutorial.Stack<java.lang.Object> stack_obj7 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj8 = new java.lang.Object();
        stack_obj7.push(obj8);
        stack_obj7.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj12 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj13 = new java.lang.Object();
        stack_obj12.push(obj13);
        stack_obj7.push((java.lang.Object) stack_obj12);
        boolean b16 = stack_obj7.isEmpty();
        stack_obj0.push((java.lang.Object) b16);
        stack_obj0.push((java.lang.Object) (short) 100);
        tutorial.Stack<java.lang.Object> stack_obj20 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj21 = new java.lang.Object();
        stack_obj20.push(obj21);
        stack_obj20.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj25 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj26 = new java.lang.Object();
        stack_obj25.push(obj26);
        stack_obj20.push((java.lang.Object) stack_obj25);
        boolean b29 = stack_obj25.isEmpty();
        boolean b30 = stack_obj25.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj31 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj32 = new java.lang.Object();
        stack_obj31.push(obj32);
        boolean b34 = stack_obj31.isEmpty();
        stack_obj31.push((java.lang.Object) (short) 100);
        stack_obj25.push((java.lang.Object) stack_obj31);
        stack_obj0.push((java.lang.Object) stack_obj25);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + false + "'", obj6.equals(false));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj3 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj4 = new java.lang.Object();
        stack_obj3.push(obj4);
        stack_obj3.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj8 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj9 = new java.lang.Object();
        stack_obj8.push(obj9);
        stack_obj3.push((java.lang.Object) stack_obj8);
        boolean b12 = stack_obj8.isEmpty();
        boolean b13 = stack_obj8.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj14 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj15 = new java.lang.Object();
        stack_obj14.push(obj15);
        boolean b17 = stack_obj14.isEmpty();
        stack_obj14.push((java.lang.Object) (short) 100);
        stack_obj8.push((java.lang.Object) stack_obj14);
        boolean b21 = stack_obj8.isEmpty();
        stack_obj0.push((java.lang.Object) b21);
        boolean b23 = stack_obj0.isEmpty();
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) 1L);
        java.lang.Object obj6 = stack_obj0.pop();
        boolean b7 = stack_obj0.isEmpty();
        stack_obj0.push((java.lang.Object) (-1));
        java.lang.Object obj10 = stack_obj0.pop();
        boolean b11 = stack_obj0.isEmpty();
        boolean b12 = stack_obj0.isEmpty();
        boolean b13 = stack_obj0.isEmpty();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1L + "'", obj6.equals(1L));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1) + "'", obj10.equals((-1)));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        stack_obj0.push((java.lang.Object) stack_obj5);
        tutorial.Stack<java.lang.Object> stack_obj9 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj10 = new java.lang.Object();
        stack_obj9.push(obj10);
        java.lang.Object obj12 = stack_obj9.pop();
        boolean b13 = stack_obj9.isEmpty();
        stack_obj5.push((java.lang.Object) b13);
        tutorial.Stack<java.lang.Object> stack_obj15 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj16 = new java.lang.Object();
        stack_obj15.push(obj16);
        java.lang.Object obj18 = stack_obj15.pop();
        stack_obj15.push((java.lang.Object) 1L);
        java.lang.Object obj21 = stack_obj15.pop();
        boolean b22 = stack_obj15.isEmpty();
        stack_obj15.push((java.lang.Object) (-1));
        stack_obj5.push((java.lang.Object) stack_obj15);
        tutorial.Stack<java.lang.Object> stack_obj26 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj27 = new java.lang.Object();
        stack_obj26.push(obj27);
        java.lang.Object obj29 = stack_obj26.pop();
        stack_obj26.push((java.lang.Object) 1L);
        java.lang.Object obj32 = stack_obj26.pop();
        stack_obj26.push((java.lang.Object) (-1));
        tutorial.Stack<java.lang.Object> stack_obj35 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj36 = new java.lang.Object();
        stack_obj35.push(obj36);
        java.lang.Object obj38 = stack_obj35.pop();
        stack_obj35.push((java.lang.Object) 1L);
        java.lang.Object obj41 = stack_obj35.pop();
        boolean b42 = stack_obj35.isEmpty();
        stack_obj35.push((java.lang.Object) (-1));
        java.lang.Object obj45 = stack_obj35.pop();
        boolean b46 = stack_obj35.isEmpty();
        boolean b47 = stack_obj35.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj48 = new tutorial.Stack<java.lang.Object>();
        boolean b49 = stack_obj48.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj50 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj51 = new java.lang.Object();
        stack_obj50.push(obj51);
        java.lang.Object obj53 = stack_obj50.pop();
        stack_obj50.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable56 = new tutorial.Stack<java.io.Serializable>();
        stack_obj50.push((java.lang.Object) stack_serializable56);
        stack_obj48.push((java.lang.Object) stack_obj50);
        tutorial.Stack<java.lang.Object> stack_obj59 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj60 = new java.lang.Object();
        stack_obj59.push(obj60);
        java.lang.Object obj62 = stack_obj59.pop();
        stack_obj59.push((java.lang.Object) 1L);
        java.lang.Object obj65 = stack_obj59.pop();
        stack_obj48.push((java.lang.Object) stack_obj59);
        stack_obj35.push((java.lang.Object) stack_obj48);
        stack_obj26.push((java.lang.Object) stack_obj48);
        stack_obj5.push((java.lang.Object) stack_obj48);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1L + "'", obj21.equals(1L));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 1L + "'", obj32.equals(1L));
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 1L + "'", obj41.equals(1L));
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (-1) + "'", obj45.equals((-1)));
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 1L + "'", obj65.equals(1L));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) 1L);
        java.lang.Object obj6 = stack_obj0.pop();
        boolean b7 = stack_obj0.isEmpty();
        stack_obj0.push((java.lang.Object) (-1));
        java.lang.Object obj10 = stack_obj0.pop();
        boolean b11 = stack_obj0.isEmpty();
        boolean b12 = stack_obj0.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj13 = new tutorial.Stack<java.lang.Object>();
        boolean b14 = stack_obj13.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj15 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj16 = new java.lang.Object();
        stack_obj15.push(obj16);
        java.lang.Object obj18 = stack_obj15.pop();
        stack_obj15.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable21 = new tutorial.Stack<java.io.Serializable>();
        stack_obj15.push((java.lang.Object) stack_serializable21);
        stack_obj13.push((java.lang.Object) stack_obj15);
        tutorial.Stack<java.lang.Object> stack_obj24 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj25 = new java.lang.Object();
        stack_obj24.push(obj25);
        java.lang.Object obj27 = stack_obj24.pop();
        stack_obj24.push((java.lang.Object) 1L);
        java.lang.Object obj30 = stack_obj24.pop();
        stack_obj13.push((java.lang.Object) stack_obj24);
        stack_obj0.push((java.lang.Object) stack_obj13);
        boolean b33 = stack_obj0.isEmpty();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1L + "'", obj6.equals(1L));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1) + "'", obj10.equals((-1)));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 1L + "'", obj30.equals(1L));
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        java.lang.Object obj8 = stack_obj5.pop();
        stack_obj5.push((java.lang.Object) 1L);
        java.lang.Object obj11 = stack_obj5.pop();
        boolean b12 = stack_obj5.isEmpty();
        stack_obj5.push((java.lang.Object) (-1));
        stack_obj0.push((java.lang.Object) stack_obj5);
        stack_obj5.push((java.lang.Object) 100);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 1L + "'", obj11.equals(1L));
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        stack_obj0.push((java.lang.Object) stack_obj5);
        tutorial.Stack<java.lang.Object> stack_obj9 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj10 = new java.lang.Object();
        stack_obj9.push(obj10);
        java.lang.Object obj12 = stack_obj9.pop();
        boolean b13 = stack_obj9.isEmpty();
        stack_obj5.push((java.lang.Object) b13);
        tutorial.Stack<java.lang.Object> stack_obj15 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj16 = new java.lang.Object();
        stack_obj15.push(obj16);
        java.lang.Object obj18 = stack_obj15.pop();
        stack_obj15.push((java.lang.Object) 1L);
        java.lang.Object obj21 = stack_obj15.pop();
        boolean b22 = stack_obj15.isEmpty();
        stack_obj15.push((java.lang.Object) (-1));
        stack_obj5.push((java.lang.Object) stack_obj15);
        tutorial.Stack<java.lang.Object> stack_obj26 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj27 = new java.lang.Object();
        stack_obj26.push(obj27);
        java.lang.Object obj29 = stack_obj26.pop();
        stack_obj26.push((java.lang.Object) 1L);
        java.lang.Object obj32 = stack_obj26.pop();
        stack_obj26.push((java.lang.Object) (-1));
        boolean b35 = stack_obj26.isEmpty();
        boolean b36 = stack_obj26.isEmpty();
        stack_obj15.push((java.lang.Object) b36);
        tutorial.Stack<java.lang.Object> stack_obj38 = new tutorial.Stack<java.lang.Object>();
        boolean b39 = stack_obj38.isEmpty();
        stack_obj38.push((java.lang.Object) 1.0d);
        stack_obj38.push((java.lang.Object) (byte) -1);
        stack_obj15.push((java.lang.Object) stack_obj38);
        java.lang.Object obj45 = stack_obj15.pop();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1L + "'", obj21.equals(1L));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 1L + "'", obj32.equals(1L));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(obj45);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        stack_obj0.push((java.lang.Object) (byte) 0);
        boolean b3 = stack_obj0.isEmpty();
        boolean b4 = stack_obj0.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        java.lang.Object obj8 = stack_obj5.pop();
        stack_obj5.push((java.lang.Object) 1L);
        java.lang.Object obj11 = stack_obj5.pop();
        boolean b12 = stack_obj5.isEmpty();
        stack_obj5.push((java.lang.Object) (-1));
        stack_obj0.push((java.lang.Object) stack_obj5);
        boolean b16 = stack_obj5.isEmpty();
        boolean b17 = stack_obj5.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj18 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj19 = new java.lang.Object();
        stack_obj18.push(obj19);
        stack_obj18.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj23 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj24 = new java.lang.Object();
        stack_obj23.push(obj24);
        stack_obj23.push((java.lang.Object) (short) 100);
        stack_obj18.push((java.lang.Object) (short) 100);
        java.lang.Object obj29 = stack_obj18.pop();
        stack_obj5.push(obj29);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 1L + "'", obj11.equals(1L));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (short) 100 + "'", obj29.equals((short) 100));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) 1L);
        java.lang.Object obj6 = stack_obj0.pop();
        boolean b7 = stack_obj0.isEmpty();
        stack_obj0.push((java.lang.Object) (-1));
        boolean b10 = stack_obj0.isEmpty();
        boolean b11 = stack_obj0.isEmpty();
        boolean b12 = stack_obj0.isEmpty();
        java.lang.Object obj13 = stack_obj0.pop();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1L + "'", obj6.equals(1L));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (-1) + "'", obj13.equals((-1)));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        stack_obj0.push((java.lang.Object) stack_obj5);
        boolean b9 = stack_obj5.isEmpty();
        boolean b10 = stack_obj5.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj11 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj12 = new java.lang.Object();
        stack_obj11.push(obj12);
        boolean b14 = stack_obj11.isEmpty();
        stack_obj11.push((java.lang.Object) (short) 100);
        stack_obj5.push((java.lang.Object) stack_obj11);
        boolean b18 = stack_obj5.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj19 = new tutorial.Stack<java.lang.Object>();
        boolean b20 = stack_obj19.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj21 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj22 = new java.lang.Object();
        stack_obj21.push(obj22);
        java.lang.Object obj24 = stack_obj21.pop();
        stack_obj21.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable27 = new tutorial.Stack<java.io.Serializable>();
        stack_obj21.push((java.lang.Object) stack_serializable27);
        stack_obj19.push((java.lang.Object) stack_obj21);
        stack_obj19.push((java.lang.Object) '4');
        stack_obj5.push((java.lang.Object) '4');
        boolean b33 = stack_obj5.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj34 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj35 = new java.lang.Object();
        stack_obj34.push(obj35);
        stack_obj34.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj39 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj40 = new java.lang.Object();
        stack_obj39.push(obj40);
        stack_obj34.push((java.lang.Object) stack_obj39);
        boolean b43 = stack_obj39.isEmpty();
        tutorial.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str44 = new tutorial.Stack<java.lang.Comparable<java.lang.String>>();
        stack_obj39.push((java.lang.Object) stack_comparable_str44);
        tutorial.Stack<java.lang.Object> stack_obj46 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj47 = new java.lang.Object();
        stack_obj46.push(obj47);
        stack_obj46.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj51 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj52 = new java.lang.Object();
        stack_obj51.push(obj52);
        stack_obj46.push((java.lang.Object) stack_obj51);
        tutorial.Stack<java.lang.Object> stack_obj55 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj56 = new java.lang.Object();
        stack_obj55.push(obj56);
        java.lang.Object obj58 = stack_obj55.pop();
        boolean b59 = stack_obj55.isEmpty();
        stack_obj51.push((java.lang.Object) b59);
        tutorial.Stack<java.lang.Object> stack_obj61 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj62 = new java.lang.Object();
        stack_obj61.push(obj62);
        java.lang.Object obj64 = stack_obj61.pop();
        stack_obj61.push((java.lang.Object) 1L);
        java.lang.Object obj67 = stack_obj61.pop();
        boolean b68 = stack_obj61.isEmpty();
        stack_obj61.push((java.lang.Object) (-1));
        stack_obj51.push((java.lang.Object) stack_obj61);
        java.lang.Object obj72 = stack_obj51.pop();
        boolean b73 = stack_obj51.isEmpty();
        java.lang.Object obj74 = stack_obj51.pop();
        tutorial.Stack<java.lang.Object> stack_obj75 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj76 = new java.lang.Object();
        stack_obj75.push(obj76);
        stack_obj75.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj80 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj81 = new java.lang.Object();
        stack_obj80.push(obj81);
        stack_obj75.push((java.lang.Object) stack_obj80);
        java.lang.Object obj84 = stack_obj75.pop();
        stack_obj51.push((java.lang.Object) stack_obj75);
        java.lang.Object obj86 = stack_obj51.pop();
        stack_obj39.push((java.lang.Object) stack_obj51);
        stack_obj5.push((java.lang.Object) stack_obj39);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 1L + "'", obj67.equals(1L));
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + true + "'", obj74.equals(true));
        org.junit.Assert.assertNotNull(obj84);
        org.junit.Assert.assertNotNull(obj86);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        stack_obj0.push((java.lang.Object) 10.0f);
        boolean b3 = stack_obj0.isEmpty();
        boolean b4 = stack_obj0.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        boolean b8 = stack_obj5.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj9 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj10 = new java.lang.Object();
        stack_obj9.push(obj10);
        stack_obj5.push(obj10);
        boolean b13 = stack_obj5.isEmpty();
        java.lang.Object obj14 = stack_obj5.pop();
        stack_obj0.push((java.lang.Object) stack_obj5);
        java.lang.Object obj16 = stack_obj5.pop();
        try {
            java.lang.Object obj17 = stack_obj5.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        java.lang.Object obj8 = stack_obj5.pop();
        stack_obj5.push((java.lang.Object) 1L);
        java.lang.Object obj11 = stack_obj5.pop();
        boolean b12 = stack_obj5.isEmpty();
        stack_obj5.push((java.lang.Object) (-1));
        stack_obj0.push((java.lang.Object) stack_obj5);
        tutorial.Stack<java.lang.Object> stack_obj16 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj17 = new java.lang.Object();
        stack_obj16.push(obj17);
        java.lang.Object obj19 = stack_obj16.pop();
        stack_obj16.push((java.lang.Object) 1L);
        java.lang.Object obj22 = stack_obj16.pop();
        boolean b23 = stack_obj16.isEmpty();
        stack_obj16.push((java.lang.Object) (-1));
        java.lang.Object obj26 = stack_obj16.pop();
        boolean b27 = stack_obj16.isEmpty();
        boolean b28 = stack_obj16.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj29 = new tutorial.Stack<java.lang.Object>();
        stack_obj29.push((java.lang.Object) 10.0f);
        java.lang.Object obj32 = stack_obj29.pop();
        tutorial.Stack<java.lang.Object> stack_obj33 = new tutorial.Stack<java.lang.Object>();
        boolean b34 = stack_obj33.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj35 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj36 = new java.lang.Object();
        stack_obj35.push(obj36);
        java.lang.Object obj38 = stack_obj35.pop();
        stack_obj35.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable41 = new tutorial.Stack<java.io.Serializable>();
        stack_obj35.push((java.lang.Object) stack_serializable41);
        stack_obj33.push((java.lang.Object) stack_obj35);
        stack_obj29.push((java.lang.Object) stack_obj33);
        stack_obj16.push((java.lang.Object) stack_obj33);
        java.lang.Object obj46 = stack_obj16.pop();
        tutorial.Stack<java.lang.Object> stack_obj47 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj48 = new java.lang.Object();
        stack_obj47.push(obj48);
        stack_obj47.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj52 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj53 = new java.lang.Object();
        stack_obj52.push(obj53);
        stack_obj47.push((java.lang.Object) stack_obj52);
        boolean b56 = stack_obj47.isEmpty();
        boolean b57 = stack_obj47.isEmpty();
        stack_obj16.push((java.lang.Object) stack_obj47);
        stack_obj5.push((java.lang.Object) stack_obj47);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 1L + "'", obj11.equals(1L));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 1L + "'", obj22.equals(1L));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (-1) + "'", obj26.equals((-1)));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 10.0f + "'", obj32.equals(10.0f));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b57 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        boolean b1 = stack_obj0.isEmpty();
        stack_obj0.push((java.lang.Object) 1.0d);
        boolean b4 = stack_obj0.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        stack_obj5.push((java.lang.Object) (byte) 0);
        boolean b8 = stack_obj5.isEmpty();
        stack_obj0.push((java.lang.Object) stack_obj5);
        tutorial.Stack<java.lang.Object> stack_obj10 = new tutorial.Stack<java.lang.Object>();
        boolean b11 = stack_obj10.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj12 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj13 = new java.lang.Object();
        stack_obj12.push(obj13);
        java.lang.Object obj15 = stack_obj12.pop();
        stack_obj12.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable18 = new tutorial.Stack<java.io.Serializable>();
        stack_obj12.push((java.lang.Object) stack_serializable18);
        stack_obj10.push((java.lang.Object) stack_obj12);
        stack_obj10.push((java.lang.Object) '4');
        java.lang.Object obj23 = stack_obj10.pop();
        stack_obj0.push(obj23);
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + '4' + "'", obj23.equals('4'));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        boolean b1 = stack_obj0.isEmpty();
        stack_obj0.push((java.lang.Object) '#');
        java.lang.Object obj4 = stack_obj0.pop();
        try {
            java.lang.Object obj5 = stack_obj0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + '#' + "'", obj4.equals('#'));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        java.lang.Object obj3 = stack_obj0.pop();
        stack_obj0.push((java.lang.Object) 1L);
        java.lang.Object obj6 = stack_obj0.pop();
        boolean b7 = stack_obj0.isEmpty();
        stack_obj0.push((java.lang.Object) (-1));
        java.lang.Object obj10 = stack_obj0.pop();
        boolean b11 = stack_obj0.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj12 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj13 = new java.lang.Object();
        stack_obj12.push(obj13);
        java.lang.Object obj15 = stack_obj12.pop();
        stack_obj0.push((java.lang.Object) stack_obj12);
        java.lang.Object obj17 = stack_obj0.pop();
        tutorial.Stack<java.lang.Object> stack_obj18 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj19 = new java.lang.Object();
        stack_obj18.push(obj19);
        java.lang.Object obj21 = stack_obj18.pop();
        stack_obj18.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable24 = new tutorial.Stack<java.io.Serializable>();
        stack_obj18.push((java.lang.Object) stack_serializable24);
        java.lang.Object obj26 = stack_obj18.pop();
        stack_obj0.push((java.lang.Object) stack_obj18);
        tutorial.Stack<java.lang.Object> stack_obj28 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj29 = new java.lang.Object();
        stack_obj28.push(obj29);
        stack_obj28.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj33 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj34 = new java.lang.Object();
        stack_obj33.push(obj34);
        stack_obj33.push((java.lang.Object) (short) 100);
        stack_obj28.push((java.lang.Object) (short) 100);
        stack_obj28.push((java.lang.Object) '#');
        java.lang.Object obj41 = stack_obj28.pop();
        java.lang.Object obj42 = stack_obj28.pop();
        stack_obj0.push((java.lang.Object) stack_obj28);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1L + "'", obj6.equals(1L));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1) + "'", obj10.equals((-1)));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + '#' + "'", obj41.equals('#'));
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (short) 100 + "'", obj42.equals((short) 100));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj1 = new java.lang.Object();
        stack_obj0.push(obj1);
        stack_obj0.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj6 = new java.lang.Object();
        stack_obj5.push(obj6);
        stack_obj0.push((java.lang.Object) stack_obj5);
        java.lang.Object obj9 = stack_obj0.pop();
        boolean b10 = stack_obj0.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj11 = new tutorial.Stack<java.lang.Object>();
        stack_obj11.push((java.lang.Object) 10.0f);
        java.lang.Object obj14 = stack_obj11.pop();
        stack_obj11.push((java.lang.Object) "hi!");
        boolean b17 = stack_obj11.isEmpty();
        stack_obj0.push((java.lang.Object) stack_obj11);
        tutorial.Stack<java.lang.Object> stack_obj19 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj20 = new java.lang.Object();
        stack_obj19.push(obj20);
        stack_obj19.push((java.lang.Object) 10.0f);
        tutorial.Stack<java.lang.Object> stack_obj24 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj25 = new java.lang.Object();
        stack_obj24.push(obj25);
        stack_obj19.push((java.lang.Object) stack_obj24);
        stack_obj0.push((java.lang.Object) stack_obj19);
        boolean b29 = stack_obj19.isEmpty();
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 10.0f + "'", obj14.equals(10.0f));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
        boolean b1 = stack_obj0.isEmpty();
        stack_obj0.push((java.lang.Object) 1.0d);
        boolean b4 = stack_obj0.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj5 = new tutorial.Stack<java.lang.Object>();
        boolean b6 = stack_obj5.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj7 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj8 = new java.lang.Object();
        stack_obj7.push(obj8);
        java.lang.Object obj10 = stack_obj7.pop();
        stack_obj7.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable13 = new tutorial.Stack<java.io.Serializable>();
        stack_obj7.push((java.lang.Object) stack_serializable13);
        stack_obj5.push((java.lang.Object) stack_obj7);
        java.lang.Object obj16 = stack_obj7.pop();
        tutorial.Stack<java.lang.Object> stack_obj17 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj18 = new java.lang.Object();
        stack_obj17.push(obj18);
        boolean b20 = stack_obj17.isEmpty();
        stack_obj17.push((java.lang.Object) (short) 100);
        stack_obj7.push((java.lang.Object) stack_obj17);
        tutorial.Stack<java.lang.Object> stack_obj24 = new tutorial.Stack<java.lang.Object>();
        boolean b25 = stack_obj24.isEmpty();
        tutorial.Stack<java.lang.Object> stack_obj26 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj27 = new java.lang.Object();
        stack_obj26.push(obj27);
        java.lang.Object obj29 = stack_obj26.pop();
        stack_obj26.push((java.lang.Object) 1L);
        tutorial.Stack<java.io.Serializable> stack_serializable32 = new tutorial.Stack<java.io.Serializable>();
        stack_obj26.push((java.lang.Object) stack_serializable32);
        stack_obj24.push((java.lang.Object) stack_obj26);
        java.lang.Object obj35 = stack_obj26.pop();
        tutorial.Stack<java.lang.Object> stack_obj36 = new tutorial.Stack<java.lang.Object>();
        java.lang.Object obj37 = new java.lang.Object();
        stack_obj36.push(obj37);
        boolean b39 = stack_obj36.isEmpty();
        stack_obj36.push((java.lang.Object) (short) 100);
        stack_obj26.push((java.lang.Object) stack_obj36);
        boolean b43 = stack_obj36.isEmpty();
        stack_obj7.push((java.lang.Object) stack_obj36);
        stack_obj0.push((java.lang.Object) stack_obj36);
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b43 == false);
    }
}

