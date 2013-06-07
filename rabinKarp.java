//returns true if a is substring of b, false otherwise
//runtime is O(n+m)
public boolean rabinKarp (String a, String b){

	//check for exceptions
	if (a == null && b == null){
		throw new IllegalArgumentException ("both inputs are null");
	} else if ( (a != null && b == null) || (a == null && b != null) ){
		return false;
	}
	
	//Create a hashMap object and hash string a
	HashMap<String, Boolean> hashMap = new HashMap<String, Boolean>();
	hashMap.put(a, true);
	
	//go through b using a sliding window of length a 
	//and see if the string captured by the sliding window equals a
	int firstIdx = 0;
	int lastIdx = firstIdx + a.length();
	while (lastIdx <= b.length()){
		String subB = b.substring(firstIdx, lastIdx);
		if (hashMap.containsKey(subB)){
			return true;
		}
		++firstIdx;
		++lastIdx;
	}
	
	return false;

}