//returns true if matrix is same when rotated 180 degrees, false otherwise
//run time is O(mn) or O(n^2) for nxn matrix
public static boolean isSame180 (int[][] matrix){
	//first we rotate the matrix by 180 degrees and store the result in a new matrix
	//to rotate a matrix by 180 degrees reverse its rows and then its columns
	//thus, we make a deep copy to store the rotated matrix
	int [][] rotatedMatrix = new int[matrix.length][matrix[0].length];
	for (int i = 0; i < matrix.length; ++i){
		for (int j = 0; j < matrix[i].length; ++j){
			rotatedMatrix[i][j] = matrix[i][j];
		}
	}

	//next reverse each row of the rotatedMatrix
	for (int i = 0; i < rotatedMatrix.length; ++i){
		for (int j = 0; j < rotatedMatrix[i].length/2; ++j){
			int temp = rotatedMatrix[i][j];
			rotatedMatrix[i][j] = rotatedMatrix[i][rotatedMatrix[i].length - 1 - j];
			rotatedMatrix[i][rotatedMatrix[i].length - 1 - j] = temp;
		}
	}

	//next reverse each column of the rotatedMatrix
	for (int i = 0; i < rotatedMatrix[0].length; ++i){
		for (int j = 0; j < rotatedMatrix.length/2; ++j){
			int temp = rotatedMatrix[j][i];
			rotatedMatrix[j][i] = rotatedMatrix[rotatedMatrix.length - 1 - j][i];
			rotatedMatrix[rotatedMatrix.length - 1 - j][i] = temp;
		}
	}

	//finally, check for the equality of the two matrixes
	for (int i = 0; i < matrix.length; ++i){
		for (int j = 0; j < matrix[i].length; ++j){
			if (matrix[i][j] != rotatedMatrix[i][j]){
				return false;
			}
		}
	}
	return true;
}

//returns true if matrix is same when rotated 180 degrees, false otherwise
//run time is O(mn) or O(n^2) for nxn matrix
public static boolean isSame180Version2 (int[][] matrix){
	//go from [0][0] forward row-wise and from [matrix.length - 1][matrix[rowNumber].length - 1] backwards row-wise
	//compare corresponding values and return false if values don't match on any comparison
	for (int i = 0; i < matrix.length; ++i){
		for (int j = 0; j < matrix[i].length; ++j){
			if (matrix[i][j] != matrix [matrix.length - 1 - i][matrix[i].length - 1 - j]){
				return false;
			}
		}
	}
	return true;
}