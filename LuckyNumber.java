import java.lang.Math;

import java.util.Scanner;

public class LuckyNumber {
       public static boolean isVowel(char c) {
               if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
		       return true;
	       }

	       else {
		       return false;
	       }
       }

       public static int getLuckyNumber(String name) {
	       String lowerCaseName = name.toLowerCase();

	       String[] splitName = lowerCaseName.split(" ");

	       String firstName = splitName[0];
	       String lastName = splitName[1];
	       
	       int firstNameVowelCount = 0;
	       int firstNameConsonantCount = 0;

	       for(int i = 0; i < firstName.length(); i++) {
		       char c = firstName.charAt(i);
		       
		       if(isVowel(c)) {
			       firstNameVowelCount++;
		       }

		       else {
			       firstNameConsonantCount++;
		       }
	       }
	       
	       int lastNameVowelCount = 0;
	       int lastNameConsonantCount = 0;

	       for(int i = 0; i < lastName.length(); i++) {
		       char c = lastName.charAt(i);

		       if(isVowel(c)) {
			       lastNameVowelCount++;
		       }

		       else {
			       lastNameConsonantCount++;
		       }
	       }
	       
       	       int firstNameLength = firstName.length();
	       int lastNameLength = lastName.length();

	       int lowerVowelCount = Math.min(firstNameVowelCount, lastNameVowelCount);
	       int lowerConsonantCount = Math.min(firstNameConsonantCount, lastNameConsonantCount);
	       int lowerLength = Math.min(firstNameLength, lastNameLength);

	       int lowerValue = lowerVowelCount * lowerConsonantCount * lowerLength;

	       int higherVowelCount = Math.max(firstNameVowelCount, lastNameVowelCount);
	       int higherConsonantCount = Math.max(firstNameConsonantCount, lastNameConsonantCount);
	       int higherLength = Math.max(firstNameLength, lastNameLength);

	       int higherValue = higherVowelCount * higherConsonantCount * higherLength;

	       int luckyNumber = higherValue - lowerValue;

	       if(luckyNumber == 0) {
		       return 13;
	       }

	       else {
		       return luckyNumber;
	       }
       }

       public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);

	       System.out.println("Enter the name:");
	       String name = scanner.nextLine();

	       int luckyNumber = getLuckyNumber(name);
	       System.out.println("Lucky NUmber:" + " " + luckyNumber);

	       scanner.close();
       }
}
