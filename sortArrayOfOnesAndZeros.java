//sorts an array of 1's and 0's such that all the 0's are on the left and all of the 1's are on the right
public static void sortArrayOfOnesAndZeros (int [] a){
	//check for exceptions
	if (a == null)
	{
		throw new IllegalArgumentException ("node is null");
	}
	
	int indexFromLeft = 0;
	int indexFromRight = a.length - 1;
	//go through array from front and back simultaneously, swapping 1's and 0's
	while (indexFromLeft < indexFromRight){
		if (a[indexFromLeft] == 1){
			if (a[indexFromRight] == 0){
				//swap 1 on left with 0 from right
				int temp = a[indexFromLeft];
				a[indexFromLeft] = a[indexFromRight];
				a[indexFromRight] = temp;
			}
			--indexFromRight;
		} else {
			++indexFromLeft;
		}
	}
	//solution is O(n) in time and O(1) in space
}