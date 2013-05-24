//kick off method for mergeSort recursion
public void mergeSort (int [] values) {
	mergeSortHelper(values, 0, values.length);
}
 
//sorts elements of an array of ints using mergeSort routine
private void mergeSortHelper (int [] values, int firstIndex, int size){
	//we recurse using the mergeSort routine until we get an array size of 1
	if (size > 1){
		//sizes of the left and right halves of the array to be recursed on
		int leftHalf = size/2;
		int rightHalf = size - leftHalf;
 
		//run mergeSort recursively on both halves
		mergeSortHelper(values, firstIndex, leftHalf);
		mergeSortHelper(values, firstIndex + leftHalf, rightHalf);
 
		//merge the two sorted halves
		merge(values, firstIndex, leftHalf, rightHalf);
	}
}
 
//merges two sorted arrays in place
private void merge (int [] values, int firstIndex, int leftHalf, int rightHalf){
	int i = firstIndex;
	int j = firstIndex + leftHalf;
 
	//create temporary array into which merging will occur
	int [] tempData = new int [leftHalf + rightHalf];
	//position in tempData
	int position = 0;
 
	//merge until one of the halves is fully in tempData
	while (i < firstIndex + leftHalf && j < firstIndex + leftHalf + rightHalf){
		if (values[i] <= values[j]){
			tempData[position++] = values[i++];
		} else {
			tempData[position++] = values[j++];
		}
	}
 
	//check which half has not been fully merged
	//merge the remainder of this half into tempData
	while (i < firstIndex + leftHalf) {
		tempData[position++] = values[i++];
	}
	while (j < firstIndex + leftHalf + rightHalf){
		tempData[position++] = values[j++];
	}
 
	//copy merged tempData into original array values
	position = 0;
	for (int k = firstIndex; k < firstIndex + leftHalf + rightHalf; ++k){
		values[k] = tempData[position++]; 
	}
}