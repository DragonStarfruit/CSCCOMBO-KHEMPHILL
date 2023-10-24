
public class ArrayKnowledge {

	public static void main(String[] args) {
		char[] character = { 'b', 'a', 'x' };
		System.out.println(hasxx(character));
	}

	public static boolean hasxx(char[] character) {
		for (int i = 0; i < character.length; i++) {
			if (character[i] == 'x') {
				return true;
			}
		}
		return false;
	}
}
