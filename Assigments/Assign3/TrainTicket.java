public class TrainTicket {
    public static void main(String[] args) {

        int age = Integer.parseInt(args[0]);
        boolean atStation = Boolean.parseBoolean(args[1]);
        double pay = 0.0;

        // Checks the illegl input
        if (age < 0 || age > 120) {
            System.out.println("Illegal input");
        }

        // Checks to see if the age is less than 7
        else if (age < 7) {
            System.out.println(pay);
        }

        // Checks too see if theyre at the station
        else if (atStation) {
            if (age > 65) {
                pay = 7.50;
                System.out.println(pay);
            } else {
                pay = 13.20;
                System.out.println(pay);
            }
        }

        // Checks too see if theyre not at the station
        // If not they pay an extra 20%
        else if (!atStation) {
            if (age > 65) {
                pay = 7.50 * 1.20;
                System.out.println(pay);
            } else {
                pay = 13.20 * 1.20;
                ;
                System.out.println(pay);
            }
        }

    }
}