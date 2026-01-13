public class Challenge2_StringArrays {

    /**
     * Method 1: Find the longest string in an array and return it REVERSED
     * <p>
     * REQUIREMENTS:
     * 1. Find the longest string in the array
     * 2. Reverse the longest string before returning it
     * 3. If there are multiple strings with the same max length, use the first one
     * 4. Return empty string if array is empty or null
     *
     * @param words The array of strings
     * @return The longest string REVERSED, or empty string if array is empty
     * <p>
     * EXAMPLES:
     * Input: ["cat", "elephant", "dog", "butterfly"]
     * Longest: "butterfly" (9 characters)
     * Reversed: "ylfrettub"
     * Output: "ylfrettub"
     * <p>
     * Input: ["apple", "mango"]
     * Both have 5 characters, use first: "apple"
     * Reversed: "elppa"
     * Output: "elppa"
     * <p>
     * Input: ["a", "ab", "abc", "ab"]
     * Longest: "abc"
     * Reversed: "cba"
     * Output: "cba"
     * <p>
     * Input: []
     * Output: ""
     * <p>
     * Input: ["hello"]
     * Reversed: "olleh"
     * Output: "olleh"
     * <p>
     * Input: ["radar"]
     * Reversed: "radar" (palindrome)
     * Output: "radar"
     */
    public String findLongestString(String[] words) {
        if(words.length == 0){
            return "";
        }
         String maxl="";
        for(int i=0; i<words.length; i++){
            if(words[i].length() > maxl.length()){
                maxl = words[i];
            }
        }
        StringBuilder sb = new StringBuilder(maxl);
        sb.reverse();
        return sb.toString();
    }
}