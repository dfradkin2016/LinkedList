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
		ListNode<E> ln = head;
		for(ListNode<E> curr = other.head.getNext(); curr != null; curr = curr.getNext())
		{
			ln.setNext(new ListNode<E>(curr.getValue()));
			ln = ln.getNext();
			tail = ln;
		}
		size = other.size();
	}
	
	/*
	public int size()
	{
		int count = 0;
		for(ListNode<E> curr = head; curr != null; curr = curr.getNext())
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
		return add(size, o);
	}
	
	public boolean add(int i, E o)
	{
		ListNode<E> obj = new ListNode<E>(o);
		//if (size == 0)
		//	head = obj;
		if (i == 0) //add to start or empty
		{
			obj.setNext(head);
			head = obj;
		}
		else if (i == size) //only called if it is not empty
		{
			tail.setNext(obj);
		}
		else //adding to middle
		{
			ListNode<E> prev = atPosition(i-1);
			obj.setNext(prev.getNext()); //does it work if next is null, adding to the end of the list?
			prev.setNext(obj);
		}
		if (i == size) //called if empty or last
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
	
	public E get(int i)
	{
		return atPosition(i).getValue();
	}
	
	public E set(int i, E o)
	{
		E output;
		ListNode<E> obj = new ListNode<E>(o);
		if (i == 0) //set to start
		{
			obj.setNext(head.getNext());
			output = head.getValue();
			head = obj;
		}
		//doesn't work for tail because you have to parse through no matter what
		else //adding to middle
		{
			ListNode<E> prev = atPosition(i-1);
			output = prev.getNext().getValue();
			obj.setNext(prev.getNext().getNext()); //does it work if next is null, adding to the end of the list?
			prev.setNext(obj);
		}
		if (i == size-1) //called if empty or last
			tail = obj;
		return output; 
	}
	
	public boolean contains(E o)
	{
		for (ListNode<E> curr = head; curr != null; curr = curr.getNext())
		{
			if (curr.getValue().equals(o))//what if its null
				return true;
		}
		return false;
	}
	
	public int indexOf(E o)
	{
		int count = 0;
		for (ListNode<E> curr = head; curr != null; curr = curr.getNext())
		{
			if (curr.getValue().equals(o))//what if its null
				return count;
			count++;
		}
		return -1;
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
	
	public boolean remove(E o)//can't call indexOf because we need the one before
	{
		if (head.getValue().equals(o)) //what if its null
		{
			head = head.getNext();
			size--;
			return true;
		}
		//else
		ListNode<E> prev = head;
		for (ListNode<E> curr = head.getNext(); curr != null; curr = curr.getNext())
		{
			if (curr.getValue().equals(o))//what if its null
			{
				break;
			}
			prev = prev.getNext(); //stops when l is one before object
		}
		if (! prev.getNext().getValue().equals(o)) //not sure this works
			return false;
		prev.setNext(prev.getNext().getNext());
		if (prev.getNext() == null)//does this work
			tail = prev;
		size--;
		return true;
	}
	
	public E removeFirst()
	{
		return remove(0);
	}
	
	public E removeLast() //no way to do it faster because need the second to last item ??
	{
		return remove(size-1);
	}
	
	public void addFirst(E item)
	{
		add(0, item);
	}

	public void addLast(E item)
	{
		add(size, item);
	}
	
	public boolean isEmpty()
	{
		if (size == 0)
			return true;
		return false;
	}	
	
	public void clear()
	{
		head = null;
		tail = null;
		size = 0;
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
		add(0, item);
	}
	
	public E pop()
	{
		return remove(size-1);
	}
	
	public E peek()
	{
		return head.getValue();
	}
	
	public void offer(E item)
	{
		add(item);
	}
	
	public E poll()
	{
		return remove(0);
	}
	
	/**
	Iterator
	
	@return	Iterator of type E
	*/
	public Iterator<E> iterator()
	{		
		return new LinkedListIterator<E>(this);
	}
}

/*
do errors
commenting
javadoc
testing
*/