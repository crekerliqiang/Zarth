package a_排序算法;

public class Data {

	//注意 不能直接返回data数组，这样对导致data数组被改变
	//知识点 数组不能直接用等于，一般用clone的方式赋值
	public static int [] getData() {
		return data.clone();
	}
	private final static int [] data = {
			21,35,45,33,4,41,49,2,9,10,
			15,18,23,36,3,26,5,42,40,12,
			19,30,13,29,25,31,27,20,14,37,
			17,11,7,39,46,34,32,22,48,43,
			38,16,44,6,8,47,1,50,24,28,
	};

}
