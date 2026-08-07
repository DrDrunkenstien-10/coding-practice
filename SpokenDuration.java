import java.util.List;
import java.util.ArrayList;

public class SpokenDuration {
	public static String getSpokenDuration(int seconds) {
		int hours = seconds / 3600;

		int remainder = seconds % 3600;

		int minutes = remainder / 60;

		int calculatedSeconds = remainder % 60;

		List<String> parts = new ArrayList<>();

		if(hours > 0) {
			if(hours == 1) {
				parts.add(hours + " " + "hour");
			}

			else {
				parts.add(hours + " " + "hours");
			}
		}

		if(minutes > 0) {
			if(minutes == 1) {
				parts.add(minutes + " " + "minute");
			}

			else {
				parts.add(minutes + " " + "minutes");
			}
		}

		if(calculatedSeconds > 0) {
			if(calculatedSeconds == 1) {
				parts.add(calculatedSeconds + " " + "second");
			}

			else {
				parts.add(calculatedSeconds + " " + "seconds");
			}
		}

		if(parts.size() == 1) {
			return parts.get(0);
		}

		if(parts.size() == 2) {
			return parts.get(0) + " " + "and" + " " + parts.get(1);
		}

		return parts.get(0) + "," + " " + parts.get(1) + " " + "and" + " " + parts.get(2);
	}

	public static void test(int seconds, String expectedDuration) {
		String actualDuration = getSpokenDuration(seconds);

		if(actualDuration.equals(expectedDuration)) {
			System.out.println("PASS" + " " + "Expected:" + " " + expectedDuration + " " + "Actual:" + " " + actualDuration);
		}

		else {
			System.out.println("FAIL" + " " + "Expected:" + " " + expectedDuration + " " + "Actual:" + " " + actualDuration);
		}
	}

	public static void main(String[] args) {
		test(3723, "1 hour, 2 minutes and 3 seconds");
		test(7295, "2 hours, 1 minute and 35 seconds");
        	test(8521, "2 hours, 22 minutes and 1 second");
        	test(435, "7 minutes and 15 seconds");
        	test(14455, "4 hours and 55 seconds");
        	test(72000, "20 hours");
        	test(1, "1 second");
	}
}
