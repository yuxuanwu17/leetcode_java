package tree;

import java.util.*;

public class OpenLock {
    public int openLock(String[] deadends, String target) {
        // record the passport need to past
        Set<String> deads = new HashSet<>();

        // iteration to add all the deadends to the hashset
        deads.addAll(Arrays.asList(deadends));

        Set<String> visited = new HashSet<>();

        // core data structure of the BFS
        Queue<String> q = new LinkedList<>();

        int step = 0;
        q.offer("0000");
        visited.add("0000");

        while (!q.isEmpty()) {
            int sz = q.size();
            for (int i = 0; i < sz; i++) {
                String cur = q.poll();
                if (deads.contains(cur)) {
                    continue;
                }
                if (cur.equals(target)) {
                    return step;
                }

                // 将一个节点的未遍历的相邻节点假如队列

                for (int j = 0; j < 4; j++) {
                    String up = plusOne(cur, j);
                    if (!visited.contains(up)) {
                        q.offer(up);
                        visited.add(up);
                    }
                    String down = minusOne(cur, j);
                    if(visited.contains(down)){
                        q.offer(down);
                        visited.add(down);
                    }
                }
            }
            return step;
        }
        // if we still could not find the target number, then the answer would be none.
        return -1;
    }

    public String plusOne(String s, int j) {
        char[] ch = s.toCharArray();
        if (ch[j] == '9') {
            ch[j] = '0';
        } else {
            ch[j] -= 1;
        }
        return new String(ch);
    }

    public String minusOne(String s, int j) {
        char[] ch = s.toCharArray();
        if (ch[j] == '0') {
            ch[j] = '9';
        } else {
            ch[j] += 1;
        }
        return new String(ch);
    }
}
