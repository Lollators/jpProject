

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    // Write one line of code to create an ArrayList of products
    ArrayList<Product> myArrayList = new ArrayList<>();

    // Write one line of code to call testCollection and assign the result to the ArrayList
    myArrayList = testCollection();
    // Write one line of code to sort the ArrayList
    Collections.sort(myArrayList, new Comparator<Product>() {
      @Override
      public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
      }
    });
    // Call the print method on the ArrayList
    printList(myArrayList);
  }

  // Step 15
  // Complete the header for the testCollection method here

  public static ArrayList testCollection() {

    AudioPlayer a1 = new AudioPlayer("iPod Mini","MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman","WAV ");
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
        new Screen("720x480", 40, 22), MonitorType.LCD);
    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",
        new Screen("1366x768", 40, 22), MonitorType.LED);

    // Write one line of code here to create the collection
    ArrayList<Product> products = new ArrayList<>();

    products.add(a1);
    products.add(a2);
    products.add(m1);
    products.add(m2);
    return products;
  }

  // Step 16
  // Create print method here
  public static void printList(ArrayList<Product> myList){
    for (Product p: myList) {
      System.out.print(p);
    }
  }

}