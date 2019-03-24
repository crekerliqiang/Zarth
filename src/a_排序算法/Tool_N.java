package a_排序算法;

import common.P;

public class Tool_N {
	//时间复杂度为O(N)的排序都是基于桶排序思想
	//空间复杂度为O(M),M表示同的大小
	//优势：时间复杂度低
	//劣势：排序单元种类过多时，会导致空间复杂度过高，不适用，负数不适用


	/**
	 * a计数排序
	 * a排序思想
	 * a比如对公司员工的同学年龄进行排序
	 * a一般员工的年龄都在18-65岁之间
	 * a1.建立按照18-65编号的桶，将每个员工的年龄放入对应的桶编号。
	 * a2.放完以后再依次倒出来，即完成排序
	 */
	private static int [] Bucket1 = new int[100];
	private static void initBucket1() {
		for(int i = 0;i < Bucket1.length;i++)
			Bucket1[i] = 0;
	}
	public static int [] countSort(int [] src) {
		//初始化桶
		initBucket1();
		//装桶
		for(int i = 0;i < src.length;i++) {
			Bucket1[src[i]]++;
		}
		//倒桶
		int index = 0;
		for(int i = 0;i < Bucket1.length;) {
			if(Bucket1[i] > 0) {
				src[index] = i;
				index++;
				Bucket1[i]--;
			}else {
				i++;
			}
		}
		
		
		return src;
	}
	
	
	
	/**
	 * a基数排序
	 * a算法步骤
	 * a1.以个位的数为基准，按照计数排序的方式把数放入
	 * a2.把数按照从前（小）往后（大）的顺序，依次倒出来
	 * a3.以十位为基准，循环a1 a2的步骤
	 * a4.注意：虽然思路和计数排序类似，但是数据的存储方面还是有很大区别的
	 */

	//a获取单独的位      index 0:个位；1：十位；2：百位......
	private static int getBit(int src,int index) {
		return (src / (int)Math.pow(10,index)) % 10;
	}
	
	private static void resetTemp(int [][] temp) {
		for(int j = 0;j < temp.length;j++) {
			for(int k = 0;k < temp[j].length;k++) {
				temp[j][k] = -1;
			}
		}
	}
	
	
	public static int [] RadixSort(int [] src,int wigit) {
		//创建一个额外的缓存二位数组
		int [][] temp = new int[10][src.length];
		resetTemp(temp);
		int [] index = new int[10];
		for(int i = 0;i < wigit;i++) {
			//装箱
			for(int j = 0;j < src.length;j++) {
				//bit 表示个位、十位、百位......
				int bit = getBit(src[j],i);
				temp[bit][index[bit]] = src[j];
				index[bit]++;
			}
			//倒箱（从前往后把temp往src里面倒）
			int srcIndex = 0;
			for(int j = 0;j < 10;j++) {
				
				for(int k = 0;k < src.length ;k++) {
					if(temp[j][k] != -1) {
						src[srcIndex] = temp[j][k];
						srcIndex++;
						
					}
				}
			}
			//清空temp
			resetTemp(temp);
		}
		return src;
	}
	

}
