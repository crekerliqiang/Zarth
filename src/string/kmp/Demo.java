package string.kmp;
import common.P;

/**
 * KMP 算法详解：https://blog.csdn.net/v_july_v/article/details/7041827
 * @author 80239322
 *
 */
public class Demo {

	public static void main(String[] args) {
		final int times = 999_999;
		P.p("run times " + times);
		 P.p(Kmp.KmpSearch(Data.S1, Data.P1,times));
		 P.p(Force.way1(Data.S1 , Data.P1,times));
		 P.p(Force.way2(Data.S1 , Data.P1,times));	
		 
		 
		 
	}

}
