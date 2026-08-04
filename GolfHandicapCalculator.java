import java.lang.Math;

public class GolfHandicapCalculator {
	public static float calculateHandicap(int[] scores, int[] pars) {
		int[] differentials = new int[scores.length];

		for(int i = 0; i < scores.length; i++) {
			differentials[i] = scores[i] - pars[i];
		}
		
		float sum = 0;

		for(int i = 0; i < differentials.length; i++) {
			sum = sum + differentials[i];
		}
		
		int length = differentials.length;

		float handicapIndex = sum / length;
	      	
		float roundedHandicapIndex = Math.round(handicapIndex * 10.0f) / 10.0f;

		return roundedHandicapIndex;
	}

	public static void test(int[] scores, int[] pars, float expectedHandicapIndex) {
		float actualHandicapIndex = calculateHandicap(scores, pars);

		if(actualHandicapIndex == expectedHandicapIndex) {
			System.out.println("PASS" + " " + "Expected:" + " " + expectedHandicapIndex + " " + "Actual:" + " " + actualHandicapIndex);
		}

		else {
			System.out.println("FAIL" + " " + "Expected:" + " " + expectedHandicapIndex + " " + "Actual:" + " " + actualHandicapIndex);
		}
	}

	public static void main(String[] args) {
		test(new int[]{72, 72, 72}, new int[]{72, 72, 72}, 0);
		test(new int[]{80, 76, 78, 78}, new int[]{72, 72, 72, 72}, 6);
		test(new int[]{42, 45, 46, 44}, new int[]{36, 36, 36, 36}, 8.3f);
		test(new int[]{85, 80, 76, 79, 82}, new int[]{72, 72, 72, 71, 71}, 8.8f);
		test(new int[]{41, 50, 48, 52, 46, 49}, new int[]{35, 37, 35, 37, 35, 37}, 11.7f);
	}
}
