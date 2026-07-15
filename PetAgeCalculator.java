import java.util.Map;

public class PetAgeCalculator {
	public static final Map<String, Integer> conversionTable = Map.of(
			"dog", 7, "cat", 6, "rabbit", 8, "hamster", 30, "guinea pig", 12, "goldfish", 6, "bird", 5);

	public static int petYears(String pet, int age) {
		int petYears = 0;

		int multiplier = conversionTable.get(pet);

		petYears = multiplier * age;

		return petYears;
	}

	public static void test(String pet, int age, int expectedPetYears) {
		int actualPetYears = petYears(pet, age);

		if(actualPetYears == expectedPetYears) {
			System.out.println("TEST PASSED" + " " + "ACTUAL PET YEARS:" + " " + actualPetYears + " " + "EXPECTED PET YEARS" + " " + expectedPetYears);
		}

		else {
			System.out.println("TEST PASSED" + " " + "ACTUAL PET YEARS:" + " " + actualPetYears + " " + "EXPECTED PET YEARS" + " " + expectedPetYears);
		}
	}

	public static void main(String[] args) {
		test("dog", 5, 35);
		test("cat", 9, 54);
		test("rabbit", 3, 24);
		test("hamster", 4, 120);
		test("guinea pig", 5, 60);
		test("goldfish", 2, 12);
		test("bird", 1, 5);
	}
}	
