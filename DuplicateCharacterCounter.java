import java.util.HashSet;

import java.util.Scanner;

public class DuplicateCharacterCounter {
	public static int countDuplicateCharacter(String str1, String str2) {
		HashSet<Character> set = new HashSet<Character>();
	        
		for(int i = 0; i < str1.length(); i++) {
			set.add(str1.charAt(i));
		}
		
		int count = 0;

		for(int i = 0; i < str2.length(); i++) {
			if(set.contains(str2.charAt(i))) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first string:");
		String str1 = scanner.nextLine();

		System.out.println("Enter the second string:");
		String str2 = scanner.nextLine();

		int count = countDuplicateCharacter(str1, str2);
		System.out.println("Count:" + " " + count);

		scanner.close();
	}
}				
