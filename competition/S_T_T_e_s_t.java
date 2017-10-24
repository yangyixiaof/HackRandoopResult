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
	public void test1() throws Throwable {
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
	public void test2() throws Throwable {
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
	public void test3() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test008");
		tutorial.Stack<java.lang.String> stack_str0 = new tutorial.Stack<java.lang.String>();
	}

	@Test
	public void test4() throws Throwable {
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
	public void test5() throws Throwable {
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
	public void test6() throws Throwable {
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
	public void test7() throws Throwable {
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
	public void test8() throws Throwable {
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
	public void test9() throws Throwable {
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
	public void test10() throws Throwable {
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
	public void test11() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test026");
		tutorial.Stack<java.lang.Object> stack_obj0 = new tutorial.Stack<java.lang.Object>();
		stack_obj0.push((java.lang.Object) 10.0f);
		stack_obj0.push((java.lang.Object) 100);
		stack_obj0.push((java.lang.Object) '#');
	}

	@Test
	public void test12() throws Throwable {
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
	public void test13() throws Throwable {
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
	public void test14() throws Throwable {
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
	public void test15() throws Throwable {
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
	public void test16() throws Throwable {
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
	public void test17() throws Throwable {
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
	public void test18() throws Throwable {
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
	public void test19() throws Throwable {
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
	public void test20() throws Throwable {
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
	public void test21() throws Throwable {
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
	public void test22() throws Throwable {
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
	public void test23() throws Throwable {
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
	public void test24() throws Throwable {
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
	public void test25() throws Throwable {
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
	public void test26() throws Throwable {
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
	public void test27() throws Throwable {
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
	public void test28() throws Throwable {
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
	public void test29() throws Throwable {
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
	public void test30() throws Throwable {
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
	public void test31() throws Throwable {
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
	public void test32() throws Throwable {
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
	public void test33() throws Throwable {
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
	public void test34() throws Throwable {
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
	public void test35() throws Throwable {
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
	public void test36() throws Throwable {
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
	public void test37() throws Throwable {
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
	public void test38() throws Throwable {
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
	public void test39() throws Throwable {
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
	public void test40() throws Throwable {
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
	public void test41() throws Throwable {
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
	public void test42() throws Throwable {
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
	public void test43() throws Throwable {
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
	public void test44() throws Throwable {
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
	public void test45() throws Throwable {
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
	public void test46() throws Throwable {
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
	public void test47() throws Throwable {
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
	public void test48() throws Throwable {
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
	public void test49() throws Throwable {
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
	public void test50() throws Throwable {
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
	public void test51() throws Throwable {
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
	public void test52() throws Throwable {
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
	public void test53() throws Throwable {
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
	public void test54() throws Throwable {
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
	public void test55() throws Throwable {
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
	public void test56() throws Throwable {
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
	public void test57() throws Throwable {
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
	public void test58() throws Throwable {
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
	public void test59() throws Throwable {
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
	public void test60() throws Throwable {
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
	public void test61() throws Throwable {
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
	public void test62() throws Throwable {
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
	public void test63() throws Throwable {
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
	public void test64() throws Throwable {
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
