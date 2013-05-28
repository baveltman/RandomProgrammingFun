//searches the matrix for a word
	//returns true if word is found in left, right, up or down direction
	//returns false otherwise
	public boolean findWordInMatrix (char [][] matrix, String word){
		//traverse matrix to find first char of word
		for (int i = 0; i < matrix.length; ++i){
			for (int j = 0; j < matrix[i].length; ++j){
				//found first character of word, now go in left, right, up and down directions 
				if (matrix[i][j] == word.charAt(0)){
					boolean isWordFound = searchForWordInAllDirections (matrix, word, i, j);
					if (isWordFound){
						//if word has been found return true
						//else continue search until entire matrix has been traversed
						return true;
					}
				}
			}
		}
		return false;
	}

	//searches for a word in left, right, up and down directions given a matrix of chars
	//and a location for the first character of the word
	//returns true if word is found in any direction, false otherwise
	//runtime is O(n), as we search a maximum of n characters in each of 4 directions
	private boolean searchForWordInAllDirections(char [][] matrix, String word, int x, int y){
		//search left
		boolean foundLeft = true;
		int countLeft = 0;
		for (int i = 0; i < word.length() && y - i >= 0; ++i){
			if (matrix[x][y - i] != word.charAt(i)){
				foundLeft = false;
			}
			++countLeft;
		}
		if (foundLeft && countLeft < word.length()){
			foundLeft = false;
		}

		//search right
		boolean foundRight = true;
		int countRight = 0;
		for (int i = 0; i < word.length() && y + i < matrix[0].length; ++i){
			if (matrix[x][y + i] != word.charAt(i)){
				foundRight = false;
			}
			++countRight;
		}
		if (foundRight && countRight < word.length()){
			foundRight = false;
		}

		//search up
		boolean foundUp = true;
		int countUp = 0;
		for (int i = 0; i < word.length() && x - i >= 0; ++i){
			if (matrix[x - i][y] != word.charAt(i)){
				foundUp = false;
			}
			++countUp;
		}
		if (foundUp && countUp < word.length()){
			foundUp = false;
		}

		//search down
		boolean foundDown = true;
		int countDown = 0;
		for (int i = 0; i < word.length() && x + i < matrix.length; ++i){
			if (matrix[x + i][y] != word.charAt(i)){
				foundDown = false;
			}
			++countDown;
		}
		if (foundDown && countDown < word.length()){
			foundDown = false;
		}
		//return result of search in all directions
		return (foundLeft || foundRight || foundUp || foundDown);
	}