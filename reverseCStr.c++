//reverses C String in place
//run time is O(n)
void reverseCStr (char *str){
    //ensure that string isn't null
    if (str){
        //find end of C String
        char *endOfStr = str;
        while (*endOfStr){
            ++endOfStr;
        }
        //note at the end of str there is a null character, so we go back one char
        --endOfStr;
        //now we are ready to reverse the C String
        while (endOfStr > str){
            //swap characters in place
            char temp = *str;
            *str = *endOfStr;
            *endOfStr = temp;
            //shift pointers to next two characters to be swapped
            --endOfStr;
            ++str;
        }
    }  
}