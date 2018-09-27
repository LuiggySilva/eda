package LinkedList;

public class Main {
	public static void main(String[] args) {
		
		LinkedList LK = new LinkedList();
		
		System.out.println(LK.print());
		
		LK.add(1);
		LK.add(2);
		LK.add(3);
		LK.add(4);
		LK.add(5);
		
		System.out.println("print() - " + LK.print());
		System.out.println("element() - " + LK.element());
		System.out.println("search(3) - " + LK.search(3));
		LK.remove();
		System.out.println("[removendo uma vez] | print() - " + LK.print());
		LK.remove();
		LK.remove();
		System.out.println("[removendo duas vezes] | print() - " + LK.print());
	
	}

}
