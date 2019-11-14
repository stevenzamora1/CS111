public class shiftLeft {
    public static void main(String[] args) {
        int[] arry = { 4, 7, 9, 13 };

        int le = arry.length;
        int b = arry[0];

        for (int i = 0; i <= le - 2; i++) {
            arry[i] = arry[i + 1];
        }
        arry[le - 1] = b;

        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i]);
        }

    }
}