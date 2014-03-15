package org.br.ja.recursion;

/**
 * User: Bryan
 * Date: 3/14/14
 * Time: 3:37 PM
 */
public class StringReverser {

    public static void main(String[] args) {

        // uglyReverse
        String hello = "bryan";
        System.out.println(uglyReverse(hello, new StringBuilder(), hello.length() - 1));

        // eloquentReverse
        System.out.println(eloquentReverse(hello));


        // loopReverse
        System.out.println(loopReverse(hello));


    }

    public static String uglyReverse(String toReverse, StringBuilder sb, int index){
        if(index <= -1){
            return sb.toString();
        }

        sb.append(toReverse.charAt(index));
        index--;
        return uglyReverse(toReverse, sb, index);
    }

    public static String eloquentReverse(String toReverse) {
        if ((null == toReverse) || (toReverse.length()  <= 1)) {
            return toReverse;
        }
        return eloquentReverse(toReverse.substring(1)) + toReverse.charAt(0);
    }

    public static String loopReverse(String toReverse){
        StringBuilder sb = new StringBuilder();

        for(int i = toReverse.length() - 1; i >= 0; i--) {
            sb.append(toReverse.charAt(i));
        }

        return sb.toString();

    }
}
