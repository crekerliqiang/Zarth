package a_排序算法;

import java.util.Arrays;

import common.MyException;
import common.P;

public class Demo {

	public static void main(String[] args) throws MyException{
		//冒泡排序法
		int [] tmp = Data.getData();
		P.p(Tool_NXN.bubbleSort(tmp));
		
		//选择排序法
		int [] tmp1 = Data.getData();
		P.p(Tool_NXN.selectionSort(tmp1));
		//插入排序
		int [] tmp2 = Data.getData();
		P.p(Tool_NXN.insertSort(tmp2));
		
		//快速排序
		final int tmp3 [] = Data.getData();
		Tool_NLOGN tool = new Tool_NLOGN();
		P.p(tool.quciksort(tmp3));
		
		//归并排序
		final int tmp4 [] = Data.getData();
		P.p(Data.getData());
		P.p(Tool_NLOGN.mergeSort(tmp4));

	}

}
