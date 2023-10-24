
public class LogicKnowledge {

	public static void main(String[] args) {
		System.out.println(pickNumber(1, 2, 3));
		System.out.println(pickNumber(2, 2, 2));
		System.out.println(pickNumber(1, 1, 2));
	}

	public static int pickNumber(int a, int b, int c) {
		if (a == b && b == c) {
			return a;
		} else if (a == b && b != c) {
			return c;
		} else if (a != b && b == c) {
			return a;
		} else if (a == c && a != b) {
			return b;
		} else {
			return a + b + c;
		}
	}

}
