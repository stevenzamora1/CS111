public class WCS111FM {
    public static void main(String[] args) {
        int hours = Integer.parseInt(args[0]);

        if (hours == 0) {
            System.out.println("Nothing");
        }

        if (hours >= 1 && hours <= 5) {
            System.out.println("T-shirt");
        }

        if (hours >= 6 && hours <= 400) {

            if (hours % 10 == 9) {
                System.out.println("Laptop");
            }

            if (hours % 2 == 0) {
                System.out.println("Hat");
            }

            if (hours % 3 == 0) {
                System.out.print("TV");
            }

        }
        if (hours > 400) {
            System.out.print("Cat");
        }

    }
}