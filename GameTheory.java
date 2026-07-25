import java.util.Arrays;

public class GameTheory {
	public static int[] playGame(String p1, String p2) {
		int scoreP1 = 0;
		int scoreP2 = 0;

		for(int i = 0; i < p1.length(); i++) {
			char currentCharAtP1 = p1.charAt(i);
			char currentCharAtP2 = p2.charAt(i);

			if(currentCharAtP1 == 'C' && currentCharAtP2 == 'C') {
				scoreP1 = scoreP1 + 3;
				scoreP2 = scoreP2 + 3;
			}

			else if (currentCharAtP1 == 'D' && currentCharAtP2 == 'D') {
				scoreP1 = scoreP1 + 1;
				scoreP2 = scoreP2 + 1;
			}

			else if (currentCharAtP1 == 'C' && currentCharAtP2 == 'D') {
				scoreP1 = scoreP1 + 0;
				scoreP2 = scoreP2 + 5;
			}

			else if(currentCharAtP1 == 'D' && currentCharAtP2 == 'C') {
				scoreP1 = scoreP1 + 5;
				scoreP2 = scoreP2 + 0;
			}
		}

		int[] scores = new int[2];

		scores[0] = scoreP1;
		scores[1] = scoreP2;

		return scores;
	}

	public static void test(String p1, String p2, int[] expectedScores) {
		int[] actualScores = playGame(p1, p2);

		if(Arrays.equals(actualScores, expectedScores)) {
			System.out.println("TEST PASSED" + " " + "Actual Scores:" + " " + actualScores[0] + " " + actualScores[1] + " " + "Expected Scores:" + " " + expectedScores[0] + " " + expectedScores[1]);
		}

		else {
			System.out.println("TEST FAILED" + " " + "Actual Scores:" + " " + actualScores[0] + " " + actualScores[1] + " " + "Expected Scores:" + " " + expectedScores[0] + " " + expectedScores[1]);
		}
	}

	public static void main(String[] args) {
		test("CCCC", "CCCC", new int[]{12, 12});
		test("DDDD", "DDDD", new int[]{4, 4});
		test("CCDD", "CDDD", new int[]{5, 10});
		test("CCCDCDCCCDDC", "CCDDCDCDDCCD", new int[]{24, 34});
		test("DDCCDDDDCDDCDDDCDD", "CCDCCCDCCCDCCCCDCC", new int[]{66, 21});
	}
}
