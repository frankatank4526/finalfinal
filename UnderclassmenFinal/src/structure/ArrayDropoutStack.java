package structure;

import structure.StackUnderflowException;
import structure.LinearNode;

public class ArrayDropoutStack<T> implements DropoutStackInterface<T>
{

	private final int DEFAULT_CAPACITY = 3;
	private int top, bot, count;
	private T[] stack;
	/**
	* Creates an empty queue using the default capacity.
	*/
	public ArrayDropoutStack()
	{
	top = bot = count = 0;
	stack = (T[]) (new Object[DEFAULT_CAPACITY]); 
	}
	/**
	* Creates an empty queue using the specified capacity.
	*
	* @param initialCapacity the integer representation of the initial
	* size of the circular array queue
	*/
	public ArrayDropoutStack (int initialCapacity)
	{
	top = bot = count = 0;
	stack = ( (T[])(new Object[initialCapacity]) );
	}
	@Override
	public T pop() throws StackUnderflowException
	{
		if (isEmpty())
			throw new StackUnderflowException();
			
			T result = stack[top];
			
			stack[top] = null;
			top--;
			return result;
	}

	@Override
	public T top() throws StackUnderflowException
	{
		// TODO Auto-generated method stub
		
		return stack[top];
	}

	@Override
	public void push(T elem)
	{
		// TODO Auto-generated method stub
		if (size() == stack.length){
			stack[bot] = null;
		}
		top++;
		stack[top] = elem;
		
		
	}

	@Override
	public boolean isEmpty()
	{
		if(stack[top] == null){
			//		System.out.println("This stack is empty");
					return true;
				}
				else{
			//		System.out.println("Not empty");
					return false;
				}
	}

	@Override
	public int size()
	{
		// TODO Auto-generated method stub
		return stack.length;
	}

	@Override
	public void resize(int newCapacity)
	{
		T[] larger = (T[])(new Object[newCapacity]);
		for (int index=0; index < stack.length; index++)
		larger[index] = stack[index];
		stack = larger;
	}

}
