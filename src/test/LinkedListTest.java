package test;

import linear.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<>();

        obj.insert("张三");
        obj.insert("李四");
        obj.insert("王五");

        // test the number of insert
        System.out.println(obj.length());

        // test the method of get()
        System.out.println("=================");
        for (int i = 0; i < obj.length(); i++) {
            System.out.println(obj.get(i));
        }

        // test the method of insert to specific location
        obj.insert("张三1",1);
        obj.insert("李四0",0);
        obj.insert("王五2",2);
        System.out.println(obj.length());

        System.out.println("=================");
        for (int i = 0; i < obj.length(); i++) {
            System.out.println(obj.get(i));
        }

        // test the remove method
        System.out.println("=================");
        String delete = obj.remove(0);
        System.out.println(delete);
        System.out.println("=================");

        for (int i = 0; i < obj.length(); i++) {
            System.out.println(obj.get(i));
        }

        // test the method of finding the matched index
        System.out.println("=================");
//        int indexOf = obj.indexOf("张三");
        int indexOf = obj.indexOf("王五");
        System.out.println(indexOf);

        // test the implement of Iterable & Iterator 增强for循环
        System.out.println("=================");
        System.out.println("test the implement methods");
        for (String s : obj) {
            System.out.println(s);
        }

    }
}
