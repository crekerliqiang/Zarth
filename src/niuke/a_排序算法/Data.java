package niuke.a_排序算法;

public class Data {

	//注意 不能直接返回data数组，这样对导致data数组被改变
	//知识点 数组不能直接用等于，一般用clone的方式赋值
	public static int [] getData() {
		return data.clone();
	}
	public static int [] getStandard() {
		return dataSorted.clone();
	}
	private final static int [] data = {
			15,22,4,16,8,19,4,30,13,12,4,
	        18,16,19,19,4,20,17,29,4,18,
	        27,20,1,29,12,20,16,11,22,3,10,
	        2,12,29,11,8,30,23,30,3,9,23,
	        2,8,4,23,5,18,27
	};
	private final static int [] dataSorted = {
			1, 2, 2, 3, 3, 4, 4, 4, 4, 4, 4,
			5, 8, 8, 8, 9, 10, 11, 11, 12, 12,
			12, 13, 15, 16, 16, 16, 17, 18, 18,
			18, 19, 19, 19, 20, 20, 20, 22, 22, 
			23, 23, 23, 27, 27, 29, 29, 29, 30, 30, 30
	};
	

	public static boolean equals(final int [] src,final int [] desk) {
		if(src.length != desk.length)return false;
		for(int i = 0;i < src.length;i++) {
			if(src[i] != desk[i])return false;
		}
		
		return true;
	}

}
