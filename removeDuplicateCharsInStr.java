

//removes all duplicate characters in str
//runtime is o(n)
static String removeDuplicates (String str){
    
    //ensure str isn't null
    if (str == null){
        throw new IllegalArgumentException ("String is null");
    }
    
    //create hashMap to ascertain whether duplicates exist in constant amortized time
    HashMap <Character, Integer> hashMap = new HashMap <Character, Integer> ();
    
    //traverse str and update hashMap
    for (int i = 0; i < str.length(); ++i){
        if (!hashMap.containsKey(str.charAt(i))){
            hashMap.put(str.charAt(i), 1);
        } else {
            int count = hashMap.get(str.charAt(i));
            hashMap.put(str.charAt(i), ++count);
        }
    }
    
    //go through str once again and remove all characters whose hashMap value is > 1
    String newStr = "";
    for (int i = 0; i < str.length(); ++i){
        if (hashMap.get(str.charAt(i)) == 1){
            newStr = newStr + str.charAt(i);
        }
    }
    
    return newStr;
}