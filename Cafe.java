/* This is a stub for the Cafe class */
public class Cafe extends Building{

    /*Class attributes */
    int nCoffeeOunces;
    int nSugarPackets;
    int nCreams;
    int nCups;

    /**
     * Constructor
     * @param name
     * @param address
     * @param nFloors
     * @param nCoffeeOunces
     * @param nSugarPackets
     * @param nCreams
     * @param nCups
     */
    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }
    
    /**
     * Resets values to appropriate values after selling coffee
     * @param nCoffeeOunces
     * @param nSugarPackets
     * @param nCreams
     */
    private void sellCoffee(int nCoffeeOunces, int nSugarPackets, int nCreams){
        this.nCoffeeOunces -= nCoffeeOunces; 
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;

        if(this.nCoffeeOunces < nCoffeeOunces || this.nSugarPackets < nSugarPackets || this.nCreams < nCreams){
            restock(nCoffeeOunces, nSugarPackets, nCreams, nCups);
        }
    }

    /**
     * restocks values when supplies are out
     * @param nCoffeeOunces
     * @param nSugarPackets
     * @param nCreams
     * @param nCups
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces = 50;
        this.nSugarPackets = 50;
        this.nCreams = 50;
        this.nCups = 50;
    }
    /* Main method for testing */
    public static void main(String[] args) {
        Cafe cafe = new Cafe("Cafe", "1010 Noho, MA", 3, 20, 13, 7, 15);
        cafe.sellCoffee(5,4,3);
    }
}
