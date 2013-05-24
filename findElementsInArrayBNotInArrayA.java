//finds which numbers are in array b and not in array a
static void findNumsNotInArray (int [] a, int [] b){
   HashMap <Integer, Boolean> hashMap = new HashMap <Integer, Boolean> ();
 
   //go through a and hash all of its elements
   for (int i = 0; i < a.length; ++i){
	if (!hashMap.containsKey(a[i])){
		hashMap.put(a[i], true);
	}
   }
 
   //go thorough b and print all nums that are not hashed in hashMap
   for (int j = 0; j < b.length; ++j){
	if (!hashMap.containsKey(b[j])){
		System.out.println(b[j]);
	}
   }
   //run time is O(n + m) where n is length a and m is length b
}