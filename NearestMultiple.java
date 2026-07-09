public class NearestMultiple {
	public static int roundToNearestMultiple(int num, int multiple) {
		int lower = (num / multiple) * multiple;
		int upper = lower + multiple;

		int lowerDistance = num - lower;
		int upperDistance = upper - num;

		if(lowerDistance <= upperDistance) {
			return lower;
		}

		else {
			return upper;
		}
	}

	public static void test(int num, int multiple, int expected) {
		int actual = roundToNearestMultiple(num, multiple);

		if(actual == expected) {
			System.out.println("PASS:" + " " + "Actual:" + " " + actual + " " + "Expected:" + " " + expected);
		}

		else {
			System.out.println("FAIL:" + " " + "Actual:" + " " + actual + " " + "Expected:" + " " + expected);
		}
	}

	public static void main(String[] args) {
		test(5, 3, 6);
		test(17, 4, 16);
		test(43, 5, 45);
		test(38, 11, 33);
		test(93, 12, 96);
	}
}	
