import java.util.Set;

public class PigLatinConverter {
	public static final Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

	public static String pigLatin(String s) {
		String[] words = s.split(" ");
		
		String pigLatinString = "";

		for(String word : words) {
			if(vowels.contains(word.charAt(0))) {
			        word = word + "way";
			}

			else {
				int i = 0;
				
				boolean isUpperCase = Character.isUpperCase(word.charAt(0));
				
				int lastConsonantIndex = 0;

				while(!vowels.contains(word.charAt(i))) {
					lastConsonantIndex = i;
					i++;
				}

				String firstPart = word.substring(0, (lastConsonantIndex + 1));
				String secondPart = word.substring(lastConsonantIndex + 1);

				if(isUpperCase) {
					String updatedFirstPart = Character.toLowerCase(firstPart.charAt(0)) + firstPart.substring(1);
					String updatedSecondPart = Character.toUpperCase(secondPart.charAt(0)) + secondPart.substring(1);

					word = updatedSecondPart + updatedFirstPart + "ay";
				}

				else {
					word = secondPart + firstPart + "ay";
				}
			}

		pigLatinString = pigLatinString + " " + word;
		
		}
		
		String finalPigLatinString = pigLatinString.trim();

		return finalPigLatinString;
	}

	public static void test(String s, String expectedPigLatinString) {
		String actualPigLatinString = pigLatin(s);

		if(actualPigLatinString.equals(expectedPigLatinString)) {
			System.out.println("TEST PASSED" + " " + "ACTUAL:" + " " + actualPigLatinString + " " + "EXPECTED:" + " " + expectedPigLatinString);
		}

		else {
			System.out.println("TEST FAILED" + " " + "ACTUAL:" + " " + actualPigLatinString + " " + "EXPECTED:" + " " + expectedPigLatinString);
		}
	}

	public static void main(String[] args) {
		test("universe", "universeway");
		test("hello universe", "ellohay universeway");
		test("hello", "ellohay");
		test("Hello universe", "Ellohay universeway");
		test("Pig Latin is fun", "Igpay Atinlay isway unfay");
		test("The quick brown fox jumped over the lazy dog", "Ethay uickqay ownbray oxfay umpedjay overway ethay azylay ogday");
	}
}
