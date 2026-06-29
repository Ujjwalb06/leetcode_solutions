import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        Arrays.sort(strs); // sort strings

        String str1 = strs[0];
        String str2 = strs[strs.length - 1];
        int index = 0;

        // compare characters safely within bounds
        while (index < str1.length() && index < str2.length()) {
            if (str1.charAt(index) == str2.charAt(index)) {
                index++;
            } else {
                break;
            }
        }

        // return common prefix
        return str1.substring(0, index);
    }
}
