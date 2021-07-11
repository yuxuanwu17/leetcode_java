package test;

import java.util.HashSet;
import java.util.Set;

public class Java {
    public static void main(String[] args) {
        hashSetTest();

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

}
