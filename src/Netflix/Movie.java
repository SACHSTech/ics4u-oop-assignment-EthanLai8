/**
* ICS4U OOP Assignment
* @author: E. Lai
*/

package Netflix;

public class Movie extends Item {
  private int intDuration;
  private int intHours;
  private int intMinutes;

  /**
  * Movie constructor. Creates an instance of the item, movie. An inheritance of the object, Item.
  *
  * @param strName - a string that displays the name of the movie
  * @param strGenre - a string that displays the genre of the movie
  * @param strDirector - a string that displays the director of the movie
  * @param intYear - an integer that displays what year the movie was released
  * @param dblRating - a double that displays what the rating of the movie
  * @param intDuration - an integer that displays the duration of the movie in minutes
  */	
  public Movie(String strName, String strGenre, String strDirector, int intYear, double dblRating, int intDuration) {

    // Super method to take parameters from the parent class, Item
    super(strName, strGenre, strDirector, intYear, dblRating);
    this.intDuration = intDuration;
  }

  /**
  * Getter method that returns the movie's duration in minutes
  *
  * @return intDuration - the duration of the movie in minutes
  */
  public int getDuration() {
    return intDuration;
  }

  /**
  * Setter method that allows the user to modify the duration of the movie in minutes
  *
  * @param intDuration - an integer
  */
  public void setDuration(int intDuration) {
    this.intDuration = intDuration;
  }

  /**
  * Helper method that changes the variable, intDuration, into hours and minutes
  *
  * @param intDuration - an integer
  * @return String - the duration in hours and minutes
  */
  private String TimeConvert(int intDuration) {
    intHours = intDuration / 60;
    intMinutes = intDuration % 60;
    return intHours + "h " + intMinutes + "min";
  }

  /**
  * toString method which prints out how this object would look like as a string.
  *
  * @return a String
  */
  public String toString() {
    return String.format("|%10s |", "Movie") + String.format("%25s |", getName()) + String.format("%10s |", getGenre()) + String.format("%20s |", getDirector()) + String.format("%10s |", getYear()) + String.format("%10s |", getRating()) + String.format("%10s |", TimeConvert(intDuration)) + String.format("%10s |", "N/A") + String.format("%10s |", "N/A") + "\n";
  }
}