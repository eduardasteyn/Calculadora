/*
*@author Eduarda Jeniffer Steilein Gislon
*/

public class NoLista<T>
{
	private T Info;
	private NoLista<T> Proximo;
	
	public T getInfo()
	{
		return Info;
	}
	
	public void setInfo(T info) 
	{
		Info = info;
	}
	
	public NoLista<T> getProximo()
	{
		return Proximo;
	}
	
	public void setProximo(NoLista<T> proximo) 
	{
		Proximo = proximo;
	}
}
