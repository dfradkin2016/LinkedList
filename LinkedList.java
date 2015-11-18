//Daria Fradkin
//November 12, 2015

//singly linked, head pointer, tail pointer for add

import java.util.Iterator;
import java.lang.Iterable;

public class LinkedList<E>
{
	//first item in the LinkedLIst
	protected ListNode<E> head;
	private ListNode<E> tail; //??
	private int size; //??
	
	public LinkedList()
	{
		//don't actually need these
		head=null;
		tail=null;
		size=0;
	}
	
	public LinkedList (ListNode<E> h)
	{
		head = h;
		tail = h;
		size = 1;
	}
	
	/*
	public int size()
	{
		int count = 0;
		for(listNode<E> curr = head; curr =! null; curr = curr.getNext())
			count++;
		return count;
	}
	
	public int size()
	{
		return size(head);
	}
	
	public int size(ListNode<E> node)
	{
		if (node == null)
			return 0;
		else
			return 1 + size(node.getNext());
	}
	*/
	
	public int size()
	{
		return size;
	}
	
	//boolean for future implememntation
	public boolean add(E item)
	{
		return add(item, size);
	}
	
	public boolean add(E item, int n)
	{
		ListNode<E> obj = new ListNode<E>(item);
		//if (size == 0)
		//	head = obj;
		if (n == 0)
		{
			obj.setNext(head);
			head = obj;
		}
		else
		{
			ListNode<E> prev = atPosition(n-1);
			obj.setNext(prev.getNext()); //does it work if next is null, adding to the end of the list?
			prev.setNext(obj);
		}
		if (n == size)
			tail = obj;
		size++;
		return true; 
	}
	
	private ListNode<E> atPosition(int n)
	{
		ListNode<E> output = head;
		for (int i = 0; i < n; i++)
			output = output.getNext();
		return output; 
	}
	
	public E get(int n)
	{
		return atPosition(n).get();
	}
	
	public E remove(int n)
	{
		ListNode<E> prev = atPosition(n);
		ListNode<E> obj = prev.getNext();
		prev.setNext(obj.getNext());
		return obj.get();
	}
	
	public String toString()
	{
		String output = "";
		ListNode<E> obj = head;
		for (int i = 0; i < size; i++)
		{
			output += obj.toString() + " ";
			obj = obj.getNext();
		}
		return output;
	}
	
	public void push(E item)
	{
		add(item, 0);
	}
	
	public E pop()
	{
		return remove(size-1);
	}
	
	public E peek()
	{
		return head.get();
	}
	
	public boolean isEmpty()
	{
		if (size == 0)
			return true;
		return false;
	}
	
	public void offer(E item)
	{
		add(item);
	}
	
	public E poll()
	{
		return remove(0);
	}
}