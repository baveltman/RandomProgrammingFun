//checks if a string is a palindrome
static boolean isPalindrome (String s) {
   //avoid errors due to case
   s = s.toLowerCase();
   int length = s.length()/2;
   //go from both ends of string until you meet in middle
   for (int i = 0; i < length; ++i){
	if (s.charAt(i) != s.charAt(s.length() - 1 - i)){
		return false;
	}
   }
 
   return true;
   //run time is O(n/2)
}
 
//finds the biggest palindrome in a string
static String biggestPalindrome (String s){
   if (s.length() == 0){
	return "";
   }
 
   String substring = s;
   boolean found = false;
   //max dist tells us how many chars from end were not looking at with the sliding window when we begins at char 0
   int maxDist = 0;
   //dist from char 0
   int dist = 0;
   //dist from char s.length() - 1
   int dist2 = maxDist;
 
   while (maxDist != s.length()){
	substring = s.substring(0 + dist, s.length() - dist2);
	found = isPalindrome(substring);
	if (found){
		return substring;
	}
	//reached end of current sliding window. Make next sliding window smaller
	if (dist + 1 > maxDist){
		++maxDist;
		dist = 0;
		dist2 = maxDist;
	}
	//move sliding window forward
	else {
		++dist;
		--dist2;
	}
   }
 
   //at this point the sliding window is a single char, and we are assuming a single char is a palindrome of itself
   return "" + s.charAt(0) + "";
   //run time is O(n) + 2O(n-1) + 3O(n-2) ... + (n-1)O(2) which is roughly O(n^2) as were adding O(n) n-1 times
}