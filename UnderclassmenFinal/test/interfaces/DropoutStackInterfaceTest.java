package interfaces;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import structure.ArrayDropoutStack;
import structure.DropoutStackInterface;
import structure.StackUnderflowException;

public class DropoutStackInterfaceTest {
	  
	  private DropoutStackInterface<Integer> stack;
	  
	  @Before
	  public void setup(){
	    stack = new ArrayDropoutStack();
	  }

	  @Test (timeout = 5000)
	  public void testStack() throws StackUnderflowException {
	    assertTrue("Stack should be empty after being constructed.", stack.isEmpty());
//	    assertEquals("Stack should contain zero elements after being constructed.", 0, stack.size());
	    
	    stack.push(5);
	    assertFalse("Stack should not be empty.", stack.isEmpty());
	   assertEquals("The top element should be 5", new Integer(5), stack.top());
	//    assertEquals("The stack should contain one element.", 1, stack.size());
	    
	    stack.push(4);
	    assertEquals("The top element should be 4", new Integer(4), stack.top());
	 //   assertEquals("The stack should contain two elements.", 2, stack.size());
	    
	    Integer t = stack.pop();
	    assertEquals("The popped element should be 4", new Integer(4), t);
	    assertEquals("The top element should be 5", new Integer(5), stack.top());
//	    assertEquals("The stack should contain one element.", 1, stack.size());
	    assertFalse("The stack should not be empty.", stack.isEmpty());
	    
	    t = stack.pop();
	    assertEquals("The popped element should be 5", new Integer(5), t);
	    assertTrue("The stack should be empty.", stack.isEmpty());    
	  }
	  
	  @Test (timeout = 5000, expected = StackUnderflowException.class)
	  public void testStackUnderflowPop() throws StackUnderflowException{
	    stack.pop();
	  }
	  
	  @Test (timeout = 5000)
	  public void testresize(){
		  stack.resize(5);
		  Integer j = stack.size();
		  assertEquals("This stack should have a new capacity of 5", new Integer(5), j);
	  }

	}