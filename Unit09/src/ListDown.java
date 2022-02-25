//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ernest Ibarolle
//Date - 2/16/22

import java.util.List;
import java.util.ArrayList;

public class ListDown
{
	public static boolean go(List<Integer> numArray)
	{
    if (numArray.size() < 2) {
      return true;
    } else {
      for (int i = 1; i < numArray.size(); i++) {
        // I'm assuming the directions are asking if it's increasing.
        if (numArray.get(i) <= numArray.get(i - 1)) {
          return false;
        }
      }
      return true;
    }
	}	
}