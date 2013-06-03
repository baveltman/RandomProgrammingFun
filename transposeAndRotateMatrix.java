// transposes matrix
// run time is O(n^2)
public static int [][] transpose (int [][] matrix)
{
	//create container for transposed matrix
	int [][] transposedMatrix = new int [matrix[0].length][matrix.length];

	for (int i = 0; i <= transposedMatrix.length - 1; i++)
	{
		for (int j = 0; j < transposedMatrix[i].length; j++)
		{
			//populate result with transposed elements
			transposedMatrix [i][j] = matrix [j][i];
		}
	}

	return transposedMatrix;
}

//rotates matrix 90 degrees
//run time is O(n^2)
public static int [][] rotate90 (int [][] matrix){

	//first transpose matrix
	int [][] rotatedMatrix = transpose(matrix);

	//next reverse each row of the rotatedMatrix
	for (int i = 0; i < rotatedMatrix.length; ++i){
		for (int j = 0; j < rotatedMatrix[i].length/2; ++j){
			int temp = rotatedMatrix[i][j];
			rotatedMatrix[i][j] = rotatedMatrix[i][rotatedMatrix[i].length - 1 - j];
			rotatedMatrix[i][rotatedMatrix[i].length - 1 - j] = temp;
		}
	}

	return rotatedMatrix;
}

//rotates matrix -90 degrees
//run time is O(n^2)
public static int [][] rotateNeg90 (int [][] matrix){

	//first transpose matrix
	int [][] rotatedMatrix = transpose(matrix);

	//next reverse each column of the rotatedMatrix
	for (int i = 0; i < rotatedMatrix[0].length; ++i){
		for (int j = 0; j < rotatedMatrix.length/2; ++j){
			int temp = rotatedMatrix[j][i];
			rotatedMatrix[j][i] = rotatedMatrix[rotatedMatrix.length - 1 - j][i];
			rotatedMatrix[rotatedMatrix.length - 1 - j][i] = temp;
		}
	}

	return rotatedMatrix;
}
