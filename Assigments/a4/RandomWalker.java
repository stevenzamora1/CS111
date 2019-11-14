/*************************************************************************
 * Compilation: javac RandomWalker.java Execution: java RandomWalker 10
 *
 * @author:
 *
 *          The program RandomWalker that takes an int command-line argument n
 *          and simulates the motion of a random walk for n steps. Print the
 *          location at each step (including the starting point), treating the
 *          starting point as the origin (0, 0). Also, print the square of the
 *          final Euclidean distance from the origin.
 *
 *          % java RandomWalker 10 (0,0) (-1,0) (-1,-1) (-1,-2) (-1,-3) (-1,-4)
 *          (-1,-5) (0,-5) (-1,-5) (-2,-5) (-2,-4) Squared distance = 20.0
 *
 *************************************************************************/

public class RandomWalker {

    public static void main(String[] args) {

        int x = 0;

        int a = 0;
        int b = 0;

        while (x < 10) {
            System.out.println("( " + a + ", " + b + ")");
            x++;
            int c = (int) (Math.random() * 4);
            if (x == 10) {
                break;
            }
            if (c == 0) {
                a--;
            }
            if (c == 1) {
                a++;
            }
            if (c == 2) {
                b++;
            }
            if (c == 3) {
                b--;
            }
        }
        double d = (double) (a * a) + (double) (b * b);
        System.out.print("Squared distance =" + d);
    }
}
