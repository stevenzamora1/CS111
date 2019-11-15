/*************************************************************************
 * Compilation: javac RunLengthEncoding.java Execution: java RunLengthEncoding
 *
 * @author:
 *
 *************************************************************************/

public class RunLengthEncoding {

    /*
     * Encode the original string by finding sequences in the string where the same
     * character repeats. Replace each such sequence by a token consisting of: the
     * number of characters in the sequence followed by the repeating character.
     * Return the encoded string.
     */
    public static String encode(String original) {

        String output = "";

        for (int i = 0; i < original.length(); i++) {
            if (i == original.length() - 1) {
                output += original.charAt(i);
            }
            if (i + 1 == original.length()) {
                break;
            }

            if (original.charAt(i) != original.charAt(i + 1)) {
                output += original.charAt(i);
            }

            if (original.charAt(i) == original.charAt(i + 1)) {

                int num = 1;
                for (int c = i; c < original.length(); c++) {
                    if (c + 1 == original.length()) {
                        output += num;
                        output += original.charAt(i);
                        i = c;
                        break;
                    }
                    if (original.charAt(c) == (original.charAt(c + 1))) {
                        num++;
                    } else {
                        output += num;
                        output += original.charAt(i);
                        i = c;
                        break;
                    }
                }
            }
        }
        return output;
    }

    /*
     * Decodes the original string encoded with the encode method. Returns the
     * decoded string.
     *
     * YOUR decode METHOD MUST BE RECURSIVE, do not use while, do/while, or for
     * loops
     */
    public static String decode(String original) {
        String output = "";

        if (original.length() == 0) {
            return "";
        }
        char ch = original.charAt(0);
        if (Character.isDigit(ch)) {
            int x = ch - '0';
            x--;
            String newOG = x + original.substring(1);
            if (x != 0) {
                output += original.substring(1, 2);
                return output + decode(newOG);
            } else
                return output += decode(original.substring(1));
        } else
            return output += original.substring(0, 1) + decode(original.substring(1));

    }

    public static void main(String[] args) {
        String var = "qwwwwwwwwweeeeerrtyyyyyqqqqwEErTTT";
        String enVar = encode(var);
        String deVar = decode(enVar);
        System.out.println("orginal is " + var);
        System.out.println("Encoded is " + enVar);
        System.out.println("Decoded is " + deVar);
    }
}
