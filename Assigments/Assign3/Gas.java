public class Gas {
    public static void main(String[] args) {

        double pricePerGallon = Double.parseDouble(args[0]);
        double numOfGallons = Double.parseDouble(args[1]);
        boolean creditOrCash = Boolean.parseBoolean(args[2]);
        double total = pricePerGallon * numOfGallons;

        if (pricePerGallon <= 0 || numOfGallons <= 0) {
            System.out.println("Illegal input");
        }

        else if (creditOrCash) {
            System.out.println(total);
        }

        else if (!creditOrCash) {
            total = total * 1.10;
            System.out.println(total);
        }

    }
}