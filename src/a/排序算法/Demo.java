package a.排序算法;

import common.MyException;
import common.P;

public class Demo {

	public static void main(String[] args) throws MyException{
		final int [] src = {3,4,5,2,1,6};
		//冒泡排序法
		int [] tmp = src;
		P.p(Tool_NXN.bubbleSort(tmp));
		//选择排序法
		int [] tmp1 = src;
		P.p(Tool_NXN.selectionSort(tmp1));
		//插入排序
		int [] tmp2 = {54,35,48,36,27,12,44,44,8,14,26,17,28};
		P.p(Tool_NXN.insertSort(tmp2));
		
		//快速排序
		
		final int tmp3 [] = {3,4,5,1,2,8,7,6,9,0};
		Tool_NLOGN tool = new Tool_NLOGN();
		P.p(tool.quciksort(tmp3));
	

	}

}
