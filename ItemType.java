/**
 * Enum that describes 4 different types of items. Each calls the constructor
 *  with value in parenthesis.
 */
public enum ItemType {
  AU("Audio"),
  VI("Visual"),
  AM("AudioMobile"),
  VM("VisualMobile");

  /**
   * Constant code, used to retrieve significance of enum code.
   */
  public final String code;

  /**
   * Constructor that sets the code of enum.
   *
   * @param code - Code of enum
   */
  ItemType(String code) {
    this.code = code;
  }
}
