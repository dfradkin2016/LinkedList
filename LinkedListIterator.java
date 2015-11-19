/**
LinkedListIterator

@author	Daria Fradkin
@version	November 18, 2015
*/

import java.util.Iterator;
import java.lang.Iterable;
import java.util.NoSuchElementException;

public class LinkedListIterator<E> implements Iterator<E>
{
		private LinkedList<E> list;
		private ListNode<E> curr;
		
		/**
		Constructor. Initializes to another vector
	
		@param	v	Other vector
		*/
		public LinkedListIterator(LinkedList<E> l)
		{
			list = l;
			curr = list.head;
		}
		
		/**
		Checks if there is another value
		
		@return	Whether there is another value
		*/
		public boolean hasNext()
		{
			if (curr.getNext() == null) //?????
			{
				return false;
			}
			return true;
		}
		
		/**
		Returns next value
		
		@return	Next value of type E
		*/	
		public E next()
		{
			if (!hasNext())
				throw new NoSuchElementException("No next term. Currently at " + curr 
					+ ". Length is " + vector.size());
			ListNode<E> temp = curr;
			curr = curr.getNext();
			return curr.getValue();
		}
}