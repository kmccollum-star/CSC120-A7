/* This is a stub for the House class */
import java.util.ArrayList;

public class House extends Building{
  /**
   * Class attributes
   */
  private ArrayList<Student> residents;
  private boolean hasDiningRoom;

  /**
   * Constructor
   * @param name
   * @param address
   * @param nFloors
   * @param hasDiningRoom
   */
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    
    this.residents = new ArrayList<Student>();
    this.hasDiningRoom = hasDiningRoom;

    System.out.println("You have built a house: 🏠");
  }

  /**
   * Tells whether or not a house has a dining room
   * @return Boolean true if yes and false if no
   */
  public boolean hasDiningRoom(){
    return hasDiningRoom;
  }
  
  /**
   * Tells how many residents are in a house
   * @return Int number of students in house
   */
  public int nResidents(){
    return residents.size();
  }

  /**
   * adds student to house
   * @param s
   */
  public void moveIn(Student s){
    residents.add(s);
  }

/**
 * removes student from house
 * @param s
 * @return Student that moved out
 */
  public Student moveOut(Student s){
    residents.remove(s);
    return s;
  }

  /**
   * Checks if a student is a part of a specific house
   * @param s
   * @return Boolean true if student is in house and false if not
   */
  public boolean isResident(Student s){
    return residents.contains(s);
  }
  
/**
 * Main method for testing
 * @param args
 */
  public static void main(String[] args) {
    House house = new House("House", "1212 Noho, MA", 6, true);
    Student s = new Student("A", "123", 2029);
    house.moveIn(s);
    System.out.println(house.nResidents());
    house.moveOut(s);
    System.out.println(house.nResidents());
  }

}