//reverses string in place
public String reverse (String s){
	//check for null input
	if (s == null)
	{
		throw new IllegalArgumentException ("String is null");
	}
	char [] sArray = s.toCharArray();
	//go from front and back of sArray, swapping characters
	//stop at middle character
	for (int i = 0; i < sArray.length/2; ++i){
		char temp = sArray[i];
		sArray[i] = sArray[s.length() - 1 - i];
		sArray[s.length() - 1 - i] = temp;
	}
	//construct string with the reversed characters of sArray
	return new String(sArray);
	//run time is O(n)
}