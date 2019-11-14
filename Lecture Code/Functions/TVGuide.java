public class TVGuide {

    public static void main(String[] args) {
    StdOut.print(" Enter the number of channels: ");
    int nbrChannels = StdIn.readInt();
    
    while (nbrChannels < 1) {
        StdOut.print("Enter a positive value");
        nbrChannels = StdIn.readInt();
        // makes sure there is no negatie number
    
    }
    String[] tvGuide = new String[nbrChannels];
    // store  a new array w channels numers
    // do while loop will keep looking while sumn doesnt occur
    boolean quit = false;
    
    do {
        StdOut.print("Option [1]- add channel, 2[]- exit");
        int option = StdIn.readInt();
        if (option == 1) {
        StdOur.print("enter channel number to add");
        int nbr = StdIn.readInt();
        StdOut.print("enter cjamme; name to add: ");
        String name = StdIn.readString();
    
    add(tvGuide, nbr, name);
    }
    else if (option == 2) {
    quite == true;
    }
    while (quit == false) {
    
    }
    }
    
    
    }

    public static void add (String[] guide, int channelNbr, String channelName) {
    if( channelNbr < guide.length && channelNbr >= ) {
    // channelNbr is withing the bounds of the array
    //add channel name to the index channel number
    guice[channerlNbr] = channelName; }
    
    
    
    }
}