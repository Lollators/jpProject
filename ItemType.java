/**
 * Enum that describes 4 different types of items. Each calls the constructor
 *  with value in parenthesis.
 */
public enum ItemType {
  AU("AUDIO"),
  VI("VISUAL"),
  AM("AUDIOMOBILE"),
  VM("VISUALMOBILE");

  /**
   * Constant description, used to retrieve significance of enum code.
   */
  public final String description;

  /**
   * Constructor that sets the description of enum.
   *
   * @param description - Description of enum
   */
  ItemType(String description) {
    this.description = description;
  }
}