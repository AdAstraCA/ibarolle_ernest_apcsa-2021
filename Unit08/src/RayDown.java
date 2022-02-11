//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ernest Ibarolle
//Date - 2/9/22

public class RayDown
{
	public static boolean go(int[] numArray)
	{
	    if (numArray.length < 2) {
	    	return true;
	    } else {
	    	for (int i = 1; i < numArray.length; i++) {
	    		if (numArray[i] >= numArray[i - 1]) {
	    			return false;
	    		}
	    	}
	    	return true;
	    }
	}	
}