package LinkedList;
import java.util.Scanner;

public class LinkedList {
	
	private LinkedList proxElem;
	private LinkedList anteElem;
	private Integer elem;

	public LinkedList() {
		this.anteElem = null;
		this.proxElem = null;
	}
	
	public void add(Integer elem) {
		if(this.elem == null) {
			this.elem = elem;
		}
		else if(this.proxElem == null){
			this.proxElem = new LinkedList();
			this.proxElem.add(elem);
			this.proxElem.anteElem = this;
		}
		else {
			this.proxElem.add(elem);
			this.proxElem.anteElem = this;
		}
	}
	
	public String element() {
		if(this.elem == null) {
			return "";
		}
		else {
			return this.elem.toString();
		}
	}
	
	public int search(Integer elem) {
		return search(elem, 0);
	}
	public int search(Integer elem, int pos) {
		if(this.elem == elem) {
			return pos;
		}
		else if(this.proxElem != null){
			return this.proxElem.search(elem, pos+1);
		}
		else {
			return -1;
		}
	}
	
	public void remove() {
		if(this.elem == null) {
			return;
		}
		if(this.proxElem == null) {
			this.elem = null;
		}
		else {
			this.elem = this.proxElem.elem;
			this.proxElem.anteElem = null;
			this.proxElem = proxElem.proxElem; 
		}
		
	}
	
	public boolean isEmpty() {
		return this.elem == null;
	}
	
	public boolean isFull() {
		return false;
	}
	
	public String print() {
		if(this.elem == null) {
			return "empty";
		}
		else if(this.elem != null && this.proxElem == null){
			return Integer.toString(this.elem);
		}
		else {
			return Integer.toString(this.elem) + " " + this.proxElem.print();
		}
	}
	
	public static void main(String[] args) {
		
		LinkedList LK = new LinkedList();
		boolean encerrado = false;
		
		Scanner sc = new Scanner(System.in);
		while(!encerrado) {
			String opcao = sc.nextLine();
			
			if(opcao.startsWith("add")) {
                LK.add(Integer.parseInt((opcao.split(" ")[1].trim())));
            }
            if(opcao.startsWith("remove")) {
            	if(LK.isEmpty()) {
            		System.out.println("empty");
            	}
            	else {
            		LK.remove();            		
            	}
			}
            if(opcao.startsWith("element")) {
                System.out.println(LK.element());
            }
            if(opcao.startsWith("search")) {
                System.out.println(LK.search(Integer.parseInt((opcao.split(" ")[1].trim()))));
            }
            if(opcao.startsWith("print")) {
                System.out.println(LK.print());
            }
            if(opcao.trim().equals("end")) {
                encerrado = true;
			}
		}
		sc.close();
	
	}
	
}
