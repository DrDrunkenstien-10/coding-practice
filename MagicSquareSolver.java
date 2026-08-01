public class MagicSquareSolver {
	public static String solveMagicSquare(int[][] grid) {
		int rows = grid.length;
		int columns = grid[0].length;
		
		int missingNumberRow = -1;
		int missingNumberColumn = -1;

		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
			       if(grid[i][j] == 0) {
				       missingNumberRow = i;
				       missingNumberColumn = j;
				       
				       break;
			       }
			}
		}
		
		int sum = 0;
		
		for(int i = 0; i < rows; i++) {
			if(i == missingNumberRow) {
				continue;
			}

			else {
				for(int j = 0; j < columns; j++) {
					sum = sum + grid[i][j];
				}

				break;
			}
		}
		
		int missingNumber = 0;
		
		int missingNumberRowSum = 0;

		for(int i = 0; i < columns; i++) {
			missingNumberRowSum = missingNumberRowSum + grid[missingNumberRow][i];
		}
		
		missingNumber = sum - missingNumberRowSum;

		grid[missingNumberRow][missingNumberColumn] = missingNumber;
		
		for(int i = 0; i < rows; i++) {
			int total = 0;

			for(int j = 0; j < columns; j++) {
				total = total + grid[i][j];
			}

			if(total != sum) {
				return "impossible";
			}
		}

		for(int i = 0; i < columns; i++) {
			int total = 0;

			for(int j = 0; j < rows; j++) {
				total = total + grid[i][j];
			}

			if(total != sum) {
				return "impossible";
			}
		}
		
		// Hardcoded the rows and columns since the problem ensures there will always be 3x3 grid 
	        int leftDiagonalTotal = grid[0][0] + grid[1][1] + grid[2][2];
		int rightDiagonalTotal = grid[0][2] + grid[1][1] + grid[2][0];

		if(leftDiagonalTotal != sum || rightDiagonalTotal != sum) {
			return "impossible";
		}

		return String.valueOf(missingNumber);	
			 		
	}

	public static void test(int[][] grid, String expected) {
		String actual = solveMagicSquare(grid);

		if(actual.equals(expected)) {
			System.out.println("PASS:" + " " + "Expected:" + " " + expected + " " + "Actual:" + " " + actual);
		}

		else {
			System.out.println("FAIL:" + " " + "Expected:" + " " + expected + " " + "Actual:" + " " + actual);
		}
	}

	public static void main(String[] args) {
		test(new int[][]{ {2, 7, 6}, {9, 0, 1}, {4, 3, 8} }, "5");
		test(new int[][]{ {0, 14, 12}, {18, 10, 2}, {8, 6, 16} }, "4");
		test(new int[][]{ {12, 17, 16}, {19, 0, 10}, {14, 13, 18} }, "impossible");
		test(new int[][]{ {15, 35, 31}, {43, 27, 11}, {23, 19, 0} }, "39");
		test(new int[][]{ {26, 41, 14}, {47, 35, 0}, {32, 29, 44} }, "impossible");
	}
}	
