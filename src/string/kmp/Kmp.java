package string.kmp;

import common.P;

public class Kmp {
	/**
	 * 求next数组
	 */
	public static int [] GetNextval(String p){
		if(p == null || p.length() == 0)return null;
		int [] next = new int[p.length()];
		next[0] = -1;
		int k = -1;
		for(int j = 0;j < p.length();j++) {
			//p[k]表示前缀，p[j]表示后缀  
			if (k == -1 || p.charAt(j) == p.charAt(k)){
				j++;
				k++;
				next[j] = k;
			}else{
				k = next[k];
			}
		}
		return next;
	}
	/**
	 * 该算法是在暴力方法1的基础上优化，效果明显优于KmpSearch2的效果
	 * @param s
	 * @param t
	 * @param next
	 * @return
	 */
	private static int KmpSearch1(String s, String t,int [] next){

		int i = 0;
		int j = 0;
		for(i = 0;i < s.length() - t.length() + 1;i++) {
			
			for(j = 0;j < t.length();j++) {
				
				if(s.charAt(i + j) != t.charAt(j)) {
					j = next[j];
					break;
				}else if(j == t.length() -  1){
					return i;
				}
			}
		}
		return -1;
	}
	
	/**
	 * 该方式在暴力破解方法2的基础上优化
	 * @param s
	 * @param p
	 * @param next
	 * @return
	 */
	private static int KmpSearch2(String s, String p,int [] next){
		int i = 0;
		int j = 0;
		while (i < s.length() && j < p.length()){
			if (j == -1 || s.charAt(i) == p.charAt(j))
			{
				i++;
				j++;
			}else{
				j = next[j];
			}	
		}
		if (j == p.length())
			return i - j;
		else
			return -1;
	}

	public  static int KmpSearch(final String s, final String p,final int repeat) {
		int value = 0;
		// TODO time 用于统计算法执行时间 正常情况下需要删除
		int [] next = GetNextval(p);
		//使用方式1
		long time = System.currentTimeMillis();
		for(int i = 0;i<repeat;i++) {
			value = KmpSearch1(s,p,next);
		}
		P.p(" run kmp1  " + (System.currentTimeMillis() - time));
		P.p(value);
		//使用方式2
		time = System.currentTimeMillis();
		for(int i = 0;i<repeat;i++) {
			value = KmpSearch2(s,p,next);
		}
		P.p(" run kmp2  " + (System.currentTimeMillis() - time));
		P.p(value);
		return value;

	}



}
