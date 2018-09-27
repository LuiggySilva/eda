package produto;

public class RepositorioProdutos implements Repositorio {
	
	private Produto[] produtos;
	private int index = -1;

	public RepositorioProdutos(int size) {
		super();
		this.produtos = new Produto[size];
	}

	private int procurarIndice(int codigo) {
		int indice = -1;
		for (int i = 0; i < this.produtos.length; i++) {
			if(this.produtos[i].getCodigo() == codigo) {
				indice = i;
				break;
			}
		}
		return indice;
	}

	public boolean existe(int codigo) {
		boolean existe = false;
		if(!(procurarIndice(codigo) < 0)) {
			existe = true;
		}
		return existe;
	}

	public void inserir(Produto produto) {
		this.index++;
		this.produtos[this.index] = produto; 
	}

	public void atualizar(Produto produto) {
		int indice = procurarIndice(produto.getCodigo());
		if(indice < 0) {
			throw new RuntimeException();
		}
		else {
			this.produtos[indice] = produto;
		}
	}

	public void remover(int codigo) {
		int indice = procurarIndice(codigo);
		if(indice < 0) {
			throw new RuntimeException();
		}
		else {
			this.produtos[indice] = this.produtos[this.index];
			this.produtos[this.index] = null;
			this.index--;
		}
	}

	public Produto procurar(int codigo) {
		int indice = procurarIndice(codigo);
		if(indice < 0) {
			throw new RuntimeException();
		}
		else {
			return this.produtos[indice];
		}
	}
}
