/*
*@author Eduarda Jeniffer Steilein Gislon
*/

public class PilhaVetor<T> implements Pilha<T> {
	private T[] info;
	private int limite;
	private int tamanhoAtual;
	
	public PilhaVetor(int limite) {
		this.limite = limite;
	}

	@Override
	public void push(T info) {
		if (tamanhoAtual == limite) {
			throw new IndexOutOfBoundsException("Atingiu o Limite"); 
		}
		
		this.info[tamanhoAtual] = info;
		tamanhoAtual++;
	}

	@Override
	public T pop() {
		
		T valor = peek();
		tamanhoAtual--;
		info[tamanhoAtual] = null;
		
		return valor;
	}

	@Override
	public T peek() {
		if (estaVazia()) {
			throw new IndexOutOfBoundsException("Pilha está vazia");
		}
		return info[tamanhoAtual - 1];
		
	}

	@Override
	public boolean estaVazia() {
		return tamanhoAtual == 0;
	}

	@Override
	public void liberar() {
		this.info = (T[]) new Object[this.limite];
		this.tamanhoAtual = 0;
		
	}
	
	public String ToString() {
		String str = "topo[";
		for (int i = tamanhoAtual-1; i >= 0; i++) {
			str += info[i].toString()+", ";
		}
		return str + "]base";
	}
	

}
