package Fila;

@SuppressWarnings("unchecked")
public class Fila<T> implements Queue<T>{

	private T[] queue;
	private int tail;
	private int head;

	public Fila(int size) {
		this.queue = (T[]) new Object[size];
		this.tail = -1;
		this.head = 0;
	}
	
	@Override
	public void enqueue(T elemento) throws StackOverflowException {
		if(isFull()) {
			throw new StackOverflowException();
		}
		this.tail += 1;
		this.queue[this.tail] = elemento;
	}

	@Override
	public T dequeue() throws StackUnderflowException {
		if(isEmpty()) {
			throw new StackUnderflowException();
		}
		else {
			T result = this.queue[0];
			shiftLeft();
			this.tail -= 1;
			return result;
		}
	}

	@Override
	public T head() throws StackUnderflowException {
		if(isEmpty()) {
			throw new StackUnderflowException();
		}
		return this.queue[this.head];
	}
	
	@Override
	public boolean isEmpty() {
		return ( this.tail == -1 );
	}
	
	@Override
	public boolean isFull() {
		return ( this.tail == this.queue.length-1 );
	}
	
	private void shiftLeft() {
		for (int i = 0; i < this.tail-1; i++) {
			this.queue[i] = this.queue[i+1];
		}
	}
}
