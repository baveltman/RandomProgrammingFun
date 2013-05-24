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