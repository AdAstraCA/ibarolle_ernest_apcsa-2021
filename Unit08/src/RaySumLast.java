//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ernest Ibarolle
//Date - 2/8/22

public class RaySumLast
{
	public static int go(int ray[])
	{
	    int sum = 0;
	    int last = ray[ray.length - 1];
	    for (int i = ray.length - 2; i >= 0; i--) {
	    	if (ray[i] > last) {
	    		sum = sum + ray[i];
	    	}
	    }
	    if (sum != 0) {
	      return sum;
	    }
		return -1;
	}
}