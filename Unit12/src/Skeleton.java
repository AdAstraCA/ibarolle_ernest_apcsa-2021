//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ernest Ibarolle

import static java.lang.System.*; 

public class Skeleton implements Monster
{	
	private String name;
	private int size;
	
	public Skeleton() {
		name = "";
		size = 0;
	}
	
	public Skeleton(String monsterName, int monsterSize) {
		name = monsterName;
		size = monsterSize;
	}
	//add code to implement the Monster interface
	public int getHowBig() {
		return size;
	}
	
	public String getName() {
		return name;
	}

	public boolean isBigger(Monster other) {
		if (getHowBig() > other.getHowBig()) {
			return true;
		}
		return false;
	}
	
	public boolean isSmaller(Monster other) {
		if (getHowBig() < other.getHowBig()) {
			return true;
		}
		return false;
	}
	
	public boolean namesTheSame(Monster other) {
		if (getName().equals(other.getName())) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return getName() + " " + getHowBig();
	}
}