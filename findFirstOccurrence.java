//performs a binary search on a sorted array of comparable elements
//returns index of target element if found or -1 otherwise
public int findFirstOccurrence (int [] values, int target){

	//beg is the beginning index of the sub-array we are looking at
	int beg = 0;
	//high is the end index of the sub-array we're looking at
	int end = values.length - 1;
	//mid is the middle element of the sub-array we're looking at
	int mid = (beg + end)/2;

	while (beg <= end) {
		//we proceed to compare target to mid
		if (values[mid] < target) {
			beg = mid + 1;
			mid = (beg + end)/2;
		} else if (values[mid] > target) {
			end = mid - 1;
			mid = (beg + end)/2;
		} else {
			//value at mid == target
			//go backwards and find first occurrence of target
			int targetIdx = mid;
			while (targetIdx - 1 >= 0 && target == values[targetIdx - 1]){
				--targetIdx;
			}
			return targetIdx;
		}
	}
	//beg = end and target was not found. Hence, target was not in array
	return -1;
}