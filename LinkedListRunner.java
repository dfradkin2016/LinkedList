//Daria Fradkin
//November 14, 2015

public class LinkedListRunner
{
	public static void main(String[] args)
	{
		//Sorry for the random song lyrics I used
		LinkedList<String> hoty = new LinkedList<String>();
		hoty.add("Rock with it \n");
		hoty.add(1, "When we gonna stop with it \n");
		hoty.add(0, " Lean with it \n");
		hoty.add("it's our hearts that make the beat. \n");
		hoty.add(3, "Is it time to move our feet to an introspective beat,\n");
		hoty.add(3, "Lyrics that mean nothing,\n");
		hoty.add(5, "It ain't the speakers that bump hearts,\n");
		hoty.add(4, "We were gifted with thought,\n");
		System.out.println(hoty);
		ListNode<String> chorus = new ListNode<String>("You should go and love yourself. \n");
		LinkedList<String> ly = new LinkedList<String>(chorus);
		LinkedList<String> hoty0 = new LinkedList<String>(hoty);
		System.out.println(hoty0);
		System.out.println(hoty.get(6));
		hoty0.set(7, "ITS OUR HEARTS THAT MAKE THE BEAT!");
		System.out.println(hoty0);
		System.out.println(hoty0.indexOf("Rock with it \n"));
		System.out.println(hoty0.indexOf(" nope "));
		//middle
		hoty0.remove(6);
		//first
		hoty0.removeFirst();
		//last
		hoty0.removeLast();
		//middle
		System.out.println(hoty0);
		hoty0.remove("Lyrics that mean nothing,\n");
		System.out.println("-----");
		//last
		hoty0.remove("Is it time to move our feet to an introspective beat,\n");
		//first
		hoty0.remove("Rock with it \n");
		System.out.println(hoty0.contains("We were gifted with thought,\n"));
		System.out.println(hoty0);
		hoty0.clear();
		System.out.println(hoty0.isEmpty());
		Stack<String> s = new LinkedList<String>();
		s.push("hello");
		s.peek();
		System.out.println(s.pop());
		Queue<String> q = new LinkedList<String>();
		q.offer("hi");
		q.peek();
		System.out.println(q.poll());
		System.out.println(hoty);
		System.out.println("-------------");
		for (String l : hoty)
		{
			//System.out.println("ok");
			System.out.print(l);
		}
		/*
		LinkedListIterator<String> iter = new LinkedListIterator<String>(hoty.head);
		while (iter.hasNext())
		{
			System.out.println(iter.next());
		}
		*/
		/*
		LinkedList<String> test = new LinkedList<String>();
		test.add("0");
		test.add("1");
		test.add("2");
		test.add("3");
		test.add("4");
		test.add("5");
		test.add("6");
		test.add("7");
		test.remove(6);
		test.remove(0);
		test.remove(5);
		test.remove("3");
		test.remove("5");
		test.remove("1");
		System.out.println(test);
		*/
		
		//Use vector runner
		//String item = list.remove(0);
		//list.add(0, item);
		//if (list.removeFirst() == item)
		
		
		//copy of vector runner
		LinkedList<String> cheese = new LinkedList<String>();
		cheese.add("Sharp");
		cheese.add(0,"Mozzarella");
		cheese.add("Provolone");
		System.out.println(cheese.get(1));//Sharp
		System.out.println(cheese); //Mozzarella, Sharp, Provolone
		cheese.remove("Mozzarella");
		System.out.println(cheese); //Sharp, Provolone
		cheese.add("Gouda");
		cheese.add("American");
		cheese.add("Cheddar");
		cheese.add("Pepper-Jack");
		cheese.add("String");
		cheese.add("Feta");
		cheese.add("Swiss");
		cheese.add("Goat");
		cheese.add("Gruyere");
		System.out.println(cheese);
		for (String c : cheese)
		{
			System.out.println(c);
		}
		
		//Breaking the vector
		//Add null items
		cheese.add(null);
		cheese.add("Grilled");
		//Remove null
		cheese.remove(null);
		System.out.println(cheese);
		//Get, remove, add, set w/ invalid indices - IndexOutOfBounds
		try
		{
		cheese.get(50);
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("get: caught " + e);
		}
		try
		{
		cheese.remove(50);
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("remove: caught " + e);
		}
		try
		{
		cheese.add(50, "more cheese?");
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("add: caught " + e);
		}
		try
		{
		cheese.set(50, "more cheese?");
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("set: caught " + e);
		}
		//Add something of wrong type
		//cheese.add(7);
		//Copy constructor
		LinkedList<String> food = new LinkedList<String>(cheese);
		System.out.println(food);
		
	}
}
/*
//Lean with it, 											0
//rock with it,												1
When we gonna stop with it,									2
//Lyrics that mean nothing,									3
we were gifted with thought,								4
//Is it time to move our feet to an introspective beat,		5
//It ain't the speakers that bump hearts, 					6
//it's our hearts that make the beat.						7
*/

/*
SHOULD PRINT:
 Lean with it 
 Rock with it 
 When we gonna stop with it 
 Lyrics that mean nothing,
 We were gifted with thought,
 Is it time to move our feet to an introspective beat,
 It ain't the speakers that bump hearts,
 it's our hearts that make the beat. 
 
 Lean with it 
 Rock with it 
 When we gonna stop with it 
 Lyrics that mean nothing,
 We were gifted with thought,
 Is it time to move our feet to an introspective beat,
 It ain't the speakers that bump hearts,
 it's our hearts that make the beat. 
 
It ain't the speakers that bump hearts,

 Lean with it 
 Rock with it 
 When we gonna stop with it 
 Lyrics that mean nothing,
 We were gifted with thought,
 Is it time to move our feet to an introspective beat,
 It ain't the speakers that bump hearts,
 ITS OUR HEARTS THAT MAKE THE BEAT! 
1
-1
Rock with it 
 When we gonna stop with it 
 Lyrics that mean nothing,
 We were gifted with thought,
 Is it time to move our feet to an introspective beat,
 
-----
true
When we gonna stop with it 
 We were gifted with thought,
 
true
hello
hi
 Lean with it 
 Rock with it 
 When we gonna stop with it 
 Lyrics that mean nothing,
 We were gifted with thought,
 Is it time to move our feet to an introspective beat,
 It ain't the speakers that bump hearts,
 it's our hearts that make the beat. 
 
-------------
 Lean with it 
Rock with it 
When we gonna stop with it 
Lyrics that mean nothing,
We were gifted with thought,
Is it time to move our feet to an introspective beat,
It ain't the speakers that bump hearts,
it's our hearts that make the beat. 
Sharp
Mozzarella Sharp Provolone 
Sharp Provolone 
Sharp Provolone Gouda American Cheddar Pepper-Jack String Feta Swiss Goat Gruyere 
Sharp
Provolone
Gouda
American
Cheddar
Pepper-Jack
String
Feta
Swiss
Goat
Gruyere
Sharp Provolone Gouda American Cheddar Pepper-Jack String Feta Swiss Goat Gruyere Grilled 
get: caught java.lang.IndexOutOfBoundsException: Index, 50, out of bounds. Size is 12
remove: caught java.lang.IndexOutOfBoundsException: Index, 50, out of bounds. Size is 12
add: caught java.lang.IndexOutOfBoundsException: Index, 50, out of bounds. Size is 12
set: caught java.lang.IndexOutOfBoundsException: Index, 50, out of bounds. Size is 12
Sharp Provolone Gouda American Cheddar Pepper-Jack String Feta Swiss Goat Gruyere Grilled  
*/
