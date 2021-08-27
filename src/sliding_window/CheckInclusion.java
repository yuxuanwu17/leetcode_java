package sliding_window;

import java.util.HashMap;

public class CheckInclusion {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        char[] charS1 = s1.toCharArray();
        char[] charS2 = s2.toCharArray();

        // 将需要的存进hashmap中去
        for (char key : charS1) {
            need.put(key, need.getOrDefault(key, 0) + 1);
        }

        int left = 0, right = 0, valid = 0;
        while (right < s2.length()) {
            char c = charS2[right];
            right++;
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c))) {
                    valid++;
                }
            }

            System.out.println("window:"+left+"->"+right);
            System.out.println("window is: "+window.toString());
            System.out.println("need is: "+need.toString());
            System.out.println("====================================\n");


            while (right - left >= s1.length()) {
                if (valid == need.size()) {
                    return true;
                }
                char d = charS2[left];
                left++;
                if (need.containsKey(d)) {
                    if (window.get(d).intValue() == need.get(d).intValue()) {
                        valid--;
                    }
                    window.put(d, window.getOrDefault(d, 0) - 1);
                }

            }
        }
        return false;
    }
}
