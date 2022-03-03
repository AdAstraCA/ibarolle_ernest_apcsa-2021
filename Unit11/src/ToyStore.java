//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		toyList = new ArrayList<Toy>();
		ArrayList<String> newToys = new ArrayList<>(Arrays.asList(toys.split(" ")));
		for (int i = 0; i < newToys.size(); i++) {
			String name = newToys.get(i);
			Toy newToy = getThatToy(name);
			if (newToy == null) {
				toyList.add(new Toy(name));
			} else {
				newToy.setCount(newToy.getCount() + 1);
			}
		}
		System.out.println(toyList);
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for (int i = 0; i < toyList.size(); i++) {
  			if ((toyList.get(i)).getName().equals(nm)) {
  				return toyList.get(i);
  			}
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		return "";
  	}  
  
  	public void sortToysByCount()
  	{
  	}  
  	  
	public String toString()
	{
	   return "";
	}
}