
public class binary {

	public static void main(String[] args) {
		// decimal to binary
		binary(12);
	}

	private static void binary(int n) {
		if (n == 0) {
			return;
		}
		binary(n / 2);
		System.out.print(n % 2);

	}

}
