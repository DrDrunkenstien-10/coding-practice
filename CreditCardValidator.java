import java.util.Scanner;

public class CreditCardValidator {

	public static boolean validateCreditCard(String number) {	
		int sum = 0;

		for(int i = (number.length() - 1); i >= 0; i = i - 2) {
		        int currentNumber = number.charAt(i) - '0';
			
			sum = sum + currentNumber;

		}

		for(int i = (number.length() - 2); i >= 0; i = i - 2) {
		       int currentNumber = number.charAt(i) - '0';
	       	       
	               currentNumber = currentNumber * 2;

	               if(currentNumber > 9) {
			       currentNumber = currentNumber - 9;
		       }

		       sum = sum + currentNumber;
		}
		               	       
		System.out.println("Sum: " + sum);

		if(sum % 10 == 0) {
			return true;
		}

		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number:");

		String number = scanner.next();

		boolean isValid = validateCreditCard(number);

		System.out.println(isValid);
	}
}
