//replaces all spaces in a String with String replacement
//run time is O(n)
static String replaceAllChars (String original, char charToReplace, String replacement){

	//ensure original String isn't null
	if (original == null){
		throw new IllegalArgumentException ("String is null");
	}

	//result stores the result String returned when the algorithm terminates
	String result = "";

	for (int i = 0; i < original.length(); ++i){
		//if character at i isn't space append character at i
		if (original.charAt(i) != charToReplace){
			result = result + original.charAt(i);
		} else {
			//append replacement
			result = result + replacement;
		}
	}
	
	//algorithm requires only one pass through the String so run time is O(n)
	return result;
}