
public class arrayExercises2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayReverse
		int[] vals = { 1, 2, 3, 4, 5, 6 };
		ArrayReverse(vals);
		for (int i = 0; i < vals.length; i++)
			System.out.println(vals[i]);
	}

	// ArrayReverse Method
	public static int[] ArrayReverse(int[] vals) {
		// swap-er
		for (int i = 0; i < vals.length / 2; i++) {
			int tempVals = vals[i];
			vals[i] = vals[vals.length - 1 - i];
			vals[vals.length - 1 - i] = tempVals;
		}

		return vals;
	}
}
