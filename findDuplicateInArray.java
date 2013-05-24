//finds the first duplicate in an array of ints using hashMap object
static int findDuplicate (int [] a){
   HashMap &lt;Integer, Boolean&gt; hashMap = new HashMap &lt;Integer, Boolean&gt; ();
 
   //go through a and designate found in hashMap. If already found return the duplicate
   for (int i = 0; i &lt; a.length; ++i){
	if (hashMap.containsKey(a[i])){
		return a[i];
	}
	else {
		hashMap.put(a[i], true);
	}
   }
 
   //no duplicates found
   return -1;
   //run time is O(n), we at most pass through a once
}