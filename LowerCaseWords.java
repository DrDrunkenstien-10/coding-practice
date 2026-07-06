public class LowerCaseWords {
	public static String getLowerCaseWords(String s) {
		String result = "";

		String[] words = s.split(" ");
		
		for(String word : words) {
			String lowerCaseWord = word.toLowerCase();

			if(word.equals(lowerCaseWord)) {
				result = result + lowerCaseWord;
				result = result + " ";
			}
		}

		return result.stripTrailing();
	}

	public static void test(String s, String expected) {
		String actual = getLowerCaseWords(s);

		if(actual.equals(expected)) {
			System.out.println("PASS" + " " + "Actual:" + " " + actual + " " + "Expected:" + " " + expected);
		}

		else {
			System.out.println("FAIL" + " " + "Actual:" + " " + actual + " " + "Expected:" + " " + expected);
		}
	}

	public static void main(String[] args) {
		test("hello GOOD world", "hello world");
		test("these are all lowercase", "these are all lowercase");
		test("less is NoT more", "less is more");
		test("DonT eat pizza every OTHER day", "eat pizza every day");
		test("the Super quick AND snEaky brown fox Leapt anD jumped over aNd AROUND the lazy SloW dog", "the quick brown fox jumped over the lazy dog");
	}
}
