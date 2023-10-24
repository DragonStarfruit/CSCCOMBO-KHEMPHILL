
public class endOther {

	public static void main(String[] args) {
		System.out.println(endOther("HIabc", "abc"));
		System.out.println(endOther("AbC", "HiaBc"));
		System.out.println(endOther("abc", "abXabc"));
		System.out.println(endOther("abc", "a"));
	}

	public static boolean endOther(String a, String b) {
		String one = a.toLowerCase();
		String two = b.toLowerCase();
		if (a.length() > b.length()) {
			if (one.substring(one.length() - two.length(), one.length()).equals(two)) {
				return true;
			}
		} else if (one.length() < b.length()) {
			if (two.substring(two.length() - one.length(), two.length()).equals(one)) {
				return true;
			}
		} else {
			if (one.substring(0, one.length()).equals(two)) {
				return true;
			} else if (two.substring(0, two.length()).equals(one)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
}
