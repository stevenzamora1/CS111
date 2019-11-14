/*************************************************************************
 * Compilation: javac Sierpinski.java Execution: java Sierpinski
 *
 * @author:
 *
 *************************************************************************/

public class Sierpinski {

    // Height of an equilateral triangle whose sides are of the specified length.
    public static double height(double length) {

        return ((Math.sqrt(3)) / 2.0) * length;

    }

    // Draws a filled equilateral triangle whose bottom vertex is (x, y)
    // of the specified side length.
    public static void filledTriangle(double x, double y, double length) {
        double[] triX = { x, x - length / 2, x + length / 2 };
        double[] triY = { y, y + height(length), y + height(length) };

        StdDraw.filledPolygon(triX, triY);
    }

    // Draws a Sierpinski triangle of order n, such that the largest filled
    // triangle has bottom vertex (x, y) and sides of the specified length.
    public static void sierpinski(int n, double x, double y, double length) {

        if (n == 0) {
            return;
        }

        double x1 = x + length;
        double y1 = y;
        double x2 = x + length / 2;
        double y2 = y + height(length);

        // recursive calls
        sierpinski(n - 1, x, y, length / 2);
        sierpinski(n - 1, (x + x1) / 2, (y + y1) / 2, length / 2);
        sierpinski(n - 1, (x + x2) / 2, (y + y2) / 2, length / 2);
        filledTriangle((x + x1) / 2, y, length / 2);
    }


    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        StdDraw.line(0, 0, 1, 0);
        StdDraw.line(0, 0, .5, (Math.sqrt(3)) / 2);
        StdDraw.line(1, 0, .5, (Math.sqrt(3)) / 2);
        sierpinski(n, 0, 0, 1);

    }
}
