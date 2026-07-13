public class TallyCounter {
	public static int getTallyCount(String s) {
		int tallyCount = 0;

		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '|' || s.charAt(i) == '/') {
				tallyCount++;
			}
		}

		return tallyCount;
	}

	public static void test(String s, int expectedTallyCount) {
		int actualTallyCount = getTallyCount(s);

		if(actualTallyCount == expectedTallyCount) {
			System.out.println("TEST PASSED" + " " + "ACTUAL TALLY COUNT:" + " " + actualTallyCount + " " + "EXPECTED TALLY COUNT:" + " " + expectedTallyCount);
		}

		else {
			System.out.println("TEST FAILED" + " " + "ACTUAL TALLY COUNT:" + " " + actualTallyCount + " " + "EXPECTED TALLY COUNT:" + " " + expectedTallyCount);
		}
	}

	public static void main(String[] args) {
		test("||||", 4);
		test("||||/", 5);
		test("||||/ |||", 8);
		test("||||/ ||||/ ||||/ ||", 17);
		test("||||/ ||||/ ||||/ ||||/ ||||/ ||||/ ||||/ ||||/ |", 41);
	}
}
