/* This is a stub for the Library class */
import java.util.Enumeration;
import java.util.Hashtable;

public class Library extends Building{
  /**
   * Class attributes
   */
    private Hashtable<String, Boolean> collection;
    
    /**
     * Constructor
     * @param name
     * @param address
     * @param nFloors
     */
    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);

      this.collection = new Hashtable<String, Boolean>();

      System.out.println("You have built a library: 📖");
    }

    /**
     * adds a book to the library
     * @param title
     */
    public void addTitle(String title){
      collection.put(title, false);
    }

    /**
     * removes a title from the library
     * @param title
     * @return String of the title of the book that was removed
     */
    public String removeTitle(String title){
      collection.remove(title);
      return title;
    }

    /**
     * Changes the checkout status of a book from false to true
     * @param title
     */
    public void checkout(String title){
      collection.replace(title, false, true);
    }
  
    /**
     * Changes the checkout status of a book from true to false
     * @param title
     */
    public void returnBook(String title){
      collection.replace(title, true, false);
    }

    /**
     * checks if the library has a certain book title
     * @param title
     * @return Boolean true if library has the book and false if the library doesn't have it
     */
    public boolean containsTitle(String title){
      return collection.contains(title);
    }

    /**
     * checks if the book is available
     * @param title
     * @return Boolean if the book is available or not
     */
    public boolean isAvailable(String title){
      return collection.get(title);
    }

    /**
     * prints the books in the library and whether or not the books is checked out
     */
    public void printCollection(){
      Enumeration<String> e = collection.keys();

      while (e.hasMoreElements()) {
        String key = e.nextElement();
        if(collection.get(key) == false){
          System.out.println(key + " is not checked out.");
        } else{
          System.out.println(key + " is checked out.");
        }
      }
    }

    /**
     * Main method for testing
     * @param args
     */
    public static void main(String[] args) {
      Library library = new Library("library", "234 blah, MA", 10);
      String book = "blah blah";
      String book2 = "hello";
      library.addTitle(book);
      library.addTitle(book2);
      library.checkout(book2);
      library.printCollection();

    }
  }