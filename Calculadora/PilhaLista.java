/*
*@author Eduarda Jeniffer Steilein Gislon
*/

public class PilhaLista<T> implements Pilha<T>
{
	private ListaEncadeada<T> Lista;

	@Override
	public void push(T info)
	{
		Lista.inserir(info);
	}

	@Override
	public T pop()
	{
		T valor = peek();

		Lista.retirar(valor);

		return valor;
	}

	@Override
	public T peek()
	{
		if (estaVazia())
			throw new RuntimeException("Lista est� vazia.");

		return Lista.pegar(0);
	}

	@Override
	public boolean estaVazia()
	{
		return Lista.estaVazia();
	}

	@Override
	public void liberar()
	{
		try
		{
			while (!Lista.estaVazia())
				pop();
		}

		catch (Exception e)
		{
			throw new RuntimeException("Lista est� vazia.");
		}
	}

}
