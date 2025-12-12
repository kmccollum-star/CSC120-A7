/* This is a stub for the Cafe class */
public class Cafe extends Building implements CafeRequirements{

    /*Class attributes */
    int size;
    int nSugarPackets;
    int nCreams;
    int nCups;

    /**
     * Constructor
     * @param name
     * @param address
     * @param nFloors
     * @param size
     * @param nSugarPackets
     * @param nCreams
     * @param nCups
     */
    public Cafe(String name, String address, int nFloors, int size, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.size = size;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }
    
    /**
     * Resets values to appropriate values after selling coffee
     * @param size
     * @param nSugarPackets
     * @param nCreams
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        this.size -= size; 
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;

        if(this.size < size || this.nSugarPackets < nSugarPackets || this.nCreams < nCreams){
            restock();
        }
    }

    /**
     * restocks values when supplies are out
     * @param size
     * @param nSugarPackets
     * @param nCreams
     */
    private void restock(){
        this.size = 70;
        this.nSugarPackets = 70;
        this.nCreams = 70;
    }
    /* Main method for testing */
    public static void main(String[] args) {
        Cafe cafe = new Cafe("Cafe", "1010 Noho, MA", 3, 30, 30, 30, 30);
        cafe.sellCoffee(5,4,3);
        System.out.println(cafe.size);
        System.out.println(cafe.nSugarPackets);
        System.out.println(cafe.nCreams);
        cafe.restock();
        System.out.println(cafe.size + " " + cafe.nCreams + " " + cafe.nCups + " " + cafe.nSugarPackets);
    }
}
