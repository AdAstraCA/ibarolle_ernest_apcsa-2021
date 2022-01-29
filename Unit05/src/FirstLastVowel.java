//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ernest Ibarolle
//Date - 1/21/22

public class FirstLastVowel
{
   public static String go( String a )
   {
	   char first = a.charAt(0);
	   char last = a.charAt(a.length() - 1);
	   if (first == 97 || first == 101 || first == 105 || first == 111 || first == 117 || first == 65 || first == 69 || first == 73 || first == 79 || first == 85 || last == 97 || last == 101 || last == 105 || last == 111 || last == 117 || last == 65 || last == 69 || last == 73 || last == 79 || last == 85) {
		   return "yes";
	   } else {
		   return "no";
	   }
	}
}