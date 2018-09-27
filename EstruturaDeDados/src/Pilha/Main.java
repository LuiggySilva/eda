package Pilha;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Pilha<Integer> p = new Pilha<Integer>(10);
		
		System.out.println("Stack isEmpty() - " + p.isEmpty());
		p.push(1);
		p.push(2);
		p.push(3);
		p.push(4);
		p.push(5);
		p.push(6);
		p.push(7);
		p.push(8);
		p.push(9);
		p.push(10);
		System.out.println("... push(1,2,3,4,5,6,7,8,9,10) ...");
		System.out.println("Stack isFull() - " + p.isFull());
		System.out.println("Stack pop() - " + p.pop());
		System.out.println("Stack top() - " + p.top());
		
	}

}
