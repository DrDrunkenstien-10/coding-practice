import java.util.Scanner;

import java.util.Map;
import java.util.HashMap;

public class Speak1337 {
	public static final Map<Character, Integer> leetSubstitution = new HashMap<>(
			Map.of('a', 4, 'e', 3, 'g', 9, 'i', 1, 'l', 1, 'o', 0, 's', 5, 't', 7));
        
	public static String function(String s) {
		String answer = "";

	        for(int i = 0; i < s.length(); i++) {
			if(leetSubstitution.containsKey(s.charAt(i))) {
				answer = answer + leetSubstitution.get(s.charAt(i));
			}

			else {
				answer = answer + s.charAt(i);
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the lowercase string:");
		
		String s = scanner.next();

		String answer = function(s);

		System.out.println(answer);

		scanner.close();
	}
}	
