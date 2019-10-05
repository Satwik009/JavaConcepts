import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



 /**
  * 
 * @author satwik
 *
 */
class Test01 {

	public static void main(String[] args) {

		Integer arry[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, args.length };

		List<Integer> array = Arrays.asList(arry);
		System.out.println(array.indexOf(8));
		
		_duplicateStingInarray();
		_findDuplicateCharacters();
		_palindrom();
		_hashMapExample();
		fact();
		reverseString();
	}

	protected static void _findDuplicateCharacters() {
		String s = "sashaa";
		char fir;
		char sec;
		for (int i = 0; i < s.length(); i++) {
			fir = s.charAt(i);
			for (int j = i + 1; j < s.length(); j++) {
				sec = s.charAt(j);
				if (sec == fir) {
					System.out.println(fir);
				}
			}
		}
	}

	protected static void _duplicateStingInarray() {
		HashMap<Integer, String> li = new HashMap<>();
		int num = 0;
		String s[] = { "satwikk", "manoj", "manoj" };
		Set<String> se = new HashSet<String>();
		System.out.println(s.length);
		for (int i = 0; i < s.length; i++) {
			++num;
			if (se.add(s[i]) == false) {
				li.put(num, s[i]);
			}
			li.forEach((k, v) -> System.out.println(k + "    " + v));
		}
	}

	protected static void _palindrom() {
		int num = 454;
		int temp = num;
		int rev = 0;
		int rem;
		while (temp > 0) {
			rem = temp % 10;
			rev = rem + rev * 10;
			temp = temp / 10;
		}
		System.out.println("num" + num);
		System.out.println("rev" + rev);

	}

	protected static void _hashMapExample() {
		HashMap<Integer, String> li = new HashMap<>();
		li.put(8, "prashant");
		li.put(9, "Satwik");
		li.forEach((k, v) -> System.out.println(k + " = " + v));
	}

	protected static void fact() {
		int fact = 1;
		int num = 5;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

	
	protected static void reverseString()
	{
		String s = "satwik";
		for(int i=0;i<s.length();i++){
	s=	s.substring(1,s.length()-i) + s.substring(0,1) + s.substring(s.length()-i, s.length());
		}
		System.out.println(s);
	}
}
