package test;

import java.util.HashSet;
import java.util.Set;

public class Java {
    public static void main(String[] args) {
        hashSetTest();
//        注意char数组使用单引号连接的
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        charTest(s);
        System.out.println(s);

    }

    public static void hashSetTest() {
        HashSet set = new HashSet<>();
        set.add(1);
        System.out.println(set.add(2));

    }

    public static void stringTest() {
        String str = "abcde";
        str = str.trim();
        str = str.toUpperCase();
        str = str.substring(3, 4);
        System.out.println(str);
    }

    public static void charTest(char[] s) {
        for (int p1 = 0, p2 = s.length-1; p1 < p2; p1++, p2--) {
            char temp;
            temp = s[p1];
            s[p1] = s[p2];
            s[p2] = temp;
        }

    }

}
