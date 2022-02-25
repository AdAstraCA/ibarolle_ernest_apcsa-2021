//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ernest Ibarolle
//Date - 2/16/22

import java.util.List;
import java.util.ArrayList;

public class ListOddToEven
{
	public static int go(List<Integer> ray)
	{
    for (int i = 0; i < ray.size(); i++) {
      if (ray.get(i) % 2 == 1) {
        for (int j = ray.size() - 1; j > i; j--) {
          if (ray.get(j) % 2 == 0) {
            return j - i;
          }
        }
        return -1;
      }
    }
		return -1;
	}
}