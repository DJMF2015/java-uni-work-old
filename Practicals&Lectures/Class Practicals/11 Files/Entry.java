/**
  Final version of supplementary class for phone book entries consisting of
  name and number fields.

  @author       Simon Jones (based on original code by Kenneth J. Turner)
  @version      16/11/2015
*/

public class Entry {                                   // directory entry as record

  /** Subscriber name */
  private String name;

  /** Subscribe phone number */
  private String number;

  /** Constructor for phone book entry.

  @param person         name of person
  @param phone          number of person
  */
  public Entry(String person, String phone) {
    name = person;                              // initialise name
    number = phone;                             // initialise number
  }

  /**
    Get the name for a phone book entry.

    @return             name for entry
  */
  public String getName() {
    return(name);                               // return name
  }

  /**
    Get the number for a phone book entry.

    @return             number for entry
  */
  public String getNumber() {
    return(number);                             // return number
  }
}
