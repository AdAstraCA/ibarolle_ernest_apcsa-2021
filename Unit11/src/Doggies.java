//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		pups[spot] = new Dog(age,name);	
	}

	public String getNameOfOldest()
	{
		Dog max = pups[0];
		for (int i = 1; i < pups.length; i++) {
			if (pups[i].getAge() > max.getAge()) {
				max = pups[i];
			}
		}
		return max.getName();
	}

	public String getNameOfYoungest()
	{
		Dog max = pups[0];
		for (int i = 1; i < pups.length; i++) {
			if (pups[i].getAge() < max.getAge()) {
				max = pups[i];
			}
		}
		return max.getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}