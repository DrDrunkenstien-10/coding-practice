import java.util.Arrays;

public class NumberSorter {
	public static int[] sortNumbers(String string) {
		String[] numberStrings = string.split(",");
		
		int[] numbers = new int[numberStrings.length];
		
		int i = 0;

		for(String numberString : numberStrings) {
		       int number = Integer.parseInt(numberString);

		       numbers[i] = number;
		       i++;
		}

		Arrays.sort(numbers);

		return numbers;		
	}

	public static void main(String[] args) {
		String string = "0,6,-19,44,-2,7,0";

		int[] sortedNumbers = sortNumbers(string);

		for(int sortedNumber : sortedNumbers) {
		       System.out.println(sortedNumber);
		}	       
	}
}
