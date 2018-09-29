/**
 * Abstract class Product that implements Item interface.
 *
 * The class implements the methods defined in the interface, as well as declaring its
 *  own constructor.
 * Product will implement the basic functionality that all items on a production line should have.
 *
 * @author  Luca Missaglia
 * @since   2018-09-29
 */

import java.util.Date;

public abstract class Product implements Item {

  /**
   * Serial number of a product.
   */
  private int serialNumber;

  /**
   * Manufacturer of a product.
   */
  private String manufacturer;

  /**
   * Date that a product was manufactured on.
   */
  private Date manufacturedOn;

  /**
   * Name of product.
   */
  private String name;

  /**
   * Stores the next number to be assigned to serialNumber.
   */
  private int currentProductionNumber;

  /**
   * Function that sets the production number of a product.
   *
   * @param prodNumber - production number of product
   */
  public void setProductionNumber(int prodNumber) {
    currentProductionNumber = prodNumber;
  }

  /**
   * Function that sets the name of a product.
   *
   * @param name - name of item
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Function that returns the name of a product.
   *
   * @return String - name of product
   */
  public String getName() {
    return name;
  }

  /**
   * Function that returns the manufacturing date of a product.
   *
   * @return Date - manufacturing date of product
   */
  public Date getManufactureDate() {
    return manufacturedOn;
  }

  /**
   * Function that returns the serial number of a product.
   *
   * @return int - SN of product
   */
  public int getSerialNumber() {
    return serialNumber;
  }

  /**
   * Class constructor that sets product name equal to the parameter passed to it.
   * Then sets serial number of product equal to the current production number.
   * The production number is then incremented by one, ready to be used for the next product.
   * The manufacturing date is set to the current date by assignment of new Date object.
   *
   * @param name - name of product
   */
  public Product(String name) {
    this.name = name;
    serialNumber = currentProductionNumber;
    currentProductionNumber++;
    manufacturedOn = new Date();
  }

  /**
   * Overriding of method toString() in order to provide a more detailed description of Product.
   * This function will return the manufacturer, serial number, date that it was manufactured
   *  on, and name of product.
   * A string variable is defined and used as a concatenation storage for the other class
   *  variables.
   *
   * @return productToString - Concatenated string of class variables
   */
  public String toString() {
    String productToString = "";

    //Concatenation of other class variables
    productToString += "Manufacturer  : " + manufacturer + '\n';
    productToString += "Serial Number : " + serialNumber + '\n';
    productToString += "Date          : " + manufacturedOn + '\n';
    productToString += "Name          : " + name + '\n';

    return productToString;
  }

}
