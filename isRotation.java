//decides if other string is a rotation of the original string
//run time is O(n^2)
public boolean isRotation (String original, String other){

	//check for exceptions
	if (original == null && other == null){
		throw new IllegalArgumentException ("both inputs are null");
	} else if ( (original != null && other == null) || (original == null && other != null) ){
		return false;
	}
	
	//convert both string to lower case
	original = original.toLowerCase();
	other = other.toLowerCase();
	
	//ensure that both strings are the same length
	if (original.length() != other.length()){
		return false;
	}

	//append other to itself and verify that original is a subString of other
	String rotation = other + other;
	boolean isRotation = isSubstring(original, rotation);

	return isRotation;
}

//returns true if a is substring of b, false otherwise
//runtime is O(n^2)
private boolean isSubstring (String a, String b){

	//check for exceptions
	if (a == null && b == null){
		throw new IllegalArgumentException ("both inputs are null");
	} else if ( (a != null && b == null) || (a == null && b != null) ){
		return false;
	}
	
	//ensure that a is small enough to be a substring of b
	if ( (a.length() > b.length()) || a.equals("") && !b.equals("") ){
		return false;
	} 
	
	//check if a and b are equal
	if (a.equals(b)){
		return true;
	}
	
	//traverse b once and look for substring a
	for (int i = 0; i < b.length(); ++i){
		if (b.charAt(i) == a.charAt(0)){
			int idxAta = 1;
			int idxAtb = i + 1;
			boolean isSubstring = true;
			substringLoop: for (int j = 0; j < a.length() - 1 && idxAta < a.length() && idxAtb < b.length(); ++j){
				if (b.charAt(idxAtb) != a.charAt(idxAta)){
					isSubstring = false;
					break substringLoop;
				}
				++idxAta;
				++idxAtb;
			}
			
			if (isSubstring){
				return true;
			}
		}
	}
	return false;
}