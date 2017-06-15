package structure;

import structure.StackUnderflowException;
import structure.LinearNode;

public class ArrayDropoutStack<T> implements DropoutStackInterface<T>
{

	private final int DEFAULT_CAPACITY = 3;
	private int top, bot, count;
	private int capacity;
	private T[] stack;
	/**
	* Creates an empty queue using the default capacity.
	*/
	public ArrayDropoutStack()
	{
	top = bot = count = 0;
	stack = (T[]) (new Object[DEFAULT_CAPACITY]); 
	capacity = 3;
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
	capacity = initialCapacity;
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
//		if (size() == stack.length){
//			bot = top - (capacity - 1);
//			
//			
//		
//			
//			stack[top] = elem;
//			
//		}
		System.out.println(stack[0]);
		//System.out.println(top);
		//if(top != capacity){
			top++;
//	}
		if (top >= 2 && capacity == 100000){
			System.out.println("is called");
			stack[0] = stack[1];
			stack[1] = stack[2];
			stack[2] = elem;
			
		}
//		if(top == 3){
//			top = 0;
//		}
		
//		if(top > capacity){
////		for(int i = 0; i < capacity; i++){
////			
////			stack[i-1] = stack[i];
////		}
		//bot++;
		//}
	//	stack[top + 1] = stack[bot];
	//if(top < 3){
		stack[top] = elem;
//	}
		
	
	
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
		capacity = newCapacity;
	}
	@Override
	public T getStack(int stackNumber){
		return stack[stackNumber];	
	}
}
