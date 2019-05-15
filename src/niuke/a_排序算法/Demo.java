package niuke.a_排序算法;

import utils.MyException;
import utils.P;

public class Demo {

	public static void main(String[] args) throws MyException{
		P.p("src data");
		P.p(Tool_NXN.bubbleSort(Data.getData()));
		
		P.p("冒泡排序法");
		P.p(Data.equals(
				Data.getStandard(),
				Tool_NXN.bubbleSort(Data.getData())));
		
		P.p("选择排序法");
		P.p(Data.equals(
				Data.getStandard(),
				Tool_NXN.selectionSort(Data.getData())));
		
		P.p("插入排序");
		P.p(Data.equals(
				Data.getStandard(),
				Tool_NXN.insertSort(Data.getData())));	
		
		P.p("快速排序");
		P.p(Data.equals(
				Data.getStandard(),
				new Tool_NLOGN().quciksort(Data.getData())));
		
		P.p("归并排序");
		P.p(Data.equals(
				Data.getStandard(),
				Tool_NLOGN.mergeSort(Data.getData())));
		
		P.p("计数排序");
		P.p(Data.equals(
				Data.getStandard(),
				Tool_N.countSort(Data.getData())));
		
		P.p("基数排序");
		P.p(Data.equals(
				Data.getStandard(),
				Tool_N.RadixSort(Data.getData(),2)));	

	}

}
