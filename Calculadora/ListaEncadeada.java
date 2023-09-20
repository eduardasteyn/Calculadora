/*
*@author Eduarda Jeniffer Steilein Gislon
*/

public class ListaEncadeada<T> implements InterfaceLista<T>
{
	private NoLista<T> primeiro;
	private NoLista<T> ultimo;
	private int qtdElementos;

	@Override
	public void retirar(T info)
	{
		NoLista<T> anterior = null;
		NoLista<T> p = primeiro;

		while ((p != null) && (p.getInfo() != info))
		{
			anterior = p;
			p = p.getProximo();
		}

		if (p != null)
		{
			if (anterior == null)
				primeiro = p.getProximo();

			else
				anterior.setProximo(p.getProximo());

			if (p == ultimo)
				ultimo = anterior;
		}
	}

	@Override
	public void inserir(T valor)
	{
		NoLista<T> novo = new NoLista<T>();

		novo.setInfo(valor);

		if (estaVazia())
			primeiro = novo;
		else
			ultimo.setProximo(novo);

		ultimo = novo;
		qtdElementos++;
	}

	@Override
	public String exibir()
	{
		NoLista<T> p = primeiro;
		String resultado = "[";

		while (p != null)
		{
			resultado += p.getInfo();
			p = p.getProximo();
		}

		return resultado + "]";
	}

	@Override
	public int buscar(T valor)
	{
		NoLista<T> p = primeiro;
		int indice = 0;

		while (p != null)
		{
			if (p.getInfo() == valor)
				return indice;

			p = p.getProximo();
			indice++;
		}

		return -1;
	}

	@Override
	public InterfaceLista<T> copiar()
	{
		InterfaceLista<T> listaCopia = new ListaEncadeada<T>();
		NoLista<T> p = primeiro;

		while (p != null)
		{
			T valor = p.getInfo();
			listaCopia.inserir(valor);
			p = p.getProximo();
		}

		return listaCopia;
	}

	@Override
	public boolean estaVazia()
	{
		if (primeiro == null)
			return true;

		else
			return false;
	}

	@Override
	public void concatenar(InterfaceLista<T> outra)
	{
		for (int i = 0; i < outra.getTamanho(); i++)
			inserir(outra.pegar(i));
	}

	@Override
	public int getTamanho()
	{
		return qtdElementos;
	}

	@Override
	public InterfaceLista<T> dividir()
	{
		int qtd = getTamanho() / 2;
		ListaEncadeada<T> novaLista = new ListaEncadeada<T>();
		NoLista<T> p = primeiro;
		int contador = 0;

		while (p != null)
		{
			contador++;
			if (contador > qtd)
				novaLista.inserir(p.getInfo());

			if (contador == qtd)
				ultimo = p;

			p = p.getProximo();
		}

		ultimo.setProximo(null);
		qtdElementos -= qtd;
		return novaLista;
	}

	@Override
	public T pegar(int posicao)
	{
		if (posicao < 0 || posicao >= qtdElementos)
			throw new IndexOutOfBoundsException("Index: " + posicao + " Size: " + qtdElementos);

		int contador = 0;
		NoLista<T> p = primeiro;

		while (p != null)
		{
			if (contador == posicao)
				return p.getInfo();

			contador++;
			p = p.getProximo();
		}

		return null;
	}

}
