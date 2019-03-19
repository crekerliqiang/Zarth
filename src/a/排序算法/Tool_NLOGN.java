package a.排序算法;

import java.util.Random;

public class Tool_NLOGN {
	/**
	 * 快速排序
	 * 算法思想
	 * 在数组中，任意选择一个数，比选中的数小的放在左边，大的放在右边
	 * 递归调用该方法
	 * 时间复杂度 O (N * log N)
	 */
	private int [] mSrc;
	private void quciksort(final int left,final int right) {
		
		if(left > right)return;
		
		int i = left;
		int j = right;
		while(i != j) {
			//j 从右往左走 找比基数小的
			while(mSrc[j] >= mSrc[left] && i<j) j--;
			//i 从左往右走 找比基数大的
			while(mSrc[i] <= mSrc[left] && i<j) i++;
			//找完以后 交换
			if(i<j) {
				int t = mSrc[i];
				mSrc[i] = mSrc[j];
				mSrc[j] = t;
			}
		}
		//将基数归位 [i == j 时，交换基数和i和j相遇的数]
		int temp = mSrc[left];
		mSrc[left] = mSrc[i];
		mSrc[i] = temp;
		//递归
		quciksort(left,i - 1);
		quciksort(i + 1,right);

	}
	public int [] quciksort(final int [] src) {
		mSrc = src;
		quciksort(0,src.length - 1);
		return mSrc;
	}

}
