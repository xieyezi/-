package io.github.xieyezi;
public class myStack
{
	private cell[] elements;
	private int size;//ջ�ĳ���
	public static final int Default_capacity = 1600; //Ĭ�ϳ���Ϊ1600

	public myStack()
	{
		elements = new cell[Default_capacity];
	}
    //��һ����ѹ��ջ��
	public void push(cell value)
	{

		elements[size++] = value;
	}
    //ɾ��ջ���ĵ㲢������
	public cell pop()
	{
		return elements[--size];
	}
    //����ջ���ĵ�
	public cell peek()
	{
		return elements[size - 1];
	}
	//����ջ��ָ���ĵ�
	public cell peeknew(int i)
	{
		return elements[i];
	}
    //�ж�ջ�Ƿ�Ϊ��
	public boolean empty()
	{
		return size == 0;
	}
   //����ջ�ĳ���
	public int getSize()
	{
		return size;
	}

}
