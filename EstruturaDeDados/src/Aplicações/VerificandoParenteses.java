package Aplicações;

import Pilha.Pilha;

@SuppressWarnings("unchecked")
public class VerificandoParenteses{
	
	private Pilha stack;
	private String pa1 = "(";
	private String pa2 = ")";
//	private String ch1 = "{";
//	private String ch2 = "}";
//	private String co1 = "[";
//	private String co2 = "]";
	
	public boolean verificaParenteses(String texto) throws Exception {
		this.stack = new Pilha<String>(texto.length());
		boolean retorno = true;
		
		for (int i = 0; i < texto.length(); i++) {

			try {	
				if(("" + texto.charAt(i)).equals(this.pa1)) {
					this.stack.push(this.pa1);
				}
				if(("" + texto.charAt(i)).equals(this.pa2)) {
					this.stack.pop();
				}			
			} catch(Exception e) {
				retorno = false;
			}
			
		}
		return retorno && stack.isEmpty();
	}
	
	public static void main(String[] args) throws Exception {
		
		VerificandoParenteses vp = new VerificandoParenteses();
		
		String a = "()()()";
		String b = "))((";
		String c = "((()))";
		String d = "(()))";
		String e = ")(";
		String f = "()";
		String g = "())";
		String h = "(()";
		String i = ")()()()(";
		String j = ")";
		String k = "(";
		
		System.out.println("()()() -> " + vp.verificaParenteses(a));			
		System.out.println("))(( -> " + vp.verificaParenteses(b));			
		System.out.println("((())) -> " + vp.verificaParenteses(c));			
		System.out.println("(())) -> " + vp.verificaParenteses(d));			
		System.out.println(")( -> " + vp.verificaParenteses(e));			
		System.out.println("() -> " + vp.verificaParenteses(f));			
		System.out.println("()) -> " + vp.verificaParenteses(g));			
		System.out.println("(() -> " + vp.verificaParenteses(h));			
		System.out.println(")()()()( -> " + vp.verificaParenteses(i));			
		System.out.println(") -> " + vp.verificaParenteses(j));
		System.out.println("( -> " + vp.verificaParenteses(k));
		
	}
}