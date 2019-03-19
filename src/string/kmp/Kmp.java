package string.kmp;

import common.P;

public class Kmp {
	private static int []mNext;
	/**
	 * 求next数组
	 */
	public static int [] GetNextval(String p){
		int [] next = new int[p.length()];
		int pLen = p.length();
		if(pLen == 0)return null;
		next[0] = -1;
		int k = -1;
		int j = 0;
		while (j < pLen - 1)
		{
			//p[k]表示前缀，p[j]表示后缀  
			if (k == -1 || p.charAt(j) == p.charAt(k))
			{
				j++;
				k++;
				next[j] = k;
				//较之前next数组求法，改动在下面4行
//				if (p.charAt(j) != p.charAt(k))
//					next[j] = k;   //之前只有这一行
//				else
//					//因为不能出现p[j] = p[ next[j ]]，所以当出现时需要继续递归，k = next[k] = next[next[k]]
//					next[j] = next[k];
			}
			else
			{
				k = next[k];
			}
		}
		return next;
	}
	
	public static int KmpSearch(String s, String p)
	{

		int i = 0;
		int j = 0;
		int sLen = s.length();
		int pLen = p.length();
		while (i < sLen && j < pLen)
		{
			
			//①如果j = -1，或者当前字符匹配成功（即S[i] == P[j]），都令i++，j++    
			if (j == -1 || s.charAt(i) == p.charAt(j))
			{
				i++;
				j++;
			}
			else
			{
				//②如果j != -1，且当前字符匹配失败（即S[i] != P[j]），则令 i 不变，j = next[j]    
				//next[j]即为j所对应的next值      
				j = mNext[j];
				
			}
			if(pLen == j) {
				break;
			}
			
		}
		if (j == pLen)
			return i - j;
		else
			return -1;
	}
	public  static int KmpSearch(final String s, final String p,final int repeat) {
		int value = 0;
		// TODO time 用于统计算法执行时间 正常情况下需要删除
		long time = System.currentTimeMillis();
		mNext = GetNextval(p);
		for(int i = 0;i<repeat;i++) {
			value = KmpSearch(s,p);
		}
		P.p(" run kmp  " + (System.currentTimeMillis() - time));
		return value;

	}



}
