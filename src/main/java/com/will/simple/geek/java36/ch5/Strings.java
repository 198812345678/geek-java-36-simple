package com.will.simple.geek.java36.ch5;

public class Strings {

    public void sameObj() {
        String s1 = new String("ab");
        String s2 = new String("ab");
        String s3 = "ab";
        String s4 = "a" + "b";//编译器优化为"ab"
        String s5 = "" + "ab";//编译器优化为"ab"

        StringBuilder sb = new StringBuilder();
        sb.append("a").append("b");

        String s6 = "";//编译器不会优化
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                s6 = s6 + "a";
            } else {
                s6 = s6 + "b";
            }
        }

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1 == s5);

        System.out.println(s2 == s3);
        System.out.println(s2 == s4);
        System.out.println(s2 == s5);

        System.out.println(s3 == s4);
        System.out.println(s3 == s5);

        System.out.println(s4 == s5);

        System.out.println(s4 == sb.toString());
        System.out.println(s4 == s6.toString());

    }
}
