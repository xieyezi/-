package io.github.xieyezi;
public class myStack
{
	private cell[] elements;
	private int size;//栈的长度
	public static final int Default_capacity = 1600; //默认长度为1600

	public myStack()
	{
		elements = new cell[Default_capacity];
	}
    //把一个点压入栈中
	public void push(cell value)
	{

		elements[size++] = value;
	}
    //删除栈顶的点并返回它
	public cell pop()
	{
		return elements[--size];
	}
    //返回栈顶的点
	public cell peek()
	{
		return elements[size - 1];
	}
	//返回栈中指定的点
	public cell peeknew(int i)
	{
		return elements[i];
	}
    //判断栈是否为空
	public boolean empty()
	{
		return size == 0;
	}
   //返回栈的长度
	public int getSize()
	{
		return size;
	}

}
