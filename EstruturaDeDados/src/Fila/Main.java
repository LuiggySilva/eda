package Fila;

public class Main {

	public static void main(String[] args) throws Exception{
		Fila<Integer> p = new Fila<Integer>(10);
		
		System.out.println("Stack isEmpty() - " + p.isEmpty());
		p.enqueue(1);
		p.enqueue(2);
		p.enqueue(3);
		p.enqueue(4);
		p.enqueue(5);
		p.enqueue(6);
		p.enqueue(7);
		p.enqueue(8);
		p.enqueue(9);
		p.enqueue(10);
		System.out.println("... push(1,2,3,4,5,6,7,8,9,10) ...");
		System.out.println("Stack isFull() - " + p.isFull());
		System.out.println("Stack pop() - " + p.dequeue());
		System.out.println("Stack top() - " + p.head());

	}

}
