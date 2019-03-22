package a_排序算法;

import common.MyException;
import common.P;

public class Tool_NXN {
	/**
	 * 冒泡排序法
	 * 算法思想：
	 * 从 0--n-1 依次比较，交换位置
	 * 从 0--n-2 依次比较交换位置
	 * ......
	 * 时间复杂度 O(n^2)
	 * @throws MyException 
	 */
	public static int [] bubbleSort(final int [] src) throws MyException {
		
		if(src == null || src.length ==0)throw new MyException("输入错误");
		final int n = src.length;
		for(int i = 0;i < n;i++) {
			for(int j = 1;j < n - i;j++) {
				if(src[j] < src[j-1]) {
					int tmp;
					tmp = src[j];
					src[j] = src[j-1];
					src[j-1] = tmp;
				}
			}
		}
		return src;
	}
	/**
	 * 选择排序法
	 * 算法思想
	 * 从 0--n-1 选择最小的数，和位置0交换顺序
	 * 从 1--n-1 选择最小的数，和位置1交换顺序
	 * ......
	 * 时间复杂度 O(n^2)
	 * @throws MyException 
	 */
    public static int[] selectionSort(int[] src) throws MyException {
		if(src == null || src.length ==0)throw new MyException("输入错误");
    	final int n = src.length;
    	int min;
        for(int i = 0;i < n - 1;i++) {
        	//找出 i:n-1 最小值以及下标
        	min = src[i];
        	int index = i;
        	for(int j = i;j < n;j++) {
        		if(src[j] > min) {
        			min = src[j];
        			index = j;
        		}
        	}
        	//交换 src[index] src[i]
        	if(min < src[i]) {
        		int tmp = src[i];
        		src[i] = src[index];
        		src[index] = tmp;
        	}
        }
    	return src;
    }
    /**
     * 插入排序
     * 算法思想
     * 第k个和前面的数相比，比前面的数小(大)，则交换位置
     * [和冒泡排序法类似，冒泡排序是往后排，插入排序是往前排]
     */
    public static int [] insertSort(int[] src) throws MyException{
		if(src == null || src.length ==0)throw new MyException("输入错误");
		final int n = src.length;
		for(int i = 1;i < n ;i++) {
			for(int j = i;j > 0;j--) {
				if(src[j] < src[j - 1]) {
					int tmp = src[j];
					src[j] = src[j-1];
					src[j-1]=tmp;
				}
			}
		}
		return src;
    	
    }
}
