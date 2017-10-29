import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.FixMethodOrder;

public class J_D_T_e_s_t_f_test44 {

	public static boolean debug = false;

	public static void f_test44(int x1, int x2, int x3, int x4, int x5, int x6) {
	    if (debug)
	        System.out.format("%n%s%n", "RegressionTest2.test082");
	    Date date3 = new Date(x1, x2, x3);
	    Year year4 = date3.getYear();
	    boolean b6 = date3.equals((java.lang.Object) "hi!");
	    Day day7 = date3.getDay();
	    Year year11 = new Year(x4);
	    boolean b12 = year11.isValid();
	    Month month13 = new Month(x5, year11);
	    day7.setDay(x6, month13);
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
	public void test_f_test44_0() {
		f_test44(0,0,0,0,0,0);
	}

	@Test
	public void test_f_test44_1() {
		f_test44(0,0,-1,0,0,0);
	}

	@Test
	public void test_f_test44_2() {
		f_test44(67108868,0,-1,0,0,0);
	}

	@Test
	public void test_f_test44_3() {
		f_test44(4,0,-1,0,0,0);
	}

	@Test
	public void test_f_test44_4() {
		f_test44(4,65540,-2147483636,0,0,0);
	}

	@Test
	public void test_f_test44_5() {
		f_test44(8,1,-2147483348,0,0,0);
	}

	@Test
	public void test_f_test44_6() {
		f_test44(8,1,-2147483348,134217728,0,0);
	}

	@Test
	public void test_f_test44_7() {
		f_test44(8,1,-2147483348,134217728,32,0);
	}

	@Test
	public void test_f_test44_8() {
		f_test44(8,1,-2147483348,134217728,5,0);
	}

	@Test
	public void test_f_test44_9() {
		f_test44(8,1,-2147483348,-2147434752,5,542);
	}

	@Test
	public void test_f_test44_10() {
		f_test44(8,1,-2147483348,-2147434752,5,31);
	}

	@Test
	public void test_f_test44_11() {
		f_test44(8,1,-2147483348,-2147434752,5,30);
	}

	@Test
	public void test_f_test44_12() {
		f_test44(8,1,-2147483348,-2147434752,5,29);
	}

	@Test
	public void test_f_test44_13() {
		f_test44(8,1,-2147483348,-2147434752,5,22);
	}

	@Test
	public void test_f_test44_14() {
		f_test44(2,1,-2147483636,-2147483645,8,536870912);
	}

	@Test
	public void test_f_test44_15() {
		f_test44(4,4,-2013265920,-2147483645,8,31);
	}

	@Test
	public void test_f_test44_16() {
		f_test44(4,1,-2147483636,-2147483645,8,30);
	}

	@Test
	public void test_f_test44_17() {
		f_test44(4,1,-1610612736,-2147483645,8,29);
	}

	@Test
	public void test_f_test44_18() {
		f_test44(4,1,-2147483636,-2147483645,8,4);
	}

	@Test
	public void test_f_test44_19() {
		f_test44(4,4,-2147483636,-2147418101,8,1073741824);
	}

	@Test
	public void test_f_test44_20() {
		f_test44(4,4,-2147483636,-1741473801,1,31);
	}

	@Test
	public void test_f_test44_21() {
		f_test44(4,4,-2147483636,-1741473801,1,30);
	}

	@Test
	public void test_f_test44_22() {
		f_test44(4,4,-2147483636,-1741473801,1,29);
	}

	@Test
	public void test_f_test44_23() {
		f_test44(4,4,-2147483636,-1741473801,1,2);
	}

	@Test
	public void test_f_test44_24() {
		f_test44(4,4,-2147483636,-1328332801,1,542);
	}

	@Test
	public void test_f_test44_25() {
		f_test44(4,4,-2147483636,-1328332801,1,31);
	}

	@Test
	public void test_f_test44_26() {
		f_test44(4,4,-2147483636,-1328332801,1,30);
	}

	@Test
	public void test_f_test44_27() {
		f_test44(4,4,-2147483636,-1328332801,1,29);
	}

	@Test
	public void test_f_test44_28() {
		f_test44(4,4,-2147483636,-1328332801,1,13);
	}

	@Test
	public void test_f_test44_29() {
		f_test44(8,1,-2147483348,2,5,542);
	}

	@Test
	public void test_f_test44_30() {
		f_test44(8,1,-2147483348,2,5,31);
	}

	@Test
	public void test_f_test44_31() {
		f_test44(8,1,-2147483348,2,5,30);
	}

	@Test
	public void test_f_test44_32() {
		f_test44(8,1,-2147483348,2,5,29);
	}

	@Test
	public void test_f_test44_33() {
		f_test44(8,1,-2147483348,2,5,23);
	}

	@Test
	public void test_f_test44_34() {
		f_test44(8,1,-2147483348,134217728,5,32);
	}

	@Test
	public void test_f_test44_35() {
		f_test44(8,1,-2147483348,1663107496,5,31);
	}

	@Test
	public void test_f_test44_36() {
		f_test44(8,1,-2147483348,1663107496,5,30);
	}

	@Test
	public void test_f_test44_37() {
		f_test44(8,1,-2147483348,1663107496,5,29);
	}

	@Test
	public void test_f_test44_38() {
		f_test44(8,1,-2147483348,1663107496,5,2);
	}

	@Test
	public void test_f_test44_39() {
		f_test44(8,1,-2147483348,723583400,5,16414);
	}

	@Test
	public void test_f_test44_40() {
		f_test44(8,1,-2147483348,723583400,5,31);
	}

	@Test
	public void test_f_test44_41() {
		f_test44(8,1,-2147483348,723583400,5,30);
	}

	@Test
	public void test_f_test44_42() {
		f_test44(8,1,-2147483348,723583400,5,29);
	}

	@Test
	public void test_f_test44_43() {
		f_test44(8,1,-2147483348,723583400,5,27);
	}

	@Test
	public void test_f_test44_44() {
		f_test44(8,1,-2147483348,522256800,5,16414);
	}

	@Test
	public void test_f_test44_45() {
		f_test44(8,1,-2147483348,522256800,5,31);
	}

	@Test
	public void test_f_test44_46() {
		f_test44(8,1,-2147483348,522256800,5,30);
	}

	@Test
	public void test_f_test44_47() {
		f_test44(8,1,-2147483348,522256800,5,29);
	}

	@Test
	public void test_f_test44_48() {
		f_test44(8,1,-2147483348,522256800,5,22);
	}

	@Test
	public void test_f_test44_49() {
		f_test44(4,65540,-2145910029,0,0,0);
	}

	@Test
	public void test_f_test44_50() {
		f_test44(4,4,-2145910029,0,0,0);
	}

	@Test
	public void test_f_test44_51() {
		f_test44(4,4,-2145910029,1,0,0);
	}

	@Test
	public void test_f_test44_52() {
		f_test44(4,4,-2145910029,1,256,0);
	}

	@Test
	public void test_f_test44_53() {
		f_test44(4,4,-2145910029,1,1,0);
	}

	@Test
	public void test_f_test44_54() {
		f_test44(1,1,-2147483645,-1070542848,4,65538);
	}

	@Test
	public void test_f_test44_55() {
		f_test44(1,1,-2147483645,-1070542848,4,30);
	}

	@Test
	public void test_f_test44_56() {
		f_test44(1,1,-2147483645,-1070542848,4,29);
	}

	@Test
	public void test_f_test44_57() {
		f_test44(1,1,-2147483645,-1070542848,4,28);
	}

	@Test
	public void test_f_test44_58() {
		f_test44(1,1,-2147483645,-1070542848,4,2);
	}

	@Test
	public void test_f_test44_59() {
		f_test44(1,1,-2147483645,-1073598269,4,65792);
	}

	@Test
	public void test_f_test44_60() {
		f_test44(1,1,-2147483645,-1073598269,4,30);
	}

	@Test
	public void test_f_test44_61() {
		f_test44(1,1,-2147483645,-1073598269,4,29);
	}

	@Test
	public void test_f_test44_62() {
		f_test44(1,1,-2147483645,-1073598269,4,28);
	}

	@Test
	public void test_f_test44_63() {
		f_test44(1,1,-2147483645,-1073598269,4,8);
	}

	@Test
	public void test_f_test44_64() {
		f_test44(1,1,-2147483645,-1056821001,4,262146);
	}

	@Test
	public void test_f_test44_65() {
		f_test44(1,1,-2147483645,-1056821001,4,30);
	}

	@Test
	public void test_f_test44_66() {
		f_test44(1,1,-2147483645,-1056821001,4,29);
	}

	@Test
	public void test_f_test44_67() {
		f_test44(1,1,-2147483645,-1056821001,4,28);
	}

	@Test
	public void test_f_test44_68() {
		f_test44(1,1,-2147483645,-1056821001,4,2);
	}

	@Test
	public void test_f_test44_69() {
		f_test44(1,1,-2147483645,-2127552801,4,262146);
	}

	@Test
	public void test_f_test44_70() {
		f_test44(1,1,-2147483645,-2127552801,4,30);
	}

	@Test
	public void test_f_test44_71() {
		f_test44(1,1,-2147483645,-2127552801,4,29);
	}

	@Test
	public void test_f_test44_72() {
		f_test44(1,1,-2147483645,-2127552801,4,28);
	}

	@Test
	public void test_f_test44_73() {
		f_test44(1,1,-2147483645,-2127552801,4,2);
	}

	@Test
	public void test_f_test44_74() {
		f_test44(4,4,-2145910029,1,1,32);
	}

	@Test
	public void test_f_test44_75() {
		f_test44(1,1,-2147483645,2,4,30);
	}

	@Test
	public void test_f_test44_76() {
		f_test44(1,1,-2147483645,1,1,29);
	}

	@Test
	public void test_f_test44_77() {
		f_test44(1,4,-2147483645,2,1,1);
	}

	@Test
	public void test_f_test44_78() {
		f_test44(1,1,-2147483645,1088192944,4,31);
	}

	@Test
	public void test_f_test44_79() {
		f_test44(1,1,-2147483645,1088192944,4,30);
	}

	@Test
	public void test_f_test44_80() {
		f_test44(1,1,-2147483645,1088192944,4,29);
	}

	@Test
	public void test_f_test44_81() {
		f_test44(1,1,-2147483645,1088192944,4,28);
	}

	@Test
	public void test_f_test44_82() {
		f_test44(1,1,-2147483645,1088192944,4,16);
	}

	@Test
	public void test_f_test44_83() {
		f_test44(1,1,-2147483645,1088192900,4,134217730);
	}

	@Test
	public void test_f_test44_84() {
		f_test44(1,1,-2147483645,1088192900,4,30);
	}

	@Test
	public void test_f_test44_85() {
		f_test44(1,1,-2147483645,1088192900,4,29);
	}

	@Test
	public void test_f_test44_86() {
		f_test44(1,1,-2147483645,1088192900,4,28);
	}

	@Test
	public void test_f_test44_87() {
		f_test44(1,1,-2147483645,1088192900,4,1);
	}

	@Test
	public void test_f_test44_88() {
		f_test44(1,1,-2147483645,1076940800,4,134217730);
	}

	@Test
	public void test_f_test44_89() {
		f_test44(1,1,-2147483645,1076940800,4,30);
	}

	@Test
	public void test_f_test44_90() {
		f_test44(1,1,-2147483645,1076940800,4,29);
	}

	@Test
	public void test_f_test44_91() {
		f_test44(1,1,-2147483645,1076940800,4,28);
	}

	@Test
	public void test_f_test44_92() {
		f_test44(1,1,-2147483645,1076940800,4,2);
	}

	@Test
	public void test_f_test44_93() {
		f_test44(4,134217736,-201,0,0,0);
	}

	@Test
	public void test_f_test44_94() {
		f_test44(1,1,-528482301,0,0,0);
	}

	@Test
	public void test_f_test44_95() {
		f_test44(1,1,-528482301,134217728,0,0);
	}

	@Test
	public void test_f_test44_96() {
		f_test44(1,1,-528482301,134217728,1073741824,0);
	}

	@Test
	public void test_f_test44_97() {
		f_test44(1,1,-528482301,134217728,5,0);
	}

	@Test
	public void test_f_test44_98() {
		f_test44(4,8,-201,-2147483644,1,131103);
	}

	@Test
	public void test_f_test44_99() {
		f_test44(4,8,-201,-2147483644,1,31);
	}

	@Test
	public void test_f_test44_100() {
		f_test44(4,8,-201,-2147483644,1,30);
	}

	@Test
	public void test_f_test44_101() {
		f_test44(4,8,-201,-2147483644,1,29);
	}

	@Test
	public void test_f_test44_102() {
		f_test44(4,8,-201,-2147483648,1,24);
	}

	@Test
	public void test_f_test44_103() {
		f_test44(4,8,-201,-2147477373,1,131103);
	}

	@Test
	public void test_f_test44_104() {
		f_test44(4,8,-201,-2147477373,1,31);
	}

	@Test
	public void test_f_test44_105() {
		f_test44(4,8,-201,-2147477373,1,30);
	}

	@Test
	public void test_f_test44_106() {
		f_test44(4,8,-201,-2147477373,1,29);
	}

	@Test
	public void test_f_test44_107() {
		f_test44(4,8,-201,-2147477373,1,23);
	}

	@Test
	public void test_f_test44_108() {
		f_test44(4,8,-201,-2147477501,1,287);
	}

	@Test
	public void test_f_test44_109() {
		f_test44(4,8,-201,-2147477501,1,31);
	}

	@Test
	public void test_f_test44_110() {
		f_test44(4,8,-201,-2147477501,1,30);
	}

	@Test
	public void test_f_test44_111() {
		f_test44(4,8,-201,-2147477501,1,29);
	}

	@Test
	public void test_f_test44_112() {
		f_test44(4,8,-201,-2147477501,1,28);
	}

	@Test
	public void test_f_test44_113() {
		f_test44(4,8,-201,-2147476001,1,287);
	}

	@Test
	public void test_f_test44_114() {
		f_test44(4,8,-201,-2147476001,1,31);
	}

	@Test
	public void test_f_test44_115() {
		f_test44(4,8,-201,-2147476001,1,30);
	}

	@Test
	public void test_f_test44_116() {
		f_test44(4,8,-201,-2147476001,1,29);
	}

	@Test
	public void test_f_test44_117() {
		f_test44(4,8,-201,-2147476001,1,23);
	}

	@Test
	public void test_f_test44_118() {
		f_test44(8,8,-41877501,33,8,536870912);
	}

	@Test
	public void test_f_test44_119() {
		f_test44(4,8,-201,2,1,31);
	}

	@Test
	public void test_f_test44_120() {
		f_test44(4,8,-201,2,1,30);
	}

	@Test
	public void test_f_test44_121() {
		f_test44(4,8,-201,2,1,29);
	}

	@Test
	public void test_f_test44_122() {
		f_test44(4,2,-1468006701,1,8,1);
	}

	@Test
	public void test_f_test44_123() {
		f_test44(1,1,-528482301,134217728,5,1073741824);
	}

	@Test
	public void test_f_test44_124() {
		f_test44(1,1,-528482301,140877804,5,31);
	}

	@Test
	public void test_f_test44_125() {
		f_test44(1,1,-528482301,140877804,5,30);
	}

	@Test
	public void test_f_test44_126() {
		f_test44(1,1,-528482301,140877804,5,29);
	}

	@Test
	public void test_f_test44_127() {
		f_test44(1,1,-528482301,140877804,5,2);
	}

	@Test
	public void test_f_test44_128() {
		f_test44(1,1,-528482301,1080401900,5,286);
	}

	@Test
	public void test_f_test44_129() {
		f_test44(1,1,-528482301,1080401900,5,31);
	}

	@Test
	public void test_f_test44_130() {
		f_test44(1,1,-528482301,1080401900,5,30);
	}

	@Test
	public void test_f_test44_131() {
		f_test44(1,1,-528482301,1080401900,5,29);
	}

	@Test
	public void test_f_test44_132() {
		f_test44(1,1,-528482301,1080401900,5,27);
	}

	@Test
	public void test_f_test44_133() {
		f_test44(1,1,-528482301,1617272800,5,286);
	}

	@Test
	public void test_f_test44_134() {
		f_test44(1,1,-528482301,1617272800,5,31);
	}

	@Test
	public void test_f_test44_135() {
		f_test44(1,1,-528482301,1617272800,5,30);
	}

	@Test
	public void test_f_test44_136() {
		f_test44(1,1,-528482301,1617272800,5,29);
	}

	@Test
	public void test_f_test44_137() {
		f_test44(1,1,-528482301,1617272800,5,13);
	}

	@Test
	public void test_f_test44_138() {
		f_test44(4,134217736,-196801,0,0,0);
	}

	@Test
	public void test_f_test44_139() {
		f_test44(4,8,-196801,0,0,0);
	}

	@Test
	public void test_f_test44_140() {
		f_test44(4,8,-196801,131072,0,0);
	}

	@Test
	public void test_f_test44_141() {
		f_test44(4,8,-196801,131072,134217728,0);
	}

	@Test
	public void test_f_test44_142() {
		f_test44(4,8,-196801,131072,8,0);
	}

	@Test
	public void test_f_test44_143() {
		f_test44(8,16,-1,-2147450880,2,1073741824);
	}

	@Test
	public void test_f_test44_144() {
		f_test44(8,16,-1,-2147450880,2,28);
	}

	@Test
	public void test_f_test44_145() {
		f_test44(8,16,-1,-2147450880,2,27);
	}

	@Test
	public void test_f_test44_146() {
		f_test44(8,16,-1,-2147450880,2,26);
	}

	@Test
	public void test_f_test44_147() {
		f_test44(8,16,-1,-2147450880,2,8);
	}

	@Test
	public void test_f_test44_148() {
		f_test44(4,2,-1,-2147483645,4,1073741824);
	}

	@Test
	public void test_f_test44_149() {
		f_test44(2,8,-1,-2147483645,8,30);
	}

	@Test
	public void test_f_test44_150() {
		f_test44(2,1,-1,-2147483645,1,29);
	}

	@Test
	public void test_f_test44_151() {
		f_test44(8,8,-1638401,-2147483645,8,1);
	}

	@Test
	public void test_f_test44_152() {
		f_test44(4,1,-1,-201,8,1053);
	}

	@Test
	public void test_f_test44_153() {
		f_test44(4,1,-1,-201,8,31);
	}

	@Test
	public void test_f_test44_154() {
		f_test44(4,1,-1,-201,8,30);
	}

	@Test
	public void test_f_test44_155() {
		f_test44(4,1,-1,-201,8,29);
	}

	@Test
	public void test_f_test44_156() {
		f_test44(4,1,-1,-201,8,26);
	}

	@Test
	public void test_f_test44_157() {
		f_test44(8,1,-1,-2113929201,1,1073741824);
	}

	@Test
	public void test_f_test44_158() {
		f_test44(4,1,-1,-1,1,31);
	}

	@Test
	public void test_f_test44_159() {
		f_test44(8,2,-1,-1677721601,8,30);
	}

	@Test
	public void test_f_test44_160() {
		f_test44(1,2,-1,-1677721601,1,29);
	}

	@Test
	public void test_f_test44_161() {
		f_test44(1,2,-1,-1072693201,8,1);
	}

	@Test
	public void test_f_test44_162() {
		f_test44(8,16,-1,713113601,2,1073741824);
	}

	@Test
	public void test_f_test44_163() {
		f_test44(8,16,-1,713113601,2,28);
	}

	@Test
	public void test_f_test44_164() {
		f_test44(8,16,-1,713113601,2,27);
	}

	@Test
	public void test_f_test44_165() {
		f_test44(8,16,-1,713113601,2,26);
	}

	@Test
	public void test_f_test44_166() {
		f_test44(8,16,-1,713113601,2,1);
	}

	@Test
	public void test_f_test44_167() {
		f_test44(4,8,-196801,131072,8,536870912);
	}

	@Test
	public void test_f_test44_168() {
		f_test44(8,16,-1,48,2,28);
	}

	@Test
	public void test_f_test44_169() {
		f_test44(4,8,-1,204,4,16);
	}

	@Test
	public void test_f_test44_170() {
		f_test44(8,16,-1,8200,8,1073741824);
	}

	@Test
	public void test_f_test44_171() {
		f_test44(8,16,-1,1652637700,2,28);
	}

	@Test
	public void test_f_test44_172() {
		f_test44(8,16,-1,1652637700,2,27);
	}

	@Test
	public void test_f_test44_173() {
		f_test44(8,16,-1,1652637700,2,26);
	}

	@Test
	public void test_f_test44_174() {
		f_test44(8,16,-1,1652637700,2,8);
	}

	@Test
	public void test_f_test44_175() {
		f_test44(8,16,-1,713113600,2,1073741824);
	}

	@Test
	public void test_f_test44_176() {
		f_test44(8,16,-1,713113600,2,29);
	}

	@Test
	public void test_f_test44_177() {
		f_test44(8,16,-1,713113600,2,28);
	}

	@Test
	public void test_f_test44_178() {
		f_test44(8,16,-1,713113600,2,27);
	}

	@Test
	public void test_f_test44_179() {
		f_test44(8,16,-1,713113600,2,8);
	}

	@Test
	public void test_f_test44_180() {
		f_test44(1,134217730,4194306,0,0,0);
	}

	@Test
	public void test_f_test44_181() {
		f_test44(1,2,4194306,0,0,0);
	}

	@Test
	public void test_f_test44_182() {
		f_test44(1,2,4194306,-160401,0,0);
	}

	@Test
	public void test_f_test44_183() {
		f_test44(1,2,4194306,-160401,2056,0);
	}

	@Test
	public void test_f_test44_184() {
		f_test44(1,2,4194306,-160401,8,0);
	}

	@Test
	public void test_f_test44_185() {
		f_test44(1,1,18,-2144882688,2,268435456);
	}

	@Test
	public void test_f_test44_186() {
		f_test44(1,1,18,-2144882688,2,28);
	}

	@Test
	public void test_f_test44_187() {
		f_test44(1,1,18,-2144882688,2,27);
	}

	@Test
	public void test_f_test44_188() {
		f_test44(1,1,18,-2144882688,2,26);
	}

	@Test
	public void test_f_test44_189() {
		f_test44(1,1,18,-2144882688,2,1);
	}

	@Test
	public void test_f_test44_190() {
		f_test44(4,2,65,-2147483645,2,268435456);
	}

	@Test
	public void test_f_test44_191() {
		f_test44(1,2,2,-2097283069,2,4);
	}

	@Test
	public void test_f_test44_192() {
		f_test44(1,2,4194306,-160901,8,16415);
	}

	@Test
	public void test_f_test44_193() {
		f_test44(1,2,4194306,-160901,8,31);
	}

	@Test
	public void test_f_test44_194() {
		f_test44(1,2,4194306,-160901,8,30);
	}

	@Test
	public void test_f_test44_195() {
		f_test44(1,2,4194306,-160901,8,29);
	}

	@Test
	public void test_f_test44_196() {
		f_test44(1,2,4194306,-160901,8,28);
	}

	@Test
	public void test_f_test44_197() {
		f_test44(1,2,4194306,-160401,8,16415);
	}

	@Test
	public void test_f_test44_198() {
		f_test44(1,2,4194306,-160401,8,31);
	}

	@Test
	public void test_f_test44_199() {
		f_test44(1,2,4194306,-160401,8,30);
	}

	@Test
	public void test_f_test44_200() {
		f_test44(1,2,4194306,-160401,8,29);
	}

	@Test
	public void test_f_test44_201() {
		f_test44(1,2,4194306,-160401,8,26);
	}

	@Test
	public void test_f_test44_202() {
		f_test44(1,1,18,308845,2,268435456);
	}

	@Test
	public void test_f_test44_203() {
		f_test44(1,1,18,308845,2,28);
	}

	@Test
	public void test_f_test44_204() {
		f_test44(1,1,18,308845,2,27);
	}

	@Test
	public void test_f_test44_205() {
		f_test44(1,1,18,308845,2,26);
	}

	@Test
	public void test_f_test44_206() {
		f_test44(1,1,18,308845,2,5);
	}

	@Test
	public void test_f_test44_207() {
		f_test44(1,1,18,308844,2,31);
	}

	@Test
	public void test_f_test44_208() {
		f_test44(1,1,18,308844,2,29);
	}

	@Test
	public void test_f_test44_209() {
		f_test44(1,1,18,308844,2,28);
	}

	@Test
	public void test_f_test44_210() {
		f_test44(1,1,18,308844,2,27);
	}

	@Test
	public void test_f_test44_211() {
		f_test44(1,1,18,308844,2,15);
	}

	@Test
	public void test_f_test44_212() {
		f_test44(1,1,18,46700,2,29);
	}

	@Test
	public void test_f_test44_213() {
		f_test44(10,10,1,100,10,10);
	}

	@Test
	public void test_f_test44_214() {
		f_test44(8,134217730,1845344252,0,0,0);
	}

	@Test
	public void test_f_test44_215() {
		f_test44(4,4,436275328,0,0,0);
	}

	@Test
	public void test_f_test44_216() {
		f_test44(8,1,13360,16384,0,0);
	}

	@Test
	public void test_f_test44_217() {
		f_test44(2,16,144656,16,536870912,0);
	}

	@Test
	public void test_f_test44_218() {
		f_test44(4,8,512,65536,4,0);
	}

	@Test
	public void test_f_test44_219() {
		f_test44(1,16,204804,-2132412992,8,16777216);
	}

	@Test
	public void test_f_test44_220() {
		f_test44(1,16,204804,-1877082048,8,31);
	}

	@Test
	public void test_f_test44_221() {
		f_test44(1,16,204804,-1877082048,8,30);
	}

	@Test
	public void test_f_test44_222() {
		f_test44(1,16,204804,-1877082048,8,29);
	}

	@Test
	public void test_f_test44_223() {
		f_test44(1,16,204804,-1877082048,8,1);
	}

	@Test
	public void test_f_test44_224() {
		f_test44(8,16,204832,-132120061,1,16777216);
	}

	@Test
	public void test_f_test44_225() {
		f_test44(4,16,51232,-314777861,2,29);
	}

	@Test
	public void test_f_test44_226() {
		f_test44(4,16,51232,-314777861,2,28);
	}

	@Test
	public void test_f_test44_227() {
		f_test44(4,16,51232,-314777861,2,27);
	}

	@Test
	public void test_f_test44_228() {
		f_test44(4,16,51232,-314777861,2,8);
	}

	@Test
	public void test_f_test44_229() {
		f_test44(4,16,51232,-281354501,2,134217728);
	}

	@Test
	public void test_f_test44_230() {
		f_test44(4,16,51232,-281354501,2,28);
	}

	@Test
	public void test_f_test44_231() {
		f_test44(4,16,51232,-281354501,2,27);
	}

	@Test
	public void test_f_test44_232() {
		f_test44(4,16,51232,-281354501,2,26);
	}

	@Test
	public void test_f_test44_233() {
		f_test44(4,16,51232,-281354501,2,8);
	}

	@Test
	public void test_f_test44_234() {
		f_test44(4,16,51232,-281299201,2,1073741824);
	}

	@Test
	public void test_f_test44_235() {
		f_test44(4,16,51232,-281299201,2,29);
	}

	@Test
	public void test_f_test44_236() {
		f_test44(4,16,51232,-281299201,2,28);
	}

	@Test
	public void test_f_test44_237() {
		f_test44(4,16,51232,-281299201,2,27);
	}

	@Test
	public void test_f_test44_238() {
		f_test44(4,16,51232,-281299201,2,4);
	}

	@Test
	public void test_f_test44_239() {
		f_test44(8,8,204804,2,2,536870912);
	}

	@Test
	public void test_f_test44_240() {
		f_test44(1,16,204804,1,1,2);
	}

	@Test
	public void test_f_test44_241() {
		f_test44(4,1,135296,8192,1,1073741824);
	}

	@Test
	public void test_f_test44_242() {
		f_test44(8,4,204804,58368,2,29);
	}

	@Test
	public void test_f_test44_243() {
		f_test44(1,8,204804,1364928,2,28);
	}

	@Test
	public void test_f_test44_244() {
		f_test44(8,16,204804,49152,2,27);
	}

	@Test
	public void test_f_test44_245() {
		f_test44(1,2,73992,131072,2,1);
	}

	@Test
	public void test_f_test44_246() {
		f_test44(2,8,4,1094937800,4,524290);
	}

	@Test
	public void test_f_test44_247() {
		f_test44(2,8,4,1094937800,4,30);
	}

	@Test
	public void test_f_test44_248() {
		f_test44(2,8,4,1094937800,4,29);
	}

	@Test
	public void test_f_test44_249() {
		f_test44(2,8,4,1094937800,4,28);
	}

	@Test
	public void test_f_test44_250() {
		f_test44(2,8,4,1094937800,4,8);
	}

	@Test
	public void test_f_test44_251() {
		f_test44(2,8,4,1652556800,4,268435456);
	}

	@Test
	public void test_f_test44_252() {
		f_test44(2,8,4,1652556800,4,30);
	}

	@Test
	public void test_f_test44_253() {
		f_test44(2,8,4,1652556800,4,29);
	}

	@Test
	public void test_f_test44_254() {
		f_test44(2,8,4,1652556800,4,28);
	}

	@Test
	public void test_f_test44_255() {
		f_test44(2,8,4,1652556800,4,16);
	}

	@Test
	public void test_f_test44_256() {
		f_test44(8,4194305,300,0,0,0);
	}

	@Test
	public void test_f_test44_257() {
		f_test44(8,1,300,0,0,0);
	}

	@Test
	public void test_f_test44_258() {
		f_test44(8,1,300,1073741824,0,0);
	}

	@Test
	public void test_f_test44_259() {
		f_test44(8,1,300,1073741824,1073741824,0);
	}

	@Test
	public void test_f_test44_260() {
		f_test44(8,1,300,1073741824,2,0);
	}

	@Test
	public void test_f_test44_261() {
		f_test44(8,1,300,-2146401504,2,1073741824);
	}

	@Test
	public void test_f_test44_262() {
		f_test44(8,1,300,-1875476704,2,28);
	}

	@Test
	public void test_f_test44_263() {
		f_test44(8,1,300,-1875476704,2,27);
	}

	@Test
	public void test_f_test44_264() {
		f_test44(8,1,300,-1875476704,2,26);
	}

	@Test
	public void test_f_test44_265() {
		f_test44(8,1,300,-1875476704,2,16);
	}

	@Test
	public void test_f_test44_266() {
		f_test44(8,1,300,-1705372813,2,268435456);
	}

	@Test
	public void test_f_test44_267() {
		f_test44(8,1,300,-1705372813,2,29);
	}

	@Test
	public void test_f_test44_268() {
		f_test44(8,1,300,-1705372813,2,28);
	}

	@Test
	public void test_f_test44_269() {
		f_test44(8,1,300,-1705372813,2,27);
	}

	@Test
	public void test_f_test44_270() {
		f_test44(8,1,300,-753030285,2,12);
	}

	@Test
	public void test_f_test44_271() {
		f_test44(8,1,300,-419816601,2,268435456);
	}

	@Test
	public void test_f_test44_272() {
		f_test44(8,1,300,-101,2,28);
	}

	@Test
	public void test_f_test44_273() {
		f_test44(8,1,300,-101,2,27);
	}

	@Test
	public void test_f_test44_274() {
		f_test44(8,1,300,-101,2,26);
	}

	@Test
	public void test_f_test44_275() {
		f_test44(8,1,300,-101,2,2);
	}

	@Test
	public void test_f_test44_276() {
		f_test44(8,1,300,-1,2,536870912);
	}

	@Test
	public void test_f_test44_277() {
		f_test44(8,1,300,-1,2,29);
	}

	@Test
	public void test_f_test44_278() {
		f_test44(8,1,300,-1,2,28);
	}

	@Test
	public void test_f_test44_279() {
		f_test44(8,1,300,-1,2,27);
	}

	@Test
	public void test_f_test44_280() {
		f_test44(8,1,300,-1,2,12);
	}

	@Test
	public void test_f_test44_281() {
		f_test44(8,1,300,1548814338,2,1073741824);
	}

	@Test
	public void test_f_test44_282() {
		f_test44(8,1,300,1558120962,2,28);
	}

	@Test
	public void test_f_test44_283() {
		f_test44(8,1,300,1558120962,2,27);
	}

	@Test
	public void test_f_test44_284() {
		f_test44(8,1,300,1558120962,2,26);
	}

	@Test
	public void test_f_test44_285() {
		f_test44(8,1,300,1558120962,2,16);
	}

	@Test
	public void test_f_test44_286() {
		f_test44(8,1,300,1073741824,2,1073741824);
	}

	@Test
	public void test_f_test44_287() {
		f_test44(8,1,300,1965654016,2,29);
	}

	@Test
	public void test_f_test44_288() {
		f_test44(8,1,300,1965654016,2,28);
	}

	@Test
	public void test_f_test44_289() {
		f_test44(8,1,300,1965654016,2,27);
	}

	@Test
	public void test_f_test44_290() {
		f_test44(8,1,300,1965654016,2,14);
	}

	@Test
	public void test_f_test44_291() {
		f_test44(8,1,300,858357800,2,2052);
	}

	@Test
	public void test_f_test44_292() {
		f_test44(8,1,300,858357800,2,28);
	}

	@Test
	public void test_f_test44_293() {
		f_test44(8,1,300,858357800,2,27);
	}

	@Test
	public void test_f_test44_294() {
		f_test44(8,1,300,858357800,2,26);
	}

	@Test
	public void test_f_test44_295() {
		f_test44(8,1,300,858357800,2,8);
	}

	@Test
	public void test_f_test44_296() {
		f_test44(8,1,300,858366000,2,2052);
	}

	@Test
	public void test_f_test44_297() {
		f_test44(8,1,300,858366000,2,29);
	}

	@Test
	public void test_f_test44_298() {
		f_test44(8,1,300,858366000,2,28);
	}

	@Test
	public void test_f_test44_299() {
		f_test44(8,1,300,858366000,2,27);
	}

	@Test
	public void test_f_test44_300() {
		f_test44(8,1,300,858366000,2,4);
	}

	@Test
	public void test_f_test44_301() {
		f_test44(8,4194305,800,0,0,0);
	}

	@Test
	public void test_f_test44_302() {
		f_test44(4,16,1744980000,0,0,0);
	}

	@Test
	public void test_f_test44_303() {
		f_test44(4,16,1744980000,16384,0,0);
	}

	@Test
	public void test_f_test44_304() {
		f_test44(4,16,1744980000,16384,1073741824,0);
	}

	@Test
	public void test_f_test44_305() {
		f_test44(4,16,1744980000,16384,2,0);
	}

	@Test
	public void test_f_test44_306() {
		f_test44(8,1,800,-2143548384,8,512);
	}

	@Test
	public void test_f_test44_307() {
		f_test44(8,1,800,-2143548384,8,31);
	}

	@Test
	public void test_f_test44_308() {
		f_test44(8,1,800,-2143548384,8,30);
	}

	@Test
	public void test_f_test44_309() {
		f_test44(8,1,800,-2143548384,8,29);
	}

	@Test
	public void test_f_test44_310() {
		f_test44(8,1,800,-2143548384,8,8);
	}

	@Test
	public void test_f_test44_311() {
		f_test44(8,1,800,-2147442929,8,134217758);
	}

	@Test
	public void test_f_test44_312() {
		f_test44(8,1,800,-2147442941,8,31);
	}

	@Test
	public void test_f_test44_313() {
		f_test44(8,1,800,-2147442929,8,30);
	}

	@Test
	public void test_f_test44_314() {
		f_test44(8,1,800,-2147442929,8,29);
	}

	@Test
	public void test_f_test44_315() {
		f_test44(8,1,800,-2147442929,8,23);
	}

	@Test
	public void test_f_test44_316() {
		f_test44(8,1,800,-2113888501,8,134217758);
	}

	@Test
	public void test_f_test44_317() {
		f_test44(8,1,800,-2113888501,8,31);
	}

	@Test
	public void test_f_test44_318() {
		f_test44(8,1,800,-2113888501,8,30);
	}

	@Test
	public void test_f_test44_319() {
		f_test44(8,1,800,-2113888501,8,29);
	}

	@Test
	public void test_f_test44_320() {
		f_test44(8,1,800,-2113888501,8,22);
	}

	@Test
	public void test_f_test44_321() {
		f_test44(8,1,800,-2113743201,8,536870942);
	}

	@Test
	public void test_f_test44_322() {
		f_test44(8,1,800,-2113743201,8,31);
	}

	@Test
	public void test_f_test44_323() {
		f_test44(8,1,800,-2113743201,8,30);
	}

	@Test
	public void test_f_test44_324() {
		f_test44(8,1,800,-2113743201,8,29);
	}

	@Test
	public void test_f_test44_325() {
		f_test44(8,1,800,-2113743201,8,23);
	}

	@Test
	public void test_f_test44_326() {
		f_test44(4,16,1677721600,277940738,8,1073741824);
	}

	@Test
	public void test_f_test44_327() {
		f_test44(1,8,33587200,8389122,4,29);
	}

	@Test
	public void test_f_test44_328() {
		f_test44(1,2,16793600,8389122,4,8);
	}

	@Test
	public void test_f_test44_329() {
		f_test44(4,16,1744980000,16384,2,1073741824);
	}

	@Test
	public void test_f_test44_330() {
		f_test44(4,16,1744980000,1669308348,2,29);
	}

	@Test
	public void test_f_test44_331() {
		f_test44(4,16,1744980000,1669308348,2,28);
	}

	@Test
	public void test_f_test44_332() {
		f_test44(4,16,1744980000,1669308348,2,27);
	}

	@Test
	public void test_f_test44_333() {
		f_test44(4,16,1744980000,1669308348,2,16);
	}

	@Test
	public void test_f_test44_334() {
		f_test44(4,16,1744980000,1926995900,2,8192);
	}

	@Test
	public void test_f_test44_335() {
		f_test44(4,16,1744980000,250255800,2,28);
	}

	@Test
	public void test_f_test44_336() {
		f_test44(4,16,1744980000,250255800,2,27);
	}

	@Test
	public void test_f_test44_337() {
		f_test44(4,16,1744980000,250255800,2,26);
	}

	@Test
	public void test_f_test44_338() {
		f_test44(4,16,1744980000,250255800,2,16);
	}

	@Test
	public void test_f_test44_339() {
		f_test44(4,16,1744980000,250521600,2,1073741824);
	}

	@Test
	public void test_f_test44_340() {
		f_test44(4,16,1744980000,250521600,2,29);
	}

	@Test
	public void test_f_test44_341() {
		f_test44(4,16,1744980000,250521600,2,28);
	}

	@Test
	public void test_f_test44_342() {
		f_test44(4,16,1744980000,250521600,2,27);
	}

	@Test
	public void test_f_test44_343() {
		f_test44(4,16,1744980000,250521600,2,12);
	}

}
