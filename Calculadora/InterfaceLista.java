/*
*@author Eduarda Jeniffer Steilein Gislon
*/

public interface InterfaceLista<T>
{

	void inserir(T valor);

	String exibir();

	int buscar(T valor);

	void retirar(T elemento);

	boolean estaVazia();

	void concatenar(InterfaceLista<T> outra);

	int getTamanho();

	InterfaceLista<T> dividir();

	InterfaceLista<T> copiar();

	T pegar(int posicao);

}