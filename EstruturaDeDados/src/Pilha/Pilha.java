package Pilha;

public class Pilha<T> implements Stack<T> {

	private T[] stack;
	private int top;

	@SuppressWarnings("unchecked")
	public Pilha(int size) {
		this.stack = (T[]) new Object[size];
		this.top = -1;
	}
	
	@Override
	public void push(T elemento) throws StackOverflowException {
		if(isFull()) {
			throw new StackOverflowException();
		}
		this.top += 1;
		this.stack[this.top] = elemento;
	}

	@Override
	public T pop() throws StackUnderflowException {
		if(isEmpty()) {
			throw new StackUnderflowException();
		}
		this.top -= 1;
		return this.stack[this.top + 1];
	}

	@Override
	public T top() throws StackUnderflowException {
		if(isEmpty()) {
			throw new StackUnderflowException();
		}
		return this.stack[this.top];
	}

	@Override
	public boolean isEmpty() {
		return ( this.top == -1 );
	}

	@Override
	public boolean isFull() {
		return ( this.top == this.stack.length-1 );
	}
}
