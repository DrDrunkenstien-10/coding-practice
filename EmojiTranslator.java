import java.util.Map;

public class EmojiTranslator {
	public static final Map<String, String> table = Map.of("👶", "baby", "🐱", "cat", "🐕", "dog", "🐟", "fish", "🥵", "hot", "🧊", "ice", "🪨", "rock", "🦈", "shark", "🍲", "soup", "⭐", "star");

	public static String getEmojiPhrase(String s) {
		StringBuilder phrase = new StringBuilder();

		for(int i = 0; i < s.length();) {
			int codePoint = s.codePointAt(i);

			String emoji = new String(Character.toChars(codePoint));

			phrase.append(" ").append(table.get(emoji));

			i = i + Character.charCount(codePoint);
		}

		return phrase.toString().trim();
	}

	public static void test(String s, String expectedPhrase) {
		String actualPhrase = getEmojiPhrase(s);

		if(actualPhrase.equals(expectedPhrase)) {
			System.out.println("PASS" + " " + "Expected:" + " " + expectedPhrase + " " + "Actual:" + " " + actualPhrase);
		}

		else {
			System.out.println("FAIL" + " " + "Expected:" + " " + expectedPhrase + " " + "Actual:" + " " + actualPhrase);
		}
	}

	public static void main(String[] args) {
		test("🪨⭐", "rock star");
		test("🥵🐕", "hot dog");
		test("👶🦈", "baby shark");
		test("⭐🐟", "star fish");
		test("🧊🧊👶", "ice ice baby");
		test("🐱🐟🍲", "cat fish soup");
	}
}
