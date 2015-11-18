//Daria Fradkin
//November 14, 2015

public class LinkedListRunner
{
	public static void main(String[] args)
	{
		LinkedList<String> hoty = new LinkedList<String>();
		hoty.add("Rock with it \n");
		hoty.add("When we gonna stop with it \n",1);
		hoty.add(" Lean with it \n", 0);
		hoty.add("it's our hearts that make the beat. \n");
		hoty.add("Is it time to move our feet to an introspective beat,\n", 3);
		hoty.add("Lyrics that mean nothing,\n", 3);
		hoty.add("It ain't the speakers that bump hearts,\n", 5);
		hoty.add("We were gifted with thought,\n", 4);
		System.out.println(hoty);
	}
}

//Lean with it, 
//rock with it,
//When we gonna stop with it,
//Lyrics that mean nothing,
//we were gifted with thought,
//Is it time to move our feet to an introspective beat,
//It ain't the speakers that bump hearts, 
//it's our hearts that make the beat.

