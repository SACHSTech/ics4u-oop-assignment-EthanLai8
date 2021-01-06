/**
* ICS4U OOP Assignment
* @author: E. Lai
*/

package Netflix;

import Netflix.*;
import java.io.*;
import java.util.*;

public class Item {

  // Instance variables
  private String strName;
  private String strGenre;
  private String strDirector;
  private int intYear;
  private double dblRating;

  /**
  * Item constructor. Creates an instance of the object, Item.
  *
  * @param strName - a string that displays the name of the item
  * @param strGenre - a string that displays the genre of the item
  * @param strDirector - a string that displays the director of the item
  * @param intYear - an integer that displays what year the item was released
  * @param dblRating - a double that displays what the rating of the item
  */	
  public Item(String strName, String strGenre, String strDirector, int intYear, double dblRating) {
    this.strName = strName;
    this.strGenre = strGenre;
    this.strDirector = strDirector;
    this.intYear = intYear;
    this.dblRating = dblRating;
  }

  /**
  * Getter method that returns the item's name
  *
  * @return strName - the name of the item
  */
  public String getName() {
    return strName;
  }

  /**
  * Getter method that returns the item's genre
  *
  * @return strGenre - the genre of the item
  */
  public String getGenre() {
    return strGenre;
  }

  /**
  * Getter method that returns the item's director
  *
  * @return strDirector - the director of the item
  */
  public String getDirector() {
    return strDirector;
  }

  /**
  * Getter method that returns the item's year
  *
  * @return intYear - the year of the item
  */
  public int getYear() {
    return intYear;
  }

  /**
  * Getter method that returns the item's rating
  *
  * @return dblRating - the rating of the item
  */
  public double getRating() {
    return dblRating;
  }

  /**
  * Setter method that allows the user to modify the name of the item
  *
  * @param strName - a string
  */
  public void setName(String strName) {
    this.strName = strName;
  }

  /**
  * Setter method that allows the user to modify the genre of the item
  *
  * @param strGenre - a string
  */
  public void setGenre(String strGenre) {
    this.strGenre = strGenre;
  }

  /**
  * Setter method that allows the user to modify the director of the item
  *
  * @param strDirector - a string
  */
  public void setDirector(String strDirector) {
    this.strDirector = strDirector;
  }

  /**
  * Setter method that allows the user to modify the year of the item
  *
  * @param intYear - an integer
  */
  public void setYear(int intYear) {
    this.intYear = intYear;
  }

  /**
  * Setter method that allows the user to modify the rating of the item
  *
  * @param dblRating - a double
  */
  public void setRating(double dblRating) {
    this.dblRating = dblRating;
  }
}