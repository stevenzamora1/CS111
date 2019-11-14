/*************************************************************************
 * Compilation: javac RecursiveAppend.java Execution: java RecursiveAppend
 *
 * @author:
 *
 *************************************************************************/

public class RecursiveAppend {

    // Returns the original string appended to the original string n times
    public static String appendNTimes(String original, int n) {

        String output = "";
        if (n == 0) {
            return original;
        }

        output += original + appendNTimes(original, n - 1);
        return output;
    }

    public static void main(String[] args) {

        System.out.println(appendNTimes("catt", 2));
    }
}
