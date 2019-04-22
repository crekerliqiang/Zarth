package c_栈和队列;

import java.util.Stack;

import common.MyException;

public class Task1 {

	/**
	 * 题目1 ：定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
	 * 
	 */
	/**
	 * 思路1：
	 * 建立两个堆栈，分别是StackData，StackMin
	 * 放入：
	 * StackData 依次放入，如果StackMin为空，或者StackMin栈顶的值比放入的数大，则也同时放入到StackMin
	 * 取出：
	 * 从StackData中取出一个数，如果发现取出的数比StackMin栈顶的小，则StackMin弹出栈顶值
	 * 
	 */
	//使用java的Stack类[其底层也是有数组实现(可以简单看看底层的源码)]
	 Stack<Integer> stackData = new Stack<Integer>();
	 Stack<Integer> stackMin = new Stack<Integer>();
	//压入
	public void push(int node) throws MyException {
        stackData.push(node);
		if(stackMin.isEmpty() || stackMin.peek() >= node) {
			stackMin.push(node);
		}
	}
	//弹出
	public void pop() throws MyException{
		if(stackData.isEmpty())throw new MyException("stackData is empty");
		int value = stackData.pop();
		if(value <= stackMin.peek()) {
			stackMin.pop();
		}
	}

	public int min() throws MyException{
		if(stackMin.isEmpty())throw new MyException("stackMin is empty");
		return stackMin.peek();
	}
}
