//performs a binary search on a sorted array of comparable elements
//returns index of target element if found or -1 otherwise
public int binarySearch (E [] values, E target){
 
	//beg is the beginning index of the sub-array we are looking at
	int beg = 0;
	//high is the end index of the sub-array we're looking at
	int end = values.length;
	//mid is the middle element of the sub-array we're looking at
	int mid = (beg + end)/2;
 
	while (beg <= end) {
		//we proceed to compare target to mid
		if (values[mid].compareTo(target) < 0) {
			//target > values[mid]
			//look at upper half of array during next iteration
			beg = mid;
			mid = (beg + end)/2;
		} else if (values[mid].compareTo(target) > 0) {
			//target < values[mid]
			//look at lower half of array during next iteration
			end = mid;
			mid = (beg + end)/2;
		} else {
			return mid;
		}
	}
	//beg = end and element was not found. Hence, element was not in array
	return -1;
}