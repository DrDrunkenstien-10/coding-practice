import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;

public class DNAMutation {
	public static int[] detectMutation(String strand1, String strand2) {
		ArrayList<Integer> result = new ArrayList<>();

		for(int i = 0; i < strand1.length(); i++) {
			if(strand1.charAt(i) != strand2.charAt(i)) {
				result.add(i);
			}
		}
		
		int[] resultArray = new int[result.size()];

		for(int i = 0; i < result.size(); i++) {
			resultArray[i] = result.get(i);
		}

		return resultArray;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the strand 1:");
		String strand1 = scanner.next();

		System.out.println("Enter the strand 2:");
		String strand2 = scanner.next();

		int[] resultArray = detectMutation(strand1, strand2);
		
		System.out.println("Result:");
		
		if(resultArray.length == 0) {
			System.out.println("[]");
		}

		for(int i = 0; i < resultArray.length; i++) {
			System.out.println(resultArray[i]);
		}

		scanner.close();
	}
}
