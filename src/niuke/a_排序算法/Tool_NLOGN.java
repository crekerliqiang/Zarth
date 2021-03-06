package niuke.a_排序算法;

public class Tool_NLOGN {
	/**
	 * 快速排序
	 * 算法思想
	 * 在数组中，任意选择一个数(一般使用第一个)，比选中的数小的放在左边，大的放在右边
	 * 递归调用该方法
	 * 需要加入图解
	 * 时间复杂度 O (N * log N)
	 */
	private int [] mSrc;
	private void quciksort(final int left,final int right) {
		
		if(left >= right)return;
		
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
	
	

	/**
	 *归并排序
	 *排序思想：使用分而治之的思想，将字串分拆分为n个有序字串
	 *直到分为单个，在将单个的有序字串合并为一个有序字串即可
	 *最后问题就归纳为：如何将两个有序字串合并为一个有序字串
	 */

	//关键方法-将两个前后有序的数组合并为一个有序的数组
	//比如-数组array = [1,3,4,5,2,4,6,8] 左边四个和右边四个均为有序
	
   public static void merge(int[] a, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;// 左指针
        int j = mid + 1;// 右指针
        int k = 0;
        // 把较小的数先移到新数组中
        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        // 把左边剩余的数移入数组
        while (i <= mid) {
            temp[k++] = a[i++];
        }
        // 把右边边剩余的数移入数组
        while (j <= high) {
            temp[k++] = a[j++];
        }
        // 把新数组中的数覆盖 nums 数组
        for (int k2 = 0; k2 < temp.length; k2++) {
            a[k2 + low] = temp[k2];
        }
    }

    public static void mergeSort(int[] a, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            // 左边
            mergeSort(a, low, mid);
            // 右边
            mergeSort(a, mid + 1, high);
            // 左右归并
            merge(a, low, mid, high);
        }

    }

	public static int [] mergeSort(int [] src) {
		mergeSort(src,0,src.length-1);
		return src;
	}

	
	/**
	 *  a堆排序
	 *  a两个概念
	 *  a大顶堆：一个完全二叉树，每个节点的值都不小于左右子节点的值，称为大顶堆
	 *  a小顶堆：一个完全二叉树，每个节点的值都不大于左右子节点的值，称为小顶堆
	 *  TODO 暂缓，不是很理解
	 */
	
	
	
	
	/**
	 * a希尔排序
	 * a希尔排序是插入排序的一个高效版本
	 * a
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
