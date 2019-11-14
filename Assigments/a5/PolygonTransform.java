/*************************************************************************
 * Compilation: javac PolygonTransform.java Execution: java PolygonTransform
 *
 * @author:
 *
 *************************************************************************/

public class PolygonTransform {

    // Returns a new array that is an exact copy of the given array.
    // The given array is not mutated.
    public static double[] copy(double[] array) {
        int len = array.length;
        double[] newArray = new double[len];
        for (int i = 0; i < len; i++) {
            newArray[i] = array[i];
        }

        return newArray;
    }

    // Scales the given polygon by the factor alpha.
    public static void scale(double[] x, double[] y, double alpha) {
        int lenX = x.length;
        int lenY = y.length;
        for (int i = 0; i < lenX; i++) {
            x[i] = x[i] * alpha;
            y[i] = y[i] * alpha;
        }

    }

    // Translates the given polygon by (dx, dy).
    public static void translate(double[] x, double[] y, double dx, double dy) {

        int lenX = x.length;

        for (int i = 0; i < lenX; i++) {
            x[i] = x[i] + dx;
            y[i] = y[i] + dy;
        }
    }

    // Rotates the given polygon theta degrees counterclockwise, about the origin.
    public static void rotate(double[] x, double[] y, double theta) {

        int lenX = x.length;
        double b = Math.toRadians(theta);
        for (int i = 0; i < lenX; i++) {
            double oldX = x[i];
            double oldY = y[i];
            x[i] = oldX * Math.cos(b) - oldY * Math.sin(b);
            y[i] = oldX * Math.sin(b) + oldY * Math.cos(b);
        }

    }

    // Tests each of the API methods by directly calling them.
    public static void main(String[] args) {

        StdDraw.setScale(-5.0, +5.0);
        double[] x = { 0, 1, 1, 0 };
        double[] y = { 0, 0, 2, 1 };
        double dx = 2.0, dy = 1.0;
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.polygon(x, y);
        translate(x, y, dx, dy);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);
    }
}
