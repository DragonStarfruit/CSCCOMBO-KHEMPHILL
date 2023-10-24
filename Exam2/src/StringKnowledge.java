
public class StringKnowledge {

	public static void main(String[] args) {

		System.out.println(howManyCat("abc cat ho"));
		System.out.println(howManyCat("catABC cat"));
		System.out.println(howManyCat("catcat"));
		System.out.println(howManyCat("dogdog"));
	}

	public static int howManyCat(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 3).equals("cat")) {
				count++;
			}
		}
		return count;
	}

}
