//checks if two strings are anagrams
//run time is O(n)
static boolean isAnagram (String a, String b){
	//for the two strings to be anagrams they must be of the same length
	if (a.length() != b.length()){
		return false;
	}
	
	//we use two hashMap object to store the count of characters in each a and b
	//if a and b are anagrams they will have the same count for each of their characters
	HashMap <Character, Integer> hashMapA = new HashMap <Character, Integer> ();
	HashMap <Character, Integer> hashMapB = new HashMap <Character, Integer> ();
	
	//traverse both string simultaneously
	for (int i = 0; i < a.length(); ++i){
		if (!hashMapA.containsKey(a.charAt(i))){
			hashMapA.put(a.charAt(i), 1);
		} else {
			int count = hashMapA.get(a.charAt(i));
			hashMapA.put(a.charAt(i), ++count);
		}
		
		if (!hashMapB.containsKey(b.charAt(i))){
			hashMapB.put(b.charAt(i), 1);
		} else {
			int count = hashMapB.get(b.charAt(i));
			hashMapB.put(b.charAt(i), ++count);
		}
	}
	
	//now go through string a and ensure string b has the same characters with the same count
	for (int i = 0; i < a.length(); ++i){
		if (!hashMapB.containsKey(a.charAt(i))){
			return false;
		} else if (hashMapA.get(a.charAt(i)) != hashMapB.get(a.charAt(i))){
			return false;
		}
	}
	
	//string b contains all characters of a with the same count
	return true;
}