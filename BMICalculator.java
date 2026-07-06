import java.util.Scanner;

public class BMICalculator {
	public static double calculateBMI(double weight, double height) {
		double bmi = ((weight) / (height * height)) * 703;
		double roundedBMI = Math.round(bmi * 10.0) / 10.0;

		return roundedBMI;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the weight in pounds:");
		double weight = scanner.nextDouble();

		System.out.println("Enter the height in inches:");
		double height = scanner.nextDouble();

		double bmi = calculateBMI(weight, height);
		System.out.println("BMI: " + bmi);

		scanner.close();
	}
}
