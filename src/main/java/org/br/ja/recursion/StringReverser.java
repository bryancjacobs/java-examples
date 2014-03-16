package org.br.ja.recursion;

/**
 * User: Bryan
 * Date: 3/14/14
 * Time: 3:37 PM
 */
public class StringReverser {

    public static void main(String[] args) {

        // uglyReverse
        String value = "bryan";
        System.out.println(uglyReverse(value, new StringBuilder(), value.length() - 1));

        // eloquentReverse
        System.out.println(eloquentReverse(value));


        // loopReverse
        System.out.println(loopReverse(value));


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
        if (toReverse == null  || toReverse.length()  <= 1) {
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
