//returns the length of the longest contiguous section of this list 
//that is sorted in ascending order. This list is not altered as a result of the method call
public static int maxSortedLength(List<Integer> list) { 
	//stores length of longest ascending section in list
	int maxLength = 0;
	//check corner cases
	if (list == null || list.size() == 0){
		return maxLength;
	} else if (list.size() == 1) {
		return ++maxLength;
	}
	
	int currentLength = 1;
	
	//traverse list and find largest ascending section in one pass
	for (int i = 0; i < list.size(); ++i){
		if (i + 1 < list.size() && list.get(i) <= list.get(i + 1)){
			++currentLength;
		} else if (i + 1 < list.size() && list.get(i) > list.get(i + 1)) {
			if (currentLength > maxLength){
				maxLength = currentLength;
			}
			currentLength = 1;
		}
		
		if (currentLength > maxLength){
			maxLength = currentLength;
		}
	}
	
	//complexity of algorithm is O(n)
	return maxLength;
}