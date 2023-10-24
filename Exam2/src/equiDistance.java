
public class equiDistance {

	public static void main(String[] args) {
		System.out.println(equiDistance(2, 4, 6));
		System.out.println(equiDistance(4, 6, 2));
		System.out.println(equiDistance(4, 6, 3));
		System.out.println(equiDistance(3, 9, 6));

	}

	public static boolean equiDistance(int a, int b, int c) {
		int s, m, l;
		// l
		if (a > b && a > c) {
			l = a;
		} else if (b > a && b > c) {
			l = b;
		} else {
			l = c;
		}
		// m
		if (a > b && a < c) {
			m = a;
		} else if (b > a && b < c) {
			m = b;
		} else {
			m = c;
		}
		// s
		if (a < b && a < c) {
			s = a;
		} else if (b < a && b < c) {
			s = b;
		} else {
			s = c;
		}
		// return
		if (s + m == l) {
			return true;
		}
		return false;
	}

}
