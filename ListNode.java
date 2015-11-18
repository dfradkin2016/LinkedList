//Daria Fradkin
//November 10, 2015

public class ListNode<E>
{
	private E value;
	private ListNode<E> next;
	
	public ListNode(E item)
	{
		value = item;
		next = null;
	}
	
	public ListNode(E item, ListNode<E> n)
	{
		value = item;
		next = n;
	}
	
	public E getValue() //getValue
	{
		return value;
	}
	
	public void setValue(E item) //setValue
	{
		value = item;
	}
	
	public ListNode<E> getNext()
	{
		return next;
	}
	
	public void setNext(ListNode<E> node)
	{
		next = node;
	}
	
	public String toString()
	{
		return value.toString();
	}
}