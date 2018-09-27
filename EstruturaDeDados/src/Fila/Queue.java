package Fila;

@SuppressWarnings("serial")
public interface Queue<T> {
	
	public void enqueue(T elemento) throws StackOverflowException;
	public T dequeue() throws StackUnderflowException;
	public T head() throws StackUnderflowException;
	public boolean isEmpty();
	public boolean isFull();	

	public class StackOverflowException extends Exception{	
		public StackOverflowException(){
			super("Queue is full");
		}
	}
	
	public class StackUnderflowException extends Exception{	
		public StackUnderflowException(){
			super("Queue is empty");
		}
	}
}
