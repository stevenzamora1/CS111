public class Recur {
    public static void main(String[] args) {
        System.out.println(Bunny(3));

    }

    public static boolean(int[] n) {
        if (n == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return Bunny(n - 1) + 2;
        } else
            return Bunny(n - 1) + 3;
    }

}