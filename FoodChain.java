import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class FoodChain {
	public static String[] getFoodChain(List<String[]> pairs) {
		Map<String, String> map = new HashMap<>();

		for(String[] array : pairs) {
			map.put(array[0], array[1]);
		}

		String apexPredator = "";

		for(String[] array : pairs) {
			if(!map.containsValue(array[0])) {
				apexPredator = array[0];
				break;
			}
		}

		String[] foodChain = new String[map.size() + 1];

		foodChain[0] = apexPredator;

		for(int i = 1; i < foodChain.length; i++) {
			foodChain[i] = map.get(foodChain[i - 1]);
		}

		return foodChain;
	}

	public static void test(List<String[]> pairs, String[] expectedFoodChain) {
		String[] actualFoodChain = getFoodChain(pairs);

		if(Arrays.equals(expectedFoodChain, actualFoodChain)) {
			System.out.println("PASS:");
			
			System.out.println("Actual Food Chain:");
			for(String item : actualFoodChain) {
				System.out.print(item + " ");
			}
			
			System.out.println();

			System.out.println("Expected Food Chain:");
			for(String item : expectedFoodChain) {
				System.out.print(item + " ");
			}
			
			System.out.println();
			System.out.println();
		}

		else {
			System.out.println("FAIL");

			System.out.println("Actual Food Chain:");
			for(String item : actualFoodChain) {
				System.out.print(item + " ");
			}
			
			System.out.println();

			System.out.println("Expected Food Chain:");
			for(String item : expectedFoodChain) {
				System.out.print(item + " ");
			}
			
			System.out.println();
			System.out.println();
		}
	}

	public static void main(String[] args) {
		test(
				List.<String[]>of(
					new String[]{"cat", "mouse"}
				       ),
				new String[]{"cat", "mouse"}
		    );

		test(
				List.<String[]>of(
					new String[]{"wolf", "deer"},
					new String[]{"deer", "grass"}
				       ),
				new String[]{"wolf", "deer", "grass"}
		    );

		test(
				List.<String[]>of(
					new String[]{"hawk", "snake"},
					new String[]{"snake", "frog"},
					new String[]{"frog", "fly"}
				       ),
				new String[]{"hawk", "snake", "frog", "fly"}
		    );

		test(
				List.<String[]>of(
					new String[]{"rabbit", "grass"},
					new String[]{"fox", "rabbit"},
					new String[]{"eagle", "fox"}
				       ),
				new String[]{"eagle", "fox", "rabbit", "grass"}
		    );

		test(
				List.<String[]>of(
					new String[]{"seal", "salmon"},
					new String[]{"herring", "shrimp"},
					new String[]{"orca", "seal"},
					new String[]{"shrimp", "plankton"},
					new String[]{"salmon", "herring"}
				       ),
				new String[]{"orca", "seal", "salmon", "herring", "shrimp", "plankton"}
		    );
	}	
}
