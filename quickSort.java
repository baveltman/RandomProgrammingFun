//kick off method to the quickSort recursion
public void quickSort (E [] values){
	quickSortHelper (values, 0, values.length - 1);
}
 
//sorts an array of comparable values
public void quickSortHelper (E [] values, int left, int right){
	//partition over current pivot and return index to facilitate next two partitions
	int indexOfPartition = partitionValues (values, left, right);
	//should we quickSort to left of pivot
	if (left < indexOfPartition - 1) {
		quickSortHelper (values, left, indexOfPartition - 1);
	}
	//should we quickSort to right of pivot
	if (indexOfPartition < right) {
		quickSortHelper (values, indexOfPartition, right);
	}
 
}
 
//partitions values across a pivot such that
//all values < pivot end up left of pivot
//and all values > pivot end right of pivot
private int partitionValues (E [] values, int left, int right){
 
	//get the pivot value
	E pivot = values[ (left + right)/2 ];
 
	//go through values from both sides of the pivot
	while (left <= right){
		//ignore values to left of pivot that are < pivot
		while (values[left].compareTo(pivot) < 0){
			++left;
		}
		//ignore values to right of pivot that are > pivot
		while (values[right].compareTo(pivot) > 0){
			--right;
		}
		//found two values that need swapping. swap them if left <= right
		if (left <= right){
			E temp = values[left];
			values[left] = values[right];
			values[right] = temp;
			++left;
			--right;
		}
	}
 
	//return new index of partition for further recursive steps
	return left;
}