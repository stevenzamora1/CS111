public class TwoSmallest {
    public static void main(String[] args) {

        // Makes small the first value in the array
        double small = Double.parseDouble(args[0]);

        // Makes small the smallest number in the array, if it isn't
        for (int i = 0; i < args.length; i++) {
            double num = Double.parseDouble(args[i]);
            if (num < small) {
                small = num;
            }
        }
        // Makes small2 the largest number in the array
        // because every other number will be lower than that
        double small2 = Double.MAX_VALUE;

        // Counter for how many times the smallest
        // number shows up
        int manyTimes = 0;

        // loop for too find the second lowest number
        // (If there is one)
        for (int i = 0; i < args.length; i++) {
            double num = Double.parseDouble(args[i]);

            // Everytime the smallest number shows up
            // it adds one to the counter
            if (num == small) {
                manyTimes++;
            }
            // Checks too see if the number at postion i
            // in the array is smaller than the current second smallest
            if (num <= small2) {

                // Checks too see if the number at positon i
                // does not already equal the smallest number
                if (num != small) {
                    small2 = num;

                }
            }
        }
        // If the counter is greater than one
        // that means the smallest number showed
        // up more than once
        if (manyTimes > 1) {
            small2 = small;

        }
        System.out.println(small);
        System.out.println(small2);
    }
}
