public class NonogramValidator {
	public static boolean isValidNonogram(int[] clue, int[] cells) {
		int clueIndex = 0;
		int i = 0;

		while(i < cells.length) {
			if(cells[i] == 0) {
				i++;
				continue;
			}

			int count = 0;

			while(i < cells.length && cells[i] == 1) {
				count++;
				i++;
			}

			if(clueIndex >= clue.length) {
				return false;
			}

			if(count != clue[clueIndex]) {
				return false;
			}

			clueIndex++;
		}

		return clueIndex == clue.length;
	}

	public static void test(int[] clue, int[] cells, boolean expected) {
		boolean actual = isValidNonogram(clue, cells);

		if(actual == expected) {
			System.out.println("PASS");
		}

		else {
			System.out.println("FAIL");
		}
	}

	public static void main(String[] args) {
		test(new int[]{3, 2}, new int[]{1, 1, 1, 0, 1, 1}, true);
                test(new int[]{3, 2}, new int[]{0, 1, 1, 1, 1, 1}, false);
                test(new int[]{1, 1, 1, 1}, new int[]{1, 0, 1, 0, 1, 0, 1, 0, 1}, false);
                test(new int[]{1, 1, 1, 1}, new int[]{0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0}, true);
		test(new int[]{3, 2, 3}, new int[]{0, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0}, true);
		test(new int[]{3, 2, 3}, new int[]{0, 0, 0, 1, 0, 0, 1, 0, 0, 0}, false);
	}
}
