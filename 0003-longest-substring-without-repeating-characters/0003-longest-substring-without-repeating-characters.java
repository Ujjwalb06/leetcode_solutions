class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low = 0;
        int res = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        for(int high=0;high<s.length();high++){
            char rightchar = s.charAt(high);
            map.put(rightchar,map.getOrDefault(rightchar,0)+1);

            while(map.get(rightchar) > 1){
                char leftchar = s.charAt(low);
                map.put(leftchar,map.get(leftchar)-1);
                low++;
            }
            int length = high-low+1;
            res = Math.max(res,length);
        }
        return res;
    }
}