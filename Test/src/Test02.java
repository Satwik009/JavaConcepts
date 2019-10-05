import java.util.ArrayList;
import java.util.List;

public class Test02 {

	protected static List<Integer> fibonacci() {
		List<Integer> li = new ArrayList<>();
		int n1 = 1, n2 = 2, n3 = 0, count = 13;
		li.add(n1);
		li.add(n2);
		for (int i = 1; i <= count; i++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			li.add(n3);
		}
		return li;
	}

	public static void main(String[] args) {
		getNumberFromListDivisibleByPassedNumberInParameter(4,3);
	}

	/**
	 * Pass any number(point) in parameter it will give you exact number from the list % by 3 at that point
	 * eg if i pass 4 it will give me 4th number from list which is divisible by 3
	 * @param number
	 */
	protected static void getNumberFromListDivisibleByPassedNumberInParameter(int number, int xx) {
		int x = 0;
		List<Integer> n = fibonacci();
		System.out.println(n);
		for (int i = 0; i < n.size(); i++) {
			if (n.get(i) % xx == 0) {
				x++;
				if (x == number) {
					System.out.println(n.get(i));
				}
				System.out.println(n.get(i));
			}
		}
	}
}
