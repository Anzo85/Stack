package org.anzo.stack;

/**
 * Created by andreyz on 12.10.16.
 */
public class Main {

    public static void main(String[] args) {

        String s = "((({}()[])))";
        String s1 = "(({)})";
        String s2 = "{([])}";

        StringCheck check = new StringCheck();

        System.out.println(check.isVailid(s));
        System.out.println(check.isVailid(s1));
        System.out.println(check.isVailid(s2));


    }
}
