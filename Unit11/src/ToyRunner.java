//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ernest Ibarolle

import static java.lang.System.*;
import java.util.ArrayList;

public class ToyRunner
{
	public static void main(String[] args)
	{
    ArrayList<Toy> toys = new ArrayList<Toy>();
		Toy sorry = new Toy("sorry");
		sorry.setCount(1);
		Toy joe = new Toy("gi joe");
		joe.setCount(5);
		toys.add(sorry);
		toys.add(joe);
		for (int i = 0; i < toys.size() - 1; i++) {
			System.out.println(toys);
    }
	}
}