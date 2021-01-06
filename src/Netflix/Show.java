/**
* ICS4U OOP Assignment
* @author: E. Lai
*/

package Netflix;

public class Show extends Item {

  // Instance variables
  private int intEpisodes;
  private String strStatus;

  /**
  * Show constructor. Creates an instance of the Item, Show. An inheritance of the object, Item.
  *
  * @param strName - a string that displays the name of the show
  * @param strGenre - a string that displays the genre of the show
  * @param strDirector - a string that displays the director of the show
  * @param intYear - an integer that displays what year the show was released
  * @param dblRating - a double that displays what the rating of the show
  * @param intEpisodes - an integer that displays how many episodes the show has
  * @param strStatus - a string that displays what the shows status is
  */	
  public Show(String strName, String strGenre, String strDirector, int intYear, double dblRating, int intEpisodes, String strStatus) {

    // Super method to take parameters from the parent class, Item
    super(strName, strGenre, strDirector, intYear, dblRating);
    this.intEpisodes = intEpisodes;
    this.strStatus = strStatus;
  }

  /**
  * Getter method that returns the show's number of episodes.
  *
  * @return intEpisodes - the amount of episodes in the show which is an integer
  */
  public int getEpisodes() {
    return intEpisodes;
  }

  /**
  * Getter method that returns the show's status.
  *
  * @return strStatus - the status of the show which is a string
  */
  public String getStatus() {
    return strStatus;
  }

  /**
  * Setter method that allows the user to modify the episodes of the show.
  *
  * @param intEpisodes - an integer
  */
  public void setEpisodes(int intEpisodes) {
    this.intEpisodes = intEpisodes;
  }

  /**
  * Setter method that allows the user to modify the status of the show.
  *
  * @param strStatus - a string
  */
  public void setStatus(String strStatus) {
    this.strStatus = strStatus;
  }

  /**
  * toString method which prints out how this object would look like as a string.
  *
  * @return a String
  */
  public String toString() {
    return String.format("|%10s |", "Show") + String.format("%25s |", getName()) + String.format("%10s |", getGenre()) + String.format("%20s |", getDirector()) + String.format("%10s |", getYear()) + String.format("%10s |", getRating()) + String.format("%10s |", "N/A") + String.format("%10s |", intEpisodes) + String.format("%10s |", strStatus) + "\n";
  }
}