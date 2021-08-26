package sliding_window;

import java.util.HashMap;

public class MinWindow {

    public String minWindow(String s, String t) {
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        char[] chart = t.toCharArray();
        char[] chars = s.toCharArray();
        for (char key : chart) {
            need.put(key, need.getOrDefault(key, 0) + 1);
        }

        int left = 0, right = 0, valid = 0;

        // 记录最小覆盖子串的起始索引和长度
        int start = 0, len = Integer.MAX_VALUE;

        while (right < s.length()) {
            // c 是将移入窗口的字符
            char c = chars[right];
            // 窗口向右移动
            right++;
            // 进行窗口内数据的一系列更新
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).intValue() == need.get(c).intValue()) {
                    valid++;
                }
            }
            while (valid == need.size()) {
                // 在这里更新最小覆盖最小子串
                if (right - left < len) {
                    start = left;
                    len = right - left;
                }

                // d 是即将移除窗口的字符
                char d = chars[left];
                left++;
                if (need.containsKey(d)) {
                    if (window.get(d).intValue() == need.get(d).intValue()) {
                        valid--;
                    }
                    window.put(d, window.getOrDefault(d, 0) - 1);

                }

            }

        }
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }

}
