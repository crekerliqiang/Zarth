package string.kmp;

import common.P;

/**
 * 暴力匹配算法
 * @author 80239322
 */
public class Force {
	/**
	 * 使用for循环遍历
	 * 时间复杂度：O(m * (m - n + 1))
	 * 空间复杂度：O(m + n)
	 * @param s
	 * @param t
	 * @return
	 */
	public static int way1(final String s,final String t) {
		if(s == null || t == null)return -1;
		for(int i = 0;i < s.length() - t.length() + 1;i++) {
			
			for(int j = 0;j < t.length();j++) {
				
				if(s.charAt(i + j) != t.charAt(j)) {
					break;
				}else if(j == t.length() -  1){
					return i;
				}
			}
		}
		return -1;
	}
	public static int way1(final String s,final String t,int repeat) {
		int value = 0;
		// TODO time 用于统计算法执行时间 正常情况下需要删除
		long time = System.currentTimeMillis();
		for(int i = 0;i<repeat;i++) {
			value = way1(s,t);
		}
		P.p(" run way1 " + (System.currentTimeMillis() - time));
		return value;
	}


	public static int way2(final String s, final String t){		
		int sLen = s.length();
		int tLen = t.length();
		int i = 0;
		int j = 0;
		while (i < sLen && j < tLen){
			if (s.charAt(i) == t.charAt(j)){
				//①如果当前字符匹配成功（即S[i] == P[j]），则i++，j++    
				i++;
				j++;
			}else {
				//②如果失配（即S[i]! = P[j]），令i = i - (j - 1)，j = 0    
				i = i - j + 1;
				j = 0;
//				P.p("way2 failed i back  " + i);
			}
		}
		//匹配成功，返回模式串p在文本串s中的位置，否则返回-1
		if (j == tLen)return i - j;
		else return -1;
	}
	public static int way2(final String s,final String t,int repeat) {
		int value = 0;
		// TODO time 用于统计算法执行时间 正常情况下需要删除
		long time = System.currentTimeMillis();
		for(int i = 0;i<repeat;i++) {
			value = way2(s,t);
		}
		P.p(" run way2 " + (System.currentTimeMillis() - time));
		return value;

	}

}
