package com.layne.interview.util;

/**
 * 异常
 *
 * @author layne
 * @version UrlManage.java, v 0.1 2022/1/17 23:21 下午
 */
public class DigestUtil {

    static final char[] HEX_CHARS =
            { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g',
                    'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
                    'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
                    'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };


    public static String encodeHex(byte[] bytes) {
        char[] chars = new char[32];

        for(int i = 0; i < chars.length; i += 2) {
            byte b = bytes[i / 2];
            chars[i] = HEX_CHARS[b >>> 4 & 15];
            chars[i + 1] = HEX_CHARS[b & 15];
        }


        return String.valueOf(chars);
    }

//    public static String compressNumber(long number) {
//        char[] buf = new char[8];
//        int charPos = 8;
//        int radix = 1 << 6;
//        long mask = radix - 1;
//        do {
//            buf[--charPos] = digits[(int) (number & mask)];
//            number >>>= 6;
//        } while (number != 0);
//        return new String(buf);
//    }
}
