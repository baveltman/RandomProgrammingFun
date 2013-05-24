//prints all permutations of a given string
static void printPermutations (String s){
   //we convert the string to a char array in order to manipulate it more easily
   //we will now proceed to reorder the elements in the array
   //until all permutations have been obtained
   char [] charArray = s.toCharArray();
   printPermutationsHelper(charArray, 0);
}
 
static void printPermutationsHelper (char [] s, int index) {
   if (index == s.length - 1){
	System.out.println(Arrays.toString(s));
   } else {
	for (int i = index; i &lt; s.length; ++i){
		char currentChar = s[i];
		s[i] = s[index];
		s[index] = currentChar;
		printPermutationsHelper (s, index + 1);
		s[index] = s[i];
		s[i] = currentChar;
	}
   }
}