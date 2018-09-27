package Pilha;

@SuppressWarnings("serial")
public interface Stack<T> {
	
	public void push(T elemento) throws StackOverflowException;
	public T pop() throws StackUnderflowException;
	public T top() throws StackUnderflowException;
	public boolean isEmpty();
	public boolean isFull();
	

	public class StackOverflowException extends Exception{	
		public StackOverflowException(){
			super("Stack is full");
		}
	}
	
	public class StackUnderflowException extends Exception{	
		public StackUnderflowException(){
			super("Stack is empty");
		}
	}
}
