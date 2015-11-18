//Daria Fradkin
//November 12, 2015

//singly linked, head pointer, tail pointer for add

import java.util.Iterator;
import java.lang.Iterable;

public class LinkedList<E>
{
	//first item in the LinkedLIst
	private ListNode<E> head;
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
	
	public LinkedList(LinkedList<E> other) //WRONG
	{
		head = new ListNode<E>(other.get(0));
		int count = 0;
		ListNode<E> last = head;
		for (ListNode<E> curr = head; curr != null; curr = curr.getNext())
		{
			count++;
			last = curr;
		}
		size = count;
		tail = last;
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
	public boolean add(E o)
	{
		return add(o, size);
	}
	
	public boolean add(E item, int n)
	{
		ListNode<E> obj = new ListNode<E>(item);
		//if (size == 0)
		//	head = obj;
		if (n == 0) //add to start or empty
		{
			obj.setNext(head);
			head = obj;
		}
		else if (n == size) //only called if it is not empty
		{
			tail.setNext(obj);
		}
		else //adding to middle
		{
			ListNode<E> prev = atPosition(n-1);
			obj.setNext(prev.getNext()); //does it work if next is null, adding to the end of the list?
			prev.setNext(obj);
		}
		if (n == size) //called if empty or last
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
		return atPosition(n).getValue();
	}
	
	public E remove(int index)
	{
		ListNode<E> obj; //stops the error
		if (index == 0)
		{
			head = head.getNext();
			obj = head;
		}
		else
		{ 
			ListNode<E> prev = atPosition(index - 1);
			obj = prev.getNext();
			prev.setNext(obj.getNext());
			if (index == size - 1)
			{
				tail = prev;
			}
		}
		size --;
		return obj.getValue();
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
		return head.getValue();
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