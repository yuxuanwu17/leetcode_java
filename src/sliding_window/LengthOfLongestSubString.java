package sliding_window;

import java.util.HashMap;

public class LengthOfLongestSubString {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> window = new HashMap<>();

        int left = 0, right = 0, res = 0;

        while(right<s.length()){
            char c = s.toCharArray()[right];
            right++;
            window.put(c,window.getOrDefault(c,0)+1);

            while(window.get(c).intValue()>1){
                char d = s.toCharArray()[left];
                left++;
                window.put(d,window.getOrDefault(d,0)-1);
            }

            res = Math.max(res, right-left);


        }
        return res;

    }
}
